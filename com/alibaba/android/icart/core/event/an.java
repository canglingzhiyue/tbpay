package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.bff;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class an extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1646200808);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        DMEvent dMEvent = (DMEvent) bmzVar.e();
        JSONObject fields = dMEvent != null ? dMEvent.getFields() : null;
        if (fields == null) {
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(fields.getString("mtopApi"));
        mtopRequest.setVersion(fields.getString("mtopVersion"));
        mtopRequest.setData(fields.getString("mtopParams"));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1328setUnitStrategy("UNIT_TRADE");
        final bff l = this.f25791a.l();
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.ReceiveUPPSubscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null) {
                    org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    an anVar = an.this;
                    JSONObject fields2 = an.$ipChange.getFields();
                    if (dataJsonObject == null || fields2 == null) {
                        return;
                    }
                    Iterator<String> keys = dataJsonObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            fields2.put(next, dataJsonObject.get(next));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    fields2.put("linkDisable", (Object) "true");
                }
                an anVar2 = an.this;
                an.$ipChange.x().b(4);
                an anVar3 = an.this;
                an.$ipChange.a("_isSupportChangeIDMEvent", true);
                an anVar4 = an.this;
                bbz bbzVar = an.$ipChange;
                an anVar5 = an.this;
                IDMComponent iDMComponent = an.$ipChange;
                an anVar6 = an.this;
                bbzVar.a(iDMComponent, an.$ipChange, true, null, null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                l.b(2);
                if (mtopResponse == null) {
                    return;
                }
                an anVar = an.this;
                com.alibaba.android.icart.core.widget.d.a(an.$ipChange, mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        l.a(2);
        build.startRequest();
    }
}
