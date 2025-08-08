package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class icn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] b = {"page_detail", "new_detail", flp.PRELOAD_REQUESTER_BIZ_NAME_LITE};

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, icl> f28906a = new HashMap<>();

    public icl a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icl) ipChange.ipc$dispatch("7c7089c2", new Object[]{this, str});
        }
        if (!Arrays.asList(b).contains(str)) {
            return null;
        }
        if (this.f28906a.containsKey(str)) {
            return this.f28906a.get(str);
        }
        icm icmVar = new icm();
        this.f28906a.put(str, icmVar);
        return icmVar;
    }

    public icl b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icl) ipChange.ipc$dispatch("7d1d3561", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        icl iclVar = this.f28906a.get(str);
        return iclVar != null ? iclVar : a(str);
    }
}
