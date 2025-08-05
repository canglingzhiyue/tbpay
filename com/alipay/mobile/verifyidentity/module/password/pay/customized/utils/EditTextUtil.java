package com.alipay.mobile.verifyidentity.module.password.pay.customized.utils;

import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class EditTextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, String> f5927a = new ConcurrentHashMap();

    public void OnTextChanged(int i, String str, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4b4205", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str2 = this.f5927a.get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        try {
            String substring = str2.substring(0, i2);
            String substring2 = str2.substring(i3 + i2, str2.length());
            String substring3 = str.substring(i2, i4 + i2);
            Map<Integer, String> map = this.f5927a;
            Integer valueOf = Integer.valueOf(i);
            map.put(valueOf, substring + substring3 + substring2);
        } catch (Throwable unused) {
        }
    }

    public String getText(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)}) : RsaUtils.encryptPassword(this.f5927a.get(Integer.valueOf(i)));
    }

    public String getText(int i, String str, String str2, EncryptRandomType encryptRandomType) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4272a01", new Object[]{this, new Integer(i), str, str2, encryptRandomType});
        }
        String str4 = this.f5927a.get(Integer.valueOf(i));
        if (str4 == null) {
            return "";
        }
        if (encryptRandomType == EncryptRandomType.randombefore) {
            str3 = str2 + str4;
        } else {
            str3 = str4 + str2;
        }
        return RsaUtils.encryptAlpay(str3, str);
    }

    public void clear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
        } else {
            this.f5927a.remove(Integer.valueOf(i));
        }
    }
}
