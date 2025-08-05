package org.java_websocket.drafts;

import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mtopsdk.network.impl.ResponseProtocolType;
import org.java_websocket.WebSocket;
import org.java_websocket.d;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.c;
import org.java_websocket.framing.f;
import org.java_websocket.framing.i;
import tb.sbi;
import tb.sbj;
import tb.sbk;
import tb.sbl;
import tb.sbm;
import tb.sbn;
import tb.sbp;
import tb.sbq;
import tb.sbx;

/* loaded from: classes9.dex */
public abstract class Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f25079a = 1000;
    public static int b = 64;
    public WebSocket.Role c = null;
    public Framedata.Opcode d = null;

    /* loaded from: classes9.dex */
    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* loaded from: classes9.dex */
    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public abstract ByteBuffer a(Framedata framedata);

    public abstract List<Framedata> a(String str, boolean z);

    public abstract List<Framedata> a(ByteBuffer byteBuffer, boolean z);

    public abstract HandshakeState a(sbi sbiVar) throws InvalidHandshakeException;

    public abstract HandshakeState a(sbi sbiVar, sbp sbpVar) throws InvalidHandshakeException;

    public abstract sbj a(sbj sbjVar) throws InvalidHandshakeException;

    public abstract sbk a(sbi sbiVar, sbq sbqVar) throws InvalidHandshakeException;

    public abstract void a();

    public abstract void a(d dVar, Framedata framedata) throws InvalidDataException;

    public abstract CloseHandshakeType b();

    public abstract List<Framedata> c(ByteBuffer byteBuffer) throws InvalidDataException;

    public abstract Draft c();

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("9b5aa8aa", new Object[]{byteBuffer});
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b2 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b3 = byteBuffer.get();
            allocate.put(b3);
            if (b2 == 13 && b3 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b2 = b3;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e88898", new Object[]{byteBuffer});
        }
        ByteBuffer a2 = a(byteBuffer);
        if (a2 != null) {
            return sbx.a(a2.array(), 0, a2.limit());
        }
        return null;
    }

    public static sbk a(ByteBuffer byteBuffer, WebSocket.Role role) throws InvalidHandshakeException, IncompleteHandshakeException {
        sbq sbqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbk) ipChange.ipc$dispatch("4e7397ff", new Object[]{byteBuffer, role});
        }
        String b2 = b(byteBuffer);
        if (b2 == null) {
            throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
        }
        String[] split = b2.split(" ", 3);
        if (split.length != 3) {
            throw new InvalidHandshakeException();
        }
        if (role == WebSocket.Role.CLIENT) {
            if (!"101".equals(split[1])) {
                throw new InvalidHandshakeException("Invalid status code received: " + split[1] + " Status line: " + b2);
            } else if (!ProtocolVersions.HTTP_1_1.equalsIgnoreCase(split[0])) {
                throw new InvalidHandshakeException("Invalid status line received: " + split[0] + " Status line: " + b2);
            } else {
                sbq sbmVar = new sbm();
                sbq sbqVar2 = sbmVar;
                sbqVar2.a(Short.parseShort(split[1]));
                sbqVar2.a(split[2]);
                sbqVar = sbmVar;
            }
        } else if (!"GET".equalsIgnoreCase(split[0])) {
            throw new InvalidHandshakeException("Invalid request method received: " + split[0] + " Status line: " + b2);
        } else if (!ProtocolVersions.HTTP_1_1.equalsIgnoreCase(split[2])) {
            throw new InvalidHandshakeException("Invalid status line received: " + split[2] + " Status line: " + b2);
        } else {
            sbl sblVar = new sbl();
            sblVar.a(split[1]);
            sbqVar = sblVar;
        }
        String b3 = b(byteBuffer);
        while (b3 != null && b3.length() > 0) {
            String[] split2 = b3.split(":", 2);
            if (split2.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            if (sbqVar.c(split2[0])) {
                String str = split2[0];
                sbqVar.a(str, sbqVar.b(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            } else {
                sbqVar.a(split2[0], split2[1].replaceFirst("^ +", ""));
            }
            b3 = b(byteBuffer);
        }
        if (b3 == null) {
            throw new IncompleteHandshakeException();
        }
        return sbqVar;
    }

    public boolean a(sbn sbnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe6a3e7d", new Object[]{this, sbnVar})).booleanValue() : sbnVar.b("Upgrade").equalsIgnoreCase("websocket") && sbnVar.b("Connection").toLowerCase(Locale.ENGLISH).contains(LoginConstants.LOGIN_UPGRADE);
    }

    public List<Framedata> a(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        f iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("70e50a25", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        }
        if (opcode != Framedata.Opcode.BINARY && opcode != Framedata.Opcode.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.d != null) {
            iVar = new c();
        } else {
            this.d = opcode;
            if (opcode == Framedata.Opcode.BINARY) {
                iVar = new org.java_websocket.framing.a();
            } else {
                iVar = opcode == Framedata.Opcode.TEXT ? new i() : null;
            }
        }
        iVar.a(byteBuffer);
        iVar.a(z);
        try {
            iVar.c();
            if (z) {
                this.d = null;
            } else {
                this.d = opcode;
            }
            return Collections.singletonList(iVar);
        } catch (InvalidDataException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<ByteBuffer> a(sbn sbnVar, WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c39dbbcc", new Object[]{this, sbnVar, role}) : a(sbnVar, role, true);
    }

    public List<ByteBuffer> a(sbn sbnVar, WebSocket.Role role, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("597be40e", new Object[]{this, sbnVar, role, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(100);
        if (sbnVar instanceof sbi) {
            sb.append("GET ");
            sb.append(((sbi) sbnVar).a());
            sb.append(" HTTP/1.1");
        } else if (sbnVar instanceof sbp) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((sbp) sbnVar).a());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> b2 = sbnVar.b();
        while (b2.hasNext()) {
            String next = b2.next();
            String b3 = sbnVar.b(next);
            sb.append(next);
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(b3);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] b4 = sbx.b(sb.toString());
        byte[] c = z ? sbnVar.c() : null;
        if (c != null) {
            i = c.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + b4.length);
        allocate.put(b4);
        if (c != null) {
            allocate.put(c);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public sbn d(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbn) ipChange.ipc$dispatch("1f5e3c61", new Object[]{this, byteBuffer}) : a(byteBuffer, this.c);
    }

    public int a(int i) throws LimitExedeedException, InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new InvalidDataException(1002, "Negative count");
        }
        return i;
    }

    public int b(sbn sbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eced44ed", new Object[]{this, sbnVar})).intValue();
        }
        String b2 = sbnVar.b("Sec-WebSocket-Version");
        if (b2.length() > 0) {
            try {
                return new Integer(b2.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public void a(WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0130cc", new Object[]{this, role});
        } else {
            this.c = role;
        }
    }

    public WebSocket.Role d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket.Role) ipChange.ipc$dispatch("9f3fa44f", new Object[]{this}) : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : getClass().getSimpleName();
    }
}
