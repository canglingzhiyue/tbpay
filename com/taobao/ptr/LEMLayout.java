package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class LEMLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String STATE_LEM_STATE = "lem_state";
    private static final String STATE_SUPER = "lem_super";
    private View mContentView;
    private int mEmptyResId;
    private View mEmptyView;
    private int mErrorResId;
    private View mErrorView;
    private LemState mLemState;
    private int mLoadingResId;
    private View mLoadingView;

    /* loaded from: classes7.dex */
    public enum LemState {
        LOADING(0),
        ERROR(1),
        EMPTY(2),
        CONTENT(3);
        
        private int mIntValue;

        LemState(int i) {
            this.mIntValue = i;
        }

        public static boolean AbnormalState(LemState lemState) {
            return lemState != null && lemState.getIntValue() < CONTENT.getIntValue();
        }

        public static LemState getDefault() {
            return CONTENT;
        }

        public static LemState mapIntToValue(int i) {
            LemState[] values;
            for (LemState lemState : values()) {
                if (i == lemState.getIntValue()) {
                    return lemState;
                }
            }
            return getDefault();
        }

        int getIntValue() {
            return this.mIntValue;
        }
    }

    static {
        kge.a(-1911257846);
    }

    public static /* synthetic */ Object ipc$super(LEMLayout lEMLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public LEMLayout(Context context) {
        super(context);
        this.mLemState = LemState.getDefault();
        init(context, null);
    }

    public LEMLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLemState = LemState.getDefault();
        init(context, attributeSet);
    }

    public LEMLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLemState = LemState.getDefault();
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LEMLayout);
        if (obtainStyledAttributes.hasValue(R.styleable.LEMLayout_lemLayoutLoading)) {
            this.mLoadingResId = obtainStyledAttributes.getResourceId(R.styleable.LEMLayout_lemLayoutLoading, 0);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LEMLayout_lemLayoutEmpty)) {
            this.mEmptyResId = obtainStyledAttributes.getResourceId(R.styleable.LEMLayout_lemLayoutEmpty, 0);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LEMLayout_lemLayoutError)) {
            this.mErrorResId = obtainStyledAttributes.getResourceId(R.styleable.LEMLayout_lemLayoutError, 0);
        }
        if (!obtainStyledAttributes.hasValue(R.styleable.LEMLayout_lemLayoutState)) {
            return;
        }
        setState(LemState.mapIntToValue(obtainStyledAttributes.getInteger(R.styleable.LEMLayout_lemLayoutState, LemState.getDefault().getIntValue())));
    }

    private void superAddView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c61a0", new Object[]{this, view});
        } else if (view == null || view.getParent() != null) {
        } else {
            super.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void hideView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else if (view == null || view.getParent() != this || view.getVisibility() != 0) {
        } else {
            view.setVisibility(8);
        }
    }

    public final void showView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{this, view});
        } else if (view == null || view.getParent() != this || view.getVisibility() != 8) {
        } else {
            view.setVisibility(0);
        }
    }

    public final void setState(LemState lemState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cf4ab4", new Object[]{this, lemState});
            return;
        }
        this.mLemState = lemState;
        if (lemState == LemState.CONTENT) {
            showContentViewInternal();
        } else if (lemState == LemState.EMPTY) {
            showEmptyViewInternal();
        } else if (lemState == LemState.ERROR) {
            showErrorViewInternal();
        } else if (lemState != LemState.LOADING) {
        } else {
            showLoadingViewInternal();
        }
    }

    public final void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
        } else {
            setState(LemState.LOADING);
        }
    }

    private void showLoadingViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798781a8", new Object[]{this});
        } else if (this.mContentView == null) {
        } else {
            inflateLoading();
            superAddView(this.mLoadingView);
            showLoading();
        }
    }

    private void initAndHideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba2277a", new Object[]{this});
            return;
        }
        inflateLoading();
        superAddView(this.mLoadingView);
        hideView(this.mLoadingView);
    }

    private void inflateLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1886033c", new Object[]{this});
        } else if (this.mLoadingView != null || this.mLoadingResId <= 0) {
        } else {
            this.mLoadingView = LayoutInflater.from(getContext()).inflate(this.mLoadingResId, (ViewGroup) this, false);
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        hideView(this.mEmptyView);
        hideView(this.mErrorView);
        hideView(this.mContentView);
        showView(this.mLoadingView);
    }

    public final void showEmptyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987e091c", new Object[]{this});
        } else {
            setState(LemState.EMPTY);
        }
    }

    private void showEmptyViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6e1879", new Object[]{this});
        } else if (this.mContentView == null) {
        } else {
            inflateEmpty();
            superAddView(this.mEmptyView);
            showEmpty();
        }
    }

    private void initAndHideEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941bdccb", new Object[]{this});
            return;
        }
        inflateEmpty();
        superAddView(this.mEmptyView);
        hideView(this.mEmptyView);
    }

    private void inflateEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a467c10d", new Object[]{this});
        } else if (this.mEmptyView != null || this.mEmptyResId <= 0) {
        } else {
            this.mEmptyView = LayoutInflater.from(getContext()).inflate(this.mEmptyResId, (ViewGroup) this, false);
        }
    }

    public void showEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8510ecd7", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mErrorView);
        hideView(this.mContentView);
        showView(this.mEmptyView);
    }

    public final void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
        } else {
            setState(LemState.ERROR);
        }
    }

    private void showErrorViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606d8f34", new Object[]{this});
        } else if (this.mContentView == null) {
        } else {
            inflateError();
            superAddView(this.mErrorView);
            showError();
        }
    }

    private void initAndHideError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc635406", new Object[]{this});
            return;
        }
        inflateError();
        superAddView(this.mErrorView);
        hideView(this.mErrorView);
    }

    private void inflateError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf3848", new Object[]{this});
        } else if (this.mErrorView != null || this.mErrorResId <= 0) {
        } else {
            this.mErrorView = LayoutInflater.from(getContext()).inflate(this.mErrorResId, (ViewGroup) this, false);
        }
    }

    public void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mEmptyView);
        hideView(this.mContentView);
        showView(this.mErrorView);
    }

    public final void showContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af80d788", new Object[]{this});
        } else {
            setState(LemState.CONTENT);
        }
    }

    private void showContentViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda1bae5", new Object[]{this});
        } else {
            showContent();
        }
    }

    public void showContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a33d143", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mEmptyView);
        hideView(this.mErrorView);
        showView(this.mContentView);
    }

    public final void setLoadingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198d1dcc", new Object[]{this, view});
            return;
        }
        View view2 = this.mLoadingView;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.mLoadingView = view;
        if (getLemState() != LemState.LOADING) {
            return;
        }
        showLoadingViewInternal();
    }

    public final void setEmptyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e28f9b", new Object[]{this, view});
            return;
        }
        View view2 = this.mEmptyView;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.mEmptyView = view;
        if (getLemState() != LemState.EMPTY) {
            return;
        }
        showEmptyViewInternal();
    }

    public final void setErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36812600", new Object[]{this, view});
            return;
        }
        View view2 = this.mErrorView;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.mErrorView = view;
        if (getLemState() != LemState.ERROR) {
            return;
        }
        showErrorViewInternal();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        checkChild(view);
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        checkChild(view);
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, i, layoutParams);
    }

    private void checkChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24376977", new Object[]{this, view});
        } else if (view == this.mLoadingView || view == this.mEmptyView || view == this.mErrorView) {
        } else {
            if (getChildCount() > 0) {
                throw new IllegalStateException("LEMLayout can host only one direct child");
            }
            this.mContentView = view;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (view == null || view != this.mContentView) {
            return;
        }
        initAndHideLoading();
        initAndHideEmpty();
        initAndHideError();
        setState(getLemState());
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if (view == null || view != this.mContentView) {
            return;
        }
        removeAllViews();
        this.mContentView = null;
    }

    public final LemState getLemState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LemState) ipChange.ipc$dispatch("7712b114", new Object[]{this}) : this.mLemState;
    }

    public final View getLoadingView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dc3c0794", new Object[]{this}) : this.mLoadingView;
    }

    public final View getErrorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f6c59be0", new Object[]{this}) : this.mErrorView;
    }

    public final View getEmptyView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e61312e5", new Object[]{this}) : this.mEmptyView;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt(STATE_LEM_STATE, this.mLemState.getIntValue());
        bundle.putParcelable(STATE_SUPER, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setState(LemState.mapIntToValue(bundle.getInt(STATE_LEM_STATE, LemState.getDefault().getIntValue())));
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }
}
