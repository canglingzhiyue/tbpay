package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.holder.n;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public final class ets extends etr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.etr
    public String b(String str, IDMComponent iDMComponent, n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4403e4", new Object[]{this, str, iDMComponent, nVar}) : str;
    }

    public static ets a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ets) ipChange.ipc$dispatch("f044ffa", new Object[0]) : new ets();
    }
}
