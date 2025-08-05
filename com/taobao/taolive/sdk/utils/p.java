package com.taobao.taolive.sdk.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.pmd;
import tb.pmf;
import tb.pmi;

/* loaded from: classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    private static int f21969a;
    private static int b;
    private static List<String> c;
    private static int d;
    private static int e;
    private static String f;
    private static int g;
    private static HashMap<String, Boolean> h;
    private static HashMap<String, String> i;

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : pmd.a().d() != null ? pmd.a().d().a("tblive", str, str2) : str2;
    }

    static {
        kge.a(-513822845);
        h = new HashMap<>();
        i = new HashMap<>();
        f21969a = -1;
        b = -1;
        d = -1;
        e = -1;
        f = null;
        g = -1;
    }

    public static boolean a(String str, boolean z) {
        pmi d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = h.get(str);
        if (bool == null && (d2 = pmd.a().d()) != null) {
            bool = Boolean.valueOf(l.d(d2.a("tblive", str, String.valueOf(z))));
            h.put(str, bool);
        }
        return bool != null ? bool.booleanValue() : z;
    }

    public static String a(String str, String str2, String str3, String str4) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        String str5 = i.get(str3);
        if (str5 == null && (t = pmd.a().t()) != null) {
            str5 = t.a(str, str2, str3, str4);
            i.put(str3, str5);
        }
        return str5 != null ? str5 : str4;
    }

    public static String a(String str, String str2, String str3) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        String str4 = i.get(str3);
        if (str4 == null && (t = pmd.a().t()) != null) {
            str4 = t.a(str, str2, str3, "");
            if (!TextUtils.isEmpty(str4)) {
                i.put(str3, str4);
            }
        }
        return str4;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : a("enableAnimationOptForWarm", true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePVIDForPV", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableAbandonOldChatMessage", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableOnlineLimitNumberFormat", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return l.d(pmd.a().d().a("tblive", "enableAdjustNewDefinition", "true"));
        }
        return false;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        return pmd.a().d().a("tblive", "officialLiveNextToastMsg", pmd.a().u().c().getString(R.string.taolive_official_live_next_toast));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        return pmd.a().d().a("tblive", "officialLiveNextWhenToastMsg", pmd.a().u().c().getString(R.string.taolive_official_live_next_when_toast));
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        return pmd.a().d().a("tblive", "officialLiveEndToastMsg", pmd.a().u().c().getString(R.string.taolive_official_live_end_toast));
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue() : l.a(pmd.a().d().a("tblive", "officialSwitchDelayMillis", "3000"), 3000L);
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[0])).longValue() : l.a(pmd.a().d().a("tblive", "officialEndDelayMillis", "3000"), 3000L);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : l.d(pmd.a().d().b("tblive", "enableOfficialLiveHeartParams", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        if (f21969a == -1 && pmd.a().d() != null && l.d(pmd.a().d().a("tblive", "enableAutoSwitchStreamWhenManual20240102", "false"))) {
            f21969a = l() ? 1 : 0;
        }
        return f21969a == 1;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return l.d(pmd.a().t().a("taolive", "EnableAutoSwitchStreamWhenManual20240102", "enableAutoSwitch", "false"));
    }

    public static long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[0])).longValue();
        }
        if (pmd.a().d() == null) {
            return 86400000L;
        }
        return l.b(pmd.a().d().a("tblive", "getAutoSwitchStreamWhenManualLimit", String.valueOf(86400000L)));
    }

    public static long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[0])).longValue();
        }
        if (pmd.a().d() == null) {
            return 604800000L;
        }
        return l.b(pmd.a().d().a("tblive", "getAutoSwitchStreamWhenManualTipLimit", String.valueOf(604800000L)));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableShowedCommentUT", "true"));
    }

    public static long p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fcceb", new Object[0])).longValue() : l.a(pmd.a().d().a("tblive", "trackShowedCommentReportCount", "20"), 20L);
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableDoubleQueueChatMessage", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (b == -1 && pmd.a().d() != null && l.d(pmd.a().d().a("tblive", "enableUseNewQueueMessageService2", "false"))) {
            b = t() ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (d == -1 && pmd.a().d() != null) {
            if (l.d(pmd.a().d().a("tblive", "enableUseFragmentJumpDetail", "true"))) {
                d = 1;
            } else {
                d = 0;
            }
        }
        return d == 1;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        if (e == -1 && pmd.a().d() != null) {
            if (l.d(pmd.a().d().a("tblive", "enableShowPMErrorToast", "true"))) {
                e = 1;
            } else {
                e = 0;
            }
        }
        return e == 1;
    }

    private static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return l.d(pmd.a().t().a("taolive", "EnableUseNewQueueMessageServiceAB", "enableUseNewQueueMessageServiceAB", "false"));
    }

    public static List<String> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b1ac84b", new Object[0]);
        }
        if (c == null) {
            c = Arrays.asList(pmd.a().d().a("tblive", "commissionDataAttributesKeyList", "mediafrom;itemId").split(";"));
        }
        return c;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableMergeDataAttributesParam", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableClientABTestHeartParams", "true"));
    }

    public static List<String> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19a221c7", new Object[0]);
        }
        if (f == null && pmd.a().d() != null) {
            f = pmd.a().d().a("tblive", "tcpAddLiveAlgoParamsKeyList", "combineKey;hyperSpaceBucket");
        }
        return a(f);
    }

    private static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str}) : Arrays.asList(str.split(";"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        if (g == -1 && pmd.a().d() != null) {
            g = l.d(pmd.a().d().a("tblive", "enableTcpAddLiveAlgoParams", "true")) ? 1 : 0;
        }
        return g == 1;
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableNotDestroyWebContainer", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().a("tblive", "enableWebFragmentUnregisterEvent", "true"));
    }
}
