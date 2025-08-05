package android.taobao.windvane.jsbridge;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class k implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1620591280);
        kge.a(1879738087);
    }

    public boolean a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f36f010", new Object[]{this, iWVWebView})).booleanValue();
        }
        return false;
    }
}
