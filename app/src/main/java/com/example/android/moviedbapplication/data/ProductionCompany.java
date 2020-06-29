package com.example.android.moviedbapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ProductionCompany {

    @PrimaryKey
    private long companyId;

    @ColumnInfo(name = "company_name")
    private String name;

    @ColumnInfo(name = "logo_path")
    private String logoPath;

    public ProductionCompany(long companyId, String name, String logoPath) {
        this.companyId = companyId;
        this.name = name;
        this.logoPath = logoPath;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
}
