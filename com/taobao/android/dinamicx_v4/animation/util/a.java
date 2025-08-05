package com.taobao.android.dinamicx_v4.animation.util;

import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.abp;
import tb.abq;
import tb.gbh;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a<Float> ALPHA;
    public static final a<Float> ROTATION_X;
    public static final a<Float> ROTATION_Y;
    public static final a<Float> ROTATION_Z;
    public static final a<Float> SCALE_X;
    public static final a<Float> SCALE_Y;
    public static final a<Float> TRANSLATION_X;
    public static final a<Float> TRANSLATION_Y;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f12217a;
    public final int b;
    public final Property<View, T> c;
    public final abq<View> d;

    public ViewPropertyAnimator a(View view, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimator) ipChange.ipc$dispatch("c96bf90c", new Object[]{this, view, t});
        }
        return null;
    }

    static {
        kge.a(-1114735375);
        ALPHA = new a<Float>(1, View.ALPHA, abp.ALPHA) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().alpha(f.floatValue());
            }
        };
        SCALE_X = new a<Float>(8, View.SCALE_X, abp.SCALE_X) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().scaleX(f.floatValue());
            }
        };
        SCALE_Y = new a<Float>(16, View.SCALE_Y, abp.SCALE_Y) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().scaleY(f.floatValue());
            }
        };
        TRANSLATION_X = new a<Float>(32, View.TRANSLATION_X, abp.TRANSLATION_X) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().translationX(f.floatValue());
            }
        };
        TRANSLATION_Y = new a<Float>(64, View.TRANSLATION_Y, abp.TRANSLATION_Y) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().translationY(f.floatValue());
            }
        };
        ROTATION_X = new a<Float>(256, View.ROTATION_X, abp.ROTATION_X) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().rotationX(f.floatValue());
            }
        };
        ROTATION_Y = new a<Float>(512, View.ROTATION_Y, abp.ROTATION_Y) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().rotationY(f.floatValue());
            }
        };
        ROTATION_Z = new a<Float>(1024, View.ROTATION, abp.ROTATION) { // from class: com.taobao.android.dinamicx_v4.animation.util.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx_v4.animation.util.a
            public ViewPropertyAnimator a(View view, Float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ViewPropertyAnimator) ipChange.ipc$dispatch("bc3d93b5", new Object[]{this, view, f}) : view.animate().rotation(f.floatValue());
            }
        };
        f12217a = new HashMap<String, a>() { // from class: com.taobao.android.dinamicx_v4.animation.util.DXAnimationProperty$9
            {
                put(a.ALPHA.a(), a.ALPHA);
                put(a.SCALE_X.a(), a.SCALE_X);
                put(a.SCALE_Y.a(), a.SCALE_Y);
                put(a.TRANSLATION_X.a(), a.TRANSLATION_X);
                put(a.TRANSLATION_Y.a(), a.TRANSLATION_Y);
                put(a.ROTATION_X.a(), a.ROTATION_X);
                put(a.ROTATION_Y.a(), a.ROTATION_Y);
                put(a.ROTATION_Z.a(), a.ROTATION_Z);
            }
        };
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f46b8f6", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return f12217a.get(str);
        }
        return null;
    }

    public static <T> a<T> a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1b312c0f", new Object[]{str, cls});
        }
        a<T> a2 = a(str);
        if (a2 != null && a2.b() == cls) {
            return a2;
        }
        return null;
    }

    public a(int i, Property<View, T> property, abq<View> abqVar) {
        this.b = i;
        this.c = property;
        this.d = abqVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c.getName();
    }

    public Class<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[]{this}) : this.c.getType();
    }

    public void a(View view, boolean z) {
        DXWidgetNode referenceNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
            return;
        }
        DXWidgetNode b = gbh.b(view);
        if (!(b instanceof DXWidgetNode) || (referenceNode = b.getReferenceNode()) == null) {
            return;
        }
        if (z) {
            referenceNode.unsetStatAnimationFlag(this.b);
        } else {
            referenceNode.setStatAnimationFlag(this.b);
        }
    }
}
