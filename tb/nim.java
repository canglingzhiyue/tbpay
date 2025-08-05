package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tcommon.core.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class nim implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<byte[]> f31485a;
    private List<byte[]> b = new LinkedList();
    private List<byte[]> c = new ArrayList(64);
    private int d = 0;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    static {
        kge.a(-901392450);
        kge.a(-237975750);
        f31485a = new Comparator<byte[]>() { // from class: tb.nim.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, bArr, bArr2})).intValue() : a(bArr, bArr2);
            }

            public int a(byte[] bArr, byte[] bArr2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb72cc29", new Object[]{this, bArr, bArr2})).intValue() : bArr.length - bArr2.length;
            }
        };
    }

    public nim(int i) {
        this.i = i;
    }

    @Override // com.taobao.tcommon.core.a
    public synchronized byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            byte[] bArr = this.c.get(i2);
            if (bArr.length >= i) {
                this.d -= bArr.length;
                this.c.remove(i2);
                this.b.remove(bArr);
                this.e++;
                niw.a("BytesPool", "success get buffer from pool, request=%d, result=%d", Integer.valueOf(i), Integer.valueOf(bArr.length));
                b();
                return bArr;
            }
        }
        this.g++;
        niw.a("BytesPool", "failed get buffer from pool, request=%d", Integer.valueOf(i));
        b();
        return new byte[i];
    }

    @Override // com.taobao.tcommon.core.a
    public synchronized void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        if (bArr != null && bArr.length <= this.i && !this.b.contains(bArr)) {
            this.f++;
            this.b.add(bArr);
            int binarySearch = Collections.binarySearch(this.c, bArr, f31485a);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.c.add(binarySearch, bArr);
            this.d += bArr.length;
            c(this.i);
            niw.a("BytesPool", "release a buffer into pool, length=%d", Integer.valueOf(bArr.length));
        }
    }

    @Override // com.taobao.tcommon.core.a
    public synchronized void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // com.taobao.tcommon.core.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c(0);
        }
    }

    private synchronized void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        while (this.d > i) {
            byte[] remove = this.b.remove(0);
            this.c.remove(remove);
            this.d -= remove.length;
            this.h++;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!niw.a(3)) {
        } else {
            niw.a("BytesPool", "%d/%d , puts:%d, misses:%d, hits:%d, evicts:%d", Integer.valueOf(this.d), Integer.valueOf(this.i), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.e), Integer.valueOf(this.h));
        }
    }
}
