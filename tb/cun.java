package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;

/* loaded from: classes4.dex */
public class cun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FBV2_TAG = "fb_v2_";

    /* renamed from: a  reason: collision with root package name */
    public static a f26541a;

    /* loaded from: classes4.dex */
    public interface a {
        void d(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2, Throwable th);
    }

    public static void a(Object obj, String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
        } else if (obj != null) {
        } else {
            a(null, str, null);
            throw new RuntimeException(str);
        }
    }

    public static void a(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(null, str, null);
            throw new RuntimeException(str);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        a aVar = f26541a;
        if (aVar != null) {
            aVar.e(FBV2_TAG + str, b(str2, th), th);
            return;
        }
        Log.e(FBV2_TAG + str, b(str2, th), th);
    }

    public static void a(Throwable th, String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9531d917", new Object[]{th, str});
        } else {
            a(null, str, th);
            throw new RuntimeException(str, th);
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aad143f", new Object[]{aVar});
        } else {
            f26541a = aVar;
        }
    }

    public static String b(String str, Throwable th) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b817007e", new Object[]{str, th});
        }
        String str3 = "";
        if (str == null) {
            str2 = str3;
        } else {
            str2 = " " + str;
        }
        if (th != null) {
            str3 = " " + th.getMessage();
        }
        return str2 + str3;
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
            return;
        }
        a aVar = f26541a;
        if (aVar != null) {
            aVar.i(FBV2_TAG + str, b(str2, th), th);
            return;
        }
        String str3 = FBV2_TAG + str;
        b(str2, th);
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{str, str2, th});
        } else if (!AppContextHolder.b) {
        } else {
            a aVar = f26541a;
            if (aVar != null) {
                aVar.d(FBV2_TAG + str, b(str2, th), th);
                return;
            }
            String str3 = FBV2_TAG + str;
            b(str2, th);
        }
    }

    public static void a(Throwable th) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else {
            a(null, "rethrowRuntimeError", th);
            throw new RuntimeException(th);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, null);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            b(str, str2, null);
        }
    }

    @Deprecated
    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a(null, str, null);
        }
    }

    @Deprecated
    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            b(null, str, null);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    @Deprecated
    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            a(null, str, th);
        }
    }
}
