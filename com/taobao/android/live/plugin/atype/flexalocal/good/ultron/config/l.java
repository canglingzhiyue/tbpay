package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes3.dex */
public class l extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e b;

    static {
        kge.a(1537518488);
    }

    public static /* synthetic */ e a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("78a50635", new Object[]{lVar}) : lVar.b;
    }

    public l(CountDownLatch countDownLatch, boolean z) {
        super(countDownLatch, z);
        this.b = new e();
    }

    public void a(final i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab25046", new Object[]{this, iVar});
            return;
        }
        UltronConfigRequest ultronConfigRequest = new UltronConfigRequest();
        ultronConfigRequest.pageCodes = new ArrayList();
        ultronConfigRequest.pageCodes.add(this.e);
        if (hiq.b()) {
            ultronConfigRequest.domainCode = "taolivegoodsDT";
        }
        new b(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                Map<String, String> a2 = l.a(l.this).a(netBaseOutDo);
                if (a2 == null || a2.isEmpty() || !a2.containsKey(l.this.e)) {
                    his.a("UltronServerMoodel", "onSuccess, result is empty.");
                } else {
                    his.a("UltronServerMoodel", "onSuccess, has result.");
                    iVar.a(String.valueOf(a2.get(l.this.e)), ConfigSource.NETWORK);
                }
                l.this.f13826a.countDown();
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    l.this.f13826a.countDown();
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    l.this.f13826a.countDown();
                }
            }
        }).a(ultronConfigRequest, UltronServerConfigResponse.class);
    }
}
