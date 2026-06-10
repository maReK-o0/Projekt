import greenfoot.*;

public class MyWorld extends World
{
    Player player;
    GreenfootImage light;
    public boolean spawnovatKameny = false;

    public MyWorld()
    {
        super(1700, 950, 1);
        player = new Player();
        addObject(player, 150, 200);
        light = new GreenfootImage(150, 150);
        light.setColor(new Color(197, 162, 99, 80));
        light.fillOval(0, 0, 150, 150);
        vygenerujBludiste();
        
        addObject(new Key(), 1118, 378);
        addObject(new Key(), 1576, 188);
        addObject(new Key(), 831, 170);
        addObject(new Door(), 819, 115);
        prepare();
    }
    private void vygenerujBludiste()
    {
        for (int x = 0; x <= 1700; x += 50) {
            addObject(new Stena(), x, 0);
            addObject(new Stena(), x, 950);
        }
        for (int y = 50; y < 900; y += 50) {
            addObject(new Stena(), 0, y);
            addObject(new Stena(), 1550, y);
        }
        for (int y = 200; y <= 650; y += 50) {
            addObject(new Stena(), 250, y);
        }
        for (int x = 400; x <= 800; x += 50) {
            addObject(new Stena(), x, 200);
        }
        for (int y = 350; y <= 750; y += 50) {
            addObject(new Stena(), 550, y);
        }
        for (int x = 600; x <= 850; x += 50) {
            addObject(new Stena(), x, 500);
        }
        for (int x = 250; x <= 1400; x += 50) {

            if (x != 550 && x != 600 && x != 1000 && x != 1050) {
                addObject(new Stena(), x, 750);
            }
        }
        for (int y = 200; y <= 600; y += 50) {
            if (y != 350 && y != 400) { 
                addObject(new Stena(), 1100, y);
            }
        }
        for (int x = 1150; x <= 1450; x += 50) {
            addObject(new Stena(), x, 350);
        }
        for (int y = 50; y <= 500; y += 50) {
            if (y != 200 && y != 250) {
                addObject(new Stena(), 1400, y);
            }
        }
    }

    public void act()
    {
        GreenfootImage bg = getBackground();
        bg.clear();
        bg.setColor(new Color(0, 0, 0, 220));
        bg.fill();
        bg.drawImage(light, player.getX() - 75, player.getY() - 75);

        bg.setColor(Color.WHITE);
        bg.drawString("---Klice: " + player.keys + "/3", 30, 40);
        bg.drawString("---Zivoty: " + player.hp + " HP", 30, 60);

        if (spawnovatKameny && Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Kamen(), Greenfoot.getRandomNumber(getWidth()), 10);
        }
    }   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}