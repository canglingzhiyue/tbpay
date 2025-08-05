package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MainCacheLoad = "hMainCacheLoad";
    public static final String MainDataParse = "hMainDataParse";
    public static final String MainRequest = "hMainRequest";
    public static final String OnCreaeView = "hOnCreateView";
    public static final String OnCreate = "hOnCreate";
    public static final String RmdCacheLoad = "hRmdCacheLoad";
    public static final String RmdDataParse = "hRmdDataParse";
    public static final String RmdRequest = "hRmdRequest";
    public static final String RmdViewHolderBindData = "rmdBindData";
    public static final String RmdViewHolderCreate = "rmdCreateView";
    public static final String SmallFileLoad = "hSmallCacheLoad";
    public static final String ViewHolderBindData = "hBindData";
    public static final String ViewHolderCreate = "hCreateView";

    static {
        kge.a(-2081665645);
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{str});
        } else {
            a("hNet", str);
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{str});
        } else {
            b("hNet", str);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a("hIO", str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b("hIO", str);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            a("hLifeCycle", str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            b("hLifeCycle", str);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            a("hRender", str);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            b("hRender", str);
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            a("hPreRender", str);
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{str});
        } else {
            b("hPreRender", str);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
        } else {
            a("hDataParse", str);
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
        } else {
            b("hDataParse", str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        ldf.d("LauncherTracker", "traceStartInner groupName:" + str + ",pointName:" + str2 + ",timestamp:" + SystemClock.uptimeMillis());
        gvj.a(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        gvt.a(sb.toString());
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        ldf.d("LauncherTracker", "traceEndInner groupName:" + str + ",pointName:" + str2 + ",timestamp:" + SystemClock.uptimeMillis());
        gvj.b(str, str2);
        gvt.a();
    }
}
