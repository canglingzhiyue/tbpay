package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.event.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class mmd implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final mmd f31107a = new mmd();
    private final Map<String, mmc<?, ?>> b = new HashMap();

    private mmd() {
        EventCenter.a().b(3).a(this);
    }

    public static mmd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mmd) ipChange.ipc$dispatch("f07d6da", new Object[0]) : f31107a;
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (i != 3) {
        } else {
            Iterator<Map.Entry<String, mmc<?, ?>>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, mmc<?, ?>> next = it.next();
                if (StringUtils.equals(String.valueOf(map.get(next.getKey())), "off")) {
                    next.getValue().g();
                    it.remove();
                }
            }
        }
    }

    public void a(String str, mmc<?, ?> mmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ada2ff", new Object[]{this, str, mmcVar});
        } else {
            this.b.put(str, mmcVar);
        }
    }
}
