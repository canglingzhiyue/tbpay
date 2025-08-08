package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public class rns implements rnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f33247a;
    public final Map<String, String> b;
    public final Object[] c;

    public rns(int i, Map<String, String> map, Object... objArr) {
        this.f33247a = i;
        this.b = map;
        this.c = objArr;
    }

    public rns(int i, Map<String, String> map) {
        this.f33247a = i;
        this.b = map;
        this.c = null;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f33247a;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }

    public String a(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (map = this.b) != null) {
            return map.get(str);
        }
        return null;
    }
}
