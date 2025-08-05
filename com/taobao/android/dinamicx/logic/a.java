package com.taobao.android.dinamicx.logic;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.fux;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f11884a = "engineId";
    public static String b = "2147483647";
    public static String c = ",,";
    public static int d = 0;
    public static int e = 1;
    private static String f = "LogicCacheInstanceManager";
    private final Map<String, b> g = new HashMap();
    private final Map<String, WeakReference<DinamicXEngine>> h = new HashMap();
    private final Set<String> i = new CopyOnWriteArraySet();

    /* renamed from: com.taobao.android.dinamicx.logic.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0474a {

        /* renamed from: a  reason: collision with root package name */
        public static a f11885a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7caabe7c", new Object[0]) : C0474a.f11885a;
    }

    public void a(String str, int i, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3cf4905", new Object[]{this, str, new Integer(i), mUSDKInstance});
            return;
        }
        b bVar = this.g.get(str);
        if (bVar == null) {
            bVar = new b(15);
            this.g.put(str, bVar);
        }
        bVar.put(Integer.valueOf(i), mUSDKInstance);
    }

    public MUSDKInstance a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("9ca294b7", new Object[]{this, str, new Integer(i)});
        }
        b bVar = this.g.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.get(Integer.valueOf(i));
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        if (DinamicXEngine.j()) {
            String str3 = f;
            fux.b("DinamicX", str3, "destroyInternal bizType:" + str + " engineId:" + str2);
        }
        b bVar = this.g.get(str);
        if (bVar == null) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (MUSDKInstance mUSDKInstance : bVar.snapshot().values()) {
            if (mUSDKInstance.getInstanceEnv(f11884a).equals(str2)) {
                mUSDKInstance.destroy();
                arrayList.add(Integer.valueOf(mUSDKInstance.getInstanceId()));
            } else if (!this.i.contains(str2)) {
                mUSDKInstance.destroy();
                arrayList.add(Integer.valueOf(mUSDKInstance.getInstanceId()));
            }
        }
        for (Integer num : arrayList) {
            bVar.remove(Integer.valueOf(num.intValue()));
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        a(str + c + str2);
        b(str2);
        b(str, str2);
    }

    public void a(String str, String str2, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944570ad", new Object[]{this, str, str2, dinamicXEngine});
            return;
        }
        b();
        String str3 = str + c + str2;
        WeakReference<DinamicXEngine> weakReference = this.h.get(str3);
        if (weakReference != null && weakReference.get() != null) {
            b(str, str2);
        }
        if (DinamicXEngine.j()) {
            String str4 = f;
            StringBuilder sb = new StringBuilder();
            sb.append("bizType:");
            sb.append(str);
            sb.append(" engineId:");
            sb.append(str2);
            sb.append(" engine == null:");
            if (dinamicXEngine != null) {
                z = false;
            }
            sb.append(z);
            fux.b("DinamicX", str4, sb.toString());
        }
        this.h.put(str3, new WeakReference<>(dinamicXEngine));
        this.i.add(str2);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, WeakReference<DinamicXEngine>> entry : this.h.entrySet()) {
            if (entry.getValue() == null || entry.getValue().get() == null) {
                String[] split = entry.getKey().split(c);
                if (split.length == 2) {
                    b(split[d], split[e]);
                    b(split[e]);
                }
                arrayList.add(entry.getKey());
            }
        }
        for (String str : arrayList) {
            a(str);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h.remove(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.i.remove(str);
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends LruCache<Integer, MUSDKInstance> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -877389389) {
                super.entryRemoved(((Boolean) objArr[0]).booleanValue(), objArr[1], objArr[2], objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Integer num, MUSDKInstance mUSDKInstance, MUSDKInstance mUSDKInstance2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), num, mUSDKInstance, mUSDKInstance2});
            } else {
                a(z, num, mUSDKInstance, mUSDKInstance2);
            }
        }

        public b(int i) {
            super(i);
        }

        public void a(boolean z, Integer num, MUSDKInstance mUSDKInstance, MUSDKInstance mUSDKInstance2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fd1f8b", new Object[]{this, new Boolean(z), num, mUSDKInstance, mUSDKInstance2});
                return;
            }
            super.entryRemoved(z, num, mUSDKInstance, mUSDKInstance2);
            if (mUSDKInstance.isDestroyed()) {
                return;
            }
            mUSDKInstance.destroy();
        }
    }
}
