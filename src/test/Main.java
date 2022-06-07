package test;

public class Main {
    public static void main(String[] args){
        VersionControl versions = new VersionControl();
        versions.addNewVersion(1, false);
        versions.addNewVersion(2, true);
        versions.addNewVersion(3, true);
        versions.addNewVersion(4, false);
        versions.addNewVersion(5, true);
        versions.addNewVersion(6, true);
      //  System.out.println(versions.map);
        System.out.println(versions.isCompatible(1, 3));
        System.out.println(versions.isCompatible(3, 5));
        System.out.println(versions.isCompatible(4, 2)); // downgrade
        System.out.println(versions.isCompatible(3, 3)); // upgrade to itself, always compatible
    }
}
