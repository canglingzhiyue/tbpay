package com.taobao.android.dinamicx.widget.recycler.view;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.model.f;
import com.taobao.android.dinamicx.widget.recycler.expose.c;
import com.taobao.android.dinamicx.widget.recycler.h;
import java.util.ArrayList;
import java.util.Iterator;
import tb.fqi;
import tb.fuw;
import tb.fxp;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerView extends RecyclerView implements fxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c exposeHelper;
    private boolean ignoreMotionEvent;
    private boolean isNeedScrollAfterLayout;
    public ArrayList<RecyclerView.OnScrollListener> mExtraScrollerListeners;
    private int offsetX;
    private int offsetY;
    private Parcelable saveInstanceState;

    static {
        kge.a(588326986);
        kge.a(1610797241);
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerView dXRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -611872810:
                super.addOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 763875539:
                super.removeOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1243377869:
                super.clearOnScrollListeners();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(DXRecyclerView dXRecyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b4e700", new Object[]{dXRecyclerView, new Integer(i), new Integer(i2)});
        } else {
            dXRecyclerView.internalScrollByAfterLayout(i, i2);
        }
    }

    public DXRecyclerView(Context context) {
        super(context);
        this.saveInstanceState = null;
        this.isNeedScrollAfterLayout = false;
        this.offsetX = 0;
        this.offsetY = 0;
    }

    public DXRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.saveInstanceState = null;
        this.isNeedScrollAfterLayout = false;
        this.offsetX = 0;
        this.offsetY = 0;
    }

    public DXRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.saveInstanceState = null;
        this.isNeedScrollAfterLayout = false;
        this.offsetX = 0;
        this.offsetY = 0;
    }

    public void setIgnoreMotionEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5103e1d", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreMotionEvent = z;
        }
    }

    public boolean isIgnoreMotionEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c2ae3d3", new Object[]{this})).booleanValue() : this.ignoreMotionEvent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        Parcelable parcelable = this.saveInstanceState;
        if (parcelable != null) {
            onRestoreInstanceState(parcelable);
        }
        super.onAttachedToWindow();
        if (this.exposeHelper == null) {
            return;
        }
        fuw.a("DXRecyclerView", "exposeHelper.attach();");
        this.exposeHelper.d();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (!fqi.aU()) {
            this.saveInstanceState = onSaveInstanceState();
        }
        super.onDetachedFromWindow();
        if (fqi.aU()) {
            this.saveInstanceState = onSaveInstanceState();
        }
        if (this.exposeHelper == null) {
            return;
        }
        fuw.a("DXRecyclerView", "exposeHelper.detach();");
        this.exposeHelper.e();
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        correctSpanCountChangeError(i);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (this.exposeHelper != null) {
                this.exposeHelper.g();
            }
            scrollByOffset();
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public c getExposeHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("48f75766", new Object[]{this}) : this.exposeHelper;
    }

    public void setExposeHelper(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d1fcf5a", new Object[]{this, cVar});
        } else {
            this.exposeHelper = cVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db878fd6", new Object[]{this, onScrollListener});
            return;
        }
        super.addOnScrollListener(onScrollListener);
        if (this.mExtraScrollerListeners == null) {
            this.mExtraScrollerListeners = new ArrayList<>();
        }
        this.mExtraScrollerListeners.add(onScrollListener);
    }

    @Override // android.support.v7.widget.RecyclerView, com.alilive.adapter.uikit.b
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d87d0d3", new Object[]{this, onScrollListener});
            return;
        }
        super.removeOnScrollListener(onScrollListener);
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(onScrollListener);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void clearOnScrollListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1c70cd", new Object[]{this});
            return;
        }
        super.clearOnScrollListeners();
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    public void onScrollStateChangedExtra(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338eb3b", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList == null) {
            return;
        }
        Iterator<RecyclerView.OnScrollListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onScrollStateChanged(this, i);
        }
        correctSpanCountChangeError(i);
    }

    private void correctSpanCountChangeError(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8b2adf", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (!(getLayoutManager() instanceof StaggeredGridLayoutManager) || f.e() || (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) getLayoutManager()).getSpanCount()) < 2) {
                return;
            }
            int[] iArr = new int[spanCount];
            staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
            if (iArr[0] > spanCount) {
                z = false;
            }
            if (i != 0 || !z) {
                return;
            }
            staggeredGridLayoutManager.invalidateSpanAssignments();
        } catch (Exception unused) {
        }
    }

    public void scrollByAfterLayout(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86c1b29", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            post(new Runnable() { // from class: com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DXRecyclerView.access$000(DXRecyclerView.this, i, i2);
                    }
                }
            });
        } else {
            internalScrollByAfterLayout(i, i2);
        }
    }

    private void internalScrollByAfterLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ffd2ec", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.isNeedScrollAfterLayout = true;
        this.offsetX = i;
        this.offsetY = i2;
        requestLayout();
    }

    private void scrollByOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf27ebe", new Object[]{this});
        } else if (!this.isNeedScrollAfterLayout) {
        } else {
            this.isNeedScrollAfterLayout = false;
            scrollBy(this.offsetX, this.offsetY);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter instanceof h) {
            savedState.mLoadMoreState = ((h) adapter).f();
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXSavedState", savedState.hashCode() + " onSaveInstanceState mLoadMoreState: " + savedState.mLoadMoreState);
        }
        return savedState;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            RecyclerView.Adapter adapter = getAdapter();
            if (DinamicXEngine.j()) {
                fuw.d("DXSavedState", parcelable.hashCode() + " onRestoreInstanceState mLoadMoreState: " + savedState.mLoadMoreState);
            }
            if (!(adapter instanceof h) || savedState.mLoadMoreState == 1) {
                return;
            }
            ((h) adapter).i(savedState.mLoadMoreState);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.ignoreMotionEvent) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        int mLoadMoreState;

        static {
            kge.a(-1250752764);
            CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView$SavedState, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView$SavedState[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("f60c285c", new Object[]{this, parcel}) : new SavedState(parcel);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("a223758b", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }

        protected SavedState(Parcelable parcelable) {
            super(parcelable);
            this.mLoadMoreState = 1;
        }

        protected SavedState(Parcel parcel) {
            super(parcel);
            this.mLoadMoreState = 1;
            this.mLoadMoreState = parcel.readInt();
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mLoadMoreState);
        }
    }
}
