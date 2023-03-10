import React, {useEffect} from 'react';
import {useSelector} from "react-redux";
import {Navigate, Outlet} from "react-router-dom";

function AuthProtection() {
    const hasAuthToken = useSelector((state)=>state.auth.token != null);
    return hasAuthToken ? <Outlet/> : <Navigate to="/login" replace state={"First you have to Login."}/>;
}

export default AuthProtection;