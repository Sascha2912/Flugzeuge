public class SQLController {

    public static void initDatabase(){
        PilotController.selectPiloten();
        FlugzeugtypController.selectFlugzeugtypen();
        FlughafenController.selectFlughaefen();
        FluglizenzController.selectFluglizenzen();
        FlughafenFlugzeugController.selectFlughafenFlugzeug();
    }

}
