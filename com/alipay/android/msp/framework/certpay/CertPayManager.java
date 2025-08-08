package com.alipay.android.msp.framework.certpay;

import android.content.Context;
import android.content.IntentFilter;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CertPayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static CertPayManager f4689a;
    private static Context d;
    private static CertSdkPayReceiver e = new CertSdkPayReceiver();
    private HashMap<String, String> c = new HashMap<>();
    private HashMap<String, String> b = new HashMap<>();

    private CertPayManager(Context context) {
        d = context;
    }

    public static CertPayManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CertPayManager) ipChange.ipc$dispatch("6a049bc6", new Object[]{context});
        }
        if (f4689a == null) {
            f4689a = new CertPayManager(context);
        }
        return f4689a;
    }

    public void initCallBack(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7a96b0", new Object[]{this, str, str2});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.certpayresult");
        d.registerReceiver(e, intentFilter);
        this.b.put(str, str2);
    }

    public String getCallBackUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff56c61b", new Object[]{this, str}) : this.b.get(str);
    }

    public void updateCertPaySession(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e58256", new Object[]{this, str, str2});
            return;
        }
        this.c.put(str2, str);
        HashMap<String, String> hashMap = this.b;
        hashMap.put(str2, hashMap.get(str));
    }

    public String getOldSession(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1c79c2a", new Object[]{this, str}) : this.c.get(str);
    }

    public String getNewSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c46be3", new Object[]{this, str});
        }
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            String key = entry.getKey();
            if (StringUtils.equals(str, entry.getValue())) {
                return key;
            }
        }
        return "";
    }

    public static void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[0]);
            return;
        }
        try {
            if (d != null) {
                d.unregisterReceiver(e);
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        d = null;
        f4689a = null;
    }
}
