package vitals;

public class Main {

    public static void main(String[] args) {
    	VitalsCheck check = new VitalsCheck();
    	
        assert(check.areVitalsOk(100, 100, 80)) == true; //Vitals Normal
        assert(check.areVitalsOk(160, 95, 70))== false; // High BP
        assert(check.areVitalsOk(60, 95, 70))== false; // Low BP
        assert(check.areVitalsOk(100, 80, 80))== false; // Low spo2
        assert(check.areVitalsOk(100, 95, 20))== false; //low respRate
        assert(check.areVitalsOk(100, 95, 115))== false; // high respRate
        assert(check.areVitalsOk(160, 80, 70))== false; // BP high, low spo2
        assert(check.areVitalsOk(100, 80, 20))== false; // low spo2, low repRate
        assert(check.areVitalsOk(100, 55, 110))== false; //spo2 low, respRate high
        assert(check.areVitalsOk(160, 100, 20))== false; //BP high, respRate low
        assert(check.areVitalsOk(60, 100, 100))== false; //BP low, respRate high
        assert(check.areVitalsOk(60, 80, 20))== false; // BP low, spo2 low, respRate low
        assert(check.areVitalsOk(160, 80, 100))== false; //BP high, spo2 low, respRate high
        System.out.println("Tests completed");
    }
   
}
