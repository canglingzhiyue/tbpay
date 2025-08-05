package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ixh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ixh f29394a;
    private LocalBroadcastManager b;

    static {
        kge.a(-990424964);
    }

    public static ixh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixh) ipChange.ipc$dispatch("f062f25", new Object[0]);
        }
        if (f29394a == null) {
            f29394a = new ixh();
        }
        return f29394a;
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        LocalBroadcastManager localBroadcastManager = this.b;
        if (localBroadcastManager == null) {
            return;
        }
        localBroadcastManager.sendBroadcast(intent);
    }
}
