public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int i = 0; i < sectionA.length; i++) { totalA += sectionA[i]; totalB += sectionB[i]; }
        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        int highest = sectionA[0], index = 0;
        String section = "Section A";
        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) { highest = sectionA[i]; section = "Section A"; index = i; }
            if (sectionB[i] > highest) { highest = sectionB[i]; section = "Section B"; index = i; }
        }
        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + highest + " (" + section + ", Item " + (index + 1) + ")");
    }
    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30}, sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }
}