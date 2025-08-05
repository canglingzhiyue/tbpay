package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* loaded from: classes3.dex */
public class Draft_76 extends Draft_75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final byte[] g = {-1, 0};
    private boolean f = false;
    private final Random h = new Random();

    public static /* synthetic */ Object ipc$super(Draft_76 draft_76, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -525237114) {
            if (hashCode != -208086722) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.a((ByteBuffer) objArr[0]);
        }
        return super.createBinaryFrame((Framedata) objArr[0]);
    }

    public static byte[] createChallenge(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3403bbd4", new Object[]{str, str2, bArr});
        }
        byte[] a2 = a(str);
        byte[] a3 = a(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{a2[0], a2[1], a2[2], a2[3], a3[0], a3[1], a3[2], a3[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Random random = new Random();
        long nextInt = random.nextInt(12) + 1;
        String l = Long.toString((random.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        String str = l;
        for (int i = 0; i < nextInt2; i++) {
            int abs = Math.abs(random.nextInt(str.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            str = new StringBuilder(str).insert(abs, nextInt3).toString();
        }
        for (int i2 = 0; i2 < nextInt; i2++) {
            str = new StringBuilder(str).insert(Math.abs(random.nextInt(str.length() - 1) + 1), " ").toString();
        }
        return str;
    }

    private static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = str.split(" ").length - 1;
            if (length == 0) {
                throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
            }
            long longValue = new Long(parseLong / length).longValue();
            return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("e3946259", new Object[]{this, clientHandshake, serverHandshake});
        }
        if (this.f) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        try {
            if (serverHandshake.getFieldValue("Sec-WebSocket-Origin").equals(clientHandshake.getFieldValue("Origin")) && a(serverHandshake)) {
                byte[] content = serverHandshake.getContent();
                if (content == null || content.length == 0) {
                    throw new IncompleteHandshakeException();
                }
                if (Arrays.equals(content, createChallenge(clientHandshake.getFieldValue("Sec-WebSocket-Key1"), clientHandshake.getFieldValue("Sec-WebSocket-Key2"), clientHandshake.getContent()))) {
                    return Draft.HandshakeState.MATCHED;
                }
                return Draft.HandshakeState.NOT_MATCHED;
            }
            return Draft.HandshakeState.NOT_MATCHED;
        } catch (InvalidHandshakeException e) {
            throw new RuntimeException("bad handshakerequest", e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("1f6526e5", new Object[]{this, clientHandshake});
        }
        if (clientHandshake.getFieldValue("Upgrade").equals("WebSocket") && clientHandshake.getFieldValue("Connection").contains("Upgrade") && clientHandshake.getFieldValue("Sec-WebSocket-Key1").length() > 0 && !clientHandshake.getFieldValue("Sec-WebSocket-Key2").isEmpty() && clientHandshake.hasFieldValue("Origin")) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientHandshakeBuilder) ipChange.ipc$dispatch("8b007ef7", new Object[]{this, clientHandshakeBuilder});
        }
        clientHandshakeBuilder.put("Upgrade", "WebSocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        clientHandshakeBuilder.put("Sec-WebSocket-Key1", a());
        clientHandshakeBuilder.put("Sec-WebSocket-Key2", a());
        if (!clientHandshakeBuilder.hasFieldValue("Origin")) {
            clientHandshakeBuilder.put("Origin", a.ATOM_EXT_random + this.h.nextInt());
        }
        byte[] bArr = new byte[8];
        this.h.nextBytes(bArr);
        clientHandshakeBuilder.setContent(bArr);
        return clientHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("4610b284", new Object[]{this, clientHandshake, serverHandshakeBuilder});
        }
        serverHandshakeBuilder.setHttpStatusMessage("WebSocket Protocol Handshake");
        serverHandshakeBuilder.put("Upgrade", "WebSocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.put("Sec-WebSocket-Origin", clientHandshake.getFieldValue("Origin"));
        serverHandshakeBuilder.put("Sec-WebSocket-Location", "ws://" + clientHandshake.getFieldValue(HttpConstant.HOST) + clientHandshake.getResourceDescriptor());
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key1");
        String fieldValue2 = clientHandshake.getFieldValue("Sec-WebSocket-Key2");
        byte[] content = clientHandshake.getContent();
        if (fieldValue == null || fieldValue2 == null || content == null || content.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        serverHandshakeBuilder.setContent(createChallenge(fieldValue, fieldValue2, content));
        return serverHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handshakedata) ipChange.ipc$dispatch("38203ac", new Object[]{this, byteBuffer});
        }
        HandshakeBuilder translateHandshakeHttp = translateHandshakeHttp(byteBuffer, this.f5106a);
        if ((translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Key1") || this.f5106a == WebSocket.Role.CLIENT) && !translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Version")) {
            byte[] bArr = new byte[this.f5106a == WebSocket.Role.SERVER ? 8 : 16];
            try {
                byteBuffer.get(bArr);
                translateHandshakeHttp.setContent(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return translateHandshakeHttp;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        byteBuffer.mark();
        List<Framedata> a2 = super.a(byteBuffer);
        if (a2 != null) {
            return a2;
        }
        byteBuffer.reset();
        List<Framedata> list = this.d;
        this.c = true;
        if (this.e == null) {
            this.e = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() > this.e.remaining()) {
                throw new InvalidFrameException();
            }
            this.e.put(byteBuffer);
            if (!this.e.hasRemaining()) {
                if (Arrays.equals(this.e.array(), g)) {
                    list.add(new CloseFrameBuilder(1000));
                    return list;
                }
                throw new InvalidFrameException();
            }
            this.d = new LinkedList();
            return list;
        }
        throw new InvalidFrameException();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e0b18486", new Object[]{this, framedata});
        }
        if (framedata.getOpcode() == Framedata.Opcode.CLOSING) {
            return ByteBuffer.wrap(g);
        }
        return super.createBinaryFrame(framedata);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft.CloseHandshakeType) ipChange.ipc$dispatch("4cdb3ae7", new Object[]{this}) : Draft.CloseHandshakeType.ONEWAY;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft copyInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft) ipChange.ipc$dispatch("b27244d", new Object[]{this}) : new Draft_76();
    }
}
