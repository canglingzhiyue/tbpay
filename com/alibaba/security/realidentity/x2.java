package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.camera.PreviewSize;
import com.alibaba.security.realidentity.service.camera.size.AspectRatio;
import com.alibaba.security.realidentity.z2;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class x2 implements z2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String n = "CameraAdapter";
    public static final int o = 540;
    public static final int p = 300;

    /* renamed from: a  reason: collision with root package name */
    public Point f3597a;
    public Point b;
    public final Context c;
    public z2.a e;
    public int f;
    public int g;
    public RPBizConfig j;
    public byte[] k;
    public int l;
    public volatile boolean h = false;
    public int m = 0;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final Comparator<Point> d = new c(640, 480);

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3598a;
        public final /* synthetic */ String b;

        public a(int i, String str) {
            this.f3598a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            z2.a aVar = x2.this.e;
            if (aVar == null) {
                return;
            }
            aVar.a(this.f3598a, this.b);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            z2.a aVar = x2.this.e;
            if (aVar == null) {
                return;
            }
            aVar.onSuccess();
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Comparator<Point> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3600a;
        public int b;

        public c(int i, int i2) {
            this.f3600a = i;
            this.b = i2;
        }

        public int a(Point point, Point point2) {
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e888ea1", new Object[]{this, point, point2})).intValue();
            }
            int i3 = this.f3600a;
            if (i3 > 0) {
                i = Math.abs(i3 - point.x) + 0;
                i2 = 0 + Math.abs(this.f3600a - point2.x);
            } else {
                i = 0;
            }
            int i4 = this.b;
            if (i4 > 0) {
                i += Math.abs(i4 - point.y);
                i2 += Math.abs(this.b - point2.y);
            }
            return i - i2;
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Point point, Point point2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, point, point2})).intValue() : a(point, point2);
        }
    }

    public x2(Context context, RPBizConfig rPBizConfig) {
        this.c = context;
        this.j = rPBizConfig;
    }

    @Override // com.alibaba.security.realidentity.z2
    public void a(z2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76936d7d", new Object[]{this, aVar});
        } else if (this.h) {
        } else {
            this.m = 0;
            this.e = aVar;
            l();
        }
    }

    @Override // com.alibaba.security.realidentity.z2
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.l;
    }

    @Override // com.alibaba.security.realidentity.z2
    public Point e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("b841788d", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.security.realidentity.z2
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.h) {
        } else {
            m();
            this.e = null;
            this.h = false;
        }
    }

    @Override // com.alibaba.security.realidentity.z2
    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        PreviewSize previewSize = new PreviewSize();
        Point point = this.b;
        previewSize.width = point.x;
        previewSize.height = point.y;
        hashMap.put("previewSize", previewSize);
        return hashMap;
    }

    @Override // com.alibaba.security.realidentity.z2
    public abstract boolean j();

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.i.post(new b());
        }
    }

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            this.i.post(new a(i, str));
        }
    }

    public void a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
        } else if (this.e == null || !this.h) {
        } else {
            this.m++;
            this.l = i;
            this.k = bArr;
            z2.a aVar = this.e;
            Point point = this.b;
            aVar.a(bArr, point.x, point.y, i);
        }
    }

    public Point a(List<Point> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("4ac89f00", new Object[]{this, list});
        }
        d3 d3Var = new d3();
        for (Point point : list) {
            d3Var.a(new c3(point.x, point.y));
        }
        SortedSet<c3> b2 = d3Var.b(AspectRatio.c);
        if (b2 == null) {
            b2 = d3Var.b(a(d3Var));
        }
        c3 a2 = a(b2, o, 300);
        if (a2 == null) {
            a2 = a(b2, o, 0);
        }
        return new Point(a2.b(), a2.a());
    }

    private AspectRatio a(d3 d3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AspectRatio) ipChange.ipc$dispatch("656c7724", new Object[]{this, d3Var});
        }
        AspectRatio aspectRatio = null;
        Iterator<AspectRatio> it = d3Var.a().iterator();
        while (it.hasNext()) {
            aspectRatio = it.next();
            if (AspectRatio.c.equals(aspectRatio)) {
                break;
            }
        }
        return aspectRatio;
    }

    private c3 a(SortedSet<c3> sortedSet, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c3) ipChange.ipc$dispatch("48af43fc", new Object[]{this, sortedSet, new Integer(i), new Integer(i2)});
        }
        c3 c3Var = null;
        Iterator<c3> it = sortedSet.iterator();
        while (it.hasNext()) {
            c3Var = it.next();
            if (Math.min(c3Var.b(), c3Var.a()) <= i && Math.min(c3Var.b(), c3Var.a()) >= i2) {
                break;
            }
        }
        return c3Var;
    }

    public Point a(List<Point> list, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("b0e21a9d", new Object[]{this, list, new Float(f), new Integer(i)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.d);
        int i2 = 0;
        for (Point point : list) {
            if (point.x >= i && a(point, f)) {
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            i2 = 0;
        }
        return list.get(i2);
    }

    private boolean a(Point point, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f48a2f19", new Object[]{this, point, new Float(f)})).booleanValue() : ((double) Math.abs((((float) point.x) / ((float) point.y)) - f)) <= 0.05d;
    }

    @Override // com.alibaba.security.realidentity.z2
    public byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.k;
    }

    public Point a(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("7363a60e", new Object[]{this, point});
        }
        RPBizConfig rPBizConfig = this.j;
        if (rPBizConfig == null || rPBizConfig.getDegradeConfig() == null || !this.j.getDegradeConfig().isForceCameraSizeChange || point.x != 720 || point.y != 540) {
            return point;
        }
        Point point2 = new Point();
        point2.x = 640;
        point2.y = 480;
        return point2;
    }
}
