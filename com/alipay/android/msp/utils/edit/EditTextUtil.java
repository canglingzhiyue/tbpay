package com.alipay.android.msp.utils.edit;

import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.verifyidentity.safepaybase.encrypt.Rsa;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class EditTextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<Integer, String> textMap = new ConcurrentHashMap();

    public void OnTextChanged(int i, String str, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4b4205", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str2 = this.textMap.get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        try {
            if (i2 < 0) {
                LogUtil.record(8, "EditTextUtil:OnTextChanged", "start<0, et=".concat(String.valueOf(str2)));
            } else if (str2.length() < i2) {
            } else {
                String substring = str2.substring(0, i2);
                String substring2 = str2.substring(i3 + i2);
                String substring3 = str.substring(i2, i4 + i2);
                Map<Integer, String> map = this.textMap;
                Integer valueOf = Integer.valueOf(i);
                map.put(valueOf, substring + substring3 + substring2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
        }
        String str = this.textMap.get(Integer.valueOf(i));
        return str == null ? "" : Rsa.encrypt(str, GlobalConstant.RSA_PUBLIC);
    }

    public void clear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
        } else {
            this.textMap.remove(Integer.valueOf(i));
        }
    }
}
