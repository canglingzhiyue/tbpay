package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class AsynApiTask implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtopResponse ERROR;
    public static final MtopResponse SUCCESS;
    public Context b;

    /* renamed from: a  reason: collision with root package name */
    public final String f10849a = "Content-Type";
    private final Handler c = new Handler(Looper.getMainLooper(), this);

    public abstract Class<? extends BaseOutDo> a();

    static {
        kge.a(-1846056399);
        kge.a(-1043440182);
        SUCCESS = new MtopResponse("SUCCESS", "调用成功");
        ERROR = new MtopResponse("ANDROID_SYS_NETWORK_ERROR", "网络请求异常");
    }

    public AsynApiTask(Context context) {
        this.b = context;
    }

    public Future a(final ApiRequest apiRequest, final Map<String, String> map, final ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("1e25027f", new Object[]{this, apiRequest, map, apiRequestListener}) : b.a(new Callable() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.AsynApiTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                }
                AsynApiTask.this.a(AsynApiTask.this.a(apiRequest, map), apiRequestListener);
                return null;
            }
        });
    }

    public MtopResponseWrapper a(ApiRequest apiRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponseWrapper) ipChange.ipc$dispatch("c45d39c4", new Object[]{this, apiRequest, map}) : new MtopResponseWrapper(a.a(apiRequest, this.b));
    }

    public void a(MtopResponseWrapper mtopResponseWrapper, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5385d81", new Object[]{this, mtopResponseWrapper, apiRequestListener});
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        obtain.setData(bundle);
        bundle.putSerializable("mtopResponse", mtopResponseWrapper);
        bundle.putSerializable("apiRequestListener", apiRequestListener);
        this.c.sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        Bundle data = message.getData();
        if (data != null) {
            b((MtopResponseWrapper) data.getSerializable("mtopResponse"), (ApiRequestListener) data.getSerializable("apiRequestListener"));
        }
        return true;
    }

    public void b(MtopResponseWrapper mtopResponseWrapper, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3866a0", new Object[]{this, mtopResponseWrapper, apiRequestListener});
        } else if (apiRequestListener == null) {
        } else {
            if (mtopResponseWrapper == null) {
                apiRequestListener.onError(ERROR);
            } else if (mtopResponseWrapper.mtopResponse != null) {
                if (mtopResponseWrapper.mtopResponse.isApiSuccess()) {
                    apiRequestListener.onSuccess(a(mtopResponseWrapper.mtopResponse));
                } else {
                    apiRequestListener.onError(mtopResponseWrapper.mtopResponse);
                }
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
                i.a("AsynApiTask", "output do is empty , http result is " + new String(mtopResponse.getBytedata(), "UTF-8"));
            } catch (Throwable unused) {
            }
            return null;
        }
        return jsonToOutputDO.mo2429getData();
    }

    /* loaded from: classes5.dex */
    public static class MtopResponseWrapper implements Serializable {
        public Object data;
        public String errorRet;
        public MtopResponse mtopResponse;
        public String originalUrl;
        public Response rawResponse;

        static {
            kge.a(552952599);
            kge.a(1028243835);
        }

        public MtopResponseWrapper() {
        }

        public MtopResponseWrapper(MtopResponse mtopResponse) {
            this.mtopResponse = mtopResponse;
        }
    }
}
