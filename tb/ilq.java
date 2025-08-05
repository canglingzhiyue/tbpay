package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;

/* loaded from: classes6.dex */
public class ilq extends ilj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(952911757);
    }

    @Override // tb.ilj
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else if (ilv.a()) {
        } else {
            a(new a.C0567a().b(8).a());
        }
    }
}
