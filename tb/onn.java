package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class onn implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "navBar";

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f32212a = new ReentrantLock();
    private soy b;

    static {
        kge.a(-1471138853);
        kge.a(1842823874);
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("58ba28a4", new Object[]{this, context, eyxVar, eyyVar, dataEntryArr});
        }
        this.f32212a.lock();
        try {
            if (this.b == null) {
                this.b = new soy(context, eyxVar, eyyVar, dataEntryArr);
            }
            return this.b;
        } finally {
            this.f32212a.unlock();
        }
    }
}
