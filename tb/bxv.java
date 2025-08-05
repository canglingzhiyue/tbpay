package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.a;

/* loaded from: classes7.dex */
public class bxv implements ljr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ljr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.HOME_TAB_ID_DYNAMIC;
    }

    @Override // tb.ljr
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a.HOME_TAB_ID_DYNAMIC;
    }

    @Override // tb.ljr
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "Page_TMGDynamic";
    }
}
