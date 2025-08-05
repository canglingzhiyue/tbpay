package com.alipay.android.phone.mobilesdk.socketcraft.client;

import com.alipay.android.phone.mobilesdk.socketcraft.AbstractWrappedByteChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes3.dex */
public abstract class AbstractClientProxyChannel extends AbstractWrappedByteChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f5103a;

    public static /* synthetic */ Object ipc$super(AbstractClientProxyChannel abstractClientProxyChannel, String str, Object... objArr) {
        if (str.hashCode() == -1457964002) {
            return new Integer(super.write((ByteBuffer) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract String buildHandShake();

    public AbstractClientProxyChannel(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.f5103a = ByteBuffer.wrap(buildHandShake().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.AbstractWrappedByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9193c1e", new Object[]{this, byteBuffer})).intValue();
        }
        if (!this.f5103a.hasRemaining()) {
            return super.write(byteBuffer);
        }
        return super.write(this.f5103a);
    }
}
