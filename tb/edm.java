package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class edm extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPERATION_CLOSE = 2;
    public static final int OPERATION_OPEN = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f27211a;

    static {
        kge.a(967865722);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }
}
