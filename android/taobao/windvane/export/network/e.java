package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.webkit.CookieManager;
import anet.channel.util.HttpConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCEPTENCODING = "gzip, deflate";
    public static final String ACCEPTLANGSTR = "zh-CN,zh;q=0.9,en-CN;q=0.8,en-US;q=0.7,en;q=0.6;";
    public static final String ACCEPTSTR = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";

    static {
        kge.a(1721458461);
        kge.a(-634514728);
    }

    public static /* synthetic */ void a(e eVar, Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce93225", new Object[]{eVar, request, requestCallback, handler});
        } else {
            eVar.b(request, requestCallback, handler);
        }
    }

    public void a(final Request request, final RequestCallback requestCallback, final Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddd9443", new Object[]{this, request, requestCallback, handler});
            return;
        }
        if (handler == null) {
            handler = b.a().b();
        }
        if (handler == null) {
            b(request, requestCallback, null);
        } else {
            handler.post(new Runnable() { // from class: android.taobao.windvane.export.network.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.a(e.this, request, requestCallback, handler);
                    }
                }
            });
        }
    }

    private void a(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83d09c0", new Object[]{this, request});
            return;
        }
        if (request.j() == 1) {
            request.a(HttpRequest.HEADER_ACCEPT, "image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        } else {
            request.a(HttpRequest.HEADER_ACCEPT, ACCEPTSTR);
        }
        request.a("Accept-Encoding", ACCEPTENCODING);
        request.a(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, ACCEPTLANGSTR);
        request.a(HttpConstant.USER_AGENT, UCDefaultUserAgent.VALUE);
        String str = null;
        if (1 == android.taobao.windvane.config.j.commonConfig.aM) {
            try {
                str = CookieManager.getInstance().getCookie(request.a());
            } catch (Throwable th) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG).a("getCookieError").a("url", Integer.valueOf(request.d())).a("e", th).a();
            }
        } else {
            str = com.uc.webview.export.CookieManager.getInstance().getCookie(request.a());
        }
        if (str == null) {
            return;
        }
        request.a("Cookie", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        r2 = new java.util.HashMap();
        r3 = r1.getHeader().entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r3.hasNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        r6 = r3.next();
        r7 = new java.util.ArrayList();
        r7.add(r6.getValue());
        r2.put(r6.getKey(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        r11.onResponse(200, r2);
        r11.onNetworkResponse(200, r2);
        r11.onReceiveData(r1.getData());
        r11.onFinish();
        com.taobao.android.riverlogger.e.a(com.taobao.android.riverlogger.RVLLevel.Info, android.taobao.windvane.export.network.Constants.TAG).a("zcacheHit").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, java.lang.Integer.valueOf(r10.d())).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(android.taobao.windvane.export.network.Request r10, android.taobao.windvane.export.network.RequestCallback r11, android.os.Handler r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.export.network.e.b(android.taobao.windvane.export.network.Request, android.taobao.windvane.export.network.RequestCallback, android.os.Handler):void");
    }
}
