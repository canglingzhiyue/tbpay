package tb;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class blq extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public blp n = blp.mDefaultAdjuster;
    public a o;

    /* loaded from: classes2.dex */
    public interface a {
        ViewPropertyAnimator a(View view);

        ViewPropertyAnimator b(View view);
    }

    static {
        kge.a(1790354348);
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void a(blp blpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f5afb2", new Object[]{this, blpVar});
        } else {
            this.n = blpVar;
        }
    }
}
