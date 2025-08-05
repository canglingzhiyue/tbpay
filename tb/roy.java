package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.alibaba.security.realidentity.f3;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class roy implements rom, roo, rox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger g = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private row f33289a;
    private ron e;
    private Handler f;
    private final d i;
    private ArrayList<rny> b = new ArrayList<>();
    private ArrayList<b> c = new ArrayList<>();
    private ArrayList<a> d = new ArrayList<>();
    private final int h = hashCode();

    /* loaded from: classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f33290a;
        public final roy b;
        public final Object[] c;

        public a(int i, roy royVar, Object... objArr) {
            this.f33290a = i;
            this.b = royVar;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.f33290a) {
                case 1:
                    this.b.c((rop) this.c[0]);
                    return;
                case 2:
                    this.b.d((rop) this.c[0]);
                    return;
                case 3:
                    roy royVar = this.b;
                    Object[] objArr = this.c;
                    royVar.b((rop) objArr[0], (rov) objArr[1]);
                    return;
                case 4:
                    roy royVar2 = this.b;
                    Object[] objArr2 = this.c;
                    royVar2.b((rop) objArr2[0], (roq) objArr2[1]);
                    return;
                case 5:
                    roy royVar3 = this.b;
                    Object[] objArr3 = this.c;
                    royVar3.a((rop) objArr3[0], ((Integer) objArr3[1]).intValue(), false);
                    return;
                case 6:
                    roy royVar4 = this.b;
                    Object[] objArr4 = this.c;
                    royVar4.a((rop) objArr4[0], ((Integer) objArr4[1]).intValue(), true);
                    return;
                case 7:
                    roy royVar5 = this.b;
                    Object[] objArr5 = this.c;
                    royVar5.b((rox) objArr5[0], (rny) objArr5[1], (rop) objArr5[2]);
                    return;
                case 8:
                    this.b.b((rop) this.c[0]);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rny f33291a;
        public final rob b;
        public final rop c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public ByteBuffer j;
        public Map<String, String> k;
        public roq l;
        public ByteBuffer m;

        public b(rny rnyVar, rop ropVar) {
            this.f33291a = rnyVar;
            this.b = rnyVar.b();
            this.c = ropVar;
            Map<String, String> map = this.b.e;
            boolean z = false;
            this.d = map == null || map.size() == 0;
            byte[] bArr = this.b.g;
            this.e = (bArr == null || bArr.length == 0) ? true : z;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Map<String, String> map = this.b.e;
            this.d = map == null || map.size() == 0;
            byte[] bArr = this.b.g;
            if (bArr != null && bArr.length != 0) {
                z = false;
            }
            this.e = z;
            this.g = 0;
            this.f = 0;
            this.h = 0;
            this.j = null;
            this.k = null;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return this.e && this.d && (this.b.f == null || this.f == this.b.f.length) && (this.b.f33253a == null || (((long) this.g) > this.b.d ? 1 : (((long) this.g) == this.b.d ? 0 : -1)) == 0);
        }
    }

    public roy(d dVar, ron ronVar, Looper looper) {
        this.i = dVar;
        this.e = ronVar;
        this.f = new Handler(looper);
    }

    @Override // tb.rox
    public void a(rny rnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0d3239", new Object[]{this, rnyVar, new Boolean(z)});
        } else if (this.b.remove(rnyVar)) {
            if (!com.uploader.implement.a.a(2)) {
                return;
            }
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " cancel, waiting request:" + rnyVar.hashCode());
        } else {
            int a2 = a(rnyVar, this.c);
            if (a2 == -1) {
                if (!com.uploader.implement.a.a(2)) {
                    return;
                }
                com.uploader.implement.a.a(2, "UploaderSession", this.h + " cancel, no sending request:" + rnyVar.hashCode());
                return;
            }
            boolean a3 = this.e.a(this, rnyVar, z);
            int b2 = b(this.c.remove(a2).c, this.d);
            if (b2 != -1) {
                this.f.removeCallbacks(this.d.remove(b2));
            }
            if (!com.uploader.implement.a.a(2)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.h);
            sb.append(" cancel, sendingList request");
            sb.append(rnyVar.hashCode());
            sb.append(" remove timeout:");
            if (b2 == -1) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(" unregister:");
            sb.append(a3);
            com.uploader.implement.a.a(2, "UploaderSession", sb.toString());
        }
    }

    @Override // tb.rox
    public void a(rny rnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd637ffb", new Object[]{this, rnyVar});
            return;
        }
        this.b.add(rnyVar);
        boolean a2 = this.e.a(this, rnyVar, this);
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "UploaderSession", this.h + " send, request:" + rnyVar.hashCode() + " register:" + a2);
    }

    @Override // tb.rox
    public void a(rny rnyVar, rny rnyVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76877406", new Object[]{this, rnyVar, rnyVar2, new Boolean(z)});
            return;
        }
        int indexOf = this.b.indexOf(rnyVar);
        if (indexOf != -1) {
            this.b.set(indexOf, rnyVar2);
            boolean a2 = this.e.a(this, rnyVar, rnyVar2, this, z);
            if (!a2) {
                this.e.a(this, rnyVar, z);
                this.e.a(this, rnyVar2, this);
            }
            if (!com.uploader.implement.a.a(2)) {
                return;
            }
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " replace:" + a2 + " waiting request:" + rnyVar.hashCode());
            return;
        }
        int a3 = a(rnyVar, this.c);
        if (a3 == -1) {
            this.b.add(rnyVar2);
            boolean a4 = this.e.a(this, rnyVar, rnyVar2, this, z);
            if (!a4) {
                this.e.a(this, rnyVar, z);
                this.e.a(this, rnyVar2, this);
            }
            if (!com.uploader.implement.a.a(2)) {
                return;
            }
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " replace:" + a4 + " request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode());
            return;
        }
        b remove = this.c.remove(a3);
        this.b.add(rnyVar2);
        boolean a5 = this.e.a(this, rnyVar, rnyVar2, this, z);
        if (!a5) {
            this.e.a(this, rnyVar, z);
            this.e.a(this, rnyVar2, this);
        }
        int b2 = b(remove.c, this.d);
        if (b2 != -1) {
            this.f.removeCallbacks(this.d.remove(b2));
        }
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "UploaderSession", this.h + " replace:" + a5 + " sending request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode());
    }

    public void b(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf086a6", new Object[]{this, ropVar});
            return;
        }
        this.d.remove(this);
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " timeout, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " timeout, connection:" + ropVar.hashCode());
        }
        a(a2, new rov("100", "2", "data send or receive timeout", true));
    }

    private rov a(b bVar, ByteBuffer byteBuffer) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("1a6d515a", new Object[]{this, bVar, byteBuffer});
        }
        FileInputStream fileInputStream2 = null;
        if (bVar.b.h != null) {
            int i = (int) (bVar.b.c + bVar.g);
            int min = (int) Math.min(bVar.b.d - bVar.g, byteBuffer.remaining());
            if (min < 0 || bVar.b.d > bVar.b.h.length) {
                return new rov("200", "11", "readFromBytes", false);
            }
            byteBuffer.put(bVar.b.h, i, min);
            bVar.g += min;
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "UploaderSession", this.h + " readFromEntity, from copy:" + min);
            }
            return null;
        }
        File file = bVar.b.f33253a;
        if (file == null || !file.exists()) {
            return new rov("200", "3", "file == null || !file.exists()", false);
        }
        long lastModified = file.lastModified();
        if (lastModified == bVar.b.b) {
            z = false;
        }
        try {
            if (z) {
                if (com.uploader.implement.a.a(8)) {
                    com.uploader.implement.a.a(8, "UploaderSession", this.h + " readFromEntity, file has been modified, origin:" + bVar.b.b + " current:" + lastModified);
                }
                return 0 == lastModified ? new rov("200", "10", "file.lastModified()==0", false) : new rov("200", "6", "file has been modified", false);
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    int read = fileInputStream.getChannel().read(byteBuffer, bVar.b.c + bVar.g);
                    if (read < 0) {
                        rov rovVar = new rov("200", "3", "file read failed", false);
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            if (com.uploader.implement.a.a(8)) {
                                com.uploader.implement.a.a(8, "UploaderSession", this.h + " readFromEntity:", e);
                            }
                        }
                        return rovVar;
                    }
                    int i2 = (int) ((bVar.g + read) - bVar.b.d);
                    if (i2 > 0) {
                        byteBuffer.position(byteBuffer.position() - i2);
                        read -= i2;
                    }
                    if (read > 0) {
                        bVar.g += read;
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        if (com.uploader.implement.a.a(8)) {
                            com.uploader.implement.a.a(8, "UploaderSession", this.h + " readFromEntity:", e2);
                        }
                    }
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    rov rovVar2 = new rov("200", "3", e.toString(), false);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            if (com.uploader.implement.a.a(8)) {
                                com.uploader.implement.a.a(8, "UploaderSession", this.h + " readFromEntity:", e4);
                            }
                        }
                    }
                    return rovVar2;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            if (com.uploader.implement.a.a(8)) {
                                com.uploader.implement.a.a(8, "UploaderSession", this.h + " readFromEntity:", e5);
                            }
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private rov b(b bVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("ffaec01b", new Object[]{this, bVar, byteBuffer});
        }
        byte[] bArr = bVar.b.f;
        int min = Math.min(bArr.length - bVar.f, byteBuffer.remaining());
        if (min < 0) {
            return new rov("200", "1", "readFromBytes", false);
        }
        byteBuffer.put(bArr, bVar.f, min);
        bVar.f += min;
        return null;
    }

    private void a(int i) {
        rov rovVar;
        ByteBuffer allocate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.c.get(i);
        int i2 = f3.e;
        if (!bVar.f33291a.c().e) {
            byte[] bArr = bVar.b.f;
            int length = bArr != null ? bArr.length + 0 : 0;
            if (bVar.b.f33253a != null) {
                length = (int) (length + bVar.b.d);
            }
            byte[] bArr2 = bVar.b.g;
            if (bArr2 != null) {
                length += bArr2.length;
            }
            if (length > 0) {
                i2 = length;
            }
        }
        ByteBuffer byteBuffer = bVar.m;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if (bVar.b.f == null || bVar.f >= bVar.b.f.length) {
            rovVar = null;
        } else {
            if (byteBuffer == null) {
                try {
                    byteBuffer = ByteBuffer.allocate(i2);
                } catch (OutOfMemoryError unused) {
                    i2 >>= 1;
                    byteBuffer = ByteBuffer.allocate(i2);
                }
                bVar.m = byteBuffer;
            }
            rovVar = b(bVar, byteBuffer);
        }
        if (rovVar == null && bVar.g < bVar.b.d) {
            if (byteBuffer == null) {
                try {
                    allocate = ByteBuffer.allocate(i2);
                } catch (OutOfMemoryError unused2) {
                    allocate = ByteBuffer.allocate(i2 >> 1);
                }
                bVar.m = allocate;
                byteBuffer = allocate;
            }
            rovVar = a(bVar, byteBuffer);
        }
        if (rovVar != null) {
            a(i, rovVar);
            return;
        }
        bVar.h = g.getAndIncrement();
        if (!bVar.e && bVar.g == bVar.b.d) {
            byte[] bArr3 = bVar.b.g;
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocate(bArr3.length);
            }
            if (byteBuffer.remaining() >= bArr3.length) {
                byteBuffer.put(bArr3, 0, bArr3.length);
                bVar.e = true;
            }
        }
        roq roqVar = bVar.l;
        if (roqVar == null) {
            roqVar = new roq();
            bVar.l = roqVar;
        }
        roqVar.c = 0;
        roqVar.d = 0;
        roqVar.f33271a = null;
        roqVar.b = null;
        if (!bVar.d) {
            roqVar.f33271a = bVar.b.e;
            bVar.d = true;
        }
        if (byteBuffer != null) {
            bVar.i = byteBuffer.position();
            roqVar.b = byteBuffer.array();
            roqVar.c = byteBuffer.arrayOffset();
            roqVar.d = byteBuffer.position();
        }
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "UploaderSession", this.h + " sendRequest, request:" + bVar.f33291a.hashCode() + " connection:" + bVar.c.hashCode() + " requestData:" + roqVar.toString() + " currentSendSequence:" + bVar.h + " tailFinish:" + bVar.e + " headerFinish:" + bVar.d + " entitySizeSent:" + bVar.g + " bytesSizeSent:" + bVar.f + " offset:" + bVar.b.c + " length:" + bVar.b.d + " requestData length:" + roqVar.d);
        }
        bVar.c.a(roqVar, bVar.h);
        c(bVar.c, bVar.i);
    }

    @Override // tb.rox
    public void a(row rowVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd70aebe", new Object[]{this, rowVar});
        } else {
            this.f33289a = rowVar;
        }
    }

    @Override // tb.rox
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.f.removeCallbacks(this.d.remove(size));
        }
        this.e.a(this);
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "UploaderSession", this.h + " release");
    }

    @Override // tb.rom
    public void a(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6d8025", new Object[]{this, ropVar});
        } else {
            this.f.post(new a(1, this, ropVar));
        }
    }

    public void c(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da738d27", new Object[]{this, ropVar});
            return;
        }
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " doConnect, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " doConnect, connection:" + ropVar.hashCode());
        }
        row rowVar = this.f33289a;
        if (rowVar != null) {
            rowVar.d(this, this.c.get(a2).f33291a);
        }
        row rowVar2 = this.f33289a;
        if (rowVar2 != null) {
            rowVar2.e(this, this.c.get(a2).f33291a);
        }
        a(a2);
    }

    public void d(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f693a8", new Object[]{this, ropVar});
            return;
        }
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " doClose, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " doClose, connection:" + ropVar.hashCode());
        }
        ropVar.a(null);
        b bVar = this.c.get(a2);
        bVar.a();
        e(bVar.c);
    }

    @Override // tb.rom
    public void a(rop ropVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef34411c", new Object[]{this, ropVar, rovVar});
        } else {
            this.f.post(new a(3, this, ropVar, rovVar));
        }
    }

    public void b(rop ropVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd369d", new Object[]{this, ropVar, rovVar});
            return;
        }
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " doError, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " doError, connection:" + ropVar.hashCode() + " error:" + rovVar.toString() + " sendingList.size:" + this.c.size());
        }
        b bVar = this.c.get(a2);
        bVar.a();
        e(bVar.c);
        a(a2, rovVar);
    }

    private void a(int i, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b07e92", new Object[]{this, new Integer(i), rovVar});
            return;
        }
        b remove = this.c.remove(i);
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " notifyError, request:" + remove.f33291a.hashCode());
        }
        row rowVar = this.f33289a;
        if (rowVar == null) {
            return;
        }
        rowVar.b(this, remove.f33291a, rovVar);
    }

    @Override // tb.rom
    public void a(rop ropVar, roq roqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef31fb41", new Object[]{this, ropVar, roqVar});
        } else {
            this.f.post(new a(4, this, ropVar, roqVar));
        }
    }

    public void b(rop ropVar, roq roqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcaf0c2", new Object[]{this, ropVar, roqVar});
            return;
        }
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " doReceive, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " doReceive, sendingList.size:" + this.c.size() + " index:" + a2 + " connection:" + ropVar.hashCode() + " data:" + roqVar.toString());
        }
        b bVar = this.c.get(a2);
        c(bVar.c, bVar.i);
        a(bVar, roqVar);
        ArrayList arrayList = null;
        do {
            Pair<rnz, Integer> a3 = bVar.f33291a.a(bVar.k, bVar.j.array(), bVar.j.arrayOffset(), bVar.j.position());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(a3);
            if (a3.first == null) {
                break;
            }
            bVar.j.flip();
            bVar.j.get(new byte[((Integer) a3.second).intValue()], 0, ((Integer) a3.second).intValue());
            bVar.j.compact();
        } while (bVar.j.position() >= 4);
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair.first == null) {
                if (((Integer) pair.second).intValue() >= 0) {
                    return;
                }
                a(a2, new rov("400", "2", "response == null && divide < 0", true));
                return;
            }
            row rowVar = this.f33289a;
            if (rowVar != null) {
                rowVar.a(this, bVar.f33291a, (rnz) pair.first);
            }
        }
    }

    private static void a(b bVar, roq roqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3531a71a", new Object[]{bVar, roqVar});
            return;
        }
        if (bVar.j == null) {
            bVar.j = ByteBuffer.allocate(128);
            bVar.k = roqVar.f33271a;
        }
        int position = bVar.j.position() + roqVar.b.length;
        if (bVar.j.capacity() < position) {
            bVar.j.flip();
            bVar.j = ByteBuffer.allocate(position).put(bVar.j);
        }
        bVar.j.put(roqVar.b);
    }

    @Override // tb.rom
    public void a(rop ropVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b042f77e", new Object[]{this, ropVar, new Integer(i)});
        } else {
            this.f.postDelayed(new a(6, this, ropVar, Integer.valueOf(i)), this.i.b.enableFlowControl() ? 100L : 0L);
        }
    }

    private void c(rop ropVar, int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fe8abc", new Object[]{this, ropVar, new Integer(i)});
            return;
        }
        int b2 = b(ropVar, this.d);
        if (b2 == -1) {
            aVar = new a(8, this, ropVar);
            this.d.add(aVar);
        } else {
            aVar = this.d.get(b2);
            this.f.removeCallbacks(aVar);
        }
        this.f.postDelayed(aVar, (i / C1238p.b) + 30000);
    }

    private void e(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7799a29", new Object[]{this, ropVar});
            return;
        }
        int b2 = b(ropVar, this.d);
        if (b2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " clearTimeout, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        this.f.removeCallbacks(this.d.remove(b2));
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "UploaderSession", this.h + " clearTimeout, connection:" + ropVar.hashCode());
    }

    private static int a(rop ropVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe31298", new Object[]{ropVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).c.equals(ropVar)) {
                return i;
            }
        }
        return -1;
    }

    private static int a(rny rnyVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83bc7482", new Object[]{rnyVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).f33291a.equals(rnyVar)) {
                return i;
            }
        }
        return -1;
    }

    private static int b(rop ropVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d02d6b7", new Object[]{ropVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).c[0].equals(ropVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // tb.rom
    public void b(rop ropVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9220c11d", new Object[]{this, ropVar, new Integer(i)});
        } else {
            this.f.post(new a(5, this, ropVar, Integer.valueOf(i)));
        }
    }

    public void a(rop ropVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581cab16", new Object[]{this, ropVar, new Integer(i), new Boolean(z)});
            return;
        }
        int a2 = a(ropVar, this.c);
        if (a2 == -1) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            com.uploader.implement.a.a(8, "UploaderSession", this.h + " doSend, NO_POSITION, connection:" + ropVar.hashCode());
            return;
        }
        b bVar = this.c.get(a2);
        boolean b2 = bVar.b();
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderSession", this.h + " doSend, begin:" + z + " connection:" + ropVar.hashCode() + " sendSequence:" + i + " isFinished:" + b2);
        }
        if (z) {
            row rowVar = this.f33289a;
            if (rowVar != null) {
                rowVar.a(this, bVar.f33291a, bVar.g);
            }
        } else if (!b2) {
            a(a2);
            return;
        } else {
            row rowVar2 = this.f33289a;
            if (rowVar2 != null) {
                rowVar2.b(this, bVar.f33291a);
            }
        }
        c(bVar.c, bVar.i);
    }

    @Override // tb.roo
    public void a(rox roxVar, rny rnyVar, rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dffd6d", new Object[]{this, roxVar, rnyVar, ropVar});
        } else {
            this.f.post(new a(7, this, roxVar, rnyVar, ropVar));
        }
    }

    public void b(rox roxVar, rny rnyVar, rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2fe1ee", new Object[]{this, roxVar, rnyVar, ropVar});
            return;
        }
        boolean z = !this.b.remove(rnyVar);
        boolean e = ropVar.e();
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "UploaderSession", this.h + " onAvailable.session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " noWaitingRequest:" + z + " connection:" + ropVar.hashCode() + " needConnect:" + e + " target:" + rnyVar.c());
        }
        if (z) {
            return;
        }
        ropVar.a(this);
        b bVar = new b(rnyVar, ropVar);
        this.c.add(bVar);
        if (e) {
            row rowVar = this.f33289a;
            if (rowVar != null) {
                rowVar.c(this, bVar.f33291a);
            }
            ropVar.c();
            return;
        }
        row rowVar2 = this.f33289a;
        if (rowVar2 != null) {
            rowVar2.e(this, bVar.f33291a);
        }
        a(this.c.size() - 1);
    }
}
