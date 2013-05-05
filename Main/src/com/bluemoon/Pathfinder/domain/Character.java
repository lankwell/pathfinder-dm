package com.bluemoon.pathfinder.domain;

import java.util.ArrayList;
import java.util.EnumSet;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 1/05/13
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Character {

    public enum Language { Abyssal, Aklo, Aquan, Auran, Celestial, Common, Draconic, Druidic, Dwarven, Elven, Giant, Gnome, Goblin, Gnoll, Halfling, Ignan, Infernal, Orc, Sylvan, Terran, Undercommon };
    private enum Alignment { LawfulGood, NeutralGood, ChaoticGood, LawfulNeutral, Neutral, ChaoticNeutral, LawfulEvil, NeutralEvil, ChaoticEvil };
    private enum Size { Fine, Diminutive, Tiny, Small, Medium, Large, Huge, Gargantuan, Colossal }
    private enum Gender { Male, Female }
    private enum RegenerationBlocker { Fire, Acid, Sonic }

    private String name;
    private int level;
    private ArmorClass armorClass;
    private int totalHitPoints;
    private int currentHitPoints;
    private Alignment alignment;
    private Size size;
    private Gender gender;
    private ArrayList<Deity> deities;
    private Deity primaryDeity;
    private int abilityStrength;
    private int abilityDexterity;
    private int abilityConstitution;
    private int abilityIntelligence;
    private int abilityWisdom;
    private int abilityCharisma;
    private EnumSet<Language> languagesKnown = EnumSet.noneOf(Language.class);
    private ArrayList<PathfinderClass> classes;
    private int initiativeModifier;
    private ArrayList<SpecialAbility> specialAbilities;
    private Aura aura;
    private int regeneration;
    private RegenerationBlocker regenerationBlocker;
    private int fastHealing;

    public Character() {

    }


    public EnumSet<Language> getLanguagesKnown() {
        return languagesKnown;
    }

    public void setLanguagesKnown(EnumSet<Language> languagesKnown) {
        this.languagesKnown = languagesKnown;
    }

    public void addLanguageKnown(Language language) {
        this.languagesKnown.add(language);
    }
}
