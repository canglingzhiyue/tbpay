package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.extra.uc.APIContextHelper;
import android.taobao.windvane.extra.uc.ChunkCacheRequestCallback;
import android.taobao.windvane.extra.uc.MtopSsrServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mtd;
import tb.mtj;
import tb.mtk;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-712445501);
        kge.a(-634514728);
    }

    public void a(Request request, final RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddd9443", new Object[]{this, request, requestCallback, handler});
            return;
        }
        mtd createSsrService = MtopSsrServiceFactory.createSsrService();
        if (createSsrService == null) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG, "service is null");
            return;
        }
        if (android.taobao.windvane.config.j.commonConfig.ch) {
            request.a("tb-client-context", android.taobao.windvane.util.a.b());
            String aPICallRecords = APIContextHelper.getAPICallRecords(request.a());
            if (aPICallRecords != null) {
                if (android.taobao.windvane.config.j.commonConfig.cL) {
                    try {
                        aPICallRecords = URLEncoder.encode(aPICallRecords, "UTF-8");
                    } catch (Exception e) {
                        com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG).a("encodeAPIContext").a("msg", (Object) e.getMessage()).a();
                    }
                }
                request.a("api-context", aPICallRecords);
            }
        }
        createSsrService.asyncSend(new mtj.a().a(request.a()).a(request.c()).b(request.b()).a(), new ChunkCacheRequestCallback() { // from class: android.taobao.windvane.export.network.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
            public void onCustomCallback(int i, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                    return;
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null) {
                    return;
                }
                requestCallback2.onCustomCallback(i, objArr);
            }

            @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
            public void onNetworkResponse(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                    return;
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null) {
                    return;
                }
                requestCallback2.onNetworkResponse(i, map);
            }

            @Override // tb.mtc
            public void onResponse(mtj mtjVar, int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar, new Integer(i), map});
                    return;
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null) {
                    return;
                }
                requestCallback2.onResponse(i, map);
            }

            @Override // tb.mtc
            public void onReceiveData(mtj mtjVar, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d536689", new Object[]{this, mtjVar, bArr});
                } else if (bArr == null || requestCallback == null) {
                } else {
                    requestCallback.onReceiveData(Arrays.copyOf(bArr, bArr.length));
                }
            }

            @Override // tb.mtc
            public void onError(mtj mtjVar, mtk mtkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab769ea9", new Object[]{this, mtjVar, mtkVar});
                    return;
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null || mtkVar == null) {
                    return;
                }
                requestCallback2.onError(mtkVar.f31246a, mtkVar.c);
            }

            @Override // tb.mtc
            public void onFinish(mtj mtjVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cfd81c6", new Object[]{this, mtjVar});
                    return;
                }
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null) {
                    return;
                }
                requestCallback2.onFinish();
            }
        }, handler);
    }
}
