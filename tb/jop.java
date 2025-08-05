package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1539047320);
    }

    public static void a(Map<String, List<b>> map) {
        List<b> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, List<b>> entry : map.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    for (b bVar : value) {
                        if (bVar != null) {
                            bVar.record();
                        }
                    }
                }
            }
        }
    }

    public static void b(Map<String, List<b>> map) {
        List<b> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, List<b>> entry : map.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    for (b bVar : value) {
                        if (bVar != null) {
                            bVar.rollBack();
                        }
                    }
                }
            }
        }
    }
}
