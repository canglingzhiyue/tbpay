package com.taobao.tao.flexbox.layoutmanager.component.bouncy;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import tb.abr;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class BouncyEdgeEffect extends EdgeEffect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean changeSizeToBlendMode;
    private int direction;
    private float flingSize;
    private float overscrollSize;
    private abr spring;
    private View view;

    static {
        kge.a(1057527138);
    }

    public static /* synthetic */ Object ipc$super(BouncyEdgeEffect bouncyEdgeEffect, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133570:
                return new Boolean(super.draw((Canvas) objArr[0]));
            case -545719157:
                super.onPull(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -384781584:
                super.onAbsorb(((Number) objArr[0]).intValue());
                return null;
            case 691263919:
                super.onRelease();
                return null;
            case 1644963285:
                super.onPull(((Number) objArr[0]).floatValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        super.onPull(f);
        onPullAnimation(f);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df78fc8b", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        super.onPull(f, f2);
        onPullAnimation(f);
    }

    public BouncyEdgeEffect(Context context, abr abrVar, View view, int i, float f, float f2) {
        super(context);
        this.spring = abrVar;
        this.view = view;
        this.direction = i;
        this.flingSize = f;
        this.overscrollSize = f2;
        this.changeSizeToBlendMode = Build.VERSION.SDK_INT >= 31 && oeb.at();
        if (this.changeSizeToBlendMode) {
            setBlendMode(BlendMode.DST);
        }
    }

    private void onPullAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e538f9", new Object[]{this, new Float(f)});
            return;
        }
        this.spring.b();
        int i = this.direction;
        if (i == 3) {
            float width = this.view.getWidth() * (-1) * f * this.overscrollSize;
            View view = this.view;
            view.setTranslationY(view.getTranslationY() + width);
        } else if (i == 1) {
            float abs = Math.abs(this.view.getWidth() * 1 * f * this.overscrollSize);
            View view2 = this.view;
            view2.setTranslationY(view2.getTranslationY() + abs);
        }
        int i2 = this.direction;
        if (i2 == 0) {
            float abs2 = Math.abs(this.view.getHeight() * 1 * f * this.overscrollSize);
            View view3 = this.view;
            view3.setTranslationX(view3.getTranslationX() + abs2);
        } else if (i2 != 2) {
        } else {
            float height = this.view.getHeight() * (-1) * f * this.overscrollSize;
            View view4 = this.view;
            view4.setTranslationX(view4.getTranslationX() + height);
        }
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2933d9af", new Object[]{this});
            return;
        }
        super.onRelease();
        this.spring.a();
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        float f;
        float f2;
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e910b2f0", new Object[]{this, new Integer(i)});
            return;
        }
        super.onAbsorb(i);
        View view = this.view;
        if ((view instanceof AbsTNodeScrollView) && (findTargetRecyclerView = ((AbsTNodeScrollView) view).findTargetRecyclerView(view)) != null && findTargetRecyclerView.canScrollVertically(-1)) {
            return;
        }
        int i2 = this.direction;
        if (i2 == 3 || i2 == 2) {
            f = i * (-1);
            f2 = this.flingSize;
        } else {
            f = i * 1;
            f2 = this.flingSize;
        }
        this.spring.a(f * f2).a();
    }

    @Override // android.widget.EdgeEffect
    public boolean draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cc013fe", new Object[]{this, canvas})).booleanValue();
        }
        if (!this.changeSizeToBlendMode) {
            setSize(0, 0);
        }
        return super.draw(canvas);
    }
}
