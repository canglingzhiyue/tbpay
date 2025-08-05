package android.taobao.windvane.jsbridge;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class m extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile m f1668a;

    static {
        kge.a(604369168);
    }

    @Override // android.taobao.windvane.jsbridge.j
    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (android.taobao.windvane.config.t.a().a(str, str2, str3)) {
            return true;
        }
        android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_URL_CONFIG_JS_API_TYPE, 1, str2 + "." + str3, str);
        return false;
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("50a3b329", new Object[0]);
        }
        if (f1668a == null) {
            synchronized (m.class) {
                if (f1668a == null) {
                    f1668a = new m();
                }
            }
        }
        return f1668a;
    }

    @Override // android.taobao.windvane.jsbridge.k
    public boolean a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f36f010", new Object[]{this, iWVWebView})).booleanValue();
        }
        if (android.taobao.windvane.config.j.commonConfig.ac && (iWVWebView instanceof android.taobao.windvane.webview.g)) {
            android.taobao.windvane.webview.g gVar = (android.taobao.windvane.webview.g) iWVWebView;
            if (gVar.canUseGlobalUrlConfig() || gVar.canUseUrlConfig()) {
                return true;
            }
        }
        return false;
    }
}
