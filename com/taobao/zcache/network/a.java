package com.taobao.zcache.network;

import android.os.RemoteException;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.j;
import com.taobao.zcache.k;
import com.taobao.zcache.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Connection b;

    static {
        kge.a(96740802);
    }

    public a(k kVar) {
        DegradableNetwork degradableNetwork = new DegradableNetwork(n.a());
        RequestImpl requestImpl = new RequestImpl(kVar.a());
        requestImpl.setBizId("ZCache");
        if (kVar.b() > 0) {
            requestImpl.setConnectTimeout(kVar.b() * 1000);
        }
        requestImpl.setFollowRedirects(true);
        requestImpl.setMethod("GET");
        if (kVar.c() != null) {
            for (Map.Entry<String, String> entry : kVar.c().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (kVar.d() != null) {
            try {
                requestImpl.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, kVar.d());
            } catch (Exception unused) {
            }
        }
        this.b = degradableNetwork.getConnection(requestImpl, null);
    }

    @Override // com.taobao.zcache.j
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        try {
            int statusCode = this.b.getStatusCode();
            if (statusCode < 0) {
                this.f23648a = new Error(statusCode, "NetworkSDK Error");
            }
            return statusCode;
        } catch (RemoteException e) {
            a(-4, e);
            return 0;
        } catch (NullPointerException e2) {
            a(-4, e2);
            return 0;
        }
    }

    @Override // com.taobao.zcache.j
    public String a(String str) {
        Map<String, List<String>> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null || (c = c()) == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        Iterator<Map.Entry<String, List<String>>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            if (key != null && lowerCase.contentEquals(key.toLowerCase())) {
                List<String> value = next.getValue();
                if (value != null && value.size() > 0) {
                    return value.get(0);
                }
            }
        }
        return null;
    }

    @Override // com.taobao.zcache.j
    public Map<String, List<String>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        try {
            return this.b.getConnHeadFields();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.taobao.zcache.j
    public InputStream d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("a0504a6e", new Object[]{this});
        }
        try {
            ParcelableInputStream inputStream = this.b.getInputStream();
            if (inputStream != null) {
                return new C1023a(inputStream);
            }
            return null;
        } catch (RemoteException e) {
            a(-5, e);
            return null;
        }
    }

    /* renamed from: com.taobao.zcache.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1023a extends InputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ParcelableInputStream f23653a;

        static {
            kge.a(-612249231);
        }

        public C1023a(ParcelableInputStream parcelableInputStream) {
            this.f23653a = parcelableInputStream;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
            }
            try {
                return this.f23653a.readByte();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
            }
            try {
                return this.f23653a.read(bArr);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
            }
            try {
                return this.f23653a.readBytes(bArr, i, i2);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
            }
            try {
                return this.f23653a.skip((int) j);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
            }
            try {
                return this.f23653a.available();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            try {
                this.f23653a.close();
            } catch (RemoteException e) {
                throw new IOException(e.getMessage(), e);
            }
        }
    }
}
