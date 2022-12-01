package edu.giardim.Assign06;

import java.util.Scanner;

public interface Loadable {
    //Abstract method to load the map
    public abstract void load (Scanner input) throws GameFileException;
}
