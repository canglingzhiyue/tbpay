package tb;

import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class adf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25264a;
    private static String b;

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f25264a;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b;
    }

    static {
        kge.a(581866624);
        f25264a = false;
        b = null;
        aem.a().a(new a(), aem.c);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f25264a = true;
            b = str;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f25264a = false;
        b = null;
    }

    /* loaded from: classes2.dex */
    public static class a extends aen {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(866519146);
        }

        @Override // tb.aen
        public void a(IWVWebView iWVWebView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d01caed6", new Object[]{this, iWVWebView, str});
            } else if (!adf.b() || StringUtils.isEmpty(adf.c()) || !(iWVWebView instanceof IWVWebView)) {
            } else {
                iWVWebView.evaluateJavascript(adf.c());
            }
        }
    }
}
