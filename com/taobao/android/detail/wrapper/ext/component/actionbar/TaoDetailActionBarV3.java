package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.detail.widget.DetailViewPager;
import com.taobao.android.detail.core.detail.widget.ShopTabTextView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.actionbar.c;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.android.trade.event.f;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ecf;
import tb.ecr;
import tb.ect;
import tb.ehv;
import tb.emu;
import tb.epo;
import tb.eps;
import tb.eqb;
import tb.fha;
import tb.fpr;
import tb.fpz;
import tb.god;
import tb.kge;

/* loaded from: classes5.dex */
public class TaoDetailActionBarV3 extends LinearLayout implements ehv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private ArrayList<Pair<TextView, View>> clickableTabRefs;
    private boolean isFestivalAtmosphere;
    private boolean isNewNav;
    private boolean isRateFragmentShown;
    private boolean isSkinAtmosphere;
    private AtomicInteger lastClickIndex;
    private String lastHighlightElevatorLocatorId;
    private String mActionBarTitle;
    private TextView mActionBarTitleView;
    private List<String> mAnchorPoints;
    private View mBottomLine;
    private Context mContext;
    private int[] mDetailExtraTitleColorRGB;
    private LinearLayout mElevatorContainer;
    private final Map<String, View> mElevatorItems;
    private boolean mFullTransparentMode;
    private boolean mImmersiveEnable;
    private List<View> mItemTabContainers;
    private int[] mMenuDefault2RGB;
    private int[] mMenuDefault2RGBCollected;
    private int[] mMenuDefaultRGB;
    private int[] mMenuDefaultTaoMoment2RGB;
    private FrameLayout mMiniAppContainer;
    private LinearLayout mNavHeadBar;
    private int mNavHeadHeight;
    private int mNavItemWH;
    private int mNavStatusBarHeight;
    private FrameLayout mNavTabAndSearchContainer;
    private LinearLayout mNavTabsBar;
    private float mPadTransparency;
    private View mShopTabView;
    private int mTabBgColor;
    private int[] mTabHighlightLocationRGB;
    private int[] mTabHighlightTextRGB;
    private int mTabNum;
    private int mTabSelColor;
    private int mTabSelLocationColor;
    private int[] mTabTextDefaultRGB;
    private int[] mTabTextRGB;
    private int mTabUnSelColor;
    private Drawable mTopAtmosphereBackground;
    private float mTransparency;
    private float mTransparencyLR;
    private MiniAppEntranceView miniAppEntranceView;
    private float orangeAlpha;
    public SystemBarDecorator systemBarDecorator;
    private List<View> vItemViews;
    private Map<View, View> vNaviTabViews;
    private View vSearchView;

    private int alphaTran(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d080eac0", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        int i2 = (int) (f * i);
        if (i2 < 0) {
            i2 = 0;
        }
        return i2 > i ? i : i2;
    }

    private float getLimitedTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6535a2ad", new Object[]{this, new Float(f)})).floatValue();
        }
        if (f < 1.0E-5f) {
            return 0.0f;
        }
        if (f <= 0.99999f) {
            return f;
        }
        return 1.0f;
    }

    public static /* synthetic */ Object ipc$super(TaoDetailActionBarV3 taoDetailActionBarV3, String str, Object... objArr) {
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
    public void setIsShowComment(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8f3117", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ehv
    public void setNavTabsBarAlphaAndVisibility(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf8489", new Object[]{this, new Float(f), new Integer(i)});
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
    public void setSyncTransparentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c285c71", new Object[]{this, view});
        }
    }

    public static /* synthetic */ Context access$000(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("be393dbe", new Object[]{taoDetailActionBarV3}) : taoDetailActionBarV3.mContext;
    }

    public static /* synthetic */ boolean access$100(TaoDetailActionBarV3 taoDetailActionBarV3, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ec4469d", new Object[]{taoDetailActionBarV3, new Float(f)})).booleanValue() : taoDetailActionBarV3.checkAppear(f);
    }

    public static /* synthetic */ AtomicInteger access$200(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("7dd6dc32", new Object[]{taoDetailActionBarV3}) : taoDetailActionBarV3.lastClickIndex;
    }

    public static /* synthetic */ AtomicInteger access$202(TaoDetailActionBarV3 taoDetailActionBarV3, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("12623eda", new Object[]{taoDetailActionBarV3, atomicInteger});
        }
        taoDetailActionBarV3.lastClickIndex = atomicInteger;
        return atomicInteger;
    }

    public static /* synthetic */ LinearLayout access$300(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("55a5be60", new Object[]{taoDetailActionBarV3}) : taoDetailActionBarV3.mElevatorContainer;
    }

    public static /* synthetic */ ArrayList access$400(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8addb0a4", new Object[]{taoDetailActionBarV3}) : taoDetailActionBarV3.clickableTabRefs;
    }

    public static /* synthetic */ void access$500(TaoDetailActionBarV3 taoDetailActionBarV3, boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a817b7", new Object[]{taoDetailActionBarV3, new Boolean(z), textView, view});
        } else {
            taoDetailActionBarV3.highlightTab(z, textView, view);
        }
    }

    public static /* synthetic */ Map access$600(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f2df5581", new Object[]{taoDetailActionBarV3}) : taoDetailActionBarV3.mergeContentExposure();
    }

    static {
        kge.a(-439831200);
        kge.a(1668956025);
        TAG = TaoDetailActionBarV3.class.getSimpleName();
    }

    public TaoDetailActionBarV3(Context context) {
        super(context);
        this.mAnchorPoints = new ArrayList();
        this.vItemViews = new ArrayList();
        this.vNaviTabViews = new HashMap();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -1;
        this.mTabSelLocationColor = -1;
        this.mTabUnSelColor = -855638017;
        this.mTabBgColor = -1;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.mTabNum = 2;
        this.mMenuDefaultRGB = new int[]{255, 255, 255};
        this.mMenuDefault2RGBCollected = new int[]{255, 80, 0};
        this.mMenuDefault2RGB = new int[]{0, 0, 0};
        this.mMenuDefaultTaoMoment2RGB = new int[]{255, 80, 0};
        this.mTabTextDefaultRGB = new int[]{255, 255, 255};
        this.mTabTextRGB = new int[]{153, 153, 153};
        this.mTabHighlightTextRGB = new int[]{17, 17, 17};
        this.mTabHighlightLocationRGB = new int[]{255, 95, 0};
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.orangeAlpha = god.c;
        this.mItemTabContainers = new ArrayList();
        this.lastHighlightElevatorLocatorId = null;
        this.mElevatorItems = new HashMap();
        this.isNewNav = false;
        this.isRateFragmentShown = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3");
    }

    public TaoDetailActionBarV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAnchorPoints = new ArrayList();
        this.vItemViews = new ArrayList();
        this.vNaviTabViews = new HashMap();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -1;
        this.mTabSelLocationColor = -1;
        this.mTabUnSelColor = -855638017;
        this.mTabBgColor = -1;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.mTabNum = 2;
        this.mMenuDefaultRGB = new int[]{255, 255, 255};
        this.mMenuDefault2RGBCollected = new int[]{255, 80, 0};
        this.mMenuDefault2RGB = new int[]{0, 0, 0};
        this.mMenuDefaultTaoMoment2RGB = new int[]{255, 80, 0};
        this.mTabTextDefaultRGB = new int[]{255, 255, 255};
        this.mTabTextRGB = new int[]{153, 153, 153};
        this.mTabHighlightTextRGB = new int[]{17, 17, 17};
        this.mTabHighlightLocationRGB = new int[]{255, 95, 0};
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.orangeAlpha = god.c;
        this.mItemTabContainers = new ArrayList();
        this.lastHighlightElevatorLocatorId = null;
        this.mElevatorItems = new HashMap();
        this.isNewNav = false;
        this.isRateFragmentShown = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3");
    }

    public TaoDetailActionBarV3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnchorPoints = new ArrayList();
        this.vItemViews = new ArrayList();
        this.vNaviTabViews = new HashMap();
        this.miniAppEntranceView = null;
        this.mTabSelColor = -1;
        this.mTabSelLocationColor = -1;
        this.mTabUnSelColor = -855638017;
        this.mTabBgColor = -1;
        this.lastClickIndex = new AtomicInteger(-1);
        this.clickableTabRefs = new ArrayList<>();
        this.mTabNum = 2;
        this.mMenuDefaultRGB = new int[]{255, 255, 255};
        this.mMenuDefault2RGBCollected = new int[]{255, 80, 0};
        this.mMenuDefault2RGB = new int[]{0, 0, 0};
        this.mMenuDefaultTaoMoment2RGB = new int[]{255, 80, 0};
        this.mTabTextDefaultRGB = new int[]{255, 255, 255};
        this.mTabTextRGB = new int[]{153, 153, 153};
        this.mTabHighlightTextRGB = new int[]{17, 17, 17};
        this.mTabHighlightLocationRGB = new int[]{255, 95, 0};
        this.mFullTransparentMode = false;
        this.mImmersiveEnable = false;
        this.orangeAlpha = god.c;
        this.mItemTabContainers = new ArrayList();
        this.lastHighlightElevatorLocatorId = null;
        this.mElevatorItems = new HashMap();
        this.isNewNav = false;
        this.isRateFragmentShown = false;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3");
    }

    public void setAnchorPoints(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4129ff2", new Object[]{this, list});
        } else {
            this.mAnchorPoints = list;
        }
    }

    public void setTabNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca539089", new Object[]{this, new Integer(i)});
        } else {
            this.mTabNum = i;
        }
    }

    public void setActionBarTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3058722e", new Object[]{this, str});
        } else if (this.isNewNav || StringUtils.isEmpty(str)) {
        } else {
            this.mActionBarTitle = str;
            if (this.mActionBarTitleView == null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = epo.b(6);
                this.mActionBarTitleView = new TextView(this.mContext);
                this.mActionBarTitleView.setTextSize(1, 18.0f);
                this.mActionBarTitleView.setTypeface(null, 1);
                this.mActionBarTitleView.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
                this.mActionBarTitleView.setVisibility(8);
                this.mNavTabsBar.addView(this.mActionBarTitleView, layoutParams);
            }
            this.mActionBarTitleView.setText(this.mActionBarTitle);
        }
    }

    public void showActionBarTitle(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4a7375", new Object[]{this, new Boolean(z)});
        } else if (this.mActionBarTitleView != null && (view = this.vSearchView) != null && view.getParent() != null) {
            if (z && StringUtils.isEmpty(this.mActionBarTitle)) {
                return;
            }
            int i = 8;
            ((FrameLayout) this.vSearchView.getParent()).setVisibility(z ? 8 : 0);
            for (int i2 = 0; i2 < this.mItemTabContainers.size(); i2++) {
                View view2 = this.mItemTabContainers.get(i2);
                if (view2 != null) {
                    view2.setVisibility(z ? 8 : 0);
                }
            }
            TextView textView = this.mActionBarTitleView;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
            if (z) {
                return;
            }
            this.mActionBarTitle = null;
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
        this.mNavItemWH = fpr.a(this.mContext, 29.0f);
        this.mNavHeadHeight = fpr.a(this.mContext, 44.0f);
        this.mNavStatusBarHeight = this.mImmersiveEnable ? ecr.b(this.mContext) : 0;
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
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        initItemsAndTabs();
        initMiniApp();
        if (!this.isNewNav) {
            return;
        }
        addBottomLine();
    }

    private void addBottomLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c7d4c7", new Object[]{this});
            return;
        }
        this.mBottomLine = new View(this.mContext);
        this.mBottomLine.setBackgroundColor(Color.parseColor("#0D000000"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.gravity = 80;
        this.mMiniAppContainer.addView(this.mBottomLine, layoutParams);
        changeDrawableAlpha(0.0f, this.mBottomLine);
    }

    private void initItemsAndTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a0d14c", new Object[]{this});
            return;
        }
        this.mTransparency = 0.0f;
        this.mPadTransparency = 0.0f;
        if (this.mFullTransparentMode) {
            changeDrawableAlpha(0.0f, this);
            changeMiniAppContainerDrawableAlpha(0.0f, this.mMiniAppContainer);
            changeItemChildrenColor(getRGBColor(255, this.mMenuDefaultRGB));
            return;
        }
        changeItemChildrenColor(getRGBColor(255, this.mMenuDefault2RGB));
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

    public void initElevatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7ddcea", new Object[]{this});
            return;
        }
        if (this.mElevatorContainer == null) {
            this.mElevatorContainer = new LinearLayout(this.mContext);
            this.mElevatorContainer.setBackgroundResource(R.drawable.x_detail_action_bar_elevator_container_bg_v3);
            this.mElevatorContainer.setOrientation(0);
        }
        addView(this.mElevatorContainer, new LinearLayout.LayoutParams(-1, epo.b(34)));
        this.mElevatorContainer.setVisibility(8);
    }

    public void showElevatorView(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1120f4dd", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mElevatorContainer;
        if (linearLayout == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void addElevatorItem(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c523c7d", new Object[]{this, str, str2});
        } else if (this.mElevatorContainer == null || StringUtils.isEmpty(str)) {
        } else {
            TextView textView = new TextView(this.mContext);
            textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{-16777216, -6710887}));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setBackgroundColor(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("locatorId", (Object) str);
                    f.a(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this)).a(new com.taobao.android.detail.core.event.basic.a(jSONObject));
                }
            });
            textView.setSelected(false);
            textView.setText(str2);
            this.mElevatorContainer.addView(textView, new LinearLayout.LayoutParams(0, -1, 1.0f));
            this.mElevatorItems.put(str, textView);
        }
    }

    public FrameLayout createNavBarIconFontLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c37cf4db", new Object[]{this, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        frameLayout.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_black_v3);
        return frameLayout;
    }

    public void addItemView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c76891", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            this.vItemViews.add(view);
            if (this.isNewNav && i == 3) {
                addSearchItem(view);
                return;
            }
            int i2 = 1 == i ? epo.g : epo.e;
            int i3 = 2 == i ? epo.g : epo.e;
            if (1 == i) {
                i3 = 0;
            }
            addNaviItem(i2, i3, view, i);
        }
    }

    private void addNaviItem(int i, int i2, View view, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1999c132", new Object[]{this, new Integer(i), new Integer(i2), view, new Integer(i3)});
            return;
        }
        int i4 = this.mNavItemWH;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i2;
        FrameLayout createNavBarIconFontLayout = createNavBarIconFontLayout(fpr.a(this.mContext, 29.0f));
        createNavBarIconFontLayout.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        this.mNavHeadBar.addView(createNavBarIconFontLayout, layoutParams);
        if (3 != i3) {
            return;
        }
        this.vSearchView = view;
        changeSearch(0.0f);
    }

    private void addSearchItem(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a6190f", new Object[]{this, view});
        } else if (view == null) {
        } else {
            FrameLayout frameLayout = new FrameLayout(this.mContext);
            frameLayout.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_black_v3);
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mNavItemWH);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = epo.i;
            layoutParams.rightMargin = epo.g;
            this.mNavTabAndSearchContainer.addView(frameLayout, layoutParams);
            TextView textView = (TextView) view.findViewById(R.id.if_action_bar_search_icon);
            TextView textView2 = (TextView) view.findViewById(R.id.if_action_bar_search_text);
            if (textView != null && textView2 != null) {
                if (this.isFestivalAtmosphere || this.isSkinAtmosphere) {
                    textView.setTextColor(getRGBColor(255, this.mMenuDefaultRGB));
                    textView2.setTextColor(getRGBColor(255, this.mMenuDefaultRGB));
                } else {
                    textView.setTextColor(-16777216);
                    textView2.setTextColor(-16777216);
                }
            }
            this.vSearchView = view;
            changeSearch(0.0f);
        }
    }

    public FrameLayout getMiniAppContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2457b185", new Object[]{this}) : this.mMiniAppContainer;
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue() : this.mNavHeadHeight + this.mNavStatusBarHeight;
    }

    private boolean checkFix(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7573ee50", new Object[]{this, new Float(f)})).booleanValue() : f <= this.orangeAlpha;
    }

    private boolean checkDisappear(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dafd582", new Object[]{this, new Float(f)})).booleanValue();
        }
        float f2 = this.orangeAlpha;
        return f > f2 && f < (f2 + 1.0f) / 2.0f;
    }

    private float getDisappearAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b8e638", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.orangeAlpha;
        return getLimitedTransparency(1.0f - (((f - f2) * 2.0f) / (1.0f - f2)));
    }

    private boolean checkAppear(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a552a980", new Object[]{this, new Float(f)})).booleanValue() : f >= (this.orangeAlpha + 1.0f) / 2.0f && f <= 1.0f;
    }

    private float getAppearAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beaec856", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.orangeAlpha;
        return getLimitedTransparency(((f - ((f2 + 1.0f) / 2.0f)) * 2.0f) / (1.0f - f2));
    }

    public void setTransparencyLR(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4194cc39", new Object[]{this, new Float(f)});
            return;
        }
        float limitedTransparency = getLimitedTransparency(f);
        if (Math.abs(limitedTransparency - this.mTransparencyLR) <= 1.0E-5f) {
            return;
        }
        this.mTransparencyLR = limitedTransparency;
        if (!checkFix(this.mTransparency) && (!checkDisappear(this.mTransparency) ? !(!checkAppear(this.mTransparency) || (checkAppear(limitedTransparency) && getAppearAlpha(limitedTransparency) >= getAppearAlpha(this.mTransparency))) : !(this.isFestivalAtmosphere || this.isSkinAtmosphere || ((checkDisappear(limitedTransparency) && getDisappearAlpha(limitedTransparency) <= getDisappearAlpha(this.mTransparency)) || (checkAppear(limitedTransparency) && getAppearAlpha(limitedTransparency) >= getAppearAlpha(this.mTransparency)))))) {
            z = false;
        }
        if (!z) {
            limitedTransparency = this.mTransparency;
        }
        changeActionBarTransparency(limitedTransparency);
    }

    @Override // tb.ehu
    public void setTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f8137f", new Object[]{this, new Float(f)});
            return;
        }
        float limitedTransparency = getLimitedTransparency(f);
        if (Math.abs(limitedTransparency - this.mTransparency) <= 1.0E-5f) {
            return;
        }
        this.mTransparency = limitedTransparency;
        changeActionBarTransparency(limitedTransparency);
        MiniAppEntranceView miniAppEntranceView = this.miniAppEntranceView;
        if (miniAppEntranceView == null) {
            return;
        }
        miniAppEntranceView.updateViewStatus(limitedTransparency);
    }

    @Override // tb.ehu
    public void setPadTransparency(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5769d2f0", new Object[]{this, new Float(f)});
            return;
        }
        float limitedTransparency = getLimitedTransparency(f);
        this.mPadTransparency = limitedTransparency;
        if (!this.mFullTransparentMode) {
            return;
        }
        changeAppearDrawableAlpha(limitedTransparency, this.mBottomLine);
        changeElevatorViewTransparency(limitedTransparency);
        changeNavTabsBarTransparency(limitedTransparency);
    }

    private void changeActionBarTransparency(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdf7b14", new Object[]{this, new Float(f)});
        } else if (!this.mFullTransparentMode) {
        } else {
            changeAppearDrawableAlpha(f, this);
            changeMiniAppContainerDrawableAlpha(f, this.mMiniAppContainer);
            changeAppearDrawableAlpha(f, this.mBottomLine);
            changeItemChildrenDrawableAlpha(f);
            changeItemChildrenTran(f);
            changeItemChildrenParentTran(f);
            if (this.lastClickIndex.get() != 0) {
                z = false;
            }
            changeTabColor(f, z);
            changeSearch(f);
            changeElevatorViewTransparency(f);
            changeNavTabsBarTransparency(f);
        }
    }

    private void changeElevatorViewTransparency(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa9b57e", new Object[]{this, new Float(f)});
            return;
        }
        LinearLayout linearLayout = this.mElevatorContainer;
        if (linearLayout == null) {
            return;
        }
        changeViewAlpha(f, linearLayout);
        if (this.isRateFragmentShown) {
            this.mElevatorContainer.setVisibility(8);
            return;
        }
        this.mElevatorContainer.setClickable(checkAppear(f));
        this.mElevatorContainer.post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LinearLayout access$300 = TaoDetailActionBarV3.access$300(TaoDetailActionBarV3.this);
                if (!TaoDetailActionBarV3.access$100(TaoDetailActionBarV3.this, f) || TaoDetailActionBarV3.access$200(TaoDetailActionBarV3.this).get() > 0) {
                    i = 8;
                }
                access$300.setVisibility(i);
            }
        });
    }

    private void changeNavTabsBarTransparency(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bfa2ff", new Object[]{this, new Float(f)});
        } else if (!this.isNewNav) {
        } else {
            if (this.lastClickIndex.get() == 0) {
                LinearLayout linearLayout = this.mNavTabsBar;
                if (linearLayout != null) {
                    linearLayout.setVisibility(checkAppear(f) ? 8 : 0);
                }
            } else {
                this.mNavTabsBar.setVisibility(0);
            }
            if (checkAppear(f) && this.lastClickIndex.get() <= 0) {
                z = false;
            }
            setTabScrollable(z);
        }
    }

    private void changeStatusBarColor(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8d3531", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.systemBarDecorator == null) {
            this.systemBarDecorator = new SystemBarDecorator((Activity) this.mContext);
        }
        this.systemBarDecorator.enableImmersiveStatus(str, z, true);
    }

    private void changeMiniAppContainerDrawableAlpha(float f, View view) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7eba692", new Object[]{this, new Float(f), view});
            return;
        }
        if (this.mFullTransparentMode) {
            if (checkAppear(f)) {
                if (!this.isFestivalAtmosphere && !this.isSkinAtmosphere && (drawable = this.mTopAtmosphereBackground) != null) {
                    this.mMiniAppContainer.setBackgroundDrawable(drawable);
                    changeStatusBarColor("#00000000", false);
                }
                changeDrawableAlpha(getAppearAlpha(f), view);
                return;
            }
            this.mMiniAppContainer.setBackgroundColor(0);
        } else {
            this.mMiniAppContainer.setBackgroundColor(this.mTabBgColor);
        }
        changeDrawableAlpha(0.0f, view);
    }

    private void changeDrawableAlpha(float f, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52da91a9", new Object[]{this, new Float(f), view});
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

    private void changeAppearDrawableAlpha(float f, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f83914", new Object[]{this, new Float(f), view});
        } else if (checkAppear(f)) {
            changeDrawableAlpha(getAppearAlpha(f), view);
        } else {
            changeDrawableAlpha(0.0f, view);
        }
    }

    private void changeItemChildrenDrawableAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861c765b", new Object[]{this, new Float(f)});
            return;
        }
        if (checkFix(f) || this.isFestivalAtmosphere || this.isSkinAtmosphere) {
            f = 1.0f;
        } else if (checkDisappear(f)) {
            f = getDisappearAlpha(f);
        } else if (checkAppear(f)) {
            f = getAppearAlpha(f);
        }
        for (View view : this.vItemViews) {
            changeDrawableAlpha(f, view);
        }
    }

    public void changeItemChildrenTran(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dabec", new Object[]{this, new Float(f)});
            return;
        }
        int[] iArr = this.mMenuDefaultRGB;
        int i = 255;
        if (!checkFix(f) && !this.isFestivalAtmosphere && !this.isSkinAtmosphere) {
            if (checkDisappear(f)) {
                i = alphaTran(255, getDisappearAlpha(f));
            } else if (checkAppear(f)) {
                i = alphaTran(255, getAppearAlpha(f));
                iArr = this.mMenuDefault2RGB;
            }
        }
        changeItemChildrenColor(getRGBColor(i, iArr));
    }

    private int getCollectedIconColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c56011", new Object[]{this})).intValue();
        }
        float f = this.mTransparency;
        int i = 255;
        if (!checkFix(f) && !this.isFestivalAtmosphere && !this.isSkinAtmosphere) {
            if (checkDisappear(f)) {
                i = alphaTran(255, getDisappearAlpha(f));
            } else if (checkAppear(f)) {
                i = alphaTran(255, getAppearAlpha(f));
            }
        }
        return getRGBColor(i, this.mMenuDefault2RGBCollected);
    }

    private void changeItemChildrenColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ae117b", new Object[]{this, new Integer(i)});
            return;
        }
        for (View view : this.vItemViews) {
            if (view instanceof TIconFontTextView) {
                TIconFontTextView tIconFontTextView = (TIconFontTextView) view;
                if ("뀛".contentEquals(tIconFontTextView.getText())) {
                    tIconFontTextView.setTextColor(getCollectedIconColor());
                } else {
                    tIconFontTextView.setTextColor(i);
                }
            } else if (view instanceof TBActionView) {
                ((TBActionView) view).setIconColor(i);
            }
        }
    }

    private void changeItemChildTabColor(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c56c6", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        Iterator<View> it = this.vNaviTabViews.keySet().iterator();
        while (it.hasNext()) {
            changeTabTextColor((TextView) it.next(), i, z);
        }
        View view = this.mShopTabView;
        if (view != null) {
            changeTabTextColor((TextView) view, i, z);
        }
        if (this.clickableTabRefs.size() <= 0) {
            return;
        }
        ((TextView) this.clickableTabRefs.get(this.lastClickIndex.get()).first).setTextColor(i2);
    }

    private void changeTabTextColor(TextView textView, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d3407d", new Object[]{this, textView, new Integer(i), new Boolean(z)});
            return;
        }
        textView.setTextColor(i);
        if (z) {
            textView.setShadowLayer(4.0f, 2.0f, 4.0f, Color.parseColor("#33000000"));
        } else {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    private void changeItemChildTabLocateColor(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97df53ed", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        for (View view : this.vNaviTabViews.keySet()) {
            View view2 = this.vNaviTabViews.get(view);
            GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.x_detail_tab_bar_circular_bg);
            gradientDrawable.setColor(i);
            view2.setBackgroundDrawable(gradientDrawable);
            if (z) {
                if (Build.VERSION.SDK_INT >= 28) {
                    view2.setOutlineSpotShadowColor(Color.parseColor("#000000"));
                    view2.setOutlineProvider(ViewOutlineProvider.PADDED_BOUNDS);
                    view2.setElevation(4.0f);
                    view2.setTranslationX(2.0f);
                }
            } else if (Build.VERSION.SDK_INT >= 28) {
                view2.setOutlineSpotShadowColor(0);
                view2.setOutlineProvider(null);
                view2.setElevation(0.0f);
            }
        }
    }

    private void changeTabColor(float f, boolean z) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e0ff9", new Object[]{this, new Float(f), new Boolean(z)});
        } else if (checkFix(f) || this.isFestivalAtmosphere || this.isSkinAtmosphere) {
            this.mTabSelColor = getRGBColor(255, this.mTabTextDefaultRGB);
            this.mTabUnSelColor = getRGBColor(230, this.mTabTextDefaultRGB);
            changeItemChildTabColor(this.mTabUnSelColor, this.mTabSelColor, true);
            changeItemChildTabLocateColor(this.mTabSelColor, true);
        } else if (checkDisappear(f)) {
            float disappearAlpha = getDisappearAlpha(f);
            int alphaTran = alphaTran(255, disappearAlpha);
            int alphaTran2 = alphaTran(230, disappearAlpha);
            this.mTabSelColor = getRGBColor(Math.min(255, alphaTran), this.mTabTextDefaultRGB);
            this.mTabUnSelColor = getRGBColor(Math.min(255, alphaTran2), this.mTabTextDefaultRGB);
            changeItemChildTabColor(this.mTabUnSelColor, this.mTabSelColor, false);
            changeItemChildTabLocateColor(this.mTabSelColor, false);
            this.mTabSelLocationColor = this.mTabSelColor;
        } else if (!checkAppear(f)) {
        } else {
            int min = Math.min(255, alphaTran(255, getAppearAlpha(f)));
            if (z && (iArr = this.mDetailExtraTitleColorRGB) != null) {
                this.mTabSelColor = getRGBColor(min, iArr);
            } else {
                this.mTabSelColor = getRGBColor(min, this.mTabHighlightTextRGB);
            }
            this.mTabUnSelColor = getRGBColor(min, this.mTabTextRGB);
            changeItemChildTabColor(this.mTabUnSelColor, this.mTabSelColor, false);
            int[] iArr2 = this.mDetailExtraTitleColorRGB;
            if (iArr2 != null) {
                this.mTabSelLocationColor = getRGBColor(min, iArr2);
            } else {
                this.mTabSelLocationColor = getRGBColor(min, this.mTabHighlightLocationRGB);
            }
            changeItemChildTabLocateColor(this.mTabSelLocationColor, false);
        }
    }

    private int getRGBColor(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c701d1", new Object[]{this, new Integer(i), iArr})).intValue() : Color.argb(i, iArr[0], iArr[1], iArr[2]);
    }

    private void changeItemChildrenParentTran(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bfd3e2", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = 1.0f;
        if (!checkFix(f) && !this.isFestivalAtmosphere && !this.isSkinAtmosphere) {
            if (checkDisappear(f)) {
                f2 = getDisappearAlpha(f);
            } else if (checkAppear(f)) {
                f2 = getAppearAlpha(f);
                z = false;
            }
        }
        changeItemChildrenParentColor(z, f2);
    }

    private void changeItemChildrenParentColor(boolean z, float f) {
        View next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb4426a", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        Iterator<View> it = this.vItemViews.iterator();
        while (it.hasNext() && (next = it.next()) != null && next.getParent() != null) {
            FrameLayout frameLayout = (FrameLayout) next.getParent();
            frameLayout.setBackgroundResource(z ? R.drawable.x_detail_action_bar_circular_bg_black_v3 : R.drawable.x_detail_action_bar_circular_bg_white_v3);
            frameLayout.setAlpha(f);
        }
    }

    private void changeSearch(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea0bda1", new Object[]{this, new Float(f)});
            return;
        }
        View view = this.vSearchView;
        if (view == null || view.getParent() == null) {
            return;
        }
        if (this.isNewNav && this.lastClickIndex.get() > 0) {
            if (this.vSearchView.getParent() == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.vSearchView.getParent();
            frameLayout.setVisibility(8);
            changeViewAlpha(f, frameLayout);
            return;
        }
        if (this.vSearchView.getParent() != null) {
            FrameLayout frameLayout2 = (FrameLayout) this.vSearchView.getParent();
            frameLayout2.setVisibility(0);
            changeViewAlpha(f, frameLayout2);
        }
        changeViewAlpha(f, this.vSearchView);
        if (checkAppear(f)) {
            this.vSearchView.setClickable(true);
        } else {
            this.vSearchView.setClickable(false);
        }
    }

    private void changeViewAlpha(float f, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42876102", new Object[]{this, new Float(f), view});
        } else if (checkAppear(f)) {
            view.setAlpha(getAppearAlpha(f));
        } else {
            view.setAlpha(0.0f);
        }
    }

    private void initNavBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d18dda7", new Object[]{this});
            return;
        }
        if (this.mNavTabsBar == null) {
            this.mNavTabsBar = new LinearLayout(this.mContext);
        }
        if (this.mFullTransparentMode) {
            this.mNavTabsBar.setBackgroundColor(0);
        } else {
            this.mNavTabsBar.setBackgroundColor(this.mTabBgColor);
        }
        this.mNavTabsBar.setVisibility(0);
    }

    public void addTabWithText(String str, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8149522", new Object[]{this, str, aVar});
        } else if (this.mNavTabsBar == null) {
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(this.mContext);
            relativeLayout.setBackgroundColor(0);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            TextView textView = new TextView(this.mContext);
            initTabTextView(textView);
            textView.setId(R.id.taodetail_nav_bar_tab_text);
            textView.setText(str);
            relativeLayout.addView(textView, new RelativeLayout.LayoutParams(-2, -2));
            View view = new View(this.mContext);
            view.setVisibility(4);
            view.setBackgroundColor(this.mTabSelLocationColor);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(epo.b(15), epo.b(2));
            layoutParams.addRule(14);
            layoutParams.addRule(8, R.id.taodetail_nav_bar_tab_text);
            relativeLayout.addView(view, layoutParams);
            View.OnClickListener tabOnClickListener = getTabOnClickListener(textView, view, aVar);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(0);
            linearLayout.setOnClickListener(tabOnClickListener);
            linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-2, -2));
            this.mNavTabsBar.addView(linearLayout, createTabLayoutParams());
            this.mItemTabContainers.add(linearLayout);
            this.vNaviTabViews.put(textView, view);
            highlightTab(0);
        }
    }

    public void highlightTab(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d31bb", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.mTabNum) {
        } else {
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
                if (i != 0 || getTransparency() <= 0.1f) {
                    z = false;
                }
                showElevatorView(z);
            } catch (Throwable unused) {
                this.lastClickIndex = new AtomicInteger(i);
            }
        }
    }

    @Override // tb.ehu
    public void highlightTab(String str) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6b212", new Object[]{this, str});
            return;
        }
        i.a("[highlightTab]" + TAG, str);
        if (str == null || StringUtils.equals(str, this.lastHighlightElevatorLocatorId)) {
            return;
        }
        String str2 = this.lastHighlightElevatorLocatorId;
        if (str2 != null && (view = this.mElevatorItems.get(str2)) != null) {
            view.setSelected(false);
        }
        View view2 = this.mElevatorItems.get(str);
        if (view2 != null) {
            view2.setSelected(true);
        }
        this.lastHighlightElevatorLocatorId = str;
    }

    private int[] colorStringToHexArray(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("10c223f8", new Object[]{this, str, iArr});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.length() < 6) {
            return iArr;
        }
        try {
            iArr = new int[3];
            for (int i = 0; i < 3; i++) {
                int i2 = i << 1;
                iArr[i] = Integer.parseInt(str.substring(i2, i2 + 2), 16);
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    private int getColorFromString(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("276dbc8c", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue() : StringUtils.isEmpty(str) ? i : parseColor(str, i2);
    }

    private int parseColor(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            if (str.length() != 6) {
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) ((i << 24) | Long.parseLong(str, 16));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private float getFloatFromString(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bbb307e", new Object[]{this, str, new Float(f)})).floatValue();
        }
        if (StringUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public void setFestivalAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcb73f1", new Object[]{this, new Boolean(z)});
        } else {
            this.isFestivalAtmosphere = z;
        }
    }

    public void setSkinAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a546c4c", new Object[]{this, new Boolean(z)});
        } else {
            this.isSkinAtmosphere = z;
        }
    }

    public void setExtraDetailTitleColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6becb1b", new Object[]{this, str});
        } else if (this.isFestivalAtmosphere || this.isSkinAtmosphere) {
        } else {
            this.mDetailExtraTitleColorRGB = colorStringToHexArray(str, this.mTabHighlightTextRGB);
        }
    }

    public void setTopAtmosphereBackground(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21dfb06", new Object[]{this, jSONObject});
        } else if (!this.isFestivalAtmosphere && !this.isSkinAtmosphere && jSONObject != null && !jSONObject.isEmpty() && Build.VERSION.SDK_INT >= 16 && (jSONArray = jSONObject.getJSONArray("topAtmosphereGradientColor")) != null && jSONArray.size() != 0) {
            int size = jSONArray.size();
            int[] iArr = new int[size + 1];
            float floatFromString = getFloatFromString(jSONObject.getString("alpha"), 1.0f);
            for (int i = 0; i < size; i++) {
                iArr[i] = getColorFromString(jSONArray.getString(i).replace("#", ""), 0, (int) (255.0f * floatFromString));
            }
            iArr[size] = parseColor("#FFFFFF", 1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(iArr);
            this.mTopAtmosphereBackground = gradientDrawable;
        }
    }

    private View.OnClickListener getTabOnClickListener(final TextView textView, final View view, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("d955f6b0", new Object[]{this, textView, view, aVar});
        }
        final int size = this.clickableTabRefs.size();
        this.clickableTabRefs.add(new Pair<>(textView, view));
        return new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (TaoDetailActionBarV3.access$200(TaoDetailActionBarV3.this).get() >= 0) {
                    Pair pair = (Pair) TaoDetailActionBarV3.access$400(TaoDetailActionBarV3.this).get(TaoDetailActionBarV3.access$200(TaoDetailActionBarV3.this).get());
                    TaoDetailActionBarV3.access$500(TaoDetailActionBarV3.this, false, (TextView) pair.first, (View) pair.second);
                }
                TaoDetailActionBarV3.access$202(TaoDetailActionBarV3.this, new AtomicInteger(size));
                TaoDetailActionBarV3.access$500(TaoDetailActionBarV3.this, true, textView, view);
                c.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(size);
                int i = size;
                if (i == 0) {
                    eps.a(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), "Page_Detail", 2101, "Page_Detail_Button_ProductDetail", "detailV3", null, new String[0]);
                } else if (1 != i) {
                } else {
                    eps.a(TaoDetailActionBarV3.access$000(TaoDetailActionBarV3.this), "Page_Detail", 2101, "Page_Detail_Button_Content", "detailV3", null, ect.b(TaoDetailActionBarV3.access$600(TaoDetailActionBarV3.this)));
                }
            }
        };
    }

    private Map<String, Object> mergeContentExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("893185c4", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailActivity) this.mContext).y().t;
            hashMap.putAll(eqb.x(cVar.f10055a).commonUtParams);
            hashMap.put("itemId", cVar.i());
        } catch (Exception e) {
            i.a("[mergeContentExposure]" + TAG, e.getMessage());
        }
        return hashMap;
    }

    private void closePopWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2f4a90", new Object[]{this});
            return;
        }
        DetailActivity detailActivity = (DetailActivity) this.mContext;
        if (detailActivity.b == null || detailActivity.b.i == null || detailActivity.b.i.getBackStackEntryCount() <= 0) {
            return;
        }
        try {
            detailActivity.b.i.popBackStack();
        } catch (IllegalStateException unused) {
        }
    }

    private void highlightTab(boolean z, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        int i = 4;
        boolean z2 = true;
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
            if (this.mAnchorPoints.size() > 1 && this.mAnchorPoints.get(1).equals(textView.getText().toString())) {
                float f = 1.0f;
                changeItemChildrenTran(1.0f);
                changeItemChildrenParentTran(1.0f);
                changeTabColor(1.0f, false);
                changeMiniAppContainerDrawableAlpha(1.0f, this.mMiniAppContainer);
                if (this.isNewNav) {
                    f = 0.0f;
                }
                changeSearch(f);
                if (z) {
                    closePopWindow();
                }
            } else {
                if (this.mAnchorPoints.size() <= 0 || !this.mAnchorPoints.get(0).equals(textView.getText().toString())) {
                    z2 = false;
                }
                changeItemChildrenTran(this.mTransparency);
                changeItemChildrenParentTran(this.mTransparency);
                changeTabColor(this.mTransparency, z2);
                changeMiniAppContainerDrawableAlpha(this.mTransparency, this.mMiniAppContainer);
                changeSearch(this.mTransparency);
            }
        }
        if (view != null) {
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (!z) {
            return;
        }
        fha.a(this.mContext, textView);
    }

    public void addNavTabsBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9deb9a", new Object[]{this});
            return;
        }
        if (this.mNavTabAndSearchContainer == null) {
            this.mNavTabAndSearchContainer = new FrameLayout(this.mContext);
        }
        LinearLayout linearLayout = this.mNavTabsBar;
        if (linearLayout != null) {
            this.mNavTabAndSearchContainer.removeView(linearLayout);
        }
        initNavBar();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.mNavTabAndSearchContainer.addView(this.mNavTabsBar, layoutParams);
        this.mNavHeadBar.addView(this.mNavTabAndSearchContainer, new LinearLayout.LayoutParams(-1, -1, 1.0f));
    }

    public void setActionBarBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658c7032", new Object[]{this, drawable});
        } else if (this.mFullTransparentMode) {
            FrameLayout frameLayout = this.mMiniAppContainer;
            if (frameLayout != null) {
                frameLayout.setBackgroundDrawable(drawable);
                changeMiniAppContainerDrawableAlpha(this.mTransparency, this.mMiniAppContainer);
                changeAppearDrawableAlpha(this.mTransparency, this.mBottomLine);
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
        this.mMenuDefault2RGB = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
        this.mMenuDefaultTaoMoment2RGB = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
    }

    public int getNavItemWH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7b9d16b", new Object[]{this})).intValue() : this.mNavItemWH;
    }

    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            highlightTab(i);
        }
    }

    public void addShopTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe78ef", new Object[]{this, str});
            return;
        }
        Context context = this.mContext;
        if (!(context instanceof DetailActivity)) {
            return;
        }
        final DetailActivity detailActivity = (DetailActivity) context;
        ShopTabTextView shopTabTextView = new ShopTabTextView(context);
        initTabTextView(shopTabTextView);
        shopTabTextView.setText(str);
        shopTabTextView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (detailActivity.y() == null || detailActivity.y().y() == null) {
                } else {
                    detailActivity.y().y().d();
                    ecf.j(detailActivity);
                }
            }
        });
        LinearLayout.LayoutParams createTabLayoutParams = createTabLayoutParams();
        this.mNavTabsBar.setClipChildren(false);
        this.mNavTabsBar.addView(shopTabTextView, createTabLayoutParams);
        this.mShopTabView = shopTabTextView;
        this.mItemTabContainers.add(this.mShopTabView);
        ecf.i(detailActivity);
    }

    private void initTabTextView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891b8206", new Object[]{this, textView});
            return;
        }
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(this.mTabUnSelColor);
        textView.setGravity(17);
        textView.setBackgroundColor(0);
        textView.setPadding(0, 0, 0, epo.b(4));
        textView.setShadowLayer(4.0f, 0.0f, 2.0f, Color.parseColor("#33000000"));
    }

    private LinearLayout.LayoutParams createTabLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("7cc9489b", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = epo.b(8);
        layoutParams.topMargin = epo.b(6);
        return layoutParams;
    }

    private void setTabScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcd0193", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = this.mContext;
        if (!(context instanceof DetailActivity)) {
            return;
        }
        DetailActivity detailActivity = (DetailActivity) context;
        if (!(detailActivity.bc() instanceof DetailViewPager)) {
            return;
        }
        ((DetailViewPager) detailActivity.bc()).setDisableHorizontalScroll(!z);
    }

    public void setIsNewNav(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10880de", new Object[]{this, new Boolean(z)});
        } else {
            this.isNewNav = z;
        }
    }

    public void setIsRateFragmentShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdee078", new Object[]{this, new Boolean(z)});
        } else {
            this.isRateFragmentShown = z;
        }
    }
}
