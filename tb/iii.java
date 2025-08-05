package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* loaded from: classes6.dex */
public class iii implements iij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.iij
    public void a(iim iimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbbf86b", new Object[]{this, iimVar});
        }
    }

    @Override // tb.iij
    public void a(iim iimVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c387f8", new Object[]{this, iimVar, new Integer(i)});
        }
    }

    @Override // tb.iij
    public void a(iim iimVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbde84a", new Object[]{this, iimVar, rSoException});
        }
    }
}
