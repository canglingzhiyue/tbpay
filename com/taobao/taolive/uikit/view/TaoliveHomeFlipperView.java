package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.component.ViewFlipperExt;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoliveHomeFlipperView extends ViewFlipperExt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int interval;

    static {
        kge.a(595720049);
    }

    public static /* synthetic */ Object ipc$super(TaoliveHomeFlipperView taoliveHomeFlipperView, String str, Object... objArr) {
        if (str.hashCode() == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taolive.uikit.component.ViewFlipperExt
    public void pageChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cc9f9d", new Object[]{this, new Integer(i)});
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public TaoliveHomeFlipperView(Context context) {
        super(context);
        this.interval = 3000;
        init();
    }

    public TaoliveHomeFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interval = 3000;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(300L);
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
        setFlipInterval(this.interval);
        setAutoStart(true);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (getChildCount() > 0) {
            startFlipping();
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        stopFlipping();
        setVisibility(8);
    }

    private void setAccessibilityHidden(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d17a21f", new Object[]{this, view, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 16) {
            view.setContentDescription("");
        } else if (z) {
            view.setImportantForAccessibility(2);
        } else {
            view.setImportantForAccessibility(0);
        }
    }

    @Override // com.taobao.taolive.uikit.component.ViewFlipperExt, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 8 || i == 4) {
            stopFlipping();
        } else if (i != 0) {
        } else {
            startFlipping();
        }
    }
}
