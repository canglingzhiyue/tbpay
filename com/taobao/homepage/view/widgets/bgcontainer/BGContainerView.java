package com.taobao.homepage.view.widgets.bgcontainer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.view.ClipLayout;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.homepage.f;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.ksp;
import tb.ksr;
import tb.kss;
import tb.kst;
import tb.ktp;
import tb.lbq;
import tb.mjx;
import tb.ohv;
import tb.onq;
import tb.riy;

/* loaded from: classes7.dex */
public class BGContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "homepage";
    private static final String TAG = "home.BGContainerView";
    private static final String TRACE_ARG1_BGCONFIG = "bg_config_trace";
    private static final int TRACE_EVENTID = 19999;
    private static final String UB_VERSION = "1.0";
    private static final int end = 4;
    private static final int pause = 3;
    private static final int restart = 5;
    private static final int resume = 2;
    private static final int start = 1;
    public FrameLayout animationContainer;
    public long animationImgStart;
    public HImageView animationView;
    public HImageView animationView2;
    private ClipLayout bannerView;
    private BGConfig bgConfig;
    private int bgHeightOffset;
    public View bgView;
    public HImageView bottomMaskView;
    private float currentHeaderAlpha;
    private int endOffset;
    private View globalThemeViewNew;
    private boolean isIdle;
    public int lastHeaderScrollDistance;
    public HImageView maskView;
    private a multiTabBGContainerViewProxy;
    private b newFaceBGContainerViewProxy;
    private lbq pageProvider;
    public ValueAnimator rotateAnimator;
    public AnimationSet scaleAnimation;
    public Animation scaleAnimation2;
    private int screenAniHeight;
    private int screenHeight;
    private int targetPos;
    public HImageView topMaskView;
    public int[] viewHeights;

    static {
        kge.a(-1428466254);
    }

    private int getTopOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab7db0c", new Object[]{this})).intValue();
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(BGContainerView bGContainerView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65213c2b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public static /* synthetic */ BGConfig access$000(BGContainerView bGContainerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BGConfig) ipChange.ipc$dispatch("8c2ed84f", new Object[]{bGContainerView}) : bGContainerView.bgConfig;
    }

    public static /* synthetic */ void access$100(BGContainerView bGContainerView, BGConfig bGConfig, BGConfig bGConfig2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8078915", new Object[]{bGContainerView, bGConfig, bGConfig2});
        } else {
            bGContainerView.updateAnimation(bGConfig, bGConfig2);
        }
    }

    public static /* synthetic */ void access$200(BGContainerView bGContainerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb59c96", new Object[]{bGContainerView, new Integer(i), new Integer(i2)});
        } else {
            bGContainerView.innerScrollTo(i, i2);
        }
    }

    public static /* synthetic */ void access$300(BGContainerView bGContainerView, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e0328b", new Object[]{bGContainerView, new Float(f), new Boolean(z)});
        } else {
            bGContainerView.updateHeaderView(f, z);
        }
    }

    public static /* synthetic */ void access$400(BGContainerView bGContainerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c6994b", new Object[]{bGContainerView, new Integer(i)});
        } else {
            bGContainerView.updateBgHeight(i);
        }
    }

    public BGContainerView(Context context) {
        this(context, null);
    }

    public BGContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BGContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.screenHeight = getResources().getDisplayMetrics().heightPixels;
        this.currentHeaderAlpha = 0.0f;
        this.isIdle = false;
        this.lastHeaderScrollDistance = 0;
        this.newFaceBGContainerViewProxy = new b();
        this.multiTabBGContainerViewProxy = new a();
    }

    public void setPageProvider(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb0f07e", new Object[]{this, lbqVar});
        } else {
            this.pageProvider = lbqVar;
        }
    }

    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            scrollToPositionWithOffset(i, 0);
        }
    }

    public int getLastHeaderScrollDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("67292df5", new Object[]{this})).intValue() : this.lastHeaderScrollDistance;
    }

    public void updateHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bebf82", new Object[]{this});
        } else {
            updateHeaderView(this.currentHeaderAlpha, false);
        }
    }

    public void setBGContainerVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc50410", new Object[]{this, new Integer(i)});
        } else if (getVisibility() != i) {
            setVisibility(i);
        } else {
            e.e(TAG, "当前的visibility没有变化，是" + i);
        }
    }

    public int getCurrentBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        View view = this.globalThemeViewNew;
        if (view != null) {
            return view.hashCode();
        }
        return -1;
    }

    public void setBgView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae059bdf", new Object[]{this, view});
            return;
        }
        processBgView(view);
        if (view != null) {
            z = true;
        }
        com.taobao.tao.topmultitab.c.a().a("homepage", (ThemeData) null, !z);
        this.globalThemeViewNew = view;
        updateHeaderView();
    }

    public void updateBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3161acd8", new Object[]{this, view});
            return;
        }
        processBgView(view);
        this.globalThemeViewNew = view;
        updateHeaderView();
    }

    public void updatePullStatus(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def424", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        this.lastHeaderScrollDistance = i;
        this.newFaceBGContainerViewProxy.a(i, f);
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        this.isIdle = true;
        updateAnimationStatus(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006e -> B:27:0x006f). Please submit an issue!!! */
    private GradientDrawable getGradientDrawable() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("d95b109f", new Object[]{this});
        }
        try {
            i = com.taobao.android.tbtheme.c.a(getContext());
        } catch (Throwable unused) {
            i = -1;
        }
        if (i != 0 && !TextUtils.isEmpty(this.bgConfig.darkBeginColor) && !TextUtils.isEmpty(this.bgConfig.darkEndColor)) {
            int parseColor = Color.parseColor(this.bgConfig.darkBeginColor);
            i2 = Color.parseColor(this.bgConfig.darkEndColor);
            i = parseColor;
        } else {
            i = TextUtils.isEmpty(this.bgConfig.beginColor) ? -1 : Color.parseColor(this.bgConfig.beginColor);
            if (TextUtils.isEmpty(this.bgConfig.endColor)) {
                i2 = -1;
                i = i;
            } else {
                i2 = Color.parseColor(this.bgConfig.endColor);
                i = i;
            }
        }
        if (i != -1 && i2 != -1) {
            return new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i2});
        }
        return null;
    }

    private void scrollToPositionWithOffset(int i, int i2) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        e.b(TAG, "scrollToPositionWithOffset() called with: pos = [" + i + "], offset = [" + i2 + riy.ARRAY_END_STR);
        if (this.bgView == null || (iArr = this.viewHeights) == null || iArr.length == 0) {
            return;
        }
        if (i >= iArr.length) {
            i = iArr.length - 1;
        }
        int i3 = i2;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += this.viewHeights[i4];
        }
        int[] iArr2 = this.viewHeights;
        int i5 = this.targetPos;
        if (iArr2[i5] == 0 && i > i5 && i3 < this.bgView.getHeight()) {
            i3 = this.bgView.getHeight();
        }
        scrollTo(0, -i3);
        if (i != 0) {
            return;
        }
        updateHeaderView(0.0f, false);
    }

    private void updateBgHeight(int i) {
        int[] iArr;
        int i2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868b82c7", new Object[]{this, new Integer(i)});
        } else if (this.bgView == null || (iArr = this.viewHeights) == null || iArr.length == 0) {
        } else {
            int topOffset = getTopOffset();
            ksp.c(TAG, "updateBgHeight current topOffset=" + topOffset + ", getTranslationY=" + this.bgView.getTranslationY() + ", endOffset = " + this.endOffset);
            int i4 = this.lastHeaderScrollDistance;
            if (i4 != 0) {
                topOffset -= i4;
            }
            if (this.viewHeights[this.targetPos] == 0) {
                z = false;
            }
            ksp.c(TAG, "updateBgHeight hasTargetShown = " + z);
            if (z) {
                topOffset -= this.endOffset;
            }
            while (true) {
                i2 = this.targetPos;
                if (i3 > i2) {
                    break;
                }
                topOffset += this.viewHeights[i3];
                i3++;
            }
            if (i >= 0 && i < i2 && this.viewHeights[i2] == 0 && topOffset <= this.bgView.getHeight()) {
                ksp.c(TAG, "updateBgHeight  目标卡片未渲染");
            } else if (topOffset == this.bgView.getHeight()) {
            } else {
                this.bgHeightOffset += topOffset - this.bgView.getHeight();
                ksp.c(TAG, "set bgHeight=" + topOffset + "；bgHeightOffset = " + this.bgHeightOffset);
                this.bgView.getLayoutParams().height = topOffset;
                HImageView hImageView = this.bottomMaskView;
                if (hImageView != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hImageView.getLayoutParams();
                    layoutParams.topMargin = (ap2px(getContext(), this.bgConfig.bgEndOffset - this.bgConfig.bottomMaskOffset) + topOffset) - layoutParams.height;
                }
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        innerScrollTo(i, i2);
        updateHeaderView();
    }

    private void innerScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30f5f45", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        e.a(TAG, "scroll To, setTranslationY=" + i2);
        View view = this.bgView;
        if (view != null) {
            view.setTranslationY(i2);
        }
        FrameLayout frameLayout = this.animationContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i2);
            if (this.animationContainer.getTranslationY() < (-(this.screenAniHeight - getTopOffset()))) {
                i3 = 3;
            }
            updateAnimationStatus(i3);
        }
        HImageView hImageView = this.maskView;
        if (hImageView != null) {
            hImageView.setTranslationY(i2);
        }
        HImageView hImageView2 = this.topMaskView;
        if (hImageView2 != null) {
            hImageView2.setTranslationY(i2);
        }
        HImageView hImageView3 = this.bottomMaskView;
        if (hImageView3 == null) {
            return;
        }
        hImageView3.setTranslationY(i2);
    }

    private void updateHeaderView(float f, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a2a16", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        boolean isNeedClearSearchBar = isNeedClearSearchBar();
        if (isNeedClearSearchBar && f <= 0.0f) {
            z = false;
        }
        if (!z && !isNeedClearSearchBar) {
            return;
        }
        this.currentHeaderAlpha = f;
        View view = this.bgView;
        if ((view == null || view.getTranslationY() != 0.0f) && !isReachTop()) {
            z2 = false;
        }
        if (!z && isNeedClearSearchBar && f == 0.0f && z2) {
            setSearchViewBGAlpha(0.0f);
            setRefreshHeaderAlpha(0.0f);
            return;
        }
        if (z && isNeedClearSearchBar) {
            setSearchViewBGAlpha(0.0f);
        } else {
            setSearchViewBGAlpha(1.0f - f);
        }
        setRefreshHeaderAlpha(f);
    }

    private boolean isNeedClearSearchBar() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2d24c09", new Object[]{this})).booleanValue();
        }
        BGConfig bGConfig = this.bgConfig;
        if (bGConfig != null) {
            z = bGConfig.clearSearchBar;
            e.b(TAG, "needClear in bgConfig = " + z);
        } else {
            z = false;
        }
        ohv e = this.pageProvider.getHomePageManager().e();
        boolean z2 = z || (e != null && e.e());
        e.b(TAG, "needClear in searchBar = " + z2);
        return z2;
    }

    private void setSearchViewBGAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366fd78f", new Object[]{this, new Float(f)});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        ohv e = this.pageProvider.getHomePageManager().e();
        if (e == null) {
            return;
        }
        e.a(f, true);
    }

    private void setRefreshHeaderAlpha(float f) {
        mjx i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3eae21", new Object[]{this, new Float(f)});
            return;
        }
        lbq lbqVar = this.pageProvider;
        if (lbqVar == null || (i = lbqVar.getHomePageManager().i()) == null) {
            return;
        }
        i.a(f);
        e.a(TAG, "setRefreshHeaderAlpha, setAhpha=" + f);
    }

    private int getSearchViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c668dee4", new Object[]{this})).intValue();
        }
        ohv e = this.pageProvider.getHomePageManager().e();
        if (e == null) {
            e.e(TAG, "getSearchViewHeight, homeSearchBarManager == null");
            return 0;
        }
        return e.i();
    }

    private void updateBannerView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1609d3", new Object[]{this, new Boolean(z)});
            return;
        }
        ClipLayout clipLayout = this.bannerView;
        if (clipLayout == null) {
            return;
        }
        clipLayout.setClipRadius(z);
    }

    public void updateBgConfig(JSONObject jSONObject, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b166886a", new Object[]{this, jSONObject, list});
        } else if (com.taobao.homepage.view.widgets.bgcontainer.a.a()) {
        } else {
            String string = jSONObject == null ? null : jSONObject.getString("bgConfig");
            if (TextUtils.isEmpty(string) || list == null || list.isEmpty()) {
                resetBG();
                return;
            }
            boolean a2 = ktp.a(com.taobao.tao.infoflow.multitab.e.KEY_BG_IMG, "animation");
            BGConfig bGConfig = this.bgConfig;
            if (bGConfig != null && a2) {
                endAnimation(bGConfig.animationType);
            }
            BGConfig bGConfig2 = this.bgConfig;
            int i = this.targetPos;
            ksp.a(TAG, "bgView_update_data=" + string);
            try {
                this.bgConfig = (BGConfig) JSON.parseObject(string, BGConfig.class);
            } catch (Throwable unused) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("msg", (Object) "wrong_bg_config");
                jSONObject2.put("data", (Object) string);
                kss.a(kss.f30292a, 19999, TRACE_ARG1_BGCONFIG, jSONObject2);
            }
            BGConfig bGConfig3 = this.bgConfig;
            if (bGConfig3 == null) {
                resetBG();
                return;
            }
            this.targetPos = kst.a(bGConfig3.bgEndSection, list);
            if (this.targetPos < 0) {
                ksp.a(TAG, "newface版本。氛围背景找不到定位锚点，使用兜底锚点 pos = " + this.targetPos);
                if (this.targetPos < 0) {
                    ksp.a(TAG, "newface版本。氛围背景找不到兜底锚点，不绘制");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("msg", (Object) "no_default_end_section");
                    jSONObject3.put("data", (Object) this.bgConfig.bgEndSection);
                    kss.a(kss.f30292a, 19999, TRACE_ARG1_BGCONFIG, jSONObject3);
                    resetBG();
                    return;
                }
            }
            this.multiTabBGContainerViewProxy.a();
            if (this.bgConfig.equals(bGConfig2) && i == this.targetPos) {
                ksp.a(TAG, "背景层数据未发生变化，不需要更新");
                return;
            }
            GradientDrawable gradientDrawable = getGradientDrawable();
            if (gradientDrawable == null) {
                ksr.b("invalidBackgroundConfig", "1.0", "invalidBackgroundConfig", "invalidBackgroundConfig", "", "");
                resetBG();
                return;
            }
            this.endOffset = ap2px(getContext(), this.bgConfig.bgEndOffset);
            int[] iArr = this.viewHeights;
            if (iArr == null) {
                this.viewHeights = new int[list.size()];
            } else if (iArr.length < list.size()) {
                this.viewHeights = Arrays.copyOf(this.viewHeights, list.size());
            }
            initBackgroundAndBottomView(gradientDrawable);
            ksp.a(TAG, "bgView_render_view");
            updateHeaderView();
            updateBannerView(this.bgConfig.cutBanner);
            updateBgHeight(0);
            initAnimationView(bGConfig2, a2);
            updateMaskView();
        }
    }

    private void initBackgroundAndBottomView(Drawable drawable) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dbba14", new Object[]{this, drawable});
            return;
        }
        View view = this.bgView;
        if (view == null) {
            this.bgView = new View(getContext());
            this.bgView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.screenHeight));
            addView(this.bgView);
            height = this.screenHeight;
            ksp.a(TAG, "bgView_view_create");
        } else {
            height = view.getHeight();
        }
        if (!TextUtils.isEmpty(this.bgConfig.bottomMaskImg)) {
            if (this.bottomMaskView == null) {
                this.bottomMaskView = new HImageView(getContext());
                this.bottomMaskView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                addView(this.bottomMaskView);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.bottomMaskView.getLayoutParams();
            int ap2px = ap2px(getContext(), this.bgConfig.bottomMaskHeight);
            float f = this.bgConfig.bgEndOffset - this.bgConfig.bottomMaskOffset;
            layoutParams.height = ap2px;
            layoutParams.topMargin = (ap2px(getContext(), f) + height) - ap2px;
            this.bottomMaskView.setLayoutParams(layoutParams);
            onq.a(this.bottomMaskView, this.bgConfig.bottomMaskImg, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.bottomMaskView.setImageUrl(this.bgConfig.bottomMaskImg);
        } else {
            HImageView hImageView = this.bottomMaskView;
            if (hImageView != null) {
                hImageView.setImageUrl(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.bgView.setBackground(drawable);
        } else {
            this.bgView.setBackgroundDrawable(drawable);
        }
    }

    private void initAnimationView(final BGConfig bGConfig, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc8ffe9", new Object[]{this, bGConfig, new Boolean(z)});
        } else if (!TextUtils.isEmpty(this.bgConfig.animationImg)) {
            int ap2px = ap2px(getContext(), this.bgConfig.centerY);
            this.screenAniHeight = ap2px(getContext(), this.bgConfig.animationHeight);
            int i = ap2px << 1;
            if (this.animationContainer == null) {
                this.animationContainer = new FrameLayout(getContext());
                addView(this.animationContainer);
            }
            int searchViewHeight = getSearchViewHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.animationContainer.getLayoutParams();
            marginLayoutParams.width = getResources().getDisplayMetrics().widthPixels;
            marginLayoutParams.height = this.screenAniHeight + searchViewHeight;
            marginLayoutParams.topMargin = -searchViewHeight;
            this.animationContainer.setLayoutParams(marginLayoutParams);
            if (this.animationView == null) {
                this.animationView = new HImageView(getContext());
                this.animationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.animationView.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i));
                this.animationView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.homepage.view.widgets.bgcontainer.BGContainerView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        ksp.c(BGContainerView.TAG, "homeBgAnimationImage_success");
                        BGContainerView bGContainerView = BGContainerView.this;
                        BGContainerView.access$100(bGContainerView, bGConfig, BGContainerView.access$000(bGContainerView));
                        long currentTimeMillis = System.currentTimeMillis() - BGContainerView.this.animationImgStart;
                        if (BGContainerView.access$000(BGContainerView.this) != null) {
                            ksr.b("homeBgAnimationImage", "1.0", BGContainerView.access$000(BGContainerView.this).animationImg, String.valueOf(currentTimeMillis));
                        }
                        return false;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.homepage.view.widgets.bgcontainer.BGContainerView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        ksp.c(BGContainerView.TAG, "homeBgAnimationImage_fail");
                        long currentTimeMillis = System.currentTimeMillis() - BGContainerView.this.animationImgStart;
                        if (BGContainerView.access$000(BGContainerView.this) != null) {
                            ksr.c("homeBgAnimationImage", "1.0", BGContainerView.access$000(BGContainerView.this).animationImg, String.valueOf(currentTimeMillis), String.valueOf(failPhenixEvent.getResultCode()), "");
                        }
                        if (BGContainerView.this.maskView != null && BGContainerView.this.animationView.isDrawableSameWith(null)) {
                            BGContainerView.this.maskView.setImageUrl(null);
                        }
                        if (BGContainerView.this.topMaskView != null && BGContainerView.this.animationView.isDrawableSameWith(null)) {
                            BGContainerView.this.topMaskView.setImageUrl(null);
                        }
                        return false;
                    }
                });
                this.animationContainer.addView(this.animationView);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.animationView.getLayoutParams();
            marginLayoutParams2.height = i;
            marginLayoutParams2.topMargin = (this.screenAniHeight - i) + searchViewHeight;
            if (z) {
                marginLayoutParams2.width = getResources().getDisplayMetrics().widthPixels;
                marginLayoutParams2.leftMargin = 0;
            } else {
                marginLayoutParams2.width = i;
                marginLayoutParams2.leftMargin = (getResources().getDisplayMetrics().widthPixels / 2) - ap2px;
            }
            this.animationView.setLayoutParams(marginLayoutParams2);
            String str = z ? this.bgConfig.degradeAnimationImg : this.bgConfig.animationImg;
            if (this.animationView.isDrawableSameWith(null) || !TextUtils.equals(str, this.animationView.getImageUrl())) {
                z2 = false;
            }
            if (bGConfig != null && z2 && TextUtils.equals(this.bgConfig.animationType, bGConfig.animationType) && this.bgConfig.animationTime == bGConfig.animationTime && this.bgConfig.animationCount == bGConfig.animationCount) {
                return;
            }
            if (z2) {
                updateAnimation(bGConfig, this.bgConfig);
                return;
            }
            this.animationImgStart = System.currentTimeMillis();
            onq.a(this.animationView, str, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.animationView.setImageUrl(str);
        } else {
            clearViewAnimation();
            HImageView hImageView = this.animationView;
            if (hImageView != null) {
                hImageView.setImageUrl(null);
            }
            HImageView hImageView2 = this.animationView2;
            if (hImageView2 != null) {
                hImageView2.setImageUrl(null);
            }
            HImageView hImageView3 = this.maskView;
            if (hImageView3 != null) {
                hImageView3.setImageUrl(null);
            }
            HImageView hImageView4 = this.topMaskView;
            if (hImageView4 == null) {
                return;
            }
            hImageView4.setImageUrl(null);
        }
    }

    private void updateMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780a4b21", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.bgConfig.maskImg)) {
            if (this.maskView == null) {
                this.maskView = new HImageView(getContext());
                addView(this.maskView);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.maskView.getLayoutParams();
            int ap2px = ap2px(getContext(), this.bgConfig.maskHeight);
            int ap2px2 = ap2px(getContext(), this.bgConfig.maskTop);
            marginLayoutParams.height = ap2px;
            marginLayoutParams.topMargin = ap2px2;
            this.maskView.setLayoutParams(marginLayoutParams);
            this.maskView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            onq.a(this.maskView, this.bgConfig.maskImg, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.maskView.setImageUrl(this.bgConfig.maskImg);
            ksp.a(TAG, "homeBgMaskImage_update");
        } else {
            HImageView hImageView = this.maskView;
            if (hImageView != null) {
                hImageView.setImageUrl(null);
                ksp.a(TAG, "homeBgMaskImage_clear");
            }
        }
        if (!TextUtils.isEmpty(this.bgConfig.topMaskImg)) {
            if (this.topMaskView == null) {
                this.topMaskView = new HImageView(getContext());
                addView(this.topMaskView);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.topMaskView.getLayoutParams();
            marginLayoutParams2.height = ap2px(getContext(), this.bgConfig.topMaskHotSearch) + getSearchViewHeight();
            if (getSearchViewHeight() == 0) {
                this.topMaskView.setVisibility(8);
            } else {
                this.topMaskView.setVisibility(0);
            }
            this.topMaskView.setScaleType(ImageView.ScaleType.FIT_XY);
            this.topMaskView.setLayoutParams(marginLayoutParams2);
            onq.a(this.topMaskView, this.bgConfig.topMaskImg, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            this.topMaskView.setImageUrl(this.bgConfig.topMaskImg);
            ksp.a(TAG, "homeNaviBgMaskImage_update");
            return;
        }
        HImageView hImageView2 = this.topMaskView;
        if (hImageView2 == null) {
            return;
        }
        hImageView2.setImageUrl(null);
        ksp.a(TAG, "homeNaviBgMaskImage_clear");
    }

    private void resetBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b256885b", new Object[]{this});
            return;
        }
        ksp.c(TAG, "bgView_reset config");
        setRefreshHeaderAlpha(0.0f);
        updateHeaderView();
        updateBannerView(false);
        clear();
    }

    private void updateAnimation(BGConfig bGConfig, BGConfig bGConfig2) {
        IpChange ipChange = $ipChange;
        int i = 1;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a133e2", new Object[]{this, bGConfig, bGConfig2});
        } else if (this.animationView != null) {
            if (TextUtils.equals(bGConfig2.animationType, "scale")) {
                if (this.animationView2 == null) {
                    this.animationView2 = new HImageView(getContext());
                    this.animationView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.animationView2.setLayoutParams(this.animationView.getLayoutParams());
                    this.animationContainer.addView(this.animationView2, 0);
                }
                onq.a(this.animationView2, this.bgConfig.animationImg, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
                this.animationView2.setImageUrl(this.bgConfig.animationImg);
                AnimationSet animationSet = this.scaleAnimation;
                if (animationSet == null) {
                    this.scaleAnimation = new AnimationSet(false);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 3.0f, 1.2f, 3.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setInterpolator(new LinearInterpolator());
                    scaleAnimation.setDuration(bGConfig2.animationTime);
                    scaleAnimation.setRepeatCount(bGConfig2.animationCount);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setInterpolator(new AccelerateInterpolator(0.35f));
                    alphaAnimation.setStartOffset((bGConfig2.animationTime * 3) / 4);
                    alphaAnimation.setDuration(bGConfig2.animationTime / 4);
                    alphaAnimation.setRepeatCount(bGConfig2.animationCount);
                    this.scaleAnimation.addAnimation(scaleAnimation);
                    this.scaleAnimation.addAnimation(alphaAnimation);
                } else {
                    List<Animation> animations = animationSet.getAnimations();
                    if (animations != null) {
                        for (Animation animation : animations) {
                            if (animation instanceof ScaleAnimation) {
                                animation.setDuration(bGConfig2.animationTime);
                                animation.setRepeatCount(bGConfig2.animationCount);
                            } else if (animation instanceof AlphaAnimation) {
                                animation.setStartOffset((bGConfig2.animationTime * 3) / 4);
                                animation.setDuration(bGConfig2.animationTime / 4);
                                animation.setRepeatCount(bGConfig2.animationCount);
                            }
                        }
                    }
                }
                Animation animation2 = this.scaleAnimation2;
                if (animation2 == null) {
                    this.scaleAnimation2 = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.scaleAnimation2.setInterpolator(new AccelerateInterpolator());
                    this.scaleAnimation2.setStartOffset((bGConfig2.animationTime * 3) / 4);
                    this.scaleAnimation2.setRepeatCount(bGConfig2.animationCount);
                    this.scaleAnimation2.setDuration(bGConfig2.animationTime / 4);
                } else {
                    animation2.setStartOffset((bGConfig2.animationTime * 3) / 4);
                    this.scaleAnimation2.setRepeatCount(bGConfig2.animationCount);
                    this.scaleAnimation2.setDuration(bGConfig2.animationTime / 4);
                }
            } else if (TextUtils.equals(bGConfig2.animationType, "rotate")) {
                ValueAnimator valueAnimator = this.rotateAnimator;
                if (valueAnimator == null) {
                    this.rotateAnimator = ObjectAnimator.ofFloat(this.animationView, "rotation", 0.0f, 360.0f);
                    this.rotateAnimator.setInterpolator(new LinearInterpolator());
                    this.rotateAnimator.setRepeatCount(bGConfig2.animationCount);
                    this.rotateAnimator.setDuration(bGConfig2.animationTime);
                } else {
                    valueAnimator.setRepeatCount(bGConfig2.animationCount);
                    this.rotateAnimator.setDuration(bGConfig2.animationTime);
                    this.rotateAnimator.setTarget(this.animationView);
                }
            } else {
                ksp.c(TAG, "unknownBackgroundAnimationType");
                ksr.b("unknownBackgroundAnimationType", "1.0", "unknownBackgroundAnimationType", "unknownBackgroundAnimationType", "", "");
            }
            if (bGConfig != null && TextUtils.equals(bGConfig2.animationType, bGConfig.animationType)) {
                z = true;
            }
            if (z) {
                i = 5;
            }
            updateAnimationStatus(i);
        }
    }

    private void updateAnimationStatus(int i) {
        BGConfig bGConfig;
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786f6ef", new Object[]{this, new Integer(i)});
        } else if (!this.isIdle || (bGConfig = this.bgConfig) == null || TextUtils.isEmpty(bGConfig.animationType)) {
        } else {
            String str = this.bgConfig.animationType;
            if (ktp.a(com.taobao.tao.infoflow.multitab.e.KEY_BG_IMG, "animation")) {
                ksp.a(TAG, "bgView_ani_degrade");
                endAnimation(str);
                return;
            }
            ksp.a(TAG, "bgView_ani_status:" + i);
            if (i == 1) {
                endAnimation(str);
                if (TextUtils.equals("scale", str)) {
                    AnimationSet animationSet = this.scaleAnimation;
                    if (animationSet != null && (!animationSet.hasStarted() || this.scaleAnimation.hasEnded())) {
                        e.a(TAG, "start scaleAnimation start animation");
                        this.animationView.startAnimation(this.scaleAnimation);
                    }
                    Animation animation = this.scaleAnimation2;
                    if (animation == null) {
                        return;
                    }
                    if (animation.hasStarted() && !this.scaleAnimation2.hasEnded()) {
                        return;
                    }
                    e.a(TAG, "start scaleAnimation2 start animation");
                    this.animationView2.startAnimation(this.scaleAnimation2);
                } else if (!TextUtils.equals("rotate", str) || (valueAnimator = this.rotateAnimator) == null || valueAnimator.isRunning()) {
                } else {
                    e.a(TAG, "start rotateAnimator start animation");
                    this.rotateAnimator.start();
                }
            } else if (i == 2) {
                if (TextUtils.equals("scale", str)) {
                    AnimationSet animationSet2 = this.scaleAnimation;
                    if (animationSet2 != null && animationSet2.hasEnded()) {
                        e.a(TAG, "resume scaleAnimation start animation");
                        this.scaleAnimation.start();
                    }
                    Animation animation2 = this.scaleAnimation2;
                    if (animation2 == null || !animation2.hasEnded()) {
                        return;
                    }
                    e.a(TAG, "resume scaleAnimation2 start animation");
                    this.scaleAnimation2.start();
                } else if (!TextUtils.equals("rotate", str)) {
                } else {
                    if (Build.VERSION.SDK_INT >= 19) {
                        ValueAnimator valueAnimator2 = this.rotateAnimator;
                        if (valueAnimator2 == null || !valueAnimator2.isPaused()) {
                            return;
                        }
                        e.a(TAG, "resume rotateAnimator resume animation");
                        this.rotateAnimator.resume();
                    } else if (this.rotateAnimator == null) {
                    } else {
                        e.a(TAG, "resume rotateAnimator resume animation");
                        this.rotateAnimator.start();
                    }
                }
            } else if (i != 3) {
                if (i == 4) {
                    endAnimation(str);
                } else if (i != 5) {
                } else {
                    if (TextUtils.equals("scale", str)) {
                        if (this.scaleAnimation != null) {
                            e.a(TAG, "restart scaleAnimation start animation");
                            this.animationView.startAnimation(this.scaleAnimation);
                        }
                        if (this.scaleAnimation2 == null) {
                            return;
                        }
                        e.a(TAG, "restart scaleAnimation2 start animation");
                        this.animationView2.startAnimation(this.scaleAnimation2);
                    } else if (!TextUtils.equals("rotate", str) || this.rotateAnimator == null) {
                    } else {
                        e.a(TAG, "start rotateAnimator start animation");
                        this.rotateAnimator.end();
                        this.rotateAnimator.start();
                    }
                }
            } else if (TextUtils.equals("scale", str)) {
                AnimationSet animationSet3 = this.scaleAnimation;
                if (animationSet3 != null && !animationSet3.hasEnded()) {
                    e.a(TAG, "pause scaleAnimation cancel animation");
                    this.scaleAnimation.cancel();
                }
                Animation animation3 = this.scaleAnimation2;
                if (animation3 == null || animation3.hasEnded()) {
                    return;
                }
                e.a(TAG, "pause scaleAnimation2 cancel animation");
                this.scaleAnimation2.cancel();
            } else if (!TextUtils.equals("rotate", str)) {
            } else {
                if (Build.VERSION.SDK_INT >= 19) {
                    ValueAnimator valueAnimator3 = this.rotateAnimator;
                    if (valueAnimator3 == null || valueAnimator3.isPaused()) {
                        return;
                    }
                    e.a(TAG, "pause rotateAnimator pause animation");
                    this.rotateAnimator.pause();
                } else if (this.rotateAnimator == null) {
                } else {
                    e.a(TAG, "pause rotateAnimator pause animation");
                    this.rotateAnimator.cancel();
                }
            }
        }
    }

    private void endAnimation(String str) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fe2eba", new Object[]{this, str});
            return;
        }
        clearViewAnimation();
        if (TextUtils.equals("rotate", str)) {
            AnimationSet animationSet = this.scaleAnimation;
            if (animationSet != null && !animationSet.hasEnded()) {
                e.a(TAG, "finish scaleAnimation cancel animation");
                this.scaleAnimation.cancel();
            }
            Animation animation = this.scaleAnimation2;
            if (animation != null && !animation.hasEnded()) {
                e.a(TAG, "finish scaleAnimation2 cancel animation");
                this.scaleAnimation2.cancel();
            }
            HImageView hImageView = this.animationView2;
            if (hImageView == null) {
                return;
            }
            this.animationContainer.removeView(hImageView);
            this.animationView2 = null;
        } else if (!TextUtils.equals("scale", str) || (valueAnimator = this.rotateAnimator) == null || !valueAnimator.isRunning()) {
        } else {
            e.a(TAG, "finish rotateAnimator cancel animation");
            this.rotateAnimator.end();
        }
    }

    private void clearViewAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cab499", new Object[]{this});
            return;
        }
        HImageView hImageView = this.animationView;
        if (hImageView != null) {
            hImageView.clearAnimation();
        }
        HImageView hImageView2 = this.animationView2;
        if (hImageView2 == null) {
            return;
        }
        hImageView2.clearAnimation();
    }

    private void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        clearViewAnimation();
        removeAllViews();
        this.viewHeights = null;
        this.bgView = null;
        this.animationContainer = null;
        this.animationView = null;
        this.animationView2 = null;
        this.maskView = null;
        this.topMaskView = null;
        this.bottomMaskView = null;
        this.bgConfig = null;
        a aVar = this.multiTabBGContainerViewProxy;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    private boolean isReachTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue() : this.multiTabBGContainerViewProxy.c();
    }

    private void processBgView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d230f2", new Object[]{this, view});
            return;
        }
        removeMyself(this.globalThemeViewNew);
        if (view == null) {
            return;
        }
        removeMyself(view);
        addView(view);
    }

    private void removeMyself(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a738cf", new Object[]{this, view});
        } else if (view == null || view.getParent() == null) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private int ap2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5beac9d", new Object[]{this, context, new Float(f)})).intValue() : HomePageUtility.a(f.a().b(), context, f);
    }

    /* loaded from: classes7.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(304647160);
        }

        public b() {
        }

        public void a(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            BGContainerView.access$200(BGContainerView.this, 0, i);
            BGContainerView.access$300(BGContainerView.this, f, true);
        }
    }

    /* loaded from: classes7.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f17345a = true;
        private View.OnLayoutChangeListener c = new View.OnLayoutChangeListener() { // from class: com.taobao.homepage.view.widgets.bgcontainer.BGContainerView.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else if (i2 == i6) {
                } else {
                    ksp.a("home.multiTabBG", "onTabLayoutChangeListener。 new top = " + i2 + "; oldTop = " + i6);
                    BGContainerView.access$400(BGContainerView.this, 0);
                }
            }
        };

        static {
            kge.a(-88237093);
        }

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ksp.a("home.multiTabBG", "背景层注册多TAB 列表父容器layout change监听");
            ViewGroup e = com.taobao.tao.topmultitab.c.a().e();
            if (e == null) {
                return;
            }
            e.addOnLayoutChangeListener(this.c);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            ksp.a("home.multiTabBG", "背景层注销多TAB 列表父容器layout change监听");
            ViewGroup e = com.taobao.tao.topmultitab.c.a().e();
            if (e == null) {
                return;
            }
            e.removeOnLayoutChangeListener(this.c);
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : com.taobao.tao.topmultitab.c.a().t();
        }
    }
}
