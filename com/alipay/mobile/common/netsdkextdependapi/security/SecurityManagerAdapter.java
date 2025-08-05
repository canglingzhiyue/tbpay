package com.alipay.mobile.common.netsdkextdependapi.security;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class SecurityManagerAdapter implements SecurityManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public String decrypt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72c54002", new Object[]{this, str}) : str == null ? "" : str;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public String encrypt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{this, str}) : str == null ? "" : str;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public String getApDid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89f21f1f", new Object[]{this}) : "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public SignResult signature(SignRequest signRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("6e8c9153", new Object[]{this, signRequest});
        }
        InnerMiscUtil.log(Level.INFO, "[SecurityManagerAdapter#signature] No signature logic implemented.");
        return SignResult.newEmptySignData();
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public byte[] encrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{this, bArr}) : bArr == null ? new byte[0] : bArr;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public byte[] encrypt(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f5ebff40", new Object[]{this, bArr, str}) : bArr == null ? new byte[0] : bArr;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public byte[] decrypt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{this, bArr}) : bArr == null ? new byte[0] : bArr;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
    public byte[] decrypt(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("b18cb518", new Object[]{this, bArr, str}) : bArr == null ? new byte[0] : bArr;
    }
}
