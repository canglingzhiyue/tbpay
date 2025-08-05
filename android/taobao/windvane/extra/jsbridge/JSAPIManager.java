package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import tb.kge;

/* loaded from: classes2.dex */
public class JSAPIManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final JSAPIManager INSTANCE;
    private static boolean sInitialized;

    static {
        kge.a(-1901203402);
        INSTANCE = new JSAPIManager();
        sInitialized = false;
    }

    public static JSAPIManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSAPIManager) ipChange.ipc$dispatch("29837bcd", new Object[0]) : INSTANCE;
    }

    private JSAPIManager() {
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        synchronized (JSAPIManager.class) {
            if (sInitialized) {
                return;
            }
            sInitialized = true;
            e.a(RVLLevel.Info, "WindVane/JSBridge").a("register").a();
            q.a(PayPasswrdValidateBridge.PLUGIN_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) PayPasswrdValidateBridge.class, true);
            q.a("triver-widget", (Class<? extends android.taobao.windvane.jsbridge.e>) Class.forName("com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin"));
            q.a("WVDevelopTool", (Class<? extends android.taobao.windvane.jsbridge.e>) WVDevelopTool.class);
        }
    }
}
