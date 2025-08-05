package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SignRequest;
import com.alipay.mobile.common.netsdkextdependapi.security.SignResult;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RpcSignUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static SignData signature(Context context, String str, boolean z, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignData) ipChange.ipc$dispatch("2d3aa621", new Object[]{context, str, new Boolean(z), str2, new Boolean(z2)});
        }
        try {
            SignRequest signRequest = new SignRequest();
            signRequest.appkey = MpaasPropertiesUtil.getAppkey(str, z, context);
            signRequest.content = str2;
            if (a(context, z2)) {
                signRequest.signType = SignRequest.SIGN_TYPE_ATLAS;
            }
            return SignData.createSignDataBySignResult(SecurityUtil.signature(signRequest));
        } catch (Throwable th) {
            LogCatUtil.warn("RpcSignUtil", th);
            return SignData.newEmptySignData();
        }
    }

    private static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue() : MiscUtils.isInAlipayClient(context) && !MiscUtils.isAlipayLocalPackage(context) && z && TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SIGN_ATLAS_OPEN), "T");
    }

    /* loaded from: classes3.dex */
    public static class SignData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @Deprecated
        public static int OPEN_ENUM_SIGN_ATLAS = SignRequest.SIGN_TYPE_ATLAS;

        /* renamed from: a  reason: collision with root package name */
        private static SignData f5634a;
        public String sign = "";
        public int signType = 0;
        public int signCost = 0;

        public static final SignData newEmptySignData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SignData) ipChange.ipc$dispatch("a1e7fe73", new Object[0]);
            }
            if (f5634a == null) {
                f5634a = new SignData();
            }
            return f5634a;
        }

        public static final SignData createSignDataBySignResult(SignResult signResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SignData) ipChange.ipc$dispatch("de2da0ec", new Object[]{signResult});
            }
            if (signResult.isSuccess()) {
                SignData signData = new SignData();
                signData.sign = signResult.sign;
                signData.signType = signResult.signType;
                return signData;
            }
            return newEmptySignData();
        }
    }
}
