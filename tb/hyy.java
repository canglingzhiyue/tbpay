package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.holder.a;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class hyy extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View c;
    private RotateAnimation d;

    static {
        kge.a(294548394);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    public hyy(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.widget.holder.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        this.c = LayoutInflater.from(this.b).inflate(R.layout.layout_order_loading, this.f14605a, true);
        this.d = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.d.setDuration(1000L);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.setRepeatCount(-1);
        return this.c;
    }

    public void d() {
        RotateAnimation rotateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null || (rotateAnimation = this.d) == null) {
            return;
        }
        view.startAnimation(rotateAnimation);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null || this.d == null) {
            return;
        }
        view.clearAnimation();
    }
}
