package com.taobao.android.tschedule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.tschedule.trigger.nav.a;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.jkq;
import tb.jly;
import tb.jmf;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f15661a;
    private static a b;
    private static jly c;
    private static b d;
    private static String e;

    static {
        kge.a(1577381380);
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            b(map);
        }
    }

    public static boolean a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ced1b588", new Object[]{context, bVar})).booleanValue();
        }
        if (context == null || bVar == null) {
            return false;
        }
        f15661a = context;
        d = bVar;
        l();
        if (!jmh.a(f15661a)) {
            return false;
        }
        if (jmh.a()) {
            a(f15661a);
        }
        k();
        return true;
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.tschedule.TScheduleInitialize$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    String str = com.taobao.android.editionswitcher.b.b(context2).editionCode;
                    jkq.a("TS.Initialize", "position changed after user select from UI");
                    d.a(str, str);
                }
            }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"), null, i.b().a());
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!jmh.a(f15661a)) {
            return false;
        }
        if (!ABGlobal.isFeatureOpened(f15661a, jmg.DEFER_INIT_PREFETCH_CONFIG)) {
            return true;
        }
        c.b(e);
        jkq.a("TS.Initialize", "initIdle: config init in idle...");
        return true;
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]);
        }
        Context context = f15661a;
        if (context != null && context.getApplicationContext() != null) {
            return f15661a.getApplicationContext();
        }
        return f15661a;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    public static com.taobao.android.tschedule.parser.b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.tschedule.parser.b) ipChange.ipc$dispatch("9c5177", new Object[0]);
        }
        b bVar = d;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static synchronized a i() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c03ba5ce", new Object[0]);
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public static synchronized jly j() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jly) ipChange.ipc$dispatch("544548de", new Object[0]);
            }
            if (c == null) {
                c = new jly();
            }
            return c;
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            c.f15655a = Boolean.parseBoolean(str);
        } catch (Exception unused) {
        }
    }

    private static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
            return;
        }
        e = jmh.a(jmg.CONFIG_KEY_CONFIG, "");
        String a2 = jmh.a(jmg.CONFIG_KEY_RENDER_PROTOCOL_H5, "");
        String a3 = jmh.a(jmg.CONFIG_KEY_RENDER_PROTOCOL_MINIAPP, "");
        String a4 = jmh.a(jmg.CONFIG_KEY_RENDER_PROTOCOL_PHA, "");
        String a5 = jmh.a(jmg.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5, "");
        String a6 = jmh.a(jmg.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP, "");
        try {
            a(jmh.a(jmg.CONFIG_KEY_DELAY_PRERENDER, ""));
        } catch (Exception unused) {
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(f15661a, jmg.DEFER_INIT_PREFETCH_CONFIG);
        jmf.a("TScheduleConfig init");
        if (!isFeatureOpened) {
            c.b(e);
        }
        jmf.a("TScheduleConfig init", new String[0]);
        jmi.a(a2, a3, a4, a5, a6);
    }

    private static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        Context context = f15661a;
        if (context == null || !jmi.a(context)) {
            return;
        }
        String g = g();
        if (TextUtils.isEmpty(g)) {
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{g}, new com.taobao.orange.d() { // from class: com.taobao.android.tschedule.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else {
                    e.a(OrangeConfig.getInstance().getConfigs(str));
                }
            }
        }, true);
        b(OrangeConfig.getInstance().getConfigs(g));
    }

    private static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (map == null) {
        } else {
            String a2 = jmh.a(jmg.CONFIG_KEY_RENDER_VERSION, "");
            String str = map.get(jmg.CONFIG_KEY_RENDER_VERSION);
            if (!TextUtils.isEmpty(a2) && !a2.equals(str)) {
                z = true;
            }
            jkq.a("TS.Initialize", "Orange config update: " + map.toString());
            jmh.a(map);
            if (jmh.a(b())) {
                jmi.a(map.get(jmg.CONFIG_KEY_RENDER_PROTOCOL_H5), map.get(jmg.CONFIG_KEY_RENDER_PROTOCOL_MINIAPP), map.get(jmg.CONFIG_KEY_RENDER_PROTOCOL_PHA), map.get(jmg.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_H5), map.get(jmg.CONFIG_KEY_MULTI_PROCESS_PROTOCOL_MINIAPP));
                try {
                    a(map.get(jmg.CONFIG_KEY_DELAY_PRERENDER));
                } catch (Exception unused) {
                }
                c.b(map.get(jmg.CONFIG_KEY_CONFIG));
            } else {
                c.b(null);
            }
            if (!z) {
                return;
            }
            d.a(a2, str);
        }
    }
}
