package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.o;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubOperateGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)V", "<set-?>", "", "displayed", "getDisplayed", "()Z", "addTimesFatigue", "", "appId", "", "userId", "canShow", "show", "type", "", "extraInfo", "Lcom/alibaba/fastjson/JSONObject;", "timesFatigue", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f22794a;
    private final Context b;
    private final PubUserGuideModule c;

    static {
        kge.a(-2018192975);
        Companion = new a(null);
    }

    public e(Context mContext, PubUserGuideModule mUserGuideModule) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        this.b = mContext;
        this.c = mUserGuideModule;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f22794a;
    }

    public final boolean a(String appId, String userId, int i, JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6938a2cd", new Object[]{this, appId, userId, new Integer(i), jSONObject})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        if (!a(appId, userId)) {
            return false;
        }
        this.f22794a = true;
        dlr dlrVar = new dlr();
        dlrVar.a(this.b);
        Context context = this.b;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        Window window = ((Activity) context).getWindow();
        q.b(window, "(mContext as Activity).window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        Uri.Builder buildUpon = o.b(n.z()).buildUpon();
        buildUpon.appendQueryParameter("miniappId", this.c.getMiniappId());
        jSONObject7.put((JSONObject) "url", (String) buildUpon.build());
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = jSONObject8;
        jSONObject9.put((JSONObject) "gravity", "center");
        jSONObject9.put((JSONObject) "tapEnable", (String) true);
        jSONObject9.put((JSONObject) "pushType", "outterJump");
        jSONObject9.put((JSONObject) "maxHeight", (String) 1);
        jSONObject9.put((JSONObject) "originHeight", (String) 1);
        jSONObject9.put((JSONObject) "useViewMode", (String) true);
        jSONObject9.put((JSONObject) "cornerRadius", (String) Float.valueOf(0.0f));
        t tVar = t.INSTANCE;
        jSONObject7.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject8);
        jSONObject7.put((JSONObject) "popId", this.c.getMiniappId());
        JSONObject jSONObject10 = new JSONObject();
        JSONObject jSONObject11 = jSONObject10;
        jSONObject11.put((JSONObject) "type", (String) Integer.valueOf(i));
        Object expBuckets = this.c.getExpBuckets();
        if (expBuckets == null) {
            z = false;
            expBuckets = new String[0];
        } else {
            z = false;
        }
        jSONObject11.put((JSONObject) "expBuckets", (String) expBuckets);
        Resources resources = ((Activity) this.b).getResources();
        q.b(resources, "mContext.resources");
        if (resources.getConfiguration().orientation == 2) {
            z = true;
        }
        jSONObject11.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        if (jSONObject != null && (jSONObject3 = jSONObject.getJSONObject("backHomeFrame")) != null) {
            jSONObject11.put((JSONObject) "backHomeFrame", (String) jSONObject3);
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("addIconFrame")) != null) {
            jSONObject11.put((JSONObject) "addIconFrame", (String) jSONObject2);
        }
        t tVar2 = t.INSTANCE;
        jSONObject7.put((JSONObject) "content", (String) jSONObject10);
        t tVar3 = t.INSTANCE;
        jSONObject5.put((JSONObject) "params", (String) jSONObject6);
        new dkt().a(new dlh(jSONObject4), dlrVar, b.INSTANCE);
        c(appId, userId);
        return true;
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
            TMSLogger.a("operateGuide", str + dkxVar);
        }
    }

    public final boolean a(String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, appId, userId})).booleanValue();
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        Context context = this.b;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("operateGuide", "context is not Activity or context is Finishing");
            return false;
        } else if (!n.A()) {
            TMSLogger.d("operateGuide", "开关关闭");
            return false;
        } else if (this.f22794a) {
            TMSLogger.d("operateGuide", "has displayed");
            return false;
        } else if (!b(appId, userId)) {
            return true;
        } else {
            TMSLogger.d("operateGuide", "疲劳度受限");
            return false;
        }
    }

    private final boolean b(String str, String str2) {
        PubPropertiesFatigueModel operateGuideBizFatigueConfig;
        String fatigueCountValue;
        PubPropertiesFatigueModel operateGuideBizFatigueConfig2;
        String fatigueDayValue;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig;
        String fatigueCountValue2;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig2;
        String fatigueDayValue2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        PubPropertiesModel properties = this.c.getProperties();
        int parseInt = (properties == null || (operateGuideUserFatigueConfig2 = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueDayValue2 = operateGuideUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue2);
        int parseInt2 = (properties == null || (operateGuideUserFatigueConfig = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueCountValue2 = operateGuideUserFatigueConfig.getFatigueCountValue()) == null) ? 0 : Integer.parseInt(fatigueCountValue2);
        int parseInt3 = (properties == null || (operateGuideBizFatigueConfig2 = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueDayValue = operateGuideBizFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
        if (properties != null && (operateGuideBizFatigueConfig = properties.getOperateGuideBizFatigueConfig()) != null && (fatigueCountValue = operateGuideBizFatigueConfig.getFatigueCountValue()) != null) {
            i = Integer.parseInt(fatigueCountValue);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.b, "operateGuide", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, i), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), null, 16, null);
    }

    private final void c(String str, String str2) {
        PubPropertiesFatigueModel operateGuideBizFatigueConfig;
        String fatigueCountValue;
        PubPropertiesFatigueModel operateGuideBizFatigueConfig2;
        String fatigueDayValue;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig;
        String fatigueCountValue2;
        PubPropertiesFatigueModel operateGuideUserFatigueConfig2;
        String fatigueDayValue2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        PubPropertiesModel properties = this.c.getProperties();
        int parseInt = (properties == null || (operateGuideUserFatigueConfig2 = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueDayValue2 = operateGuideUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue2);
        int parseInt2 = (properties == null || (operateGuideUserFatigueConfig = properties.getOperateGuideUserFatigueConfig()) == null || (fatigueCountValue2 = operateGuideUserFatigueConfig.getFatigueCountValue()) == null) ? 0 : Integer.parseInt(fatigueCountValue2);
        int parseInt3 = (properties == null || (operateGuideBizFatigueConfig2 = properties.getOperateGuideBizFatigueConfig()) == null || (fatigueDayValue = operateGuideBizFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
        if (properties != null && (operateGuideBizFatigueConfig = properties.getOperateGuideBizFatigueConfig()) != null && (fatigueCountValue = operateGuideBizFatigueConfig.getFatigueCountValue()) != null) {
            i = Integer.parseInt(fatigueCountValue);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.b, "operateGuide", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, i), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), null, 16, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubOperateGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1672277063);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
