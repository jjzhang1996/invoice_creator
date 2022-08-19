import axios from "axios";


export default async function checkAuth(){
    try {
        const getAuthentication = await axios.get(`${process.env.REACT_APP_API_SERVER}/api/auth/authenticated`, {
            headers: {
                Authorization: "Bearer "+localStorage.getItem("Bearer")
            }
        })
        if(getAuthentication.data){
            return true;
        }
    }catch (e){
        console.error(e);
        return false;
    }
}