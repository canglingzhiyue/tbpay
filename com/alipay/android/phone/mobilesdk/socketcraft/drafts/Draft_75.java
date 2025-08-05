package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.NotSendableException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* loaded from: classes3.dex */
public class Draft_75 extends Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte CR = 13;
    public static final byte END_OF_FRAME = -1;
    public static final byte LF = 10;
    public static final byte START_OF_FRAME = 0;
    public ByteBuffer e;
    public boolean c = false;
    public List<Framedata> d = new LinkedList();
    private final Random f = new Random();

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft.HandshakeState) ipChange.ipc$dispatch("e3946259", new Object[]{this, clientHandshake, serverHandshake}) : (!clientHandshake.getFieldValue("WebSocket-Origin").equals(serverHandshake.getFieldValue("Origin")) || !a(serverHandshake)) ? Draft.HandshakeState.NOT_MATCHED : Draft.HandshakeState.MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("1f6526e5", new Object[]{this, clientHandshake});
        }
        if (clientHandshake.hasFieldValue("Origin") && a(clientHandshake)) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e0b18486", new Object[]{this, framedata});
        }
        if (framedata.getOpcode() != Framedata.Opcode.TEXT) {
            throw new RuntimeException("only text frames supported");
        }
        ByteBuffer payloadData = framedata.getPayloadData();
        ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + 2);
        allocate.put((byte) 0);
        payloadData.mark();
        allocate.put(payloadData);
        payloadData.reset();
        allocate.put((byte) -1);
        allocate.flip();
        return allocate;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43a6b19b", new Object[]{this, byteBuffer, new Boolean(z)});
        }
        throw new RuntimeException("not yet implemented");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> createFrames(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be3c58c6", new Object[]{this, str, new Boolean(z)});
        }
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientHandshakeBuilder) ipChange.ipc$dispatch("8b007ef7", new Object[]{this, clientHandshakeBuilder});
        }
        clientHandshakeBuilder.put("Upgrade", "WebSocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        if (!clientHandshakeBuilder.hasFieldValue("Origin")) {
            clientHandshakeBuilder.put("Origin", a.ATOM_EXT_random + this.f.nextInt());
        }
        return clientHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("4610b284", new Object[]{this, clientHandshake, serverHandshakeBuilder});
        }
        serverHandshakeBuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverHandshakeBuilder.put("Upgrade", "WebSocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.put("WebSocket-Origin", clientHandshake.getFieldValue("Origin"));
        serverHandshakeBuilder.put("WebSocket-Location", "ws://" + clientHandshake.getFieldValue(HttpConstant.HOST) + clientHandshake.getResourceDescriptor());
        return serverHandshakeBuilder;
    }

    public List<Framedata> a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f398d93e", new Object[]{this, byteBuffer});
        }
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b == 0) {
                if (this.c) {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
                this.c = true;
            } else if (b == -1) {
                if (!this.c) {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
                ByteBuffer byteBuffer2 = this.e;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    FramedataImpl1 framedataImpl1 = new FramedataImpl1();
                    framedataImpl1.setPayload(this.e);
                    framedataImpl1.setFin(true);
                    framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
                    this.d.add(framedataImpl1);
                    this.e = null;
                    byteBuffer.mark();
                }
                this.c = false;
            } else if (!this.c) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.e;
                if (byteBuffer3 == null) {
                    this.e = createBuffer();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.e = increaseBuffer(this.e);
                }
                this.e.put(b);
            }
        }
        List<Framedata> list = this.d;
        this.d = new LinkedList();
        return list;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        List<Framedata> a2 = a(byteBuffer);
        if (a2 == null) {
            throw new InvalidDataException(1002);
        }
        return a2;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = false;
        this.e = null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft.CloseHandshakeType) ipChange.ipc$dispatch("4cdb3ae7", new Object[]{this}) : Draft.CloseHandshakeType.NONE;
    }

    public ByteBuffer createBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("11a208a4", new Object[]{this}) : ByteBuffer.allocate(INITIAL_FAMESIZE);
    }

    public ByteBuffer increaseBuffer(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2ed72989", new Object[]{this, byteBuffer});
        }
        byteBuffer.flip();
        ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(byteBuffer.capacity() << 1));
        allocate.put(byteBuffer);
        return allocate;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft copyInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft) ipChange.ipc$dispatch("b27244d", new Object[]{this}) : new Draft_75();
    }
}
