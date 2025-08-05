package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.i;
import tb.kge;

/* loaded from: classes6.dex */
public class ScrollerContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c changeListener;
    private ViewGroup child;
    private int direction;
    private int initScroll;
    private MUSView musView;
    private i nodeTree;
    private android.widget.Scroller scroller;

    static {
        kge.a(1259311717);
    }

    public static /* synthetic */ Object ipc$super(ScrollerContainer scrollerContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -894236565) {
            super.computeScroll();
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public ScrollerContainer(Context context) {
        super(context);
        this.direction = 0;
        this.scroller = new android.widget.Scroller(context);
    }

    public int getCurrentScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f705863", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup != null) {
            return viewGroup.getScrollY();
        }
        return 0;
    }

    public int getCurrentScrollX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f6240e2", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup != null) {
            return viewGroup.getScrollX();
        }
        return 0;
    }

    public int getCurrentScrollRight() {
        MUSView mUSView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a9b1886", new Object[]{this})).intValue();
        }
        if (this.child == null || (mUSView = this.musView) == null) {
            return 0;
        }
        if (mUSView.getMeasuredWidth() <= this.child.getMeasuredWidth()) {
            return this.musView.getMeasuredWidth();
        }
        return this.child.getScrollX() + this.child.getMeasuredWidth();
    }

    public void cancelAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5115b1", new Object[]{this});
        } else if (this.scroller.isFinished()) {
        } else {
            this.scroller.forceFinished(true);
        }
    }

    public void scrollTo(boolean z, int i, int i2, boolean z2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8debe94", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Boolean(z2), new Integer(i3)});
            return;
        }
        this.initScroll = 0;
        if (this.child == null) {
            return;
        }
        cancelAnimation();
        if (!z2 || i3 <= 0) {
            if (z) {
                this.child.scrollTo(0, i2);
                return;
            } else {
                this.child.scrollTo(i2, 0);
                return;
            }
        }
        if (z) {
            this.scroller.startScroll(0, i, 0, i2 - i, i3);
        } else {
            this.scroller.startScroll(i, 0, i2 - i, 0, i3);
        }
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (this.child == null || !this.scroller.computeScrollOffset()) {
            return;
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup instanceof MUScrollView) {
            viewGroup.scrollTo(0, this.scroller.getCurrY());
        } else {
            viewGroup.scrollTo(this.scroller.getCurrX(), 0);
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.initScroll;
        if (i5 != 0) {
            ViewGroup viewGroup = this.child;
            if (viewGroup instanceof MUScrollView) {
                viewGroup.scrollTo(0, i5);
            } else if (viewGroup instanceof HorizontalScrollView) {
                viewGroup.scrollTo(i5, 0);
            }
            this.initScroll = 0;
        }
        if (!z) {
            return;
        }
        onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }

    public void mount(MUSDKInstance mUSDKInstance, boolean z, boolean z2, int i, i iVar, int i2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833492b3", new Object[]{this, mUSDKInstance, new Boolean(z), new Boolean(z2), new Integer(i), iVar, new Integer(i2), cVar});
            return;
        }
        this.changeListener = cVar;
        this.initScroll = i2;
        if (this.nodeTree != iVar) {
            setNodeTree(mUSDKInstance, iVar);
            this.nodeTree = iVar;
        }
        setDirection(i, cVar);
        setShowScrollBar(z);
        setScrollable(z2);
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        cancelAnimation();
        MUSView mUSView = this.musView;
        if (mUSView != null) {
            mUSView.release(true);
            this.musView.setTag(null);
            this.musView = null;
        }
        this.changeListener = null;
        removeAllViews();
        this.direction = 0;
        this.child = null;
        this.nodeTree = null;
    }

    public void setShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8721146", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup instanceof MUScrollView) {
            viewGroup.setVerticalScrollBarEnabled(z);
        } else if (!(viewGroup instanceof HorizontalScrollView)) {
        } else {
            viewGroup.setHorizontalScrollBarEnabled(z);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.child;
        if (viewGroup instanceof MUScrollView) {
            ((MUScrollView) viewGroup).setScrollable(z);
        } else if (!(viewGroup instanceof MUSHorizontalScrollView)) {
        } else {
            ((MUSHorizontalScrollView) viewGroup).setScrollable(z);
        }
    }

    public void setNodeTree(MUSDKInstance mUSDKInstance, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174cc396", new Object[]{this, mUSDKInstance, iVar});
            return;
        }
        if (this.musView == null) {
            this.musView = new MUSView(mUSDKInstance);
            this.musView.setRoot(false);
            if (m.c()) {
                this.musView.setTag("scroller-child");
            }
            ViewGroup viewGroup = this.child;
            if (viewGroup != null) {
                viewGroup.addView(this.musView);
            }
        }
        this.musView.setUiNodeTree(iVar);
    }

    private void setDirection(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239a5241", new Object[]{this, new Integer(i), cVar});
            return;
        }
        if (this.direction != i) {
            onDirectionChanged(i, cVar);
        }
        this.direction = i;
    }

    public void setDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12d843f", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.direction != i) {
            onDirectionChanged(i, this.changeListener);
        }
        this.direction = i;
    }

    private void onDirectionChanged(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7163f8", new Object[]{this, new Integer(i), cVar});
            return;
        }
        cancelAnimation();
        if (this.child != null) {
            removeAllViews();
            this.child.removeAllViews();
        }
        if (i == 2) {
            MUSHorizontalScrollView mUSHorizontalScrollView = new MUSHorizontalScrollView(getContext());
            mUSHorizontalScrollView.setFillViewport(true);
            addView(mUSHorizontalScrollView, new FrameLayout.LayoutParams(-1, -1));
            mUSHorizontalScrollView.setOnScrollChangedListener(cVar);
            this.child = mUSHorizontalScrollView;
        } else {
            MUScrollView mUScrollView = new MUScrollView(getContext());
            mUScrollView.setFillViewport(true);
            mUScrollView.setOnScrollChangedListener(cVar);
            addView(mUScrollView, new FrameLayout.LayoutParams(-1, -1));
            this.child = mUScrollView;
        }
        MUSView mUSView = this.musView;
        if (mUSView == null) {
            return;
        }
        mUSView.release(false);
        if (this.musView.getUiNodeTree() != null) {
            this.musView.getUiNodeTree().a(this.musView);
        }
        this.child.addView(this.musView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        cancelAnimation();
        return super.dispatchTouchEvent(motionEvent);
    }
}
