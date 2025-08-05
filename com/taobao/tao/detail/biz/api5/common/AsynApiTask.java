package com.taobao.tao.detail.biz.api5.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.d;
import com.taobao.tao.detail.biz.adapter.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import tb.kge;
import tb.odu;
import tb.tpc;

/* loaded from: classes8.dex */
public abstract class AsynApiTask implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtopResponse ERROR;
    public static final MtopResponse SUCCESS;

    /* renamed from: a  reason: collision with root package name */
    public Context f19910a;
    private final Handler c = new Handler(Looper.getMainLooper(), this);
    public final String b = "Content-Type";

    public abstract Class<? extends BaseOutDo> a();

    static {
        kge.a(1607028910);
        kge.a(-1043440182);
        SUCCESS = new MtopResponse("SUCCESS", "调用成功");
        ERROR = new MtopResponse("ANDROID_SYS_NETWORK_ERROR", "网络请求异常");
    }

    public AsynApiTask(Context context) {
        this.f19910a = context;
        tpc.a("com.taobao.tao.detail.biz.api5.common.AsynApiTask");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        Bundle data = message.getData();
        if (data != null) {
            a((MtopResponseWrapper) data.getSerializable("mtopResponse"), (ApiRequestListener) data.getSerializable("apiRequestListener"));
        }
        return true;
    }

    public void a(MtopResponseWrapper mtopResponseWrapper, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f667d61", new Object[]{this, mtopResponseWrapper, apiRequestListener});
        } else if (apiRequestListener == null) {
        } else {
            if (mtopResponseWrapper == null) {
                apiRequestListener.onError(ERROR);
            } else if (mtopResponseWrapper.mtopResponse != null) {
                if (mtopResponseWrapper.mtopResponse.isApiSuccess()) {
                    apiRequestListener.onSuccess(a(mtopResponseWrapper.mtopResponse));
                    return;
                }
                apiRequestListener.onError(mtopResponseWrapper.mtopResponse);
                if (!odu.c) {
                    return;
                }
                d.a(mtopResponseWrapper);
            } else if (mtopResponseWrapper.data != null) {
                apiRequestListener.onSuccess(mtopResponseWrapper.data);
            } else {
                apiRequestListener.onError(ERROR);
            }
        }
    }

    public Object a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1a35c8a5", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || !mtopResponse.isApiSuccess() || mtopResponse.getBytedata() == null) {
            return null;
        }
        BaseOutDo jsonToOutputDO = MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), a());
        if (jsonToOutputDO == null) {
            try {
                a.a("output do is empty , http result is ", new String(mtopResponse.getBytedata(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            return null;
        }
        return jsonToOutputDO.mo2429getData();
    }

    /* loaded from: classes8.dex */
    public static class MtopResponseWrapper implements Serializable {
        public Object data;
        public String errorRet;
        public MtopResponse mtopResponse;
        public String originalUrl;
        public Response rawResponse;

        static {
            kge.a(1871194388);
            kge.a(1028243835);
        }

        public MtopResponseWrapper() {
        }

        public MtopResponseWrapper(MtopResponse mtopResponse) {
            this.mtopResponse = mtopResponse;
        }
    }
}
