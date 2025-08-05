package com.taobao.uikit.feature.features;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.AdapterCallback;
import com.taobao.uikit.feature.features.cellanimator.CellAnimatorAdapter;
import com.taobao.uikit.feature.features.cellanimator.CellAnimatorController;
import tb.kge;

/* loaded from: classes9.dex */
public class CellAnimatorFeature extends AbsFeature<ListView> implements AdapterCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimatorAdapter mAnimatorAdapter;
    private CustomAnimatorFactory mCustomAnimatorFactory;
    private int mInitialDelayMillis = 100;
    private int mAnimatorDelayMillis = 30;
    private int mAnimatorDurationMillis = 400;
    private boolean mIsAnimatorEnable = true;

    /* loaded from: classes9.dex */
    public interface CustomAnimatorFactory {
        Animator[] generateAnimators(ViewGroup viewGroup, View view);
    }

    static {
        kge.a(-1990688652);
        kge.a(1118968931);
    }

    public static /* synthetic */ CustomAnimatorFactory access$000(CellAnimatorFeature cellAnimatorFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomAnimatorFactory) ipChange.ipc$dispatch("f7da0b05", new Object[]{cellAnimatorFeature}) : cellAnimatorFeature.mCustomAnimatorFactory;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellAnimatorFeature, i, 0)) == null) {
        } else {
            this.mInitialDelayMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_initialDelay, this.mInitialDelayMillis);
            this.mAnimatorDelayMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_animatorDelay, this.mAnimatorDelayMillis);
            this.mAnimatorDurationMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_animatorDuration, this.mAnimatorDurationMillis);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.callback.AdapterCallback
    public ListAdapter wrapAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListAdapter) ipChange.ipc$dispatch("4822ce0a", new Object[]{this, listAdapter});
        }
        if (listAdapter == null || (listAdapter instanceof AnimatorAdapter) || !(listAdapter instanceof BaseAdapter)) {
            return listAdapter;
        }
        CellAnimatorController cellAnimatorController = new CellAnimatorController(getHost());
        cellAnimatorController.setInitialDelayMillis(this.mInitialDelayMillis);
        cellAnimatorController.setAnimationDelayMillis(this.mAnimatorDelayMillis);
        cellAnimatorController.setAnimationDurationMillis(this.mAnimatorDurationMillis);
        this.mAnimatorAdapter = new AnimatorAdapter((BaseAdapter) listAdapter);
        this.mAnimatorAdapter.setCellAnimatorController(cellAnimatorController);
        this.mAnimatorAdapter.setAnimatorEnable(this.mIsAnimatorEnable);
        return this.mAnimatorAdapter;
    }

    public void resetAnimators() {
        AnimatorAdapter animatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67fb0be4", new Object[]{this});
        } else if (getHost() == null || (animatorAdapter = this.mAnimatorAdapter) == null) {
        } else {
            animatorAdapter.reset();
        }
    }

    public void setAnimatorEnable(boolean z) {
        AnimatorAdapter animatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsAnimatorEnable = z;
        if (getHost() == null || (animatorAdapter = this.mAnimatorAdapter) == null) {
            return;
        }
        animatorAdapter.setAnimatorEnable(z);
    }

    public boolean isAnimatorEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f211959f", new Object[]{this})).booleanValue() : this.mIsAnimatorEnable;
    }

    public void setCustomAnimatorFactory(CustomAnimatorFactory customAnimatorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a03288", new Object[]{this, customAnimatorFactory});
        } else {
            this.mCustomAnimatorFactory = customAnimatorFactory;
        }
    }

    public int getInitialDelayMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("990a40b5", new Object[]{this})).intValue() : this.mInitialDelayMillis;
    }

    public void setInitialDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e2ff5", new Object[]{this, new Integer(i)});
        } else {
            this.mInitialDelayMillis = i;
        }
    }

    public int getAnimatorDelayMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd834386", new Object[]{this})).intValue() : this.mAnimatorDelayMillis;
    }

    public void setAnimatorDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b26adc", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimatorDelayMillis = i;
        }
    }

    public int getAnimatorDurationMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bdf273b1", new Object[]{this})).intValue() : this.mAnimatorDurationMillis;
    }

    public void setAnimatorDurationMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8748279", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimatorDurationMillis = i;
        }
    }

    /* loaded from: classes9.dex */
    public class AnimatorAdapter extends CellAnimatorAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-859942376);
        }

        public AnimatorAdapter(BaseAdapter baseAdapter) {
            super(baseAdapter);
        }

        @Override // com.taobao.uikit.feature.features.cellanimator.CellAnimatorAdapter
        public Animator[] getAnimators(ViewGroup viewGroup, View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Animator[]) ipChange.ipc$dispatch("dd2f3838", new Object[]{this, viewGroup, view}) : CellAnimatorFeature.access$000(CellAnimatorFeature.this) == null ? new Animator[]{ObjectAnimator.ofFloat(view, "translationY", 400.0f, 0.0f), ObjectAnimator.ofFloat(view, "rotationX", 15.0f, 0.0f)} : CellAnimatorFeature.access$000(CellAnimatorFeature.this).generateAnimators(viewGroup, view);
        }
    }
}
