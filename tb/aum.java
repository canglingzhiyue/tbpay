package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class aum<LH extends c> implements auh<LH> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-48509489);
        kge.a(163148558);
    }

    @Override // tb.aua
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        }
    }

    public String a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{this, map, str, str2});
        }
        if (map == null) {
            return str2;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            String str3 = (String) obj;
            return TextUtils.isEmpty(str3) ? str2 : str3;
        }
        return String.valueOf(obj);
    }
}
