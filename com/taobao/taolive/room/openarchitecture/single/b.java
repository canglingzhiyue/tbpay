package com.taobao.taolive.room.openarchitecture.single;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.pmi;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        kge.a(1802598052);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        pmi d = pmd.a().d();
        return d.a("tblive", str + "mixLiveAndTabOrange", str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        pmi d = pmd.a().d();
        return d.a("tblive", str + "mixLiveOrange", str2);
    }
}
