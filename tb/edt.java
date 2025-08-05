package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class edt extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap f27219a;

    static {
        kge.a(1258814362);
    }

    public edt() {
        emu.a("com.taobao.android.detail.core.event.isv.IsvCustomEvent");
    }

    public edt(HashMap hashMap) {
        this.f27219a = hashMap;
        emu.a("com.taobao.android.detail.core.event.isv.IsvCustomEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27219a;
    }
}
