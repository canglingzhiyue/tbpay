package com.alipay.mobile.verifyidentity.alipay.H5Plugin;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class WindVaneInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVaneInit";

    /* renamed from: a  reason: collision with root package name */
    private static WindVaneInit f5854a;

    public static WindVaneInit getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindVaneInit) ipChange.ipc$dispatch("3046aefd", new Object[0]);
        }
        if (f5854a == null) {
            synchronized (WindVaneInit.class) {
                if (f5854a == null) {
                    f5854a = new WindVaneInit();
                }
            }
        }
        return f5854a;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        q.a("VITaoBaoJSAPIAdapter", (Class<? extends e>) VITaoBaoJSAPIAdapter.class);
        VerifyLogCat.d(TAG, "windvane 静态注册");
    }
}
