package com.taobao.mrt;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.g;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Namespace = "EdgeComputingIsEnabled";
    public static List<a> f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18245a;
    public boolean b;
    public int c;
    public List<String> d;
    public List<String> e;

    /* loaded from: classes7.dex */
    public interface a {
        void a(d dVar);
    }

    public d(boolean z, boolean z2, int i, List<String> list, List<String> list2) {
        this.d = null;
        this.e = null;
        this.f18245a = z;
        this.e = list;
        this.d = list2;
        this.b = z2;
        this.c = i;
    }

    private static d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4070db8a", new Object[0]);
        }
        String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "whitelist", null);
        String config2 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "blacklist", null);
        String config3 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isEnabled", "true");
        String config4 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "stopRunCompute", "false");
        String config5 = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "maxDelayTime", "10");
        List<String> a2 = a(config2);
        return new d(Boolean.valueOf(config3).booleanValue(), Boolean.valueOf(config4).booleanValue(), Integer.valueOf(config5).intValue(), a(config), a2);
    }

    private static List<String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            return Arrays.asList(split);
        }
        return null;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        d c = c();
        g.a().a(c);
        a(c);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        OrangeConfig.getInstance().registerListener(new String[]{"EdgeComputingIsEnabled"}, new com.taobao.orange.d() { // from class: com.taobao.mrt.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                com.taobao.mrt.utils.a.a("MRTConfiguration", "get orange config need " + (currentTimeMillis2 - currentTimeMillis) + " (ms)");
                d.a();
            }
        }, true);
        try {
            OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "whitelist", null);
        } catch (Throwable unused) {
        }
    }

    static {
        kge.a(-594193606);
        f = new ArrayList();
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d978d6ed", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        synchronized (f) {
            if (f.contains(aVar)) {
                return true;
            }
            f.add(aVar);
            return true;
        }
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5578d846", new Object[]{dVar});
            return;
        }
        synchronized (f) {
            for (a aVar : f) {
                aVar.a(dVar);
            }
        }
    }
}
