package com.taobao.mytaobao.newsetting.business.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class DynamicSettingItem implements Serializable, Comparable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String descIcon;
    public String fastUrl;
    public boolean forceDisplayDesc;
    public String helpInfo;
    public String hrefUrl;
    public String icon;
    public String key;
    public String menuDesc;
    public String menuName;
    public String menuStyle;
    public String moduleNumber;
    public String orderNumber;
    public String redDotUrl;
    public boolean showRedDot;
    public String spm;
    public String utName;

    static {
        kge.a(-1933495268);
        kge.a(1028243835);
        kge.a(415966670);
    }

    public DynamicSettingItem() {
    }

    public DynamicSettingItem(String str, String str2, String str3, String str4) {
        this(str, "", str2, str3, str4);
    }

    public DynamicSettingItem(String str, String str2, String str3, String str4, String str5) {
        this.menuName = str;
        this.menuDesc = str2;
        this.hrefUrl = str3;
        this.moduleNumber = str4;
        this.orderNumber = str5;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
        }
        if (obj != null && (str = this.moduleNumber) != null) {
            DynamicSettingItem dynamicSettingItem = (DynamicSettingItem) obj;
            if (!str.equals(dynamicSettingItem.moduleNumber)) {
                return this.moduleNumber.compareTo(dynamicSettingItem.moduleNumber);
            }
            if (!this.orderNumber.equals(dynamicSettingItem.orderNumber)) {
                return this.orderNumber.compareTo(dynamicSettingItem.orderNumber);
            }
        }
        return 0;
    }
}
