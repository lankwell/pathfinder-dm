package com.bluemoon.Pathfinder;

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

    private String name;
    private int level;
    private enum alignment { LawfulGood, NeutralGood, ChaoticGood, LawfulNeutral, Neutral, ChaoticNeutral, LawfulEvil, NeutralEvil, ChaoticEvil };
    private int armourClass;
    private int totalHitPoints;
    private int currentHitPoints;
    private enum size { Fine, Diminutive, Tiny, Small, Medium, Large, Huge, Gargantuan, Colossal }
    private enum gender { Male, Female }
    private ArrayList<Deity> deities;
    private Deity primaryDeity;
    private int abilityStrength;
    private int abilityDexterity;
    private int abilityConstitution;
    private int abilityIntelligence;
    private int abilityWisdom;
    private int abilityCharisma;
    private EnumSet<Language> languagesKnown = EnumSet.noneOf(Language.class);

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
