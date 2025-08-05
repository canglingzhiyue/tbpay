package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iug implements iur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f29319a;
    private final int b;

    static {
        kge.a(2130601708);
        kge.a(-1272478943);
    }

    public iug(ViewGroup viewGroup, int i) {
        this.f29319a = viewGroup;
        this.b = i;
    }

    public iug(ViewGroup viewGroup) {
        this.f29319a = viewGroup;
        this.b = -1;
    }

    @Override // tb.iur
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        int i = this.b;
        if (i < 0) {
            this.f29319a.addView(view);
        } else {
            this.f29319a.addView(view, i);
        }
    }

    @Override // tb.iur
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.f29319a.removeView(view);
        }
    }
}
