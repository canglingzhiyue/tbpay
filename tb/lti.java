package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a;

/* loaded from: classes7.dex */
public class lti extends ltf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1045398323);
    }

    @Override // tb.ltf
    public int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7058d370", new Object[]{this, aVar})).intValue() : aVar.a().top;
    }
}
