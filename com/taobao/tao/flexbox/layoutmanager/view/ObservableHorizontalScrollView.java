package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ObservableHorizontalScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYBOARD_DISMISS_MODE_DRAG = "drag";
    private ScrollViewComponent component;
    private Handler handler;
    private String keyBoardDismissMode;
    private long lastScrollUp;
    private boolean mHaveHideKeyBoard;
    private com.taobao.tao.flexbox.layoutmanager.module.element.a mKeyBoardDismissListener;
    private List<ScrollChangeListener> mScrollChangedListener;
    private int scrollState;
    private Runnable scrollStateChecker;

    static {
        kge.a(-4752614);
    }

    public static /* synthetic */ Object ipc$super(ObservableHorizontalScrollView observableHorizontalScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
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

    public static /* synthetic */ int access$002(ObservableHorizontalScrollView observableHorizontalScrollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d2d0e8", new Object[]{observableHorizontalScrollView, new Integer(i)})).intValue();
        }
        observableHorizontalScrollView.scrollState = i;
        return i;
    }

    public static /* synthetic */ List access$100(ObservableHorizontalScrollView observableHorizontalScrollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d4dd415a", new Object[]{observableHorizontalScrollView}) : observableHorizontalScrollView.mScrollChangedListener;
    }

    public static /* synthetic */ long access$202(ObservableHorizontalScrollView observableHorizontalScrollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2135a8e8", new Object[]{observableHorizontalScrollView, new Long(j)})).longValue();
        }
        observableHorizontalScrollView.lastScrollUp = j;
        return j;
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue() : this.scrollState;
    }

    public ObservableHorizontalScrollView(Context context) {
        super(context);
        this.mScrollChangedListener = null;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollState = 0;
        this.mKeyBoardDismissListener = null;
        this.mHaveHideKeyBoard = false;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ObservableHorizontalScrollView.access$002(ObservableHorizontalScrollView.this, 0);
                for (ScrollChangeListener scrollChangeListener : ObservableHorizontalScrollView.access$100(ObservableHorizontalScrollView.this)) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                ObservableHorizontalScrollView.access$202(ObservableHorizontalScrollView.this, -1L);
            }
        };
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
            return;
        }
        setOverScrollMode(0);
        com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, false);
    }

    public void setScrollViewComponent(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7caa64f", new Object[]{this, scrollViewComponent});
        } else {
            this.component = scrollViewComponent;
        }
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollChangedListener = null;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollState = 0;
        this.mKeyBoardDismissListener = null;
        this.mHaveHideKeyBoard = false;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ObservableHorizontalScrollView.access$002(ObservableHorizontalScrollView.this, 0);
                for (ScrollChangeListener scrollChangeListener : ObservableHorizontalScrollView.access$100(ObservableHorizontalScrollView.this)) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                ObservableHorizontalScrollView.access$202(ObservableHorizontalScrollView.this, -1L);
            }
        };
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollChangedListener = null;
        this.handler = new Handler(Looper.getMainLooper());
        this.lastScrollUp = -1L;
        this.scrollState = 0;
        this.mKeyBoardDismissListener = null;
        this.mHaveHideKeyBoard = false;
        this.scrollStateChecker = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ObservableHorizontalScrollView.access$002(ObservableHorizontalScrollView.this, 0);
                for (ScrollChangeListener scrollChangeListener : ObservableHorizontalScrollView.access$100(ObservableHorizontalScrollView.this)) {
                    scrollChangeListener.onScrollStateChanged(0, 0);
                }
                ObservableHorizontalScrollView.access$202(ObservableHorizontalScrollView.this, -1L);
            }
        };
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

    @Override // android.view.View
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

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ScrollViewComponent scrollViewComponent = this.component;
        if (scrollViewComponent != null) {
            scrollViewComponent.cleanPendingExposureEvent();
        }
        this.handler.removeCallbacks(this.scrollStateChecker);
        this.lastScrollUp = -1L;
    }

    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            scrollToPosition(i, false);
        }
    }

    public void scrollToPosition(int i, boolean z) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add7cda9", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        View childAt2 = getChildAt(0);
        if (childAt2 == null || !(childAt2 instanceof ViewGroup) || (childAt = ((ViewGroup) childAt2).getChildAt(i)) == null) {
            return;
        }
        Rect rect = new Rect();
        childAt.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(childAt, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen == 0) {
            return;
        }
        if (z) {
            smoothScrollBy(computeScrollDeltaToGetChildRectOnScreen, 0);
        } else {
            scrollBy(computeScrollDeltaToGetChildRectOnScreen, 0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mHaveHideKeyBoard = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
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

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mScrollChangedListener = null;
        this.component = null;
        this.lastScrollUp = -1L;
        this.scrollState = 0;
        this.mKeyBoardDismissListener = null;
        this.keyBoardDismissMode = null;
        this.mHaveHideKeyBoard = false;
    }
}
