package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.b;
import com.taobao.android.litecreator.sdk.framework.container.c;
import com.taobao.android.litecreator.sdk.framework.container.h;

/* loaded from: classes5.dex */
public class hdw implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1235731868);
        kge.a(2039524422);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.c
    public h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("dc1e4563", new Object[]{this, str});
        }
        char c = 65535;
        if (str.hashCode() == -1537172800 && str.equals("EmptyPlugin")) {
            c = 0;
        }
        if (c == 0) {
            return new b();
        }
        return null;
    }
}
