package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.b;
import com.taobao.alimama.c;
import com.taobao.alimama.utils.EnvironmentUtils;

/* loaded from: classes4.dex */
public class dge implements dgf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1351196551);
        kge.a(1012980445);
    }

    @Override // tb.dgf
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!EnvironmentUtils.isInTaobao()) {
            return c.a().a(str, true, true);
        }
        return b.a().a(str);
    }
}
