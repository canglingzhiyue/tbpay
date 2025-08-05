package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.statplugin.MtopStatPlugin;
import com.taobao.mtop.wvplugin.MtopWVPlugin;

/* loaded from: classes.dex */
public class mte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        MtopWVPlugin.register();
        MtopStatPlugin.register();
    }
}
