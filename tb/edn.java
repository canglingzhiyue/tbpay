package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class edn extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f27212a;

    static {
        kge.a(705950399);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edn(Map<String, String> map) {
        this.f27212a = map;
        emu.a("com.taobao.android.detail.core.event.definition.track.TBTrackActivityRenderedEvent");
    }
}
