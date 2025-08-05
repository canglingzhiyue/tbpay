package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.b;

/* loaded from: classes4.dex */
public abstract class dsr implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(832426098);
        kge.a(-615595645);
    }

    @Override // com.taobao.android.buy.internal.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.buy.internal.b
    public dsw a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsw) ipChange.ipc$dispatch("2d45ec4", new Object[]{this, activity}) : new dsw(activity);
    }
}
