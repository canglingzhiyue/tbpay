package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.performance.m;
import com.taobao.android.detail.core.utils.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.event.shopRecommendV2")
/* loaded from: classes4.dex */
public final class dwv extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "shopRecommendV2";
    public static final String KEY_FLAG = "flag";
    public static final String KEY_RECOMMEND_IDS = "recomIds";
    public static final String KEY_RECOMMEND_ID_INFO = "recomIdInfo";
    public static final String KEY_RECOMMEND_ITEM_ID = "recItemId";
    public static final String KEY_SMART_FLAG = "smartFlag";

    static {
        kge.a(-835921737);
    }

    public static /* synthetic */ Object ipc$super(dwv dwvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    public static /* synthetic */ void a(s sVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6d5580", new Object[]{sVar, aURARenderComponent, asyncModule});
        } else {
            b(sVar, aURARenderComponent, asyncModule);
        }
    }

    public dwv() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.AliDetailShopRecommendEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b = b().b();
        if (b == null) {
            arc.a().c("AliDetailShopRecommendEvent", "innerHandleEvent", "auraInstance is null");
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            arc.a().c("AliDetailShopRecommendEvent", "innerHandleEvent", "component is null");
            return;
        }
        AsyncModule asyncModule = (AsyncModule) eventModel.c(avr.EVENT_EXT_PARAMS_ASYNC_MODULE);
        if (asyncModule == null) {
            arc.a().c("AliDetailShopRecommendEvent", "innerHandleEvent", "asyncModule is null");
        } else if (f.e()) {
            b(b, d, asyncModule);
        } else {
            AsyncModule.DependencyRequest dependencyRequest = asyncModule.dependencyRequest;
            if (dependencyRequest == null) {
                arc.a().c("AliDetailShopRecommendEvent", "innerHandleEvent", "dependencyRequest is null");
                return;
            }
            AURANextRPCEndpoint a2 = a(dependencyRequest.mtopConfigModel);
            if (a2 == null) {
                arc.a().c("AURAAsyncModuleEvent", "innerHandleEvent", "bad dependencyEndpoint");
                return;
            }
            i.d(m.a(EVENT_TYPE), "detailRecommend_async firstRequest");
            b.a("aura.workflow.request", new AURANextRPCIO("", a2), new a(b, d, asyncModule));
        }
    }

    private AURANextRPCEndpoint a(AsyncModule.MTopConfigModel mTopConfigModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("700c2850", new Object[]{this, mTopConfigModel});
        }
        if (mTopConfigModel == null || TextUtils.isEmpty(mTopConfigModel.apiMethod) || TextUtils.isEmpty(mTopConfigModel.apiVersion)) {
            return null;
        }
        AURANextRPCEndpoint.a aVar = new AURANextRPCEndpoint.a();
        aVar.a(mTopConfigModel.apiMethod);
        aVar.b(mTopConfigModel.apiVersion);
        if (mTopConfigModel.requestData != null) {
            HashMap hashMap = new HashMap();
            for (String str : mTopConfigModel.requestData.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, mTopConfigModel.requestData.getString(str));
                }
            }
            aVar.b(hashMap);
        }
        return aVar.a();
    }

    /* loaded from: classes4.dex */
    public static class a extends aqq<AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public s f27049a;
        public AURARenderComponent b;
        public AsyncModule c;

        static {
            kge.a(-2032869540);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(s sVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule) {
            this.f27049a = sVar;
            this.b = aURARenderComponent;
            this.c = asyncModule;
        }

        @Override // tb.aqq
        public void a(c<AURAParseIO> cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            } else if (!(cVar.b() instanceof AURAParseIO)) {
                arc.a().c("AliDetailShopRecommendEvent", "DependencyRequestCallback.onNext", "response invalid");
            } else {
                List<com.alibaba.android.aura.datamodel.parse.a> data = cVar.b().getData();
                if (data.isEmpty()) {
                    arc.a().c("AliDetailShopRecommendEvent", "DependencyRequestCallback.onNext", "responseDataList is empty");
                    return;
                }
                JSONObject a2 = data.get(0).a();
                if (a2 == null) {
                    arc.a().c("AliDetailShopRecommendEvent", "DependencyRequestCallback.onNext", "responseData is null");
                    return;
                }
                JSONObject jSONObject = a2.getJSONObject(dwv.KEY_RECOMMEND_ID_INFO);
                String str = "";
                String string = (jSONObject == null || jSONObject.getString(dwv.KEY_RECOMMEND_IDS) == null) ? str : jSONObject.getString(dwv.KEY_RECOMMEND_IDS);
                if (jSONObject != null && jSONObject.getString(dwv.KEY_SMART_FLAG) != null) {
                    str = jSONObject.getString(dwv.KEY_SMART_FLAG);
                }
                if (this.c.mtopConfigModel == null) {
                    arc.a().c("AliDetailShopRecommendEvent", "DependencyRequestCallback.onNext", "mAsyncModule.mtopConfigModel is null");
                    return;
                }
                if (this.c.mtopConfigModel.requestData == null) {
                    this.c.mtopConfigModel.requestData = new JSONObject();
                }
                i.d(m.a(dwv.EVENT_TYPE), "detailRecommend_async secondRequest");
                JSONObject jSONObject2 = this.c.mtopConfigModel.requestData;
                JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject3.put(dwv.KEY_RECOMMEND_ITEM_ID, (Object) string);
                jSONObject2.put("flag", (Object) str);
                dwv.a(this.f27049a, this.b, this.c);
            }
        }

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            } else if (f.f()) {
                dwv.a(this.f27049a, this.b, this.c);
            } else {
                this.f27049a.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(b())), null);
            }
        }

        private com.alibaba.android.umf.datamodel.service.rule.a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("a5a1a22", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            if (this.c.r != null && this.c.r.failedCallback != null && this.c.r.failedCallback.payload != null) {
                hashMap.putAll(this.c.r.failedCallback.payload);
            }
            return bbg.a(RuleType.PROPS_WRITE_BACK, this.b, hashMap);
        }
    }

    private static void b(s sVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a15df81", new Object[]{sVar, aURARenderComponent, asyncModule});
            return;
        }
        d dVar = new d();
        dVar.a(aURARenderComponent);
        dVar.a("" + System.currentTimeMillis());
        dVar.a(avr.EVENT_EXT_PARAMS_ASYNC_MODULE, asyncModule);
        com.alibaba.android.aura.service.event.c.a(sVar, avr.EVENT_TYPE, dVar);
    }
}
