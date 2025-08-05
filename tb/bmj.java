package tb;

import com.alibaba.android.ultron.trade.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class bmj extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "gradient";

    static {
        kge.a(-1877918492);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar}) : b.a(list);
    }
}
