package com.taobao.android.a11y.ability.common.mtop;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class A11yMtopClient<T, V> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private A11yMtopRequest<V> a11yMtopRequest;
    private a<T> listener;
    private Class<T> responseDataClass;

    static {
        kge.a(-1669584329);
        kge.a(-525336021);
    }

    public A11yMtopClient(A11yMtopRequest<V> a11yMtopRequest, a<T> aVar, Class<T> cls) {
        this.a11yMtopRequest = a11yMtopRequest;
        this.listener = aVar;
        this.responseDataClass = cls;
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            MtopBusiness.build((MtopRequest) this.a11yMtopRequest).mo1305reqMethod(MethodEnum.POST).registerListener((IRemoteListener) this).startRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a<T> aVar = this.listener;
        if (aVar == null) {
            return;
        }
        aVar.a(mtopResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (mtopResponse.getBytedata() == null) {
        } else {
            String str = new String(mtopResponse.getBytedata());
            if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
                return;
            }
            Object parseObject2 = JSON.parseObject(jSONObject.toJSONString(), this.responseDataClass);
            a<T> aVar = this.listener;
            if (aVar == 0) {
                return;
            }
            aVar.a((a<T>) parseObject2);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        a<T> aVar = this.listener;
        if (aVar == null) {
            return;
        }
        aVar.a(mtopResponse);
    }
}
