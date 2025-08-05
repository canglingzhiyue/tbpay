package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.AESUtils;
import com.ta.utdid2.android.utils.Base64;
import com.ta.utdid2.android.utils.StringUtils;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-597190157);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : AESUtils.decrypt(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String decrypt = AESUtils.decrypt(str);
        if (!StringUtils.isEmpty(decrypt)) {
            try {
                return new String(Base64.decode(decrypt, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
