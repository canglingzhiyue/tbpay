package io.unicorn.plugin.network;

import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.l;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class ExternalAdapterNetwork {
    private static volatile ExternalAdapterNetwork INSTANCE;
    private ExternalAdapterNetworkProvider mProvider = null;

    static {
        kge.a(-561705305);
    }

    public static void finish(int i, int i2, byte[] bArr) {
        if (bArr != null) {
            notifyExternalNetworkFinish(i, i2, bArr, bArr.length);
        } else {
            notifyExternalNetworkFinish(i, i2, null, 0);
        }
    }

    public static ExternalAdapterNetwork instance() {
        if (INSTANCE == null) {
            synchronized (ExternalAdapterNetwork.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ExternalAdapterNetwork();
                }
            }
        }
        return INSTANCE;
    }

    private static native void notifyExternalNetworkFinish(int i, int i2, byte[] bArr, int i3);

    public static boolean request(final int i, String str, String str2, String str3, int i2, HashMap<String, String> hashMap) {
        ExternalAdapterNetwork instance = instance();
        if (instance == null || instance.getProvider() == null) {
            return false;
        }
        ExternalAdapterNetworkProvider.Request request = new ExternalAdapterNetworkProvider.Request();
        request.url = str;
        request.method = str2;
        request.body = str3;
        request.timeout = i2;
        if (hashMap != null) {
            request.params = hashMap;
        }
        instance.getProvider().sendRequest(request, new ExternalAdapterNetworkProvider.RequestListener() { // from class: io.unicorn.plugin.network.ExternalAdapterNetwork.1
            @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider.RequestListener
            public void onRequestFinish(int i3, byte[] bArr) {
                ExternalAdapterNetwork.finish(i, i3, bArr);
            }
        });
        return true;
    }

    public ExternalAdapterNetworkProvider getProvider() {
        return this.mProvider;
    }

    public void installDefaultProvider() {
        if (this.mProvider != null) {
            return;
        }
        c g = l.a().g();
        installProvider(g != null ? new b(g) : new a());
    }

    public void installProvider(ExternalAdapterNetworkProvider externalAdapterNetworkProvider) {
        if (externalAdapterNetworkProvider != null) {
            this.mProvider = externalAdapterNetworkProvider;
            FlutterJNI.nativeInstallFlutterExternalAdapterNetworkProvider();
        }
    }
}
