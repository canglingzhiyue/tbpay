package com.taobao.android.dinamicx.videoc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.fxw;
import tb.kge;

/* loaded from: classes.dex */
public class DXVideoControlConfig<VideoData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_PLAYING_VIDEO = 1;
    public static final long DEFAULT_PLAY_DELAY = 300;
    public static final String DEFAULT_SCENE_NAME = "video";
    public static final float DEFAULT_VIEW_AREA_PERCENT = 0.8f;
    public static final int PLAY_ORDER_POSITIVE = 0;
    public static final int PLAY_ORDER_REVERSE = 1;

    /* renamed from: a  reason: collision with root package name */
    private float f11939a;
    private long b;
    private Comparator<VideoData> d;
    private int e;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Map<String, List<Class<? extends DXWidgetNode>>> c = new HashMap();
    private boolean f = false;
    private int g = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PlayOrder {
    }

    static {
        kge.a(-871005524);
    }

    private DXVideoControlConfig() {
    }

    public static <VideoData> DXVideoControlConfig<VideoData> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXVideoControlConfig) ipChange.ipc$dispatch("c82e8d6d", new Object[0]) : new DXVideoControlConfig().a(0.8f).b(1).a(300L).a(true);
    }

    public static DXVideoControlConfig<fxw> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXVideoControlConfig) ipChange.ipc$dispatch("82a42dee", new Object[0]) : a();
    }

    public DXVideoControlConfig<VideoData> a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("9f9f195d", new Object[]{this, new Float(f)});
        }
        if (f > 1.0f || f < 0.0f) {
            f = 0.8f;
        }
        this.f11939a = f;
        return this;
    }

    public DXVideoControlConfig<VideoData> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("e2764c61", new Object[]{this, new Long(j)});
        }
        this.b = Math.max(j, 0L);
        return this;
    }

    public DXVideoControlConfig<VideoData> f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("d30b468c", new Object[]{this, new Boolean(z)});
        }
        this.p = z;
        return this;
    }

    @SafeVarargs
    public final DXVideoControlConfig<VideoData> a(String str, Class<? extends DXWidgetNode>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("cf1da3ff", new Object[]{this, str, clsArr});
        }
        List<Class<? extends DXWidgetNode>> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(Arrays.asList(clsArr));
        this.c.put(str, list);
        return this;
    }

    @SafeVarargs
    public final DXVideoControlConfig<VideoData> a(Class<? extends DXWidgetNode>... clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXVideoControlConfig) ipChange.ipc$dispatch("5d78c8b5", new Object[]{this, clsArr}) : a("video", clsArr);
    }

    @Deprecated
    public DXVideoControlConfig<VideoData> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("d1c07fa0", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        return this;
    }

    public DXVideoControlConfig<VideoData> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("edd31871", new Object[]{this, new Boolean(z)});
        }
        return a(!z ? 1 : 0);
    }

    public DXVideoControlConfig<VideoData> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("65feef3f", new Object[]{this, new Integer(i)});
        }
        this.h = Math.max(1, i);
        return this;
    }

    public DXVideoControlConfig<VideoData> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("fa3d5ede", new Object[]{this, new Integer(i)});
        }
        this.g = i;
        return this;
    }

    public DXVideoControlConfig<VideoData> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("82118810", new Object[]{this, new Boolean(z)});
        }
        this.f = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("164ff7af", new Object[]{this, new Boolean(z)});
        }
        this.k = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("aa8e674e", new Object[]{this, new Boolean(z)});
        }
        this.l = z;
        return this;
    }

    public DXVideoControlConfig<VideoData> e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("3eccd6ed", new Object[]{this, new Boolean(z)});
        }
        this.n = z;
        return this;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.f11939a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.b;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.p;
    }

    public Map<String, List<Class<? extends DXWidgetNode>>> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.c;
    }

    public DXVideoControlConfig<VideoData> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("520e8737", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        for (List<Class<? extends DXWidgetNode>> list : this.c.values()) {
            hashSet.addAll(list);
        }
        this.c.clear();
        this.c.put(str, new ArrayList(hashSet));
        return this;
    }

    public Comparator<VideoData> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Comparator) ipChange.ipc$dispatch("886de9c2", new Object[]{this}) : this.d;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.g;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.h;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.i;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.l;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.n;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.m;
    }
}
