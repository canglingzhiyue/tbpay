package com.taobao.android.editionswitcher;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class PositionInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actualLanguageCode;
    public String area;
    public String cityId;
    public String cityName;
    public String countryCode;
    public String countryName;
    public String countryNumCode;
    public String currencyCode;
    public String editionCode;
    public PositionInfoExt ext;
    public String hngCookie;
    public String isVillageUser;
    public String languageCode;
    public OvsPopExt ovsPopExt;

    static {
        kge.a(-323030182);
        kge.a(1028243835);
    }

    public PositionInfo() {
        this.editionCode = "CN";
    }

    public PositionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.editionCode = "CN";
        this.countryName = str;
        this.countryCode = str2;
        this.countryNumCode = str3;
        this.languageCode = str4;
        this.actualLanguageCode = str5;
        this.currencyCode = str6;
        this.hngCookie = str7;
        this.editionCode = str8;
        this.ext = new PositionInfoExt();
    }

    public PositionInfo newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("1b2c2073", new Object[]{this});
        }
        PositionInfo positionInfo = new PositionInfo();
        positionInfo.countryName = this.countryName;
        positionInfo.countryCode = this.countryCode;
        positionInfo.countryNumCode = this.countryNumCode;
        positionInfo.languageCode = this.languageCode;
        positionInfo.actualLanguageCode = this.actualLanguageCode;
        positionInfo.currencyCode = this.currencyCode;
        positionInfo.hngCookie = this.hngCookie;
        positionInfo.editionCode = this.editionCode;
        positionInfo.ext = this.ext;
        return positionInfo;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionInfo)) {
            return false;
        }
        PositionInfo positionInfo = (PositionInfo) obj;
        return StringUtils.equals(this.countryCode, positionInfo.countryCode) && StringUtils.equals(this.countryName, positionInfo.countryName) && StringUtils.equals(this.countryNumCode, positionInfo.countryNumCode) && StringUtils.equals(this.languageCode, positionInfo.languageCode) && StringUtils.equals(this.actualLanguageCode, positionInfo.actualLanguageCode) && StringUtils.equals(this.currencyCode, positionInfo.currencyCode) && StringUtils.equals(this.hngCookie, positionInfo.hngCookie) && StringUtils.equals(this.cityId, positionInfo.cityId) && StringUtils.equals(this.cityName, positionInfo.cityName);
    }
}
