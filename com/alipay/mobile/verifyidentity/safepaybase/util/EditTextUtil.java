package com.alipay.mobile.verifyidentity.safepaybase.util;

import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class EditTextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, String> f6058a = new ConcurrentHashMap();

    public final void a(int i, String str, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837873de", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str2 = this.f6058a.get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        try {
            String substring = str2.substring(0, i2);
            String substring2 = str2.substring(i3 + i2);
            String substring3 = str.substring(i2, i4 + i2);
            Map<Integer, String> map = this.f6058a;
            Integer valueOf = Integer.valueOf(i);
            map.put(valueOf, substring + substring3 + substring2);
        } catch (Throwable unused) {
        }
    }

    public final String a(int i, String str, String str2, EncryptRandomType encryptRandomType) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c033f", new Object[]{this, new Integer(i), str, str2, encryptRandomType});
        }
        String str4 = this.f6058a.get(Integer.valueOf(i));
        if (str4 == null) {
            return "";
        }
        if (encryptRandomType == EncryptRandomType.randombefore) {
            str3 = str2 + str4;
        } else {
            str3 = str4 + str2;
        }
        return Rsa.encrypt(str3, str);
    }

    public static String a(String str, String str2, String str3, EncryptRandomType encryptRandomType) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a88f3308", new Object[]{str, str2, str3, encryptRandomType});
        }
        if (encryptRandomType == EncryptRandomType.randombefore) {
            str4 = str3 + str;
        } else {
            str4 = str + str3;
        }
        return Rsa.encrypt(str4, str2);
    }
}
