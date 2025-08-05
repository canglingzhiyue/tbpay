package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.register.b;

/* loaded from: classes9.dex */
public abstract class qpb extends qpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qpa f33007a;

    static {
        kge.a(-1840051338);
    }

    public qpb(b bVar) {
        super(bVar);
    }

    public qpb a(qpb qpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpb) ipChange.ipc$dispatch("a028394e", new Object[]{this, qpbVar});
        }
        this.f33007a = qpbVar;
        return qpbVar;
    }
}
