package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ble {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, blg> f25961a = new HashMap();

    static {
        kge.a(-545575567);
    }

    public blg a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (blg) ipChange.ipc$dispatch("7c6d7c57", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            str = "linear";
        }
        blg blgVar = this.f25961a.get(str);
        return blgVar == null ? bld.a(str) : blgVar;
    }
}
