package org.example;


public class App 
{
    public static void main( String[] args )
    {

        Buzunar buzunar= new Buzunar();

        buzunar.push(new String("unu"));
        buzunar.push(new String("doi"));
        buzunar.push(new String("trei"));
        buzunar.push(new String("patru"));
        buzunar.listIterator();
        try {
            for (int i=0; buzunar.listIterator().hasNext();i++){
                System.out.println(buzunar.get(i));
            }


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Am ajuns la capatul Stivei");

        }

        System.out.println(buzunar.size());

        for (int i=buzunar.size();buzunar.listIterator().hasNext();i--){
            System.out.println(buzunar.pop());

        }


    }
}
