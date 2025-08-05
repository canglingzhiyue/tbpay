package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import tb.hgv;
import tb.hgw;
import tb.hhz;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class GoodsBaseView<T extends hgv> extends GoodsBaseTempView implements hgw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int TRANSLATE_DURATION = 250;
    public hhz insidePrefetchHelper;
    public ViewGroup mContentView;
    public T mPresenter;
    public boolean mbPopFromRight;

    static {
        kge.a(1488365399);
        kge.a(-1367436876);
    }

    /* renamed from: initInjector */
    public abstract T mo967initInjector();

    public abstract View onCreateContentView();

    public GoodsBaseView(c cVar, boolean z) {
        super(cVar);
        this.mbPopFromRight = z;
        this.insidePrefetchHelper = new hhz(cVar);
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mContentView = (ViewGroup) onCreateContentView();
        if (this.mContentView == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (this.mGoodLiveContext.f() instanceof Activity) {
            ((Activity) this.mGoodLiveContext.f()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = this.mGoodLiveContext.f().getResources().getDisplayMetrics();
        }
        this.mContentView.setLayoutParams(onCreateLayoutParams(this.mContentView, displayMetrics));
        this.mPresenter = mo967initInjector();
        attachView();
        addView(this.mContentView, new FrameLayout.LayoutParams(-1, -1));
    }

    public FrameLayout.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("46bd761c", new Object[]{this, view, displayMetrics});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (this.mbPopFromRight) {
            layoutParams.gravity = 53;
            layoutParams.width = displayMetrics.heightPixels;
            layoutParams.height = displayMetrics.heightPixels;
        } else {
            layoutParams.gravity = 85;
            layoutParams.width = this.mGoodLiveContext.c.s;
        }
        return layoutParams;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        T t = this.mPresenter;
        if (t != null) {
            t.a();
        }
        hhz hhzVar = this.insidePrefetchHelper;
        if (hhzVar == null) {
            return;
        }
        hhzVar.a();
    }

    public void attachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed22211", new Object[]{this});
            return;
        }
        T t = this.mPresenter;
        if (t == null) {
            return;
        }
        t.a(this);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.mContentView;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    public void preFetchInsideDetailData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28378bf", new Object[]{this, str});
            return;
        }
        hhz hhzVar = this.insidePrefetchHelper;
        if (hhzVar == null) {
            return;
        }
        hhzVar.a(str);
    }

    public Animation createTranslationInAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation createTranslationOutAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }
}
