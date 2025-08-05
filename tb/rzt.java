package tb;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.network.domain.Request;

/* loaded from: classes9.dex */
public class rzt extends rym {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Network i;
    public Network j;

    @Override // tb.ryo
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == -200;
    }

    public rzt(Request request, Context context) {
        super(request, context);
        this.i = new DegradableNetwork(this.b);
        this.j = this.i;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrNetworkCallImpl", this.h, "mNetwork=DegradableNetwork in ANetworkCallImpl");
        }
    }

    @Override // tb.ryn
    public void a(ryp rypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa6b2f", new Object[]{this, rypVar});
            return;
        }
        Request a2 = a();
        this.d = this.j.asyncSend(ryr.a(a2), a2.q, null, new rzw(this, rypVar, a2.e));
    }
}
