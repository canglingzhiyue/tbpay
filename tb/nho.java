package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;
import com.taobao.android.remoteso.api.assets.a;
import com.taobao.android.remoteso.api.assets.b;

/* loaded from: classes6.dex */
public class nho implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE = new nho();

    @Override // com.taobao.android.remoteso.api.assets.a
    public CheckAssetsResult a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CheckAssetsResult) ipChange.ipc$dispatch("c33ab648", new Object[]{this, str}) : new CheckAssetsResult(str, 1);
    }

    @Override // com.taobao.android.remoteso.api.assets.a
    public b b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("aaa8258d", new Object[]{this, str}) : new b(str, null, RSoException.error(1001));
    }
}
