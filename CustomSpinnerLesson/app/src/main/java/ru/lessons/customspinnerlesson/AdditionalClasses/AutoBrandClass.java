package ru.lessons.customspinnerlesson.AdditionalClasses;


public class AutoBrandClass
{
    private String brandName;
    private String officialSite;
    private int brandLogo;

    public AutoBrandClass(String brandName, String officialSite, int brandLogo)
    {
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.officialSite = officialSite;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public int getBrandLogo()
    {
        return brandLogo;
    }

    public String getOfficialSite()
    {
        return officialSite;
    }
}
