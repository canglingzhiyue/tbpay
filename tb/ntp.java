package tb;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ntp extends ArrayMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ArrayMap<String, String> f31755a;

    public static /* synthetic */ Object ipc$super(ntp ntpVar, String str, Object... objArr) {
        if (str.hashCode() == -605927644) {
            return super.put(objArr[0], objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.util.SimpleArrayMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbe24724", new Object[]{this, obj, obj2}) : a((String) obj, (String) obj2);
    }

    static {
        kge.a(-1083318861);
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        f31755a = arrayMap;
        arrayMap.put(noa.KEY_PROPERTY, ";");
        f31755a.put("service", ",");
        f31755a.put(noa.KEY_ON_FILTER, ";");
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String str3 = f31755a.get(str);
        if (StringUtils.isEmpty(str3)) {
            return (String) super.put(str, str2);
        }
        String str4 = get(str);
        if (StringUtils.isEmpty(str4)) {
            return (String) super.put(str, str2);
        }
        return (String) super.put(str, str4 + str3 + str2);
    }
}
