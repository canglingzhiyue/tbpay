package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes2.dex */
public class bkh implements bkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1512215194);
        kge.a(-1237682449);
    }

    @Override // tb.bkl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        Context i = DinamicXEngine.i();
        if (i == null) {
            return null;
        }
        if (rrv.APDIDTOKEN.equals(str)) {
            try {
                return APSecuritySdk.getInstance(i).getTokenResult().apdidToken;
            } catch (Exception unused) {
                return null;
            }
        }
        if ("websiteLanguage".equals(str)) {
            try {
                return i.getResources().getConfiguration().locale.toString();
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
