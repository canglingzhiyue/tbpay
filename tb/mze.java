package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mze extends mzd<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(929789087);
    }

    public mze(String str) {
        super(str);
    }

    public void a(myr myrVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28235c65", new Object[]{this, myrVar, num});
        } else {
            myrVar.a(this.f31330a, num);
        }
    }
}
