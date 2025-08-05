package com.alipay.mobile.common.transport.http.selfencrypt;

import android.text.TextUtils;
import com.alipay.mobile.common.mpaas_crypto.Client;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Sm4Client {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Sm4Client f5575a;
    private Client b;

    public static Sm4Client getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sm4Client) ipChange.ipc$dispatch("f4e8ed67", new Object[0]);
        }
        Sm4Client sm4Client = f5575a;
        if (sm4Client != null) {
            return sm4Client;
        }
        synchronized (Sm4Client.class) {
            if (f5575a == null) {
                f5575a = new Sm4Client();
            }
        }
        return f5575a;
    }

    private Sm4Client() {
        if (!a()) {
            return;
        }
        this.b = new Client();
        this.b.init(null, null, null);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SM4_ENCRYPT), "T");
    }

    public byte[] encryptSm4(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("42a055d3", new Object[]{this, bArr, bArr2});
        }
        try {
            return !a() ? bArr2 : this.b.encryptSm4(bArr, bArr2);
        } catch (Throwable th) {
            LogCatUtil.error("Sm4Client", "encryptSm4 ex: " + th.toString());
            return null;
        }
    }

    public byte[] decryptSm4(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8bd500fb", new Object[]{this, bArr, bArr2});
        }
        try {
            return !a() ? bArr2 : this.b.decryptSm4(bArr, bArr2);
        } catch (Throwable th) {
            LogCatUtil.error("Sm4Client", "decryptSm4 ex: " + th.toString());
            return null;
        }
    }
}
