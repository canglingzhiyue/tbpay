package com.taobao.search.musie.tab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TabContainer extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animated;
    private boolean hasLayout;
    private int itemInset;
    private b lastSelectedTab;
    private boolean layoutAverage;
    private d normalStyle;
    private int selectedIndex;
    private d selectedStyle;
    private int spacing;
    private a tabClickListener;
    private List<b> tabList;

    static {
        kge.a(1621977762);
    }

    public static /* synthetic */ Object ipc$super(TabContainer tabContainer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a access$000(TabContainer tabContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("db9a12ca", new Object[]{tabContainer}) : tabContainer.tabClickListener;
    }

    public TabContainer(Context context) {
        super(context);
        this.layoutAverage = false;
        this.hasLayout = false;
        this.lastSelectedTab = null;
        this.selectedIndex = 0;
        this.animated = true;
    }

    public void setItemInset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3e58d4", new Object[]{this, new Integer(i)});
        } else if (this.itemInset == i) {
        } else {
            this.itemInset = i;
            refreshIfHasLayout();
        }
    }

    public void setSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f095a7b", new Object[]{this, new Integer(i)});
        } else if (this.spacing == i) {
        } else {
            this.spacing = i;
            refreshIfHasLayout();
        }
    }

    public void setTabStyle(d dVar, d dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109abe05", new Object[]{this, dVar, dVar2});
            return;
        }
        this.normalStyle = dVar;
        this.selectedStyle = dVar2;
        List<b> list = this.tabList;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            bVar.a(this.normalStyle, this.selectedStyle);
        }
    }

    private void refreshIfHasLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38521e73", new Object[]{this});
        } else if (!this.hasLayout) {
        } else {
            requestLayout();
            this.hasLayout = false;
        }
    }

    public void setPadding(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36282d36", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getPaddingLeft() == i && getPaddingRight() == i2) {
        } else {
            setPadding(i, 0, i2, 0);
            refreshIfHasLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i3 = paddingLeft;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            measureChildWithMargins(childAt, i, 0, i2, 0);
            i3 += childAt.getMeasuredWidth();
        }
        int childCount2 = i3 + ((getChildCount() - 1) * this.spacing);
        int size = View.MeasureSpec.getSize(i);
        if (childCount2 > size) {
            setMeasuredDimension(childCount2, View.MeasureSpec.getSize(i2));
            this.layoutAverage = false;
        } else {
            setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
            this.layoutAverage = true;
        }
        this.hasLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() != 0) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int paddingLeft = getPaddingLeft();
            int childCount = measuredWidth / getChildCount();
            int childCount2 = getChildCount();
            int i5 = paddingLeft;
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt = getChildAt(i6);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.layoutAverage) {
                    int i7 = ((childCount - measuredWidth2) / 2) + i5;
                    childAt.layout(i7, 0, measuredWidth2 + i7, measuredHeight);
                    i5 += childCount;
                } else {
                    int i8 = measuredWidth2 + i5;
                    childAt.layout(i5, 0, i8, childAt.getMeasuredHeight());
                    i5 = i8 + this.spacing;
                }
            }
        }
    }

    public void setTabSelected(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56917ac0", new Object[]{this, bVar});
            return;
        }
        b bVar2 = this.lastSelectedTab;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        bVar.a(true);
        this.lastSelectedTab = bVar;
    }

    public void setTabSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88931c8e", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.selectedIndex = i;
            List<b> list = this.tabList;
            if (list == null || i >= list.size()) {
                return;
            }
            setTabSelected(this.tabList.get(i));
            scrollTabToCenter();
        }
    }

    public void scrollTabToCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4684df", new Object[]{this});
            return;
        }
        b bVar = this.lastSelectedTab;
        if (bVar == null) {
            return;
        }
        ((TbTabView) getParent()).scrollToTab(bVar.a());
    }

    public void setTabClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11cf2c6", new Object[]{this, aVar});
        } else {
            this.tabClickListener = aVar;
        }
    }

    public void setAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f4628", new Object[]{this, new Boolean(z)});
            return;
        }
        this.animated = z;
        List<b> list = this.tabList;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            bVar.c(z);
        }
    }

    public void bind(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a136c735", new Object[]{this, list});
            return;
        }
        removeAllViews();
        if (list == null) {
            return;
        }
        if (this.selectedIndex >= list.size()) {
            this.selectedIndex = 0;
        }
        this.tabList = list;
        final int i = 0;
        for (b bVar : list) {
            int i2 = i + 1;
            View a2 = bVar.a(getContext());
            bVar.a(this.normalStyle, this.selectedStyle);
            bVar.c(this.animated);
            bVar.a(i == this.selectedIndex);
            if (i == this.selectedIndex) {
                this.lastSelectedTab = bVar;
                a2.post(new Runnable() { // from class: com.taobao.search.musie.tab.TabContainer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TabContainer.this.scrollTabToCenter();
                        }
                    }
                });
            }
            int i3 = this.itemInset;
            a2.setPadding(i3, 0, i3, 0);
            addView(a2, new ViewGroup.MarginLayoutParams(-2, -1));
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.musie.tab.TabContainer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TabContainer.access$000(TabContainer.this) == null) {
                    } else {
                        TabContainer.access$000(TabContainer.this).onTabClick(i);
                    }
                }
            });
            i = i2;
        }
    }
}
