package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;

/* loaded from: classes.dex */
public class mpf implements mqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mqb
    public mqc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mqc) ipChange.ipc$dispatch("f07e5bf", new Object[]{this}) : a("weex_page");
    }

    public mqc a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqc) ipChange.ipc$dispatch("7c728eb5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return new mqa();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2041572495) {
            if (hashCode == 849289968 && str.equals("WindVane.UCT2")) {
                c = 1;
            }
        } else if (str.equals("WindVane.H5")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? d.g ? new mpg(str) : new mqa() : d.i ? new mpg(str) : new mqa() : d.h ? new mpg(str) : new mqa();
    }
}
