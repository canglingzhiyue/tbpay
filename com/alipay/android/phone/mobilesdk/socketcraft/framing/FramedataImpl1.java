package com.alipay.android.phone.mobilesdk.socketcraft.framing;

import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;
import tb.riy;

/* loaded from: classes3.dex */
public class FramedataImpl1 implements FrameBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static byte[] b = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f5108a;
    public boolean c;
    public Framedata.Opcode d;
    public boolean e;

    public FramedataImpl1() {
    }

    public FramedataImpl1(Framedata.Opcode opcode) {
        this.d = opcode;
        this.f5108a = ByteBuffer.wrap(b);
    }

    public FramedataImpl1(Framedata framedata) {
        this.c = framedata.isFin();
        this.d = framedata.getOpcode();
        this.f5108a = framedata.getPayloadData();
        this.e = framedata.getTransfereMasked();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public boolean isFin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa7d5a8c", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public Framedata.Opcode getOpcode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Framedata.Opcode) ipChange.ipc$dispatch("c00d044b", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public boolean getTransfereMasked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50b345da", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this}) : this.f5108a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setFin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09a084", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setOptcode(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ec70b", new Object[]{this, opcode});
        } else {
            this.d = opcode;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
        } else {
            this.f5108a = byteBuffer;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setTransferemasked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9faeea", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public void append(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac1540f", new Object[]{this, framedata});
            return;
        }
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.f5108a == null) {
            this.f5108a = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.f5108a.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.f5108a;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f5108a;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.f5108a.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + this.f5108a.capacity());
                this.f5108a.flip();
                allocate.put(this.f5108a);
                allocate.put(payloadData);
                this.f5108a = allocate;
            } else {
                this.f5108a.put(payloadData);
            }
            this.f5108a.rewind();
            payloadData.reset();
        }
        this.c = framedata.isFin();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Framedata{ optcode:" + getOpcode() + ", fin:" + isFin() + ", payloadlength:[pos:" + this.f5108a.position() + ", len:" + this.f5108a.remaining() + "], payload:" + Arrays.toString(Charsetfunctions.utf8Bytes(new String(this.f5108a.array()))) + riy.BLOCK_END_STR;
    }
}
