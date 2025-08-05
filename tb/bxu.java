package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.c;
import tb.lcu;

/* loaded from: classes7.dex */
public class bxu extends ncv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ncv, com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public bxu(c cVar) {
        super(cVar, "");
    }

    @Override // tb.ncv
    public lcu a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lcu) ipChange.ipc$dispatch("21b613cf", new Object[]{this, cVar, str}) : new lcu.a(new bxv()).a(new bxw(new lud(this, cVar))).a();
    }
}
