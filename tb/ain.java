package tb;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ain extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private ParcelableInputStream f25353a;

    public ain(ParcelableInputStream parcelableInputStream) {
        this.f25353a = parcelableInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f25353a.available();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        try {
            this.f25353a.close();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f25353a.readByte();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f25353a.read(bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f25353a.readBytes(bArr, i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }
}
