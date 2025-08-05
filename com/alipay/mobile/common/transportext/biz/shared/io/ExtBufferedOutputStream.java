package com.alipay.mobile.common.transportext.biz.shared.io;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class ExtBufferedOutputStream extends BufferedOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExtBufferedOutputStream extBufferedOutputStream, String str, Object... objArr) {
        if (str.hashCode() == -578249333) {
            super.flush();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ExtBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public ExtBufferedOutputStream(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            super.flush();
        }
    }
}
