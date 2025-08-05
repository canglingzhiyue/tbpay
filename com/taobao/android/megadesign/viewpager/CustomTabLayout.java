package com.taobao.android.megadesign.viewpager;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/android/megadesign/viewpager/CustomTabLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mInitTabIndex", "", "mSelectedTabIndex", "mTabClickListener", "Lcom/taobao/android/megadesign/viewpager/CustomTabLayout$OnTabClickListener;", "mTabs", "", "Landroid/view/View;", "mViewPager", "Landroid/support/v4/view/ViewPager;", "addTab", "", "tabView", "title", "", "selectTab", "index", "setInitTabIndex", "setOnTabClickListener", DataReceiveMonitor.CB_LISTENER, "setTabIndex", "setupWithViewPager", OrderConfigs.VIEWPAGER, "OnTabClickListener", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class CustomTabLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mInitTabIndex;
    private int mSelectedTabIndex;
    private a mTabClickListener;
    private final List<View> mTabs;
    private ViewPager mViewPager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/megadesign/viewpager/CustomTabLayout$OnTabClickListener;", "", "onTabClick", "", "position", "", "tabView", "Landroid/view/View;", "onTabSelected", "curPosition", "lastPosition", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            CustomTabLayout.access$selectTab(customTabLayout, CustomTabLayout.access$getMTabs$p(customTabLayout).indexOf(this.b));
            if (CustomTabLayout.access$getMTabClickListener$p(CustomTabLayout.this) != null) {
                CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b);
                View tabView = this.b;
                q.b(tabView, "tabView");
            }
            ViewPager access$getMViewPager$p = CustomTabLayout.access$getMViewPager$p(CustomTabLayout.this);
            if (access$getMViewPager$p == null) {
                return;
            }
            access$getMViewPager$p.setCurrentItem(CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CustomTabLayout customTabLayout = CustomTabLayout.this;
            CustomTabLayout.access$selectTab(customTabLayout, CustomTabLayout.access$getMTabs$p(customTabLayout).indexOf(this.b));
            if (CustomTabLayout.access$getMTabClickListener$p(CustomTabLayout.this) != null) {
                CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b);
            }
            ViewPager access$getMViewPager$p = CustomTabLayout.access$getMViewPager$p(CustomTabLayout.this);
            if (access$getMViewPager$p == null) {
                return;
            }
            access$getMViewPager$p.setCurrentItem(CustomTabLayout.access$getMTabs$p(CustomTabLayout.this).indexOf(this.b));
        }
    }

    public static /* synthetic */ Object ipc$super(CustomTabLayout customTabLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        q.d(context, "context");
        q.d(attrs, "attrs");
        this.mSelectedTabIndex = -1;
        this.mTabs = new ArrayList();
        setOrientation(0);
    }

    public static final /* synthetic */ a access$getMTabClickListener$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("86acbfe2", new Object[]{customTabLayout}) : customTabLayout.mTabClickListener;
    }

    public static final /* synthetic */ List access$getMTabs$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8661cb3f", new Object[]{customTabLayout}) : customTabLayout.mTabs;
    }

    public static final /* synthetic */ ViewPager access$getMViewPager$p(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("37f08ae2", new Object[]{customTabLayout}) : customTabLayout.mViewPager;
    }

    public static final /* synthetic */ void access$selectTab(CustomTabLayout customTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaccdb13", new Object[]{customTabLayout, new Integer(i)});
        } else {
            customTabLayout.selectTab(i);
        }
    }

    public static final /* synthetic */ void access$setMTabClickListener$p(CustomTabLayout customTabLayout, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f41c8", new Object[]{customTabLayout, aVar});
        } else {
            customTabLayout.mTabClickListener = aVar;
        }
    }

    public static final /* synthetic */ void access$setMViewPager$p(CustomTabLayout customTabLayout, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee036fd2", new Object[]{customTabLayout, viewPager});
        } else {
            customTabLayout.mViewPager = viewPager;
        }
    }

    public final void addTab(String title) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, title});
            return;
        }
        q.d(title, "title");
        View tabView = LayoutInflater.from(getContext()).inflate(R.layout.custom_tab_item, (ViewGroup) this, false);
        TextView tabText = (TextView) tabView.findViewById(R.id.tab_item_text);
        q.b(tabText, "tabText");
        tabText.setText(title);
        tabView.setOnClickListener(new b(tabView));
        addView(tabView);
        List<View> list = this.mTabs;
        q.b(tabView, "tabView");
        list.add(tabView);
    }

    public final void addTab(View tabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f36e737", new Object[]{this, tabView});
            return;
        }
        q.d(tabView, "tabView");
        tabView.setOnClickListener(new c(tabView));
        addView(tabView);
        this.mTabs.add(tabView);
    }

    private final void selectTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
        } else if (i == this.mSelectedTabIndex || this.mTabs.isEmpty()) {
        } else {
            a aVar = this.mTabClickListener;
            if (aVar != null) {
                aVar.a(i, this.mSelectedTabIndex);
            }
            int i2 = this.mSelectedTabIndex;
            if (i2 != -1) {
                ((TextView) this.mTabs.get(i2).findViewById(R.id.tab_item_text)).setTextColor(ContextCompat.getColor(getContext(), R.color.tb_text_secondary2));
            }
            this.mSelectedTabIndex = i;
            ((TextView) this.mTabs.get(this.mSelectedTabIndex).findViewById(R.id.tab_item_text)).setTextColor(ContextCompat.getColor(getContext(), R.color.tb_text_primary));
        }
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a2c3ba", new Object[]{this, viewPager});
            return;
        }
        this.mViewPager = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new d());
        }
        if (this.mSelectedTabIndex == -1 && this.mInitTabIndex == 0) {
            setTabIndex(0);
        } else {
            setTabIndex(this.mInitTabIndex);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/taobao/android/megadesign/viewpager/CustomTabLayout$setupWithViewPager$1", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        public d() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                CustomTabLayout.access$selectTab(CustomTabLayout.this, i);
            }
        }
    }

    public final void setOnTabClickListener(a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7719524", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.mTabClickListener = listener;
    }

    public final void setTabIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf611fd", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.mTabs.size();
        if (i >= 0 && size > i) {
            selectTab(i);
            ViewPager viewPager = this.mViewPager;
            if (viewPager == null) {
                return;
            }
            viewPager.setCurrentItem(i);
            return;
        }
        selectTab(0);
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            return;
        }
        viewPager2.setCurrentItem(0);
    }

    public final void setInitTabIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320107cd", new Object[]{this, new Integer(i)});
        } else {
            this.mInitTabIndex = i;
        }
    }
}
