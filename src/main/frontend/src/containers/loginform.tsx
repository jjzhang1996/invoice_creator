import {TextInput, PasswordInput, Button, Center, Group, Box} from "@mantine/core";
import {useForm} from "@mantine/form"
import axios from 'axios'


export default function Loginform(){
    const form = useForm({
        initialValues:{
            username: "",
            password: ""
        }
    })

    const handleSubmit = async (values : {
        username: string,
        password: string
    }) => {
        try {
            const auth = await axios.post<{
                id:number,
                accessToken: string,
                tokenType: string
            }>(`${process.env.REACT_APP_API_SERVER}/api/user/login`, values, {withCredentials: true});
            if(auth.status >= 200 && auth.status < 300){
                localStorage.setItem(auth.data.tokenType, auth.data.accessToken);
            }
        }catch (e){

            console.error(e);
        }
    }

    return (
        <Center style={{width: "100%", height: "100vh"}}>
            <Box style={{flex: "1 1 0", maxWidth: "400px"}}>
                <form onSubmit={form.onSubmit(handleSubmit)} >
                    <TextInput
                        required
                        label={"Username"}
                        placeholder={"Please enter your username"}
                        {...form.getInputProps("username")}
                       mb={6}
                    />
                    <PasswordInput
                        required
                        label={"Password"}
                        placeholder={"Please enter your password."}
                        {...form.getInputProps("password")}
                    />
                    <Group position="left" mt="md">
                        <Button type="submit">Login</Button>
                    </Group>
                </form>
            </Box>
        </Center>
    )
}