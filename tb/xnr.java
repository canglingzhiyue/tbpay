package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LOAD_DEFAULT_DATA", "", "LOAD_LOCAL_DATA", "LOAD_MTOP_DATA", "toSourceFrom", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "taobao_mytaobao_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOAD_DEFAULT_DATA = 1;
    public static final int LOAD_LOCAL_DATA = 2;
    public static final int LOAD_MTOP_DATA = 3;

    static {
        kge.a(1608185881);
    }

    public static final int a(xnq toSourceFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79cf0b0", new Object[]{toSourceFrom})).intValue();
        }
        q.c(toSourceFrom, "$this$toSourceFrom");
        if (toSourceFrom.b() == 1) {
            return 1;
        }
        if (toSourceFrom.b() == 2) {
            return 2;
        }
        return toSourceFrom.b() == 3 ? 3 : 0;
    }
}
