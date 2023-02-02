import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElement(placesToVisit);
        System.out.println(placesToVisit);

        removeElement(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElement(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        list.push("Alice Springs");
    }

    private static void removeElement(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

    }
}