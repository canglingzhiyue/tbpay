package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class dgz implements dgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static dgw f26744a;

    static {
        kge.a(-366033692);
        kge.a(1477861336);
    }

    public dgz(dgw dgwVar) {
        f26744a = dgwVar;
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a("tanx_exposer_sdk_trace", dgy.a(), str, null, null, map);
        }
    }

    @Override // tb.dgw
    public void a(String str, int i, Object obj, Object obj2, Object obj3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7be6c00", new Object[]{this, str, new Integer(i), obj, obj2, obj3, map});
            return;
        }
        try {
            if (f26744a == null) {
                return;
            }
            f26744a.a(str, i, obj, obj2, obj3, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
