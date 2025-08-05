package com.taobao.android.weex_framework;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.a;
import com.taobao.android.weex_framework.ui.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes6.dex */
public class MUSInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UNICORN_TRACE_METHODS_COUNT = 9;
    private String A;

    /* renamed from: a  reason: collision with root package name */
    private boolean f15980a;
    private String c;
    private Float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private i k;
    private f l;
    private a y;
    private boolean h = true;
    private boolean i = true;
    private MUSRenderType m = MUSRenderType.MUSRenderTypeUnspecific;
    private RenderMode n = RenderMode.surface;
    private Map<String, Long> o = new HashMap();
    private ArrayList<String> q = new ArrayList<>();
    private boolean t = true;
    private HashMap<String, String> u = new HashMap<>();
    private boolean w = false;
    private boolean z = true;

    /* loaded from: classes6.dex */
    public enum MUSRenderType {
        MUSRenderTypeUnspecific(0),
        MUSRenderTypePlatform(1),
        MUSRenderTypeUnicorn(2);
        
        private int value;

        MUSRenderType(int i) {
            this.value = i;
        }

        public static void preloadClass() {
        }

        public int value() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public enum PlatformViewMode {
        TextureDisplay,
        HybridComposition,
        PunchingDisplay
    }

    /* loaded from: classes6.dex */
    public enum RenderMode {
        surface,
        texture,
        image,
        offscreen;

        public static void preloadClass() {
        }
    }

    static {
        kge.a(221060742);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c715beed", new Object[]{this}) : this.y;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea4a1c8", new Object[]{this, aVar});
        } else {
            this.y = aVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.h;
    }

    public MUSRenderType j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSRenderType) ipChange.ipc$dispatch("a3c27a5", new Object[]{this}) : this.m;
    }

    public void a(MUSRenderType mUSRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb0c9c", new Object[]{this, mUSRenderType});
        } else {
            this.m = mUSRenderType;
        }
    }

    public RenderMode l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderMode) ipChange.ipc$dispatch("6771dbb", new Object[]{this}) : this.n;
    }

    public void a(RenderMode renderMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288fe260", new Object[]{this, renderMode});
        } else {
            this.n = renderMode;
        }
    }

    public i m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("de6a2067", new Object[]{this}) : this.k;
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecc246d", new Object[]{this, iVar});
        } else {
            this.k = iVar;
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f15980a;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d = Float.valueOf(f);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e4296f", new Object[]{this, fVar});
        } else {
            this.l = fVar;
        }
    }

    public f o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("314b3ebd", new Object[]{this}) : this.l;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.z;
    }

    public Float q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("2c3828c1", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void b(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.A;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.A = str;
        }
    }

    public HashMap<String, String> y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("b322b5e3", new Object[]{this}) : this.u;
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.u = hashMap;
        }
    }
}
