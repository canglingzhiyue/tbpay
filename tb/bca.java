package tb;

import com.alibaba.android.ultron.trade.event.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class bca extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bbz f25791a;
    public bcb b;

    static {
        kge.a(-244958808);
    }

    public static /* synthetic */ Object ipc$super(bca bcaVar, String str, Object... objArr) {
        if (str.hashCode() == -502770967) {
            super.a((bmz) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d, tb.bmy
    public void a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
            return;
        }
        this.f25791a = (bbz) bmzVar.d();
        this.b = this.f25791a.n();
        super.a(bmzVar);
    }
}
