package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.efw;
import tb.ehv;
import tb.emu;
import tb.eno;
import tb.enp;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.fgs;
import tb.fha;
import tb.fpz;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class TaoDetailActionBar extends RelativeLayout implements ehv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private final int TABS_MORE_THAN_4_WIDTH;
    private final int TABS_OF_4_WIDTH;
    private final int TABS_OF_4_WIDTH_DP;
    private ArrayList<Pair<TextView, View>> clickableTabRefs;
    private int empt;
    private HorizontalScrollView hsvTabsBar;
    private boolean isPostingWwRunnable;
    private boolean isShowComment;
    private AtomicInteger lastClickIndex;
    private HashMap<String, Integer> locatorToTabIndexMap;
    private int mActionBarItemTextColor;
    private boolean mActionBarItem_use_defaultTextColor;
    public List<Event> mCenterEvents;
    private Context mContext;
    private ArrayList<View> mDividers;
    private List<List<Event>> mEventss;
    private float mLastTransparency;
    private int mNavBarHeight;
    private int mNavButtonSize;
    private RelativeLayout mNavHeadBar;
    private int mNavHeadHeight;
    private LinearLayout mNavTabContainer;
    private int mNavTabHeight;
    private LinearLayout mNavTabsBar;
    private Resources mResources;
    private int mTabItemBgColor;
    private int mTabItemText_selColor;
    private int mTabItemText_unSelColor;
    private boolean mTabItemText_use_defaultBgColor;
    private boolean mTabItemText_use_default_selColor;
    private boolean mTabItemText_use_default_unSelColor;
    private float mTransparency;
    private int menuDefault2B;
    private int menuDefault2G;
    private int menuDefault2R;
    private int menuDefaultB;
    private int menuDefaultG;
    private int menuDefaultR;
    private MiniAppEntranceView miniAppEntranceView;
    private boolean needChangeColor;
    private long remainTime;
    private Runnable showWwRunnable;
    private int tabNum;
    private int txtcolor0Alpha;
    private View vCustomView;
    private View vLeftView;
    private TBActionView vRightView;
    private View vSyncTransparency;

    public static /* synthetic */ Object ipc$super(TaoDetailActionBar taoDetailActionBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1812230441) {
            super.setBackgroundColor(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1889417753) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.setBackgroundDrawable((Drawable) objArr[0]);
            return null;
        }
    }

    @Override // tb.ehu
    public void setPadTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5769d2f0", new Object[]{this, new Float(f)});
        }
    }

    public static /* synthetic */ AtomicInteger access$000(TaoDetailActionBar taoDetailActionBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("4564ae6d", new Object[]{taoDetailActionBar}) : taoDetailActionBar.lastClickIndex;
    }

    public static /* synthetic */ AtomicInteger access$002(TaoDetailActionBar taoDetailActionBar, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("1aed3f", new Object[]{taoDetailActionBar, atomicInteger});
        }
        taoDetailActionBar.lastClickIndex = atomicInteger;
        return atomicInteger;
    }

    public static /* synthetic */ ArrayList access$100(TaoDetailActionBar taoDetailActionBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("beccb69e", new Object[]{taoDetailActionBar}) : taoDetailActionBar.clickableTabRefs;
    }

    public static /* synthetic */ void access$200(TaoDetailActionBar taoDetailActionBar, boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f76abd", new Object[]{taoDetailActionBar, new Boolean(z), textView, view});
        } else {
            taoDetailActionBar.highlightTabOrNot(z, textView, view);
        }
    }

    public static /* synthetic */ Context access$300(TaoDetailActionBar taoDetailActionBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b497a4be", new Object[]{taoDetailActionBar}) : taoDetailActionBar.mContext;
    }

    static {
        kge.a(-697663613);
        kge.a(1668956025);
        TAG = TaoDetailActionBar.class.getSimpleName();
    }

    public void setTabNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca539089", new Object[]{this, new Integer(i)});
        } else {
            this.tabNum = i;
        }
    }

    @Override // tb.ehu
    public void setIsShowComment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8f3117", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isShowComment = z;
        if (z) {
            setLayoutParams(new LinearLayout.LayoutParams(-1, this.mNavHeadHeight));
        } else {
            setLayoutParams(new LinearLayout.LayoutParams(-1, this.mNavBarHeight));
        }
    }

    public TaoDetailActionBar(Context context) {
        super(context);
        this.needChangeColor = false;
        this.TABS_OF_4_WIDTH_DP = 174;
        this.TABS_OF_4_WIDTH = getWidthOf4Tabs();
        this.TABS_MORE_THAN_4_WIDTH = (int) (epo.b / 4.5d);
        this.miniAppEntranceView = null;
        this.tabNum = 4;
        this.mTabItemText_use_default_selColor = true;
        this.mTabItemText_selColor = 0;
        this.mTabItemText_use_default_unSelColor = true;
        this.mTabItemText_unSelColor = 0;
        this.mTabItemText_use_defaultBgColor = true;
        this.mActionBarItem_use_defaultTextColor = true;
        this.mTabItemBgColor = 0;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.isShowComment = false;
        this.empt = 0;
        this.txtcolor0Alpha = Color.argb(0, 255, 255, 255);
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 95;
        this.menuDefault2G = 100;
        this.menuDefault2B = 110;
        init();
    }

    public TaoDetailActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.needChangeColor = false;
        this.TABS_OF_4_WIDTH_DP = 174;
        this.TABS_OF_4_WIDTH = getWidthOf4Tabs();
        this.TABS_MORE_THAN_4_WIDTH = (int) (epo.b / 4.5d);
        this.miniAppEntranceView = null;
        this.tabNum = 4;
        this.mTabItemText_use_default_selColor = true;
        this.mTabItemText_selColor = 0;
        this.mTabItemText_use_default_unSelColor = true;
        this.mTabItemText_unSelColor = 0;
        this.mTabItemText_use_defaultBgColor = true;
        this.mActionBarItem_use_defaultTextColor = true;
        this.mTabItemBgColor = 0;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.isShowComment = false;
        this.empt = 0;
        this.txtcolor0Alpha = Color.argb(0, 255, 255, 255);
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 95;
        this.menuDefault2G = 100;
        this.menuDefault2B = 110;
        init();
    }

    public TaoDetailActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.needChangeColor = false;
        this.TABS_OF_4_WIDTH_DP = 174;
        this.TABS_OF_4_WIDTH = getWidthOf4Tabs();
        this.TABS_MORE_THAN_4_WIDTH = (int) (epo.b / 4.5d);
        this.miniAppEntranceView = null;
        this.tabNum = 4;
        this.mTabItemText_use_default_selColor = true;
        this.mTabItemText_selColor = 0;
        this.mTabItemText_use_default_unSelColor = true;
        this.mTabItemText_unSelColor = 0;
        this.mTabItemText_use_defaultBgColor = true;
        this.mActionBarItem_use_defaultTextColor = true;
        this.mTabItemBgColor = 0;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.isShowComment = false;
        this.empt = 0;
        this.txtcolor0Alpha = Color.argb(0, 255, 255, 255);
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 95;
        this.menuDefault2G = 100;
        this.menuDefault2B = 110;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBar");
        this.mContext = getContext();
        this.mResources = this.mContext.getResources();
        this.mNavButtonSize = this.mResources.getDimensionPixelOffset(R.dimen.taodetail_action_bar_button_size);
        this.mNavHeadHeight = this.mResources.getDimensionPixelOffset(R.dimen.taodetail_action_bar_head_height);
        this.mNavTabHeight = this.mResources.getDimensionPixelOffset(R.dimen.taodetail_action_bar_bottom_height);
        this.mNavBarHeight = this.mNavHeadHeight;
        this.mNavHeadBar = new RelativeLayout(this.mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mNavHeadHeight);
        layoutParams.addRule(10, -1);
        addView(this.mNavHeadBar, layoutParams);
        this.showWwRunnable = new a(this);
        String config = OrangeConfig.getInstance().getConfig("android_detail", "ww_guide_remain_time", "3000");
        this.remainTime = TextUtils.isEmpty(config) ? 3000L : Long.valueOf(config).longValue();
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        oldSetTransparency(0.0f);
        initMiniApp();
    }

    public int getNavHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("94fb9bee", new Object[]{this})).intValue() : this.mNavBarHeight;
    }

    public int getNavHeadHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62e6bf6e", new Object[]{this})).intValue() : this.mNavHeadHeight;
    }

    public void addLeftView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f980833e", new Object[]{this, view});
            return;
        }
        this.vLeftView = view;
        view.setId(9001);
        int i = this.mNavButtonSize;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.leftMargin = epo.h;
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.mNavHeadBar.addView(view, layoutParams);
    }

    public void setCenterImgData(String str, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0083b8", new Object[]{this, str, list});
        } else {
            this.mCenterEvents = list;
        }
    }

    public void addCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39079d4", new Object[]{this, view});
            return;
        }
        this.vCustomView = view;
        view.setId(R.id.taodetail_action_bar_custom);
        int i = this.mNavButtonSize;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.leftMargin = epo.b(4);
        layoutParams.rightMargin = epo.b(4);
        layoutParams.addRule(15, -1);
        TBActionView tBActionView = this.vRightView;
        if (tBActionView == null) {
            layoutParams.addRule(11, -1);
        } else {
            layoutParams.addRule(0, tBActionView.getId());
        }
        this.mNavHeadBar.addView(view, layoutParams);
    }

    public void addRightView(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fb269f", new Object[]{this, tBActionView});
            return;
        }
        this.vRightView = tBActionView;
        tBActionView.setId(ConnectionResult.SERVICE_UPDATING);
        int i = this.mNavButtonSize;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.rightMargin = epo.h;
        layoutParams.addRule(11, -1);
        layoutParams.addRule(15, -1);
        this.mNavHeadBar.addView(tBActionView, layoutParams);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.mDividers;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.mDividers = null;
    }

    @Override // tb.ehu
    public float getTransparency() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8897cb45", new Object[]{this})).floatValue() : this.mTransparency;
    }

    private void initMiniApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b807b2a1", new Object[]{this});
            return;
        }
        String appID = MiniAppEntranceView.getAppID(fpz.c(getContext()).getIntent());
        if (TextUtils.isEmpty(appID)) {
            return;
        }
        this.miniAppEntranceView = new MiniAppEntranceView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = epo.b(56);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.mNavHeadBar.addView(this.miniAppEntranceView, layoutParams);
        this.miniAppEntranceView.setAppID(appID);
    }

    private boolean isBarStateShrink(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca6e9b0c", new Object[]{this, new Float(f)})).booleanValue() : 0.05f >= f || this.isShowComment;
    }

    @Override // tb.ehu
    public void setTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f8137f", new Object[]{this, new Float(f)});
        } else if (Math.abs(f - this.mTransparency) <= 0.05d) {
        } else {
            boolean isBarStateShrink = isBarStateShrink(this.mTransparency);
            boolean isBarStateShrink2 = isBarStateShrink(f);
            if (isBarStateShrink != isBarStateShrink2) {
                if (isBarStateShrink2) {
                    setLayoutParams(new LinearLayout.LayoutParams(-1, getNavHeadHeight()));
                    LinearLayout linearLayout = this.mNavTabsBar;
                    if (linearLayout != null) {
                        linearLayout.setClickable(false);
                        this.mNavTabsBar.setVisibility(8);
                    }
                } else {
                    setLayoutParams(new LinearLayout.LayoutParams(-1, getNavHeight()));
                    LinearLayout linearLayout2 = this.mNavTabsBar;
                    if (linearLayout2 != null) {
                        linearLayout2.setClickable(true);
                        this.mNavTabsBar.setVisibility(0);
                    }
                }
            }
            setFinalBarTransparency(f);
            MiniAppEntranceView miniAppEntranceView = this.miniAppEntranceView;
            if (miniAppEntranceView == null) {
                return;
            }
            miniAppEntranceView.updateViewStatus(f);
        }
    }

    private void oldSetTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49695c46", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.mLastTransparency = this.mTransparency;
        this.mTransparency = f;
        setClickable(f > 0.0f);
        View view = this.vSyncTransparency;
        if (view != null && view.getBackground() != null) {
            this.vSyncTransparency.getBackground().setAlpha((int) (f * 255.0f));
        }
        Drawable background = getBackground();
        if (background != null) {
            this.empt = (int) (255.0f * f);
            background.setAlpha(this.empt);
            if (!this.mActionBarItem_use_defaultTextColor) {
                this.menuDefault2R = Color.red(this.mActionBarItemTextColor);
                this.menuDefault2G = Color.green(this.mActionBarItemTextColor);
                this.menuDefault2B = Color.blue(this.mActionBarItemTextColor);
            }
            if (f < 0.5f) {
                changeChildrenTransparency(255 - (this.empt << 1));
                changeChildrenColor(Color.argb(255 - (this.empt << 1), this.menuDefaultR, this.menuDefaultG, this.menuDefaultB));
            } else if (f == 0.5f) {
                changeChildrenTransparency(0);
                changeChildrenColor(this.txtcolor0Alpha);
            } else {
                changeChildrenTransparency(0);
                if (this.needChangeColor) {
                    int i = this.menuDefaultR;
                    changeChildrenColor(Color.argb(this.empt << 1, i, i, i));
                } else {
                    changeChildrenColor(Color.argb(this.empt << 1, this.menuDefault2R, this.menuDefault2G, this.menuDefault2B));
                }
            }
        }
        if (this.mDividers == null) {
            return;
        }
        if (f < 1.0f) {
            for (int i2 = 0; i2 < this.mDividers.size(); i2++) {
                if (this.mDividers.get(i2).getVisibility() == 0) {
                    this.mDividers.get(i2).setVisibility(8);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < this.mDividers.size(); i3++) {
            if (this.mDividers.get(i3).getVisibility() == 8) {
                this.mDividers.get(i3).setVisibility(0);
            }
        }
    }

    private void updateNavTabBarTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3d7629", new Object[]{this, new Float(f)});
            return;
        }
        LinearLayout linearLayout = this.mNavTabsBar;
        if (linearLayout == null || this.mNavTabContainer == null) {
            return;
        }
        linearLayout.setAlpha(f);
        this.mNavTabsBar.setBackgroundColor(0);
        this.mNavTabContainer.setBackgroundColor(0);
        this.hsvTabsBar.setBackgroundColor(0);
        int childCount = this.mNavTabContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mNavTabContainer.getChildAt(i);
            if (childAt != null && (childAt instanceof RelativeLayout)) {
                RelativeLayout relativeLayout = (RelativeLayout) childAt;
                int childCount2 = relativeLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = relativeLayout.getChildAt(i2);
                    if (childAt2 != null) {
                        childAt2.setAlpha(f);
                    }
                }
            }
        }
    }

    public void setFinalBarTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de82042", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.mLastTransparency = this.mTransparency;
        this.mTransparency = f;
        setClickable(f > 0.0f);
        View view = this.vSyncTransparency;
        if (view != null && view.getBackground() != null) {
            this.vSyncTransparency.getBackground().setAlpha((int) (f * 255.0f));
        }
        updateNavTabBarTransparency(f);
        Drawable background = getBackground();
        if (background != null) {
            this.empt = (int) (255.0f * f);
            background.setAlpha(this.empt);
            if (f < 0.5f) {
                changeChildrenTransparency(255 - (this.empt << 1));
                changeChildrenColor(Color.argb(255 - (this.empt << 1), this.menuDefaultR, this.menuDefaultG, this.menuDefaultB));
            } else if (f == 0.5f) {
                changeChildrenTransparency(0);
                changeChildrenColor(this.txtcolor0Alpha);
            } else {
                changeChildrenTransparency(0);
                if (this.needChangeColor) {
                    int i = this.menuDefaultR;
                    changeChildrenColor(Color.argb(this.empt << 1, i, i, i));
                } else {
                    changeChildrenColor(Color.argb(this.empt << 1, this.menuDefault2R, this.menuDefault2G, this.menuDefault2B));
                }
            }
        }
        if (this.mDividers == null) {
            return;
        }
        if (f < 1.0f) {
            for (int i2 = 0; i2 < this.mDividers.size(); i2++) {
                if (this.mDividers.get(i2).getVisibility() == 0) {
                    this.mDividers.get(i2).setVisibility(8);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < this.mDividers.size(); i3++) {
            if (this.mDividers.get(i3).getVisibility() == 8) {
                this.mDividers.get(i3).setVisibility(0);
            }
        }
    }

    @Override // tb.ehu
    public void restoreLastTransparency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19458243", new Object[]{this});
        } else {
            setTransparency(this.mLastTransparency);
        }
    }

    private void changeChildrenTransparency(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e511cf5", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 255) {
            i = 255;
        }
        changeChildTransparency(this.vLeftView, i);
        changeChildTransparency(this.vCustomView, i);
        changeChildTransparency(this.vRightView, i);
    }

    private void changeChildTransparency(View view, int i) {
        Drawable background;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9911903c", new Object[]{this, view, new Integer(i)});
        } else if (view == null || (background = view.getBackground()) == null) {
        } else {
            background.setAlpha(i);
        }
    }

    private void changeChildrenColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b42c108", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.vLeftView;
        if (view != null && (view instanceof TIconFontTextView)) {
            ((TIconFontTextView) view).setTextColor(i);
        }
        View view2 = this.vCustomView;
        if (view2 != null && (view2 instanceof TIconFontTextView)) {
            ((TIconFontTextView) view2).setTextColor(i);
        }
        TBActionView tBActionView = this.vRightView;
        if (tBActionView == null) {
            return;
        }
        tBActionView.setIconColor(i);
    }

    private void initNavBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d18dda7", new Object[]{this});
            return;
        }
        if (this.mNavTabsBar == null) {
            this.mNavTabsBar = (LinearLayout) com.taobao.android.detail.core.async.d.b(this.mContext, R.layout.x_detail_main_navigator_bar);
            this.hsvTabsBar = (HorizontalScrollView) this.mNavTabsBar.findViewById(R.id.hsv_nav_tab_container);
            this.hsvTabsBar.setBackgroundColor(0);
            this.mNavTabContainer = (LinearLayout) this.mNavTabsBar.findViewById(R.id.ll_nav_tab_container);
        }
        this.mNavTabsBar.setAlpha(0.0f);
    }

    public void addTabWithText(String str, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d106a9", new Object[]{this, str, list});
            return;
        }
        int color = ContextCompat.getColor(this.mContext, R.color.detail_nav_bar_bottom_tab_text);
        if (!this.mTabItemText_use_default_unSelColor) {
            color = this.mTabItemText_unSelColor;
        }
        int color2 = ContextCompat.getColor(this.mContext, R.color.taodetail_action_bar_bg);
        if (!this.mTabItemText_use_defaultBgColor) {
            color2 = this.mTabItemBgColor;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.mContext);
        relativeLayout.setBackgroundColor(0);
        TextView textView = new TextView(this.mContext);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(color);
        textView.setGravity(17);
        textView.setId(R.id.taodetail_nav_bar_tab_text);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.leftMargin = epo.b(4);
        layoutParams.rightMargin = epo.b(4);
        layoutParams.addRule(13, -1);
        relativeLayout.addView(textView, layoutParams);
        View view = new View(this.mContext);
        view.setVisibility(4);
        if (!this.mTabItemText_use_default_selColor) {
            view.setBackgroundColor(this.mTabItemText_selColor);
        } else {
            view.setBackgroundColor(-45056);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, epo.b(2));
        fgs.a(1, Color.parseColor("#F9F9F9"));
        layoutParams2.addRule(5, R.id.taodetail_nav_bar_tab_text);
        layoutParams2.addRule(7, R.id.taodetail_nav_bar_tab_text);
        layoutParams2.addRule(12, -1);
        layoutParams2.addRule(14);
        relativeLayout.addView(view, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        relativeLayout.setOnClickListener(getTabOnClickListener(textView, view, list));
        if (!this.mTabItemText_use_defaultBgColor) {
            textView.setBackgroundColor(color2);
            relativeLayout.setBackgroundColor(color2);
        }
        this.mNavTabContainer.setBackgroundColor(color2);
        this.mNavTabContainer.addView(relativeLayout, layoutParams3);
    }

    public void highlightTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d31bb", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        i.d(str, "highlightTab() called with: index = [" + i + riy.ARRAY_END_STR);
        if (i < 0 || i >= this.tabNum) {
            return;
        }
        Pair<TextView, View> pair = null;
        try {
            Pair<TextView, View> pair2 = this.clickableTabRefs.get(i);
            if (-1 != this.lastClickIndex.get()) {
                pair = this.clickableTabRefs.get(this.lastClickIndex.get());
            }
            if (pair != null) {
                highlightTabOrNot(false, (TextView) pair.first, (View) pair.second);
            }
            this.lastClickIndex = new AtomicInteger(i);
            if (pair2 == null) {
                return;
            }
            highlightTabOrNot(true, (TextView) pair2.first, (View) pair2.second);
            com.taobao.android.trade.event.d a2 = f.a(this.mContext);
            if (pair2.first == null || !"评价".equals(((TextView) pair2.first).getText())) {
                return;
            }
            for (Event event : this.mEventss.get(i)) {
                if (eno.a(enp.class) == event.getEventId()) {
                    a2.a(event);
                }
            }
        } catch (IndexOutOfBoundsException unused) {
            i.d("TaoDetailActionBar", "Tag onClickListeners IndexOutOfBoundsException");
        }
    }

    @Override // tb.ehu
    public void highlightTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6b212", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        i.d(str2, "scroll locatorId " + str);
        if ("divisionDesc".equals(str)) {
            if (!this.isPostingWwRunnable) {
                this.isPostingWwRunnable = true;
                postDelayed(this.showWwRunnable, this.remainTime);
            }
        } else {
            removeCallbacks(this.showWwRunnable);
            this.isPostingWwRunnable = false;
        }
        Integer num = this.locatorToTabIndexMap.get(str);
        if (num == null || num.intValue() == this.lastClickIndex.get()) {
            return;
        }
        highlightTab(num.intValue());
    }

    @Override // tb.ehu
    public int getActionBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue() : this.mNavBarHeight;
    }

    private View.OnClickListener getTabOnClickListener(final TextView textView, final View view, final List<Event> list) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("e10d2fcd", new Object[]{this, textView, view, list});
        }
        this.mEventss.add(list);
        final int size = this.clickableTabRefs.size();
        for (Event event : list) {
            if (eno.a(com.taobao.android.detail.core.event.basic.a.class) == event.getEventId() && (hashMap = (HashMap) event.getParam()) != null) {
                String str = (String) hashMap.get("locatorId");
                if (!TextUtils.isEmpty(str)) {
                    this.locatorToTabIndexMap.put(str, Integer.valueOf(size));
                    this.clickableTabRefs.add(new Pair<>(textView, view));
                }
            }
        }
        return new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (TaoDetailActionBar.access$000(TaoDetailActionBar.this).get() >= 0) {
                    Pair pair = (Pair) TaoDetailActionBar.access$100(TaoDetailActionBar.this).get(TaoDetailActionBar.access$000(TaoDetailActionBar.this).get());
                    TaoDetailActionBar.access$200(TaoDetailActionBar.this, false, (TextView) pair.first, (View) pair.second);
                }
                TaoDetailActionBar.access$002(TaoDetailActionBar.this, new AtomicInteger(size));
                TaoDetailActionBar.access$200(TaoDetailActionBar.this, true, textView, view);
                com.taobao.android.trade.event.d a2 = f.a(TaoDetailActionBar.access$300(TaoDetailActionBar.this));
                for (Event event2 : list) {
                    a2.a(event2);
                }
            }
        };
    }

    private void highlightTabOrNot(boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f77b6c", new Object[]{this, new Boolean(z), textView, view});
            return;
        }
        int color = ContextCompat.getColor(this.mContext, R.color.taodetail_shop_high_bg);
        int color2 = ContextCompat.getColor(this.mContext, R.color.detail_nav_bar_bottom_tab_text);
        if (textView != null) {
            if (!this.mTabItemText_use_default_selColor) {
                color = this.mTabItemText_selColor;
            }
            if (!this.mTabItemText_use_default_unSelColor) {
                color2 = this.mTabItemText_unSelColor;
            }
            if (!z) {
                color = color2;
            }
            textView.setTextColor(color);
        }
        if (view != null) {
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
        if (!z) {
            return;
        }
        fha.a(this.mContext, textView);
    }

    public void addTabWithImage(String str, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a8423", new Object[]{this, str, list});
            return;
        }
        int color = ContextCompat.getColor(this.mContext, R.color.detail_nav_bar_bottom_tab_text);
        if (!this.mTabItemText_use_default_unSelColor) {
            color = this.mTabItemText_unSelColor;
        }
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setOrientation(0);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, epo.b(20));
        tIconFontTextView.setText(this.mResources.getString(R.string.uik_icon_location_fill));
        tIconFontTextView.setPadding(0, 0, epo.b(6), 0);
        if (!this.mTabItemText_use_default_unSelColor) {
            tIconFontTextView.setTextColor(color);
        } else {
            tIconFontTextView.setTextColor(-45056);
        }
        tIconFontTextView.setVisibility(4);
        layoutParams.addRule(0, R.id.taodetail_nav_bar_tab_text);
        layoutParams.addRule(15);
        linearLayout.addView(tIconFontTextView, layoutParams);
        DetailImageView detailImageView = new DetailImageView(this.mContext);
        epj.b().a(str, detailImageView, new epl.a().c(epo.b(46)).d(epo.b(17)).c(ImageView.ScaleType.FIT_XY).a());
        linearLayout.addView(detailImageView, new LinearLayout.LayoutParams(epo.b(46), epo.b(17)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(getTabWidth(), -2);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(getTabOnClickListener(null, tIconFontTextView, list));
        this.mNavTabContainer.addView(linearLayout, layoutParams2);
    }

    public void addNavTabsBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9deb9a", new Object[]{this});
            return;
        }
        boolean z = this.mTabItemText_use_defaultBgColor;
        initNavBar();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.tabNum * getTabWidth(), this.mNavTabHeight + 0);
        layoutParams.leftMargin = (epo.b - (this.tabNum * getTabWidth())) / 2;
        layoutParams.addRule(9, -1);
        layoutParams.addRule(13, -1);
        this.mNavTabsBar.setBackgroundColor(Color.parseColor("#00000000"));
        this.mNavTabContainer.setBackgroundColor(Color.parseColor("#00000000"));
        this.hsvTabsBar.setBackgroundColor(Color.parseColor("#00000000"));
        this.mNavTabsBar.setVisibility(8);
        addView(this.mNavTabsBar, layoutParams);
    }

    @Override // tb.ehu
    public void setNavTabsBarVisibility(int i) {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857e35d6", new Object[]{this, new Integer(i)});
        } else if ((i != 8 && i != 0 && i != 4) || (linearLayout = this.mNavTabsBar) == null) {
        } else {
            linearLayout.setVisibility(i);
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        super.setBackgroundColor(i);
        View view = this.vSyncTransparency;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
            return;
        }
        super.setBackgroundDrawable(drawable);
        RelativeLayout relativeLayout = this.mNavHeadBar;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setBackgroundDrawable(drawable);
    }

    public void setSyncTransparencyViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8d4b21", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.vSyncTransparency;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    @Override // tb.ehu
    public void setSyncTransparentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c285c71", new Object[]{this, view});
        } else {
            this.vSyncTransparency = view;
        }
    }

    @Override // tb.ehv
    public void setNavTabsBarAlphaAndVisibility(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf8489", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.mNavTabsBar.setAlpha(f);
        this.mNavTabsBar.setVisibility(i);
        Drawable background = getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha((int) (f * 255.0f));
    }

    public void setTabItemBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6204d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabItemBgColor = i;
        setTabItemUseDefaultBgColor(false);
    }

    public void setTabItemUseDefaultBgColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6a14cf", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabItemText_use_defaultBgColor = z;
        }
    }

    public void setTabItemSelectedTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dddf87", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabItemText_selColor = i;
        setTabItemUseDefaultSelectedColor(false);
    }

    public void setTabItemUseDefaultSelectedColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc1c7a5", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabItemText_use_default_selColor = z;
        }
    }

    public void setTabItemUnSelectedTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2f0000", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabItemText_unSelColor = i;
        setTabItemTextUseDefaultUnSelectedColor(false);
    }

    public void setTabItemTextUseDefaultUnSelectedColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2977fab", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabItemText_use_default_unSelColor = z;
        }
    }

    public void setActionBarItemColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a6fde7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mActionBarItemTextColor = i;
        setActionBarItemUseDefaultTextColor(false);
    }

    public void setActionBarItemUseDefaultTextColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4868b9f", new Object[]{this, new Boolean(z)});
        } else {
            this.mActionBarItem_use_defaultTextColor = z;
        }
    }

    private int getTabWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408409a1", new Object[]{this})).intValue();
        }
        int i = this.tabNum;
        if (i <= 4 && i > 0) {
            return getWidthOf4Tabs() / this.tabNum;
        }
        return (int) (getWidthOf4Tabs() / 4.5d);
    }

    private int getWidthOf4Tabs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52f725", new Object[]{this})).intValue() : epo.b(174);
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<TaoDetailActionBar> f11117a;

        static {
            kge.a(426094497);
            kge.a(-1390502639);
        }

        public a(TaoDetailActionBar taoDetailActionBar) {
            this.f11117a = new WeakReference<>(taoDetailActionBar);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TaoDetailActionBar taoDetailActionBar = this.f11117a.get();
            if (taoDetailActionBar == null) {
                return;
            }
            i.d(TaoDetailActionBar.TAG, "run: post show wangwang runnable");
            f.a(fpz.c(taoDetailActionBar.getContext()), new efw());
        }
    }
}
