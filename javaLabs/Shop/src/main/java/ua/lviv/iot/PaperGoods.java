package ua.lviv.iot;

public class PaperGoods extends Goods {
    private String titulPage;
    private PagesNumber pagesNumber;
    private PapersType paperType;

    public PaperGoods(String name, double price, int amount,
                      String titulPage, PagesNumber pagesNumber, PapersType paperType, ColorType color, CustumerType grade) {
        super(name, price, amount,color,grade);
        setTitulPage(titulPage);
        setPaperType(paperType);
        setNumber(pagesNumber);
    }



    public String getTitulPage() {
        return titulPage;
    }

    public void setTitulPage(String titulPage) {
        this.titulPage = titulPage;
    }

    public PapersType getPaperType() {
        return paperType;
    }

    public void setPaperType(PapersType paperType) {
        this.paperType = paperType;
    }

    public PagesNumber getPagesNumber() {
        return pagesNumber;
    }

    public void setNumber(PagesNumber pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " titulPage = " + titulPage + ", pagesNumber = " + pagesNumber + ", paperType = " + paperType + "\n";
    }
    public String getHeaders() {
        return "name, price, amount, grade, color, titulPage pagesNumber, paperType ";
    }

    public String toCSV() {
        return getName() + ", " + getPrice() + ", " + getAmount() + ", " + getGrade() + ", " + getColorType() + ","+
                getTitulPage() + "," + getPagesNumber() + ", " + getPaperType() + ". ";
    }



}
