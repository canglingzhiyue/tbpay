package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.m;

/* loaded from: classes8.dex */
public class nvn implements m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1355461944);
        kge.a(1360482219);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.m
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            lar.a(str, str2);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.m
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            lar.b(str, str2);
        }
    }
}
