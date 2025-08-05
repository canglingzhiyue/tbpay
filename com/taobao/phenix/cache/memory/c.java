package com.taobao.phenix.cache.memory;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import tb.kge;
import tb.nhy;
import tb.niw;

/* loaded from: classes.dex */
public class c extends com.taobao.phenix.cache.b<String, b> implements nhy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CEILING_SIZE_MAX_MULTIPLE = 6;
    public static final String TAG = "ImageCachePool";
    public static final String TAG_POOL = "BitmapPool";
    public static final String TAG_RECYCLE = "ImageRecycle";

    /* renamed from: a  reason: collision with root package name */
    private NavigableMap<Integer, List<String>> f18879a;
    private final Object b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* renamed from: com.taobao.phenix.cache.memory.c$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18880a = new int[Bitmap.Config.values().length];

        static {
            try {
                f18880a[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18880a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18880a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18880a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1372675063);
        kge.a(1191155039);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1661851637) {
            if (hashCode != 95609325) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.f();
            return null;
        }
        return super.d((c) objArr[0]);
    }

    @Override // com.taobao.phenix.cache.b
    public /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, bVar})).intValue() : b(bVar);
    }

    @Override // com.taobao.phenix.cache.b, com.taobao.phenix.cache.c
    public /* synthetic */ Object d(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9cf2280b", new Object[]{this, obj}) : b((String) obj);
    }

    public c(int i, float f) {
        super(i, f);
        this.b = new Object();
        this.f18879a = new TreeMap();
        niw.a(TAG, "init with maxSize=%K, hotPercent=%.1f%%", Integer.valueOf(i), Float.valueOf(f * 100.0f));
    }

    public int b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e159b69e", new Object[]{this, bVar})).intValue();
        }
        if (bVar != null) {
            return bVar.a();
        }
        return 0;
    }

    private int a(Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("601e1eb7", new Object[]{this, config})).intValue();
        }
        if (config != null) {
            int i = AnonymousClass1.f18880a[config.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2 || i == 3) {
                return 2;
            }
            if (i == 4) {
                return 4;
            }
        }
        return 0;
    }

    private int c(b bVar) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa5aaddf", new Object[]{this, bVar})).intValue();
        }
        if ((bVar instanceof h) && (bitmap = ((h) bVar).f18883a) != null && !bitmap.isRecycled() && bitmap.isMutable()) {
            return bVar.a();
        }
        return 0;
    }

    @Override // com.taobao.phenix.cache.b
    public void a(boolean z, String str, b bVar, boolean z2) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aaf101c", new Object[]{this, new Boolean(z), str, bVar, new Boolean(z2)});
            return;
        }
        if (z2) {
            bVar.b();
        } else {
            bVar.a(z);
        }
        synchronized (this.b) {
            if (!z) {
                int c = c(bVar);
                if (c > 0 && (list = (List) this.f18879a.get(Integer.valueOf(c))) != null) {
                    if (list.remove(str)) {
                        this.c -= c;
                        this.f--;
                        niw.a(TAG_POOL, "remove from bitmap pool when not pre-evicted(cache removed=%b), image=%s", Boolean.valueOf(z2), bVar);
                    }
                    if (list.isEmpty()) {
                        this.f18879a.remove(Integer.valueOf(c));
                    }
                }
            }
        }
    }

    @Override // tb.nhy
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b(i);
        niw.a(TAG_POOL, "set preEvictedMaxSize(maxPoolSize=%K) in ImageCacheAndPool", Integer.valueOf(i));
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!niw.a(3)) {
        } else {
            int i = this.d;
            niw.a(TAG_POOL, "%K/%K, rate:%.1f%%, hits:%d, misses:%d, count:%d", Integer.valueOf(this.c), Integer.valueOf(d()), Float.valueOf((i * 100.0f) / (i + this.e)), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
        }
    }

    @Override // tb.nhy
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        int intValue;
        String str;
        b bVar;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9d49a802", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        int a2 = i * i2 * a(config);
        synchronized (this.b) {
            bitmap = null;
            if (a2 > 0) {
                Map.Entry<Integer, List<String>> ceilingEntry = this.f18879a.ceilingEntry(Integer.valueOf(a2));
                if (ceilingEntry != null) {
                    intValue = ceilingEntry.getKey().intValue();
                    if (intValue <= a2 * 6) {
                        List<String> value = ceilingEntry.getValue();
                        if (!value.isEmpty()) {
                            str = value.remove(0);
                            this.c -= intValue;
                            this.f--;
                        } else {
                            str = null;
                        }
                        if (value.isEmpty()) {
                            this.f18879a.remove(Integer.valueOf(intValue));
                        }
                    } else {
                        str = null;
                    }
                }
            }
            str = null;
            intValue = 0;
        }
        if (str != null) {
            bVar = a((c) str, false);
            if ((bVar instanceof h) && (bitmap2 = ((h) bVar).f18883a) != null && bitmap2.isMutable() && !bitmap2.isRecycled()) {
                try {
                    bitmap2.reconfigure(i, i2, config);
                    bitmap2.setHasAlpha(true);
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                } catch (Throwable th) {
                    niw.d(TAG_POOL, "reconfigure error, bitmap=%s, throwable=%s", bitmap2, th);
                }
            }
        } else {
            bVar = null;
        }
        if (bitmap != null) {
            this.d++;
            niw.a(TAG_POOL, "get from bitmap pool, width=%d, height=%d, config=%s, redundant=%.1f, image=%s", Integer.valueOf(i), Integer.valueOf(i2), config, Float.valueOf(intValue / a2), bVar);
        } else {
            this.e++;
        }
        h();
        return bitmap;
    }

    @Override // tb.nhy
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public boolean a2(b bVar) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1858bf6e", new Object[]{this, bVar})).booleanValue();
        }
        if (!c((c) bVar.c())) {
            niw.a(TAG_POOL, "cannot put into bitmap pool(cache removed), image=%s", bVar);
            return false;
        }
        int c = c(bVar);
        if (c <= 0) {
            return false;
        }
        synchronized (this.b) {
            List list = (List) this.f18879a.get(Integer.valueOf(c));
            if (list == null) {
                list = new LinkedList();
                this.f18879a.put(Integer.valueOf(c), list);
            }
            this.c += c;
            this.f++;
            niw.a(TAG_POOL, "put into bitmap pool, size=%d, image=%s", Integer.valueOf(c), bVar);
            add = list.add(bVar.c());
        }
        return add;
    }

    @Override // com.taobao.phenix.cache.b, com.taobao.phenix.cache.c
    public final synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        synchronized (this.b) {
            this.c = 0;
            this.f = 0;
            this.f18879a.clear();
        }
    }

    public final b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("18cb54c5", new Object[]{this, str});
        }
        b bVar = (b) super.d((c) str);
        a(TAG);
        return bVar;
    }
}
