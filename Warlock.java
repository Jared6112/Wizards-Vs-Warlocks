public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }


        //Attacking Skills
    public void Poison (Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Poison (Damage - 30)");
        int damagePoints = 30;
        int manaCost = 70;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };

    public void AttackPunck (Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Attack AttackPunch (Damage - 40)");
        int damagePoints = 40;
        int manaCost = 60
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };



    //Health and Mana Regeneration
    public void healthRejuvenation (){
        System.out.println(super.characterName + " generated 10% Health Points and Mana");
        addHealth_Mana();
    }   
}