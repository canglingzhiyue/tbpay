package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class gfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ggk> f28304a = new ConcurrentHashMap<>();

    static {
        kge.a(-970459197);
        kge.a(953687104);
    }

    public ggk a(String str) {
        ggk ggkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("7c6fafe9", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (ggkVar = this.f28304a.get(str)) == null) {
            return null;
        }
        return ggkVar;
    }
}
