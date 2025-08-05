package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mzg extends mzd<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1444843146);
    }

    public mzg(String str) {
        super(str);
    }

    public void a(myr myrVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b6d11", new Object[]{this, myrVar, l});
        } else {
            myrVar.a(this.f31330a, l);
        }
    }
}
