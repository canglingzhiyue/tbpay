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
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubUserActiveIconChangeGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "homePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/alibaba/fastjson/JSONArray;)V", "mUserActiveIconChangeGuidePopupModel", "Lcom/alibaba/fastjson/JSONObject;", "show", "", "Companion", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f22801a;
    private final Context b;
    private final PubUserGuideModule c;
    private final JSONArray d;

    static {
        kge.a(1585820361);
        Companion = new a(null);
    }

    public i(Context mContext, PubUserGuideModule mUserGuideModule, JSONArray jSONArray) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModule, "mUserGuideModule");
        this.b = mContext;
        this.c = mUserGuideModule;
        this.d = jSONArray;
        this.f22801a = this.c.getUserActiveIconChangeGuidePopup();
    }

    public /* synthetic */ i(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, int i, o oVar) {
        this(context, pubUserGuideModule, (i & 4) != 0 ? null : jSONArray);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!(this.b instanceof Activity)) {
            return false;
        }
        dlr dlrVar = new dlr();
        dlrVar.a(this.b);
        Window window = ((Activity) this.b).getWindow();
        q.b(window, "mContext.window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        Uri.Builder buildUpon = com.taobao.themis.utils.o.b(n.w()).buildUpon();
        buildUpon.appendQueryParameter("appName", this.c.getDosaName());
        buildUpon.appendQueryParameter(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.c.getDosaLogo());
        buildUpon.appendQueryParameter("miniappId", this.c.getMiniappId());
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
        jSONObject4.put((JSONObject) "popId", this.c.getMiniappId());
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = jSONObject7;
        jSONObject8.put((JSONObject) "userActiveIconChangeGuidePopup", (String) this.f22801a);
        jSONObject8.put((JSONObject) "popType", PubTitleBar.PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE);
        Object expBuckets = this.c.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject8.put((JSONObject) "expBuckets", (String) expBuckets);
        Resources resources = ((Activity) this.b).getResources();
        q.b(resources, "mContext.resources");
        if (resources.getConfiguration().orientation != 2) {
            z = false;
        }
        jSONObject8.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        t tVar2 = t.INSTANCE;
        jSONObject4.put((JSONObject) "content", (String) jSONObject7);
        t tVar3 = t.INSTANCE;
        jSONObject2.put((JSONObject) "params", (String) jSONObject3);
        new dkt().a(new dlh(jSONObject), dlrVar, b.INSTANCE);
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
            TMSLogger.a("userActiveIconChangeGuidePopup", str + dkxVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubUserActiveIconChangeGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(632256209);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
