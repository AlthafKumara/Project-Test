package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        //Buat Objek
        Scanner myObj = new Scanner (System.in);
        Player system = new Player ();
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.role = "HERO";
        hero.name = "Adi";
        hero.speed = 60;
        hero.healthPoin = 100;
        hero.armor = 50;
        hero.damage = 20;
        hero.ultimate = 5000;
        hero.finalhealtharmor =  (hero.healthPoin+hero.armor) - hero.ultimate;
        
        enemy.role = "ENEMY";
        enemy.name ="Tedi";
        enemy.speed = 50;
        enemy.healthPoin = 100;
        enemy.armor = 50;
        enemy.damage = 30;
        enemy.ultimate = 5000;
        enemy.finalhealtharmor = (enemy.healthPoin+enemy.armor)-enemy.ultimate ;
        
        hero.run();
        enemy.run();
        hero.attack();
        enemy.defend(enemy.name, hero.name, hero.damage, enemy.armor, enemy.healthPoin);
        enemy.attack();
        hero.defend(hero.name, enemy.name, enemy.damage, hero.armor, hero.healthPoin);
        
        System.out.println("Who you want to get ultimate power: (1)HERO (2)ENEMY");
        int getultimatepower = myObj.nextInt();
        System.out.println("--------------");
        
        if (getultimatepower == 1) {
            hero.ultimate(hero.role, hero.ultimate);
            enemy.ultidamage(hero.role, enemy.role, hero.ultimate, 0,enemy.finalhealtharmor);
            if (enemy.isDead(enemy.finalhealtharmor)) {
                System.out.println(hero.role +" WIN || " + enemy.role+ " LOSE");
            }
        }
        
        if (getultimatepower == 2) {
            enemy.ultimate(enemy.role,enemy.ultimate);
            hero.ultidamage(enemy.role,hero.role,enemy.ultimate,0,enemy.finalhealtharmor);
            if (hero.isDead(hero.finalhealtharmor)) {
                System.out.println(enemy.role+" WIN || " + hero.role+ " LOSE");
            }
            
        }
        
    }
    
}