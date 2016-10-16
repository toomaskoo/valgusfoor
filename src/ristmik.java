import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ristmik extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AWSUM");
        primaryStage.setX(1000);
        primaryStage.setY(1000);

        Foor ulemine = new Foor();
        ulemine.foor();
        ulemine.valgusfoorikast.setTranslateX(500);
        ulemine.valgusfoorikast.setTranslateY(250);
        ulemine.valgusfoorikast.setRotate(180);

        Foor parem = new Foor();
        parem.foor();
        parem.valgusfoorikast.setTranslateY(500);
        parem.valgusfoorikast.setTranslateX(750);
        parem.valgusfoorikast.setRotate(270);

        Foor alumine = new Foor();
        alumine.foor();
        alumine.valgusfoorikast.setTranslateX(500);
        alumine.valgusfoorikast.setTranslateY(750);
        alumine.valgusfoorikast.setRotate(0);

        Foor vasak = new Foor();
        vasak.foor();
        vasak.valgusfoorikast.setTranslateX(250);
        vasak.valgusfoorikast.setTranslateY(500);
        vasak.valgusfoorikast.setRotate(90);

        Pane mainpane = new Pane();
        mainpane.getChildren().addAll(parem.valgusfoorikast, ulemine.valgusfoorikast, alumine.valgusfoorikast, vasak.valgusfoorikast);

        Scene valgusfoor = new Scene(mainpane, 1000, 1000);
        primaryStage.setScene(valgusfoor);
        ulemine.foor();

        primaryStage.show();
    }
}



