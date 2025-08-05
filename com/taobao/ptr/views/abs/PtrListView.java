package com.taobao.ptr.views.abs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.c;
import com.taobao.ptr.d;
import com.taobao.ptr.e;
import com.taobao.ptr.f;
import com.taobao.ptr.g;
import com.taobao.ptr.h;
import tb.kge;
import tb.nki;

/* loaded from: classes7.dex */
public class PtrListView extends ListView implements AbsListView.OnScrollListener, d, g, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e mDelegate;
    private View mEndView;
    private boolean mIsDisable;
    private boolean mLastItemVisible;
    private Drawable mLoadingDrawable;
    private f mLoadingHelper;
    private c mOnLastItemVisibleListener;
    private AbsListView.OnScrollListener mOnScrollListener;
    private ColorStateList mTextColor;

    /* renamed from: com.taobao.ptr.views.abs.PtrListView$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18962a = new int[PullBase.Mode.values().length];

        static {
            try {
                f18962a[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        kge.a(1016902239);
        kge.a(-1419130634);
        kge.a(959043519);
        kge.a(-1161140236);
        kge.a(1480088762);
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    public PtrListView(Context context) {
        super(context);
        super.setOnScrollListener(this);
    }

    public PtrListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener(this);
    }

    public PtrListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnScrollListener(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(absListView, i);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.mOnLastItemVisibleListener != null) {
            if (i3 > 0 && i + i2 >= i3 - 1) {
                z = true;
            }
            this.mLastItemVisible = z;
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener == null) {
            return;
        }
        onScrollListener.onScroll(absListView, i, i2, i3);
    }

    public final void setOnLastItemVisibleListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc7e343", new Object[]{this, cVar});
        } else {
            this.mOnLastItemVisibleListener = cVar;
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ab77e", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListener = onScrollListener;
        }
    }

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(colorStateList);
    }

    public final void setEndLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba8e6cc", new Object[]{this, drawable});
            return;
        }
        this.mLoadingDrawable = drawable;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(drawable);
    }

    public final void setEndLoadingDelegate(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f092f96d", new Object[]{this, eVar});
            return;
        }
        this.mDelegate = eVar;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(eVar);
        onUpdateDirection(getPullDirection());
    }

    public final void disableEndPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a378d3cf", new Object[]{this, new Boolean(z)});
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

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("16948b73", new Object[]{this}) : this.mEndView;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : nki.a(this);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue() : nki.b(this);
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout mo1211getEndLayout = ptrBase.mo1211getEndLayout();
            if (mo1211getEndLayout != null) {
                mo1211getEndLayout.disableIntrinsicPullFeature(true);
            }
            this.mLoadingHelper = new f(ptrBase.mo1211getEndLayout());
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDrawable(this.mLoadingDrawable);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.removeEndPtrProxy(this);
            removeFooterView(this.mEndView);
            this.mEndView = null;
            this.mLoadingHelper = null;
            ptrBase.mo1211getEndLayout().disableIntrinsicPullFeature(false);
        }
    }

    @Override // com.taobao.ptr.d
    public int getReadyToRefreshingValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985a7f7", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (AnonymousClass1.f18962a[mode.ordinal()] == 1 && i != 1 && (view = this.mEndView) != null) {
            return view.getHeight();
        }
        return -1;
    }

    @Override // com.taobao.ptr.d
    public int getReleaseTargetValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c4b782a", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue() : AnonymousClass1.f18962a[mode.ordinal()] != 1 ? -1 : 0;
    }

    @Override // com.taobao.ptr.g
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
            return;
        }
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        if (fVar != null) {
            fVar.b(i);
        }
        if (isDisable()) {
            return;
        }
        removeFooterView(this.mEndView);
        this.mEndView = null;
        f fVar2 = this.mLoadingHelper;
        if (fVar2 == null) {
            return;
        }
        this.mEndView = fVar2.a(this);
        View view = this.mEndView;
        if (view == null) {
            return;
        }
        addFooterView(view);
    }

    @Override // com.taobao.ptr.g
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.b(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a();
        }
    }

    @Override // com.taobao.ptr.g
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(charSequence);
        }
    }

    @Override // com.taobao.ptr.g
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.b();
        }
    }

    @Override // com.taobao.ptr.g
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(z, charSequence);
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
        removeFooterView(this.mEndView);
        this.mEndView = null;
    }

    @Override // com.taobao.ptr.g
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        onUpdateDirection(getPullDirection());
    }
}
