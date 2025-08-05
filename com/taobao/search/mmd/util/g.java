package com.taobao.search.mmd.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.search.common.util.q;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19195a;
    private static String b;
    private static String c;
    private static String d;

    static {
        kge.a(651830690);
        f19195a = g.class.getSimpleName();
        b = "";
        c = "";
        d = "";
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        PositionInfo b2 = com.taobao.android.editionswitcher.b.b(Globals.getApplication());
        if (b2 == null) {
            return;
        }
        String str = "";
        b = b2.countryCode != null ? b2.countryCode : str;
        c = b2.countryNumCode != null ? b2.countryNumCode : str;
        if (b2.editionCode != null) {
            str = b2.editionCode;
        }
        d = str;
        String str2 = f19195a;
        q.a(str2, "country code:" + b + ", country num:" + c + ", edition code:" + d);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : d;
    }
}
