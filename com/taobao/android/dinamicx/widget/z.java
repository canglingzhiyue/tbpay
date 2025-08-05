package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class z implements bi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DX_FLATTEN_PROPERTY_MASK_NODE_ANIMATION = 2;

    /* renamed from: a  reason: collision with root package name */
    public DXWidgetNode f12215a;
    public List<z> b = new ArrayList();
    public z c;
    public float d;
    public int e;
    public int f;
    public WeakReference<View> g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aw l;

    static {
        kge.a(2113081530);
        kge.a(33300609);
    }

    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e544055", new Object[]{this, zVar});
        } else if (zVar == null) {
        } else {
            this.b.add(zVar);
            zVar.c = this;
        }
    }

    public z(DXWidgetNode dXWidgetNode) {
        this.d = 1.0f;
        this.e = 1;
        this.f = -1;
        this.f12215a = dXWidgetNode;
        if (dXWidgetNode != null) {
            this.f = dXWidgetNode.getAccessibility();
            this.d = dXWidgetNode.getAlpha();
            this.e = dXWidgetNode.getEnabled();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.h = i;
        this.j = i3;
        this.i = i2;
        this.k = i4;
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (d() == null) {
            a(this.f12215a.createView(context));
        }
        return d();
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue() : this.h;
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue() : this.i;
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getMeasuredWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b0f3e64", new Object[]{this})).intValue() : this.f12215a.getMeasuredWidth();
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getMeasuredHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e10b2f7d", new Object[]{this})).intValue() : this.f12215a.getMeasuredHeight();
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.d;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public WeakReference<View> u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("6d795d4a", new Object[]{this}) : this.g;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.g = new WeakReference<>(view);
        }
    }

    public DXWidgetNode e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("ce17f8b", new Object[]{this}) : this.f12215a;
    }

    public List<z> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.b;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.b.size();
    }

    public z c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("84b488ca", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i);
        }
        return null;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f12215a.getAutoId();
    }

    public z i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("a19ee793", new Object[]{this}) : this.c;
    }

    public int a(z zVar, z zVar2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13aaba75", new Object[]{this, zVar, zVar2})).intValue();
        }
        if (!(e() instanceof m) || zVar2 == null) {
            return -1;
        }
        while (true) {
            if (i >= g()) {
                i = -1;
                break;
            } else if (c(i).h() == zVar2.h()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            d(zVar2.h());
            a(zVar, i);
        }
        return i;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int g = g();
        if (this.b == null || g == 0) {
            return;
        }
        for (int i2 = 0; i2 < g; i2++) {
            if (this.b.get(i2).h() == i) {
                this.b.remove(i2);
                return;
            }
        }
    }

    public void a(z zVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc343d4e", new Object[]{this, zVar, new Integer(i)});
        } else if (zVar == null || zVar == this || i > g()) {
        } else {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(i, zVar);
            zVar.c = this;
            DXWidgetNode e = zVar.e();
            if (e().getDXRuntimeContext() == null) {
                return;
            }
            e.setDXRuntimeContext(e().getDXRuntimeContext().a(e));
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.f12215a.getSourceAutoId();
    }

    public Class k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("db7dc41f", new Object[]{this}) : this.f12215a.getClass();
    }

    public DXWidgetNode l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("e97c5a12", new Object[]{this}) : this.f12215a.getSourceWidget();
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            e().setRealViewLayoutParam(view);
        }
    }

    public boolean e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aef4f61b", new Object[]{this, new Integer(i)})).booleanValue() : this.f12215a.getStatInPrivateFlags(i);
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            this.f12215a.bindEvent(context);
        }
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        this.f12215a.setStatFlag(256);
        d(context);
    }

    public void a(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fcc778", new Object[]{this, dXRenderOptions});
        } else if (dXRenderOptions == null || e() == null) {
        } else {
            e().bindRenderOptions(dXRenderOptions);
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.f12215a.unsetStatFlag(i);
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            View d = d();
            if (d == null) {
                return;
            }
            boolean statInPrivateFlags = e().getStatInPrivateFlags(256);
            DXWidgetNode e = e();
            if (statInPrivateFlags) {
                DXTraceUtil.a(" onRenderView Before ");
                e.setRealViewVisibility(d, e.getVisibility());
                if (b() == 1) {
                    z = true;
                }
                if (d.isEnabled() != z) {
                    d.setEnabled(z);
                }
                if (!n()) {
                    c(d);
                } else {
                    e.renderAnimationSupportProperty(d);
                }
                e.bindAccessibilityToView(d, c());
                e.setBackground(d);
                DXTraceUtil.a();
                e.onRenderView(context, d);
                DXTraceUtil.a(" onRenderView End ");
                if (Build.VERSION.SDK_INT >= 17 && (d instanceof ViewGroup) && d.getLayoutDirection() != e.getDirection()) {
                    d.setLayoutDirection(e.getDirection());
                }
                e.setForceDark(d);
                DXTraceUtil.a();
            }
            e.unsetStatFlag(256);
            e.setStatFlag(512);
        } catch (Exception e2) {
            com.taobao.android.dinamicx.exception.a.b(e2);
            DXRuntimeContext dXRuntimeContext = e().getDXRuntimeContext();
            if (dXRuntimeContext == null || dXRuntimeContext.n() == null) {
                return;
            }
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, 90002);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(e2);
            dXRuntimeContext.n().c.add(aVar);
        }
    }

    public void a(aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baef036b", new Object[]{this, awVar});
        } else {
            this.l = awVar;
        }
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.f12068a;
        }
        return 0.0f;
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (n()) {
        } else {
            if (view.getAlpha() != a()) {
                view.setAlpha(a());
            }
            if (m() != view.getTranslationX()) {
                view.setTranslationX(m());
            }
            if (o() != view.getTranslationY()) {
                view.setTranslationY(o());
            }
            if (r() != view.getRotationX()) {
                view.setRotationX(r());
            }
            if (s() != view.getRotationY()) {
                view.setRotationY(s());
            }
            if (t() != view.getRotation()) {
                view.setRotation(t());
            }
            if (p() != view.getScaleX()) {
                view.setScaleX(p());
            }
            if (q() == view.getScaleY()) {
                return;
            }
            view.setScaleY(q());
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f12215a.isV4Node();
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b566", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.b;
        }
        return 0.0f;
    }

    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fcce7", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.c;
        }
        return 1.0f;
    }

    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de468", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.d;
        }
        return 1.0f;
    }

    public float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.e;
        }
        return 0.0f;
    }

    public float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136a", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.f;
        }
        return 0.0f;
    }

    public float t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aeb", new Object[]{this})).floatValue();
        }
        aw awVar = this.l;
        if (awVar != null) {
            return awVar.g;
        }
        return 0.0f;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        if (e() != null) {
            return e().getUserId();
        }
        return null;
    }

    public DXWidgetNode a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("8fea1d51", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(v())) {
            return e();
        }
        if (e() != null && a(e())) {
            return e().queryWTByUserId(str);
        }
        List<z> list = this.b;
        if (list != null) {
            for (z zVar : list) {
                DXWidgetNode a2 = zVar.a(str);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public DXWidgetNode b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7315d092", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(v())) {
            return e();
        }
        if (e() != null && a(e())) {
            return e().queryWTByUserId(str);
        }
        List<z> list = this.b;
        if (list != null) {
            for (z zVar : list) {
                DXWidgetNode a2 = zVar.a(str);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    private boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{this, dXWidgetNode})).booleanValue() : (dXWidgetNode instanceof DXAbsContainerBaseLayout) || (dXWidgetNode instanceof v);
    }
}
