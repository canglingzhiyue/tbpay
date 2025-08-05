package com.taobao.phenix.compat.mtop;

import android.os.RemoteException;
import android.text.TextUtils;
import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class d extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ParcelableInputStream f18910a;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(ParcelableInputStream parcelableInputStream) {
        this.f18910a = parcelableInputStream;
    }

    private boolean a(Exception exc) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd91d322", new Object[]{this, exc})).booleanValue() : !TextUtils.isEmpty(exc.getMessage()) && exc.getMessage().contains("await timeout");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        try {
            return this.f18910a.readByte();
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        try {
            return this.f18910a.read(bArr);
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return this.f18910a.readBytes(bArr, i, i2);
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
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
            this.f18910a.close();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }
}
