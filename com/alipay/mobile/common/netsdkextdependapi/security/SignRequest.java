package com.alipay.mobile.common.netsdkextdependapi.security;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SignRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int SIGN_TYPE_ATLAS = 2;
    public static int SIGN_TYPE_HMAC_SHA1 = 1;
    public static int SIGN_TYPE_MD5;
    public String appkey;
    public String content;
    public int signType = SIGN_TYPE_MD5;

    public boolean isSignTypeMD5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12cae08", new Object[]{this})).booleanValue() : this.signType == SIGN_TYPE_MD5;
    }

    public boolean isSignTypeAtlas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a85cd6b5", new Object[]{this})).booleanValue() : this.signType == SIGN_TYPE_ATLAS;
    }

    public boolean isSignTypeHmacSha1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba5eb898", new Object[]{this})).booleanValue() : this.signType == SIGN_TYPE_HMAC_SHA1;
    }
}
