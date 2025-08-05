package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes.dex */
public class gmt extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1522566914);
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj}) : "time".equals(str) ? String.valueOf(SDKUtils.getCorrectionTimeMillis()) : str;
    }
}
