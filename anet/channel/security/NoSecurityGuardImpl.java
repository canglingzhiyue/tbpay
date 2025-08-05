package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class NoSecurityGuardImpl implements ISecurity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appSecret;

    static {
        kge.a(369192948);
        kge.a(1077262201);
    }

    @Override // anet.channel.security.ISecurity
    public String aesDecryptStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1e42fb2", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public String aesEncryptStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4951748a", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("dc83da2e", new Object[]{this, context, str, str2, bArr});
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("73ce7e47", new Object[]{this, context, str});
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04a6db3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bcb5388", new Object[]{this, context, str, bArr})).booleanValue();
        }
        return false;
    }

    public NoSecurityGuardImpl(String str) {
        this.appSecret = null;
        this.appSecret = str;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a1d97e", new Object[]{this, context, str, str2, str3});
        }
        if (TextUtils.isEmpty(this.appSecret) || !ISecurity.SIGN_ALGORITHM_HMAC_SHA1.equalsIgnoreCase(str)) {
            return null;
        }
        return HMacUtil.hmacSha1Hex(this.appSecret.getBytes(), str3.getBytes());
    }
}
