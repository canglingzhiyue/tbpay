package com.taobao.android.dinamicx.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fuw;
import tb.fxd;
import tb.fxe;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_CACHE_DATA_KEY = "dxLifeCycleInfo";
    public static final String LOCAL_CACHE_PF_NAME = "dxLifeCycle";
    public static final int UPLOAD_DELAY = 5000;
    public static final int UPLOAD_INFO_TYPE_ENGINE_LIFE_CYCLE = 0;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<WeakReference<DinamicXEngine>>> f11898a;
    private static final Map<String, int[]> b;
    private static SharedPreferences c;
    private static volatile boolean d;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("be17c603", new Object[0]) : c;
    }

    static {
        kge.a(566665292);
        f11898a = new HashMap();
        b = new HashMap();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || c()) {
        } else {
            if (!fqi.U()) {
                if (!DinamicXEngine.j()) {
                    return;
                }
                fuw.d("DXConfigCenter", "Engine LifeCycle 上报关");
                return;
            }
            if (DinamicXEngine.j()) {
                fuw.d("DXConfigCenter", "全局 LowMemory 监听开");
            }
            c = context.getSharedPreferences(LOCAL_CACHE_PF_NAME, 0);
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.d("DXLifeCycleMonitor", "init DXLifeCycleMonitor Success");
        }
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
        } else if (!c()) {
        } else {
            String a2 = dinamicXEngine.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            synchronized (f11898a) {
                g(a2).add(new WeakReference<>(dinamicXEngine));
                int[] f = f(a2);
                f[0] = f[0] + 1;
                if (DinamicXEngine.j()) {
                    fuw.d("DXLifeCycleMonitor", "addEngine create: " + a2);
                }
                f();
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!c() || TextUtils.isEmpty(str)) {
        } else {
            synchronized (f11898a) {
                int[] f = f(str);
                f[2] = f[2] + 1;
                if (DinamicXEngine.j()) {
                    fuw.d("DXLifeCycleMonitor", "addEngine resume: " + str);
                }
                f();
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!c() || TextUtils.isEmpty(str)) {
        } else {
            synchronized (f11898a) {
                int[] f = f(str);
                f[3] = f[3] + 1;
                if (DinamicXEngine.j()) {
                    fuw.d("DXLifeCycleMonitor", "addEngine stop: " + str);
                }
                f();
            }
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!c() || TextUtils.isEmpty(str)) {
        } else {
            synchronized (f11898a) {
                int[] f = f(str);
                f[4] = f[4] + 1;
                if (DinamicXEngine.j()) {
                    fuw.d("DXLifeCycleMonitor", "addEngine destroy: " + str);
                }
                f();
            }
        }
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        if (!c()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        synchronized (f11898a) {
            for (Map.Entry<String, List<WeakReference<DinamicXEngine>>> entry : f11898a.entrySet()) {
                String key = entry.getKey();
                String d2 = d(key);
                if (!TextUtils.isEmpty(d2)) {
                    hashMap.put(e(key), d2);
                }
            }
        }
        return hashMap;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!c()) {
        } else {
            d = true;
            new Thread(new Runnable() { // from class: com.taobao.android.dinamicx.monitor.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final s sVar = new s("dinamicx");
                    sVar.c = new ArrayList();
                    s.a aVar = new s.a("DX_LifeCycle", "DX_LifeCycle", s.DX_LIFECYCLE_MONITOR);
                    final Map<String, Object> d2 = d.d();
                    if (d2 != null) {
                        aVar.f = new HashMap();
                        for (Map.Entry<String, Object> entry : d2.entrySet()) {
                            aVar.f.put(entry.getKey(), entry.getValue().toString());
                        }
                    }
                    sVar.c.add(aVar);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.dinamicx.monitor.d.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            b.a(sVar);
                            if (!DinamicXEngine.j()) {
                                return;
                            }
                            fuw.d("DXLifeCycleMonitor", "uploadToAppMonitor: " + JSONObject.toJSONString(d2));
                        }
                    }, 5000L);
                    d.a(false);
                    d.e();
                }
            }, "DXLifeCycleMonitor").start();
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c != null;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<WeakReference<DinamicXEngine>> g = g(str);
        int[] f = f(str);
        Iterator<WeakReference<DinamicXEngine>> it = g.iterator();
        while (it.hasNext()) {
            WeakReference<DinamicXEngine> next = it.next();
            if (next != null) {
                if (next.get() != null) {
                    i++;
                } else {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
        f[1] = i;
        return a(f);
    }

    public static Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[0]);
        }
        String string = c.getString(LOCAL_CACHE_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSONObject.parseObject(string).getInnerMap();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (!c()) {
        } else {
            SharedPreferences.Editor edit = c.edit();
            edit.clear();
            edit.apply();
        }
    }

    public static synchronized void f() {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
                return;
            }
            if (c() && !d) {
                g();
            }
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        final Map<String, String> a2 = a();
        fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SharedPreferences.Editor edit = d.h().edit();
                String jSONString = JSONObject.toJSONString(a2);
                edit.putString(d.LOCAL_CACHE_DATA_KEY, jSONString);
                if (DinamicXEngine.j()) {
                    fuw.d("DXLifeCycleMonitor", "saveToSp: " + jSONString);
                }
                edit.apply();
            }
        });
    }

    public static String a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a070cdea", new Object[]{iArr});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        return "dx-0-" + str;
    }

    private static int[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6d2b054d", new Object[]{str});
        }
        int[] iArr = b.get(str);
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[5];
        b.put(str, iArr2);
        return iArr2;
    }

    private static List<WeakReference<DinamicXEngine>> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("706b078f", new Object[]{str});
        }
        List<WeakReference<DinamicXEngine>> list = f11898a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f11898a.put(str, arrayList);
        return arrayList;
    }
}
