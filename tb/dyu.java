package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MotionEvent f27123a;

    static {
        kge.a(-1788384689);
    }

    public dyu(MotionEvent motionEvent) {
        this.f27123a = motionEvent;
    }

    public static dyu a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyu) ipChange.ipc$dispatch("4f054e9", new Object[]{motionEvent});
        }
        try {
            return new dyt(motionEvent);
        } catch (VerifyError unused) {
            return new dyu(motionEvent);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f27123a.getAction();
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.f27123a.getX();
    }

    public float a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue();
        }
        c(i);
        return b();
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.f27123a.getY();
    }

    public float b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2a", new Object[]{this, new Integer(i)})).floatValue();
        }
        c(i);
        return c();
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            throw new IllegalArgumentException("Invalid pointer index for Donut/Cupcake");
        }
    }
}
