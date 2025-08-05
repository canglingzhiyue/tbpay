package tb;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Method b;
    private static final int[] c = {TrtcConstants.TRTC_ERROR_CODE_USER_HAS_JOINED};
    private static final int d = Process.myPid();

    /* renamed from: a  reason: collision with root package name */
    private static final File f29543a = new File("/proc/" + Process.myPid() + "/task/");

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f29544a;
        private final String b;

        public a(int i, String str) {
            this.b = str;
            this.f29544a = i;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }
    }

    static {
        try {
            Method method = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            b = method;
            method.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            List<a> b2 = b();
            HashMap hashMap = new HashMap();
            for (a aVar : b2) {
                String b3 = b(aVar.a());
                Integer num = (Integer) hashMap.get(b3);
                if (num == null) {
                    hashMap.put(b3, 1);
                } else {
                    hashMap.put(b3, Integer.valueOf(num.intValue() + 1));
                }
            }
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, $$Lambda$jgs$aXgv6TREH9fvMljTVzJARHzuHZc.INSTANCE);
            return arrayList.toString();
        } catch (Throwable th) {
            jfj.b(th);
            return "exception";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Map.Entry entry, Map.Entry entry2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f17356bb", new Object[]{entry, entry2})).intValue() : ((Integer) entry2.getValue()).compareTo((Integer) entry.getValue());
    }

    private static List<a> b() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (f29543a.isDirectory() && (list = f29543a.list()) != null) {
                for (String str : list) {
                    int a2 = a(str);
                    String str2 = "";
                    if (a2 != -1) {
                        str2 = a(a(a2), b(a2));
                    }
                    arrayList.add(new a(a2, str2));
                }
            }
        } catch (Exception e) {
            jfj.b(e);
        }
        return arrayList;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        int lastIndexOf = str.lastIndexOf("\\.");
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return Integer.valueOf(str).intValue();
    }

    private static String a(int i) {
        String[] strArr = new String[1];
        try {
            b.invoke(null, "/proc/" + d + "/task/" + i + "/comm", c, strArr, null, null);
        } catch (Exception e) {
            jfj.b(e);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str.trim());
            }
        }
        return sb.toString();
    }

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        try {
            String a2 = jgl.a(new File("/proc/" + d + "/task/" + i + "/comm"));
            return a2 != null ? a2.trim() : "";
        } catch (Throwable th) {
            jfj.b(th);
            return "";
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : str.length() > str2.length() ? str : str2;
    }

    private static String b(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        if (str.toLowerCase().contains("binder:")) {
            return "binder:x";
        }
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            if (c2 < '0' || c2 > '9') {
                sb.append(c2);
                z = false;
            } else {
                if (!z) {
                    sb.append("x");
                }
                z = true;
            }
        }
        return sb.toString();
    }
}
