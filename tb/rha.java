package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.b;

/* loaded from: classes5.dex */
public class rha {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator b;
    private float d;
    private int c = 300;
    private float e = 1.0f;

    static {
        kge.a(360400990);
    }

    public rha(psw pswVar) {
        this.d = 0.1f;
        try {
            this.d = pswVar.D().i().slideUpTransparency / 100.0f;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.b = new ValueAnimator();
        this.b.setDuration(this.c);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        float f = z ? this.d : 1.0f;
        if (b.a(this.e, f) == 0) {
            return;
        }
        if (this.b.isStarted()) {
            this.b.end();
        }
        this.b.setFloatValues(this.e, f);
        this.e = f;
        this.b.start();
    }

    public void a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5054e9c", new Object[]{this, animatorUpdateListener});
        } else {
            this.b.addUpdateListener(animatorUpdateListener);
        }
    }
}
