package lt.andrius.demo.repository.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productlines")

public class ProductLine {
    @Id
    @Column(name = "productline")
    private String productLine;
    @Column(name = "textdescription")
    private String textdescription;
    @Column(name = "htmldescription")
    private String htmldescription;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textdescription;
    }

    public void setTextDescription(String textDescription) {
        this.textdescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmldescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmldescription = htmlDescription;
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "productLine='" + productLine + '\'' +
                ", textDescription='" + textdescription + '\'' +
                ", htmlDescription='" + htmldescription + '\'' +
                '}';
    }
}

