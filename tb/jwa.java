package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public jvy h;

    static {
        kge.a(676101297);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        jvy jvyVar = this.h;
        return jvyVar != null && jvyVar.b();
    }
}
