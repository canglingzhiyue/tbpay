package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.b;

/* loaded from: classes8.dex */
public class oui extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBShareContent c;

    static {
        kge.a(-602146437);
    }

    public void a(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4f7f05", new Object[]{this, tBShareContent});
        } else {
            this.c = tBShareContent;
        }
    }
}
