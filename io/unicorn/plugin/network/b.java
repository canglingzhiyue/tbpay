package io.unicorn.plugin.network;

import mtopsdk.common.util.StringUtils;
import com.taobao.android.weex_framework.adapter.c;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class b implements ExternalAdapterNetworkProvider {

    /* renamed from: a  reason: collision with root package name */
    private c f24861a;

    static {
        kge.a(1446054150);
        kge.a(-918953544);
    }

    public b(c cVar) {
        this.f24861a = cVar;
    }

    @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider
    public void sendRequest(ExternalAdapterNetworkProvider.Request request, final ExternalAdapterNetworkProvider.RequestListener requestListener) {
        com.taobao.android.weex_framework.common.a aVar = new com.taobao.android.weex_framework.common.a();
        aVar.c = request.url;
        aVar.d = request.method;
        aVar.e = request.body;
        aVar.f = request.timeout;
        if (request.params != null) {
            for (Map.Entry<String, String> entry : request.params.entrySet()) {
                aVar.b.put(entry.getKey(), entry.getValue());
            }
        }
        this.f24861a.a(aVar, new c.a() { // from class: io.unicorn.plugin.network.b.1
            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a() {
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i) {
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i, Map<String, List<String>> map) {
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(com.taobao.android.weex_framework.common.b bVar) {
                int parseInt;
                if (!StringUtils.isEmpty(bVar.f15987a)) {
                    try {
                        parseInt = Integer.parseInt(bVar.f15987a);
                    } catch (NumberFormatException unused) {
                        rtd.e("DefaultNetworkProvider", "onHttpFinish statusCode:" + bVar.f15987a);
                    }
                    if (parseInt >= 200 || parseInt > 299 || bVar.b == null) {
                        requestListener.onRequestFinish(parseInt, null);
                    } else {
                        requestListener.onRequestFinish(parseInt, bVar.b);
                        return;
                    }
                }
                parseInt = 0;
                if (parseInt >= 200) {
                }
                requestListener.onRequestFinish(parseInt, null);
            }
        });
    }
}
