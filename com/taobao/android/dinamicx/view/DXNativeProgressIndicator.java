package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fux;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeProgressIndicator extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int backgroundColor;
    private int indicatorColor;
    private int itemMargin;
    private int preItemWidth;
    private int sectionCount;
    private int sectionDuration;

    static {
        kge.a(646283648);
    }

    public static /* synthetic */ Object ipc$super(DXNativeProgressIndicator dXNativeProgressIndicator, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXNativeProgressIndicator(Context context) {
        super(context);
        this.preItemWidth = -1;
        init();
    }

    public DXNativeProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.preItemWidth = -1;
        init();
    }

    public DXNativeProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.preItemWidth = -1;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
        } else {
            this.indicatorColor = i;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.backgroundColor = i;
        }
    }

    public void setItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            this.itemMargin = i;
        }
    }

    public void setSectionCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc51d430", new Object[]{this, new Integer(i)});
        } else {
            this.sectionCount = i;
        }
    }

    public void setSectionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dd46e5", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDuration = i;
        }
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        fux.b("DXNativeProgressIndicator prepare");
        int i = (getLayoutParams().width / this.sectionCount) - (this.itemMargin << 1);
        int i2 = getLayoutParams().height;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        int i3 = this.itemMargin;
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i3;
        getChildCount();
        prepareView(i2, layoutParams, i);
    }

    private void prepareView(int i, LinearLayout.LayoutParams layoutParams, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e1321e", new Object[]{this, new Integer(i), layoutParams, new Integer(i2)});
        } else if (getChildCount() != this.sectionCount || this.preItemWidth != i2) {
            this.preItemWidth = i2;
            removeAllViews();
            while (i3 < this.sectionCount) {
                DXNativeProgressView dXNativeProgressView = new DXNativeProgressView(gbg.a(this), getContext());
                initIndicatorAttr(i, dXNativeProgressView);
                addView(dXNativeProgressView, layoutParams);
                i3++;
            }
        } else {
            while (i3 < getChildCount()) {
                View childAt = getChildAt(i3);
                if (childAt instanceof DXNativeProgressView) {
                    initIndicatorAttr(i, (DXNativeProgressView) childAt);
                }
                i3++;
            }
        }
    }

    private void initIndicatorAttr(int i, DXNativeProgressView dXNativeProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1371cc81", new Object[]{this, new Integer(i), dXNativeProgressView});
            return;
        }
        dXNativeProgressView.setBackgroundColor(this.backgroundColor);
        dXNativeProgressView.setCornerRadius(i / 2);
        dXNativeProgressView.setSectionDuration(this.sectionDuration);
        dXNativeProgressView.setProgressColor(this.indicatorColor);
        dXNativeProgressView.setBackgroundColor(this.backgroundColor);
    }

    public void setIndexWithAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de21026e", new Object[]{this, new Integer(i)});
            return;
        }
        fux.b("DXNativeProgressIndicator setIndexWithAnimation");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof DXNativeProgressView) {
                if (i2 < i) {
                    ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
                } else if (i2 == i) {
                    ((DXNativeProgressView) childAt).startProgress(0);
                } else {
                    ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
                }
            }
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
            return;
        }
        fux.b("DXNativeProgressIndicator setIndex");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 < i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else if (i2 == i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            } else {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            }
        }
    }

    public void initIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604736fa", new Object[]{this, new Integer(i)});
            return;
        }
        fux.b("DXNativeProgressIndicator initIndex");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i2 < i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else if (i2 == i) {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(100.0f);
            } else {
                ((DXNativeProgressView) childAt).setProgressWithoutAnim(0.0f);
            }
        }
    }
}
