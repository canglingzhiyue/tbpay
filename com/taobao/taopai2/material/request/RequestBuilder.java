package com.taobao.taopai2.material.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.base.b;
import com.taobao.taopai2.material.exception.ResponseDataException;
import io.reactivex.ad;
import io.reactivex.ae;
import io.reactivex.ag;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.qcf;
import tb.rsj;

/* loaded from: classes8.dex */
public class RequestBuilder<A extends b, R> implements IRemoteBaseListener, ag<Response<R>>, rsj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RequestBuilder";
    private RemoteBusiness business;
    private ae<Response<R>> emitter;
    private b mMaterialRequest;
    private final MtopRequest mRequest = new MtopRequest();
    private final Class<? extends Response<R>> mResponseType;
    private MethodEnum method;

    static {
        kge.a(1117161774);
        kge.a(-17493558);
        kge.a(-525336021);
        kge.a(2122870431);
    }

    public RequestBuilder(A a2, Class<? extends Response<R>> cls) {
        this.mMaterialRequest = a2;
        this.mResponseType = cls;
        this.mRequest.setData(JSON.toJSONString(a2));
    }

    public RequestBuilder<A, R> setTarget(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("8c9ee6a9", new Object[]{this, str, str2});
        }
        this.mRequest.setApiName(str);
        this.mRequest.setVersion(str2);
        return this;
    }

    public RequestBuilder<A, R> withoutECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("2db701e6", new Object[]{this});
        }
        this.mRequest.setNeedEcode(false);
        return this;
    }

    public RequestBuilder<A, R> withECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("9f1570e4", new Object[]{this});
        }
        this.mRequest.setNeedEcode(true);
        return this;
    }

    public RequestBuilder<A, R> withoutSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("229324c2", new Object[]{this});
        }
        this.mRequest.setNeedSession(false);
        return this;
    }

    public RequestBuilder<A, R> withSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("b611cc40", new Object[]{this});
        }
        this.mRequest.setNeedSession(true);
        return this;
    }

    public RequestBuilder<A, R> useMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("1143d01c", new Object[]{this, methodEnum});
        }
        this.method = methodEnum;
        return this;
    }

    public ad<Response<R>> toSingle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("c9babb7f", new Object[]{this}) : ad.create(this);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.emitter.onError(new ResponseDataException(mtopResponse, "system_error_response_null"));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            hashMap.put("ret_code", mtopResponse.getRetCode());
            hashMap.put("ret_msg", mtopResponse.getRetMsg());
            qcf.a("api", "system_error", hashMap);
            TLog.loge("RequestBuilder onSystemError", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        this.emitter.onSuccess((Response) baseOutDo);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            qcf.a("api", "success", hashMap);
            TLog.logd("RequestBuilder onSuccess", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.emitter.onError(new ResponseDataException(mtopResponse, "error_response_null"));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            hashMap.put("ret_code", mtopResponse.getRetCode());
            hashMap.put("ret_msg", mtopResponse.getRetMsg());
            qcf.a("api", "error", hashMap);
            TLog.loge("RequestBuilder onError", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    public void subscribe(ae<Response<R>> aeVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8695e13", new Object[]{this, aeVar});
            return;
        }
        this.emitter = aeVar;
        aeVar.setCancellable(this);
        this.business = RemoteBusiness.build(this.mRequest);
        if (this.method != null) {
            this.business.mtopProp.method = this.method;
        }
        this.business.registeListener((IRemoteListener) this);
        this.business.startRequest(this.mResponseType);
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.business.cancelRequest();
        }
    }
}
