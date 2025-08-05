package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.guide.model.PubCloseButtonModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.k;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u000eJ \u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)V", "mHasShow", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPopWindow", "Landroid/widget/PopupWindow;", "mPubCloseButtonModel", "Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "addTimesFatigue", "", "appId", "", "userId", "canShow", "", "hide", "show", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/View;", "showCloseButtonGuide", "timesFatigue", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f22787a;
    private final PubCloseButtonModel b;
    private final AtomicBoolean c;
    private final Context d;
    private final PubUserGuideModule e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub_kit/guide/PubCloseButtonGuide$showCloseButtonGuide$rootView$1$2$1", "com/taobao/themis/pub_kit/guide/PubCloseButtonGuide$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.pub_kit.guide.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class View$OnClickListenerC0971b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public View$OnClickListenerC0971b(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b.a(b.this).dismiss();
            }
        }
    }

    static {
        kge.a(594172715);
        Companion = new a(null);
    }

    public b(Context mContext, PubUserGuideModule mUserGuideModule) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        this.d = mContext;
        this.e = mUserGuideModule;
        this.f22787a = new PopupWindow(this.d);
        this.b = this.e.getCloseButtonTip();
        this.c = new AtomicBoolean(false);
    }

    public static final /* synthetic */ PopupWindow a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("35170839", new Object[]{bVar}) : bVar.f22787a;
    }

    public final boolean a(View parent, String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ced2b82", new Object[]{this, parent, appId, userId})).booleanValue();
        }
        q.d(parent, "parent");
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (!a(appId, userId)) {
            return false;
        }
        boolean a2 = a(parent);
        if (a2) {
            this.c.set(true);
            b(appId, userId);
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
            TMSLogger.d("closeButtonTip", "environment illegality");
            return false;
        } else if (this.c.get()) {
            TMSLogger.d("closeButtonTip", "气泡已展示");
            return false;
        } else if (!c(appId, userId)) {
            return true;
        } else {
            TMSLogger.d("closeButtonTip", "Beyond fatigue");
            return false;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.themis.kernel.utils.a.a(new PubCloseButtonGuide$hide$1(this));
        }
    }

    private final boolean a(View view) {
        String str;
        String disappearTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        PubCloseButtonModel pubCloseButtonModel = this.b;
        if (pubCloseButtonModel == null || (str = pubCloseButtonModel.getTitle()) == null) {
            str = "关闭频道退回首页";
        }
        View inflate = View.inflate(this.d, R.layout.tms_pub_close_button_tips_layout, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.tvMainText);
            if (textView != null) {
                textView.setText(str);
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.btnClose);
            if (imageView != null) {
                imageView.setOnClickListener(new View$OnClickListenerC0971b(str));
            }
            if (inflate != null) {
                PopupWindow popupWindow = this.f22787a;
                popupWindow.setContentView(inflate);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setOutsideTouchable(false);
                popupWindow.setFocusable(false);
                popupWindow.setHeight(k.a(this.d, 42.5f));
                popupWindow.setWidth(k.a(this.d, 152.0f));
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                try {
                    TMSLogger.a("closeButtonTip", "show closeButtonTip");
                    this.f22787a.getContentView().measure(0, 0);
                    this.f22787a.showAtLocation(view, 53, 22, rect.bottom);
                    PubCloseButtonModel pubCloseButtonModel2 = this.b;
                    com.taobao.themis.kernel.utils.a.a(new PubCloseButtonGuide$showCloseButtonGuide$2(this), ((pubCloseButtonModel2 == null || (disappearTime = pubCloseButtonModel2.getDisappearTime()) == null) ? 3 : Integer.parseInt(disappearTime)) * 1000);
                } catch (Exception e) {
                    TMSLogger.b("closeButtonTip", "showAsDropDown: ", e);
                }
                return true;
            }
        }
        return false;
    }

    private final void b(String str, String str2) {
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
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        PubCloseButtonModel pubCloseButtonModel = this.b;
        int parseInt = (pubCloseButtonModel == null || (userFatigueModel2 = pubCloseButtonModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubCloseButtonModel pubCloseButtonModel2 = this.b;
        int parseInt2 = (pubCloseButtonModel2 == null || (userFatigueModel = pubCloseButtonModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubCloseButtonModel pubCloseButtonModel3 = this.b;
        int parseInt3 = (pubCloseButtonModel3 == null || (bizFatigueModel2 = pubCloseButtonModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubCloseButtonModel pubCloseButtonModel4 = this.b;
        int parseInt4 = (pubCloseButtonModel4 == null || (bizFatigueModel = pubCloseButtonModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.e.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("closeButtonTip")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.d, "closeButtonTip", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    private final boolean c(String str, String str2) {
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
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        PubCloseButtonModel pubCloseButtonModel = this.b;
        int parseInt = (pubCloseButtonModel == null || (userFatigueModel2 = pubCloseButtonModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubCloseButtonModel pubCloseButtonModel2 = this.b;
        int parseInt2 = (pubCloseButtonModel2 == null || (userFatigueModel = pubCloseButtonModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubCloseButtonModel pubCloseButtonModel3 = this.b;
        int parseInt3 = (pubCloseButtonModel3 == null || (bizFatigueModel2 = pubCloseButtonModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubCloseButtonModel pubCloseButtonModel4 = this.b;
        int parseInt4 = (pubCloseButtonModel4 == null || (bizFatigueModel = pubCloseButtonModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.e.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("closeButtonTip")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.d, "closeButtonTip", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(846105779);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
