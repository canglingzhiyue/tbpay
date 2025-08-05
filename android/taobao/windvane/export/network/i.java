package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.extra.uc.AliRequestAdapter;
import android.taobao.windvane.extra.uc.WVUCWebView;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1353857196);
        kge.a(-634514728);
    }

    public void a(Request request, final RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddd9443", new Object[]{this, request, requestCallback, handler});
            return;
        }
        RequestImpl requestImpl = new RequestImpl(request.a());
        requestImpl.setFollowRedirects(false);
        requestImpl.setRetryTime(AliRequestAdapter.retryTimes);
        requestImpl.setConnectTimeout(AliRequestAdapter.connectTimeout);
        requestImpl.setReadTimeout(AliRequestAdapter.readTimeout);
        requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(request.a()));
        requestImpl.setMethod(request.b());
        if (request.c() != null) {
            for (Map.Entry<String, String> entry : request.c().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        new DegradableNetwork(Globals.getApplication()).asyncSend(requestImpl, request.a(), handler, new j() { // from class: android.taobao.windvane.export.network.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
            public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onResponse(i, map);
                    requestCallback.onNetworkResponse(i, map);
                }
                return false;
            }

            @Override // anetwork.channel.NetworkCallBack.ProgressListener
            public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                } else if (progressEvent == null) {
                } else {
                    byte[] bytedata = progressEvent.getBytedata();
                    int size = progressEvent.getSize();
                    if (requestCallback == null || bytedata == null) {
                        return;
                    }
                    requestCallback.onReceiveData(Arrays.copyOf(bytedata, size));
                }
            }

            @Override // anetwork.channel.NetworkCallBack.FinishListener
            public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                } else if (finishEvent == null) {
                } else {
                    int httpCode = finishEvent.getHttpCode();
                    if (httpCode < 0) {
                        String desc = finishEvent.getDesc();
                        RequestCallback requestCallback2 = requestCallback;
                        if (requestCallback2 == null) {
                            return;
                        }
                        requestCallback2.onError(httpCode, desc);
                        return;
                    }
                    RequestCallback requestCallback3 = requestCallback;
                    if (requestCallback3 == null) {
                        return;
                    }
                    requestCallback3.onFinish();
                }
            }
        });
    }
}
