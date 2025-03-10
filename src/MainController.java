public class MainController {
    BasicSyntaxProblemsSheet basicSyntaxProblemsSheet;
    ControlFlowProblemsSheet controlFlowProblemsSheet;

    public MainController() {
        basicSyntaxProblemsSheet = new BasicSyntaxProblemsSheet();
        controlFlowProblemsSheet = new ControlFlowProblemsSheet();
    }

    public void run(){

        // 1. Basic Syntax Sheet
//        basicSyntaxProblemsSheet.solutions();

        // 2. Control Flow Sheet
        controlFlowProblemsSheet.solutions();

    }
    public static void main(String[] args) {
        MainController app = new MainController();
        app.run();
    }


}