package com.taobao.tao.powermsg.managers;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.h;
import com.taobao.tao.powermsg.managers.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.olt;
import tb.onh;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ArrayMap<String, ArrayMap<String, a>> f20857a;
    private static final Map<String, h> b;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20858a;
        public String d;
        public String e;
        public String f;
        public String b = "";
        public String c = "";
        public boolean g = false;
        public int h = 1;
        public int i = 3;
        public ArrayMap<String, String> j = new ArrayMap<>();
        public ArrayList<d.a> k = new ArrayList<>();
        public ArrayList<d.a> l = new ArrayList<>();

        static {
            kge.a(900107595);
        }

        public static String a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
            }
            return i + "c:" + str;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.c = str;
        }

        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
            }
            String str2 = this.c;
            if (str == null) {
                str = "";
            }
            return str2.equals(str);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "SubscribeItem{status=" + this.f20858a + ", topic='" + this.b + "', bizTag='" + this.c + "', pChannel='" + this.d + "', from='" + this.e + "', ext='" + this.f + "', bind=" + this.j + '}';
        }
    }

    static {
        kge.a(112177938);
        f20857a = new ArrayMap<>();
        b = new ConcurrentHashMap();
    }

    public static h a(int i, String str) {
        IpChange ipChange = $ipChange;
        return (h) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6c43f5c9", new Object[]{new Integer(i), str}) : b.get(c(i, str)));
    }

    public static synchronized a a(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("68437a55", new Object[]{str, str2, str3, str4, str5, str6});
            }
            a aVar = null;
            ArrayMap<String, a> arrayMap = f20857a.get(str);
            if (arrayMap == null) {
                ArrayMap<String, ArrayMap<String, a>> arrayMap2 = f20857a;
                ArrayMap<String, a> arrayMap3 = new ArrayMap<>();
                arrayMap2.put(str, arrayMap3);
                arrayMap = arrayMap3;
            } else {
                aVar = arrayMap.get(str2);
            }
            if (aVar == null) {
                aVar = new a();
                aVar.b = str;
                aVar.d = str4;
                aVar.e = str5;
                aVar.f = str6;
                aVar.a(str3);
                arrayMap.put(str2, aVar);
            }
            return aVar;
        }
    }

    public static synchronized List<a> a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            for (ArrayMap<String, a> arrayMap : f20857a.values()) {
                arrayList.addAll(arrayMap.values());
            }
            return arrayList;
        }
    }

    public static void a(int i, String str, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e544dd", new Object[]{new Integer(i), str, hVar});
            return;
        }
        String c = c(i, str);
        if (olt.b() && b.containsKey(c)) {
            return;
        }
        b.put(c, hVar);
    }

    public static synchronized void a(String str, String str2, int i, int i2) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69987edc", new Object[]{str, str2, new Integer(i), new Integer(i2)});
                return;
            }
            c(str, com.taobao.tao.powermsg.d.a(str2));
            b(str, str2, i, i2);
        }
    }

    public static boolean a(int i, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1059b33d", new Object[]{new Integer(i), str, str2, str3})).booleanValue();
        }
        a c = c(str, com.taobao.tao.powermsg.d.a(str2));
        ArrayMap<String, String> arrayMap = null;
        if (c != null) {
            arrayMap = c.j;
            str4 = a.a(i, TextUtils.isEmpty(str3) ? "_default" : str3);
            if (arrayMap.get(str4) != null) {
                return true;
            }
        } else {
            str4 = null;
        }
        if (!"ubee".equals(str3)) {
            Object[] objArr = new Object[6];
            objArr[0] = "isSubscribed >";
            objArr[1] = Boolean.valueOf(c == null);
            objArr[2] = "key:";
            objArr[3] = str4;
            objArr[4] = "map:";
            objArr[5] = arrayMap == null ? "null" : arrayMap.toString();
            MsgLog.c("StateManager", objArr);
        }
        return false;
    }

    public static synchronized boolean a(String str) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
            }
            return !TextUtils.isEmpty(str) && f20857a.containsKey(str);
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        a c = c(str, com.taobao.tao.powermsg.d.a(str2));
        return c != null && (c.f20858a == 2 || c.f20858a == 3);
    }

    public static synchronized int b(int i, String str, String str2, String str3) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("165d7e8b", new Object[]{new Integer(i), str, str2, str3})).intValue();
            }
            a c = c(str, com.taobao.tao.powermsg.d.a(str2));
            if (c == null) {
                return 0;
            }
            ArrayMap<String, String> arrayMap = c.j;
            if (TextUtils.isEmpty(str3)) {
                str3 = "_default";
            }
            arrayMap.remove(a.a(i, str3));
            return c.j.size();
        }
    }

    public static synchronized Pair<Integer, Integer> b(String str, String str2) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("19996f2", new Object[]{str, str2});
            }
            a c = c(str, com.taobao.tao.powermsg.d.a(str2));
            if (c != null) {
                return new Pair<>(Integer.valueOf(c.h), Integer.valueOf(c.i));
            }
            return new Pair<>(1, 3);
        }
    }

    public static h b(int i, String str) {
        IpChange ipChange = $ipChange;
        return (h) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("91d7feca", new Object[]{new Integer(i), str}) : b.remove(c(i, str)));
    }

    public static synchronized void b(String str, String str2, int i, int i2) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ed9ed9d", new Object[]{str, str2, new Integer(i), new Integer(i2)});
                return;
            }
            a a2 = a(str, com.taobao.tao.powermsg.d.a(str2), str2, null, null, null);
            int a3 = i2 <= 0 ? onh.a(i) ? com.taobao.tao.messagekit.base.c.a("push_aside_pull_duration", 3) : com.taobao.tao.messagekit.base.c.a("pull_duration", 1) : i2;
            if (i > 0 && a3 > 0 && (a2.h != i || a2.i != a3)) {
                MsgLog.c("StateManager", "set role >", Integer.valueOf(i), "duration:", Integer.valueOf(a3), "topic:", str, "bizTag:", str2);
                a2.h = i;
                a2.i = a3;
            }
        }
    }

    public static synchronized int c(int i, String str, String str2, String str3) {
        a aVar;
        int i2;
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c6149ea", new Object[]{new Integer(i), str, str2, str3})).intValue();
            }
            ArrayMap<String, a> arrayMap = f20857a.get(str);
            if (f20857a.size() > 1) {
                com.taobao.tao.messagekit.core.utils.d.a("POWERMSG", "sub_err_together", "" + f20857a.size(), 1.0d);
            }
            if (f20857a.size() < 60) {
                if (arrayMap != null && (aVar = arrayMap.get(com.taobao.tao.powermsg.d.a(str2))) != null) {
                    if (aVar.g) {
                        return 1000;
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "_default";
                    }
                    String a2 = a.a(i, str3);
                    if (!aVar.b(str2) || aVar.j.get(a2) != null) {
                        i2 = -3011;
                    }
                }
                return 1000;
            }
            MsgLog.c("StateManager", "cannot Subscribe,SUB_TOPIC_LMT!!! >", Integer.valueOf(i), "topic:", str, str2);
            i2 = -3012;
            return i2;
        }
    }

    public static synchronized a c(String str, String str2) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c74478bb", new Object[]{str, str2});
            }
            ArrayMap<String, a> arrayMap = f20857a.get(str);
            if (arrayMap == null) {
                return null;
            }
            return arrayMap.get(str2);
        }
    }

    private static String c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e68d5c9d", new Object[]{new Integer(i), str});
        }
        return i + "_" + str;
    }

    public static synchronized void d(String str, String str2) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
                return;
            }
            ArrayMap<String, a> arrayMap = f20857a.get(str);
            if (arrayMap != null) {
                arrayMap.remove(str2);
                if (arrayMap.size() <= 0) {
                    f20857a.remove(str);
                }
            }
        }
    }

    public static synchronized boolean d(int i, String str, String str2, String str3) {
        a aVar;
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2265155a", new Object[]{new Integer(i), str, str2, str3})).booleanValue();
            }
            ArrayMap<String, a> arrayMap = f20857a.get(str);
            if (arrayMap != null && (aVar = arrayMap.get(com.taobao.tao.powermsg.d.a(str2))) != null) {
                return aVar.b(str2);
            }
            return true;
        }
    }
}
