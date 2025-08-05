package com.taobao.taobao.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.util.List;
import java.util.Map;
import tb.fgf;
import tb.jpr;
import tb.jpt;
import tb.jpu;
import tb.jpx;
import tb.jqg;
import tb.sda;
import tb.sdb;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("99eba5b1", new Object[]{str}) : new a("CashDesk", str, "29841-tracker", b.b());
        }
    }

    /* renamed from: com.taobao.taobao.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0887b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0887b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static C0887b a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0887b) ipChange.ipc$dispatch("4c1b40bf", new Object[]{str, new Boolean(z)}) : new C0887b("CashDesk", "29841-tracker", b.b(), str, z);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c();
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : jpx.a() ? "http://taobao.com/jstracker/android/debug/cashdesk.html" : "http://taobao.com/jstracker/android/cashdesk.html";
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            jpr.a(new sdb("CashDesk", "29841-tracker", c()).a(a(0.01f)));
        }
    }

    private static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue();
        }
        if (!jpx.a()) {
            return f;
        }
        return 1.0f;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            jpr.a(jpu.a("CashDesk", "29841-tracker", c()).c(str).b(str2));
        }
    }

    public static void a(String str, Map<String, Long> map, List<String> list, float f) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e867c3c", new Object[]{str, map, list, new Float(f)});
        } else if (map.isEmpty()) {
            jqg.a("AliBuyJSTracker#reportPerf", "stages 不能为空");
        } else {
            fgf a2 = new fgf("CashDesk", "29841-tracker", c()).a(str);
            if (list != null) {
                while (i < list.size()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Repeat.D);
                    int i2 = i + 1;
                    sb.append(i2);
                    a2.a(sb.toString(), list.get(i));
                    i = i2;
                }
            }
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                a2.a(entry.getKey(), entry.getValue().longValue());
            }
            if (jpx.a()) {
                f = 1.0f;
            }
            a2.b(f);
            jpr.a(a2);
        }
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!(jptVar instanceof a)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为BuyCustomModel");
            }
        } else {
            if (jpx.a()) {
                jptVar.a(1.0f);
            }
            jpr.a(jptVar);
        }
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!(sdaVar instanceof C0887b)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为CashMtopModel");
            }
        } else {
            if (jpx.a()) {
                sdaVar.a(1.0f);
            }
            jpr.a(sdaVar);
        }
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
            return;
        }
        jpt c = a.b("tbCashDeskRate").c(str);
        if (i != 0) {
            z = false;
        }
        jpt a2 = c.b(z).a(i).a(0.1f);
        if (jpx.a()) {
            a2.a(1.0f);
        }
        jpr.a(a2);
    }

    public static void b(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{str, new Integer(i)});
            return;
        }
        jpt c = a.b("wxPayUserFlow").c(str);
        if (i != 0) {
            z = false;
        }
        jpt a2 = c.b(z).a(i).a(0.1f);
        if (jpx.a()) {
            a2.a(1.0f);
        }
        jpr.a(a2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        jpt a2 = a.b("payResult").c(str).a(str2).a(0.1f);
        if (jpx.a()) {
            a2.a(1.0f);
        }
        jpr.a(a2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        jpt a2 = a.b("WechatPayResult").c(str).a(str2).a(0.1f);
        if (jpx.a()) {
            a2.a(1.0f);
        }
        jpr.a(a2);
    }
}
