package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.edge.observer.receiver.EdgeCashierReceiver;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cju;
import tb.cjw;
import tb.ckm;
import tb.cku;
import tb.ckx;
import tb.cla;
import tb.clb;
import tb.clc;
import tb.cld;
import tb.cle;
import tb.clg;

/* loaded from: classes3.dex */
public class APSecuritySdk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static APSecuritySdk f5211a;
    public static APSecBgCheckerInterface bgChecker;
    private static Object c = new Object();
    private static IDeviceInfo d;
    public static APSecDirInterface dirInterface;
    private static IPermissionInfo e;
    private Context b;

    /* loaded from: classes3.dex */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* loaded from: classes3.dex */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    private APSecuritySdk(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Context a(APSecuritySdk aPSecuritySdk) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e0f402fb", new Object[]{aPSecuritySdk}) : aPSecuritySdk.b;
    }

    public static IDeviceInfo getDeviceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDeviceInfo) ipChange.ipc$dispatch("8d14489a", new Object[0]) : d;
    }

    public static APSecuritySdk getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APSecuritySdk) ipChange.ipc$dispatch("1ecd7191", new Object[]{context});
        }
        if (f5211a == null) {
            synchronized (c) {
                if (f5211a == null) {
                    f5211a = new APSecuritySdk(context);
                    cle.a(context);
                    cld.a(context);
                    EdgeCashierReceiver a2 = EdgeCashierReceiver.a();
                    if (!EdgeCashierReceiver.f5277a) {
                        try {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("KEnterMiniPayViewNotification");
                            LocalBroadcastManager.getInstance(context).registerReceiver(a2, intentFilter);
                            EdgeCashierReceiver.f5277a = true;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return f5211a;
    }

    public static IPermissionInfo getPermissionInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPermissionInfo) ipChange.ipc$dispatch("5cd9c43a", new Object[0]) : e;
    }

    public static String getUtdid(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context}) : UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2466af97", new Object[]{aPSecBgCheckerInterface});
        } else {
            bgChecker = aPSecBgCheckerInterface;
        }
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e5941b", new Object[]{iDeviceInfo});
        } else {
            d = iDeviceInfo;
        }
    }

    public static void registerDirGetter(APSecDirInterface aPSecDirInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5989ac", new Object[]{aPSecDirInterface});
        } else {
            dirInterface = aPSecDirInterface;
        }
    }

    public static void registerPermissionInfo(IPermissionInfo iPermissionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768b73a9", new Object[]{iPermissionInfo});
        } else {
            e = iPermissionInfo;
        }
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
        }
        String a2 = cju.a(this.b, "");
        if (cjw.a(a2)) {
            initToken(0, new HashMap(), null);
        }
        return a2;
    }

    public String getSdkName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7bc28aa", new Object[]{this}) : "APPSecuritySDK-TAOBAO";
    }

    public String getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a69c45", new Object[]{this}) : "3.5.0.20240702";
    }

    public synchronized TokenResult getTokenResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TokenResult) ipChange.ipc$dispatch("130f8630", new Object[]{this});
        }
        TokenResult tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = cju.a(this.b, "");
            tokenResult.clientKey = clb.f(this.b);
            tokenResult.apdid = cju.a(this.b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.b);
            if (cjw.a(tokenResult.apdid) || cjw.a(tokenResult.apdidToken) || cjw.a(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        String str = "getTokenResult: " + tokenResult.apdidToken;
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d0c332", new Object[]{this, new Integer(i), map, initResultListener});
            return;
        }
        ckm.a().f26337a = i;
        String b = clb.b(this.b);
        String b2 = ckm.a().b();
        if (cjw.b(b) && !cjw.a(b, b2)) {
            cku.a(this.b);
            ckx.a(this.b);
            cla.a(this.b);
            clc.h();
        }
        if (!cjw.a(b, b2)) {
            clb.c(this.b, b2);
        }
        String a2 = cjw.a(map, "utdid", "");
        String a3 = cjw.a(map, "tid", "");
        String a4 = cjw.a(map, "userId", "");
        if (cjw.a(a2)) {
            a2 = UtdidWrapper.getUtdid(this.b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", a2);
        hashMap.put("tid", a3);
        hashMap.put("userId", a4);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put(TransportConstants.KEY_RPC_VERSION, "8");
        clg.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                new cju(APSecuritySdk.a(APSecuritySdk.this)).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
            }
        });
    }

    public boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[]{this})).booleanValue();
        }
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface == null) {
            return false;
        }
        return aPSecBgCheckerInterface.isBackgroundRunning();
    }
}
