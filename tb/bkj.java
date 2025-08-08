package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.a;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bkj implements bkl<IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1111801731);
        kge.a(-1237682449);
    }

    @Override // tb.bkl
    public Object a(String str, IDMComponent iDMComponent) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f8431510", new Object[]{this, str, iDMComponent});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().split(",");
        if (split.length != 2 || StringUtils.isEmpty(split[0]) || (a2 = a.a(split[0], iDMComponent)) == null) {
            return null;
        }
        return a.a(split[1], a2.getData());
    }
}
