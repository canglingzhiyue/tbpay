package com.taobao.taolive.movehighlight.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.poy;
import tb.sku;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f21480a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    private static f h;
    public boolean g = false;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private int o;
    private int p;
    private String q;
    private long r;
    private boolean s;

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7a19cb35", new Object[0]);
        }
        if (h == null) {
            synchronized (f.class) {
                if (h == null) {
                    h = new f();
                }
            }
        }
        return h;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        b();
        this.i = j;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.m = j;
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15ad07", new Object[]{this, aVar, new Long(j)});
            return;
        }
        this.k = j;
        if (com.taobao.taolive.sdk.playcontrol.c.i(aVar) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return;
        }
        b("endFirstFrameRenderTime");
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
            return;
        }
        this.l = j;
        b("enddynamicLayoutShowedTime");
    }

    static {
        kge.a(-368536955);
        f21480a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.i = -1L;
        this.j = -1L;
        this.k = -1L;
        this.m = -1L;
        this.l = -1L;
        this.p = 0;
        this.r = -1L;
        this.g = false;
        this.o = -1;
        this.s = false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.k - this.i <= 0 || -1 == this.o || com.taobao.taolive.sdk.playcontrol.c.i(com.taobao.taolive.room.utils.n.a()) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return false;
        }
        return e == this.o || this.s || this.l - this.i > 0;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if ("endFirstFrameRenderTime".equals(str)) {
            this.r = this.k;
            this.n = 2;
        } else if ("enddynamicLayoutShowedTime".equals(str)) {
            this.r = this.l;
            this.n = 4;
        }
        if (!c()) {
            return;
        }
        if (this.g) {
            b();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isOpenSecond", String.valueOf(this.p));
        long j = this.j;
        long j2 = this.i;
        long j3 = 0;
        hashMap.put("detailTime", String.valueOf(j - j2 >= 0 ? j - j2 : 0L));
        long j4 = this.k;
        long j5 = this.i;
        hashMap.put("firstFrameRenderTime", String.valueOf(j4 - j5 >= 0 ? j4 - j5 : 0L));
        long j6 = this.l;
        long j7 = this.i;
        hashMap.put("dynamicLayoutShowedTime", String.valueOf(j6 - j7 >= 0 ? j6 - j7 : 0L));
        hashMap.put("reportType", String.valueOf(this.n));
        hashMap.put("timeMoveSource", String.valueOf(this.o));
        long j8 = this.r;
        long j9 = this.i;
        hashMap.put("renderTotalTime", String.valueOf(j8 - j9 >= 0 ? j8 - j9 : 0L));
        long j10 = this.m;
        long j11 = this.i;
        if (j10 - j11 >= 0) {
            j3 = j10 - j11;
        }
        hashMap.put("timemovingRequestTime", String.valueOf(j3));
        String str2 = this.q;
        if (str2 == null) {
            str2 = "m3u8";
        }
        hashMap.put(sku.KEY_VIDEO_TYPE, str2);
        hashMap.put("livesource", poy.ac(com.taobao.taolive.room.utils.n.a()));
        hashMap.put("device_level", String.valueOf(com.taobao.taolive.room.utils.k.a()));
        o.a(com.taobao.taolive.room.utils.n.a(), "timemove_renderfinished", (Map<String, String>) hashMap);
        b();
    }
}
