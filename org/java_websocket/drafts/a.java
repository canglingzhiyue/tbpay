package org.java_websocket.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import org.android.agoo.common.AgooConstants;
import org.java_websocket.WebSocket;
import org.java_websocket.d;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.exceptions.NotSendableException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.b;
import org.java_websocket.framing.f;
import org.java_websocket.framing.i;
import tb.sbg;
import tb.sbh;
import tb.sbi;
import tb.sbj;
import tb.sbk;
import tb.sbn;
import tb.sbp;
import tb.sbq;
import tb.sbr;
import tb.sbs;
import tb.sbv;
import tb.sbx;

/* loaded from: classes9.dex */
public class a extends Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final /* synthetic */ boolean e = !a.class.desiredAssertionStatus();
    private sbh f;
    private List<sbh> g;
    private sbr h;
    private List<sbr> i;
    private Framedata j;
    private List<ByteBuffer> k;
    private ByteBuffer l;
    private final Random m;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        this(Collections.emptyList());
    }

    public a(List<sbh> list) {
        this(list, Collections.singletonList(new sbs("")));
    }

    public a(List<sbh> list, List<sbr> list2) {
        this.f = new sbg();
        this.m = new Random();
        if (list == null || list2 == null) {
            throw new IllegalArgumentException();
        }
        this.g = new ArrayList(list.size());
        this.i = new ArrayList(list2.size());
        boolean z = false;
        this.k = new ArrayList();
        for (sbh sbhVar : list) {
            if (sbhVar.getClass().equals(sbg.class)) {
                z = true;
            }
        }
        this.g.addAll(list);
        if (!z) {
            List<sbh> list3 = this.g;
            list3.add(list3.size(), this.f);
        }
        this.i.addAll(list2);
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState a(sbi sbiVar) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("6a13a447", new Object[]{this, sbiVar});
        }
        if (b(sbiVar) != 13) {
            a((Object) "acceptHandshakeAsServer - Wrong websocket version.");
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String b = sbiVar.b("Sec-WebSocket-Extensions");
        Iterator<sbh> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sbh next = it.next();
            if (next.a(b)) {
                this.f = next;
                handshakeState = Draft.HandshakeState.MATCHED;
                a((Object) ("acceptHandshakeAsServer - Matching extension found: " + this.f.toString()));
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String b2 = sbiVar.b(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL);
        Iterator<sbr> it2 = this.i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            sbr next2 = it2.next();
            if (next2.a(b2)) {
                this.h = next2;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                a((Object) ("acceptHandshakeAsServer - Matching protocol found: " + this.h.toString()));
                break;
            }
        }
        if (handshakeState2 == Draft.HandshakeState.MATCHED && handshakeState == Draft.HandshakeState.MATCHED) {
            return Draft.HandshakeState.MATCHED;
        }
        a((Object) "acceptHandshakeAsServer - No matching extension or protocol found.");
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState a(sbi sbiVar, sbp sbpVar) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("824de398", new Object[]{this, sbiVar, sbpVar});
        }
        if (!a((sbn) sbpVar)) {
            a((Object) "acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Draft.HandshakeState.NOT_MATCHED;
        } else if (!sbiVar.c("Sec-WebSocket-Key") || !sbpVar.c("Sec-WebSocket-Accept")) {
            a((Object) "acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Draft.HandshakeState.NOT_MATCHED;
        } else if (!a(sbiVar.b("Sec-WebSocket-Key")).equals(sbpVar.b("Sec-WebSocket-Accept"))) {
            a((Object) "acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Draft.HandshakeState.NOT_MATCHED;
        } else {
            Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
            String b = sbpVar.b("Sec-WebSocket-Extensions");
            Iterator<sbh> it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sbh next = it.next();
                if (next.b(b)) {
                    this.f = next;
                    handshakeState = Draft.HandshakeState.MATCHED;
                    a((Object) ("acceptHandshakeAsClient - Matching extension found: " + this.f.toString()));
                    break;
                }
            }
            Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
            String b2 = sbpVar.b(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL);
            Iterator<sbr> it2 = this.i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                sbr next2 = it2.next();
                if (next2.a(b2)) {
                    this.h = next2;
                    handshakeState2 = Draft.HandshakeState.MATCHED;
                    a((Object) ("acceptHandshakeAsClient - Matching protocol found: " + this.h.toString()));
                    break;
                }
            }
            if (handshakeState2 == Draft.HandshakeState.MATCHED && handshakeState == Draft.HandshakeState.MATCHED) {
                return Draft.HandshakeState.MATCHED;
            }
            a((Object) "acceptHandshakeAsClient - No matching extension or protocol found.");
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    public sbh e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbh) ipChange.ipc$dispatch("2dd0fdc1", new Object[]{this}) : this.f;
    }

    public List<sbh> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.g;
    }

    public sbr g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbr) ipChange.ipc$dispatch("3d3449b5", new Object[]{this}) : this.h;
    }

    public List<sbr> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.i;
    }

    @Override // org.java_websocket.drafts.Draft
    public sbj a(sbj sbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbj) ipChange.ipc$dispatch("b89d864e", new Object[]{this, sbjVar});
        }
        sbjVar.a("Upgrade", "websocket");
        sbjVar.a("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.m.nextBytes(bArr);
        sbjVar.a("Sec-WebSocket-Key", sbv.a(bArr));
        sbjVar.a("Sec-WebSocket-Version", AgooConstants.ACK_FLAG_NULL);
        StringBuilder sb = new StringBuilder();
        for (sbh sbhVar : this.g) {
            if (sbhVar.a() != null && sbhVar.a().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(sbhVar.a());
            }
        }
        if (sb.length() != 0) {
            sbjVar.a("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (sbr sbrVar : this.i) {
            if (sbrVar.a().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(sbrVar.a());
            }
        }
        if (sb2.length() != 0) {
            sbjVar.a(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL, sb2.toString());
        }
        return sbjVar;
    }

    @Override // org.java_websocket.drafts.Draft
    public sbk a(sbi sbiVar, sbq sbqVar) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbk) ipChange.ipc$dispatch("b69e2abe", new Object[]{this, sbiVar, sbqVar});
        }
        sbqVar.a("Upgrade", "websocket");
        sbqVar.a("Connection", sbiVar.b("Connection"));
        String b = sbiVar.b("Sec-WebSocket-Key");
        if (b == null) {
            throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
        }
        sbqVar.a("Sec-WebSocket-Accept", a(b));
        if (e().b().length() != 0) {
            sbqVar.a("Sec-WebSocket-Extensions", e().b());
        }
        if (g() != null && g().a().length() != 0) {
            sbqVar.a(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL, g().a());
        }
        sbqVar.a("Web Socket Protocol Handshake");
        sbqVar.a("Server", "TooTallNate Java-WebSocket");
        sbqVar.a("Date", i());
        return sbqVar;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b87c53dd", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (sbh sbhVar : f()) {
            arrayList.add(sbhVar.c());
        }
        ArrayList arrayList2 = new ArrayList();
        for (sbr sbrVar : h()) {
            arrayList2.add(sbrVar.b());
        }
        return new a(arrayList, arrayList2);
    }

    @Override // org.java_websocket.drafts.Draft
    public ByteBuffer a(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("56ab9620", new Object[]{this, framedata});
        }
        e();
        if (d.b) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("afterEnconding(");
            sb.append(framedata.d().remaining());
            sb.append("): {");
            sb.append(framedata.d().remaining() > 1000 ? "too big to display" : new String(framedata.d().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        return b(framedata);
    }

    private ByteBuffer b(Framedata framedata) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("4a3b1a61", new Object[]{this, framedata});
        }
        ByteBuffer d = framedata.d();
        boolean z = this.c == WebSocket.Role.CLIENT;
        int i2 = d.remaining() <= 125 ? 1 : d.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + d.remaining());
        byte b = Byte.MIN_VALUE;
        allocate.put((byte) (((byte) (framedata.e() ? -128 : 0)) | a(framedata.i())));
        byte[] a2 = a(d.remaining(), i2);
        if (!e && a2.length != i2) {
            throw new AssertionError();
        }
        if (i2 == 1) {
            byte b2 = a2[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i2 == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(a2);
        } else if (i2 == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(a2);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.m.nextInt());
            allocate.put(allocate2.array());
            while (d.hasRemaining()) {
                allocate.put((byte) (d.get() ^ allocate2.get(i % 4)));
                i++;
            }
        } else {
            allocate.put(d);
            d.flip();
        }
        if (!e && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }

    public Framedata e(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (Framedata) ipChange.ipc$dispatch("d91c4748", new Object[]{this, byteBuffer});
        }
        int remaining = byteBuffer.remaining();
        if (remaining < 2) {
            throw new IncompleteException(2);
        }
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & Byte.MIN_VALUE) != 0;
        int i2 = (byte) (b2 & Byte.MAX_VALUE);
        Framedata.Opcode a2 = a((byte) (b & 15));
        if (i2 < 0 || i2 > 125) {
            if (a2 == Framedata.Opcode.PING || a2 == Framedata.Opcode.PONG || a2 == Framedata.Opcode.CLOSING) {
                throw new InvalidFrameException("more than 125 octets");
            }
            if (i2 == 126) {
                if (remaining < 4) {
                    throw new IncompleteException(4);
                }
                i2 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
            } else if (remaining < 10) {
                throw new IncompleteException(10);
            } else {
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                if (longValue > 2147483647L) {
                    throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                }
                i2 = (int) longValue;
                i = 10;
            }
        }
        int i4 = i + (z5 ? 4 : 0) + i2;
        if (remaining < i4) {
            throw new IncompleteException(i4);
        }
        ByteBuffer allocate = ByteBuffer.allocate(a(i2));
        if (z5) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i5 = 0; i5 < i2; i5++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr2[i5 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(byteBuffer.position() + allocate.limit());
        }
        f a3 = f.a(a2);
        a3.a(z);
        a3.b(z2);
        a3.c(z3);
        a3.d(z4);
        allocate.flip();
        a3.a(allocate);
        e().a(a3);
        e();
        if (d.b) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("afterDecoding(");
            sb.append(a3.d().remaining());
            sb.append("): {");
            sb.append(a3.d().remaining() > 1000 ? "too big to display" : new String(a3.d().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        a3.c();
        return a3;
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> c(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cd92f40", new Object[]{this, byteBuffer});
        }
        while (true) {
            linkedList = new LinkedList();
            if (this.l == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.l.remaining();
                if (remaining2 > remaining) {
                    this.l.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.l.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(e((ByteBuffer) this.l.duplicate().position(0)));
                this.l = null;
            } catch (IncompleteException e2) {
                ByteBuffer allocate = ByteBuffer.allocate(a(e2.getPreferredSize()));
                if (!e && allocate.limit() <= this.l.limit()) {
                    throw new AssertionError();
                }
                this.l.rewind();
                allocate.put(this.l);
                this.l = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(e(byteBuffer));
            } catch (IncompleteException e3) {
                byteBuffer.reset();
                this.l = ByteBuffer.allocate(a(e3.getPreferredSize()));
                this.l.put(byteBuffer);
            }
        }
        return linkedList;
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> a(ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28e474dc", new Object[]{this, byteBuffer, new Boolean(z)});
        }
        org.java_websocket.framing.a aVar = new org.java_websocket.framing.a();
        aVar.a(byteBuffer);
        aVar.e(z);
        try {
            aVar.c();
            return Collections.singletonList(aVar);
        } catch (InvalidDataException e2) {
            throw new NotSendableException(e2);
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90524525", new Object[]{this, str, new Boolean(z)});
        }
        i iVar = new i();
        iVar.a(ByteBuffer.wrap(sbx.a(str)));
        iVar.e(z);
        try {
            iVar.c();
            return Collections.singletonList(iVar);
        } catch (InvalidDataException e2) {
            throw new NotSendableException(e2);
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l = null;
        this.f = new sbg();
        this.h = null;
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String trim = str.trim();
        try {
            return sbv.a(MessageDigest.getInstance("SHA1").digest((trim + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private byte[] a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("26271e96", new Object[]{this, new Long(j), new Integer(i)});
        }
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private byte a(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f186096b", new Object[]{this, opcode})).byteValue();
        }
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return (byte) 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return (byte) 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return (byte) 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return (byte) 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return (byte) 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + opcode.toString());
    }

    private Framedata.Opcode a(byte b) throws InvalidFrameException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata.Opcode) ipChange.ipc$dispatch("502386ab", new Object[]{this, new Byte(b)});
        }
        if (b == 0) {
            return Framedata.Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Framedata.Opcode.TEXT;
        }
        if (b == 2) {
            return Framedata.Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Framedata.Opcode.CLOSING;
            case 9:
                return Framedata.Opcode.PING;
            case 10:
                return Framedata.Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((int) b));
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public void a(d dVar, Framedata framedata) throws InvalidDataException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1674684", new Object[]{this, dVar, framedata});
            return;
        }
        Framedata.Opcode i = framedata.i();
        if (i == Framedata.Opcode.CLOSING) {
            int i2 = 1005;
            if (framedata instanceof b) {
                b bVar = (b) framedata;
                i2 = bVar.a();
                str = bVar.b();
            } else {
                str = "";
            }
            if (dVar.g() == WebSocket.READYSTATE.CLOSING) {
                dVar.b(i2, str, true);
            } else if (b() == Draft.CloseHandshakeType.TWOWAY) {
                dVar.a(i2, str, true);
            } else {
                dVar.c(i2, str, false);
            }
        } else if (i == Framedata.Opcode.PING) {
            dVar.k().onWebsocketPing(dVar, framedata);
        } else if (i == Framedata.Opcode.PONG) {
            dVar.j();
            dVar.k().onWebsocketPong(dVar, framedata);
        } else if (!framedata.e() || i == Framedata.Opcode.CONTINUOUS) {
            if (i != Framedata.Opcode.CONTINUOUS) {
                if (this.j != null) {
                    throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                }
                this.j = framedata;
                this.k.add(framedata.d());
            } else if (framedata.e()) {
                if (this.j == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                this.k.add(framedata.d());
                if (this.j.i() == Framedata.Opcode.TEXT) {
                    ((f) this.j).a(j());
                    ((f) this.j).c();
                    try {
                        dVar.k().onWebsocketMessage(dVar, sbx.a(this.j.d()));
                    } catch (RuntimeException e2) {
                        dVar.k().onWebsocketError(dVar, e2);
                    }
                } else if (this.j.i() == Framedata.Opcode.BINARY) {
                    ((f) this.j).a(j());
                    ((f) this.j).c();
                    try {
                        dVar.k().onWebsocketMessage(dVar, this.j.d());
                    } catch (RuntimeException e3) {
                        dVar.k().onWebsocketError(dVar, e3);
                    }
                }
                this.j = null;
                this.k.clear();
            } else if (this.j == null) {
                throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
            }
            if (i == Framedata.Opcode.TEXT && !sbx.b(framedata.d())) {
                throw new InvalidDataException(1007);
            }
            if (i != Framedata.Opcode.CONTINUOUS || this.j == null) {
                return;
            }
            this.k.add(framedata.d());
        } else if (this.j != null) {
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        } else {
            if (i == Framedata.Opcode.TEXT) {
                try {
                    dVar.k().onWebsocketMessage(dVar, sbx.a(framedata.d()));
                } catch (RuntimeException e4) {
                    dVar.k().onWebsocketError(dVar, e4);
                }
            } else if (i == Framedata.Opcode.BINARY) {
                try {
                    dVar.k().onWebsocketMessage(dVar, framedata.d());
                } catch (RuntimeException e5) {
                    dVar.k().onWebsocketError(dVar, e5);
                }
            } else {
                throw new InvalidDataException(1002, "non control or continious frame expected");
            }
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft.CloseHandshakeType) ipChange.ipc$dispatch("bf96b61d", new Object[]{this}) : Draft.CloseHandshakeType.TWOWAY;
    }

    @Override // org.java_websocket.drafts.Draft
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String draft = super.toString();
        if (e() != null) {
            draft = draft + " extension: " + e().toString();
        }
        if (g() == null) {
            return draft;
        }
        return draft + " protocol: " + g().toString();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            sbh sbhVar = this.f;
            if (sbhVar == null ? aVar.f != null : !sbhVar.equals(aVar.f)) {
                return false;
            }
            sbr sbrVar = this.h;
            if (sbrVar != null) {
                return sbrVar.equals(aVar.h);
            }
            if (aVar.h == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        sbh sbhVar = this.f;
        int hashCode = (sbhVar != null ? sbhVar.hashCode() : 0) * 31;
        sbr sbrVar = this.h;
        if (sbrVar != null) {
            i = sbrVar.hashCode();
        }
        return hashCode + i;
    }

    private ByteBuffer j() throws LimitExedeedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("dad1cab2", new Object[]{this});
        }
        long j = 0;
        for (ByteBuffer byteBuffer : this.k) {
            j += byteBuffer.limit();
        }
        if (j > 2147483647L) {
            throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) j);
        for (ByteBuffer byteBuffer2 : this.k) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }

    private static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else if (!d.b) {
        } else {
            System.out.println(obj);
        }
    }
}
