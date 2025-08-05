package com.taobao.android.fluid.framework.card.cards.video.manager.playhint;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOADING_COLOR = -1;

    /* renamed from: a  reason: collision with root package name */
    private AnimatorSet f12514a;
    private boolean b;

    static {
        kge.a(1447768967);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.b = false;
            view.setVisibility(0);
            if (this.f12514a == null) {
                this.f12514a = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.7f, 0.0f);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                this.f12514a.playTogether(ofFloat, ofFloat2);
                this.f12514a.setDuration(650L);
            }
            this.f12514a.start();
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || this.b) {
        } else {
            this.b = true;
            view.setVisibility(8);
            AnimatorSet animatorSet = this.f12514a;
            if (animatorSet == null) {
                return;
            }
            animatorSet.cancel();
        }
    }
}
