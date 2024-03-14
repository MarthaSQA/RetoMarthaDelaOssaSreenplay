package com.bikesonline.www.utils;

public class Utils {

    public String converTipoDoc(String tipodocumento) {
        switch (tipodocumento) {
            case "Cédula de ciudadanía":
                tipodocumento = "Cedula de Ciudadania";
                break;
            case "Cedula de Ciudadania":
                tipodocumento = "Cedula de Ciudadania";
                break;
            case "CC":
                tipodocumento = "Cedula de Ciudadania";
                break;
            case "NIT":
                tipodocumento = "NIT";
                break;
            case "Pasaporte":
                tipodocumento = "Pasaporte";
                break;
        }
        return tipodocumento;
    }
}
