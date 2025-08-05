package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class klk implements kle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.kle
    public kln a(kmq kmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kln) ipChange.ipc$dispatch("ab64d3b0", new Object[]{this, kmqVar}) : 1 == kmqVar.i ? new klt() : new klu();
    }
}
