package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.modules.CBModudle;
import com.taobao.weex.WXSDKEngine;

/* loaded from: classes8.dex */
public class ods {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-583995324);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("contentAddCart", CBModudle.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
