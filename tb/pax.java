package tb;

import com.ali.adapt.api.AtlasServiceFinder;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pax implements chc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(916446563);
        kge.a(-353375301);
    }

    @Override // tb.chc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(pbf.class, "com.taobao.taolive", paw.class.getName());
        }
    }
}
