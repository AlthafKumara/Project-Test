
package game;


public class Player {
    
    //Atribut
    String role,name;
    String maincharacter;
    int speed, healthPoin, damage, armor, ultimate, finalhealtharmor;
    
    
    //method
    void run(){
        System.out.println(name+ " Is Running .....");
        System.out.println("Speed = " +speed);
        System.out.println("Health Poin = " +healthPoin);
        System.out.println("Damage = " +damage);
        System.out.println("Armor = " +armor);
        System.out.println("--------------");
    }
    
    boolean isDead(int finalhealthpoin){
        if (finalhealthpoin <= 0) {
        return true; 
        }
        else{
            return false;  
        }   
    }
    
    void  Versus(){
        System.out.println("");
    }
    
    void attack (){
        System.out.println(name + " Is Attacking.....");
        System.out.println("Damage = " +damage);
        System.out.println("----------");
    }
    
    void defend (String role1,String role2,int role1damage,int armorrole1,int healthrole1){
        System.out.println(role1 + " get attack by " + role2 );
        System.out.println("Armor - " + role1damage);
        int armorattack = armorrole1 - role1damage;
        System.out.println("Armor remaining " + armorattack );
        System.out.println("Health remaining = " + healthrole1);
        System.out.println("---------");
    }
    
    void ultimate(String role,int roleultimate){
        System.out.println(role+" GET ULTIMATE POWER !!!!!");
        System.out.println(role+ " attack With " + roleultimate + " Damage");
        System.out.println("---------------------");
    }
    
    
    void ultidamage (String role1ultimate,String role2getultimate,int damageultirole1,int finalhealtharmor, int finalhealthpoin){
        System.out.println(role2getultimate+" get ultimate damage by " + role1ultimate);   
        System.out.println("DAMAGE TAKEN " + damageultirole1 );
        System.out.println("Health = "+ finalhealtharmor);
        System.out.println("Armor = "+ finalhealtharmor); 
        finalhealtharmor = finalhealthpoin;
        System.out.println("-----------------");
} 
    }
    