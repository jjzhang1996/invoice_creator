import {useForm} from "@mantine/form";
import {Box, Button, Center, Group, PasswordInput, TextInput} from "@mantine/core";

export default function SignUp(){
    const form = useForm({
        initialValues: {
            username: "",
            password: "",
            password2: ""
        },
        validate: {
            password2: (value, values) => !value.match(values.password) ? "Password do not match!" : null
        }
    })
    const handleSubmit = async (values : {
        username: string,
        password: string,
    }) => {

    }
    return (
        <Center style={{width: "100%", height: "100vh"}}>
            <Box style={{flex: "1 1 0", maxWidth: "400px"}}>
                <form onSubmit={form.onSubmit(handleSubmit)}>
                    <TextInput
                        required
                        label={"Username"}
                        placeholder={"Please enter your username"}
                        {...form.getInputProps("username")}
                    />
                    <PasswordInput
                        mb={6}
                        required
                        label={"Password"}
                        placeholder={"Please enter your password."}
                        {...form.getInputProps("password")}
                    />
                    <PasswordInput
                        mb={6}
                        required
                        label={"Confirm Password"}
                        placeholder={"Please enter your password again."}
                        {...form.getInputProps("password2")}
                    />
                    <Group position="left" mt="md">
                        <Button type="submit">Login</Button>
                    </Group>
                </form>
            </Box>
        </Center>
    )
}