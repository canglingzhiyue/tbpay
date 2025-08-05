package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mzl implements myq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<mzk> f31332a = new ThreadLocal<>();

    static {
        kge.a(-1830697181);
        kge.a(-370854312);
    }

    public myr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("16b9aaf7", new Object[]{this});
        }
        mzk mzkVar = this.f31332a.get();
        if (mzkVar != null) {
            return mzkVar.a();
        }
        return null;
    }
}
