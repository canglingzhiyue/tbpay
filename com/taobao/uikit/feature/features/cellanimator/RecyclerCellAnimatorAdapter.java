package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class RecyclerCellAnimatorAdapter extends RecyclerView.Adapter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALPHA = "alpha";
    private static final String SAVEDINSTANCESTATE_VIEWANIMATOR = "savedinstancestate_viewanimator";
    private RecyclerCellAnimatorController mCellAnimatorController;
    private RecyclerView.Adapter mDelegateAdapter;
    private boolean mIsRootAdapter;

    static {
        kge.a(-1945288422);
    }

    public static /* synthetic */ Object ipc$super(RecyclerCellAnimatorAdapter recyclerCellAnimatorAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1614840632) {
            super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract Animator[] getAnimators(ViewGroup viewGroup, View view);

    public RecyclerCellAnimatorAdapter(RecyclerView.Adapter adapter) {
        this.mDelegateAdapter = adapter;
        this.mIsRootAdapter = true;
        if (adapter instanceof RecyclerCellAnimatorAdapter) {
            ((RecyclerCellAnimatorAdapter) adapter).mIsRootAdapter = false;
        }
        super.setHasStableIds(adapter.hasStableIds());
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : this.mDelegateAdapter.mo1596onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        this.mDelegateAdapter.onBindViewHolder(viewHolder, i);
        if (!this.mIsRootAdapter) {
            return;
        }
        animateViewIfNecessary(i, viewHolder.itemView, null);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mDelegateAdapter.getItemViewType(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbf7cc8", new Object[]{this, new Boolean(z)});
        } else {
            this.mDelegateAdapter.setHasStableIds(z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : this.mDelegateAdapter.getItemId(i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.mDelegateAdapter.getItemCount();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewRecycled(viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ce8d76", new Object[]{this, adapterDataObserver});
        } else {
            this.mDelegateAdapter.registerAdapterDataObserver(adapterDataObserver);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb16f3d", new Object[]{this, adapterDataObserver});
        } else {
            this.mDelegateAdapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mCellAnimatorController.reset();
        RecyclerView.Adapter adapter = this.mDelegateAdapter;
        if (!(adapter instanceof RecyclerCellAnimatorAdapter)) {
            return;
        }
        ((RecyclerCellAnimatorAdapter) adapter).reset();
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
        if (recyclerCellAnimatorController == null) {
            return;
        }
        recyclerCellAnimatorController.setAnimatorEnable(z);
    }

    public RecyclerCellAnimatorController getRecyclerCellAnimatorController() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerCellAnimatorController) ipChange.ipc$dispatch("b437fea1", new Object[]{this}) : this.mCellAnimatorController;
    }

    public void setRecyclerCellAnimatorController(RecyclerCellAnimatorController recyclerCellAnimatorController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da31c43", new Object[]{this, recyclerCellAnimatorController});
        } else {
            this.mCellAnimatorController = recyclerCellAnimatorController;
        }
    }

    private void animateViewIfNecessary(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e4abe1", new Object[]{this, new Integer(i), view, viewGroup});
            return;
        }
        RecyclerView.Adapter adapter = this.mDelegateAdapter;
        Animator[] animators = adapter instanceof RecyclerCellAnimatorAdapter ? ((RecyclerCellAnimatorAdapter) adapter).getAnimators(viewGroup, view) : null;
        Animator[] animators2 = getAnimators(viewGroup, view);
        if (animators2 == null && animators == null) {
            return;
        }
        this.mCellAnimatorController.animateViewIfNecessary(i, view, concatAnimators(animators, animators2, ObjectAnimator.ofFloat(view, ALPHA, 0.0f, 1.0f)));
    }

    public static Animator[] concatAnimators(Animator[] animatorArr, Animator[] animatorArr2, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator[]) ipChange.ipc$dispatch("58e6f8be", new Object[]{animatorArr, animatorArr2, animator});
        }
        int length = animatorArr == null ? 0 : animatorArr.length;
        int length2 = animatorArr2 == null ? 0 : animatorArr2.length;
        Animator[] animatorArr3 = new Animator[length + length2 + 1];
        if (animatorArr != null && length > 0) {
            System.arraycopy(animatorArr, 0, animatorArr3, 0, length);
        }
        if (animatorArr2 != null && length2 > 0) {
            System.arraycopy(animatorArr2, 0, animatorArr3, length, length2);
        }
        animatorArr3[animatorArr3.length - 1] = animator;
        return animatorArr3;
    }

    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
        if (recyclerCellAnimatorController != null) {
            bundle.putParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR, recyclerCellAnimatorController.onSaveInstanceState());
        }
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof Bundle)) {
        } else {
            Bundle bundle = (Bundle) parcelable;
            RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
            if (recyclerCellAnimatorController == null) {
                return;
            }
            recyclerCellAnimatorController.onRestoreInstanceState(bundle.getParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR));
        }
    }
}
