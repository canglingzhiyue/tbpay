package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatDelegate;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.ddv;
import tb.ddw;
import tb.irn;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.sen;
import tb.xkw;

/* loaded from: classes8.dex */
public class TaoLiveWebBottomFragment extends BottomSheetDialogFragment implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long INVALID_RESUME_TIMESTAMP = -1;
    private static final String RESTORE_URL = "RESTORED_URL";
    private static final String TAG = "TLWebBottomFragment";
    private Intent activityIntent;
    private BottomSheetBehavior<FrameLayout> behavior;
    private float cornerRadius;
    private float expandHeightPercent;
    private float height;
    private boolean hideLiveCloseBtn;
    private boolean hideScrollGuide;
    private com.taobao.taolivecontainer.b mContainerBuilder;
    private boolean mFragmentResumed;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private boolean mShowLoading;
    private WeakReference<c> mWeakContainer;
    private TBLiveH5Container mWebView;
    private float panOffsetToClose;
    private boolean pannable;
    private long resumeTimestamp;
    private RoundedFrameLayout roundedFrameLayout;
    private boolean supportScrollPage;
    private int transparentTopMargin;
    private boolean usePlaceholderLoading;
    private boolean useScrollUp;
    private irn weexBuilder;
    private Integer contentBackColor = null;
    private String closeFromSource = "mask";
    private Integer backgroundColor = 0;

    static {
        kge.a(-214027141);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveWebBottomFragment taoLiveWebBottomFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveWebBottomFragment";
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ BottomSheetBehavior access$000(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomSheetBehavior) ipChange.ipc$dispatch("22326330", new Object[]{taoLiveWebBottomFragment}) : taoLiveWebBottomFragment.behavior;
    }

    public static /* synthetic */ com.taobao.taolivecontainer.b access$1002(TaoLiveWebBottomFragment taoLiveWebBottomFragment, com.taobao.taolivecontainer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolivecontainer.b) ipChange.ipc$dispatch("d91fa844", new Object[]{taoLiveWebBottomFragment, bVar});
        }
        taoLiveWebBottomFragment.mContainerBuilder = bVar;
        return bVar;
    }

    public static /* synthetic */ boolean access$102(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e53170a", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.useScrollUp = z;
        return z;
    }

    public static /* synthetic */ float access$1102(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c63bc13", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.height = f;
        return f;
    }

    public static /* synthetic */ Integer access$1202(TaoLiveWebBottomFragment taoLiveWebBottomFragment, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3f1a72a0", new Object[]{taoLiveWebBottomFragment, num});
        }
        taoLiveWebBottomFragment.contentBackColor = num;
        return num;
    }

    public static /* synthetic */ Integer access$1302(TaoLiveWebBottomFragment taoLiveWebBottomFragment, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4d269c7f", new Object[]{taoLiveWebBottomFragment, num});
        }
        taoLiveWebBottomFragment.backgroundColor = num;
        return num;
    }

    public static /* synthetic */ boolean access$1402(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a98f58", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.pannable = z;
        return z;
    }

    public static /* synthetic */ float access$1502(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64c0718f", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.cornerRadius = f;
        return f;
    }

    public static /* synthetic */ boolean access$1602(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6d7ea16", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.mShowLoading = z;
        return z;
    }

    public static /* synthetic */ irn access$1702(TaoLiveWebBottomFragment taoLiveWebBottomFragment, irn irnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irn) ipChange.ipc$dispatch("95b76e53", new Object[]{taoLiveWebBottomFragment, irnVar});
        }
        taoLiveWebBottomFragment.weexBuilder = irnVar;
        return irnVar;
    }

    public static /* synthetic */ float access$1802(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b05f9ac", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.expandHeightPercent = f;
        return f;
    }

    public static /* synthetic */ int access$1902(TaoLiveWebBottomFragment taoLiveWebBottomFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d1d3251", new Object[]{taoLiveWebBottomFragment, new Integer(i)})).intValue();
        }
        taoLiveWebBottomFragment.transparentTopMargin = i;
        return i;
    }

    public static /* synthetic */ boolean access$200(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2daa51", new Object[]{taoLiveWebBottomFragment})).booleanValue() : taoLiveWebBottomFragment.hideScrollGuide;
    }

    public static /* synthetic */ boolean access$2000(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93d047dd", new Object[]{taoLiveWebBottomFragment})).booleanValue() : taoLiveWebBottomFragment.usePlaceholderLoading;
    }

    public static /* synthetic */ boolean access$2002(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b1b585d", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.usePlaceholderLoading = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d06a4469", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.hideScrollGuide = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dddbd512", new Object[]{taoLiveWebBottomFragment})).booleanValue() : taoLiveWebBottomFragment.supportScrollPage;
    }

    public static /* synthetic */ boolean access$302(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("128171c8", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.supportScrollPage = z;
        return z;
    }

    public static /* synthetic */ boolean access$400(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1189ffd3", new Object[]{taoLiveWebBottomFragment})).booleanValue() : taoLiveWebBottomFragment.hideLiveCloseBtn;
    }

    public static /* synthetic */ boolean access$402(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54989f27", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.hideLiveCloseBtn = z;
        return z;
    }

    public static /* synthetic */ float access$500(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45382a80", new Object[]{taoLiveWebBottomFragment})).floatValue() : taoLiveWebBottomFragment.panOffsetToClose;
    }

    public static /* synthetic */ float access$502(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96af815e", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.panOffsetToClose = f;
        return f;
    }

    public static /* synthetic */ TBLiveH5Container access$600(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveH5Container) ipChange.ipc$dispatch("faea9af1", new Object[]{taoLiveWebBottomFragment}) : taoLiveWebBottomFragment.mWebView;
    }

    public static /* synthetic */ TaoLiveWebBottomFragment access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("85c4386c", new Object[0]) : newInstance();
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a access$802(TaoLiveWebBottomFragment taoLiveWebBottomFragment, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("2cf5e4c5", new Object[]{taoLiveWebBottomFragment, aVar});
        }
        taoLiveWebBottomFragment.mFrameContext = aVar;
        return aVar;
    }

    public static /* synthetic */ WeakReference access$902(TaoLiveWebBottomFragment taoLiveWebBottomFragment, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("eaa4bf96", new Object[]{taoLiveWebBottomFragment, weakReference});
        }
        taoLiveWebBottomFragment.mWeakContainer = weakReference;
        return weakReference;
    }

    private static TaoLiveWebBottomFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("77815d8e", new Object[0]) : new TaoLiveWebBottomFragment();
    }

    public static String tag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2499139f", new Object[0]) : TaoLiveWebBottomFragment.class.getSimpleName();
    }

    @Override // android.support.design.widget.BottomSheetDialogFragment, android.support.v7.app.AppCompatDialogFragment, android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog  reason: collision with other method in class */
    public android.support.design.widget.b mo1438onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.support.design.widget.b) ipChange.ipc$dispatch("4471e333", new Object[]{this, bundle});
        }
        final com.taobao.tbliveinteractive.container.h5.a aVar = new com.taobao.tbliveinteractive.container.h5.a(getContext(), R.style.TaoLiveBottomWebDialogTheme, this);
        final AppCompatDelegate delegate = aVar.getDelegate();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.alilive_bottom_web_layout, (ViewGroup) delegate.a(R.id.design_bottom_sheet), false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        final int i = getResources().getDisplayMetrics().heightPixels;
        int calculateMaxHeight = calculateMaxHeight(i);
        final int calculatePeekHeight = calculatePeekHeight(i);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, calculateMaxHeight);
        } else {
            layoutParams.height = calculateMaxHeight;
            layoutParams.width = -1;
        }
        inflate.setLayoutParams(layoutParams);
        aVar.setContentView(inflate);
        if (this.weexBuilder != null) {
            addWeexView(delegate);
        } else if (!addWebView(delegate)) {
            m.e(TAG, "WebView has been destroyed");
            dismissAllowingStateLoss();
        }
        setCornerRadiusAndBackgroundColor(aVar);
        if (this.backgroundColor != null && aVar.getWindow() != null) {
            aVar.getWindow().setBackgroundDrawable(new ColorDrawable(this.backgroundColor.intValue()));
        }
        this.behavior = BottomSheetBehavior.b((FrameLayout) inflate.getParent());
        this.behavior.a(calculatePeekHeight);
        TUrlImageView tUrlImageView = (TUrlImageView) delegate.a(R.id.loading);
        if (tUrlImageView != null) {
            if (this.mShowLoading) {
                if (this.usePlaceholderLoading) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tUrlImageView.getLayoutParams();
                    layoutParams2.topMargin = android.taobao.windvane.util.c.a(this.transparentTopMargin);
                    tUrlImageView.setLayoutParams(layoutParams2);
                    tUrlImageView.setBackground(getContext().getDrawable(R.drawable.taolive_h5_container_bg));
                } else {
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01kEjb141PARmuBm9Cd_!!6000000001800-2-tps-750-1244.png");
                }
            } else if (tUrlImageView.getParent() instanceof ViewGroup) {
                ((ViewGroup) tUrlImageView.getParent()).removeView(tUrlImageView);
            }
        }
        if (this.pannable) {
            View a2 = delegate.a(R.id.web);
            if (a2 != null) {
                a2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment.1
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                        TaoLiveWebBottomFragment.access$000(TaoLiveWebBottomFragment.this).a(i3 <= 0);
                    }
                });
            }
            this.behavior.a(new BottomSheetBehavior.a() { // from class: com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int f = -1;
                private boolean g = false;
                private float h = 0.0f;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    str.hashCode();
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                private void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    ImageView imageView = (ImageView) aVar.findViewById(R.id.icon_guide);
                    TextView textView = (TextView) aVar.findViewById(R.id.tv_guide);
                    if (z) {
                        TaoLiveWebBottomFragment.access$102(TaoLiveWebBottomFragment.this, true);
                    }
                    if (TaoLiveWebBottomFragment.access$200(TaoLiveWebBottomFragment.this)) {
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                    } else if (z) {
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.alilive_scroll_guide_down);
                        }
                    } else {
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.alilive_scroll_guide_up);
                        }
                    }
                    if (!z) {
                        return;
                    }
                    LinearLayout linearLayout = (LinearLayout) delegate.a(R.id.ll_scrooll_guide);
                    FrameLayout frameLayout = (FrameLayout) delegate.a(R.id.design_bottom_sheet);
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) delegate.a(R.id.coordinator);
                    if (linearLayout == null || frameLayout == null || !(linearLayout.getLayoutParams() instanceof CoordinatorLayout.b) || ((CoordinatorLayout.b) linearLayout.getLayoutParams()).b() == null) {
                        return;
                    }
                    ((CoordinatorLayout.b) linearLayout.getLayoutParams()).b().onDependentViewChanged(coordinatorLayout, linearLayout, frameLayout);
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public void a(View view, int i2) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i2)});
                        return;
                    }
                    if (TaoLiveWebBottomFragment.access$300(TaoLiveWebBottomFragment.this)) {
                        if (i2 != 3) {
                            z = false;
                        }
                        a(z);
                    }
                    if (i2 == 4 && TaoLiveWebBottomFragment.access$400(TaoLiveWebBottomFragment.this)) {
                        if (phg.d().a()) {
                            ddw.a().a(xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, "close");
                        } else {
                            ddw.a().a("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
                        }
                    } else if (i2 == 3 && TaoLiveWebBottomFragment.access$400(TaoLiveWebBottomFragment.this)) {
                        if (phg.d().a()) {
                            ddw.a().a(xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "close");
                        } else {
                            ddw.a().a("com.taobao.taolive.room.recommend.good.card.did.appear", null, null);
                        }
                    }
                    if (i2 != 2) {
                        if (i2 != 5) {
                            return;
                        }
                        aVar.cancel();
                        return;
                    }
                    if (this.f == -1) {
                        this.f = (i - TaoLiveWebBottomFragment.access$000(TaoLiveWebBottomFragment.this).a()) + ((int) (calculatePeekHeight * TaoLiveWebBottomFragment.access$500(TaoLiveWebBottomFragment.this)));
                    }
                    if (view.getTop() < this.f || this.g) {
                        return;
                    }
                    aVar.cancel();
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public void a(View view, float f) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
                        return;
                    }
                    String str = "onSlide: v:" + f;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AbsListWidgetInstance.KEY_SECTION_EXPAND, (Object) Boolean.valueOf(((double) f) >= 1.0d));
                    WVStandardEventCenter.postNotificationToJS(TaoLiveWebBottomFragment.access$600(TaoLiveWebBottomFragment.this), "TBLiveWVPlugin.Event.container.expand", pqj.a(jSONObject));
                    float abs = Math.abs(f);
                    if (abs >= this.h) {
                        z = false;
                    }
                    this.g = z;
                    this.h = abs;
                }
            });
        } else {
            this.behavior.a(false);
        }
        adaptViewForTabletAndFoldScreen(delegate);
        if (this.supportScrollPage) {
            inflateScrollGuide(delegate);
        }
        ddw.a().a(this);
        return aVar;
    }

    public void setContainerNeedScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b929cb", new Object[]{this, new Boolean(z)});
            return;
        }
        RoundedFrameLayout roundedFrameLayout = this.roundedFrameLayout;
        if (roundedFrameLayout == null) {
            return;
        }
        roundedFrameLayout.setNeedScroll(z);
    }

    public void setContainerExpand(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1c0d14", new Object[]{this, new Boolean(z)});
            return;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(z ? 3 : 4);
    }

    public String getContainerExpandState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75af832d", new Object[]{this});
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        return bottomSheetBehavior != null ? bottomSheetBehavior.d() == 4 ? "collapsed" : this.behavior.d() == 3 ? AbsListWidgetInstance.KEY_SECTION_EXPAND : "default" : "default";
    }

    private int calculateMaxHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c214ef8a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.pannable) {
            if (this.supportScrollPage) {
                return (int) (i * this.expandHeightPercent);
            }
            return calculatePeekHeight(i);
        }
        return calculatePeekHeight(i);
    }

    private int calculatePeekHeight(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7daaa9e7", new Object[]{this, new Integer(i)})).intValue() : (int) (this.height * i);
    }

    private boolean addWebView(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b202d086", new Object[]{this, appCompatDelegate})).booleanValue();
        }
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container == null) {
            pmd.a().m().a(TAG, "WebView 为空，dismiss");
            return false;
        }
        if (!tBLiveH5Container.isDestroied()) {
            View a2 = appCompatDelegate.a(R.id.content_root);
            if (a2 instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) a2;
                if (tBLiveH5Container.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tBLiveH5Container.getParent()).removeView(tBLiveH5Container);
                }
                frameLayout.addView(tBLiveH5Container, 1);
                tBLiveH5Container.setId(R.id.web);
                return true;
            }
        }
        return false;
    }

    private void addWeexView(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26820811", new Object[]{this, appCompatDelegate});
            return;
        }
        irn irnVar = this.weexBuilder;
        if (irnVar == null) {
            return;
        }
        View a2 = irnVar.a();
        View a3 = appCompatDelegate.a(R.id.content_root);
        if (!(a3 instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) a3).addView(a2, 1);
    }

    private void setCornerRadiusAndBackgroundColor(android.support.design.widget.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56a582b", new Object[]{this, bVar});
            return;
        }
        this.roundedFrameLayout = (RoundedFrameLayout) bVar.findViewById(R.id.content_root);
        RoundedFrameLayout roundedFrameLayout = this.roundedFrameLayout;
        if (roundedFrameLayout == null) {
            return;
        }
        roundedFrameLayout.setSupportScroll(this.supportScrollPage);
        float f = this.cornerRadius;
        if (f != 0.0f) {
            this.roundedFrameLayout.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            this.roundedFrameLayout.setClipChildren(true);
        }
        if (this.contentBackColor == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f2 = this.cornerRadius;
        if (f2 != 0.0f) {
            gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        gradientDrawable.setColor(this.contentBackColor.intValue());
        this.roundedFrameLayout.setBackgroundDrawable(gradientDrawable);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container == null) {
            return;
        }
        tBLiveH5Container.pageDisAppear();
    }

    public void endLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb6ffe8", new Object[]{this});
            return;
        }
        View a2 = ((android.support.design.widget.b) getDialog()).getDelegate().a(R.id.loading);
        if (a2 == null || !(a2.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) a2.getParent()).removeView(a2);
    }

    private void adaptViewForTabletAndFoldScreen(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb8c7c6", new Object[]{this, appCompatDelegate});
        } else if (!y.b(getContext())) {
        } else {
            new sen().a(appCompatDelegate, getContext());
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar == null || aVar.z() == null) {
            return;
        }
        boolean z = this.mFrameContext.z().H;
        if (!p.A() || !z || !this.mFragmentResumed) {
            return;
        }
        if (xkw.EVENT_FULL_SCREEN_APPEAR.equals(str)) {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE, "H5ContainerV2");
            HashMap hashMap = new HashMap();
            hashMap.put("isMoveUp", "true");
            hashMap.put("containerHeight", String.valueOf((int) (this.height * com.taobao.taolive.room.utils.d.f())));
            ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
        }
        this.mFrameContext.z().H = false;
        q.b(TAG, "返回橱窗弹窗，恢复清屏");
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_FULL_SCREEN_APPEAR};
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f22111a;
        private c b;
        private com.taobao.taolivecontainer.b c;
        private irn k;
        private boolean l;
        private com.taobao.alilive.aliliveframework.frame.a m;
        private float d = 0.725f;
        private float e = 27.0f;
        private float f = 0.2f;
        private boolean g = true;
        private boolean j = true;
        private float n = 0.9f;
        private boolean o = false;
        private boolean p = false;
        private int q = 0;
        private boolean r = false;
        private Integer h = null;
        private Integer i = null;

        static {
            kge.a(89284690);
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5d412823", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2992fd62", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48ff5a2d", new Object[]{this, context});
            }
            this.f22111a = context;
            return this;
        }

        public a a(com.taobao.alilive.aliliveframework.frame.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c84cc750", new Object[]{this, aVar});
            }
            this.m = aVar;
            return this;
        }

        public a a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c80eb135", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("87b6159b", new Object[]{this, str});
            }
            this.i = Integer.valueOf(Color.parseColor(str));
            return this;
        }

        public a b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fbbcdbf6", new Object[]{this, new Float(f)});
            }
            this.e = f;
            return this;
        }

        public a d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("63193178", new Object[]{this, new Float(f)});
            }
            this.n = f;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("90ef52e4", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c49d7da5", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4eeecfd2", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f84ba866", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("86dca4fa", new Object[]{this, str});
            }
            this.h = Integer.valueOf(Color.parseColor(str));
            return this;
        }

        public a c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2f6b06b7", new Object[]{this, new Float(f)});
            }
            this.d = f;
            return this;
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("65b4f79d", new Object[]{this, cVar});
            }
            this.b = cVar;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f5e4d2a1", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a a(com.taobao.taolivecontainer.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8620560d", new Object[]{this, bVar});
            }
            this.c = bVar;
            return this;
        }

        public a a(irn irnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("daa6161a", new Object[]{this, irnVar});
            }
            this.k = irnVar;
            return this;
        }

        public float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.d;
        }

        public TaoLiveWebBottomFragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("9e771a02", new Object[]{this});
            }
            TaoLiveWebBottomFragment access$700 = TaoLiveWebBottomFragment.access$700();
            TaoLiveWebBottomFragment.access$802(access$700, this.m);
            TaoLiveWebBottomFragment.access$902(access$700, new WeakReference(this.b));
            TaoLiveWebBottomFragment.access$1002(access$700, this.c);
            TaoLiveWebBottomFragment.access$1102(access$700, this.d);
            TaoLiveWebBottomFragment.access$1202(access$700, this.h);
            TaoLiveWebBottomFragment.access$1302(access$700, this.i);
            TaoLiveWebBottomFragment.access$1402(access$700, this.g);
            TaoLiveWebBottomFragment.access$1502(access$700, com.taobao.taolive.room.utils.d.a(this.f22111a, this.e));
            TaoLiveWebBottomFragment.access$502(access$700, this.f);
            TaoLiveWebBottomFragment.access$1602(access$700, this.j);
            TaoLiveWebBottomFragment.access$1702(access$700, this.k);
            TaoLiveWebBottomFragment.access$302(access$700, this.l);
            TaoLiveWebBottomFragment.access$1802(access$700, this.n);
            TaoLiveWebBottomFragment.access$202(access$700, this.o);
            TaoLiveWebBottomFragment.access$402(access$700, this.p);
            TaoLiveWebBottomFragment.access$1902(access$700, this.q);
            TaoLiveWebBottomFragment.access$2002(access$700, this.r);
            return access$700;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mFragmentResumed = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            Intent intent2 = this.activityIntent;
            if (intent2 == null) {
                this.activityIntent = intent;
            } else if (!StringUtils.equals(intent2.toURI(), intent.toURI())) {
                pmd.a().m().a(TAG, "半屏容器关闭，Activity Single Instance启动，intent 改变");
                dismissAllowingStateLoss();
                this.resumeTimestamp = -1L;
                return;
            }
        }
        this.resumeTimestamp = System.currentTimeMillis();
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.onResume();
        }
        irn irnVar = this.weexBuilder;
        if (irnVar == null) {
            return;
        }
        irnVar.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        JSONObject jSONObject = new JSONObject();
        if (this.hideLiveCloseBtn) {
            if (phg.d().a()) {
                ddw.a().a(xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, "close");
            } else {
                ddw.a().a("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
            }
        }
        if (this.mWebView != null || this.weexBuilder != null) {
            TBLiveH5Container tBLiveH5Container = this.mWebView;
            if (tBLiveH5Container != null) {
                g = tBLiveH5Container.getUrl();
            } else {
                g = this.weexBuilder.g();
            }
            jSONObject.put("url", (Object) g);
            WeakReference<c> weakReference = this.mWeakContainer;
            if (weakReference != null && weakReference.get() != null) {
                c cVar = this.mWeakContainer.get();
                if (!StringUtils.isEmpty(cVar.k)) {
                    this.closeFromSource = cVar.k;
                }
            }
            jSONObject.put("from", (Object) this.closeFromSource);
            WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.container.close", jSONObject.toString());
            Intent intent = new Intent("TBLiveWVPlugin.Event.container.close");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("url", g);
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
            String str = "send BroadCast: " + intent.toURI();
        }
        WeakReference<c> weakReference2 = this.mWeakContainer;
        if (weakReference2 != null && weakReference2.get() != null) {
            this.mWeakContainer.get().b();
        }
        TBLiveH5Container tBLiveH5Container2 = this.mWebView;
        if (tBLiveH5Container2 != null) {
            tBLiveH5Container2.destroy();
            this.mWebView = null;
        }
        irn irnVar = this.weexBuilder;
        if (irnVar != null) {
            irnVar.f();
        }
        if (!p.C()) {
            return;
        }
        ddw.a().b(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mFragmentResumed = false;
        long j = this.resumeTimestamp;
        if (j != -1 && j != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.resumeTimestamp;
            HashMap hashMap = new HashMap();
            hashMap.put("stayTime", String.valueOf(currentTimeMillis));
            hashMap.put("supportUpScrollPage", String.valueOf(this.supportScrollPage));
            hashMap.put("useUpScroll", String.valueOf(this.useScrollUp));
            pmd.a().e().b("Page_TaobaoLiveWatch", "WebViewLayerCloseInfo", hashMap);
        }
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            this.mWebView.onPause();
        }
        irn irnVar = this.weexBuilder;
        if (irnVar == null) {
            return;
        }
        irnVar.d();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        com.taobao.taolivecontainer.b bVar = this.mContainerBuilder;
        if (bVar != null) {
            this.mWebView = bVar.b();
            this.mWebView.setWebViewClient(new WVUCWebViewClient(getContext()) { // from class: com.taobao.tbliveinteractive.container.h5.TaoLiveWebBottomFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1262473342) {
                        super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                        return null;
                    } else if (hashCode == -332805219) {
                        super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                        return null;
                    } else if (hashCode != 1373550412) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                        return null;
                    }
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                        return;
                    }
                    super.onPageFinished(webView, str);
                    if (TaoLiveWebBottomFragment.access$2000(TaoLiveWebBottomFragment.this)) {
                        return;
                    }
                    TaoLiveWebBottomFragment.this.endLoading();
                }

                private void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    m.e(TaoLiveWebBottomFragment.TAG, str);
                    TaoLiveWebBottomFragment.this.dismissAllowingStateLoss();
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                        return;
                    }
                    super.onReceivedError(webView, i, str, str2);
                    a("error code: " + i + " ,description" + str);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    a("ssl error" + sslError.toString());
                }
            });
            this.mWebView.setTag(R.id.tag_support_scroll_up, Boolean.valueOf(this.supportScrollPage));
        } else if (bundle == null || !bundle.containsKey(RESTORE_URL)) {
        } else {
            pnj m = pmd.a().m();
            m.a(TAG, "Fragment 重建, 不会上屏 自动销毁, " + bundle.getString(RESTORE_URL));
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.pageAppear();
        }
        irn irnVar = this.weexBuilder;
        if (irnVar == null) {
            return;
        }
        irnVar.c();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            this.mWebView.pageDisAppear();
        }
        irn irnVar = this.weexBuilder;
        if (irnVar == null) {
            return;
        }
        irnVar.e();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        TBLiveH5Container tBLiveH5Container = this.mWebView;
        if (tBLiveH5Container == null) {
            return;
        }
        bundle.putString(RESTORE_URL, tBLiveH5Container.getUrl());
    }

    private void inflateScrollGuide(AppCompatDelegate appCompatDelegate) {
        CoordinatorLayout coordinatorLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec47bf2", new Object[]{this, appCompatDelegate});
        } else if (this.hideScrollGuide || (coordinatorLayout = (CoordinatorLayout) appCompatDelegate.a(R.id.coordinator)) == null) {
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.alilive_h5_scroll_guide, coordinatorLayout);
        }
    }
}
