package com.taobao.pexode.entity;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class RewindableStream extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mInputType;

    static {
        kge.a(-513201838);
    }

    public abstract byte[] getBuffer();

    public abstract int getBufferLength();

    public abstract int getBufferOffset();

    public abstract FileDescriptor getFD();

    public abstract void rewind() throws IOException;

    public abstract void rewindAndSetBufferSize(int i) throws IOException;

    public RewindableStream(int i) {
        this.mInputType = i;
    }

    public final int getInputType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue() : this.mInputType;
    }

    public void resetInputType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95742e7", new Object[]{this, new Integer(i)});
        } else {
            this.mInputType = i;
        }
    }

    public void back2StreamType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4310576c", new Object[]{this});
        } else {
            this.mInputType = 3;
        }
    }
}
