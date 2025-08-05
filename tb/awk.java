package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class awk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_EVENT_UPDATE = "AURARaxBridge.updateData";

    static {
        kge.a(1541721363);
    }

    public static void a(WVUCWebView wVUCWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d8295d", new Object[]{wVUCWebView, str, str2});
        } else if (wVUCWebView != null) {
            WVStandardEventCenter.postNotificationToJS(wVUCWebView, str, str2);
        } else {
            WVStandardEventCenter.postNotificationToJS(str, str2);
        }
    }
}
