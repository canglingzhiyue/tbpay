package android.taobao.windvane.webview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1257768870);
    }

    public void onCoreSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc4fa79", new Object[]{this});
        }
    }

    public void onUCCorePrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
        }
    }
}
