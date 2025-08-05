package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fmk f28063a;

    public void a(fmk fmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d4e3d4", new Object[]{this, fmkVar});
        } else {
            this.f28063a = fmkVar;
        }
    }
}
