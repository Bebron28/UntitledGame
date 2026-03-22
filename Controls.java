import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    public Controls(Engine game) {
        setLayout(new FlowLayout());

        CooldownButton spawnBaseBtn = new CooldownButton("Spawn Base", new GameObject() /* under construction */, () -> 
                {
                    System.out.println("spawn Base");
                    // under construction
                },
                90
        );
        add(spawnBaseBtn);

        CooldownButton spawnArcherBtn = new CooldownButton("Spawn Archer", new UnitArcher(), () -> 
                {
                    System.out.println("spawn Archer");
                    // under construction
                },
                90
        );
        add(spawnArcherBtn);

        CooldownButton spawnTankBtn = new CooldownButton("Spawn Tank", new UnitDinoRider(), () -> 
                {
                    System.out.println("spawn Tank");
                    // under construction
                    game.spawnObject(new Arrow(10, 100, -40, 400));
                },
                90
        );
        add(spawnTankBtn);
    }
}
