package com.taobao.tao.powermsg.managers;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEF_BIZ_TAG = "_default";
    public static final String DEF_CHANNEL = "_default";
    public static final int MODE_CACHE = 10001;
    public static final int MODE_NOTIFY = 10000;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<Integer, HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>>> f20840a;
    private static Map<String, com.taobao.tao.powermsg.common.c> b;
    private static Map<String, C0874a> c;

    /* renamed from: com.taobao.tao.powermsg.managers.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0874a {

        /* renamed from: a  reason: collision with root package name */
        public int f20841a;
        public int b;
        public int c;

        static {
            kge.a(1463058614);
        }
    }

    static {
        kge.a(802593232);
        f20840a = new HashMap<>();
        b = new ConcurrentHashMap();
        c = new HashMap();
    }

    public static int a(int i, String str, com.taobao.tao.powermsg.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0e2fef5", new Object[]{new Integer(i), str, cVar})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            str = "_default";
        }
        HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>> hashMap = f20840a.get(Integer.valueOf(i));
        if (hashMap == null) {
            HashMap<Integer, HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>>> hashMap2 = f20840a;
            Integer valueOf = Integer.valueOf(i);
            HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>> hashMap3 = new HashMap<>();
            hashMap2.put(valueOf, hashMap3);
            hashMap = hashMap3;
        }
        return hashMap.put(str, new WeakReference<>(cVar)) != null ? -1 : 1;
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        Map<String, C0874a> map = c;
        C0874a c0874a = map.get(str + riy.PLUS + str2);
        if (c0874a != null) {
            return c0874a.c;
        }
        return 3;
    }

    public static com.taobao.tao.powermsg.common.c a(String str) {
        IpChange ipChange = $ipChange;
        return (com.taobao.tao.powermsg.common.c) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("76dbb41", new Object[]{str}) : b.get(str));
    }

    public static HashMap<String, WeakReference<com.taobao.tao.powermsg.common.c>> a(int i) {
        IpChange ipChange = $ipChange;
        return (HashMap) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("ebc7383e", new Object[]{new Integer(i)}) : f20840a.get(Integer.valueOf(i)));
    }

    public static void a(String str, com.taobao.tao.powermsg.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af1fb4f", new Object[]{str, cVar});
        } else {
            b.put(str, cVar);
        }
    }

    public static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
        } else {
            c(str, str2).c = i;
        }
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{str, str2})).intValue();
        }
        Map<String, C0874a> map = c;
        C0874a c0874a = map.get(str + riy.PLUS + str2);
        if (c0874a != null) {
            return c0874a.b;
        }
        return 10000;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b.remove(str);
        }
    }

    public static void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{str, str2, new Integer(i)});
        } else {
            c(str, str2).f20841a = i;
        }
    }

    public static C0874a c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0874a) ipChange.ipc$dispatch("c742a73f", new Object[]{str, str2});
        }
        C0874a d = d(str, str2);
        if (d != null) {
            return d;
        }
        C0874a c0874a = new C0874a();
        Map<String, C0874a> map = c;
        map.put(str + riy.PLUS + str2, c0874a);
        return c0874a;
    }

    public static C0874a d(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("e043f8de", new Object[]{str, str2});
        } else {
            Map<String, C0874a> map = c;
            obj = map.get(str + riy.PLUS + str2);
        }
        return (C0874a) obj;
    }
}
