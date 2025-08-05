package com.taobao.ptr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class PtrLayout extends PullLayout implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f mHelper;
    private View mInnerParent;
    private boolean mIsDisable;
    private Drawable mLoadingDrawable;
    private CharSequence mPullLabel;
    private CharSequence mRefreshingLabel;
    private CharSequence mReleaseLabel;
    private ColorStateList mTextColor;

    /* renamed from: com.taobao.ptr.PtrLayout$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18952a = new int[PullBase.Mode.values().length];

        static {
            try {
                f18952a[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18952a[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-1765536156);
        kge.a(-1161140236);
    }

    public static /* synthetic */ Object ipc$super(PtrLayout ptrLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1206316367) {
            super.onInit((Context) objArr[0], (PullBase.Mode) objArr[1], ((Number) objArr[2]).intValue(), (AttributeSet) objArr[3]);
            return null;
        } else if (hashCode != 1958838369) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.updateScrollDirection((PullBase.Mode) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public PtrLayout(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        super(context, mode, i, attributeSet);
    }

    @Override // com.taobao.ptr.PullLayout
    public final void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        super.onInit(context, mode, i, attributeSet);
        this.mPullLabel = context.getString(R.string.ptr_pull_label);
        this.mRefreshingLabel = context.getString(R.string.ptr_refreshing_label);
        this.mReleaseLabel = context.getString(R.string.ptr_release_label);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Refresh);
        if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrPullLabel)) {
            this.mPullLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrPullLabel);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrRefreshingLabel)) {
            this.mRefreshingLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrRefreshingLabel);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrReleaseLabel)) {
            this.mReleaseLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrReleaseLabel);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrLoadingTextColor)) {
            this.mTextColor = obtainStyledAttributes.getColorStateList(R.styleable.Refresh_ptrLoadingTextColor);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrLoadingDrawable)) {
            this.mLoadingDrawable = obtainStyledAttributes.getDrawable(R.styleable.Refresh_ptrLoadingDrawable);
        }
        if (AnonymousClass1.f18952a[mode.ordinal()] == 1) {
            if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrEndPullLabel)) {
                this.mPullLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrEndPullLabel);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrEndRefreshingLabel)) {
                this.mRefreshingLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrEndRefreshingLabel);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrEndReleaseLabel)) {
                this.mReleaseLabel = obtainStyledAttributes.getString(R.styleable.Refresh_ptrEndReleaseLabel);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrEndLoadingTextColor)) {
                this.mTextColor = obtainStyledAttributes.getColorStateList(R.styleable.Refresh_ptrEndLoadingTextColor);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.Refresh_ptrEndLoadingDrawable)) {
                this.mLoadingDrawable = obtainStyledAttributes.getDrawable(R.styleable.Refresh_ptrEndLoadingDrawable);
            }
        }
        obtainStyledAttributes.recycle();
        this.mHelper = new f(this);
        updateScrollDirection(mode, i);
    }

    public final void disableIntrinsicPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac5df9", new Object[]{this, new Boolean(z)});
        } else if (z) {
            onDisable();
        } else {
            onEnable();
        }
    }

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue() : isDisable();
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue() : this.mIsDisable;
    }

    @Override // com.taobao.ptr.PullLayout
    public final void updateScrollDirection(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c18061", new Object[]{this, mode, new Integer(i)});
            return;
        }
        super.updateScrollDirection(mode, i);
        onUpdateDirection(i);
    }

    @Override // com.taobao.ptr.g
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
            return;
        }
        f fVar = this.mHelper;
        if (fVar == null) {
            return;
        }
        if (fVar != null) {
            fVar.b(i);
        }
        if (isDisable()) {
            return;
        }
        removeView(this.mInnerParent);
        this.mInnerParent = null;
        f fVar2 = this.mHelper;
        if (fVar2 == null) {
            return;
        }
        this.mInnerParent = fVar2.a(this);
        View view = this.mInnerParent;
        if (view == null) {
            return;
        }
        setChildGravity(view);
        addView(this.mInnerParent);
    }

    public final void setChildGravity(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f959f57", new Object[]{this, view});
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = getGravity(getMode(), getScrollDirection());
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2, getGravity(getMode(), getScrollDirection()));
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private int getGravity(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b9377f05", new Object[]{this, mode, new Integer(i)})).intValue() : AnonymousClass1.f18952a[mode.ordinal()] != 1 ? i == 0 ? 81 : 21 : i == 0 ? 49 : 19;
    }

    public final ColorStateList getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorStateList) ipChange.ipc$dispatch("d1adea2d", new Object[]{this}) : this.mTextColor;
    }

    public final Drawable getLoadingDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("bd024f8f", new Object[]{this}) : this.mLoadingDrawable;
    }

    public final CharSequence getPullLabel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("7b18b2ba", new Object[]{this}) : this.mPullLabel;
    }

    public final CharSequence getRefreshingLabel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("b26c9f1c", new Object[]{this}) : this.mRefreshingLabel;
    }

    public final CharSequence getReleaseLabel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("a7927d0", new Object[]{this}) : this.mReleaseLabel;
    }

    public int getContentSize(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        f fVar = this.mHelper;
        if (fVar != null) {
            i2 = fVar.a(i);
        }
        if (i2 != 0) {
            return i2;
        }
        if (i == 1) {
            View view = this.mInnerParent;
            return view != null ? view.getWidth() : i2;
        }
        View view2 = this.mInnerParent;
        return view2 != null ? view2.getHeight() : i2;
    }

    public void setLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75543c61", new Object[]{this, colorStateList});
            return;
        }
        f fVar = this.mHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(colorStateList);
    }

    public void setLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabccd63", new Object[]{this, drawable});
            return;
        }
        f fVar = this.mHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(drawable);
    }

    public void setLoadingDelegate(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2f27c4", new Object[]{this, eVar});
            return;
        }
        f fVar = this.mHelper;
        if (fVar != null) {
            fVar.a(eVar);
        }
        updateScrollDirection(getMode(), getScrollDirection());
    }

    @Override // com.taobao.ptr.g
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.a(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.b(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.a();
        }
    }

    @Override // com.taobao.ptr.g
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.a(charSequence);
        }
    }

    @Override // com.taobao.ptr.g
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.b();
        }
    }

    @Override // com.taobao.ptr.g
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mHelper == null || isDisable()) {
        } else {
            this.mHelper.a(z, charSequence);
        }
    }

    @Override // com.taobao.ptr.g
    public void onDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d267c10", new Object[]{this});
            return;
        }
        this.mIsDisable = true;
        removeView(this.mInnerParent);
        this.mInnerParent = null;
    }

    @Override // com.taobao.ptr.g
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        updateScrollDirection(getMode(), getScrollDirection());
    }
}
