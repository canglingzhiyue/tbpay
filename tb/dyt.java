package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dyt extends dyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1254231837);
    }

    public dyt(MotionEvent motionEvent) {
        super(motionEvent);
    }

    @Override // tb.dyu
    public float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue() : this.f27123a.getX(i);
    }

    @Override // tb.dyu
    public float b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2a", new Object[]{this, new Integer(i)})).floatValue() : this.f27123a.getY(i);
    }
}
