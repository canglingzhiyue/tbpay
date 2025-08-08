package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.component.actionbar.b;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
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
import tb.ecr;
import tb.efw;
import tb.ehv;
import tb.emu;
import tb.eno;
import tb.enp;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.fha;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class TaoDetailActionBarV2 extends LinearLayout implements ehv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private ArrayList<Pair<TextView, View>> clickableTabRefs;
    private boolean isAlwaysHideTabsContainer;
    private boolean isPostingWwRunnable;
    private boolean isShowComment;
    private AtomicInteger lastClickIndex;
    private HashMap<String, Integer> locatorToTabIndexMap;
    private Context mContext;
    private List<List<Event>> mEventss;
    private boolean mFullTransparentMode;
    private boolean mImmersiveEnable;
    private FrameLayout mMiniAppContainer;
    private LinearLayout mNavHeadBar;
    private int mNavHeadHeight;
    private int mNavItemWH;
    private int mNavStatusBarHeight;
    private LinearLayout mNavTabContainer;
    private int mNavTabHeight;
    private LinearLayout mNavTabsBar;
    private boolean mNeedExposure;
    private b.a mSearchHintExposureListener;
    private int mTabBgColor;
    private int mTabSelColor;
    private int mTabUnSelColor;
    private float mTransparency;
    private int menuDefault2B;
    private int menuDefault2G;
    private int menuDefault2R;
    private int menuDefaultB;
    private int menuDefaultG;
    private int menuDefaultR;
    private int menuDefaultTaoMoment2B;
    private int menuDefaultTaoMoment2G;
    private int menuDefaultTaoMoment2R;
    private MiniAppEntranceView miniAppEntranceView;
    private long remainTime;
    private Runnable showWwRunnable;
    private int tabNum;
    private TIconFontTextView taoMomentsView;
    private List<View> vAlpha0to1SpecialViews;
    private View vCustomView;
    private View vLeftView;
    private TBActionView vRightView;
    private View vSearchView;
    private List<View> vSpecialViews;

    public static /* synthetic */ Object ipc$super(TaoDetailActionBarV2 taoDetailActionBarV2, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ehu
    public void restoreLastTransparency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19458243", new Object[]{this});
        }
    }

    @Override // tb.ehu
    public void setNavTabsBarVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857e35d6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ehu
    public void setPadTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5769d2f0", new Object[]{this, new Float(f)});
        }
    }

    @Override // tb.ehu
    public void setSyncTransparentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c285c71", new Object[]{this, view});
        }
    }

    public static /* synthetic */ AtomicInteger access$000(TaoDetailActionBarV2 taoDetailActionBarV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("fce16e91", new Object[]{taoDetailActionBarV2}) : taoDetailActionBarV2.lastClickIndex;
    }

    public static /* synthetic */ AtomicInteger access$002(TaoDetailActionBarV2 taoDetailActionBarV2, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("7aeb871b", new Object[]{taoDetailActionBarV2, atomicInteger});
        }
        taoDetailActionBarV2.lastClickIndex = atomicInteger;
        return atomicInteger;
    }

    public static /* synthetic */ ArrayList access$100(TaoDetailActionBarV2 taoDetailActionBarV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ce5b6d82", new Object[]{taoDetailActionBarV2}) : taoDetailActionBarV2.clickableTabRefs;
    }

    public static /* synthetic */ void access$200(TaoDetailActionBarV2 taoDetailActionBarV2, boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384bf099", new Object[]{taoDetailActionBarV2, new Boolean(z), textView, view});
        } else {
            taoDetailActionBarV2.highlightTab(z, textView, view);
        }
    }

    public static /* synthetic */ Context access$300(TaoDetailActionBarV2 taoDetailActionBarV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3a1f1122", new Object[]{taoDetailActionBarV2}) : taoDetailActionBarV2.mContext;
    }

    static {
        kge.a(-439831201);
        kge.a(1668956025);
        TAG = TaoDetailActionBarV2.class.getSimpleName();
    }

    public TaoDetailActionBarV2(Context context) {
        super(context);
        this.vAlpha0to1SpecialViews = new ArrayList();
        this.vSpecialViews = new ArrayList();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -45056;
        this.mTabUnSelColor = CollectionTabLayout.SELECTED_TEXT_COLOR;
        this.mTabBgColor = -855310;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.tabNum = 4;
        this.isShowComment = false;
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 17;
        this.menuDefault2G = 17;
        this.menuDefault2B = 17;
        this.menuDefaultTaoMoment2R = 255;
        this.menuDefaultTaoMoment2G = 80;
        this.menuDefaultTaoMoment2B = 0;
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.mNeedExposure = true;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV2");
    }

    public TaoDetailActionBarV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vAlpha0to1SpecialViews = new ArrayList();
        this.vSpecialViews = new ArrayList();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -45056;
        this.mTabUnSelColor = CollectionTabLayout.SELECTED_TEXT_COLOR;
        this.mTabBgColor = -855310;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.tabNum = 4;
        this.isShowComment = false;
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 17;
        this.menuDefault2G = 17;
        this.menuDefault2B = 17;
        this.menuDefaultTaoMoment2R = 255;
        this.menuDefaultTaoMoment2G = 80;
        this.menuDefaultTaoMoment2B = 0;
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.mNeedExposure = true;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV2");
    }

    public TaoDetailActionBarV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.vAlpha0to1SpecialViews = new ArrayList();
        this.vSpecialViews = new ArrayList();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -45056;
        this.mTabUnSelColor = CollectionTabLayout.SELECTED_TEXT_COLOR;
        this.mTabBgColor = -855310;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.locatorToTabIndexMap = new HashMap<>();
        this.mEventss = new ArrayList(5);
        this.tabNum = 4;
        this.isShowComment = false;
        this.menuDefaultR = 255;
        this.menuDefaultG = 255;
        this.menuDefaultB = 255;
        this.menuDefault2R = 17;
        this.menuDefault2G = 17;
        this.menuDefault2B = 17;
        this.menuDefaultTaoMoment2R = 255;
        this.menuDefaultTaoMoment2G = 80;
        this.menuDefaultTaoMoment2B = 0;
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.mNeedExposure = true;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV2");
    }

    public void setTabsContainerVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f658b7ba", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isAlwaysHideTabsContainer = z;
        if (!z) {
            return;
        }
        this.mNavTabsBar.setVisibility(8);
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
        LinearLayout linearLayout = this.mNavTabsBar;
        if (linearLayout == null) {
            return;
        }
        if (this.isAlwaysHideTabsContainer || this.isShowComment) {
            this.mNavTabsBar.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public void setFullTransparentMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df985e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mFullTransparentMode = z;
        }
    }

    public void setImmersiveEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9900951", new Object[]{this, new Boolean(z)});
        } else {
            this.mImmersiveEnable = z;
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(1);
        if (this.mFullTransparentMode) {
            setBackgroundColor(this.mTabBgColor);
        } else {
            setBackgroundColor(0);
        }
        this.mContext = getContext();
        this.mNavItemWH = (int) TypedValue.applyDimension(1, 32.0f, this.mContext.getResources().getDisplayMetrics());
        this.mNavHeadHeight = (int) TypedValue.applyDimension(1, 48.0f, this.mContext.getResources().getDisplayMetrics());
        this.mNavStatusBarHeight = this.mImmersiveEnable ? ecr.b(this.mContext) : 0;
        this.mNavTabHeight = (int) TypedValue.applyDimension(1, 36.0f, this.mContext.getResources().getDisplayMetrics());
        this.mMiniAppContainer = new FrameLayout(this.mContext);
        if (this.mFullTransparentMode) {
            this.mMiniAppContainer.setBackgroundColor(0);
        } else {
            this.mMiniAppContainer.setBackgroundColor(this.mTabBgColor);
        }
        addView(this.mMiniAppContainer, new LinearLayout.LayoutParams(-1, this.mNavHeadHeight + this.mNavStatusBarHeight));
        this.mNavHeadBar = new LinearLayout(this.mContext);
        this.mNavHeadBar.setOrientation(0);
        this.mNavHeadBar.setBackgroundColor(0);
        this.mNavHeadBar.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.mNavStatusBarHeight;
        this.mMiniAppContainer.addView(this.mNavHeadBar, layoutParams);
        this.showWwRunnable = new a(this);
        String config = OrangeConfig.getInstance().getConfig("android_detail", "ww_guide_remain_time", "3000");
        this.remainTime = StringUtils.isEmpty(config) ? 3000L : Long.valueOf(config).longValue();
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        initItemsAndTabs();
        initMiniApp();
    }

    private void initItemsAndTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a0d14c", new Object[]{this});
            return;
        }
        this.mTransparency = 0.0f;
        if (this.mFullTransparentMode) {
            changeDrawableAlpha(0.0f, this, false);
            changeDrawableAlpha(0.0f, this.mMiniAppContainer, false);
            changeViewAlpha(0.0f, this.vAlpha0to1SpecialViews, true);
            changeItemChildrenColor(Color.argb(255, this.menuDefaultR, this.menuDefaultG, this.menuDefaultB));
            return;
        }
        changeItemChildrenColor(Color.argb(255, this.menuDefault2R, this.menuDefault2G, this.menuDefault2B));
        TIconFontTextView tIconFontTextView = this.taoMomentsView;
        if (tIconFontTextView == null) {
            return;
        }
        tIconFontTextView.setTextColor(Color.argb(255, this.menuDefaultTaoMoment2R, this.menuDefaultTaoMoment2G, this.menuDefaultTaoMoment2B));
    }

    private void changeViewAlpha(float f, List<View> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c518b833", new Object[]{this, new Float(f), list, new Boolean(z)});
        } else if (list != null && list.size() > 0) {
            for (View view : list) {
                if (view != null) {
                    view.setAlpha(f);
                    if (!z) {
                        return;
                    }
                    if (f <= 0.2f) {
                        view.setClickable(false);
                    } else {
                        view.setClickable(true);
                    }
                }
            }
        }
    }

    private void reportSearchHintExposure() {
        b.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb58251", new Object[]{this});
        } else if (!this.mNeedExposure || (aVar = this.mSearchHintExposureListener) == null) {
        } else {
            this.mNeedExposure = false;
            aVar.a();
        }
    }

    public void setSearchHintExposureListener(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c83508", new Object[]{this, aVar});
        } else {
            this.mSearchHintExposureListener = aVar;
        }
    }

    private void initMiniApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b807b2a1", new Object[]{this});
            return;
        }
        Activity c = fpz.c(getContext());
        if (c == null) {
            return;
        }
        String appID = MiniAppEntranceView.getAppID(c.getIntent());
        if (StringUtils.isEmpty(appID)) {
            return;
        }
        this.miniAppEntranceView = new MiniAppEntranceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 19);
        layoutParams.leftMargin = epo.b(56);
        this.mMiniAppContainer.addView(this.miniAppEntranceView, layoutParams);
        this.miniAppEntranceView.setAppID(appID);
    }

    public void addLeftView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f980833e", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.vLeftView = view;
            int i = this.mNavItemWH;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = epo.h;
            layoutParams.rightMargin = epo.b(4);
            this.mNavHeadBar.addView(view, layoutParams);
        }
    }

    public void addSpecialIconView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80a4875", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (R.id.tao_detail_action_bar_search_normal_item == view.getId()) {
                this.vAlpha0to1SpecialViews.add(view);
            }
            this.vSpecialViews.add(view);
            int i = this.mNavItemWH;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = epo.b(4);
            layoutParams.rightMargin = epo.b(4);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.mNavHeadBar.addView(view, layoutParams);
        }
    }

    public void addSearchView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107cf53d", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.vAlpha0to1SpecialViews.add(view);
            this.vSearchView = view;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams.leftMargin = epo.b(4);
            layoutParams.rightMargin = epo.b(4);
            this.mNavHeadBar.addView(view, layoutParams);
        }
    }

    public void addCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39079d4", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.vCustomView = view;
            int i = this.mNavItemWH;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = epo.b(4);
            layoutParams.rightMargin = epo.b(4);
            this.mNavHeadBar.addView(view, layoutParams);
        }
    }

    public void addRightView(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fb269f", new Object[]{this, tBActionView});
        } else if (tBActionView == null) {
        } else {
            this.vRightView = tBActionView;
            int i = this.mNavItemWH;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = epo.b(4);
            layoutParams.rightMargin = epo.h;
            this.mNavHeadBar.addView(tBActionView, layoutParams);
        }
    }

    @Override // tb.ehu
    public float getTransparency() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8897cb45", new Object[]{this})).floatValue() : this.mTransparency;
    }

    public int getNavHeadHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62e6bf6e", new Object[]{this})).intValue() : this.mNavHeadHeight;
    }

    @Override // tb.ehu
    public int getActionBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue();
        }
        if (this.isAlwaysHideTabsContainer) {
            return this.mNavHeadHeight;
        }
        return (this.isShowComment ? this.mNavHeadHeight + this.mNavTabHeight : this.mNavHeadHeight) + this.mNavStatusBarHeight;
    }

    private boolean isShowComment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d8c99a3", new Object[]{this})).booleanValue() : this.isShowComment;
    }

    public void setTaoMomentsView(TIconFontTextView tIconFontTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894da18", new Object[]{this, tIconFontTextView});
        } else {
            this.taoMomentsView = tIconFontTextView;
        }
    }

    @Override // tb.ehu
    public void setTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f8137f", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 1.0E-5f) {
            f = 0.0f;
        } else if (f > 0.99999f) {
            f = 1.0f;
        }
        if (Math.abs(f - this.mTransparency) <= 1.0E-5f) {
            return;
        }
        this.mTransparency = f;
        if (this.mFullTransparentMode) {
            changeDrawableAlpha(f, this, false);
            changeDrawableAlpha(f, this.mMiniAppContainer, false);
            changeViewAlpha(f, this.vAlpha0to1SpecialViews, true);
            changeItemChildrenDrawableAlpha(1.0f - (2.0f * f));
            int i = (int) (255.0f * f);
            if (i < 0) {
                i = 0;
            }
            if (i > 255) {
                i = 255;
            }
            if (f < 0.5f) {
                changeItemChildrenColor(Color.argb(Math.max(0, 255 - (i << 1)), this.menuDefaultR, this.menuDefaultG, this.menuDefaultB));
            } else if (f == 0.5f) {
                changeItemChildrenColor(16777215);
            } else {
                int i2 = (i - 127) << 1;
                changeItemChildrenColor(Color.argb(Math.min(255, i2), this.menuDefault2R, this.menuDefault2G, this.menuDefault2B));
                TIconFontTextView tIconFontTextView = this.taoMomentsView;
                if (tIconFontTextView != null) {
                    tIconFontTextView.setTextColor(Color.argb(Math.min(255, i2), this.menuDefaultTaoMoment2R, this.menuDefaultTaoMoment2G, this.menuDefaultTaoMoment2B));
                }
            }
        }
        changeViewAlpha(f, (View) this.mNavTabsBar, true);
        if (this.mNavTabsBar != null) {
            if (this.isAlwaysHideTabsContainer || isShowComment()) {
                this.mNavTabsBar.setVisibility(8);
            } else {
                this.mNavTabsBar.setVisibility(0);
            }
        }
        MiniAppEntranceView miniAppEntranceView = this.miniAppEntranceView;
        if (miniAppEntranceView != null) {
            miniAppEntranceView.updateViewStatus(f);
        }
        if (f != 1.0f) {
            return;
        }
        reportSearchHintExposure();
    }

    private void changeDrawableAlpha(float f, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878564b", new Object[]{this, new Float(f), view, new Boolean(z)});
        } else if (view == null) {
        } else {
            int i = (int) (255.0f * f);
            if (i < 0) {
                i = 0;
            }
            if (i > 255) {
                i = 255;
            }
            Drawable background = view.getBackground();
            if (background != null) {
                background.setAlpha(i);
            }
            if (!z) {
                return;
            }
            if (f <= 0.2f) {
                view.setClickable(false);
            } else {
                view.setClickable(true);
            }
        }
    }

    private void changeViewAlpha(float f, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e657212", new Object[]{this, new Float(f), view, new Boolean(z)});
        } else if (view == null) {
        } else {
            view.setAlpha(f);
            if (!z) {
                return;
            }
            if (f <= 0.2f) {
                view.setClickable(false);
                if (view != this.mNavTabsBar) {
                    return;
                }
                changeTabsClickable(false);
                return;
            }
            view.setClickable(true);
            if (view != this.mNavTabsBar) {
                return;
            }
            changeTabsClickable(true);
        }
    }

    private void changeTabsClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea8b479", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mNavTabContainer;
        if (linearLayout == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.mNavTabContainer.getChildAt(i).setClickable(z);
        }
    }

    private void changeItemChildrenDrawableAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861c765b", new Object[]{this, new Float(f)});
            return;
        }
        changeChildDrawableAlpha(this.vLeftView, f);
        changeChildDrawableAlpha(this.vCustomView, f);
        changeChildDrawableAlpha(this.vRightView, f);
        for (View view : this.vSpecialViews) {
            changeChildDrawableAlpha(view, f);
        }
    }

    private void changeChildDrawableAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816e47a9", new Object[]{this, view, new Float(f)});
        } else if (view == null) {
        } else {
            int i = (int) (f * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (i > 255) {
                i = 255;
            }
            Drawable background = view.getBackground();
            if (background == null) {
                return;
            }
            background.setAlpha(i);
        }
    }

    private void changeItemChildrenColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ae117b", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.vLeftView;
        if (view instanceof TIconFontTextView) {
            ((TIconFontTextView) view).setTextColor(i);
        }
        View view2 = this.vCustomView;
        if (view2 instanceof TIconFontTextView) {
            ((TIconFontTextView) view2).setTextColor(i);
        } else if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.tao_detail_cart_item);
            if (findViewById instanceof TIconFontTextView) {
                ((TIconFontTextView) findViewById).setTextColor(i);
            }
        }
        TBActionView tBActionView = this.vRightView;
        if (tBActionView != null) {
            tBActionView.setIconColor(i);
        }
        for (View view3 : this.vSpecialViews) {
            if (view3 instanceof TIconFontTextView) {
                ((TIconFontTextView) view3).setTextColor(i);
            }
        }
    }

    private void initNavBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d18dda7", new Object[]{this});
            return;
        }
        if (this.mNavTabsBar == null) {
            this.mNavTabsBar = (LinearLayout) com.taobao.android.detail.core.async.d.b(this.mContext, R.layout.x_detail_main_action_bar_search);
            this.mNavTabContainer = (LinearLayout) this.mNavTabsBar.findViewById(R.id.ll_nav_tab_container);
        }
        if (this.mFullTransparentMode) {
            this.mNavTabsBar.setBackgroundColor(0);
        } else {
            this.mNavTabsBar.setBackgroundColor(this.mTabBgColor);
        }
        this.mNavTabsBar.setVisibility(8);
    }

    public void addTabWithText(String str, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d106a9", new Object[]{this, str, list});
        } else if (this.mNavTabContainer == null) {
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.mContext);
            relativeLayout.setBackgroundColor(0);
            TextView textView = new TextView(this.mContext);
            textView.setText(str);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(this.mTabUnSelColor);
            textView.setGravity(17);
            textView.setBackgroundColor(0);
            textView.setId(R.id.taodetail_nav_bar_tab_text);
            textView.setPadding(0, 0, 0, epo.b(4));
            relativeLayout.addView(textView, new RelativeLayout.LayoutParams(-2, -2));
            View view = new View(this.mContext);
            view.setVisibility(4);
            view.setBackgroundColor(this.mTabSelColor);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, epo.b(2));
            layoutParams.addRule(5, R.id.taodetail_nav_bar_tab_text);
            layoutParams.addRule(7, R.id.taodetail_nav_bar_tab_text);
            layoutParams.addRule(8, R.id.taodetail_nav_bar_tab_text);
            relativeLayout.addView(view, layoutParams);
            View.OnClickListener tabOnClickListener = getTabOnClickListener(textView, view, list);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(0);
            linearLayout.setOnClickListener(tabOnClickListener);
            linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-2, -2));
            this.mNavTabContainer.addView(linearLayout, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
    }

    public void highlightTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d31bb", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.tabNum) {
            Pair<TextView, View> pair = null;
            try {
                if (-1 != this.lastClickIndex.get()) {
                    pair = this.clickableTabRefs.get(this.lastClickIndex.get());
                }
                if (pair != null) {
                    highlightTab(false, (TextView) pair.first, (View) pair.second);
                }
                this.lastClickIndex = new AtomicInteger(i);
                Pair<TextView, View> pair2 = this.clickableTabRefs.get(i);
                if (pair2 == null) {
                    return;
                }
                highlightTab(true, (TextView) pair2.first, (View) pair2.second);
                com.taobao.android.trade.event.d a2 = f.a(this.mContext);
                if (pair2.first == null || !"评价".equals(((TextView) pair2.first).getText())) {
                    return;
                }
                for (Event event : this.mEventss.get(i)) {
                    if (eno.a(enp.class) == event.getEventId()) {
                        a2.a(event);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.ehu
    public void highlightTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6b212", new Object[]{this, str});
            return;
        }
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

    private View.OnClickListener getTabOnClickListener(final TextView textView, final View view, final List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("e10d2fcd", new Object[]{this, textView, view, list});
        }
        if (list != null) {
            this.mEventss.add(list);
        }
        final int size = this.clickableTabRefs.size();
        if (list != null) {
            for (Event event : list) {
                if (eno.a(com.taobao.android.detail.core.event.basic.a.class) == event.getEventId()) {
                    Object param = event.getParam();
                    if (param instanceof HashMap) {
                        String valueOf = String.valueOf(((HashMap) param).get("locatorId"));
                        if (!StringUtils.isEmpty(valueOf)) {
                            this.locatorToTabIndexMap.put(valueOf, Integer.valueOf(size));
                            this.clickableTabRefs.add(new Pair<>(textView, view));
                        }
                    }
                }
            }
        }
        return new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (TaoDetailActionBarV2.access$000(TaoDetailActionBarV2.this).get() >= 0) {
                    Pair pair = (Pair) TaoDetailActionBarV2.access$100(TaoDetailActionBarV2.this).get(TaoDetailActionBarV2.access$000(TaoDetailActionBarV2.this).get());
                    TaoDetailActionBarV2.access$200(TaoDetailActionBarV2.this, false, (TextView) pair.first, (View) pair.second);
                }
                TaoDetailActionBarV2.access$002(TaoDetailActionBarV2.this, new AtomicInteger(size));
                TaoDetailActionBarV2.access$200(TaoDetailActionBarV2.this, true, textView, view);
                com.taobao.android.trade.event.d a2 = f.a(TaoDetailActionBarV2.access$300(TaoDetailActionBarV2.this));
                List list2 = list;
                if (list2 == null || list2.size() <= 0) {
                    return;
                }
                for (Event event2 : list) {
                    a2.a(event2);
                }
            }
        };
    }

    private void highlightTab(boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a19d39a", new Object[]{this, new Boolean(z), textView, view});
            return;
        }
        if (textView != null) {
            textView.setTextColor(z ? this.mTabSelColor : this.mTabUnSelColor);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) textView.getText());
            sb.append(z ? "按钮已选中" : "");
            textView.setContentDescription(sb.toString());
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
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setBackgroundColor(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.mContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, epo.b(20));
        tIconFontTextView.setText(this.mContext.getResources().getString(R.string.uik_icon_location_fill));
        tIconFontTextView.setPadding(0, 0, epo.b(6), 0);
        tIconFontTextView.setTextColor(this.mTabUnSelColor);
        tIconFontTextView.setVisibility(4);
        tIconFontTextView.setBackgroundColor(0);
        linearLayout.addView(tIconFontTextView, layoutParams);
        DetailImageView detailImageView = new DetailImageView(this.mContext);
        epl a2 = new epl.a().c(epo.b(46)).d(epo.b(17)).c(ImageView.ScaleType.FIT_XY).a();
        com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
        if (b != null) {
            b.a(str, detailImageView, a2);
        }
        linearLayout.addView(detailImageView, new LinearLayout.LayoutParams(epo.b(46), epo.b(17)));
        linearLayout.setOnClickListener(getTabOnClickListener(null, tIconFontTextView, list));
        this.mNavTabContainer.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
    }

    public void addNavTabsBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9deb9a", new Object[]{this});
            return;
        }
        initNavBar();
        addView(this.mNavTabsBar, new LinearLayout.LayoutParams(-1, this.mNavTabHeight));
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }

    @Override // tb.ehv
    public void setNavTabsBarAlphaAndVisibility(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf8489", new Object[]{this, new Float(f), new Integer(i)});
        } else if (this.mNavTabsBar == null) {
        } else {
            changeDrawableAlpha(f, this, true);
            changeViewAlpha(f, (View) this.mNavTabsBar, true);
            this.mNavTabsBar.setVisibility(i);
        }
    }

    public void setActionBarBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658c7032", new Object[]{this, drawable});
        } else if (this.mFullTransparentMode) {
            FrameLayout frameLayout = this.mMiniAppContainer;
            if (frameLayout != null) {
                frameLayout.setBackgroundDrawable(drawable);
                changeDrawableAlpha(this.mTransparency, this.mMiniAppContainer, false);
            }
            LinearLayout linearLayout = this.mNavTabsBar;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setBackgroundColor(0);
        } else {
            FrameLayout frameLayout2 = this.mMiniAppContainer;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setBackgroundDrawable(drawable);
        }
    }

    public void setActionBarBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3991202", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabBgColor = i;
        if (this.mFullTransparentMode) {
            FrameLayout frameLayout = this.mMiniAppContainer;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            LinearLayout linearLayout = this.mNavTabsBar;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(0);
            }
            setBackgroundColor(this.mTabBgColor);
            return;
        }
        FrameLayout frameLayout2 = this.mMiniAppContainer;
        if (frameLayout2 != null) {
            frameLayout2.setBackgroundColor(this.mTabBgColor);
        }
        LinearLayout linearLayout2 = this.mNavTabsBar;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundColor(this.mTabBgColor);
        }
        setBackgroundColor(0);
    }

    public void setTabSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b702407", new Object[]{this, new Integer(i)});
        } else {
            this.mTabSelColor = i;
        }
    }

    public void setTabUnSelectedColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ac59c0", new Object[]{this, new Integer(i)});
        } else {
            this.mTabUnSelColor = i;
        }
    }

    public void setItemColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d36864e", new Object[]{this, new Integer(i)});
            return;
        }
        this.menuDefault2R = Color.red(i);
        this.menuDefault2G = Color.green(i);
        this.menuDefault2B = Color.blue(i);
        this.menuDefaultTaoMoment2R = Color.red(i);
        this.menuDefaultTaoMoment2G = Color.green(i);
        this.menuDefaultTaoMoment2B = Color.blue(i);
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<TaoDetailActionBarV2> f11119a;

        static {
            kge.a(995556165);
            kge.a(-1390502639);
        }

        public a(TaoDetailActionBarV2 taoDetailActionBarV2) {
            this.f11119a = new WeakReference<>(taoDetailActionBarV2);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f11119a.get() == null) {
            } else {
                f.a(fpz.c(this.f11119a.get().getContext()), new efw());
            }
        }
    }

    public int getNavItemWH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7b9d16b", new Object[]{this})).intValue() : this.mNavItemWH;
    }

    public FrameLayout getMiniAppContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2457b185", new Object[]{this}) : this.mMiniAppContainer;
    }
}
