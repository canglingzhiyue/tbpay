package com.taobao.phenix.cache.disk;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.esr;
import tb.kge;
import tb.niu;
import tb.niw;
import tb.njc;
import tb.njd;
import tb.njf;
import tb.nmq;
import tb.nmx;

/* loaded from: classes.dex */
public abstract class a<OUT, NEXT_OUT extends nmq> extends nmx<OUT, NEXT_OUT, com.taobao.phenix.request.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f18866a;

    static {
        kge.a(1539562093);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(int i, int i2, e eVar) {
        super(i, i2);
        this.f18866a = eVar;
    }

    public b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f4b51b01", new Object[]{this, new Integer(i)});
        }
        b a2 = this.f18866a.a(i);
        return a2 == null ? this.f18866a.a(17) : a2;
    }

    public int[] a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("bbccea37", new Object[]{this, iArr, new Integer(i)});
        }
        int a2 = niu.a(i);
        int b = niu.b(i);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 2;
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i6 = iArr[i2];
            int a3 = niu.a(i6) - a2;
            int b2 = niu.b(i6) - b;
            int abs = Math.abs(a3) + Math.abs(b2);
            if (abs == 0) {
                i4 = i6;
                i3 = 1;
                break;
            }
            if (i3 == 2 && a3 > 0 && b2 > 0) {
                i4 = i6;
                i5 = abs;
                i3 = 4;
            } else if ((i3 != 4 || (a3 >= 0 && b2 >= 0)) && abs < i5) {
                i4 = i6;
                i5 = abs;
            }
            i2++;
        }
        return new int[]{i3, i4};
    }

    public long a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd34daf2", new Object[]{this, new Integer(i), str, new Integer(i2)})).longValue();
        }
        b a2 = a(i);
        if (!a2.a(com.taobao.phenix.intf.b.h().n())) {
            return -1L;
        }
        return a2.b(str, i2);
    }

    public njc a(final com.taobao.phenix.request.b bVar, String str, int i, int[] iArr) {
        boolean z;
        njf a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njc) ipChange.ipc$dispatch("9dbdc75b", new Object[]{this, bVar, str, new Integer(i), iArr});
        }
        njf a3 = a(bVar.l(), str, i, iArr);
        final njc njcVar = null;
        if (a3 != null) {
            try {
                return njc.a(a3, null);
            } catch (Exception e) {
                niw.d("DiskCache", bVar, "transform data from response[type:%d] error=%s", Integer.valueOf(a3.k), e);
                return null;
            }
        } else if (!com.taobao.phenix.intf.b.h().L() || bVar.l() == bVar.V()) {
            return null;
        } else {
            String[] strArr = esr.INDEPENDENT_STORAGE_BIZS;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (StringUtils.equals(bVar.b().b, strArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z || (a2 = a(bVar.V(), str, i, iArr)) == null) {
                return null;
            }
            try {
                njcVar = njc.a(a2, null);
                if (njcVar == null || njcVar.m == null || njcVar.m.length <= 0) {
                    return njcVar;
                }
                k.a(new Runnable() { // from class: com.taobao.phenix.cache.disk.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            b a4 = a.this.a(bVar.l());
                            if (!a4.a(com.taobao.phenix.intf.b.h().n())) {
                                return;
                            }
                            niw.d("DiskCache", bVar, "reWrite stream cacheData to disk biz=%s", bVar.b().b);
                            a4.a(bVar.w(), bVar.x(), njcVar.m, njcVar.n, njcVar.l);
                        } catch (Throwable th) {
                            niw.d("DiskCache", bVar, "reWrite cacheData to disk failed error=%s", th);
                        }
                    }
                });
                return njcVar;
            } catch (Exception e2) {
                niw.d("DiskCache", bVar, "transform data from response[type:%d] error=%s", Integer.valueOf(a2.k), e2);
                return njcVar;
            }
        }
    }

    private njf a(int i, String str, int i2, int[] iArr) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njf) ipChange.ipc$dispatch("6d959990", new Object[]{this, new Integer(i), str, new Integer(i2), iArr});
        }
        b a2 = a(i);
        if (!a2.a(com.taobao.phenix.intf.b.h().n())) {
            niw.c("DiskCache", "%s open failed in DiskCacheReader", a2);
            return null;
        } else if (!a2.c() || (i3 = iArr[0]) == 1) {
            return a2.a(str, i2);
        } else {
            int[] a3 = a2.a(str);
            if (a3 == null || a3.length <= 0) {
                niw.a("DiskCache", "find catalogs failed, key=%s", str);
                return null;
            }
            int[] a4 = a(a3, i2);
            int i4 = a4[0];
            if (!com.taobao.phenix.request.b.a(i3, i4)) {
                return null;
            }
            iArr[0] = i4;
            niw.a("DiskCache", "find best size level=%d, actual=%d, target=%d, key=%s", Integer.valueOf(i4), Integer.valueOf(niu.a(a4[1])), Integer.valueOf(niu.a(i2)), str);
            return a2.a(str, a4[1]);
        }
    }

    public int a(com.taobao.phenix.request.b bVar, njd njdVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("293caa1c", new Object[]{this, bVar, njdVar, new Boolean(z)})).intValue();
        }
        if (!njdVar.a()) {
            niw.a("DiskCache", bVar, "write skipped, because encode data not available, key=%s, catalog=%d", bVar.w(), Integer.valueOf(bVar.x()));
            i = 1;
        } else if (njdVar.b()) {
            niw.a("DiskCache", bVar, "write skipped, because encode data not need to be cached(fromDisk=%b, fromScale=%b), key=%s, catalog=%d", Boolean.valueOf(njdVar.e), Boolean.valueOf(njdVar.d), bVar.w(), Integer.valueOf(bVar.x()));
            i = 2;
        } else {
            b a2 = a(bVar.l());
            if (a2.a(com.taobao.phenix.intf.b.h().n())) {
                boolean a3 = a2.a(bVar.w(), bVar.x(), njdVar.m, njdVar.n, njdVar.l);
                int i2 = !a3 ? 4 : 0;
                niw.a("DiskCache", bVar, "write result=%B，priority=%d, key=%s, catalog=%d", Boolean.valueOf(a3), Integer.valueOf(bVar.l()), bVar.w(), Integer.valueOf(bVar.x()));
                i = i2;
            } else {
                niw.c("DiskCache", "%s open failed in DiskCacheWriter", a2);
            }
        }
        if (z) {
            njdVar.h();
        }
        return i;
    }
}
