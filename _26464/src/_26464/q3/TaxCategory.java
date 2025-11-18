package _26464.q3;

import java.time.LocalDate;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;
    
    public TaxCategory(int id, LocalDate createdDate, LocalDate updatedDate,
                      String authorityName, String region, String email,
                      String categoryName, double rate, String code) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email);
        
        if (rate <= 0) throw new TaxDataException("Tax rate must be greater than 0");
        if (code == null || code.length() < 3) throw new TaxDataException("Code must be at least 3 characters");
        
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }
    
    public String getCategoryName() { return categoryName; }
    public double getRate() { return rate; }
    public String getCode() { return code; }
    
    public String getTaxCategoryInfo() {
        return getTaxAuthorityInfo() + ", Category: " + categoryName + ", Rate: " + (rate * 100) + "%, Code: " + code;
    }
}