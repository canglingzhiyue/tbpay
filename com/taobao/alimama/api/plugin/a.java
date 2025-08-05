package com.taobao.alimama.api.plugin;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IPlugin> f8408a = new ArrayList(5);

    /* renamed from: com.taobao.alimama.api.plugin.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0324a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f8409a;

        static {
            kge.a(-1501672588);
            f8409a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a8a3c523", new Object[0]) : f8409a;
        }
    }

    static {
        kge.a(-1293914031);
    }

    public void a(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<String> c = c();
        if (c == null || c.size() == 0) {
            return;
        }
        ArrayList<Class> arrayList = new ArrayList(5);
        for (String str : c) {
            try {
                Class<?> loadClass = context.getClassLoader().loadClass(str);
                if (IPlugin.class.isAssignableFrom(loadClass)) {
                    arrayList.add(loadClass);
                    String str2 = "find plugin [" + str + riy.ARRAY_END_STR;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        for (Class cls : arrayList) {
            try {
                this.f8408a.add((IPlugin) cls.newInstance());
            } catch (Throwable th2) {
                Log.e(com.taobao.alimama.api.a.LOG_TAG, "unable to load plugin " + cls.getName(), th2);
            }
        }
        String str3 = "plugin loader init done, total find plugin count=" + this.f8408a.size() + ", cost=" + (SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    public Map<Class<?>, Class<? extends AbsServiceImpl>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (IPlugin iPlugin : this.f8408a) {
            Map<Class<?>, Class<? extends AbsServiceImpl>> services = iPlugin.services();
            if (services != null) {
                hashMap.putAll(services);
            }
        }
        return hashMap;
    }

    private static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("com.taobao.alimama.common.plugin.Plugin");
        return arrayList;
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bc4b98a4", new Object[0]) : C0324a.a();
    }
}
