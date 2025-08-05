package com.taobao.tbugc.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import org.json.JSONException;
import org.json.JSONObject;
import tb.jmu;
import tb.jmy;
import tb.jmz;
import tb.jna;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements jmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1739163016);
        kge.a(-1791585159);
    }

    public static /* synthetic */ jna a(a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jna) ipChange.ipc$dispatch("e128be4f", new Object[]{aVar, mtopResponse}) : aVar.a(mtopResponse);
    }

    @Override // tb.jmu
    public void a(jmz jmzVar, final jmy jmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ec5fb", new Object[]{this, jmzVar, jmyVar});
            return;
        }
        RemoteBusiness registeListener = RemoteBusiness.build(a(jmzVar)).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbugc.adapter.MtopAdapter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    jmyVar.onError(a.a(a.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    jmyVar.onSuccess(a.a(a.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    jmyVar.onError(a.a(a.this, mtopResponse));
                }
            }
        });
        registeListener.mo1303protocol(ProtocolEnum.HTTPSECURE);
        registeListener.mo1305reqMethod(MethodEnum.POST);
        if (jmzVar.f()) {
            registeListener.mo1335useWua();
        }
        registeListener.mo1340setBizId(82);
        registeListener.startRequest();
    }

    private jna a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jna) ipChange.ipc$dispatch("549f83bc", new Object[]{this, mtopResponse});
        }
        jna jnaVar = new jna();
        jnaVar.a(mtopResponse.getResponseCode());
        jnaVar.b(mtopResponse.getRetCode());
        jnaVar.c(mtopResponse.getRetMsg());
        jnaVar.a(mtopResponse);
        if (mtopResponse.getBytedata() != null) {
            try {
                jnaVar.a(new String(mtopResponse.getBytedata(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return jnaVar;
    }

    private MtopRequest a(jmz jmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d1a3580c", new Object[]{this, jmzVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(jmzVar.a());
        mtopRequest.setVersion(jmzVar.e());
        mtopRequest.setNeedEcode(jmzVar.b());
        mtopRequest.setNeedSession(jmzVar.c());
        Map<String, Serializable> d = jmzVar.d();
        if (d != null && !d.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(mtopRequest.getData());
                for (Map.Entry<String, Serializable> entry : d.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
                mtopRequest.setData(jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return mtopRequest;
    }
}
