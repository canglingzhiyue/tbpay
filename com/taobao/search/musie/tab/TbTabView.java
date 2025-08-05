package com.taobao.search.musie.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TbTabView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Scroller scroller;
    private TabContainer tabContainer;

    static {
        kge.a(416891670);
    }

    public static /* synthetic */ Object ipc$super(TbTabView tbTabView, String str, Object... objArr) {
        if (str.hashCode() == -894236565) {
            super.computeScroll();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TbTabView(Context context) {
        this(context, null);
    }

    public TbTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.tabContainer = new TabContainer(getContext());
        addView(this.tabContainer, new FrameLayout.LayoutParams(-1, -1));
        setHorizontalScrollBarEnabled(false);
        this.scroller = new Scroller(getContext());
    }

    public void setPadding(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36282d36", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.tabContainer.setPadding(i, i2);
        }
    }

    public void setItemInset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3e58d4", new Object[]{this, new Integer(i)});
        } else {
            this.tabContainer.setItemInset(i);
        }
    }

    public void setSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f095a7b", new Object[]{this, new Integer(i)});
        } else {
            this.tabContainer.setSpacing(i);
        }
    }

    public void setStyle(d dVar, d dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee62296", new Object[]{this, dVar, dVar2});
        } else {
            this.tabContainer.setTabStyle(dVar, dVar2);
        }
    }

    public void setTabs(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56510678", new Object[]{this, list});
        } else {
            this.tabContainer.bind(list);
        }
    }

    public void setTabClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11cf2c6", new Object[]{this, aVar});
        } else {
            this.tabContainer.setTabClickListener(aVar);
        }
    }

    public void setAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f4628", new Object[]{this, new Boolean(z)});
        } else {
            this.tabContainer.setAnimated(z);
        }
    }

    public void setTabSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88931c8e", new Object[]{this, new Integer(i)});
        } else {
            this.tabContainer.setTabSelected(i);
        }
    }

    public void scrollToTab(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0775fe", new Object[]{this, view});
            return;
        }
        this.scroller.abortAnimation();
        int left = view.getLeft();
        int scrollX = getScrollX();
        int measuredWidth = this.tabContainer.getMeasuredWidth() - getMeasuredWidth();
        int measuredWidth2 = (left - scrollX) - ((getMeasuredWidth() - view.getWidth()) / 2);
        if (scrollX + measuredWidth2 > measuredWidth) {
            measuredWidth2 = measuredWidth - scrollX;
        }
        this.scroller.startScroll(scrollX, 0, measuredWidth2, 0);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (!this.scroller.computeScrollOffset()) {
            return;
        }
        scrollTo(this.scroller.getCurrX(), 0);
        invalidate();
    }
}
