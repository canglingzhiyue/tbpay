package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.c;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class efu extends eoj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27286a;
    public HashMap<String, String> b;

    static {
        kge.a(-2057862043);
    }

    public efu() {
        this.f27286a = "";
        this.b = new HashMap<>();
        emu.a("com.taobao.android.detail.core.event.trade.BuyNowEvent");
    }

    public efu(c cVar) {
        super(cVar);
        this.f27286a = "";
        this.b = new HashMap<>();
        emu.a("com.taobao.android.detail.core.event.trade.BuyNowEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.c;
    }
}
