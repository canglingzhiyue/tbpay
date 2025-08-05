package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iuo implements iur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-464193085);
        kge.a(-1272478943);
    }

    @Override // tb.iur
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    @Override // tb.iur
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        }
    }
}
