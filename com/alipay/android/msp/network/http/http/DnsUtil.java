package com.alipay.android.msp.network.http.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class DnsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOMAIN_GROUP = "a3";
    public static final String EGG_PAIN_IP = "0.0.0.0";
    public static final String TAG = "HTTP_DNS_DnsUtil";

    public static boolean isLogicIP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a0bcd0", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (!"0.0.0.0".equals(str.trim())) {
            return Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$").matcher(str).matches();
        }
        return true;
    }

    public static byte[] ipToBytesByReg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9d5a8738", new Object[]{str});
        }
        byte[] bArr = new byte[4];
        try {
            String[] split = str.split("\\.");
            bArr[0] = (byte) Integer.parseInt(split[0]);
            bArr[1] = (byte) Integer.parseInt(split[1]);
            bArr[2] = (byte) Integer.parseInt(split[2]);
            bArr[3] = (byte) Integer.parseInt(split[3]);
            return bArr;
        } catch (Exception unused) {
            throw new IllegalArgumentException(str + " is invalid IP");
        }
    }
}
