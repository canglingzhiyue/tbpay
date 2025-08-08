package com.taobao.android.tbtheme.kit;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class ThemeData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionBarBackgroundColor;
    public String actionBarBackgroundImage;
    public String actionbarTextColor;
    public boolean ignoreImageColor;
    public String isComplexTexture;
    public String naviStyle;
    public String skinColor;
    public String skinPic;
    public String statusBarStyle;
    public String themeLevel = "3";

    static {
        kge.a(-1922515693);
        kge.a(1028243835);
    }

    public String getActionbarTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a8737ca", new Object[]{this}) : this.actionbarTextColor;
    }

    public String getThemePic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3609aee2", new Object[]{this}) : this.skinPic;
    }

    public String getThemeColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("709e81e9", new Object[]{this}) : this.skinColor;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ThemeData themeData = (ThemeData) obj;
            if (StringUtils.equals(this.actionbarTextColor, themeData.actionbarTextColor) && StringUtils.equals(this.actionBarBackgroundColor, themeData.actionBarBackgroundColor) && StringUtils.equals(this.actionBarBackgroundImage, themeData.actionBarBackgroundImage) && StringUtils.equals(this.skinPic, themeData.skinPic) && StringUtils.equals(this.skinColor, themeData.skinColor) && StringUtils.equals(this.statusBarStyle, themeData.statusBarStyle) && StringUtils.equals(this.naviStyle, themeData.naviStyle) && StringUtils.equals(this.isComplexTexture, themeData.isComplexTexture) && this.ignoreImageColor == themeData.ignoreImageColor && StringUtils.equals(this.themeLevel, themeData.themeLevel)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: clone */
    public ThemeData m1027clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("3f34876e", new Object[]{this});
        }
        ThemeData themeData = new ThemeData();
        themeData.skinColor = this.skinColor;
        themeData.skinPic = this.skinPic;
        themeData.actionBarBackgroundColor = this.actionBarBackgroundColor;
        themeData.actionBarBackgroundImage = this.actionBarBackgroundImage;
        themeData.actionbarTextColor = this.actionbarTextColor;
        themeData.naviStyle = this.naviStyle;
        themeData.statusBarStyle = this.statusBarStyle;
        themeData.isComplexTexture = this.isComplexTexture;
        themeData.ignoreImageColor = this.ignoreImageColor;
        themeData.themeLevel = this.themeLevel;
        return themeData;
    }

    public void mergeData(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38f4045", new Object[]{this, themeData});
        } else if (themeData == null || !isUseCustomTheme(themeData)) {
        } else {
            String str = themeData.actionbarTextColor;
            if (str == null) {
                str = this.actionbarTextColor;
            }
            this.actionbarTextColor = str;
            String str2 = themeData.actionBarBackgroundImage;
            if (str2 == null) {
                str2 = this.actionBarBackgroundImage;
            }
            this.actionBarBackgroundImage = str2;
            String str3 = themeData.actionBarBackgroundColor;
            if (str3 == null) {
                str3 = this.actionBarBackgroundColor;
            }
            this.actionBarBackgroundColor = str3;
            String str4 = themeData.skinColor;
            if (str4 == null) {
                str4 = this.skinColor;
            }
            this.skinColor = str4;
            String str5 = themeData.skinPic;
            if (str5 == null) {
                str5 = this.skinPic;
            }
            this.skinPic = str5;
            String str6 = themeData.statusBarStyle;
            if (str6 == null) {
                str6 = this.statusBarStyle;
            }
            this.statusBarStyle = str6;
            String str7 = themeData.naviStyle;
            if (str7 == null) {
                str7 = this.naviStyle;
            }
            this.naviStyle = str7;
            String str8 = themeData.isComplexTexture;
            if (str8 == null) {
                str8 = this.isComplexTexture;
            }
            this.isComplexTexture = str8;
            this.ignoreImageColor = themeData.ignoreImageColor;
            this.themeLevel = themeData.themeLevel;
        }
    }

    private boolean isUseCustomTheme(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c28e922", new Object[]{this, themeData})).booleanValue();
        }
        if (themeData == null) {
            return false;
        }
        if (StringUtils.isEmpty(themeData.themeLevel)) {
            return true;
        }
        try {
            return Integer.parseInt(themeData.themeLevel) >= Integer.parseInt(this.themeLevel);
        } catch (Exception unused) {
            return true;
        }
    }
}
