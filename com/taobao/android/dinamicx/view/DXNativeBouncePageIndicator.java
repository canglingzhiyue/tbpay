package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeBouncePageIndicator extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentIndex;
    public DXNativePageIndicator dxNativePageIndicator;
    private int itemMargin;
    private int itemRoundDiameter;
    private int itemSelectedBorderColor;
    private int itemSelectedBorderWidth;
    private int itemUnSelectedBorderColor;
    private int itemUnSelectedBorderWidth;
    private int leftRange;
    private int maxDisplayCount;
    private int pageCount;
    private int previousIndex;
    private int rightRange;
    private GradientDrawable selectedDrawable;
    private GradientDrawable unselectedDrawable;

    static {
        kge.a(886502966);
    }

    public static /* synthetic */ Object ipc$super(DXNativeBouncePageIndicator dXNativeBouncePageIndicator, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int access$000(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e70e13a3", new Object[]{dXNativeBouncePageIndicator})).intValue() : dXNativeBouncePageIndicator.itemMargin;
    }

    public static /* synthetic */ int access$100(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d85fa324", new Object[]{dXNativeBouncePageIndicator})).intValue() : dXNativeBouncePageIndicator.itemRoundDiameter;
    }

    public static /* synthetic */ int access$200(DXNativeBouncePageIndicator dXNativeBouncePageIndicator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9b132a5", new Object[]{dXNativeBouncePageIndicator})).intValue() : dXNativeBouncePageIndicator.leftRange;
    }

    public DXNativeBouncePageIndicator(Context context) {
        super(context);
        this.leftRange = -1;
        this.rightRange = -1;
        this.dxNativePageIndicator = null;
        init(context);
    }

    public DXNativeBouncePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.leftRange = -1;
        this.rightRange = -1;
        this.dxNativePageIndicator = null;
        init(context);
    }

    public DXNativeBouncePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.leftRange = -1;
        this.rightRange = -1;
        this.dxNativePageIndicator = null;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setHorizontalScrollBarEnabled(false);
        this.dxNativePageIndicator = new DXNativePageIndicator(context);
        addView(this.dxNativePageIndicator);
        this.currentIndex = this.dxNativePageIndicator.getCurrentIndex();
    }

    public void setSelectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6c761", new Object[]{this, new Integer(i)});
        } else {
            this.dxNativePageIndicator.setSelectedDrawable(i);
        }
    }

    public void setUnselectedDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c239cae8", new Object[]{this, new Integer(i)});
        } else {
            this.dxNativePageIndicator.setUnselectedDrawable(i);
        }
    }

    public void setSelectedView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a6a33a", new Object[]{this, new Integer(i)});
        } else if (i >= this.pageCount) {
        } else {
            this.previousIndex = this.dxNativePageIndicator.getCurrentIndex();
            this.dxNativePageIndicator.setSelectedView(i);
            this.currentIndex = this.dxNativePageIndicator.getCurrentIndex();
            checkRangeChange(this.currentIndex);
        }
    }

    public void setInitWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842c681c", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        while (i < i2) {
            this.dxNativePageIndicator.setItemNormal(i);
            if (i == i2 - 1) {
                this.dxNativePageIndicator.setItemSmall(i);
            }
            i++;
        }
    }

    public void setMiddleWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48ece1", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        this.dxNativePageIndicator.setItemSmall(i);
        for (int i3 = i + 1; i3 < i2; i3++) {
            this.dxNativePageIndicator.setItemNormal(i3);
            if (i3 == i2 - 1) {
                this.dxNativePageIndicator.setItemSmall(i3);
            }
        }
    }

    public void setLastWindowDisplay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b8022", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.maxDisplayCount + i;
        this.dxNativePageIndicator.setItemSmall(i);
        for (int i3 = i + 1; i3 < i2; i3++) {
            this.dxNativePageIndicator.setItemNormal(i3);
        }
    }

    public void addChildViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb9f31a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.pageCount = i;
        this.dxNativePageIndicator.addChildViews(i, i2);
        this.currentIndex = this.dxNativePageIndicator.getCurrentIndex();
        checkRangeChange(i2);
    }

    private boolean inRange(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29ee0348", new Object[]{this, new Integer(i)})).booleanValue() : i > this.leftRange && i < this.rightRange;
    }

    private void checkRangeChange(int i) {
        int i2;
        int i3;
        int max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30768957", new Object[]{this, new Integer(i)});
        } else if (inRange(i) || (i2 = this.maxDisplayCount) >= (i3 = this.pageCount)) {
        } else {
            int i4 = i2 - 1;
            int i5 = i3 - i2;
            if (i >= i4) {
                max = Math.min(i5, Math.max((i - i4) + 1, this.leftRange - 1));
            } else {
                max = Math.max(0, Math.min(i - 1, this.leftRange - 1));
            }
            int i6 = (this.maxDisplayCount + max) - 1;
            if (max == this.leftRange && i6 == this.rightRange) {
                return;
            }
            boolean z = this.leftRange == -1 && this.rightRange == -1;
            this.leftRange = max;
            this.rightRange = i6;
            if (z) {
                post(new Runnable() { // from class: com.taobao.android.dinamicx.view.DXNativeBouncePageIndicator.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        DXNativeBouncePageIndicator dXNativeBouncePageIndicator = DXNativeBouncePageIndicator.this;
                        dXNativeBouncePageIndicator.scrollTo((DXNativeBouncePageIndicator.access$000(dXNativeBouncePageIndicator) + DXNativeBouncePageIndicator.access$100(DXNativeBouncePageIndicator.this)) * DXNativeBouncePageIndicator.access$200(DXNativeBouncePageIndicator.this), DXNativeBouncePageIndicator.this.getScrollY());
                    }
                });
            } else {
                smoothScrollTo((this.itemMargin + this.itemRoundDiameter) * this.leftRange, getScrollY());
            }
            int i7 = this.leftRange;
            if (i7 == 0) {
                setInitWindowDisplay(0);
            } else if (this.rightRange == this.pageCount - 1) {
                setLastWindowDisplay(i7);
            } else {
                setMiddleWindowDisplay(i7);
            }
        }
    }

    public int getMaxDisplayCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b295f5b5", new Object[]{this})).intValue() : this.maxDisplayCount;
    }

    public void setMaxDisplayCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7c648d", new Object[]{this, new Integer(i)});
        } else {
            this.maxDisplayCount = i;
        }
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue() : this.dxNativePageIndicator.getCurrentIndex();
    }

    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else {
            this.currentIndex = i;
        }
    }

    public int getItemMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a22b91", new Object[]{this})).intValue() : this.itemMargin;
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemMargin(i);
        this.itemMargin = i;
    }

    public int getItemRoundDiameter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6551eaac", new Object[]{this})).intValue() : this.itemRoundDiameter;
    }

    public void setItemRoundDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f7b76", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemRoundDiameter(i);
        this.itemRoundDiameter = i;
    }

    public int getItemSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7815cdad", new Object[]{this})).intValue() : this.itemSelectedBorderColor;
    }

    public void setItemSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dbf95", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemSelectedBorderColor(i);
        this.itemSelectedBorderColor = i;
    }

    public int getItemSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fef0e290", new Object[]{this})).intValue() : this.itemSelectedBorderWidth;
    }

    public void setItemSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da154712", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemSelectedBorderWidth(i);
        this.itemSelectedBorderWidth = i;
    }

    public int getItemUnSelectedBorderColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8478914", new Object[]{this})).intValue() : this.itemUnSelectedBorderColor;
    }

    public void setItemUnSelectedBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c6de0e", new Object[]{this, new Integer(i)});
            return;
        }
        this.dxNativePageIndicator.setItemUnSelectedBorderColor(i);
        this.itemUnSelectedBorderColor = i;
    }

    public int getItemUnSelectedBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f229df7", new Object[]{this})).intValue() : this.itemUnSelectedBorderWidth;
    }

    public void setItemUnSelectedBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e658b", new Object[]{this, new Integer(i)});
        } else {
            this.itemUnSelectedBorderWidth = i;
        }
    }
}
