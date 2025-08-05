package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mzh extends mzd<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(913145301);
    }

    public mzh(String str) {
        super(str);
    }

    public void a(myr myrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d066721c", new Object[]{this, myrVar, str});
        } else {
            myrVar.a(this.f31330a, str);
        }
    }
}
