package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class enx extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_TYPE_OPEN_CONTRACT_PHONE = 1;
    public static final int EVENT_TYPE_OPEN_PHONE_NUMBER_SALE = 2;

    /* renamed from: a  reason: collision with root package name */
    public Object f27482a;
    private int b;

    static {
        kge.a(-2102101714);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }
}
