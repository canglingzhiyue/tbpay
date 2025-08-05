package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes3.dex */
public abstract class Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte[] FLASH_POLICY_REQUEST = Charsetfunctions.utf8Bytes("<policy-file-request/>\u0000");
    public static int INITIAL_FAMESIZE = 64;
    public static int MAX_FAME_SIZE = 1000;

    /* renamed from: a  reason: collision with root package name */
    public WebSocket.Role f5106a = null;
    public Framedata.Opcode b = null;

    /* loaded from: classes3.dex */
    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* loaded from: classes3.dex */
    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public abstract HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake);

    public abstract HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake);

    public abstract Draft copyInstance();

    public abstract ByteBuffer createBinaryFrame(Framedata framedata);

    public abstract List<Framedata> createFrames(String str, boolean z);

    public abstract List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z);

    public abstract CloseHandshakeType getCloseHandshakeType();

    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder);

    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder);

    public abstract void reset();

    public abstract List<Framedata> translateFrame(ByteBuffer byteBuffer);

    public static ByteBuffer readLine(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("853e8901", new Object[]{byteBuffer});
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String readStringLine(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bf566d1", new Object[]{byteBuffer});
        }
        ByteBuffer readLine = readLine(byteBuffer);
        if (readLine != null) {
            return Charsetfunctions.stringAscii(readLine.array(), 0, readLine.limit());
        }
        return null;
    }

    public static HandshakeBuilder translateHandshakeHttp(ByteBuffer byteBuffer, WebSocket.Role role) {
        ServerHandshakeBuilder serverHandshakeBuilder;
        String readStringLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("2b13288", new Object[]{byteBuffer, role});
        }
        String readStringLine2 = readStringLine(byteBuffer);
        if (readStringLine2 == null) {
            throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
        }
        String[] split = readStringLine2.split(" ", 3);
        if (split.length != 3) {
            throw new InvalidHandshakeException();
        }
        if (role == WebSocket.Role.CLIENT) {
            ServerHandshakeBuilder handshakeImpl1Server = new HandshakeImpl1Server();
            ServerHandshakeBuilder serverHandshakeBuilder2 = handshakeImpl1Server;
            serverHandshakeBuilder2.setHttpStatus(Short.parseShort(split[1]));
            serverHandshakeBuilder2.setHttpStatusMessage(split[2]);
            serverHandshakeBuilder = handshakeImpl1Server;
        } else {
            HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
            handshakeImpl1Client.setResourceDescriptor(split[1]);
            serverHandshakeBuilder = handshakeImpl1Client;
        }
        while (true) {
            readStringLine = readStringLine(byteBuffer);
            if (readStringLine == null || readStringLine.length() <= 0) {
                break;
            }
            String[] split2 = readStringLine.split(":", 2);
            if (split2.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            serverHandshakeBuilder.put(split2[0], split2[1].replaceFirst("^ +", ""));
        }
        if (readStringLine == null) {
            throw new IncompleteHandshakeException();
        }
        return serverHandshakeBuilder;
    }

    public boolean a(Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6928a663", new Object[]{this, handshakedata})).booleanValue() : handshakedata.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && handshakedata.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains(LoginConstants.LOGIN_UPGRADE);
    }

    public List<Framedata> continuousFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5d3e759", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        }
        if (opcode != Framedata.Opcode.BINARY && opcode != Framedata.Opcode.TEXT && opcode != Framedata.Opcode.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.b != null) {
            this.b = Framedata.Opcode.CONTINUOUS;
        } else {
            this.b = opcode;
        }
        FramedataImpl1 framedataImpl1 = new FramedataImpl1(this.b);
        try {
            framedataImpl1.setPayload(byteBuffer);
            framedataImpl1.setFin(z);
            if (z) {
                this.b = null;
            } else {
                this.b = opcode;
            }
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("64f1a63", new Object[]{this, handshakedata, role}) : createHandshake(handshakedata, role, true);
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6cf65857", new Object[]{this, handshakedata, role, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(100);
        if (handshakedata instanceof ClientHandshake) {
            sb.append("GET ");
            sb.append(((ClientHandshake) handshakedata).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else if (handshakedata instanceof ServerHandshake) {
            sb.append("HTTP/1.1 101 " + ((ServerHandshake) handshakedata).getHttpStatusMessage());
        } else {
            throw new RuntimeException("unknow role");
        }
        sb.append("\r\n");
        Iterator<String> iterateHttpFields = handshakedata.iterateHttpFields();
        while (iterateHttpFields.hasNext()) {
            String next = iterateHttpFields.next();
            String fieldValue = handshakedata.getFieldValue(next);
            sb.append(next);
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] asciiBytes = Charsetfunctions.asciiBytes(sb.toString());
        byte[] content = z ? handshakedata.getContent() : null;
        if (content != null) {
            i = content.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + asciiBytes.length);
        allocate.put(asciiBytes);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handshakedata) ipChange.ipc$dispatch("38203ac", new Object[]{this, byteBuffer}) : translateHandshakeHttp(byteBuffer, this.f5106a);
    }

    public int checkAlloc(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2d1ac62", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new InvalidDataException(1002, "Negative count");
        }
        return i;
    }

    public void setParseMode(WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a46142", new Object[]{this, role});
        } else {
            this.f5106a = role;
        }
    }

    public WebSocket.Role getRole() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket.Role) ipChange.ipc$dispatch("cd5f2ec0", new Object[]{this}) : this.f5106a;
    }
}
