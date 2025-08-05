package com.taobao.android.trade.ui.widget.wheel;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.ui.widget.wheel.j;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class WheelView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEF_VISIBLE_ITEMS = 5;
    private static final int ITEM_OFFSET_PERCENT = 0;
    private static final int PADDING = 10;
    private int[] SHADOWS_COLORS;
    private GradientDrawable bottomShadow;
    private Drawable centerDrawable;
    private List<f> changingListeners;
    private List<g> clickingListeners;
    private int currentItem;
    private DataSetObserver dataObserver;
    private boolean drawShadows;
    private int firstItem;
    public boolean isCyclic;
    private boolean isScrollingPerformed;
    private int itemHeight;
    private LinearLayout itemsLayout;
    private i recycle;
    private j scroller;
    public j.a scrollingListener;
    private List<h> scrollingListeners;
    private int scrollingOffset;
    private GradientDrawable topShadow;
    private k viewAdapter;
    private int visibleItems;
    private int wheelForeground;

    static {
        kge.a(578062526);
    }

    public static /* synthetic */ Object ipc$super(WheelView wheelView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("163971ac", new Object[]{wheelView})).booleanValue() : wheelView.isScrollingPerformed;
    }

    public static /* synthetic */ boolean access$002(WheelView wheelView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacfa46e", new Object[]{wheelView, new Boolean(z)})).booleanValue();
        }
        wheelView.isScrollingPerformed = z;
        return z;
    }

    public static /* synthetic */ void access$100(WheelView wheelView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f901ba", new Object[]{wheelView, new Integer(i)});
        } else {
            wheelView.doScroll(i);
        }
    }

    public static /* synthetic */ int access$200(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37a50b1d", new Object[]{wheelView})).intValue() : wheelView.scrollingOffset;
    }

    public static /* synthetic */ int access$202(WheelView wheelView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6d6fb4a", new Object[]{wheelView, new Integer(i)})).intValue();
        }
        wheelView.scrollingOffset = i;
        return i;
    }

    public static /* synthetic */ j access$300(WheelView wheelView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("7e377812", new Object[]{wheelView}) : wheelView.scroller;
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.SHADOWS_COLORS = new int[]{-1, -1325400065, -1862270977};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelForeground = R.drawable.trade_wheel_center;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new i(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new j.a() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                WheelView.access$002(WheelView.this, true);
                WheelView.this.notifyScrollingListenersAboutStart();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                WheelView.access$100(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.access$200(WheelView.this) > height) {
                    WheelView.access$202(WheelView.this, height);
                    WheelView.access$300(WheelView.this).a();
                    return;
                }
                int i3 = -height;
                if (WheelView.access$200(WheelView.this) >= i3) {
                    return;
                }
                WheelView.access$202(WheelView.this, i3);
                WheelView.access$300(WheelView.this).a();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                if (WheelView.access$000(WheelView.this)) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.access$002(WheelView.this, false);
                }
                WheelView.access$202(WheelView.this, 0);
                WheelView.this.invalidate();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (Math.abs(WheelView.access$200(WheelView.this)) <= 1) {
                } else {
                    WheelView.access$300(WheelView.this).a(WheelView.access$200(WheelView.this), 0);
                }
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(false);
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(true);
                }
            }
        };
        initData(context);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SHADOWS_COLORS = new int[]{-1, -1325400065, -1862270977};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelForeground = R.drawable.trade_wheel_center;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new i(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new j.a() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                WheelView.access$002(WheelView.this, true);
                WheelView.this.notifyScrollingListenersAboutStart();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                WheelView.access$100(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.access$200(WheelView.this) > height) {
                    WheelView.access$202(WheelView.this, height);
                    WheelView.access$300(WheelView.this).a();
                    return;
                }
                int i3 = -height;
                if (WheelView.access$200(WheelView.this) >= i3) {
                    return;
                }
                WheelView.access$202(WheelView.this, i3);
                WheelView.access$300(WheelView.this).a();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                if (WheelView.access$000(WheelView.this)) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.access$002(WheelView.this, false);
                }
                WheelView.access$202(WheelView.this, 0);
                WheelView.this.invalidate();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (Math.abs(WheelView.access$200(WheelView.this)) <= 1) {
                } else {
                    WheelView.access$300(WheelView.this).a(WheelView.access$200(WheelView.this), 0);
                }
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(false);
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(true);
                }
            }
        };
        initData(context);
    }

    public WheelView(Context context) {
        super(context);
        this.SHADOWS_COLORS = new int[]{-1, -1325400065, -1862270977};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelForeground = R.drawable.trade_wheel_center;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new i(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new j.a() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                WheelView.access$002(WheelView.this, true);
                WheelView.this.notifyScrollingListenersAboutStart();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void a(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                WheelView.access$100(WheelView.this, i2);
                int height = WheelView.this.getHeight();
                if (WheelView.access$200(WheelView.this) > height) {
                    WheelView.access$202(WheelView.this, height);
                    WheelView.access$300(WheelView.this).a();
                    return;
                }
                int i3 = -height;
                if (WheelView.access$200(WheelView.this) >= i3) {
                    return;
                }
                WheelView.access$202(WheelView.this, i3);
                WheelView.access$300(WheelView.this).a();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                if (WheelView.access$000(WheelView.this)) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.access$002(WheelView.this, false);
                }
                WheelView.access$202(WheelView.this, 0);
                WheelView.this.invalidate();
            }

            @Override // com.taobao.android.trade.ui.widget.wheel.j.a
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (Math.abs(WheelView.access$200(WheelView.this)) <= 1) {
                } else {
                    WheelView.access$300(WheelView.this).a(WheelView.access$200(WheelView.this), 0);
                }
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.taobao.android.trade.ui.widget.wheel.WheelView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(false);
                }
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                } else {
                    WheelView.this.invalidateWheel(true);
                }
            }
        };
        initData(context);
    }

    private void initData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379c287", new Object[]{this, context});
        } else {
            this.scroller = new j(getContext(), this.scrollingListener);
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.scroller.a(interpolator);
        }
    }

    public int getVisibleItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2b4835e", new Object[]{this})).intValue() : this.visibleItems;
    }

    public void setVisibleItems(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f72696c", new Object[]{this, new Integer(i)});
        } else {
            this.visibleItems = i;
        }
    }

    public k getViewAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("c489ffe1", new Object[]{this}) : this.viewAdapter;
    }

    public void setViewAdapter(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d9c615", new Object[]{this, kVar});
            return;
        }
        this.viewAdapter = kVar;
        invalidateWheel(true);
    }

    public void addChangingListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577e0814", new Object[]{this, fVar});
        } else {
            this.changingListeners.add(fVar);
        }
    }

    public void removeChangingListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4516eff7", new Object[]{this, fVar});
        } else {
            this.changingListeners.remove(fVar);
        }
    }

    public void notifyChangingListeners(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54759070", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<f> it = this.changingListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void addScrollingListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0684f8", new Object[]{this, hVar});
        } else {
            this.scrollingListeners.add(hVar);
        }
    }

    public void removeScrollingListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08a9975", new Object[]{this, hVar});
        } else {
            this.scrollingListeners.remove(hVar);
        }
    }

    public void notifyScrollingListenersAboutStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5bc0af", new Object[]{this});
            return;
        }
        Iterator<h> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void notifyScrollingListenersAboutEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad1a28", new Object[]{this});
            return;
        }
        Iterator<h> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void addClickingListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb15260", new Object[]{this, gVar});
        } else {
            this.clickingListeners.add(gVar);
        }
    }

    public void removeClickingListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4a3a43", new Object[]{this, gVar});
        } else {
            this.clickingListeners.remove(gVar);
        }
    }

    public void notifyClickListenersAboutClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149dce1", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<g> it = this.clickingListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue() : this.currentItem;
    }

    public void setCurrentItem(int i, boolean z) {
        int min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        k kVar = this.viewAdapter;
        if (kVar == null || kVar.a() == 0) {
            return;
        }
        int a2 = this.viewAdapter.a();
        if (i < 0 || i >= a2) {
            if (!this.isCyclic) {
                return;
            }
            while (i < 0) {
                i += a2;
            }
            i %= a2;
        }
        int i2 = this.currentItem;
        if (i == i2) {
            return;
        }
        if (z) {
            int i3 = i - i2;
            if (this.isCyclic && (min = (a2 + Math.min(i, i2)) - Math.max(i, this.currentItem)) < Math.abs(i3)) {
                i3 = i3 < 0 ? min : -min;
            }
            scroll(i3, 0);
            return;
        }
        this.scrollingOffset = 0;
        this.currentItem = i;
        notifyChangingListeners(i2, this.currentItem);
        invalidate();
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItem(i, false);
        }
    }

    public boolean isCyclic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4415018e", new Object[]{this})).booleanValue() : this.isCyclic;
    }

    public void setCyclic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d30052", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isCyclic = z;
        invalidateWheel(false);
    }

    public boolean drawShadows() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8e0967a", new Object[]{this})).booleanValue() : this.drawShadows;
    }

    public void setDrawShadows(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf07e7a0", new Object[]{this, new Boolean(z)});
        } else {
            this.drawShadows = z;
        }
    }

    public void setShadowColor(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147cc53b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.SHADOWS_COLORS = new int[]{i, i2, i3};
        }
    }

    public void setWheelBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaf9d95", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(-1);
        }
    }

    public void setWheelForeground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c1cea0", new Object[]{this, new Integer(i)});
            return;
        }
        this.wheelForeground = i;
        this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
    }

    public void invalidateWheel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c11e44d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.recycle.c();
            LinearLayout linearLayout = this.itemsLayout;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.scrollingOffset = 0;
        } else {
            LinearLayout linearLayout2 = this.itemsLayout;
            if (linearLayout2 != null) {
                this.recycle.a(linearLayout2, this.firstItem, new d());
            }
        }
        invalidate();
    }

    private void initResourcesIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19f1a84", new Object[]{this});
            return;
        }
        if (this.centerDrawable == null) {
            this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
        }
        if (this.topShadow == null) {
            this.topShadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.SHADOWS_COLORS);
        }
        if (this.bottomShadow == null) {
            this.bottomShadow = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.SHADOWS_COLORS);
        }
        setBackgroundColor(-1);
    }

    private int getDesiredHeight(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a708a68", new Object[]{this, linearLayout})).intValue();
        }
        if (linearLayout != null && linearLayout.getChildAt(0) != null) {
            this.itemHeight = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        return Math.max((this.itemHeight * this.visibleItems) - 0, getSuggestedMinimumHeight());
    }

    private int getItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f9d28a", new Object[]{this})).intValue();
        }
        int i = this.itemHeight;
        if (i != 0) {
            return i;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null && linearLayout.getChildAt(0) != null) {
            this.itemHeight = this.itemsLayout.getChildAt(0).getHeight();
            return this.itemHeight;
        }
        return getHeight() / this.visibleItems;
    }

    private int calculateLayoutWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d5c410", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        initResourcesIfNecessary();
        this.itemsLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.itemsLayout.getMeasuredWidth();
        if (i2 != 1073741824) {
            int max = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= max) {
                i = max;
            }
        }
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i - 20, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        buildViewForMeasuring();
        int calculateLayoutWidth = calculateLayoutWidth(size, mode);
        if (mode2 != 1073741824) {
            int desiredHeight = getDesiredHeight(this.itemsLayout);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
        }
        setMeasuredDimension(calculateLayoutWidth, size2);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layout(i3 - i, i4 - i2);
        }
    }

    private void layout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0d52d1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.itemsLayout.layout(0, 0, i - 20, i2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        k kVar = this.viewAdapter;
        if (kVar == null || kVar.a() <= 0) {
            return;
        }
        updateView();
        drawItems(canvas);
        if (this.drawShadows) {
            drawShadows(canvas);
        }
        drawCenterRect(canvas);
    }

    private void drawShadows(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8533af", new Object[]{this, canvas});
            return;
        }
        int itemHeight = getItemHeight();
        this.topShadow.setBounds(0, 0, getWidth(), itemHeight);
        this.topShadow.draw(canvas);
        this.bottomShadow.setBounds(0, getHeight() - itemHeight, getWidth(), getHeight());
        this.bottomShadow.draw(canvas);
    }

    private void drawItems(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c51362", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        canvas.translate(10.0f, (-(((this.currentItem - this.firstItem) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.scrollingOffset);
        this.itemsLayout.draw(canvas);
        canvas.restore();
    }

    private void drawCenterRect(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6d43a1", new Object[]{this, canvas});
            return;
        }
        int height = getHeight() / 2;
        int itemHeight = (int) ((getItemHeight() / 2) * 1.2d);
        this.centerDrawable.setBounds(dp2px(10.0f), height - itemHeight, getWidth() - dp2px(10.0f), height + itemHeight);
        this.centerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int itemHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (!this.isScrollingPerformed) {
            int y = ((int) motionEvent.getY()) - (getHeight() / 2);
            if (y > 0) {
                itemHeight = y + (getItemHeight() / 2);
            } else {
                itemHeight = y - (getItemHeight() / 2);
            }
            int itemHeight2 = itemHeight / getItemHeight();
            if (itemHeight2 != 0 && isValidItemIndex(this.currentItem + itemHeight2)) {
                notifyClickListenersAboutClick(this.currentItem + itemHeight2);
            }
        }
        return this.scroller.a(motionEvent);
    }

    private void doScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce5b724", new Object[]{this, new Integer(i)});
            return;
        }
        this.scrollingOffset += i;
        int itemHeight = getItemHeight();
        int i2 = this.scrollingOffset / itemHeight;
        int i3 = this.currentItem - i2;
        int a2 = this.viewAdapter.a();
        int i4 = this.scrollingOffset % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (this.isCyclic && a2 > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += a2;
            }
            i3 %= a2;
        } else if (i3 < 0) {
            i2 = this.currentItem;
            i3 = 0;
        } else if (i3 >= a2) {
            i2 = (this.currentItem - a2) + 1;
            i3 = a2 - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < a2 - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = this.scrollingOffset;
        if (i3 != this.currentItem) {
            setCurrentItem(i3, false);
        } else {
            invalidate();
        }
        this.scrollingOffset = i5 - (i2 * itemHeight);
        if (this.scrollingOffset <= getHeight()) {
            return;
        }
        this.scrollingOffset = (this.scrollingOffset % getHeight()) + getHeight();
    }

    public void scroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9093b834", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.scroller.a((i * getItemHeight()) - this.scrollingOffset, i2);
        }
    }

    private d getItemsRange() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5040eb89", new Object[]{this});
        }
        if (getItemHeight() == 0) {
            return null;
        }
        int i2 = this.currentItem;
        while (getItemHeight() * i < getHeight()) {
            i2--;
            i += 2;
        }
        int i3 = this.scrollingOffset;
        if (i3 != 0) {
            if (i3 > 0) {
                i2--;
            }
            int itemHeight = this.scrollingOffset / getItemHeight();
            i2 -= itemHeight;
            i = (int) (i + 1 + Math.asin(itemHeight));
        }
        return new d(i2, i);
    }

    private boolean rebuildItems() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd22fa70", new Object[]{this})).booleanValue();
        }
        d itemsRange = getItemsRange();
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            int a2 = this.recycle.a(linearLayout, this.firstItem, itemsRange);
            z = this.firstItem != a2;
            this.firstItem = a2;
        } else {
            createItemsLayout();
            z = true;
        }
        if (!z) {
            z = (this.firstItem == itemsRange.a() && this.itemsLayout.getChildCount() == itemsRange.c()) ? false : true;
        }
        if (this.firstItem > itemsRange.a() && this.firstItem <= itemsRange.b()) {
            for (int i = this.firstItem - 1; i >= itemsRange.a() && addViewItem(i, true); i--) {
                this.firstItem = i;
            }
        } else {
            this.firstItem = itemsRange.a();
        }
        int i2 = this.firstItem;
        for (int childCount = this.itemsLayout.getChildCount(); childCount < itemsRange.c(); childCount++) {
            if (!addViewItem(this.firstItem + childCount, false) && this.itemsLayout.getChildCount() == 0) {
                i2++;
            }
        }
        this.firstItem = i2;
        return z;
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else if (!rebuildItems()) {
        } else {
            calculateLayoutWidth(getWidth(), 1073741824);
            layout(getWidth(), getHeight());
        }
    }

    private void createItemsLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67b6df5", new Object[]{this});
        } else if (this.itemsLayout != null) {
        } else {
            this.itemsLayout = new LinearLayout(getContext());
            this.itemsLayout.setOrientation(1);
            this.itemsLayout.setGravity(1);
        }
    }

    private void buildViewForMeasuring() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9da1fac", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            this.recycle.a(linearLayout, this.firstItem, new d());
        } else {
            createItemsLayout();
        }
        int i = this.visibleItems / 2;
        for (int i2 = this.currentItem + i; i2 >= this.currentItem - i; i2--) {
            if (addViewItem(i2, true)) {
                this.firstItem = i2;
            }
        }
    }

    private boolean addViewItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6558a355", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        View itemView = getItemView(i);
        if (itemView == null) {
            return false;
        }
        if (z) {
            this.itemsLayout.addView(itemView, 0);
        } else {
            this.itemsLayout.addView(itemView);
        }
        return true;
    }

    private boolean isValidItemIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbbf5ed3", new Object[]{this, new Integer(i)})).booleanValue();
        }
        k kVar = this.viewAdapter;
        return kVar != null && kVar.a() > 0 && (this.isCyclic || (i >= 0 && i < this.viewAdapter.a()));
    }

    private View getItemView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("27202b10", new Object[]{this, new Integer(i)});
        }
        k kVar = this.viewAdapter;
        if (kVar == null || kVar.a() == 0) {
            return null;
        }
        int a2 = this.viewAdapter.a();
        if (!isValidItemIndex(i)) {
            return this.viewAdapter.a(this.recycle.b(), this.itemsLayout);
        }
        while (i < 0) {
            i += a2;
        }
        return this.viewAdapter.a(i % a2, this.recycle.a(), this.itemsLayout);
    }

    public void stopScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95325f1a", new Object[]{this});
        } else {
            this.scroller.a();
        }
    }

    public int dp2px(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{this, new Float(f)})).intValue() : (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
