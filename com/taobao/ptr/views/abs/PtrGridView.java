package com.taobao.ptr.views.abs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.GridView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.c;
import com.taobao.ptr.h;
import tb.kge;
import tb.nki;

/* loaded from: classes7.dex */
public class PtrGridView extends GridView implements AbsListView.OnScrollListener, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mLastItemVisible;
    private c mOnLastItemVisibleListener;
    private AbsListView.OnScrollListener mOnScrollListener;

    static {
        kge.a(-10684153);
        kge.a(-1419130634);
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

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public PtrGridView(Context context) {
        super(context);
        super.setOnScrollListener(this);
    }

    public PtrGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener(this);
    }

    public PtrGridView(Context context, AttributeSet attributeSet, int i) {
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
}
