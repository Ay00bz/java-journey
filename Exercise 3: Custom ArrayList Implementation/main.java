public class Main {
    public static void main(String[] args) {
        CustomArrayList bands = new CustomArrayList();

        bands.add("Led Zeppelin");
        bands.add("Lynyrd Skynyrd");
        bands.add("Queen");

        System.out.println("Size of bands: " + bands.size());

        System.out.println("Bands in the list:");
        for (int i = 0; i < bands.size(); i++) {
            System.out.println(bands.get(i));
        }

        bands.add("Pink Floyd");

        System.out.println("\nUpdated bands:");
        for (int i = 0; i < bands.size(); i++) {
            System.out.println(bands.get(i));
        }

        bands.add(2,"Polyphia");

        System.out.println("\nUpdated bands 2:");
        for (int i = 0; i < bands.size(); i++) {
            System.out.println(bands.get(i));
        }

        bands.remove("Queen");

        System.out.println("\nUpdated bands after removing Queen :");
        for (int i = 0; i < bands.size(); i++) {
            System.out.println(bands.get(i));
        }
    }
}
