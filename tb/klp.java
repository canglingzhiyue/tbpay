package tb;

import android.os.RemoteException;
import anetwork.channel.Request;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes7.dex */
public class klp implements klz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Request f30138a;
    private DegradableNetwork b;
    private Connection c;
    private ParcelableInputStream d;

    @Override // tb.klz
    public void a(URL url, kly klyVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7442a11f", new Object[]{this, url, klyVar});
            return;
        }
        this.f30138a = new RequestImpl(url);
        this.f30138a.setRetryTime(3);
        this.f30138a.setFollowRedirects(kly.e);
        this.f30138a.setReadTimeout(klyVar.b());
        this.f30138a.setConnectTimeout(klyVar.a());
        this.f30138a.setBizId(klyVar.f());
        this.b = new DegradableNetwork(a.c);
    }

    @Override // tb.klz
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f30138a.addHeader(str, str2);
        }
    }

    @Override // tb.klz
    public void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = this.b.getConnection(this.f30138a, null);
        }
    }

    @Override // tb.klz
    public int b() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c.getStatusCode();
    }

    @Override // tb.klz
    public kma c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kma) ipChange.ipc$dispatch("1e6a387d", new Object[]{this});
        }
        try {
            return new klq(g());
        } catch (RemoteException e) {
            kmv.a("Anet", "getInputStream", e, new Object[0]);
            throw new IOException("Anet");
        }
    }

    private ParcelableInputStream g() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableInputStream) ipChange.ipc$dispatch("9f969e69", new Object[]{this});
        }
        if (this.d == null) {
            this.d = this.c.getInputStream();
        }
        return this.d;
    }

    @Override // tb.klz
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        try {
            ParcelableInputStream g = g();
            if (g == null) {
                kmv.d("Anet", "getDownloadLength inputStream is null", new Object[0]);
                return 0L;
            }
            return g.length();
        } catch (RemoteException e) {
            kmv.a("Anet", "getDownloadLength", e, new Object[0]);
            return 0L;
        }
    }

    @Override // tb.klz
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c.getStatusCode());
            sb.append("\n");
            sb.append(this.c.getDesc());
            sb.append("\n");
            Map connHeadFields = this.c.getConnHeadFields();
            for (Object obj : connHeadFields.keySet()) {
                sb.append(obj);
                sb.append(":");
                sb.append(connHeadFields.get(obj));
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            kmv.a("Anet", "getErrorMsg", th, new Object[0]);
            return "";
        }
    }

    @Override // tb.klz
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.c.cancel();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
