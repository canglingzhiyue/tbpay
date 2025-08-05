package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta;

import android.content.Context;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.ByteUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.PackageUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TAInterationV1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] getHeader(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7af061f", new Object[]{context});
        }
        try {
            byte[] apkKeyHashBytes = PackageUtils.getApkKeyHashBytes(context, context.getPackageName());
            byte[] bytes = context.getPackageName().getBytes();
            int length = apkKeyHashBytes.length;
            int length2 = bytes.length;
            byte[] bArr = new byte[length + 8 + 4 + length2];
            System.arraycopy(ByteUtils.toBytes(1), 0, bArr, 0, 4);
            System.arraycopy(ByteUtils.toBytes(length), 0, bArr, 4, 4);
            System.arraycopy(apkKeyHashBytes, 0, bArr, 8, length);
            int i = 8 + length;
            System.arraycopy(ByteUtils.toBytes(length2), 0, bArr, i, 4);
            System.arraycopy(bytes, 0, bArr, i + 4, length2);
            return bArr;
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return null;
        }
    }

    public static Result sendCommand(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("280e048d", new Object[]{context, new Integer(i)});
        }
        byte[] header = getHeader(context);
        if (header == null || header.length == 0) {
            return new Result(101, null);
        }
        int length = header.length;
        byte[] bArr = new byte[length + 4];
        System.arraycopy(header, 0, bArr, 0, length);
        System.arraycopy(ByteUtils.toBytes(i), 0, bArr, length + 0, 4);
        return buildResult(doSendData(context, bArr));
    }

    public static Result sendCommandAndData(Context context, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("982dc6eb", new Object[]{context, new Integer(i), bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return sendCommand(context, i);
        }
        byte[] header = getHeader(context);
        if (header == null || header.length == 0) {
            return new Result(101, null);
        }
        int length = header.length;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length + 4 + 4 + length2];
        System.arraycopy(header, 0, bArr2, 0, length);
        int i2 = length + 0;
        System.arraycopy(ByteUtils.toBytes(i), 0, bArr2, i2, 4);
        int i3 = i2 + 4;
        System.arraycopy(ByteUtils.toBytes(length2), 0, bArr2, i3, 4);
        System.arraycopy(bArr, 0, bArr2, i3 + 4, length2);
        return buildResult(doSendData(context, bArr2));
    }

    private static byte[] doSendData(Context context, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("748c5932", new Object[]{context, bArr}) : IFAAFingerprintManagerAdapter.getInstance(context).invokeCmd(bArr);
    }

    private static Result buildResult(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("6a2c52f9", new Object[]{bArr});
        }
        if (bArr == null || bArr.length < 8) {
            return new Result(101, null);
        }
        byte[] bArr2 = new byte[bArr.length - 8];
        ByteUtils.copy(bArr, 8, bArr.length - 8, bArr2, 0);
        Result result = new Result();
        result.setStatus(ByteUtils.toInt(bArr));
        result.setData(bArr2);
        return result;
    }
}
