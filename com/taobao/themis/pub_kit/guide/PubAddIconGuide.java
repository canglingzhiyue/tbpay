package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.guide.model.PubAddIconTipsModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fB\u0015\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u00020\u0018H\u0007J,\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010$\u001a\u00020\u0018H\u0007J*\u0010%\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007JB\u0010%\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "", "context", "Landroid/content/Context;", "module", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "mDismissCallback", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$DismissedCallback;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$DismissedCallback;)V", "homePagePopData", "Lcom/alibaba/fastjson/JSONArray;", "dismissedCallback", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/alibaba/fastjson/JSONArray;Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$DismissedCallback;)V", "mContext", "mUserGuideModule", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)V", "mAddIconTipsModel", "Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "mHasShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mHomePagePopData", "mPopWindow", "Landroid/widget/PopupWindow;", "addTimesFatigue", "", "appId", "", "userId", "canShow", "", "destroy", "doShowDetailFavorTips", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/View;", "title", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "hide", "show", "type", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$PubAddIconGuideType;", "timesFatigue", "userTrackerClick", "userTrackerExpose", "Companion", "DismissedCallback", "PubAddIconGuideType", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubAddIconGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f22783a;
    private final PubAddIconTipsModel b;
    private final AtomicBoolean c;
    private b d;
    private JSONArray e;
    private final Context f;
    private final PubUserGuideModule g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$PubAddIconGuideType;", "", "(Ljava/lang/String;I)V", "DETAIL_FAVOR_TIPS", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum PubAddIconGuideType {
        DETAIL_FAVOR_TIPS
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$DismissedCallback;", "", "onDismiss", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void onDismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub_kit/guide/PubAddIconGuide$doShowDetailFavorTips$rootView$1$5$1", "com/taobao/themis/pub_kit/guide/PubAddIconGuide$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public c(String str, String str2, String str3, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b a2 = PubAddIconGuide.a(PubAddIconGuide.this);
            if (a2 != null) {
                a2.onDismiss();
            }
            PubAddIconGuide.b(PubAddIconGuide.this).dismiss();
            PubAddIconGuide.a(PubAddIconGuide.this, this.f);
        }
    }

    static {
        kge.a(1151663163);
        Companion = new a(null);
    }

    public PubAddIconGuide(Context mContext, PubUserGuideModule mUserGuideModule) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        this.f = mContext;
        this.g = mUserGuideModule;
        this.f22783a = new PopupWindow(this.f);
        this.b = this.g.getAddIconTips();
        this.c = new AtomicBoolean(false);
    }

    public static final /* synthetic */ b a(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("268d0056", new Object[]{pubAddIconGuide}) : pubAddIconGuide.d;
    }

    public static final /* synthetic */ void a(PubAddIconGuide pubAddIconGuide, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffee288", new Object[]{pubAddIconGuide, str});
        } else {
            pubAddIconGuide.b(str);
        }
    }

    public static final /* synthetic */ PopupWindow b(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("20f437b7", new Object[]{pubAddIconGuide}) : pubAddIconGuide.f22783a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PubAddIconGuide(Context context, PubUserGuideModule module, b mDismissCallback) {
        this(context, module);
        q.d(context, "context");
        q.d(module, "module");
        q.d(mDismissCallback, "mDismissCallback");
        this.d = mDismissCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PubAddIconGuide(Context context, PubUserGuideModule module, JSONArray jSONArray, b dismissedCallback) {
        this(context, module);
        q.d(context, "context");
        q.d(module, "module");
        q.d(dismissedCallback, "dismissedCallback");
        this.e = jSONArray;
        this.d = dismissedCallback;
    }

    public final boolean a(View view, PubAddIconGuideType type, String appId, String userId, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba208173", new Object[]{this, view, type, appId, userId, str, str2})).booleanValue();
        }
        q.d(type, "type");
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (view == null) {
            TMSLogger.d("addIconTips", "parent is null");
            return false;
        } else if (!a(appId, userId)) {
            return false;
        } else {
            if (com.taobao.themis.pub_kit.guide.a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
                com.taobao.themis.pub_kit.utils.f.a("Page_Miniapp_Show-GuideTipsDetail", ai.a(j.a("miniapp_id", appId), j.a("spm", "MiniApp_" + appId + ".pages_Page_MiniApp.GuideTipsDetail.d")));
                boolean a2 = a(appId, view, str, str2);
                if (a2) {
                    this.c.set(true);
                    a(appId);
                    c(appId, userId);
                }
                return a2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean a(View view, PubAddIconGuideType type, String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e15dddf", new Object[]{this, view, type, appId, userId})).booleanValue();
        }
        q.d(type, "type");
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (view == null) {
            TMSLogger.d("addIconTips", "parent is null");
            return false;
        } else if (!a(appId, userId)) {
            return false;
        } else {
            if (com.taobao.themis.pub_kit.guide.a.$EnumSwitchMapping$1[type.ordinal()] == 1) {
                com.taobao.themis.pub_kit.utils.f.a("Page_Miniapp_Show-GuideTipsDetail", ai.a(j.a("miniapp_id", appId), j.a("spm", "MiniApp_" + appId + ".pages_Page_MiniApp.GuideTipsDetail.d")));
                boolean a2 = a(appId, view, (String) null, (String) null);
                if (a2) {
                    this.c.set(true);
                    a(appId);
                    c(appId, userId);
                }
                return a2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean a(String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, appId, userId})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        Context context = this.f;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("addIconTips", "environment illegality");
            return false;
        } else if (this.c.get()) {
            TMSLogger.d("addIconTips", "已经展示过");
            return false;
        } else if (!b(appId, userId)) {
            return true;
        } else {
            TMSLogger.d("addIconTips", "Beyond fatigue");
            return false;
        }
    }

    private final boolean a(String str, View view, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String disappearTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39a1d078", new Object[]{this, str, view, str2, str3})).booleanValue();
        }
        if (str2 == null) {
            PubAddIconTipsModel pubAddIconTipsModel = this.b;
            str4 = pubAddIconTipsModel != null ? pubAddIconTipsModel.getTitle() : null;
        } else {
            str4 = str2;
        }
        if (str3 == null) {
            PubAddIconTipsModel pubAddIconTipsModel2 = this.b;
            str5 = pubAddIconTipsModel2 != null ? pubAddIconTipsModel2.getSubTitle() : null;
        } else {
            str5 = str3;
        }
        if (com.taobao.themis.pub_kit.utils.h.c(this.e)) {
            PubAddIconTipsModel pubAddIconTipsModel3 = this.b;
            if (pubAddIconTipsModel3 == null || (str6 = pubAddIconTipsModel3.getGuideSingleRawImage()) == null) {
                str6 = "https://gw.alicdn.com/imgextra/i1/O1CN01VwusiD1C4rzGmDwiy_!!6000000000028-2-tps-360-261.png";
            }
        } else {
            PubAddIconTipsModel pubAddIconTipsModel4 = this.b;
            if (pubAddIconTipsModel4 == null || (str6 = pubAddIconTipsModel4.getGuideImage()) == null) {
                str6 = "https://gw.alicdn.com/imgextra/i3/O1CN01G9yUVy1dHEH4SCu8Q_!!6000000003710-2-tps-360-261.png";
            }
        }
        String str7 = str6;
        String dosaLogo = this.g.getDosaLogo();
        View inflate = View.inflate(this.f, R.layout.tms_pub_detail_favor_tips_layout, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.tvMainText);
            q.b(textView, "this");
            textView.setText(str4);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tvSubText);
            q.b(textView2, "this");
            textView2.setText(str5);
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tvImage);
            if (!StringUtils.isEmpty(str7)) {
                com.taobao.phenix.intf.b.h().a("common", str7).into(tUrlImageView);
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) inflate.findViewById(R.id.tvLogoImage);
            if (!StringUtils.isEmpty(dosaLogo)) {
                com.taobao.phenix.intf.b.h().a("common", dosaLogo).into(tUrlImageView2);
            }
            inflate.findViewById(R.id.btnClose).setOnClickListener(new c(str4, str5, str7, dosaLogo, str));
            if (inflate != null) {
                PopupWindow popupWindow = this.f22783a;
                popupWindow.setContentView(inflate);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setOutsideTouchable(false);
                popupWindow.setFocusable(false);
                popupWindow.setHeight(k.a(this.f, 150.0f));
                popupWindow.setWidth(k.a(this.f, 201.0f));
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                try {
                    TMSLogger.a("addIconTips", "show addIconTips");
                    this.f22783a.getContentView().measure(0, 0);
                    this.f22783a.showAtLocation(view, 53, 22, rect.bottom);
                    PubAddIconTipsModel pubAddIconTipsModel5 = this.b;
                    com.taobao.themis.kernel.utils.a.a(new PubAddIconGuide$doShowDetailFavorTips$2(this), ((pubAddIconTipsModel5 == null || (disappearTime = pubAddIconTipsModel5.getDisappearTime()) == null) ? 6 : Integer.parseInt(disappearTime)) * 1000);
                } catch (Exception e) {
                    TMSLogger.b("addIconTips", "showAsDropDown: ", e);
                }
                return true;
            }
        }
        return false;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f22783a.isShowing()) {
        } else {
            b bVar = this.d;
            if (bVar != null) {
                bVar.onDismiss();
            }
            this.f22783a.dismiss();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f22783a.isShowing()) {
        } else {
            b bVar = this.d;
            if (bVar != null) {
                bVar.onDismiss();
            }
            this.f22783a.dismiss();
        }
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
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        PubAddIconTipsModel pubAddIconTipsModel = this.b;
        int parseInt = (pubAddIconTipsModel == null || (userFatigueModel2 = pubAddIconTipsModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubAddIconTipsModel pubAddIconTipsModel2 = this.b;
        int parseInt2 = (pubAddIconTipsModel2 == null || (userFatigueModel = pubAddIconTipsModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubAddIconTipsModel pubAddIconTipsModel3 = this.b;
        int parseInt3 = (pubAddIconTipsModel3 == null || (bizFatigueModel2 = pubAddIconTipsModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubAddIconTipsModel pubAddIconTipsModel4 = this.b;
        int parseInt4 = (pubAddIconTipsModel4 == null || (bizFatigueModel = pubAddIconTipsModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.g.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("addIconTips")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.f, "addIconTips", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
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
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        PubAddIconTipsModel pubAddIconTipsModel = this.b;
        int parseInt = (pubAddIconTipsModel == null || (userFatigueModel2 = pubAddIconTipsModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubAddIconTipsModel pubAddIconTipsModel2 = this.b;
        int parseInt2 = (pubAddIconTipsModel2 == null || (userFatigueModel = pubAddIconTipsModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubAddIconTipsModel pubAddIconTipsModel3 = this.b;
        int parseInt3 = (pubAddIconTipsModel3 == null || (bizFatigueModel2 = pubAddIconTipsModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubAddIconTipsModel pubAddIconTipsModel4 = this.b;
        int parseInt4 = (pubAddIconTipsModel4 == null || (bizFatigueModel = pubAddIconTipsModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.g.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("addIconTips")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.f, "addIconTips", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.themis.pub_kit.utils.f.a("Page_Miniapp_Show-Guidetip", ai.b(j.a("miniapp_id", str)));
        }
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            com.taobao.themis.pub_kit.utils.f.b("Page_Miniapp_Button-Guidetip", ai.b(j.a("miniapp_id", str)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1243670077);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
