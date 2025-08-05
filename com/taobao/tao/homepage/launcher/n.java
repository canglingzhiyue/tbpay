package com.taobao.tao.homepage.launcher;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jqm;
import tb.kge;
import tb.lap;
import tb.laq;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, String> f20605a;
    private static Map<Class, String> b;
    private static Map<Class, String> c;
    private static List<Class> d;

    static {
        kge.a(2110714440);
        f20605a = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList$1
            {
                put(l.class, "HomeSwitchLauncher");
                put(c.class, "HomeDinamicX2Launcher");
                put(d.class, "HomeDinamicX3Launcher");
                put(i.class, "HomePreCreateViewLauncher");
                put(a.class, "HomeAdvLauncher");
                put(e.class, "HomeGatewayLauncher");
                put(j.class, "HomePreRequestLauncher");
                put(g.class, "HomeLauncher");
            }
        };
        b = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList$2
            {
                put(k.class, "HomePrepareParamsLauncher");
                put(h.class, "HomeLoadCacheLauncher");
            }
        };
        c = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList$3
            {
                put(f.class, "HomeIdleLauncher");
            }
        };
        d = new ArrayList();
    }

    public static void a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{cls});
        } else if (!f20605a.containsKey(cls) && !b.containsKey(cls) && !c.containsKey(cls)) {
            d.add(cls);
        } else {
            f20605a.remove(cls);
            b.remove(cls);
            c.remove(cls);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (d.size() > 0 && jqm.a()) {
            Toast.makeText(context, "【状态出错】首页有新增启动任务，请及时更新首页代码<LauncherInitCheckList>", 1).show();
        }
        if (f20605a.size() <= 0 && b.size() <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("【状态出错】首页还有以下任务没有执行，请联系面孔排查问题。：");
        if (f20605a.size() > 0) {
            for (String str : f20605a.values()) {
                sb.append(str);
                sb.append(" ");
            }
            lap.a("LauncherTask", "LauncherInitCheck", "LauncherInitCheckList.checkBeforeHomeRun; necessaryLauncher:" + ((Object) sb));
            a();
        }
        if (b.size() > 0) {
            for (String str2 : b.values()) {
                sb.append(str2);
                sb.append(" ");
            }
            lap.a("LauncherTask", "LauncherInitCheck", "LauncherInitCheckList.checkBeforeHomeRun; speedLauncher:" + ((Object) sb));
        }
        if (!jqm.a()) {
            return;
        }
        Toast.makeText(context, sb.toString(), 1).show();
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        laq.a().a("LauncherTask").b("retryTrigger").c("LauncherInitCheckList.reTrigger").b();
        if (f20605a.containsValue("HomeSwitchLauncher")) {
            new l().a(LauncherRuntime.h, a("HomeSwitchLauncher"));
        }
        if (f20605a.containsValue("HomeDinamicX2Launcher")) {
            new c().a(LauncherRuntime.h, a("HomeDinamicX2Launcher"));
        }
        if (f20605a.containsValue("HomeDinamicX3Launcher")) {
            new d().a(LauncherRuntime.h, a("HomeDinamicX3Launcher"));
        }
        if (f20605a.containsValue("HomePreCreateViewLauncher")) {
            new i().a(LauncherRuntime.h, a("HomePreCreateViewLauncher"));
        }
        if (f20605a.containsValue("HomeAdvLauncher")) {
            new a().a(LauncherRuntime.h, a("HomeAdvLauncher"));
        }
        if (f20605a.containsValue("HomeGatewayLauncher")) {
            new e().a(LauncherRuntime.h, a("HomeGatewayLauncher"));
        }
        if (f20605a.containsValue("HomePreRequestLauncher") && !com.taobao.homepage.utils.n.n().n()) {
            new j().a(LauncherRuntime.h, a("HomePreRequestLauncher"));
        }
        if (!f20605a.containsValue("HomeLauncher")) {
            return;
        }
        new g().a(LauncherRuntime.h, a("HomeLauncher"));
    }

    private static HashMap<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        HashMap<String, Object> a2 = com.taobao.android.launcher.common.c.a(str);
        a2.put(b.LAUNCHER_NAME, str);
        a2.put(b.LAUNCHER_TYPE, b.LAUNCHER_TRIGGER);
        return a2;
    }
}
