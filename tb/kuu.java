package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ak;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes.dex */
public class kuu implements ak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1038182760);
        kge.a(1055115039);
    }

    @Override // com.taobao.android.dinamicx.ak
    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : SDKUtils.getCorrectionTimeMillis();
    }
}
