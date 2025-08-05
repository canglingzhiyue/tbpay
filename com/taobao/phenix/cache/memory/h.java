package com.taobao.phenix.cache.memory;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;
import tb.niu;
import tb.niw;
import tb.riy;

/* loaded from: classes7.dex */
public class h extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Bitmap, Map<h, Boolean>> d;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f18883a;
    public final Rect b;
    private a c;

    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(549650518);
        d = new WeakHashMap(300);
    }

    public h(Bitmap bitmap, Rect rect, String str, String str2, int i, int i2) {
        super(str, str2, i, i2);
        this.f18883a = bitmap;
        this.b = rect;
        f();
        niw.a(c.TAG_RECYCLE, "new image=%s", this);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (d) {
            Map<h, Boolean> map = d.get(this.f18883a);
            if (map == null) {
                map = new WeakHashMap<>(1);
                d.put(this.f18883a, map);
            }
            map.put(this, Boolean.TRUE);
        }
    }

    @Override // com.taobao.phenix.cache.memory.b
    public e a(String str, String str2, int i, int i2, boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c285d26c", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z), resources});
        }
        if (z) {
            return new f(resources, this.f18883a, this.b, str, str2, i, i2);
        }
        return new e(resources, this.f18883a, this.b, str, str2, i, i2);
    }

    @Override // com.taobao.phenix.cache.memory.b
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : niu.a(this.f18883a);
    }

    @Override // com.taobao.phenix.cache.memory.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        niw.a(c.TAG_RECYCLE, "image change to not recycled, image=%s", this);
        f();
    }

    @Override // com.taobao.phenix.cache.memory.b
    public void d() {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (d) {
            Map<h, Boolean> map = d.get(this.f18883a);
            if (map != null) {
                map.remove(this);
                int size = map.size();
                if (size == 0) {
                    d.remove(this.f18883a);
                    niw.a(c.TAG_RECYCLE, "bitmap in the image can be recycled now, image=%s", this);
                } else {
                    niw.c(c.TAG_RECYCLE, "cannot recycled the image(bitmap referenced by %d image still), image=%s", Integer.valueOf(size), this);
                }
            } else {
                niw.c(c.TAG_RECYCLE, "cannot recycled the image(bitmap has been recycled ever), image=%s", this);
            }
            z = false;
        }
        if (!z || (aVar = this.c) == null) {
            return;
        }
        aVar.a(this);
    }

    @Override // com.taobao.phenix.cache.memory.b
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StaticCachedImage(" + Integer.toHexString(hashCode()) + ", bmp@" + this.f18883a + ", key@" + c() + riy.BRACKET_END_STR;
    }

    public h a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("b8f95cab", new Object[]{this, aVar});
        }
        this.c = aVar;
        return this;
    }
}
