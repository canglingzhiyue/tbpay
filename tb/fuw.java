package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;

/* loaded from: classes.dex */
public class fuw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DinamicX";
    public static final String TAG_BASELINE = "DinamicX_Baseline";
    public static final String TAG_SCRIPT_EXPR = "DinamicX_ScriptExpr";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28135a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            Log.e("DinamicX", e(str));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            Log.e(TAG_SCRIPT_EXPR, e(str));
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            String e = e(strArr);
            if (StringUtils.isEmpty(str)) {
                Log.e("DinamicX", e);
            } else {
                Log.e(str, e);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            String b = b(objArr);
            if (StringUtils.isEmpty(str)) {
                Log.e("DinamicX", b);
            } else {
                Log.e(str, b);
            }
        }
    }

    public static void a(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a94d3c", new Object[]{str, th, strArr});
        } else if (!DinamicXEngine.j() && !f28135a) {
        } else {
            Log.e(str, e(strArr), th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            Log.e(str, str2, th);
        }
    }

    private static String e(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d79cb5cd", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static String b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b22414f8", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return JSON.toJSONString(objArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(JSON.toJSONString(obj));
            sb.append(" ");
        }
        return sb.toString();
    }

    static {
        kge.a(-275453678);
        f28135a = false;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            a("DinamicX", str);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            d("DinamicX", str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if ((!DinamicXEngine.j() && !f28135a) || StringUtils.isEmpty(str)) {
        } else {
            String str3 = "DinamicX_perform_" + str;
        }
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3fe96", new Object[]{strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            Log.e("DXAnimationProcess", e(strArr));
        }
    }

    public static void c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb58d75", new Object[]{strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void d(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b71c54", new Object[]{strArr});
        } else if (!f28135a && !DinamicXEngine.j()) {
        } else {
            e(strArr);
        }
    }

    public static void f(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba3a12", new Object[]{strArr});
        } else if (!bx.i()) {
        } else {
            Log.e("DinamicXRelease", e(strArr));
        }
    }

    public static void g(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbbc8f1", new Object[]{strArr});
        } else if (!bx.h()) {
        } else {
            Log.e("DinamicXConsume", e(strArr));
        }
    }

    public static void h(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bd57d0", new Object[]{strArr});
        } else if (!bx.m()) {
        } else {
            Log.e("DXEventChain", e(strArr));
        }
    }
}
