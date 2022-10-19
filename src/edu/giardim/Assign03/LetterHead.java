package edu.giardim.Assign03;

public class Letterhead {
    private String name;
    private String [] sloganLines = new String[4];
    private char boundaryChar;

    public Letterhead (String name, String [] sloganLines, char boundaryChar){
        this.name = name;
        this.boundaryChar = boundaryChar;

        for (int i = 0; i < sloganLines.length; ++i){
            if (sloganLines[i] == null){
                this.sloganLines[i] = "";
            }
            else{
                this.sloganLines[i] = sloganLines[i];
            } 
        }
    }

    public String getName(){
        return name;
    }

    public String getSlogan(){
        StringBuilder sb = new StringBuilder();
        for (String s : sloganLines){
            if (s != null){
                sb.append(s);
                sb.append("\n");
            }else{
                sb.append("");
            } 
        }
        String slogan = sb.toString();
        return slogan;
    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setSlogan(String [] sloganLines){
        for (int i = 0; i < sloganLines.length; ++i){
            if (sloganLines[i] == null){
                this.sloganLines[i] = "";
            }
            else{
                this.sloganLines[i] = sloganLines[i];
            } 
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        int padding = 0;
        for (int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }
        sb.append("\n" + boundaryChar + " " + name);
        padding = 38 - name.length();
        for (int i = 0; i < padding - 1; ++i){
            sb.append(" ");
        }
        sb.append(boundaryChar + "\n" + boundaryChar);
        for (int i = 0; i < 38; ++i){
            sb.append(" ");
        }
        sb.append(boundaryChar + "\n");
        for (int i = 0; i < 4; ++i){
            sb.append(boundaryChar);
            if (sloganLines[i] == null){
                sb.append("");
                padding = 38;
            }else{
                sb.append(" " + sloganLines[i]);
                padding = 37 - sloganLines[i].length();
            }
            for (int j = 0; j < padding; ++j){
                sb.append(" ");
            }
            sb.append(boundaryChar);
            sb.append("\n");
        }
        for (int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }
        sb.append("\n");
        String letter = sb.toString();
        return letter;
    }    
}