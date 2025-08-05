package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.awa;

/* loaded from: classes2.dex */
public class avz extends awa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2040753129);
    }

    public static /* synthetic */ Object ipc$super(avz avzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public avz(s sVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule, awa.a aVar) {
        this.f25648a = sVar;
        this.b = aURARenderComponent;
        this.c = asyncModule;
        this.d = aVar;
    }

    @Override // tb.awa
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AURANextRPCEndpoint a2 = a(this.c.mtopConfigModel);
        if (a2 == null) {
            arc.a().c("AURANextRPCAsyncModuleRequest", "innerHandleEvent", "bad endpoint");
        } else {
            this.f25648a.a("aura.workflow.request", new AURANextRPCIO("", a2), new a());
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

    /* loaded from: classes2.dex */
    public class a extends aqq<AURAParseIO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-42291395);
        }

        private a() {
        }

        @Override // tb.aqq
        public void a(c<AURAParseIO> cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            } else if (!(cVar.b() instanceof AURAParseIO)) {
                a(new b(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:response invalid"));
            } else {
                List<com.alibaba.android.aura.datamodel.parse.a> data = cVar.b().getData();
                if (data.isEmpty()) {
                    a(new b(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:responseDataList is empty"));
                    return;
                }
                JSONObject a2 = data.get(0).a();
                if (a2 == null) {
                    a(new b(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "AsyncRequestCallback.onNext:responseData is null"));
                } else if (avz.this.d == null) {
                } else {
                    avz.this.d.a(a2);
                }
            }
        }

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            } else if (avz.this.d == null) {
            } else {
                avz.this.d.a(bVar.a(), bVar.b());
            }
        }
    }
}
