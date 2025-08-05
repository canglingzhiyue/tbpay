package com.taobao.alimama.net.core.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.ReflectUtil;
import tb.dhk;
import tb.dhl;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopRequest extends a<dhq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dhq f8438a;
    private dhl b;
    private ApiID c;

    static {
        kge.a(847315749);
    }

    public static /* synthetic */ ApiID a(MtopRequest mtopRequest, ApiID apiID) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("93778aa8", new Object[]{mtopRequest, apiID});
        }
        mtopRequest.c = apiID;
        return apiID;
    }

    public static /* synthetic */ dhq a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhq) ipChange.ipc$dispatch("ab819c25", new Object[]{mtopRequest}) : mtopRequest.f8438a;
    }

    public static /* synthetic */ dhl b(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhl) ipChange.ipc$dispatch("65f73c0b", new Object[]{mtopRequest}) : mtopRequest.b;
    }

    @Override // com.taobao.alimama.net.core.request.a
    public void a(dhq dhqVar, dhl dhlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee4a953", new Object[]{this, dhqVar, dhlVar});
            return;
        }
        this.f8438a = dhqVar;
        this.b = dhlVar;
        mtopsdk.mtop.domain.MtopRequest inputDoToMtopRequest = MtopConvert.inputDoToMtopRequest((Object) dhqVar.g());
        if (dhqVar.h() != null && !dhqVar.h().isEmpty()) {
            if (inputDoToMtopRequest.dataParams == null) {
                inputDoToMtopRequest.dataParams = new HashMap();
            }
            inputDoToMtopRequest.dataParams.putAll(dhqVar.h());
            inputDoToMtopRequest.setData(ReflectUtil.convertMapToDataStr(inputDoToMtopRequest.dataParams));
        }
        this.c = c.a().b().build(inputDoToMtopRequest, (String) null).mo1337addListener(new CommonMtopListener()).asyncRequest();
    }

    /* loaded from: classes4.dex */
    public class CommonMtopListener implements MtopCallback.MtopFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-360728538);
            kge.a(-1507658996);
        }

        private CommonMtopListener() {
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
        public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                return;
            }
            MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
            dhk dhkVar = new dhk();
            dhkVar.f26759a = mtopResponse.getRetCode();
            dhkVar.b = mtopResponse.getRetMsg();
            if (mtopResponse.isApiSuccess()) {
                dhkVar.c = MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), MtopRequest.a(MtopRequest.this).i());
            }
            if (MtopRequest.b(MtopRequest.this) != null) {
                MtopRequest.b(MtopRequest.this).a(dhkVar);
            }
            MtopRequest.a(MtopRequest.this, (ApiID) null);
        }
    }
}
