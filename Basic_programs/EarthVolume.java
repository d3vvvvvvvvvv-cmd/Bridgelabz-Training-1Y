public class EarthVolume {
    public static void main(String[] args) {
        double earthRadiusKm = 6378;
         double kmToMiles = 0.621371;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(earthRadiusKm, 3);
         double earthRadiusMiles = earthRadiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(earthRadiusMiles, 3);
         System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
