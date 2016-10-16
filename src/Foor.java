import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Timer;
import java.util.TimerTask;


public class Foor {
    Pane valgusfoorikast = new Pane();
    Timer timer = new Timer();


    

    public void foor() {
        Circle punane = new Circle(20);
        Circle kollane = new Circle(20);
        Circle roheline = new Circle(20);
        Rectangle kast = new Rectangle(50, 150);
        kast.setFill(Color.GRAY);
        punane.setCenterY(25);
        punane.setCenterX(25);
        punane.setFill(Color.RED);
        kollane.setFill(Color.LIGHTGRAY);
        kollane.setCenterY(75);
        kollane.setCenterX(25);
        roheline.setFill(Color.LIGHTGRAY);
        roheline.setCenterY(125);
        roheline.setCenterX(25);
        valgusfoorikast.getChildren().addAll(kast, punane, kollane, roheline);
        //valgusfoor läheb roheliseks
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    punane.setFill(Color.LIGHTGRAY);
                    kollane.setFill(Color.YELLOW);
                }
            }, 1000);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    kollane.setFill(Color.LIGHTGRAY);
                    roheline.setFill(Color.GREEN);
                }
            }, 1500);
            //valgusfoor hakkab minema punaseks
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    roheline.setFill(Color.LIGHTGRAY);
                }
            }, 3500);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    roheline.setFill(Color.GREEN);
                }
            }, 3700);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    roheline.setFill(Color.LIGHTGRAY);
                }
            }, 3900);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    roheline.setFill(Color.GREEN);
                }
            }, 4100);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    roheline.setFill(Color.LIGHTGRAY);
                    kollane.setFill(Color.YELLOW);
                }
            }, 4300);
        timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    kollane.setFill(Color.LIGHTGRAY);
                    punane.setFill(Color.RED);

                }
            }, 5000);
        }






    public void vahetavarvi(){

    }
}
