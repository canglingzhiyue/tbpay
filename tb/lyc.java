package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public final class lyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f30982a;

    public static /* synthetic */ Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : f30982a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f30982a = context;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static lyh f30983a;
        private static String b;

        public static synchronized lyh a() {
            synchronized (a.class) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (lyh) ipChange.ipc$dispatch("f079003", new Object[0]);
                }
                if (f30983a == null) {
                    f30983a = new lyh(lyc.a(), b);
                }
                return f30983a;
            }
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            f30983a = null;
            b = str;
        }

        public static String b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : a().a(str);
        }

        public static Map<String, String> a(Activity activity, Uri uri) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("81090242", new Object[]{activity, uri}) : a().a(activity, uri);
        }

        public static Map<String, String> a(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f0860cca", new Object[]{str, uri}) : a().a(str, uri);
        }
    }
}
