package ru.lessons.customspinnerlesson.AdditionalClasses;

/**
 * Created by Владимир on 18.07.2017.
 */

public class AutoBrandClass
{
    private String brandName;
    private String officialSite;
    private int brandLogo;

    public AutoBrandClass(String brandName, String officialSite, int brandLogo)
    {
        this.brandName = brandName;
        this.officialSite = officialSite;
        this.brandLogo = brandLogo;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public String getOfficialSite()
    {
        return officialSite;
    }

    public int getBrandLogo()
    {
        return brandLogo;
    }
}
