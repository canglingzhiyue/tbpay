package com.taobao.taopai2.material.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.exception.ResponseDataException;
import io.reactivex.a;
import io.reactivex.b;
import io.reactivex.d;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.rsj;

/* loaded from: classes8.dex */
public class CompletbleRequestBuilder<A> implements IRemoteBaseListener, d, rsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteBusiness business;
    private b emitter;
    private MethodEnum method;
    private final MtopRequest request = new MtopRequest();

    static {
        kge.a(-635445827);
        kge.a(890182046);
        kge.a(-525336021);
        kge.a(2122870431);
    }

    public CompletbleRequestBuilder(A a2) {
        this.request.setData(JSON.toJSONString(a2));
    }

    public CompletbleRequestBuilder<A> setTarget(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("e4c280fa", new Object[]{this, str, str2});
        }
        this.request.setApiName(str);
        this.request.setVersion(str2);
        return this;
    }

    public CompletbleRequestBuilder<A> withoutECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("a13373f7", new Object[]{this});
        }
        this.request.setNeedEcode(false);
        return this;
    }

    public CompletbleRequestBuilder<A> withECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("74c9bd75", new Object[]{this});
        }
        this.request.setNeedEcode(true);
        return this;
    }

    public CompletbleRequestBuilder<A> withoutSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("8756b3d3", new Object[]{this});
        }
        this.request.setNeedSession(false);
        return this;
    }

    public CompletbleRequestBuilder<A> withSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("ce8095d1", new Object[]{this});
        }
        this.request.setNeedSession(true);
        return this;
    }

    public CompletbleRequestBuilder<A> useMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("f5d476ad", new Object[]{this, methodEnum});
        }
        this.method = methodEnum;
        return this;
    }

    public a toCompletable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b044972b", new Object[]{this}) : a.create(this);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.emitter.onError(new ResponseDataException(mtopResponse, "system_error_response_null"));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            this.emitter.onComplete();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.emitter.onError(new ResponseDataException(mtopResponse, "error_response_null"));
        }
    }

    public void subscribe(b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60454b57", new Object[]{this, bVar});
            return;
        }
        this.emitter = bVar;
        this.emitter.setCancellable(this);
        this.business = RemoteBusiness.build(this.request);
        if (this.method != null) {
            this.business.mtopProp.method = this.method;
        }
        this.business.registeListener((IRemoteListener) this);
        this.business.startRequest(Response.class);
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
