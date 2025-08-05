package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jzr extends jzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f29900a.b("aliveActivityCount", i);
        }
    }
}
