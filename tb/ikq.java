package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ikq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RemoteSo";

    /* renamed from: a  reason: collision with root package name */
    private static final a f29128a;
    private static volatile ikn b;

    static {
        a aVar = new a("RemoteSo");
        f29128a = aVar;
        b = aVar;
    }

    public static ikn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ikn) ipChange.ipc$dispatch("f05ff12", new Object[0]) : b;
    }

    public static void a(ikn iknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd89bcc", new Object[]{iknVar});
        } else {
            b = iknVar;
        }
    }

    public static void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            b.a(str, map);
        }
    }

    public static void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else {
            b.b(str, map);
        }
    }

    public static void a(String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3556ef2", new Object[]{str, map, rSoException});
        } else {
            b.a(str, map, rSoException);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        ikn iknVar = b;
        HashMap hashMap = new HashMap();
        hashMap.put("RSoErrorCode", str);
        if (ikw.a((CharSequence) str2)) {
            str2 = "";
        }
        hashMap.put("RSoErrorMsg", str2);
        iknVar.a(ikn.POINT_SDK_INTERNAL_ERROR, hashMap);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a(str, "", th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        ikn iknVar = b;
        HashMap hashMap = new HashMap();
        hashMap.put("RSoErrorCode", str);
        hashMap.put("RSoErrorMsg", str2 + " : " + a(th));
        iknVar.a(ikn.POINT_SDK_INTERNAL_ERROR, hashMap);
    }

    public static void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{str, runnable});
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            a(str, th);
        }
    }

    private static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        if (th == null) {
            return "null Throwable";
        }
        try {
            String th2 = th.toString();
            return TextUtils.isEmpty(th2) ? "empty detail error msg" : th2.substring(0, Math.min(th2.length(), 400));
        } catch (Throwable th3) {
            return "parseErrorMsg, error," + th3.getClass();
        }
    }
}
