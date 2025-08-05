package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.u;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class onm implements eyp<eze> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "headerPic";

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f32211a = new ReentrantLock();
    private u b;

    static {
        kge.a(-1139492194);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d<eze> a(Context context, eyx eyxVar, eze ezeVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("388cfef9", new Object[]{this, context, eyxVar, ezeVar, dataEntryArr});
        }
        this.f32211a.lock();
        try {
            if (this.b == null) {
                this.b = new u(context, eyxVar, ezeVar, dataEntryArr);
            }
            return this.b;
        } finally {
            this.f32211a.unlock();
        }
    }
}
