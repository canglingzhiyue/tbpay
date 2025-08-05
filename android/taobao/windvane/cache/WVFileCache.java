package android.taobao.windvane.cache;

import android.os.Process;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes2.dex */
public class WVFileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CREATE = 4;
    public static final int DELETE = 3;
    public static final int READ = 1;
    public static final int WRITE = 2;

    /* renamed from: a  reason: collision with root package name */
    private static String f1548a;
    private String b;
    private String c;
    private boolean d;
    private RandomAccessFile g;
    private FileChannel h;
    private int j;
    private Map<String, c> f = Collections.synchronizedMap(new FixedSizeLinkedHashMap());
    private boolean i = true;
    private boolean e = false;

    public static /* synthetic */ int a(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af6e256", new Object[]{wVFileCache})).intValue() : wVFileCache.j;
    }

    public static /* synthetic */ String b(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4cd3c9e", new Object[]{wVFileCache}) : wVFileCache.b;
    }

    public static /* synthetic */ FileChannel c(WVFileCache wVFileCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileChannel) ipChange.ipc$dispatch("36e805a2", new Object[]{wVFileCache}) : wVFileCache.h;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f1548a;
    }

    static {
        kge.a(433252598);
        f1548a = "WVFileCache";
    }

    public WVFileCache(String str, String str2, int i, boolean z) {
        this.j = 100;
        this.b = str;
        this.c = str2;
        this.j = i;
        this.d = z;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f.size() <= i) {
        } else {
            e();
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.g;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileChannel fileChannel = this.h;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        super.finalize();
    }

    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            File file = new File(this.c, "wv_web_info.dat");
            if (!file.exists()) {
                new File(this.c).mkdirs();
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    String str = f1548a;
                    m.e(str, "init createNewFile:" + e.getMessage());
                    return false;
                }
            }
            new File(this.b).mkdirs();
            try {
                this.g = new RandomAccessFile(file.getAbsolutePath(), "rw");
                if (this.h == null) {
                    this.h = this.g.getChannel();
                }
                if (m.a()) {
                    String str2 = f1548a;
                    m.b(str2, "lock success process is " + Process.myPid());
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!f()) {
                    return false;
                }
                if (m.a()) {
                    String str3 = f1548a;
                    m.b(str3, "init time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                this.e = true;
                a(this.j);
                if (this.f.size() == 0) {
                    c();
                }
            } catch (Exception e2) {
                String str4 = f1548a;
                m.e(str4, "init fInfoOs RandomAccessFile:" + e2.getMessage());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.taobao.windvane.cache.c r10, java.nio.ByteBuffer r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.cache.WVFileCache.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r10 = "cc40a96e"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1f:
            if (r10 == 0) goto Lca
            java.lang.String r0 = r10.c
            if (r0 != 0) goto L27
            goto Lca
        L27:
            boolean r1 = android.taobao.windvane.util.m.a()
            if (r1 == 0) goto L44
            java.lang.String r1 = android.taobao.windvane.cache.WVFileCache.f1548a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "write:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.taobao.windvane.util.m.b(r1, r5)
        L44:
            boolean r1 = r9.e
            if (r1 == 0) goto Lca
            java.io.File r1 = new java.io.File
            java.lang.String r5 = r9.b
            r1.<init>(r5, r0)
            boolean r11 = android.taobao.windvane.file.a.a(r1, r11)     // Catch: android.taobao.windvane.file.NotEnoughSpace -> L54
            goto L89
        L54:
            r5 = move-exception
            java.lang.String r6 = android.taobao.windvane.cache.WVFileCache.f1548a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "write error. fileName="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ". NotEnoughSpace: "
            r7.append(r8)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.taobao.windvane.util.m.e(r6, r5)
            boolean r5 = r9.i
            if (r5 == 0) goto L88
            r9.c()
            boolean r11 = android.taobao.windvane.file.a.a(r1, r11)     // Catch: android.taobao.windvane.file.NotEnoughSpace -> L84
            goto L89
        L84:
            r11 = move-exception
            r11.printStackTrace()
        L88:
            r11 = 0
        L89:
            if (r11 == 0) goto Lca
            java.util.Map<java.lang.String, android.taobao.windvane.cache.c> r11 = r9.f
            java.lang.Object r11 = r11.get(r0)
            android.taobao.windvane.cache.c r11 = (android.taobao.windvane.cache.c) r11
            if (r11 == 0) goto Lb1
            java.lang.String r1 = android.taobao.windvane.cache.WVFileCache.f1548a
            java.lang.String r4 = "writed success, file exist"
            android.taobao.windvane.util.m.b(r1, r4)
            long r4 = r11.h
            r10.h = r4
            java.nio.channels.FileChannel r11 = r9.h
            android.taobao.windvane.cache.c r10 = android.taobao.windvane.cache.d.a(r2, r10, r11)
            java.util.Map<java.lang.String, android.taobao.windvane.cache.c> r11 = r9.f
            android.taobao.windvane.cache.c r10 = r10.a()
            r11.put(r0, r10)
            goto Lc9
        Lb1:
            java.lang.String r11 = android.taobao.windvane.cache.WVFileCache.f1548a
            java.lang.String r1 = "writed success, file do not exist"
            android.taobao.windvane.util.m.b(r11, r1)
            r11 = 4
            java.nio.channels.FileChannel r1 = r9.h
            android.taobao.windvane.cache.c r10 = android.taobao.windvane.cache.d.a(r11, r10, r1)
            java.util.Map<java.lang.String, android.taobao.windvane.cache.c> r11 = r9.f
            android.taobao.windvane.cache.c r10 = r10.a()
            r11.put(r0, r10)
        Lc9:
            return r3
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.cache.WVFileCache.a(android.taobao.windvane.cache.c, java.nio.ByteBuffer):boolean");
    }

    public boolean a(String str) {
        c cVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.e && str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(this.b, str);
            if (file.isFile()) {
                z = file.delete();
            }
            if ((z || !file.exists()) && (cVar = this.f.get(str)) != null) {
                m.b(f1548a, "delete success");
                d.a(3, cVar, this.h);
                this.f.remove(str);
                if (m.a()) {
                    String str2 = f1548a;
                    m.b(str2, "delete time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                return true;
            }
        }
        return z;
    }

    public boolean c() {
        String[] list;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.e || (list = new File(this.b).list()) == null) {
            return false;
        }
        for (String str : list) {
            z &= a(str);
        }
        return z;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m.b(f1548a, "onFileOverflow");
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, c>> entrySet = this.f.entrySet();
        int size = this.f.size();
        for (Map.Entry<String, c> entry : entrySet) {
            if (size < this.j) {
                break;
            }
            c value = entry.getValue();
            if (value != null) {
                arrayList.add(value);
            }
            size--;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(((c) it.next()).c);
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) this.h.size());
            this.h.read(allocate);
            bArr = allocate.array();
        } catch (IOException e) {
            String str = f1548a;
            m.e(str, "collectFiles fInfoChannel.read error:" + e.getMessage());
        }
        if (m.a()) {
            String str2 = f1548a;
            m.b(str2, "collectFiles read fileinfo:" + (System.currentTimeMillis() - currentTimeMillis));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (bArr == null) {
            return false;
        }
        m.b("collectFiles", "read fileinfo success");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 60;
        boolean z = false;
        int i2 = 0;
        while (i < bArr.length) {
            if (bArr[i] == 10) {
                int i3 = i - i2;
                c a2 = d.a(bArr, i2, i3);
                if (a2 != null) {
                    String str3 = a2.c;
                    if (!this.f.containsKey(str3)) {
                        a2.h = byteArrayOutputStream.size();
                        this.f.put(str3, a2);
                        byteArrayOutputStream.write(bArr, i2, i3 + 1);
                        i2 = i + 1;
                        i += 60;
                    }
                }
                z = true;
                i2 = i + 1;
                i += 60;
            }
            i++;
        }
        if (m.a()) {
            String str4 = f1548a;
            m.b(str4, "parse fileinfo:" + (System.currentTimeMillis() - currentTimeMillis2));
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        if (z) {
            try {
                this.h.truncate(0L);
                this.h.position(0L);
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                wrap.position(0);
                this.h.write(wrap);
            } catch (IOException e2) {
                String str5 = f1548a;
                m.e(str5, "collectFiles fInfoChannel.write error:" + e2.getMessage());
            }
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        if (m.a()) {
            String str6 = f1548a;
            m.b(str6, "write fileinfo:" + (System.currentTimeMillis() - currentTimeMillis3));
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1;

        static {
            kge.a(-1229774578);
        }

        public FixedSizeLinkedHashMap() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() <= WVFileCache.a(WVFileCache.this)) {
                return false;
            }
            if (m.a()) {
                String d = WVFileCache.d();
                m.b(d, "removeEldestEntry, size:" + size() + " " + entry.getKey());
            }
            V value = entry.getValue();
            if (value instanceof c) {
                c cVar = (c) value;
                if (android.taobao.windvane.file.a.b(new File(WVFileCache.b(WVFileCache.this), cVar.c))) {
                    d.a(3, cVar, WVFileCache.c(WVFileCache.this));
                }
            }
            return true;
        }
    }
}
