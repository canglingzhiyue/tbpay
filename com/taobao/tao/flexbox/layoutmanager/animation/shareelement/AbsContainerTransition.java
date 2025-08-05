package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.transition.Transition;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class AbsContainerTransition extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public int fadeMode = 0;
    public f pageInterface;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface FadeMode {
    }

    static {
        kge.a(2137830242);
    }

    public void setPageInterface(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4354b00f", new Object[]{this, fVar});
        } else {
            this.pageInterface = fVar;
        }
    }

    public void setFadeMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c925cb3b", new Object[]{this, new Integer(i)});
        } else {
            this.fadeMode = i;
        }
    }
}
