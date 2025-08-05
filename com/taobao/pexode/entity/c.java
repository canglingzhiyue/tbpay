package com.taobao.pexode.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean c;
    private FileChannel d;
    private long e;
    private FileDescriptor f;

    static {
        kge.a(-1361259716);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -868736240:
                return new Integer(super.read());
            case 85597122:
                super.rewind();
                return null;
            case 745104438:
                return new Integer(super.getBufferLength());
            case 862063607:
                return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public c(FileInputStream fileInputStream, int i) {
        super(fileInputStream, 0);
        this.d = fileInputStream.getChannel();
        try {
            this.f = fileInputStream.getFD();
        } catch (IOException unused) {
        }
        this.e = -1L;
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                this.e = fileChannel.position();
            } catch (IOException unused2) {
            }
        }
        this.c = a((IOException[]) null);
        if (!this.c) {
            a(i);
        } else if (this.f == null) {
        } else {
            resetInputType(2);
        }
    }

    private boolean a(IOException[] iOExceptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f18bd72b", new Object[]{this, iOExceptionArr})).booleanValue();
        }
        long j = this.e;
        if (j >= 0) {
            try {
                this.d.position(j);
                return true;
            } catch (IOException e) {
                if (iOExceptionArr != null && iOExceptionArr.length > 0) {
                    iOExceptionArr[0] = e;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.pexode.entity.d, com.taobao.pexode.entity.RewindableStream
    public FileDescriptor getFD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileDescriptor) ipChange.ipc$dispatch("141de563", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.pexode.entity.d, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.c) {
            return this.f18705a.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }

    @Override // com.taobao.pexode.entity.d, java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        if (this.c) {
            return this.f18705a.read();
        }
        return super.read();
    }

    @Override // com.taobao.pexode.entity.d, com.taobao.pexode.entity.RewindableStream
    public void rewind() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
        } else if (this.c) {
            if (this.b) {
                throw new IOException("cannot rewind cause file stream has been closed!");
            }
            IOException[] iOExceptionArr = new IOException[1];
            if (a(iOExceptionArr)) {
                return;
            }
            IOException iOException = iOExceptionArr[0];
            StringBuilder sb = new StringBuilder();
            sb.append("cannot rewind cause file stream reposition(");
            sb.append(this.e);
            sb.append(":");
            sb.append(this.f);
            sb.append(") failed, detail=");
            sb.append(iOException != null ? iOException.getMessage() : "null");
            sb.append(riy.AND_NOT);
            throw new IOException(sb.toString());
        } else {
            super.rewind();
        }
    }

    @Override // com.taobao.pexode.entity.d, com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
            return;
        }
        rewind();
        a(i);
    }

    @Override // com.taobao.pexode.entity.d, com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue();
        }
        try {
            if (this.d.size() > 0) {
                return (int) this.d.size();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.getBufferLength();
    }
}
