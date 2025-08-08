package tb;

import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.aidl.Connection;
import com.airbnb.lottie.network.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class aio implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Connection f25354a;

    public aio(Connection connection) {
        this.f25354a = connection;
    }

    private String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof List)) {
            return "";
        }
        List list = (List) obj;
        return list.size() != 0 ? a(list.get(0)) : "";
    }

    @Override // com.airbnb.lottie.network.a
    public boolean a() {
        try {
            return this.f25354a.getStatusCode() / 100 == 2;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.a
    public InputStream b() throws IOException {
        try {
            return new ain(this.f25354a.getInputStream());
        } catch (RemoteException unused) {
            throw new IOException("remote error");
        }
    }

    @Override // com.airbnb.lottie.network.a
    public String c() {
        try {
            String a2 = a(this.f25354a.getConnHeadFields().get("content-type"));
            return StringUtils.isEmpty(a2) ? a(this.f25354a.getConnHeadFields().get("Content-Type")) : a2;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f25354a.cancel();
        } catch (RemoteException e) {
            akh.b("close error failed ", e);
            e.printStackTrace();
        }
    }

    @Override // com.airbnb.lottie.network.a
    public String d() {
        try {
            if (a()) {
                return null;
            }
            return "Unable to fetch " + this.f25354a.getDesc() + ". Failed with " + this.f25354a.getStatusCode();
        } catch (Exception e) {
            akh.b("get error failed ", e);
            return e.getMessage();
        }
    }
}
