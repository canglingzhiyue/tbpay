package tb;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class cox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26364a;
    private static boolean b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, String str);

        void a(Context context, Map<String, String> map);

        void a(String str, String str2);

        void a(String str, String str2, int i, Map<String, String> map);

        void a(String str, String str2, String str3, String str4);

        void a(String str, String str2, List<String> list);

        void a(String str, String str2, List<String> list, List<String> list2);

        void a(String str, String str2, Map<String, String> map);

        void a(String str, String str2, Map<String, Double> map, Map<String, String> map2);

        void a(String str, String str2, String... strArr);

        void a(String str, String... strArr);

        void b(String str, String str2, Map<String, Object> map);

        void b(String str, String str2, String... strArr);
    }

    public static /* synthetic */ void b(String str, String str2, int i, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1d0d39", new Object[]{str, str2, new Integer(i), strArr});
        } else {
            c(str, str2, i, strArr);
        }
    }

    static {
        kge.a(1251903265);
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

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5826ef", new Object[]{aVar});
        } else {
            f26364a = aVar;
        }
    }

    public static void a(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(context, map);
    }

    public static void a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579fc4bf", new Object[]{context, strArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (strArr != null && strArr.length > 0 && strArr.length % 2 == 0) {
            int length = strArr.length;
            for (int i = 0; i < length; i += 2) {
                hashMap.put(strArr[i], strArr[i + 1]);
            }
        }
        a(context, hashMap);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(context, str);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        String[] a2 = a(strArr);
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, a2);
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
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, 2101, map);
    }

    public static void a(final String str, final String str2, final int i, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a76cb8", new Object[]{str, str2, new Integer(i), strArr});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new Runnable() { // from class: tb.cox.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        cox.b(str, str2, i, strArr);
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
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, i, arrayMap);
    }

    public static void b(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49523982", new Object[]{str, str2, strArr});
            return;
        }
        String[] a2 = a(strArr);
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.b(str, str2, a2);
    }

    public static void c(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5604e1", new Object[]{str, str2, strArr});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, strArr);
    }

    private static String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{strArr});
        }
        if (strArr.length % 2 != 0) {
            cot.a("UTAdapter", "event not paired", new IllegalArgumentException(Arrays.toString(strArr)));
        }
        String[] strArr2 = new String[strArr.length / 2];
        for (int i = 0; i < strArr.length / 2; i++) {
            int i2 = i << 1;
            String str = strArr[i2 + 1];
            if (str == null) {
                str = "";
            }
            strArr2[i] = strArr[i2] + "=" + str;
        }
        return strArr2;
    }

    public static void d(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5559d040", new Object[]{str, str2, strArr});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.b(str, str2, strArr);
    }

    public static void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{str, str2, map, map2});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, map, map2);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, str3, str4);
    }

    public static void a(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{str, str2, list});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, list);
    }

    public static void a(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9371b55e", new Object[]{str, str2, list, list2});
            return;
        }
        a aVar = f26364a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, list, list2);
    }
}
