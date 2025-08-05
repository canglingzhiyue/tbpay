package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;

/* loaded from: classes9.dex */
public class tkf extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1497353448);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("/wow/an/base/paysuccess");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("pages.tmall.com") || str.equals("pre-wormhole.wapa.tmall.com");
    }
}
