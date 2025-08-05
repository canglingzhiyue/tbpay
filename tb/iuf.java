package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class iuf<VIEW, PRESENTER> implements iuj<VIEW, PRESENTER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PRESENTER f29318a;
    private imn b;
    public Activity f;

    static {
        kge.a(843771834);
        kge.a(1621305585);
    }

    @Override // tb.iuj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.iuj
    public void a(PRESENTER presenter, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd07d4aa", new Object[]{this, presenter, imnVar});
            return;
        }
        this.f29318a = presenter;
        this.b = imnVar;
    }

    public final imn p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("826eb725", new Object[]{this}) : this.b;
    }

    public final PRESENTER q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PRESENTER) ipChange.ipc$dispatch("258fb1ba", new Object[]{this}) : this.f29318a;
    }

    @Override // tb.iuj
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.f = activity;
        }
    }
}
