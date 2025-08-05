package com.taobao.umipublish.extension.windvane.abilities;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.b;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.p;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.bao;
import tb.hfj;
import tb.ios;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0010\u0018\u0000 \u001a2\u00020\u0001:\u0006\u0019\u001a\u001b\u001c\u001d\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall;", "", "context", "Landroid/support/v4/app/FragmentActivity;", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "(Landroid/support/v4/app/FragmentActivity;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "getCallback", "()Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "setCallback", "(Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "getContext", "()Landroid/support/v4/app/FragmentActivity;", "data", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "processListener", "com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$processListener$1", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$processListener$1;", "call", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "gotoPublish", "imagePath", "", "BaseHandler", "Companion", "Data", "DownloadFileHandler", "DownloadMaterialHandler", "TemplateExportHandler", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class Share2GGWindvaneCall {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;

    /* renamed from: a */
    private final Data f23348a;
    private final Share2GGWindvaneCall$processListener$1 b;
    private final FragmentActivity c;
    private WVCallBackContext d;

    static {
        kge.a(-1767790119);
        Companion = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall$processListener$1] */
    public Share2GGWindvaneCall(FragmentActivity context, WVCallBackContext callback) {
        q.d(context, "context");
        q.d(callback, "callback");
        this.c = context;
        this.d = callback;
        this.f23348a = new Data();
        this.b = new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall$processListener$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                u.b("Share2GGWindvaneCall", "onSuccess " + jSONObject);
                p.b(Share2GGWindvaneCall.this.a());
                Share2GGWindvaneCall share2GGWindvaneCall = Share2GGWindvaneCall.this;
                String a2 = m.a(jSONObject, "path", "");
                q.b(a2, "JSONUtil.getString(result, \"path\", \"\")");
                Share2GGWindvaneCall.a(share2GGWindvaneCall, a2);
                Share2GGWindvaneCall.this.b().success(r.RET_SUCCESS);
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                u.d("Share2GGWindvaneCall", "onFailed " + str + ' ' + str2);
                String jSONString = Share2GGWindvaneCall.a(Share2GGWindvaneCall.this).a().toJSONString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("shareModel", (Object) jSONString);
                jSONObject.put("errCode", (Object) str);
                jSONObject.put("errMsg", (Object) str2);
                UmiPublishMonitor.a().a("Share2GGWindvaneCall", str, "share_content_to_gg_error", jSONObject.toJSONString());
                p.b(Share2GGWindvaneCall.this.a());
                hfj.a(Share2GGWindvaneCall.this.a().getApplicationContext(), b.a(R.string.gg_pub_composition_failed_retry));
                WVCallBackContext b = Share2GGWindvaneCall.this.b();
                r rVar = new r("HY_FAILED");
                rVar.a("errorCode", str);
                rVar.a("errorMsg", str2);
                t tVar = t.INSTANCE;
                b.error(rVar);
            }
        };
    }

    public static final /* synthetic */ Data a(Share2GGWindvaneCall share2GGWindvaneCall) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("2c12fc10", new Object[]{share2GGWindvaneCall}) : share2GGWindvaneCall.f23348a;
    }

    public static final /* synthetic */ void a(Share2GGWindvaneCall share2GGWindvaneCall, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646ee0aa", new Object[]{share2GGWindvaneCall, str});
        } else {
            share2GGWindvaneCall.a(str);
        }
    }

    public final FragmentActivity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("8b60e57b", new Object[]{this}) : this.c;
    }

    public final WVCallBackContext b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("b251178a", new Object[]{this}) : this.d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class Companion {
        static {
            kge.a(785242593);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String a2 = m.a(this.f23348a.a(), "ugcScene", (String) null);
        JSONObject b = m.b(this.f23348a.a(), "formData", "topic");
        JSONArray a3 = m.a(this.f23348a.a(), "formData", "items");
        String a4 = m.a((String) null, this.f23348a.a(), "formData", "titleHint");
        JSONObject b2 = m.b(this.f23348a.a(), "formData", "contentText");
        String a5 = m.a((String) null, this.f23348a.a(), "formData", "defaultText");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        JSONObject b3 = m.b(this.f23348a.a(), "publishParams");
        String a6 = m.a((String) null, this.f23348a.a(), "bizData", "rateData", "rateId");
        Uri.Builder appendQueryParameter = Uri.parse("https://web.m.taobao.com/app/mtb-guang/production/litecreator/publish").buildUpon().appendQueryParameter(ios.KEY_ONIOLN_FITTING_ROOM_SCENE, a2).appendQueryParameter(UmiWvPlugin.KEY_IMPORT_PICS, jSONArray.toJSONString());
        if (b != null) {
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                appendQueryParameter.appendQueryParameter(key, (String) value);
            }
        }
        if (b2 != null) {
            appendQueryParameter.appendQueryParameter("dft_rich_text", b2.toJSONString());
        }
        if (a4 != null) {
            appendQueryParameter.appendQueryParameter("title_tips", a4);
        }
        if (a3 != null) {
            appendQueryParameter.appendQueryParameter("taopai_select_goods", a3.toJSONString());
        }
        if (a5 != null) {
            appendQueryParameter.appendQueryParameter("default_text", a5);
        }
        if (a6 != null) {
            appendQueryParameter.appendQueryParameter("gg_rate_id", a6);
        }
        if (b3 != null) {
            for (Map.Entry<String, Object> entry2 : b3.entrySet()) {
                if (!TextUtils.isEmpty(entry2.getKey()) && entry2.getValue() != null) {
                    appendQueryParameter.appendQueryParameter(entry2.getKey(), entry2.getValue().toString());
                }
            }
        }
        Nav.from(this.c).toUri(appendQueryParameter.build());
    }

    public final void a(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        p.a(this.c, new b.a().a(com.alibaba.ability.localization.b.a(R.string.gg_pub_loading_1)).a(0.5f).a(false).b(false).a());
        this.f23348a.a(params);
        try {
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            if (a2 == null) {
                p.b(this.c);
                u.d("Share2GGWindvaneCall", "createAbility error.");
                UmiPublishMonitor.a().b("Share2GGWindvaneCall", "-1", "createAbility call error", null);
                return;
            }
            AbilityChain a3 = new AbilityChain(new DownloadFilesAbility(), this.c).a(0.4f).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_resource_download)).loadingText(com.alibaba.ability.localization.b.a(R.string.gg_pub_resource_downloading)).a(new DownloadFileHandler(this.f23348a));
            AbilityChain a4 = new AbilityChain(new DownloadMaterialAbility(), this.c).a(0.4f).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_resource_download)).loadingText(com.alibaba.ability.localization.b.a(R.string.gg_pub_resource_downloading)).a(new DownloadMaterialHandler(this.f23348a));
            AbilityChain a5 = new AbilityChain(a2, this.c).a(0.2f).a(com.alibaba.ability.localization.b.a(R.string.gg_pub_video_preparation)).loadingText(com.alibaba.ability.localization.b.a(R.string.gg_pub_video_preparation)).a(new TemplateExportHandler(this.f23348a));
            a3.setListener(this.b);
            a3.a(a4).a(a5);
            a3.execute(params);
        } catch (Throwable th) {
            p.b(this.c);
            u.d("Share2GGWindvaneCall", Log.getStackTraceString(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "", "()V", "downloadedMediaList", "Lcom/alibaba/fastjson/JSONArray;", "getDownloadedMediaList", "()Lcom/alibaba/fastjson/JSONArray;", "setDownloadedMediaList", "(Lcom/alibaba/fastjson/JSONArray;)V", "rawData", "Lcom/alibaba/fastjson/JSONObject;", "getRawData", "()Lcom/alibaba/fastjson/JSONObject;", "setRawData", "(Lcom/alibaba/fastjson/JSONObject;)V", bao.CACHE_KEY_TEMPLATE_INFO, "getTemplateInfo", "setTemplateInfo", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class Data {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private JSONObject f23350a = new JSONObject();
        private JSONArray b = new JSONArray();
        private JSONObject c = new JSONObject();

        static {
            kge.a(1030178741);
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f23350a;
        }

        public final void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            q.d(jSONObject, "<set-?>");
            this.f23350a = jSONObject;
        }

        public final JSONArray b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this}) : this.b;
        }

        public final void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else {
                this.c = jSONObject;
            }
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/AbilityChain$InputAndOutputHandler;", "data", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "(Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;)V", "getData", "()Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "setData", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static class BaseHandler extends AbilityChain.InputAndOutputHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private Data f23349a;

        static {
            kge.a(-2074451762);
        }

        public BaseHandler(Data data) {
            q.d(data, "data");
            this.f23349a = data;
        }

        public final Data a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Data) ipChange.ipc$dispatch("b680bb88", new Object[]{this}) : this.f23349a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\t"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadFileHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "data", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "(Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;)V", "in", "Lcom/alibaba/fastjson/JSONObject;", "out", "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class DownloadFileHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1251278565);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadFileHandler(Data data) {
            super(data);
            q.d(data, "data");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
            }
            JSONArray a2 = m.a(a().a(), "mediaData");
            JSONObject jSONObject2 = a2 != null ? a2.getJSONObject(0) : null;
            JSONArray<Object> materialList = m.a(jSONObject2, "templateFillData", "materialList");
            JSONObject b = m.b(jSONObject2, "templateFillData", "imageMappings");
            q.b(b, "JSONUtil.getObject(media…llData\", \"imageMappings\")");
            JSONObject jSONObject3 = b;
            ArrayList arrayList = new ArrayList(jSONObject3.size());
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("tag", (Object) entry.getKey());
                jSONObject4.put("url", entry.getValue());
                jSONObject4.put("type", (Object) "pic");
                arrayList.add(jSONObject4);
            }
            ArrayList<Object> arrayList2 = arrayList;
            JSONArray jSONArray = new JSONArray();
            Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 = new Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1(jSONArray);
            q.b(materialList, "materialList");
            for (Object obj : materialList) {
                share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1.mo2421invoke((Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1) obj);
            }
            for (Object obj2 : arrayList2) {
                share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1.mo2421invoke((Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1) obj2);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("downloadList", (Object) jSONArray);
            return jSONObject5;
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public void b(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("fileList")) == null) {
            } else {
                a().b().addAll(jSONArray);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\t"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadMaterialHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "data", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "(Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;)V", "in", "Lcom/alibaba/fastjson/JSONObject;", "out", "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class DownloadMaterialHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1103916176);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadMaterialHandler(Data data) {
            super(data);
            q.d(data, "data");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
            }
            try {
                JSONArray a2 = m.a(a().a(), "mediaData");
                String a3 = m.a("0", a2 != null ? a2.getJSONObject(0) : null, "templateId");
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(a3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("materialIds", (Object) jSONArray);
                return jSONObject2;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public void b(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else {
                a().b((jSONObject == null || (jSONArray = jSONObject.getJSONArray("materialList")) == null) ? null : jSONArray.getJSONObject(0));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$TemplateExportHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "data", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "(Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;)V", "in", "Lcom/alibaba/fastjson/JSONObject;", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes9.dex */
    public static final class TemplateExportHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(145514993);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TemplateExportHandler(Data data) {
            super(data);
            q.d(data, "data");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.add("image");
                JSONArray a2 = m.a(a().a(), "mediaData");
                JSONObject b = m.b(a2 != null ? a2.getJSONObject(0) : null, "templateFillData", "textMappings");
                JSONObject jSONObject3 = new JSONObject();
                for (Object obj : a().b()) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                    String a3 = m.a((JSONObject) obj, "tag", "");
                    String a4 = m.a((JSONObject) obj, "path", "");
                    if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
                        jSONObject3.put(a3, (Object) a4);
                    }
                }
                JSONObject c = a().c();
                if (c != null) {
                    c.put(AbilityConst.Server.e, (Object) b);
                }
                JSONObject c2 = a().c();
                if (c2 != null) {
                    c2.put(AbilityConst.Server.l, (Object) jSONObject3);
                }
                jSONObject2.put("templateType", (Object) "image");
                jSONObject2.put("outputType", (Object) jSONArray);
                jSONObject2.put("materialList", (Object) a().b());
                jSONObject2.put(bao.CACHE_KEY_TEMPLATE_INFO, (Object) a().c());
                return jSONObject2;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }
    }
}
