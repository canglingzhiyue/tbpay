package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.k;
import com.taobao.phenix.intf.b;
import com.taobao.tcommon.core.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class dqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile dqf i;
    private static volatile boolean j;

    /* renamed from: a  reason: collision with root package name */
    private RandomAccessFile f26905a;
    private File b;
    private ConcurrentSkipListMap<String, Bitmap> c = new ConcurrentSkipListMap<>();
    private ConcurrentSkipListMap<String, stx> d = new ConcurrentSkipListMap<>();
    private AtomicInteger e = new AtomicInteger(0);
    private AtomicInteger f = new AtomicInteger(0);
    private AtomicBoolean g = new AtomicBoolean(false);
    private AtomicBoolean h = new AtomicBoolean(false);

    public static /* synthetic */ void a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a14abf", new Object[]{dqfVar});
        } else {
            dqfVar.d();
        }
    }

    static {
        kge.a(1181394457);
        j = false;
    }

    private dqf() {
    }

    public static dqf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("f03cec5", new Object[0]);
        }
        if (i == null) {
            synchronized (dqf.class) {
                if (i == null) {
                    i = new dqf();
                }
            }
        }
        return i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (j) {
        } else {
            try {
                niw.d("Phenix", "CacheManager buildBitmapInfoMapFromFile start", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                c();
                a(this.f26905a, this.c);
                j = true;
                niw.d("Phenix", "CacheManager buildBitmapInfoMapFromFile finish duration = " + (System.currentTimeMillis() - currentTimeMillis) + ", hashMap size = " + this.c.size(), new Object[0]);
            } catch (Throwable th) {
                niw.d("Phenix", "CacheManager buildBitmapInfoMapFromFile", th);
            }
        }
    }

    private void a(String str, stx stxVar, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4176ea3b", new Object[]{this, str, stxVar, randomAccessFile});
            return;
        }
        randomAccessFile.seek(0L);
        int readInt = randomAccessFile.readInt();
        randomAccessFile.seek(0L);
        randomAccessFile.writeInt(readInt + 1);
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeUTF(str);
        randomAccessFile.writeInt(stxVar.f33899a);
        randomAccessFile.writeInt(stxVar.b);
        randomAccessFile.writeUTF(stxVar.d);
        randomAccessFile.writeInt(stxVar.c);
        randomAccessFile.write(stxVar.e);
    }

    private void a(ConcurrentSkipListMap<String, stx> concurrentSkipListMap, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e3c7d7", new Object[]{this, concurrentSkipListMap, randomAccessFile});
        } else if (concurrentSkipListMap != null && concurrentSkipListMap.size() != 0 && randomAccessFile != null) {
            a(randomAccessFile);
            for (Map.Entry<String, stx> entry : concurrentSkipListMap.entrySet()) {
                a(entry.getKey(), entry.getValue(), randomAccessFile);
            }
        }
    }

    private void a(RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7734558", new Object[]{this, randomAccessFile});
            return;
        }
        randomAccessFile.seek(0L);
        randomAccessFile.writeInt(0);
    }

    private void a(RandomAccessFile randomAccessFile, ConcurrentSkipListMap<String, Bitmap> concurrentSkipListMap) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3738c097", new Object[]{this, randomAccessFile, concurrentSkipListMap});
        } else if (randomAccessFile != null && randomAccessFile.length() > 0) {
            if (concurrentSkipListMap == null) {
                concurrentSkipListMap = new ConcurrentSkipListMap<>();
            }
            randomAccessFile.seek(0L);
            int readInt = randomAccessFile.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                String readUTF = randomAccessFile.readUTF();
                int readInt2 = randomAccessFile.readInt();
                int readInt3 = randomAccessFile.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(randomAccessFile.readUTF());
                byte[] bArr = new byte[randomAccessFile.readInt()];
                randomAccessFile.readFully(bArr);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt2, readInt3, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                concurrentSkipListMap.put(readUTF, createBitmap);
            }
        }
    }

    private void c() throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = new File(b.h().n().getFilesDir(), "phenix_home_cache");
        this.f26905a = new RandomAccessFile(this.b, "rw");
    }

    public Bitmap a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2cf2285a", new Object[]{this, str, str2});
        }
        if (j && this.c.size() > 0) {
            if (this.f.get() <= 120 && "homepage-ads".equals(str)) {
                return this.c.remove(str2);
            }
            if (this.f.get() <= 120) {
                niw.d("Phenix", "BitMapProcessor conductResult. readOtherBizCount " + this.f.get(), new Object[0]);
                this.f.getAndAdd(1);
            }
            if (this.f.get() >= 120 && this.c.size() > 0 && this.h.compareAndSet(false, true)) {
                niw.d("Phenix", "BitMapProcessor conductResult clear hashMap" + this.c.size(), new Object[0]);
                this.c.clear();
            }
        }
        return null;
    }

    public void a(String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c077032", new Object[]{this, str, str2, bitmap});
        } else if (bitmap == null || TextUtils.isEmpty(str2) || this.g.get()) {
        } else {
            try {
                if (this.e.get() <= 120 && this.d.size() < 40 && "homepage-ads".equals(str)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                    bitmap.copyPixelsToBuffer(allocate);
                    this.d.put(str2, new stx(bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount(), bitmap.getConfig().toString(), allocate.array()));
                    niw.d("Phenix", "BitMapProcessor resultImage. " + str + " put hashMap " + this.d.size(), new Object[0]);
                } else if (this.e.get() < 120) {
                    this.e.getAndAdd(1);
                }
                if (this.e.get() < 120 && this.d.size() < 40) {
                    return;
                }
                niw.d("Phenix", "BitMapProcessor resultImage. put hashMap into file " + this.d.size() + " " + this.e.get(), new Object[0]);
                if (!this.g.compareAndSet(false, true)) {
                    return;
                }
                if (c.a()) {
                    k.a(new Runnable() { // from class: tb.dqf.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dqf.a(dqf.this);
                            }
                        }
                    });
                } else {
                    d();
                }
            } catch (Throwable th) {
                niw.d("Phenix", "BitMapProcessor resultImage. save bitmap error" + th.getMessage(), new Object[0]);
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.b != null && this.b.exists()) {
                this.b.delete();
            }
            c();
            a(this.d, this.f26905a);
            this.d.clear();
        } catch (Throwable th) {
            niw.d("Phenix", "BitMapProcessor resultImage. saveBitmapToFile" + th.getMessage(), new Object[0]);
        }
    }
}
