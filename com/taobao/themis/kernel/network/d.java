package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public abstract class d<E extends RequestParams, T, D> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public E b;

    static {
        kge.a(-1533683102);
    }

    /* renamed from: configFailureResponse */
    public abstract D mo1502configFailureResponse(byte[] bArr);

    public abstract T configSuccessResponse(byte[] bArr);

    public c<T, D> execute(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("84a3512c", new Object[]{this, e});
        }
        this.b = e;
        try {
            return buildResponse(((IMtopInnerAdapter) qpt.a(IMtopInnerAdapter.class)).requestSync(e));
        } catch (Exception e2) {
            TMSLogger.b("SyncRequestClient", "execute error", e2);
            c<T, D> cVar = new c<>();
            cVar.f22556a = false;
            cVar.b = "REQUEST_UNKNOWN_ERROR";
            cVar.c = e2.getMessage();
            return cVar;
        }
    }

    public c<T, D> buildResponse(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("44c3d94c", new Object[]{this, response});
        }
        c<T, D> cVar = new c<>();
        if (response == null) {
            cVar.f22556a = false;
            cVar.b = "MTOP_RESPONSE_NULL";
            cVar.c = "网络请求异常";
            return cVar;
        } else if (response.getData() == null) {
            TMSLogger.b("[mtop]", "response data is null");
            cVar.f22556a = false;
            cVar.b = response.getErrorCode();
            cVar.c = response.getErrorMsg();
            return cVar;
        } else {
            if (response.getSuccess()) {
                cVar.f22556a = true;
                try {
                    cVar.d = configSuccessResponse(response.getRawData());
                } catch (Exception e) {
                    cVar.f22556a = false;
                    cVar.b = "MTOP_RESPONSE_JSON_PARSE_ERROR";
                    cVar.c = "网络请求异常";
                    TMSLogger.b("SyncRequestClient", "configSuccessResponse error", e);
                }
            } else {
                cVar.f22556a = false;
                cVar.b = response.getErrorCode();
                cVar.c = response.getErrorMsg();
                try {
                    cVar.e = mo1502configFailureResponse(response.getRawData());
                } catch (Exception e2) {
                    TMSLogger.b("SyncRequestClient", "configSuccessResponse error", e2);
                }
            }
            return cVar;
        }
    }
}
