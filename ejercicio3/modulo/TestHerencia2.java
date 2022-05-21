
package modulo;

public class TestHerencia2 extends ProfesorInterino{
    public void test2()
    {
        ProfesorInterino pro = new ProfesorInterino("23:12:03","fri nov 22","martin canvas", 2312332);
        System.out.println(pro.toString() + " CET 2019 (test2)");
    }
}
