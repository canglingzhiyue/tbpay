package tb;

import android.taobao.windvane.config.j;
import android.taobao.windvane.monitor.f;
import android.taobao.windvane.packageapp.zipapp.utils.a;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.util.Log;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcache.n;
import com.taobao.zcache.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class aed implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aed f25282a;
    private static long b;
    private String c = aed.class.getSimpleName();

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : b;
    }

    static {
        kge.a(-1008696302);
        kge.a(1845411121);
        b = 20L;
    }

    public static aed getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aed) ipChange.ipc$dispatch("200ca474", new Object[0]);
        }
        if (f25282a == null) {
            synchronized (aed.class) {
                if (f25282a == null) {
                    f25282a = new aed();
                }
            }
        }
        return f25282a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Map] */
    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        ZCacheResourceResponse zCacheResourceResponse;
        String str;
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (aejVar == null) {
            return new ael(false);
        }
        if (i == 1004 || i == 1008) {
            try {
                i2 = ((Integer) (i == 1004 ? objArr[0] : objArr[1])).intValue();
            } catch (Throwable th) {
                m.e(this.c, "onEvent: 获取内核状态出错");
                th.printStackTrace();
            }
            if (i2 == 1 || i2 == 3) {
                j.a();
                b = j.commonConfig.az;
            } else {
                j.a();
                b = j.commonConfig.aA;
            }
            o.a().b();
            aejVar.b = p.d(aejVar.b);
            HashMap hashMap = new HashMap();
            if (i == 1008) {
                try {
                    hashMap = (Map) objArr[0];
                } catch (Throwable th2) {
                    Log.e(this.c, "onEvent: 获取header失败！");
                    th2.printStackTrace();
                }
            }
            j.a();
            String str2 = null;
            if (!j.commonConfig.ay) {
                try {
                    zCacheResourceResponse = com.taobao.zcache.p.a().a(aejVar.b, hashMap);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    zCacheResourceResponse = null;
                }
            } else {
                final a aVar = new a();
                ResourceRequest resourceRequest = new ResourceRequest(aejVar.b, hashMap);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final long currentTimeMillis = System.currentTimeMillis();
                try {
                    n.a(resourceRequest, new ResourceResponseCallback() { // from class: tb.aed.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.zcache.ResourceResponseCallback
                        public void finish(ResourceResponse resourceResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9b4c3406", new Object[]{this, resourceResponse});
                                return;
                            }
                            try {
                                aVar.wrapZCacheResourceResponse(resourceResponse);
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                            countDownLatch.countDown();
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (!aVar.zCacheResourceResponse.isSuccess || currentTimeMillis2 <= aed.a()) {
                                if (!aVar.zCacheResourceResponse.isSuccess) {
                                    return;
                                }
                                android.taobao.windvane.monitor.a.commitSuccess(android.taobao.windvane.monitor.a.MONITOR_POINT_ZCACHE_RESPONSE_TIME_OUT, "ZCache请求在正常时限内返回");
                                return;
                            }
                            android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_ZCACHE_RESPONSE_TIME_OUT, 0, "ZCache请求超时, 用时：" + currentTimeMillis2, null);
                        }
                    });
                    countDownLatch.await(b, TimeUnit.MILLISECONDS);
                } catch (Throwable th4) {
                    Log.e(this.c, "onEvent: 异步等待发生错误！");
                    th4.printStackTrace();
                }
                zCacheResourceResponse = aVar.zCacheResourceResponse;
            }
            if (zCacheResourceResponse == null) {
                m.c("ZCache", "H5 use ZCache 3.0, url=[" + aejVar.b + "], with response:[false]");
                return new ael(false);
            }
            m.c("ZCache", "H5 use ZCache 3.0, url=[" + aejVar.b + "] with response:[" + zCacheResourceResponse.isSuccess + riy.ARRAY_END_STR);
            j.a();
            if (!j.commonConfig.aB || zCacheResourceResponse.headers == null || !zCacheResourceResponse.headers.containsKey("Content-Type")) {
                str = null;
            } else {
                str = zCacheResourceResponse.headers.get("Content-Type");
                if (str.contains("text/html")) {
                    str = "text/html";
                }
                m.e("ZCache", "mimeType= " + str);
            }
            android.taobao.windvane.webview.o oVar = new android.taobao.windvane.webview.o(str != null ? str : zCacheResourceResponse.mimeType, zCacheResourceResponse.encoding, zCacheResourceResponse.inputStream, zCacheResourceResponse.headers);
            oVar.f = zCacheResourceResponse.status;
            oVar.e = zCacheResourceResponse.zcacheInfo;
            if (android.taobao.windvane.monitor.o.getWvzCacheMonitorInterface() != null) {
                if (hashMap != null) {
                    str2 = (String) hashMap.get(HttpConstant.REFERER);
                }
                f.InterfaceC0020f wvzCacheMonitorInterface = android.taobao.windvane.monitor.o.getWvzCacheMonitorInterface();
                String str3 = aejVar.b;
                if (str2 == null) {
                    str2 = "unknown";
                }
                boolean z = zCacheResourceResponse.isSuccess;
                if (str == null) {
                    str = zCacheResourceResponse.mimeType;
                }
                wvzCacheMonitorInterface.onZCacheResponse(str3, str2, z, str);
            }
            return new ael(true, oVar);
        }
        return new ael(false);
    }
}
