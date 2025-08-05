package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class CellAnimatorAdapter extends BaseAdapter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALPHA = "alpha";
    private static final String SAVEDINSTANCESTATE_VIEWANIMATOR = "savedinstancestate_viewanimator";
    private CellAnimatorController mCellAnimatorController;
    private BaseAdapter mDelegateAdapter;
    private boolean mIsRootAdapter;

    static {
        kge.a(-528450855);
    }

    public static /* synthetic */ Object ipc$super(CellAnimatorAdapter cellAnimatorAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract Animator[] getAnimators(ViewGroup viewGroup, View view);

    public CellAnimatorAdapter(BaseAdapter baseAdapter) {
        this.mDelegateAdapter = baseAdapter;
        this.mIsRootAdapter = true;
        if (baseAdapter instanceof CellAnimatorAdapter) {
            ((CellAnimatorAdapter) baseAdapter).mIsRootAdapter = false;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mDelegateAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.mDelegateAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : this.mDelegateAdapter.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c9bb039", new Object[]{this})).booleanValue() : this.mDelegateAdapter.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mDelegateAdapter.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.mDelegateAdapter.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue() : this.mDelegateAdapter.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.mDelegateAdapter.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8714c709", new Object[]{this, new Integer(i)})).booleanValue() : this.mDelegateAdapter.isEnabled(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        View view2 = this.mDelegateAdapter.getView(i, view, viewGroup);
        if (this.mIsRootAdapter) {
            animateViewIfNecessary(i, view2, viewGroup);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else {
            this.mDelegateAdapter.notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809705c1", new Object[]{this});
        } else {
            this.mDelegateAdapter.notifyDataSetInvalidated();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.mDelegateAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.mDelegateAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mCellAnimatorController.reset();
        BaseAdapter baseAdapter = this.mDelegateAdapter;
        if (!(baseAdapter instanceof CellAnimatorAdapter)) {
            return;
        }
        ((CellAnimatorAdapter) baseAdapter).reset();
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
        if (cellAnimatorController == null) {
            return;
        }
        cellAnimatorController.setAnimatorEnable(z);
    }

    public CellAnimatorController getCellAnimatorController() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CellAnimatorController) ipChange.ipc$dispatch("78cb8d81", new Object[]{this}) : this.mCellAnimatorController;
    }

    public void setCellAnimatorController(CellAnimatorController cellAnimatorController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc3d941", new Object[]{this, cellAnimatorController});
        } else {
            this.mCellAnimatorController = cellAnimatorController;
        }
    }

    private void animateViewIfNecessary(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e4abe1", new Object[]{this, new Integer(i), view, viewGroup});
            return;
        }
        BaseAdapter baseAdapter = this.mDelegateAdapter;
        Animator[] animators = baseAdapter instanceof CellAnimatorAdapter ? ((CellAnimatorAdapter) baseAdapter).getAnimators(viewGroup, view) : null;
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
        CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
        if (cellAnimatorController != null) {
            bundle.putParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR, cellAnimatorController.onSaveInstanceState());
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
            CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
            if (cellAnimatorController == null) {
                return;
            }
            cellAnimatorController.onRestoreInstanceState(bundle.getParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR));
        }
    }
}
