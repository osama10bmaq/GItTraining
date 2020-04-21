public class Main {
    private static String currentBranch;
    public static void main(String[] args) {
        System.out.println("Local.Master");
        Feature feature2 = new Feature("feature2", 2);

        System.out.println(feature2);
    }

    public static String getCurrentBranch(){
        return currentBranch;
    }
}

