package com.taobao.augecore.network.imp;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.network.NetworkRequest;
import com.taobao.augecore.network.NetworkResponse;
import com.taobao.augecore.network.b;
import com.taobao.augecore.network.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kaw;
import tb.kbd;

/* loaded from: classes6.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ NetworkResponse a(a aVar, MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkResponse) ipChange.ipc$dispatch("66974f3c", new Object[]{aVar, mtopResponse, baseOutDo}) : aVar.a(mtopResponse, baseOutDo);
    }

    public static /* synthetic */ void a(a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3b220c", new Object[]{aVar, mtopResponse});
        } else {
            aVar.a(mtopResponse);
        }
    }

    @Override // com.taobao.augecore.network.b
    public boolean a(final c cVar, NetworkRequest networkRequest, Handler handler, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e52acd", new Object[]{this, cVar, networkRequest, handler, cls})).booleanValue();
        }
        if (networkRequest == null) {
            if (cVar != null) {
                cVar.b(null);
            } else {
                kbd.b(kaw.LOG_TAG, "sendRequest 失败，request & listener 为 null");
            }
            return false;
        }
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, kaw.a().f29925a), networkRequest);
        build.mo1326setSocketTimeoutMilliSecond(15000);
        build.mo1312setConnectionTimeoutMilliSecond(15000);
        if (handler != null) {
            build.mo1296handler(handler);
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.augecore.network.imp.AugeMtopNetWork$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                a.a(a.this, mtopResponse);
                cVar.a(a.a(a.this, mtopResponse, baseOutDo));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.a(a.this, mtopResponse);
                cVar.b(a.a(a.this, mtopResponse, null));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.a(a.this, mtopResponse);
                cVar.b(a.a(a.this, mtopResponse, null));
            }
        }).startRequest(cls);
        return true;
    }

    private NetworkResponse a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkResponse) ipChange.ipc$dispatch("ef0ffc7b", new Object[]{this, mtopResponse, baseOutDo});
        }
        NetworkResponse networkResponse = new NetworkResponse();
        if (mtopResponse == null) {
            return networkResponse;
        }
        networkResponse.errorCode = mtopResponse.getRetCode();
        networkResponse.errorMsg = mtopResponse.getRetMsg();
        networkResponse.isSuccess = mtopResponse.isApiSuccess();
        networkResponse.pojo = baseOutDo;
        if (mtopResponse.getDataJsonObject() != null) {
            networkResponse.jsonData = mtopResponse.getDataJsonObject().toString();
        }
        return networkResponse;
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        if (mtopResponse.isApiSuccess()) {
            kbd.a(kaw.LOG_TAG, "网络请求成功");
        } else if (mtopResponse.isSessionInvalid()) {
            kbd.b(kaw.LOG_TAG, "session 失效， do autologin or login business msg = " + mtopResponse.getRetMsg());
        } else if (mtopResponse.isSystemError() || mtopResponse.isNetworkError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult() || mtopResponse.isMtopSdkError()) {
            kbd.b(kaw.LOG_TAG, "系统错误，网络错误，防刷，防雪崩 msg =" + mtopResponse.getRetMsg());
        } else {
            kbd.b(kaw.LOG_TAG, "业务错误 msg =" + mtopResponse.getRetMsg());
        }
        kbd.a(kaw.LOG_TAG, "回调所在线程：" + Thread.currentThread().getName());
    }
}
