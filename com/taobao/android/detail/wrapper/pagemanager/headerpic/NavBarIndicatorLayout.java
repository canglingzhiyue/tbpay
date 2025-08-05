package com.taobao.android.detail.wrapper.pagemanager.headerpic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.epo;
import tb.ezf;
import tb.gbg;
import tb.iyw;
import tb.kge;

/* loaded from: classes5.dex */
public class NavBarIndicatorLayout extends FrameLayout implements iyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private Map<Integer, ezf> mIndexTitleMap;
    private LinearLayout mNavTabsBar;
    private View.OnClickListener mTabClickListener;
    private int mTabSelColor;
    private int mTabSelLocationColor;
    private int mTabUnSelColor;
    private Map<ezf, Integer> mTitleIndexMap;

    static {
        kge.a(-1589294529);
        kge.a(191274323);
    }

    public static /* synthetic */ Object ipc$super(NavBarIndicatorLayout navBarIndicatorLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iyw
    public View getIndicatorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ef110827", new Object[]{this}) : this;
    }

    public static /* synthetic */ LinearLayout access$000(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("cf713be2", new Object[]{navBarIndicatorLayout}) : navBarIndicatorLayout.mNavTabsBar;
    }

    public static /* synthetic */ Map access$100(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("87ca9c5f", new Object[]{navBarIndicatorLayout}) : navBarIndicatorLayout.mIndexTitleMap;
    }

    public static /* synthetic */ Context access$200(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2a80d241", new Object[]{navBarIndicatorLayout}) : navBarIndicatorLayout.mContext;
    }

    public static /* synthetic */ int access$300(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f069c0db", new Object[]{navBarIndicatorLayout})).intValue() : navBarIndicatorLayout.mTabSelLocationColor;
    }

    public static /* synthetic */ View.OnClickListener access$400(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("91a1530", new Object[]{navBarIndicatorLayout}) : navBarIndicatorLayout.mTabClickListener;
    }

    public static /* synthetic */ int access$500(NavBarIndicatorLayout navBarIndicatorLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7bac4619", new Object[]{navBarIndicatorLayout})).intValue() : navBarIndicatorLayout.mTabUnSelColor;
    }

    public NavBarIndicatorLayout(Context context) {
        this(context, null);
    }

    public NavBarIndicatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavBarIndicatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabSelColor = -1;
        this.mTabSelLocationColor = -1;
        this.mTabUnSelColor = -855638017;
        this.mTitleIndexMap = new HashMap();
        this.mIndexTitleMap = new HashMap();
        this.mTabClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.NavBarIndicatorLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int indexOfChild;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!(view instanceof TabItemView) || (indexOfChild = NavBarIndicatorLayout.access$000(NavBarIndicatorLayout.this).indexOfChild(view)) < 0) {
                } else {
                    NavBarIndicatorLayout.this.highlightTab(indexOfChild);
                    NavBarIndicatorLayout.access$100(NavBarIndicatorLayout.this).get(Integer.valueOf(indexOfChild));
                }
            }
        };
        this.mContext = context;
        initNavBar();
        emu.a("com.taobao.android.detail.wrapper.pagemanager.headerpic.NavBarIndicatorLayout");
    }

    @Override // tb.iyw
    public void a(List<ezf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            this.mIndexTitleMap.clear();
            this.mTitleIndexMap.clear();
            for (int i = 0; i < list.size(); i++) {
                ezf ezfVar = list.get(i);
                this.mIndexTitleMap.put(Integer.valueOf(i), ezfVar);
                this.mTitleIndexMap.put(ezfVar, Integer.valueOf(i));
                addTab(ezfVar.b());
            }
        }
    }

    @Override // tb.iyw
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Map.Entry<Integer, ezf> entry : this.mIndexTitleMap.entrySet()) {
            if (entry.getValue().a().equals(str)) {
                highlightTab(entry.getKey().intValue());
                return;
            }
        }
    }

    private void initNavBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d18dda7", new Object[]{this});
            return;
        }
        this.mNavTabsBar = new LinearLayout(this.mContext);
        addView(this.mNavTabsBar, new FrameLayout.LayoutParams(-1, -1));
    }

    public void addTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760b1ac5", new Object[]{this, str});
            return;
        }
        TabItemView tabItemView = new TabItemView(this.mContext);
        tabItemView.setText(str);
        this.mNavTabsBar.addView(tabItemView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tabItemView.getLayoutParams();
        layoutParams.leftMargin = gbg.a(this.mContext, 8.0f);
        layoutParams.topMargin = gbg.a(this.mContext, 6.0f);
    }

    public void highlightTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d31bb", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.mNavTabsBar.getChildCount()) {
        } else {
            int i2 = 0;
            while (i2 < this.mNavTabsBar.getChildCount()) {
                highlightTab(i2 == i, (TabItemView) this.mNavTabsBar.getChildAt(i2));
                i2++;
            }
        }
    }

    private void highlightTab(boolean z, TabItemView tabItemView) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409fe46d", new Object[]{this, new Boolean(z), tabItemView});
        } else if (tabItemView == null) {
        } else {
            tabItemView.getTabTitleView().setTextColor(z ? this.mTabSelColor : this.mTabUnSelColor);
            TextView tabTitleView = tabItemView.getTabTitleView();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) tabItemView.getTabTitleView().getText());
            sb.append(z ? "按钮已选中" : "");
            tabTitleView.setContentDescription(sb.toString());
            View indicatorView = tabItemView.getIndicatorView();
            if (!z) {
                i = 4;
            }
            indicatorView.setVisibility(i);
        }
    }

    /* loaded from: classes5.dex */
    public class TabItemView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View mIndicator;
        private TextView mTabTitle;

        static {
            kge.a(-265208);
        }

        public static /* synthetic */ Object ipc$super(TabItemView tabItemView, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public TabItemView(Context context) {
            super(context);
            init();
        }

        private void init() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            this.mTabTitle = new TextView(NavBarIndicatorLayout.access$200(NavBarIndicatorLayout.this));
            initTabTextView(this.mTabTitle);
            addView(this.mTabTitle);
            this.mIndicator = new View(NavBarIndicatorLayout.access$200(NavBarIndicatorLayout.this));
            this.mIndicator.setVisibility(4);
            this.mIndicator.setBackgroundColor(NavBarIndicatorLayout.access$300(NavBarIndicatorLayout.this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(epo.b(15), epo.b(2));
            layoutParams.gravity = 81;
            addView(this.mIndicator, layoutParams);
            setOnClickListener(NavBarIndicatorLayout.access$400(NavBarIndicatorLayout.this));
        }

        private void initTabTextView(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891b8206", new Object[]{this, textView});
                return;
            }
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(null, 1);
            textView.setTextColor(NavBarIndicatorLayout.access$500(NavBarIndicatorLayout.this));
            textView.setGravity(17);
            textView.setBackgroundColor(0);
            textView.setPadding(0, 0, 0, epo.b(4));
            textView.setShadowLayer(4.0f, 0.0f, 2.0f, Color.parseColor("#33000000"));
        }

        public void setText(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            } else {
                this.mTabTitle.setText(str);
            }
        }

        public TextView getTabTitleView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ff9d4e79", new Object[]{this}) : this.mTabTitle;
        }

        public View getIndicatorView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ef110827", new Object[]{this}) : this.mIndicator;
        }
    }
}
