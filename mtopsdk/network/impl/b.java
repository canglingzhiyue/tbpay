package mtopsdk.network.impl;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MockResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.Request;
import tb.kge;
import tb.rym;
import tb.ryp;
import tb.ryr;
import tb.tms;

/* loaded from: classes.dex */
public class b extends rym {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Network i;
    public Network j;
    public Network k;

    static {
        kge.a(91972220);
    }

    @Override // tb.ryo
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == -200;
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe467a5a", new Object[]{bVar}) : bVar.h;
    }

    public b(Request request, Context context) {
        super(request, context);
        if (!SwitchConfig.getInstance().isGlobalSpdySwitchOpen()) {
            if (this.j == null) {
                this.j = new HttpNetwork(this.b);
            }
            this.k = this.j;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.h, "mNetwork=HttpNetwork in ANetworkCallImpl");
            return;
        }
        this.i = new DegradableNetwork(this.b);
        this.k = this.i;
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.h, "mNetwork=DegradableNetwork in ANetworkCallImpl");
    }

    @Override // tb.ryn
    public void a(final ryp rypVar) {
        MockResponse mockResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa6b2f", new Object[]{this, rypVar});
            return;
        }
        Request a2 = a();
        if (!f || !e) {
            mockResponse = null;
        } else {
            mockResponse = a(a2.r);
            if (mockResponse != null) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.h, "[enqueue]get MockResponse succeed.mockResponse=" + mockResponse);
                }
                final mtopsdk.network.domain.b a3 = a(a2, mockResponse.statusCode, null, mockResponse.headers, mockResponse.byteData, null);
                MtopSDKThreadPoolExecutorFactory.submitCallbackTask(this.h != null ? this.h.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            rypVar.onResponse(b.this, a3);
                        } catch (Exception e) {
                            TBSdkLog.e("mtopsdk.ANetworkCallImpl", b.a(b.this), "[enqueue]call NetworkCallback.onResponse error.", e);
                        }
                    }
                });
                return;
            }
        }
        if (mockResponse != null) {
            return;
        }
        tms.a("mtop_sendRequest", this.h);
        this.d = this.k.asyncSend(ryr.a(a2), a2.q, null, new d(this, rypVar, a2.e));
        tms.b();
    }
}
