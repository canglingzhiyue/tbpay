package com.taobao.search.mmd.datasource.bean;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes7.dex */
public class SFPromotionBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_BAR_DARK = 10001;
    public static final int STATUS_BAR_LIGHT = 10002;
    public static final int STATUS_BAR_UNDEFINED = 10000;
    public String b;
    public int c;
    public int d;
    public int e;

    /* renamed from: a  reason: collision with root package name */
    public int f19160a = 10001;
    public float f = 1.0f;

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ActionBarStatus {
    }

    static {
        kge.a(-120628020);
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 10001 ? i != 10002 ? "unknown" : "light" : "dark";
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public SFPromotionBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFPromotionBean) ipChange.ipc$dispatch("1e76f6cd", new Object[]{this});
        }
        SFPromotionBean sFPromotionBean = new SFPromotionBean();
        sFPromotionBean.d = this.d;
        sFPromotionBean.e = this.e;
        sFPromotionBean.f19160a = this.f19160a;
        sFPromotionBean.c = this.c;
        sFPromotionBean.b = this.b;
        return sFPromotionBean;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SFPromotionBean sFPromotionBean = (SFPromotionBean) obj;
        if (this.f19160a != sFPromotionBean.f19160a || this.c != sFPromotionBean.c || this.d != sFPromotionBean.d || this.e != sFPromotionBean.e) {
            return false;
        }
        return StringUtils.equals(this.b, sFPromotionBean.b);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.f19160a * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((i2 + i) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SFPromotionBean{actionBarStatus=" + a(this.f19160a) + ", backgroundImgUrl='" + this.b + "', backgroundColor=" + this.c + ", tabTextNormalColor=" + this.d + ", tabTextSelectedColor=" + this.e + '}';
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 10000;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3075958) {
            if (hashCode == 102970646 && str.equals("light")) {
                c = 1;
            }
        } else if (str.equals("dark")) {
            c = 0;
        }
        if (c == 0) {
            return 10001;
        }
        return c != 1 ? 10000 : 10002;
    }
}
