package com.engeto.dealerrecords;

import java.time.LocalDate;

/**
 * The DealerRecords program stores the information about dealers and
 * counts the average weight of sold carrots per contract.
 *
 * @author Miloslav Matulka
 * @version 1.0
 */
public class DealerRecords {
    /**
     * The entry method of the project.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        String companyComputerIpAddress = "192.148.14.56";
        double companyVehicleConsumptionPerHundredKm = 6.2;
        LocalDate dealersBirth = LocalDate.of(2000, 1, 1);

        String dealersFirstName = "First name";
        String dealersLastName = "Last name";
        String dealersName = dealersFirstName + " " + dealersLastName;

        String dealersResidence = "New York";
        int numberOfNegotiatedContracts = 7;
        double totalWeightOfSoldCarrotsInTons = 5.5;
        String vehicleRegistrationNumber = "1AD 5843";

        double averageWeightPerContract =
                totalWeightOfSoldCarrotsInTons / numberOfNegotiatedContracts;
        System.out.println("Average weight of sold carrots per contract: "
                + averageWeightPerContract + " t");
    }
}
