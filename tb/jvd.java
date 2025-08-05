package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSValue;

/* loaded from: classes6.dex */
public class jvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-826291021);
    }

    public static WeexValue[] a(MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue[]) ipChange.ipc$dispatch("768c6693", new Object[]{mUSValueArr});
        }
        if (mUSValueArr == null) {
            return null;
        }
        WeexValue[] weexValueArr = new WeexValue[mUSValueArr.length];
        for (int i = 0; i < mUSValueArr.length; i++) {
            weexValueArr[i] = mUSValueArr[i].convertWeex();
        }
        return weexValueArr;
    }
}
