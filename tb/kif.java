package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;

/* loaded from: classes.dex */
public class kif {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_REQUEST = "MtopRequest";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30097a;

    static {
        kge.a(-2083243618);
        f30097a = false;
        try {
            f30097a = new File("/data/local/tmp/", "tao_widget_log_open").exists();
        } catch (Exception e) {
            Log.e("enableLog", e.getMessage());
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        if (f30097a) {
            Log.e("WidgetDynamic", str);
        }
        a.a("WidgetTLog", str);
    }

    public static void a(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791f065f", new Object[]{cls, str});
            return;
        }
        if (f30097a) {
            Log.e("WidgetDynamic", cls.getSimpleName() + ado.URL_SEPARATOR + str);
        }
        a.a("WidgetTLog", str);
    }

    public static void b(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03cf73e", new Object[]{cls, str});
            return;
        }
        if (f30097a) {
            String str2 = cls.getSimpleName() + ado.URL_SEPARATOR + str;
        }
        a.b("WidgetTLog", str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a.b("WidgetTLog", str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (f30097a) {
            Log.e(str, str2);
        }
        a.a("WidgetTLog", str2);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(346569142);
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                AdapterForTLog.loge("WidgetTLog", str);
            }
        }

        public static void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            } else {
                AdapterForTLog.loge(str, str2);
            }
        }

        public static void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            } else {
                AdapterForTLog.logd(str, str2);
            }
        }
    }
}
