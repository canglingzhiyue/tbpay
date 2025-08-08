package com.taobao.android.litecreator.sdk.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.android.litecreator.util.av;
import com.taobao.android.litecreator.util.p;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.hfj;
import tb.hnl;
import tb.ior;
import tb.ios;
import tb.kge;
import tb.sqk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H&J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\bH&J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017J\u0016\u0010!\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor;", "Lcom/taobao/android/litecreator/sdk/nav/ILCNavInterceptor;", "()V", "monitor", "Lcom/taobao/android/litecreator/sdk/interfaces/IMonitor;", "getMonitor", "()Lcom/taobao/android/litecreator/sdk/interfaces/IMonitor;", "requiredKeySuffix", "", "supportedPublishConfigKey", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "createSessionIdAndUrlParams", "urlParamsJSON", "Lorg/json/JSONObject;", "doNav", "", "publishConfig", "context", "Landroid/content/Context;", "hideLoading", "navContext", "intercept", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "interceptKeyword", "nav", "showLoading", LoginConstants.SHOW_TOAST, "msg", "PublishConfigRequest", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class LCNavInterceptor implements com.taobao.android.litecreator.sdk.nav.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f13468a = "_rqd";
    private final List<String> b = new ArrayList();
    private final hnl c = (hnl) com.taobao.android.litecreator.service.b.a(hnl.class, new Object[0]);
    private String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ Context c;

        public a(Intent intent, Context context) {
            this.b = intent;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Set<String> queryParameterNames;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Uri data = this.b.getData();
            JSONObject jSONObject = new JSONObject();
            if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
                boolean z2 = false;
                for (String key : queryParameterNames) {
                    String queryParameter = data.getQueryParameter(key);
                    String str = key;
                    if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(queryParameter)) {
                        jSONObject.put((JSONObject) key, queryParameter);
                    }
                    q.b(key, "key");
                    if (n.b((CharSequence) str, (CharSequence) LCNavInterceptor.a(LCNavInterceptor.this), false, 2, (Object) null) && !LCNavInterceptor.b(LCNavInterceptor.this).contains(key)) {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                hfj.a(Globals.getApplication(), s.B());
                hnl b = LCNavInterceptor.this.b();
                if (b != null) {
                    hnl.a.a(b, "short_chain_failed", "no_supported_args", LCNavInterceptor.this.c(), null, LCNavInterceptor.this.c(), null, 40, null);
                }
            }
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.sdk.nav.LCNavInterceptor$nav$1$listener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
                /* loaded from: classes5.dex */
                public static final class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public final /* synthetic */ MtopResponse b;

                    public a(MtopResponse mtopResponse) {
                        this.b = mtopResponse;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String string = this.b.getDataJsonObject().getString("status");
                        if (string != null) {
                            int hashCode = string.hashCode();
                            if (hashCode != 48) {
                                if (hashCode == 49 && string.equals("1")) {
                                    String string2 = this.b.getDataJsonObject().getString("actionUrl");
                                    Nav.from(LCNavInterceptor.a.this.c).toUri(Uri.parse(string2));
                                    hnl b = LCNavInterceptor.this.b();
                                    if (b == null) {
                                        return;
                                    }
                                    hnl.a.a(b, "short_chain_failed", "no_permission", string2, null, string2, null, 40, null);
                                    return;
                                }
                            } else if (string.equals("0")) {
                                org.json.JSONObject publishConfig = this.b.getDataJsonObject().getJSONObject("publishParams");
                                LCNavInterceptor lCNavInterceptor = LCNavInterceptor.this;
                                q.b(publishConfig, "publishConfig");
                                lCNavInterceptor.a(publishConfig, LCNavInterceptor.a.this.c);
                                return;
                            }
                        }
                        LCNavInterceptor.this.a(LCNavInterceptor.a.this.c, com.alibaba.ability.localization.b.a(R.string.gg_pub_system_error_retry_1));
                        String str = "other_" + this.b.getRetCode() + '_' + this.b.getRetMsg();
                        hnl b2 = LCNavInterceptor.this.b();
                        if (b2 == null) {
                            return;
                        }
                        hnl.a.a(b2, "short_chain_failed", str, LCNavInterceptor.this.c(), null, LCNavInterceptor.this.c(), null, 40, null);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
                /* loaded from: classes5.dex */
                public static final class b implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            LCNavInterceptor.this.a(LCNavInterceptor.a.this.c, com.alibaba.ability.localization.b.a(R.string.gg_pub_system_error_retry_1));
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LCNavInterceptor.this.b(LCNavInterceptor.a.this.c);
                    LCNavInterceptor.this.a(LCNavInterceptor.a.this.c, com.alibaba.ability.localization.b.a(R.string.gg_pub_system_error_retry_1));
                    StringBuilder sb = new StringBuilder();
                    sb.append("other_");
                    String str2 = null;
                    sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    sb.append('_');
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    hnl b2 = LCNavInterceptor.this.b();
                    if (b2 == null) {
                        return;
                    }
                    hnl.a.a(b2, "short_chain_failed", sb2, LCNavInterceptor.this.c(), null, LCNavInterceptor.this.c(), null, 40, null);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    q.d(mtopResponse, "mtopResponse");
                    LCNavInterceptor.this.b(LCNavInterceptor.a.this.c);
                    av.a(new a(mtopResponse), new b());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LCNavInterceptor.this.b(LCNavInterceptor.a.this.c);
                    LCNavInterceptor.this.a(LCNavInterceptor.a.this.c, com.alibaba.ability.localization.b.a(R.string.gg_pub_system_error_retry_1));
                    StringBuilder sb = new StringBuilder();
                    sb.append("other_");
                    String str2 = null;
                    sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    sb.append('_');
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    hnl b2 = LCNavInterceptor.this.b();
                    if (b2 == null) {
                        return;
                    }
                    hnl.a.a(b2, "short_chain_failed", sb2, LCNavInterceptor.this.c(), null, LCNavInterceptor.this.c(), null, 40, null);
                }
            };
            LCNavInterceptor.this.a(this.c);
            MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), new PublishConfigRequest(jSONObject)).registerListener((IRemoteListener) iRemoteBaseListener).mo1305reqMethod(MethodEnum.POST).startRequest();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hnl b = LCNavInterceptor.this.b();
            if (b == null) {
                return;
            }
            hnl.a.a(b, "short_chain_failed", "remote_module_error", LCNavInterceptor.this.c(), null, LCNavInterceptor.this.c(), null, 40, null);
        }
    }

    static {
        kge.a(739179262);
        kge.a(-1144103779);
    }

    public abstract String a();

    public abstract void a(org.json.JSONObject jSONObject, Context context);

    public static final /* synthetic */ String a(LCNavInterceptor lCNavInterceptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11432c65", new Object[]{lCNavInterceptor}) : lCNavInterceptor.f13468a;
    }

    public static final /* synthetic */ List b(LCNavInterceptor lCNavInterceptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5362b5cd", new Object[]{lCNavInterceptor}) : lCNavInterceptor.b;
    }

    public final hnl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hnl) ipChange.ipc$dispatch("16b73b17", new Object[]{this}) : this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.litecreator.sdk.nav.a
    public boolean intercept(Intent intent, Context context) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debaad86", new Object[]{this, intent, context})).booleanValue();
        }
        q.d(intent, "intent");
        q.d(context, "context");
        String a2 = a();
        if (!StringUtils.isEmpty(a2) && (data = intent.getData()) != null && (path = data.getPath()) != null) {
            return n.b((CharSequence) path, (CharSequence) a2, false, 2, (Object) null);
        }
        return false;
    }

    @Override // com.taobao.android.litecreator.sdk.nav.a
    public void nav(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7d1fc1", new Object[]{this, intent, context});
            return;
        }
        q.d(intent, "intent");
        q.d(context, "context");
        Uri data = intent.getData();
        this.d = data != null ? data.toString() : null;
        hnl hnlVar = this.c;
        if (hnlVar != null) {
            hnl.a.a(hnlVar, "short_chain_start", this.d, null, 4, null);
        }
        ((sqk) com.taobao.android.litecreator.service.b.a(sqk.class, new Object[0])).initRemoteModules(new a(intent, context), new b());
    }

    public final String a(org.json.JSONObject urlParamsJSON) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45e4950a", new Object[]{this, urlParamsJSON});
        }
        q.d(urlParamsJSON, "urlParamsJSON");
        String uuid = UUID.randomUUID().toString();
        q.b(uuid, "UUID.randomUUID().toString()");
        ios.a aVar = new ios.a();
        aVar.a(urlParamsJSON);
        Map<String, String> a2 = aVar.a();
        q.b(a2, "urlParams.urlParams");
        a2.put(ior.f29193a, uuid);
        ios.a(uuid, aVar);
        return uuid;
    }

    public final void a(Context navContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, navContext});
            return;
        }
        q.d(navContext, "navContext");
        if (!(navContext instanceof FragmentActivity)) {
            return;
        }
        p.a((FragmentActivity) navContext);
    }

    public final void b(Context navContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, navContext});
            return;
        }
        q.d(navContext, "navContext");
        if (!(navContext instanceof FragmentActivity)) {
            return;
        }
        p.b((FragmentActivity) navContext);
    }

    public final void a(Context navContext, String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, navContext, msg});
            return;
        }
        q.d(navContext, "navContext");
        q.d(msg, "msg");
        hfj.a(navContext.getApplicationContext(), msg);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor$PublishConfigRequest;", "Lmtopsdk/mtop/domain/IMTOPDataObject;", "params", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", c.K_API_NAME, "", "getAPI_NAME", "()Ljava/lang/String;", "NEED_ECODE", "", "getNEED_ECODE", "()Z", "setNEED_ECODE", "(Z)V", "NEED_SESSION", "getNEED_SESSION", "setNEED_SESSION", c.K_API_VERSION, "getVERSION", "setVERSION", "(Ljava/lang/String;)V", "getParams", "()Lcom/alibaba/fastjson/JSONObject;", "setParams", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class PublishConfigRequest implements IMTOPDataObject {
        private final String API_NAME;
        private boolean NEED_ECODE;
        private boolean NEED_SESSION;
        private String VERSION;
        private JSONObject params;

        static {
            kge.a(-23009756);
            kge.a(-350052935);
        }

        public PublishConfigRequest(JSONObject params) {
            q.d(params, "params");
            this.params = params;
            this.API_NAME = "mtop.taobao.media.guang.publish.publishConfig";
            this.VERSION = "1.0";
            this.NEED_ECODE = true;
            this.NEED_SESSION = true;
        }

        public final JSONObject getParams() {
            return this.params;
        }

        public final void setParams(JSONObject jSONObject) {
            q.d(jSONObject, "<set-?>");
            this.params = jSONObject;
        }

        public final String getAPI_NAME() {
            return this.API_NAME;
        }

        public final String getVERSION() {
            return this.VERSION;
        }

        public final void setVERSION(String str) {
            q.d(str, "<set-?>");
            this.VERSION = str;
        }

        public final boolean getNEED_ECODE() {
            return this.NEED_ECODE;
        }

        public final void setNEED_ECODE(boolean z) {
            this.NEED_ECODE = z;
        }

        public final boolean getNEED_SESSION() {
            return this.NEED_SESSION;
        }

        public final void setNEED_SESSION(boolean z) {
            this.NEED_SESSION = z;
        }
    }
}
