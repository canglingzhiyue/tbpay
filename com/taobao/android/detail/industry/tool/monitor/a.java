package com.taobao.android.detail.industry.tool.monitor;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_KEY = "AuraComponentKey";

    /* renamed from: a  reason: collision with root package name */
    public static b f10123a;
    private static final Map<Activity, ConcurrentHashMap<String, b>> b;

    static {
        kge.a(-2022965533);
        b = new ConcurrentHashMap();
        emu.a("com.taobao.android.detail.industry.tool.monitor.DIComponentAspectManager");
    }

    public static b a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5582687f", new Object[]{context, str});
        }
        if (!(context instanceof Activity)) {
            com.taobao.android.detail.industry.tool.a.b("DIComponentAspectManager", "getMonitor context invalid");
            return null;
        }
        ConcurrentHashMap<String, b> concurrentHashMap = b.get(context);
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public static void a(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff2aa3b", new Object[]{context, str, bVar});
        } else if (!(context instanceof Activity)) {
            com.taobao.android.detail.industry.tool.a.b("DIComponentAspectManager", "setMonitor context invalid");
        } else {
            ConcurrentHashMap<String, b> concurrentHashMap = b.get(context);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            concurrentHashMap.put(str, bVar);
            b.put((Activity) context, concurrentHashMap);
            com.taobao.android.detail.industry.tool.a.a("DIComponentAspectManager", "setMonitor|activity:" + context.hashCode() + "|" + concurrentHashMap.size());
        }
    }

    public static void a(Context context, com.alibaba.android.aura.b bVar) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4e578", new Object[]{context, bVar});
            return;
        }
        Object obj = bVar.c().get("AuraComponentKey");
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str) && (a2 = a(context, str)) != null) {
                a2.a(bVar);
                return;
            }
        }
        b bVar2 = f10123a;
        if (bVar2 == null) {
            return;
        }
        bVar2.a(bVar);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        ConcurrentHashMap<String, b> concurrentHashMap = b.get(context);
        if (concurrentHashMap == null) {
            return;
        }
        com.taobao.android.detail.industry.tool.a.a("DIComponentAspectManager", "clearComponentMonitorMap|Activity:" + context.hashCode() + "|" + concurrentHashMap.size());
        concurrentHashMap.clear();
        b.remove(context);
    }
}
