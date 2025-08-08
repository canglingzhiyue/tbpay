package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubRevisitGuideModelNew;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\u001c\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J,\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)V", "mDisplayed", "", "mPopWindow", "Landroid/widget/PopupWindow;", "mRevisitGuideModel", "Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "addTimesFatigue", "", "appId", "", "userId", "canShow", "destroy", "dpShowReVisitGuide", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/View;", "exitCallBack", "Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide$AppExitCallBack;", "show", "timesFatigue", "AppExitCallBack", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f22797a;
    private volatile boolean b;
    private final PubRevisitGuideModelNew c;
    private final Context d;
    private final PubUserGuideModule e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide$AppExitCallBack;", "", "exit", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$dpShowReVisitGuide$rootView$1$5$1", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PubRevisitGuideModelNew b;
        public final /* synthetic */ a c;

        public c(PubRevisitGuideModelNew pubRevisitGuideModelNew, a aVar) {
            this.b = pubRevisitGuideModelNew;
            this.c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            h.a(h.this).dismiss();
            String actionURL = this.b.getActionURL();
            if (actionURL == null) {
                return;
            }
            INavigatorAdapter.b.a((INavigatorAdapter) qpt.a(INavigatorAdapter.class), h.b(h.this), actionURL, null, null, null, 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$dpShowReVisitGuide$rootView$1$6$1", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PubRevisitGuideModelNew b;
        public final /* synthetic */ a c;

        public d(PubRevisitGuideModelNew pubRevisitGuideModelNew, a aVar) {
            this.b = pubRevisitGuideModelNew;
            this.c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            h.a(h.this).dismiss();
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$dpShowReVisitGuide$rootView$1$7$1", "com/taobao/themis/pub_kit/guide/PubRevisitBackGuide$$special$$inlined$apply$lambda$3"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PubRevisitGuideModelNew b;
        public final /* synthetic */ a c;

        public e(PubRevisitGuideModelNew pubRevisitGuideModelNew, a aVar) {
            this.b = pubRevisitGuideModelNew;
            this.c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                h.a(h.this).dismiss();
            }
        }
    }

    static {
        kge.a(-1120913514);
        Companion = new b(null);
    }

    public h(Context mContext, PubUserGuideModule mUserGuideModule) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        this.d = mContext;
        this.e = mUserGuideModule;
        this.f22797a = new PopupWindow(this.d);
        this.c = this.e.getRevisitPopupByReturn();
    }

    public static final /* synthetic */ PopupWindow a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("b28bb9bf", new Object[]{hVar}) : hVar.f22797a;
    }

    public static final /* synthetic */ Context b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c31d61ac", new Object[]{hVar}) : hVar.d;
    }

    public final boolean a(View parent, String appId, String userId, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87bdb66", new Object[]{this, parent, appId, userId, aVar})).booleanValue();
        }
        q.d(parent, "parent");
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (!a(appId, userId)) {
            return false;
        }
        boolean a2 = a(parent, aVar);
        if (a2) {
            this.b = true;
            c(appId, userId);
        }
        return a2;
    }

    public final boolean a(String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, appId, userId})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        Context context = this.d;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("revisitPopupByReturn", "environment illegality");
            return false;
        } else if (this.c == null) {
            TMSLogger.d("revisitPopupByReturn", "mRevisitGuideModel is null");
            return false;
        } else if (this.b) {
            TMSLogger.d("revisitPopupByReturn", "has displayed");
            return false;
        } else if (!b(appId, userId)) {
            return true;
        } else {
            TMSLogger.d("revisitPopupByReturn", "Beyond fatigue");
            return false;
        }
    }

    private final boolean a(View view, a aVar) {
        int i;
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a305e6fa", new Object[]{this, view, aVar})).booleanValue();
        }
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.c;
        if (pubRevisitGuideModelNew == null) {
            return false;
        }
        View inflate = View.inflate(this.d, R.layout.tms_pub_revisit_guide_layout, null);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tip_gif);
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
            if (!StringUtils.isEmpty(pubRevisitGuideModelNew.getGuideImg())) {
                d2 = pubRevisitGuideModelNew.getGuideImg();
            } else {
                d2 = n.d();
            }
            com.taobao.phenix.intf.b.h().a("common", d2).bitmapProcessors(new RoundedCornersBitmapProcessor(k.a(this.d, 15.0f), 0, RoundedCornersBitmapProcessor.CornerType.TOP)).into(tUrlImageView);
        }
        TIconFontTextView tIconFontTextView = (TIconFontTextView) inflate.findViewById(R.id.switch_image);
        q.b(tIconFontTextView, "this");
        tIconFontTextView.setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.favor_tip);
        if (!StringUtils.isEmpty(pubRevisitGuideModelNew.getMainText())) {
            q.b(textView, "this");
            textView.setText(pubRevisitGuideModelNew.getMainText());
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.favor_tip_subtitle);
        if (!StringUtils.isEmpty(pubRevisitGuideModelNew.getSubText())) {
            q.b(textView2, "this");
            textView2.setText(pubRevisitGuideModelNew.getSubText());
            textView2.setVisibility(0);
        } else {
            q.b(textView2, "this");
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.guide_button);
        if (!StringUtils.isEmpty(pubRevisitGuideModelNew.getActionText())) {
            textView3.setVisibility(0);
            textView3.setText(pubRevisitGuideModelNew.getActionText());
            textView3.setOnClickListener(new c(pubRevisitGuideModelNew, aVar));
        }
        TextView textView4 = (TextView) inflate.findViewById(R.id.ok_button);
        q.b(textView4, "this");
        textView4.setText("退出");
        textView4.setOnClickListener(new d(pubRevisitGuideModelNew, aVar));
        ((TIconFontTextView) inflate.findViewById(R.id.close_image)).setOnClickListener(new e(pubRevisitGuideModelNew, aVar));
        Object systemService = this.d.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        PopupWindow popupWindow = this.f22797a;
        FrameLayout frameLayout = new FrameLayout(this.d);
        Resources resources = this.d.getResources();
        q.b(resources, "mContext.resources");
        if (resources.getConfiguration().orientation == 2) {
            i = displayMetrics.widthPixels / 3;
        } else {
            i = (displayMetrics.widthPixels << 1) / 3;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        t tVar = t.INSTANCE;
        frameLayout.addView(inflate, layoutParams);
        t tVar2 = t.INSTANCE;
        popupWindow.setContentView(frameLayout);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(true);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(R.style.tms_pop_window_anim_alpha);
        popupWindow.setSoftInputMode(16);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(100);
        t tVar3 = t.INSTANCE;
        popupWindow.setBackgroundDrawable(colorDrawable);
        popupWindow.setHeight(displayMetrics.heightPixels);
        popupWindow.setWidth(-1);
        popupWindow.getContentView().setPadding(0, 0, 0, displayMetrics.heightPixels - displayMetrics2.heightPixels);
        TMSLogger.a("revisitPopupByReturn", "show revisitPopupByReturn");
        com.taobao.themis.kernel.utils.a.a(new PubRevisitBackGuide$dpShowReVisitGuide$2(this, view));
        return true;
    }

    private final boolean b(String str, String str2) {
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Integer backFatigueCountValue;
        Integer backFatigueDayValue;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        PubPropertiesModel properties = this.e.getProperties();
        int intValue = (properties == null || (backFatigueDayValue = properties.getBackFatigueDayValue()) == null) ? 0 : backFatigueDayValue.intValue();
        int intValue2 = (properties == null || (backFatigueCountValue = properties.getBackFatigueCountValue()) == null) ? 0 : backFatigueCountValue.intValue();
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.c;
        int parseInt = (pubRevisitGuideModelNew == null || (bizFatigueModel2 = pubRevisitGuideModelNew.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubRevisitGuideModelNew pubRevisitGuideModelNew2 = this.c;
        int parseInt2 = (pubRevisitGuideModelNew2 == null || (bizFatigueModel = pubRevisitGuideModelNew2.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("revisitPopupByReturn")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt3 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt3, i);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.d, "revisitPopupByReturn", new com.taobao.themis.pub_kit.utils.d(str, parseInt, parseInt2), new com.taobao.themis.pub_kit.utils.d(str2, intValue, intValue2), dVar);
    }

    private final void c(String str, String str2) {
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Integer backFatigueCountValue;
        Integer backFatigueDayValue;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        PubPropertiesModel properties = this.e.getProperties();
        int intValue = (properties == null || (backFatigueDayValue = properties.getBackFatigueDayValue()) == null) ? 0 : backFatigueDayValue.intValue();
        int intValue2 = (properties == null || (backFatigueCountValue = properties.getBackFatigueCountValue()) == null) ? 0 : backFatigueCountValue.intValue();
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.c;
        int parseInt = (pubRevisitGuideModelNew == null || (bizFatigueModel2 = pubRevisitGuideModelNew.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubRevisitGuideModelNew pubRevisitGuideModelNew2 = this.c;
        int parseInt2 = (pubRevisitGuideModelNew2 == null || (bizFatigueModel = pubRevisitGuideModelNew2.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("revisitPopupByReturn")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt3 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt3, i);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.d, "revisitPopupByReturn", new com.taobao.themis.pub_kit.utils.d(str, parseInt, parseInt2), new com.taobao.themis.pub_kit.utils.d(str2, intValue, intValue2), dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        static {
            kge.a(-551018658);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }
}
