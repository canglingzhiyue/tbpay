package tb;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import tb.cox;

/* loaded from: classes3.dex */
public class coy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static cox.a f26366a;
    private static boolean b;

    public static /* synthetic */ cox.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cox.a) ipChange.ipc$dispatch("5b820e35", new Object[0]) : f26366a;
    }

    public static /* synthetic */ String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{strArr}) : e(strArr);
    }

    public static /* synthetic */ void b(String str, String str2, int i, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1d0d39", new Object[]{str, str2, new Integer(i), strArr});
        } else {
            c(str, str2, i, strArr);
        }
    }

    public static /* synthetic */ String[] b(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("7e5598e5", new Object[]{strArr}) : d(strArr);
    }

    static {
        kge.a(488197501);
        f26366a = new a();
        b = false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else {
            f26366a.a(str, strArr);
        }
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{str, str2, strArr});
        } else {
            a(str, str2, 2101, strArr);
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            f26366a.a(str, str2, map);
        }
    }

    public static void a(final String str, final String str2, final int i, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9077b79e", new Object[]{str, str2, new Integer(i), map});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: tb.coy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        coy.a().a(str, str2, i, map);
                    }
                }
            });
        } else {
            f26366a.a(str, str2, i, map);
        }
    }

    public static void a(final String str, final String str2, final int i, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a76cb8", new Object[]{str, str2, new Integer(i), strArr});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: tb.coy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        coy.b(str, str2, i, strArr);
                    }
                }
            });
        } else {
            c(str, str2, i, strArr);
        }
    }

    private static void c(String str, String str2, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a892adba", new Object[]{str, str2, new Integer(i), strArr});
            return;
        }
        ArrayMap arrayMap = null;
        if (strArr != null && strArr.length > 0) {
            if (strArr.length % 2 != 0) {
                cot.b("UTAdapter", "clickEventArgsError " + str2);
                return;
            }
            arrayMap = new ArrayMap();
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                arrayMap.put(strArr[i2], strArr[i2 + 1]);
            }
        }
        f26366a.a(str, str2, i, arrayMap);
    }

    public static void b(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49523982", new Object[]{str, str2, strArr});
        } else {
            f26366a.b(str, str2, strArr);
        }
    }

    public static void c(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5604e1", new Object[]{str, str2, strArr});
        } else {
            f26366a.a(str, str2, strArr);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else {
            f26366a.b(str, str2, map);
        }
    }

    /* loaded from: classes3.dex */
    public static class a implements cox.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(143426405);
            kge.a(991469290);
        }

        @Override // tb.cox.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9371b55e", new Object[]{this, str, str2, list, list2});
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
            }
        }

        private a() {
        }

        @Override // tb.cox.a
        public void a(Context context, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }

        @Override // tb.cox.a
        public void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
            }
        }

        @Override // tb.cox.a
        public void a(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
            } else {
                TBS.Adv.ctrlClicked(CT.Button, str, coy.a(strArr));
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str + "_" + str2, "", "", map).build());
        }

        @Override // tb.cox.a
        public void a(String str, String str2, int i, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9077b79e", new Object[]{this, str, str2, new Integer(i), map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            Map<String, String> map2 = map;
            if (!map2.containsKey("rainbow")) {
                map2.put("rainbow", URLEncoder.encode(com.taobao.search.rainbow.a.c()));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str + "_" + str2, "", "", map2).build());
        }

        @Override // tb.cox.a
        public void b(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49523982", new Object[]{this, str, str2, strArr});
            } else {
                TBS.Adv.ctrlClicked(str, CT.Button, str2, coy.a(strArr));
            }
        }

        @Override // tb.cox.a
        public void a(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
                return;
            }
            String[] b = coy.b(strArr);
            ArrayMap arrayMap = new ArrayMap();
            if (b != null && b.length % 2 == 0) {
                String str3 = null;
                for (String str4 : b) {
                    if (str3 == null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        str3 = str4;
                    } else {
                        arrayMap.put(str3, str4);
                        str3 = null;
                    }
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, "", "", arrayMap).build());
        }

        @Override // tb.cox.a
        public void b(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
                return;
            }
            ArrayMap arrayMap = new ArrayMap();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    arrayMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, "", "", arrayMap).build());
        }
    }

    private static boolean c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb58d79", new Object[]{strArr})).booleanValue();
        }
        if (strArr != null && strArr.length != 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] != null && strArr[i].contains("rainbow")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String[] d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8d200323", new Object[]{strArr});
        }
        if (!c(strArr)) {
            if (strArr == null) {
                strArr = new String[2];
            } else {
                String[] strArr2 = new String[strArr.length + 2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 2] = "rainbow";
                strArr[strArr.length - 1] = URLEncoder.encode(com.taobao.search.rainbow.a.c());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    private static String[] e(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("94853842", new Object[]{strArr});
        }
        if (!c(strArr)) {
            if (strArr == null) {
                strArr = new String[1];
            } else {
                String[] strArr2 = new String[strArr.length + 1];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 1] = "rainbow=" + URLEncoder.encode(com.taobao.search.rainbow.a.c());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }
}
