package com.alipay.security.mobile.module.http;

import android.content.Context;
import com.alipay.security.mobile.module.http.v2.IUploadV2;
import com.alipay.security.mobile.module.http.v2.RPCUploadV2Impl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UploadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static IUpload create(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUpload) ipChange.ipc$dispatch("25c3ac65", new Object[]{context, str});
        }
        if (context != null) {
            return RPCUploadImpl.getInstance(context, str);
        }
        return null;
    }

    public static IUploadV2 createV2(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploadV2) ipChange.ipc$dispatch("95a57378", new Object[]{context, str});
        }
        if (context != null) {
            return RPCUploadV2Impl.getInstance(context, str);
        }
        return null;
    }

    public static String getZhiZhiGateway() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7745e74b", new Object[0]);
        }
        return null;
    }
}
