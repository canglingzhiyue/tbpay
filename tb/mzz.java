package tb;

import android.os.RemoteException;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.aidl.Connection;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.entity.StringParam;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.f;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class mzz implements naa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Request f31352a;
    private DegradableNetwork b;
    private Connection c;
    private Map<String, String> d;

    static {
        kge.a(-749476404);
        kge.a(482126489);
    }

    @Override // tb.naa
    public void a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = new DegradableNetwork(a.g);
        this.f31352a = new RequestImpl(str);
        this.f31352a.setCharset("utf-8");
        this.f31352a.setConnectTimeout(5000);
        this.f31352a.setReadTimeout(5000);
        Map<String, String> map = this.d;
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.d.entrySet()) {
            arrayList.add(new StringParam(entry.getKey(), entry.getValue()));
        }
        this.f31352a.setParams(arrayList);
    }

    @Override // tb.naa
    public void b(String str) throws ProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.setMethod(str);
    }

    @Override // tb.naa
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.setRetryTime(i);
    }

    @Override // tb.naa
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.setFollowRedirects(z);
    }

    @Override // tb.naa
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
    }

    @Override // tb.naa
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    @Override // tb.naa
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.addHeader(str, str2);
    }

    @Override // tb.naa
    public void a(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        Request request = this.f31352a;
        if (request == null) {
            return;
        }
        request.setBodyEntry(new ByteArrayEntry(bArr));
    }

    @Override // tb.naa
    public int b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        Connection connection = this.c;
        if (connection == null) {
            return 0;
        }
        try {
            return connection.getStatusCode();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [anetwork.channel.aidl.Connection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [anetwork.channel.aidl.ParcelableInputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [anetwork.channel.aidl.ParcelableInputStream] */
    @Override // tb.naa
    public String c() throws IOException {
        Closeable closeable;
        RemoteException e;
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        ?? r0 = this.c;
        try {
            if (r0 == 0) {
                return null;
            }
            try {
                r0 = r0.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (RemoteException e2) {
                    e = e2;
                } catch (Throwable th) {
                    closeable = null;
                    th = th;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (RemoteException unused) {
                        }
                    }
                    f.a(closeable);
                    throw th;
                }
            } catch (RemoteException e3) {
                e = e3;
            } catch (Throwable th2) {
                closeable = null;
                th = th2;
                r0 = 0;
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = r0.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (RemoteException unused2) {
                    }
                }
                f.a(byteArrayOutputStream);
                return str;
            } catch (RemoteException e4) {
                e = e4;
                throw new IOException(e);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // tb.naa
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Connection connection = this.c;
        if (connection == null) {
            return null;
        }
        try {
            return connection.getConnHeadFields();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // tb.naa
    public void d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c = this.b.getConnection(this.f31352a, null);
        }
    }

    @Override // tb.naa
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            this.c.cancel();
        } catch (RemoteException unused) {
        }
    }
}
