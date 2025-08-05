package com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeData;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class GlobalThemeConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bgEndSection;
    public String maskBackgroundColor;
    public String separatorImageUrl;
    public ThemeData themeData;

    static {
        kge.a(-304384468);
        kge.a(1028243835);
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
            GlobalThemeConfig globalThemeConfig = (GlobalThemeConfig) obj;
            if (TextUtils.equals(this.separatorImageUrl, globalThemeConfig.separatorImageUrl) && TextUtils.equals(this.maskBackgroundColor, globalThemeConfig.maskBackgroundColor) && TextUtils.equals(this.bgEndSection, globalThemeConfig.bgEndSection) && equals(this.themeData, globalThemeConfig.themeData)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GlobalBGThemeConfig{separatorImageUrl='");
        sb.append(this.separatorImageUrl);
        sb.append('\'');
        sb.append(", maskBackgroundColor='");
        sb.append(this.maskBackgroundColor);
        sb.append('\'');
        sb.append(", bgEndSection='");
        sb.append(this.bgEndSection);
        sb.append('\'');
        sb.append(", themeData=");
        if (this.themeData == null) {
            str = "null";
        } else {
            str = "actionBarBackgroundColor = " + this.themeData.actionBarBackgroundColor + ";skinPic = " + this.themeData.skinPic + ";actionBarBackgroundImage = " + this.themeData.actionBarBackgroundImage + ";skinColor = " + this.themeData.skinColor + ";actionbarTextColor = " + this.themeData.actionbarTextColor + ";isComplexTexture = " + this.themeData.isComplexTexture + ";naviStyle = " + this.themeData.naviStyle + ";statusBarStyle = " + this.themeData.statusBarStyle;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    private boolean equals(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{this, obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
