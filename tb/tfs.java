package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class tfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1199057617);
    }

    public static ValueAnimator a(aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("44e459b4", new Object[]{aaVar}) : (aaVar == null || aaVar.b() == null) ? ValueAnimator.ofFloat(0.0f, 1.0f) : aaVar.b().d();
    }
}
