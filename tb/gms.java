package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes.dex */
public class gms extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f28384a = ":";

    static {
        kge.a(483621925);
    }

    @Override // tb.fnl
    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        if (StringUtils.isEmpty(str)) {
            return obj;
        }
        String[] split = str.split(":");
        String str2 = null;
        if (split.length < 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (split.length > 2) {
            str2 = split[2];
        }
        String a2 = FestivalMgr.a().a(str3, str4);
        return StringUtils.isEmpty(a2) ? str2 : a2;
    }
}
