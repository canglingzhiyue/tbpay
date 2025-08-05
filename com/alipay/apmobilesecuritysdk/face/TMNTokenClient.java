package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.cju;
import tb.cjw;
import tb.clg;

/* loaded from: classes3.dex */
public class TMNTokenClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TMNTokenClient f5216a;
    private Context b;

    /* loaded from: classes3.dex */
    public interface InitResultListener {
        void onResult(String str, int i);
    }

    private TMNTokenClient(Context context) {
        this.b = null;
        if (context != null) {
            this.b = context;
            return;
        }
        throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
    }

    public static /* synthetic */ Context a(TMNTokenClient tMNTokenClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("604794eb", new Object[]{tMNTokenClient}) : tMNTokenClient.b;
    }

    public static TMNTokenClient getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMNTokenClient) ipChange.ipc$dispatch("4ff1922b", new Object[]{context});
        }
        if (f5216a == null) {
            synchronized (TMNTokenClient.class) {
                if (f5216a == null) {
                    f5216a = new TMNTokenClient(context);
                }
            }
        }
        return f5216a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6f94fc", new Object[]{this, str, str2, str3, initResultListener});
            return;
        }
        if (cjw.a(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (cjw.a(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", UtdidWrapper.getUtdid(this.b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
        clg.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int a2 = new cju(TMNTokenClient.a(TMNTokenClient.this)).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (a2 == 0) {
                    initResultListener.onResult(cju.a(TMNTokenClient.a(TMNTokenClient.this), str), 0);
                } else {
                    initResultListener2.onResult("", a2);
                }
            }
        });
    }
}
