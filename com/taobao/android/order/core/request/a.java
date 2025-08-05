package com.taobao.android.order.core.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.h;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hzy;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(331293785);
    }

    public static void a(h hVar, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad81432d", new Object[]{hVar, cVar});
        } else if (hVar == null) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            String b = hVar.b();
            String d = hVar.d();
            if (TextUtils.isEmpty(b)) {
                hzy.a("MtopRequestHelper", "EVENT_CHAIN_PARAMS_VALID_ERROR", "error:  apiVersion is null");
                return;
            }
            mtopRequest.setApiName(b);
            mtopRequest.setVersion(d);
            mtopRequest.setData(JSONObject.toJSONString(hVar.n()));
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.mo1305reqMethod(MethodEnum.GET);
            build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.order.core.request.MtopRequestHelper$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 != null) {
                        cVar2.onLoadError(mtopResponse.getRetMsg(), mtopResponse, null, null);
                    }
                    UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.onLoadSuccess(mtopResponse, (DataStatus) null, (PageStatus) null);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    UnifyLog.d("MtopRequestHelper", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.onLoadError(mtopResponse.getRetMsg(), mtopResponse, null, null);
                }
            });
            hzy.a("MtopRequestHelper", "onHandleEventChain", "start execute: " + b);
            build.startRequest();
        }
    }
}
