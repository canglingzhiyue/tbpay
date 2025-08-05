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
public class DeviceTokenClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DeviceTokenClient f5214a;
    private Context b;

    /* loaded from: classes3.dex */
    public interface InitResultListener {
        void onResult(String str, int i);
    }

    private DeviceTokenClient(Context context) {
        this.b = null;
        if (context != null) {
            this.b = context;
            return;
        }
        throw new IllegalArgumentException("DeviceTokenClient initialization error: context is null.");
    }

    public static /* synthetic */ Context a(DeviceTokenClient deviceTokenClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5c227078", new Object[]{deviceTokenClient}) : deviceTokenClient.b;
    }

    public static DeviceTokenClient getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenClient) ipChange.ipc$dispatch("4979bce", new Object[]{context});
        }
        if (f5214a == null) {
            synchronized (DeviceTokenClient.class) {
                if (f5214a == null) {
                    f5214a = new DeviceTokenClient(context);
                }
            }
        }
        return f5214a;
    }

    public void initToken(final String str, String str2, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f087b07", new Object[]{this, str, str2, initResultListener});
        } else if (cjw.a(str)) {
            if (initResultListener == null) {
                return;
            }
            initResultListener.onResult("", 2);
        } else if (cjw.a(str2)) {
            if (initResultListener == null) {
                return;
            }
            initResultListener.onResult("", 3);
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("utdid", UtdidWrapper.getUtdid(this.b));
            hashMap.put("tid", "");
            hashMap.put("userId", "");
            hashMap.put("appName", str);
            hashMap.put("appKeyClient", str2);
            hashMap.put("appchannel", "openapi");
            hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
            clg.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.DeviceTokenClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int a2 = new cju(DeviceTokenClient.a(DeviceTokenClient.this)).a(hashMap);
                    InitResultListener initResultListener2 = initResultListener;
                    if (initResultListener2 == null) {
                        return;
                    }
                    if (a2 == 0) {
                        initResultListener.onResult(cju.a(DeviceTokenClient.a(DeviceTokenClient.this), str), 0);
                    } else {
                        initResultListener2.onResult("", a2);
                    }
                }
            });
        }
    }
}
