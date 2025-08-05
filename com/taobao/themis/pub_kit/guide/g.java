package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.Window;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRecommendIconChangeGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "homePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "mDelta", "Lcom/alibaba/fastjson/JSONObject;", "mTraceId", "", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/alibaba/fastjson/JSONArray;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;)V", "mDisplayed", "", "mIconChangeGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "addTimesFatigue", "", "appId", "userId", "canShow", "show", "timesFatigue", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PubIconChangeGuidePopupModel f22796a;
    private volatile boolean b;
    private final Context c;
    private final PubUserGuideModule d;
    private final JSONArray e;
    private final JSONObject f;
    private final String g;

    static {
        kge.a(409531120);
        Companion = new a(null);
    }

    public g(Context mContext, PubUserGuideModule mUserGuideModule, JSONArray jSONArray, JSONObject jSONObject, String mTraceId) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        q.d(mTraceId, "mTraceId");
        this.c = mContext;
        this.d = mUserGuideModule;
        this.e = jSONArray;
        this.f = jSONObject;
        this.g = mTraceId;
        this.f22796a = this.d.getIconChangeGuidePopup();
    }

    public final boolean a(String appId, String userId) {
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, appId, userId})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (!(this.c instanceof Activity) || !b(appId, userId) || (pubIconChangeGuidePopupModel = this.f22796a) == null) {
            return false;
        }
        dlr dlrVar = new dlr();
        dlrVar.a(this.c);
        Window window = ((Activity) this.c).getWindow();
        q.b(window, "mContext.window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        Uri.Builder buildUpon = o.b(n.V()).buildUpon();
        buildUpon.appendQueryParameter("appName", this.d.getDosaName());
        buildUpon.appendQueryParameter(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.d.getDosaLogo());
        buildUpon.appendQueryParameter("miniappId", this.d.getMiniappId());
        jSONObject4.put((JSONObject) "url", (String) buildUpon.build());
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = jSONObject5;
        jSONObject6.put((JSONObject) "gravity", "center");
        jSONObject6.put((JSONObject) "tapEnable", (String) true);
        jSONObject6.put((JSONObject) "pushType", "outterJump");
        jSONObject6.put((JSONObject) "maxHeight", (String) 1);
        jSONObject6.put((JSONObject) "originHeight", (String) 1);
        jSONObject6.put((JSONObject) "useViewMode", (String) true);
        jSONObject6.put((JSONObject) "animation", com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT);
        jSONObject6.put((JSONObject) "cornerRadius", (String) Float.valueOf(0.0f));
        jSONObject6.put((JSONObject) "shouldBlockClose", (String) true);
        t tVar = t.INSTANCE;
        jSONObject4.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject5);
        jSONObject4.put((JSONObject) "popId", this.d.getMiniappId());
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = jSONObject7;
        JSONObject jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = jSONObject9;
        JSONObject newPopupData = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "guidePopTitle", (String) (newPopupData != null ? newPopupData.get("strongGuidePopTitle") : null));
        JSONObject newPopupData2 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "guidePopDesc", (String) (newPopupData2 != null ? newPopupData2.get("strongGuidePopDesc") : null));
        JSONObject newPopupData3 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "successFloatWindowTitle", (String) (newPopupData3 != null ? newPopupData3.get("successFloatWindowTitle") : null));
        JSONObject newPopupData4 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "successFloatWindowSubTitle", (String) (newPopupData4 != null ? newPopupData4.get("successFloatWindowSubTitle") : null));
        JSONObject newPopupData5 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "successFloatWindowImage", (String) (newPopupData5 != null ? newPopupData5.get("successFloatWindowImage") : null));
        JSONObject newPopupData6 = pubIconChangeGuidePopupModel.getNewPopupData();
        jSONObject10.put((JSONObject) "successFloatWindowSingleRawImage", (String) (newPopupData6 != null ? newPopupData6.get("successFloatWindowsingleRawImage") : null));
        t tVar2 = t.INSTANCE;
        jSONObject8.put((JSONObject) "recommendIconChangeGuidePopup", (String) jSONObject9);
        JSONObject jSONObject11 = this.f;
        if (jSONObject11 != null) {
            jSONObject8.put((JSONObject) "revisitIdentifyData", (String) jSONObject11);
        }
        jSONObject8.put((JSONObject) "popType", PubTitleBar.PUB_GUIDE_RECOMMEND_CUSTOM_REPLACE);
        Object expBuckets = this.d.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject8.put((JSONObject) "expBuckets", (String) expBuckets);
        Resources resources = ((Activity) this.c).getResources();
        q.b(resources, "mContext.resources");
        jSONObject8.put((JSONObject) "landscape", (String) Boolean.valueOf(resources.getConfiguration().orientation == 2));
        t tVar3 = t.INSTANCE;
        jSONObject4.put((JSONObject) "content", (String) jSONObject7);
        t tVar4 = t.INSTANCE;
        jSONObject2.put((JSONObject) "params", (String) jSONObject3);
        String str = this.g;
        String a2 = com.taobao.themis.kernel.logger.a.a(str);
        JSONObject jSONObject12 = new JSONObject();
        jSONObject12.put((JSONObject) "inputJson", (String) jSONObject);
        t tVar5 = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.b("PubRecommendClient", com.taobao.themis.kernel.logger.a.EVENT_ON_SUCCESS, str, a2, jSONObject12);
        new dkt().a(new dlh(jSONObject), dlrVar, b.INSTANCE);
        d(appId, userId);
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032&\u0010\u0005\u001a\"\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0006¨\u0006\u00010\u0006¨\u0006\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "nextAbilityTypeKey", "", "kotlin.jvm.PlatformType", "result", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "", "callback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                return;
            }
            TMSLogger.a("iconChangeGuidePopup", str + dkxVar);
        }
    }

    public final boolean b(String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, appId, userId})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        Context context = this.c;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("iconChangeGuidePopup", "environment illegality");
            return false;
        } else if (this.b) {
            TMSLogger.d("iconChangeGuidePopup", "已展示过添加Icon弹窗");
            return false;
        } else if (!c(appId, userId)) {
            return true;
        } else {
            TMSLogger.d("iconChangeGuidePopup", "疲劳度受限");
            return false;
        }
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
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.f22796a;
        int parseInt = (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.f22796a;
        int parseInt2 = (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.f22796a;
        int parseInt3 = (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.f22796a;
        int parseInt4 = (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.d.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("iconChangeGuidePopup")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.c, "iconChangeGuidePopup", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    private final void d(String str, String str2) {
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
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.f22796a;
        int parseInt = (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.f22796a;
        int parseInt2 = (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.f22796a;
        int parseInt3 = (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.f22796a;
        int parseInt4 = (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.d.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("iconChangeGuidePopup")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.c, "iconChangeGuidePopup", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRecommendIconChangeGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-77991368);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
