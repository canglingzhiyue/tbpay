package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fjf implements fmk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(352432949);
        kge.a(-1178463578);
    }

    public void a(fmh fmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d386b7", new Object[]{this, fmhVar});
        } else if (fmhVar == null) {
        } else {
            fmhVar.a(this);
        }
    }
}
