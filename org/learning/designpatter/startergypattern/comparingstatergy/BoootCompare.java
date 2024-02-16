package org.learning.designpatter.startergypattern.comparingstatergy;

public class BoootCompare {

    public static void main(String[] args) {
        int option=0;
        Employee e1 = null,e2=null;
        switch (option){
            case 1:{
                UniversalComparator ac=new AgeComparison();
                int result = ac.comapre(e1,e2);
                break;
            }
            case 2:{
                break;
            }
        }
    }
}
