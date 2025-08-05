package com.taobao.taolivehome;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.pro;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1021935990);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : pro.d(pmd.a().d().b("tblive", "enableLoginInitBugfix", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : pro.d(pmd.a().d().b("tblive", "enableNewIntentChangeUrl", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return pro.d(pmd.a().d().b("tblive", "isAfcColdContextLoginBugfix", "true"));
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : pro.d(pmd.a().d().b("tblive", "isAfcColdContextAutoLogin", "true")) && pro.d(pmd.a().t().b("taolive", "enablePreStartSimpleRequestDetailNew", "isAfcColdContextAutoLogin", "true"));
    }
}
