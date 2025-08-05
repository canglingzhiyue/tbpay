package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.Socket;
import org.apache.http.impl.conn.DefaultClientConnection;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

/* loaded from: classes3.dex */
public class ZDefaultClientConnection extends DefaultClientConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean mShutdownZ = false;

    public static /* synthetic */ Object ipc$super(ZDefaultClientConnection zDefaultClientConnection, String str, Object... objArr) {
        if (str.hashCode() == 457600989) {
            super.shutdown();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionOutputBuffer) ipChange.ipc$dispatch("ac1b3861", new Object[]{this, socket, new Integer(i), httpParams});
        }
        try {
            return new ZHttpClientSocketOutputBuffer(socket, i, httpParams);
        } catch (Throwable unused) {
            return new SocketOutputBuffer(socket, i, httpParams);
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.mShutdownZ = true;
        super.shutdown();
    }

    public boolean isShutdownZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1359e45", new Object[]{this})).booleanValue() : this.mShutdownZ;
    }

    public void setShutdownZ(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656189eb", new Object[]{this, new Boolean(z)});
        } else {
            this.mShutdownZ = z;
        }
    }
}
