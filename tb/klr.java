package tb;

import anet.channel.AwcnConfig;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.net.URL;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public class klr implements klx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Request f30140a;
    private DegradableNetwork b;
    private Future<Response> c;

    @Override // tb.klx
    public void a(URL url, kly klyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7442a11f", new Object[]{this, url, klyVar});
            return;
        }
        this.f30140a = new RequestImpl(url);
        this.f30140a.setRetryTime(3);
        this.f30140a.setFollowRedirects(kly.e);
        this.f30140a.setReadTimeout(klyVar.b());
        this.f30140a.setConnectTimeout(klyVar.a());
        this.f30140a.setBizId(klyVar.f());
        this.b = new DegradableNetwork(a.c);
        try {
            a.u = AwcnConfig.getRangeBoostOpen();
            a.t = AwcnConfig.getFragmentFileLengthThreshold();
        } catch (Throwable unused) {
        }
    }

    @Override // tb.klx
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f30140a.addHeader(str, str2);
        }
    }

    @Override // tb.klx
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.f30140a.setExtProperty(str, str2);
        }
    }

    @Override // tb.klx
    public void a(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1590798", new Object[]{this, kmbVar});
        } else {
            this.c = this.b.asyncSend(this.f30140a, null, null, new kls(kmbVar));
        }
    }

    @Override // tb.klx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Future<Response> future = this.c;
        if (future == null) {
            return;
        }
        future.cancel(true);
    }
}
