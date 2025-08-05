package com.alipay.android.msp.utils.net;

import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class LogicUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] getEncryptedData(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9ab4bfed", new Object[]{str, bArr});
        }
        byte[] encryptToByteArray = Rsa.encryptToByteArray(str, MspConfig.getInstance().getRsaPublicKey());
        byte[] encrypt = TriDesCBC.encrypt(str, bArr);
        String num = Integer.toString(encryptToByteArray.length);
        if (num.length() < 5) {
            num = "00000".substring(num.length()) + num;
        }
        String num2 = Integer.toString(encrypt.length);
        if (num2.length() < 5) {
            num2 = "00000".substring(num2.length()) + num2;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(num.getBytes());
            dataOutputStream.write(encryptToByteArray);
            dataOutputStream.write(num2.getBytes());
            dataOutputStream.write(encrypt);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }
}
