package mtopsdk.network.impl;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.network.domain.Request;
import tb.kge;
import tb.rym;
import tb.ryp;
import tb.ryr;

/* loaded from: classes9.dex */
public class c extends rym {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Network i;
    public Network j;
    public Network k;

    static {
        kge.a(-1984497764);
    }

    @Override // tb.ryo
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == -200;
    }

    public c(Request request, Context context) {
        super(request, context);
        if (!SwitchConfig.getInstance().isGlobalSpdySwitchOpen()) {
            if (this.j == null) {
                this.j = new HttpNetwork(this.b);
            }
            this.k = this.j;
            return;
        }
        this.i = new DegradableNetwork(this.b);
        this.k = this.i;
    }

    @Override // tb.ryn
    public void a(ryp rypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa6b2f", new Object[]{this, rypVar});
            return;
        }
        Request a2 = a();
        TBSdkLog.e("mtopsdk.ANetworkStreamCallImpl", this.h, "[enqueue]send data");
        this.d = this.k.asyncSend(ryr.a(a2), a2.q, null, new e(this, rypVar, a2.e, a2.i));
    }
}
