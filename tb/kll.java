package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;

/* loaded from: classes7.dex */
public class kll implements klf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.klf
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : kmx.a(a.c, "download-sdk/tmp");
    }
}
