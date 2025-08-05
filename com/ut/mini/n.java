package com.ut.mini;

import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.apr;
import tb.aqb;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f24142a;
    private static int b;
    private static List<String> c;
    private static String d;
    private static String e;
    private static boolean f;

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    static {
        kge.a(1892522643);
        f24142a = new ArrayList();
        b = 0;
        c = null;
        d = "{\"spm_seq\":{\"count\":4,\"page\":[\"Page_Detail\",\"Page_MyTaobao\"]}}";
        e = null;
        f = false;
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24143a;
        public String b;
        public String c;

        static {
            kge.a(-1430437822);
        }

        private a() {
            this.b = "";
            this.c = "-";
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f) {
        } else {
            f = true;
            apr.b("UTPageSequenceMgr", "init");
            aqe.a().a(new Runnable() { // from class: com.ut.mini.n.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        n.a(aqb.a(any.d().e(), "ut_seq"));
                    } catch (Exception unused) {
                    }
                }
            });
            UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.ut.mini.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
                public String getKey() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("16c52370", new Object[]{this}) : "ut_seq";
                }

                @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
                public void onChange(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                    } else {
                        n.a(str);
                    }
                }
            });
        }
    }

    private static synchronized void b(String str) {
        Map map;
        synchronized (n.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            } else if ((str != null && str.equalsIgnoreCase(e)) || (str == null && e == null)) {
            } else {
                e = str;
                aqb.a(any.d().e(), "ut_seq", e);
                if (e != null) {
                    try {
                        Map map2 = (Map) JSONObject.parseObject(e, Map.class);
                        if (map2 != null && map2.size() > 0 && (map = (Map) map2.get("spm_seq")) != null && map.size() > 0) {
                            b = ((Integer) map.get("count")).intValue();
                            c = (List) map.get("page");
                        }
                    } catch (Exception e2) {
                        apr.b("UTPageSequenceMgr", e2, new Object[0]);
                    }
                    return;
                }
                b = 0;
                c = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: Exception -> 0x00df, all -> 0x00eb, TryCatch #0 {Exception -> 0x00df, blocks: (B:12:0x0020, B:14:0x0039, B:19:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0069, B:31:0x00b2, B:33:0x00b6, B:35:0x00ba, B:37:0x00c2, B:29:0x006e, B:30:0x00a2), top: B:49:0x0020, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: Exception -> 0x00df, all -> 0x00eb, TryCatch #0 {Exception -> 0x00df, blocks: (B:12:0x0020, B:14:0x0039, B:19:0x0046, B:24:0x0056, B:26:0x005c, B:28:0x0069, B:31:0x00b2, B:33:0x00b6, B:35:0x00ba, B:37:0x00c2, B:29:0x006e, B:30:0x00a2), top: B:49:0x0020, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(java.lang.Object r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.n.a(java.lang.Object, java.util.Map):void");
    }

    private static List<String> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        int size = f24142a.size();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (size - 1) - i2;
            if (i3 < 0) {
                break;
            }
            a aVar = f24142a.get(i3);
            if (aVar != null) {
                arrayList.add(aVar.c);
            }
        }
        return arrayList;
    }

    private static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
            return;
        }
        int size = f24142a.size();
        int i2 = size - 1;
        if (i > i2) {
            apr.e("UTPageSequenceMgr", "popIndex", Integer.valueOf(i), "maxIndex", Integer.valueOf(i2));
        } else {
            f24142a.subList(i + 1, size).clear();
        }
    }

    private static int a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f12c98", new Object[]{new Integer(i), str})).intValue();
        }
        int i2 = -1;
        for (int size = f24142a.size() - 1; size >= 0; size--) {
            a aVar = f24142a.get(size);
            if (aVar != null && i == aVar.f24143a) {
                if (i2 < 0) {
                    i2 = size;
                }
                if (a(str, aVar.b)) {
                    return size;
                }
            }
        }
        return i2;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }
}
