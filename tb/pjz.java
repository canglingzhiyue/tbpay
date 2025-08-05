package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.single.a;

/* loaded from: classes8.dex */
public class pjz implements pjn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f32709a;

    static {
        kge.a(-1337809657);
        kge.a(1868003579);
    }

    public pjz(a aVar) {
        this.f32709a = aVar;
    }

    @Override // tb.pjn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.f32709a;
        if (aVar == null) {
            return;
        }
        aVar.retryVideo();
    }
}
