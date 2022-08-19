import {Modal} from "@mantine/core";
import {Dispatch} from "react";

type ErrorHandlerProps = {
    statusCode: number,
    statusText: string,
    show: boolean,
    setShow: Dispatch<boolean>
}

export default function Errorhandler({statusText, statusCode, show, setShow} : ErrorHandlerProps){


    if(show){
        return (
            <Modal opened={show} onClose={() => {
                setShow(false);
            }} >

            </Modal>
        )
    }
    return null;
}