package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class AbsTNodeScrollView extends NestedScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYBOARD_DISMISS_MODE_DRAG = "drag";
    private ScrollViewComponent component;
    private Handler handler;
    private String keyBoardDismissMode;
    private long lastScrollUp;
    private boolean mHaveHideKeyBoard;
    private com.taobao.tao.flexbox.layoutmanager.module.element.a mKeyBoardDismissListener;
    public List<ScrollChangeListener> mScrollChangedListener;
    private c scrollHelper;
    public int scrollState;
    private Runnable scrollStateChecker;

    static {
        kge.a(-762905129);
    }

    private static int clamp(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7709794", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public static /* synthetic */ Object ipc$super(AbsTNodeScrollView absTNodeScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        }
    }

    public static /* synthetic */ long access$002(AbsTNodeScrollView absTNodeScrollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c220e7", new Object[]{absTNodeScrollView, new Long(j)})).longValue();
        }
        absTNodeScrollView.lastScrollUp = j;
        return j;
    }

    public AbsTNodeScrollView(Context context) {
        super(context);
        this.mHaveHideKeyBoard = false;
        this.mScrollChangedListener = null;
        this.mKeyBoardDismissListener = null;
        this.scrollState = 0;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AbsTNodeScrollView absTNodeScrollView = AbsTNodeScrollView.this;
                absTNodeScrollView.scrollState = 0;
                for (ScrollChangeListener scrollChangeListener : absTNodeScrollView.mScrollChangedListener) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                AbsTNodeScrollView.access$002(AbsTNodeScrollView.this, -1L);
            }
        };
        this.scrollHelper = new c(this);
    }

    public AbsTNodeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHaveHideKeyBoard = false;
        this.mScrollChangedListener = null;
        this.mKeyBoardDismissListener = null;
        this.scrollState = 0;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AbsTNodeScrollView absTNodeScrollView = AbsTNodeScrollView.this;
                absTNodeScrollView.scrollState = 0;
                for (ScrollChangeListener scrollChangeListener : absTNodeScrollView.mScrollChangedListener) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                AbsTNodeScrollView.access$002(AbsTNodeScrollView.this, -1L);
            }
        };
        this.scrollHelper = new c(this);
    }

    public AbsTNodeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHaveHideKeyBoard = false;
        this.mScrollChangedListener = null;
        this.mKeyBoardDismissListener = null;
        this.scrollState = 0;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AbsTNodeScrollView absTNodeScrollView = AbsTNodeScrollView.this;
                absTNodeScrollView.scrollState = 0;
                for (ScrollChangeListener scrollChangeListener : absTNodeScrollView.mScrollChangedListener) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                AbsTNodeScrollView.access$002(AbsTNodeScrollView.this, -1L);
            }
        };
        this.scrollHelper = new c(this);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mHaveHideKeyBoard = false;
        }
        if (!this.scrollHelper.a(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            ogg.b(e.getMessage());
            return false;
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.taobao.tao.flexbox.layoutmanager.module.element.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 2 && "drag".equals(this.keyBoardDismissMode) && !this.mHaveHideKeyBoard && (aVar = this.mKeyBoardDismissListener) != null) {
            aVar.onKeyBoardNeedDismiss(getContext());
            this.mHaveHideKeyBoard = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        List<ScrollChangeListener> list = this.mScrollChangedListener;
        if (list == null) {
            return;
        }
        for (ScrollChangeListener scrollChangeListener : list) {
            scrollChangeListener.onScroll(i, i2, i - i3, i2 - i4);
        }
        if (this.lastScrollUp == -1) {
            this.scrollState = 1;
            for (ScrollChangeListener scrollChangeListener2 : this.mScrollChangedListener) {
                scrollChangeListener2.onScrollStateChanged(1, 0);
            }
            this.handler.postDelayed(this.scrollStateChecker, 200L);
        } else {
            this.handler.removeCallbacks(this.scrollStateChecker);
            this.handler.postDelayed(this.scrollStateChecker, 200L);
        }
        this.lastScrollUp = System.currentTimeMillis();
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6d8986", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        int maxScrollOffset = getMaxScrollOffset();
        if (i2 > maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        if (getScrollY() == maxScrollOffset && (findTargetRecyclerView = findTargetRecyclerView(this)) != null && findTargetRecyclerView.canScrollVertically(-1) && i2 < maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollVertically = super.canScrollVertically(i);
        return (i != -1 || canScrollVertically || (findTargetRecyclerView = findTargetRecyclerView(this)) == null) ? canScrollVertically : findTargetRecyclerView.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.handler.removeCallbacks(this.scrollStateChecker);
        this.lastScrollUp = -1L;
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue() : this.scrollState;
    }

    public void setScrollComponent(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c45af4", new Object[]{this, scrollViewComponent});
        } else {
            this.component = scrollViewComponent;
        }
    }

    public int getMaxScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75ac4c88", new Object[]{this})).intValue();
        }
        ScrollViewComponent scrollViewComponent = this.component;
        if (scrollViewComponent != null && scrollViewComponent.getMaxScrollOffsetFromParams() > 0) {
            return getMaxScrollYOffset(this.component.getMaxScrollOffsetFromParams());
        }
        return 0;
    }

    private int getMaxScrollYOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d50629e", new Object[]{this, new Integer(i)})).intValue();
        }
        return getChildCount() > 0 ? clamp(i, (getHeight() - getPaddingBottom()) - getPaddingTop(), getChildAt(0).getHeight()) : i;
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, true);
        }
    }

    public TNodeRecyclerView findTargetRecyclerView(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (!(ipChange instanceof IpChange)) {
            if (view instanceof TNodeRecyclerView) {
                return (TNodeRecyclerView) view;
            }
            if ((view instanceof ViewGroup) && (!(view instanceof NestViewPager) || (view = ((TabBarControllerComponent.a) ((NestViewPager) view).getAdapter()).a()) != null)) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    TNodeRecyclerView findTargetRecyclerView = findTargetRecyclerView(viewGroup.getChildAt(i));
                    if (findTargetRecyclerView != null && findTargetRecyclerView.getOrientation() == 1) {
                        return findTargetRecyclerView;
                    }
                    i++;
                }
            } else {
                return null;
            }
        } else {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("e7bdddf5", new Object[]{this, view});
        }
    }

    public void addScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23b6572", new Object[]{this, scrollChangeListener});
            return;
        }
        if (this.mScrollChangedListener == null) {
            this.mScrollChangedListener = new ArrayList();
        }
        if (this.mScrollChangedListener.contains(scrollChangeListener)) {
            return;
        }
        this.mScrollChangedListener.add(scrollChangeListener);
    }

    public void removeScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d901aaf", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.mScrollChangedListener;
        if (list == null) {
            return;
        }
        list.remove(scrollChangeListener);
    }

    public void setKeyBoardDismissMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a1a8d5", new Object[]{this, str});
        } else {
            this.keyBoardDismissMode = str;
        }
    }

    public void setKeyBoardDismissListener(com.taobao.tao.flexbox.layoutmanager.module.element.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0e4fb1", new Object[]{this, aVar});
        } else {
            this.mKeyBoardDismissListener = aVar;
        }
    }
}
