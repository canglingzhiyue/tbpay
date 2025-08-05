package com.alipay.android.phone.mobilesdk.socketcraft.framing;

import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class CloseFrameBuilder extends FramedataImpl1 implements CloseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f5107a = ByteBuffer.allocate(0);
    private int f;
    private String g;

    public static /* synthetic */ Object ipc$super(CloseFrameBuilder closeFrameBuilder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -2128160755) {
            if (hashCode == -427074082) {
                super.setPayload((ByteBuffer) objArr[0]);
                return null;
            } else if (hashCode != 43530090) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.getPayloadData();
            }
        }
        return super.toString();
    }

    public CloseFrameBuilder() {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
    }

    public CloseFrameBuilder(int i) {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        a(i, "");
    }

    public CloseFrameBuilder(int i, String str) {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        a(i, str);
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (i == 1015) {
            str = "";
            i = 1005;
        }
        if (i == 1005) {
            if (str.length() > 0) {
                throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] utf8Bytes = Charsetfunctions.utf8Bytes(str);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(utf8Bytes.length + 2);
        allocate2.put(allocate);
        allocate2.put(utf8Bytes);
        allocate2.rewind();
        setPayload(allocate2);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = 1005;
        ByteBuffer payloadData = super.getPayloadData();
        payloadData.mark();
        if (payloadData.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(payloadData.getShort());
            allocate.position(0);
            this.f = allocate.getInt();
            int i = this.f;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f);
            }
        }
        payloadData.reset();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame
    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue() : this.f;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f == 1005) {
            this.g = Charsetfunctions.stringUtf8(super.getPayloadData());
        } else {
            ByteBuffer payloadData = super.getPayloadData();
            int position = payloadData.position();
            try {
                try {
                    payloadData.position(payloadData.position() + 2);
                    this.g = Charsetfunctions.stringUtf8(payloadData);
                } catch (IllegalArgumentException e) {
                    throw new InvalidFrameException(e);
                }
            } finally {
                payloadData.position(position);
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame
    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.g;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.f;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1, com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
            return;
        }
        super.setPayload(byteBuffer);
        a();
        b();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1, com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this});
        }
        if (this.f == 1005) {
            return f5107a;
        }
        return super.getPayloadData();
    }
}
