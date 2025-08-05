package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class tjd implements tje {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1547323478);
        kge.a(-1841757186);
    }

    @Override // tb.tje
    public boolean a(tiq tiqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe071cb", new Object[]{this, tiqVar, new Integer(i)})).booleanValue();
        }
        kej.a("FeedsRule", "FeedsRule verify start.");
        if (tjc.a()) {
            kej.a("FeedsRule", "chooseInteractImageInfo, continue, disableLinkedTexiuAd = true");
            return false;
        }
        kej.a("FeedsRule", "FeedsRule verify end. ret=true");
        return true;
    }
}
