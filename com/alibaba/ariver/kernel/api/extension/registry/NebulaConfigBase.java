package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class NebulaConfigBase<T extends NebulaConfigBase<T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte mFormatVersion;

    static {
        kge.a(425346096);
    }

    public NebulaConfigBase(byte b) {
        this.mFormatVersion = (byte) 0;
        this.mFormatVersion = b;
    }

    /* renamed from: serialize */
    public T mo167serialize(BufferedOutputStream bufferedOutputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a5ba933b", new Object[]{this, bufferedOutputStream});
        }
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        return this;
    }

    /* renamed from: deserialize */
    public T mo166deserialize(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e79170d", new Object[]{this, bufferedInputStream});
        }
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        return this;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : super.hashCode();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : (obj instanceof NebulaConfigBase) && obj.hashCode() == hashCode();
    }
}
