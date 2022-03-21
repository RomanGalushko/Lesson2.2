package ru.skypro;

public class ServiceStation {

    public void printTransport(TransportInformation transportInformations){
        if (transportInformations != null) {
            System.out.println("Обслуживаем " + transportInformations.getModelName());
            for (int i = 0; i < transportInformations.getWheelsCount(); i++) {
                transportInformations.updateTyre();
            }
            transportInformations.checkEngine();
            transportInformations.checkTrailer();
        }
    }
}
