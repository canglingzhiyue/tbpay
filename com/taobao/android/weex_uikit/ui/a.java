package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends h<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1780216664);
    }

    public a(UINode uINode) {
        super(uINode);
        a("translateX", 0);
        a("translateY", 0);
        Float valueOf = Float.valueOf(0.0f);
        a("rotate", valueOf);
        a("rotateX", valueOf);
        a("rotateY", valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        a("scaleX", valueOf2);
        a("scaleY", valueOf2);
        a("ariaLabel", "");
        a("ariaHidden", false);
        a(MUSConstants.SKEW_X, valueOf);
        a(MUSConstants.SKEW_Y, valueOf);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            b(MUSConstants.DRAW_OPACITY, Float.valueOf(f));
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b("translateX", Integer.valueOf(i));
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            b("translateY", Integer.valueOf(i));
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            b("rotate", Float.valueOf(f));
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            b("rotateX", Float.valueOf(f));
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
        } else {
            b("rotateY", Float.valueOf(f));
        }
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4ead4", new Object[]{this, new Float(f)});
        } else {
            b("scaleX", Float.valueOf(f));
        }
    }

    public void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9c373", new Object[]{this, new Float(f)});
        } else {
            b("scaleY", Float.valueOf(f));
        }
    }

    public void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25e9c12", new Object[]{this, new Float(f)});
        } else {
            b(MUSConstants.SKEW_X, Float.valueOf(f));
        }
    }

    public void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41374b1", new Object[]{this, new Float(f)});
        } else {
            b(MUSConstants.SKEW_Y, Float.valueOf(f));
        }
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : ((Float) a(MUSConstants.SKEW_X)).floatValue();
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : ((Float) a(MUSConstants.SKEW_Y)).floatValue();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : ((Integer) a("translateX")).intValue();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : ((Integer) a("translateY")).intValue();
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("rotate");
        if (f != null && !f.isNaN()) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("rotateX");
        if (f != null && !f.isNaN()) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("rotateY");
        if (f != null && !f.isNaN()) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("scaleX");
        if (f != null && !f.isNaN()) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("scaleY");
        if (f != null && !f.isNaN()) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue();
        }
        Float f = (Float) a(MUSConstants.DRAW_OPACITY);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }
}
