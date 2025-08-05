package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jzu extends jzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f29900a.b("mobileModel", str);
        }
    }
}
