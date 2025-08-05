package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.c;
import com.taobao.android.pissarro.external.Config;

/* loaded from: classes6.dex */
public class ich {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1093852491);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Config b = c.a().b();
        return b.isEnableClip() || b.isEnableMosaic() || b.isEnableGraffiti();
    }
}
