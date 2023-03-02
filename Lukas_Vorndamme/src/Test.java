public class Test {
    public static void main(String[] args) {


        Schrank schrank = new Schrank(true,80.00,200.00,40.00);
        Hose hose = new Hose("k1",34,32);
        Hoody hoody =new Hoody("k2","XL");
        Box box = new Box();
        Box box1 = new Box();
        Stift stift = new Stift("s1","rot");
        Stift stift1 = new Stift("s2", "blau");
        Kopfhoehrer kopfhoehrer = new Kopfhoehrer("e1","JBL","SZUT Edition blue");

        box.hinzufuegenGegenstaende(stift);
        box.hinzufuegenGegenstaende(stift1);
        schrank.hinzufuegenBox(box);
        schrank.hinzufuegenBox(box1);
        schrank.hinzufuegenGegenstaende(hose);
        schrank.hinzufuegenGegenstaende(hoody);
        box1.hinzufuegenGegenstaende(kopfhoehrer);



    }

}
