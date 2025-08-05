package com.alibaba.android.bindingx.plugin.weex;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.android.bindingx.core.internal.w;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.transition.WXTransition;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXScroller;
import com.taobao.weex.ui.component.WXText;
import com.taobao.weex.ui.view.WXTextView;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, com.alibaba.android.bindingx.plugin.weex.h> f2272a;
    private static final k b = new k();
    private static final l c = new l();
    private static final List<String> d = Arrays.asList("width", "height", com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_left, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_right, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_top, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom);
    private static final Handler e = new Handler(Looper.getMainLooper());

    public static /* synthetic */ double a(double d2, i.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c2bb47", new Object[]{new Double(d2), bVar})).doubleValue() : b(d2, bVar);
    }

    public static /* synthetic */ View a(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1b6e4f", new Object[]{wXComponent}) : b(wXComponent);
    }

    public static /* synthetic */ void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b(runnable);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f2272a = hashMap;
        hashMap.put("opacity", new m());
        f2272a.put("transform.translate", new t());
        f2272a.put("transform.translateX", new u());
        f2272a.put("transform.translateY", new v());
        f2272a.put("transform.scale", new q());
        f2272a.put("transform.scaleX", new r());
        f2272a.put("transform.scaleY", new s());
        f2272a.put("transform.rotate", new n());
        f2272a.put("transform.rotateZ", new n());
        f2272a.put("transform.rotateX", new o());
        f2272a.put("transform.rotateY", new p());
        f2272a.put("background-color", new a());
        f2272a.put("color", new g());
        f2272a.put("scroll.contentOffset", new h());
        f2272a.put("scroll.contentOffsetX", new i());
        f2272a.put("scroll.contentOffsetY", new C0071j());
        f2272a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_left_radius, new d());
        f2272a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_right_radius, new e());
        f2272a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_left_radius, new b());
        f2272a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_right_radius, new c());
        f2272a.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius, new f());
    }

    public static com.alibaba.android.bindingx.plugin.weex.h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.bindingx.plugin.weex.h) ipChange.ipc$dispatch("eada8fb8", new Object[]{str});
        }
        com.alibaba.android.bindingx.plugin.weex.h hVar = f2272a.get(str);
        if (hVar != null) {
            return hVar;
        }
        if (d.contains(str)) {
            b.a(str);
            return b;
        }
        com.alibaba.android.bindingx.core.h.d("unknown property [" + str + riy.ARRAY_END_STR);
        return c;
    }

    /* loaded from: classes2.dex */
    public static final class l implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, View view, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            }
        }

        private l() {
        }
    }

    private static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            e.post(new com.alibaba.android.bindingx.core.j(runnable));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            e.removeCallbacksAndMessages(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private h() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
                return;
            }
            final View a2 = j.a(wXComponent);
            if (a2 == null) {
                return;
            }
            if (obj instanceof Double) {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a2.setScrollX((int) j.a(doubleValue, bVar));
                        a2.setScrollY((int) j.a(doubleValue, bVar));
                    }
                });
            } else if (!(obj instanceof ArrayList)) {
            } else {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() < 2 || !(arrayList.get(0) instanceof Double) || !(arrayList.get(1) instanceof Double)) {
                    return;
                }
                final double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                final double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.h.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a2.setScrollX((int) j.a(doubleValue2, bVar));
                        a2.setScrollY((int) j.a(doubleValue3, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private i() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
                return;
            }
            final View a2 = j.a(wXComponent);
            if (a2 == null || !(obj instanceof Double)) {
                return;
            }
            final double doubleValue = ((Double) obj).doubleValue();
            j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a2.setScrollX((int) j.a(doubleValue, bVar));
                    }
                }
            });
        }
    }

    /* renamed from: com.alibaba.android.bindingx.plugin.weex.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0071j implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0071j() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, View view, Object obj, final i.b bVar, Map<String, Object> map) {
            final View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double) || (a2 = j.a(wXComponent)) == null) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a2.setScrollY((int) j.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private m() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final float doubleValue = (float) ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.m.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setAlpha(doubleValue);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class t implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private t() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof ArrayList)) {
            } else {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() < 2 || !(arrayList.get(0) instanceof Double) || !(arrayList.get(1) instanceof Double)) {
                    return;
                }
                final double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                final double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.t.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        view.setTranslationX((float) j.a(doubleValue, bVar));
                        view.setTranslationY((float) j.a(doubleValue2, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class u implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private u() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.u.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setTranslationX((float) j.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class v implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private v() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.v.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setTranslationY((float) j.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private q() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.q.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), WXUtils.getInt(map.get(Constants.Name.PERSPECTIVE)));
                        Pair<Float, Float> a3 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != 0) {
                            view.setCameraDistance(a2);
                        }
                        if (a3 != null) {
                            view.setPivotX(((Float) a3.first).floatValue());
                            view.setPivotY(((Float) a3.second).floatValue());
                        }
                        Object obj2 = obj;
                        if (obj2 instanceof Double) {
                            float doubleValue = (float) ((Double) obj2).doubleValue();
                            view.setScaleX(doubleValue);
                            view.setScaleY(doubleValue);
                        } else if (!(obj2 instanceof ArrayList)) {
                        } else {
                            ArrayList arrayList = (ArrayList) obj2;
                            if (arrayList.size() < 2 || !(arrayList.get(0) instanceof Double) || !(arrayList.get(1) instanceof Double)) {
                                return;
                            }
                            double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                            double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                            view.setScaleX((float) doubleValue2);
                            view.setScaleY((float) doubleValue3);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private r() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.r.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Pair<Float, Float> a2 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != null) {
                            view.setPivotX(((Float) a2.first).floatValue());
                            view.setPivotY(((Float) a2.second).floatValue());
                        }
                        view.setScaleX((float) ((Double) obj).doubleValue());
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class s implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private s() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.s.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Pair<Float, Float> a2 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != null) {
                            view.setPivotX(((Float) a2.first).floatValue());
                            view.setPivotY(((Float) a2.second).floatValue());
                        }
                        view.setScaleY((float) ((Double) obj).doubleValue());
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private n() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.n.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), WXUtils.getInt(map.get(Constants.Name.PERSPECTIVE)));
                        Pair<Float, Float> a3 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != 0) {
                            view.setCameraDistance(a2);
                        }
                        if (a3 != null) {
                            view.setPivotX(((Float) a3.first).floatValue());
                            view.setPivotY(((Float) a3.second).floatValue());
                        }
                        view.setRotation((float) ((Double) obj).doubleValue());
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private o() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.o.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), WXUtils.getInt(map.get(Constants.Name.PERSPECTIVE)));
                        Pair<Float, Float> a3 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != 0) {
                            view.setCameraDistance(a2);
                        }
                        if (a3 != null) {
                            view.setPivotX(((Float) a3.first).floatValue());
                            view.setPivotY(((Float) a3.second).floatValue());
                        }
                        view.setRotationX((float) ((Double) obj).doubleValue());
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private p() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.p.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), WXUtils.getInt(map.get(Constants.Name.PERSPECTIVE)));
                        Pair<Float, Float> a3 = w.a(WXUtils.getString(map.get("transformOrigin"), null), view);
                        if (a2 != 0) {
                            view.setCameraDistance(a2);
                        }
                        if (a3 != null) {
                            view.setPivotX(((Float) a3.first).floatValue());
                            view.setPivotY(((Float) a3.second).floatValue());
                        }
                        view.setRotationY((float) ((Double) obj).doubleValue());
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2285a;

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f2285a = str;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, View view, Object obj, i.b bVar, Map<String, Object> map) {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double) || TextUtils.isEmpty(this.f2285a)) {
            } else {
                double doubleValue = ((Double) obj).doubleValue();
                String str = this.f2285a;
                String str2 = "width";
                switch (str.hashCode()) {
                    case -1502084711:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1221029593:
                        if (str.equals("height")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -887955139:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_right)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -396426912:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113126854:
                        if (str.equals(str2)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 143541095:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 679766083:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 941004998:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_left)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1970025654:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_top)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2086035242:
                        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        break;
                    case 1:
                        str2 = "height";
                        break;
                    case 2:
                        str2 = "marginLeft";
                        break;
                    case 3:
                        str2 = "marginRight";
                        break;
                    case 4:
                        str2 = "marginTop";
                        break;
                    case 5:
                        str2 = "marginBottom";
                        break;
                    case 6:
                        str2 = "paddingLeft";
                        break;
                    case 7:
                        str2 = "paddingRight";
                        break;
                    case '\b':
                        str2 = "paddingTop";
                        break;
                    case '\t':
                        str2 = "paddingBottom";
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                WXTransition.asynchronouslyUpdateLayout(wXComponent, str2, (float) j.a(doubleValue, bVar));
                this.f2285a = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Integer)) {
            } else {
                final int intValue = ((Integer) obj).intValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null) {
                            view.setBackgroundColor(intValue);
                        } else if (background instanceof BorderDrawable) {
                            ((BorderDrawable) background).setColor(intValue);
                        } else if (!(background instanceof ColorDrawable)) {
                        } else {
                            ((ColorDrawable) background).setColor(intValue);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private g() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(final WXComponent wXComponent, final View view, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Integer)) {
            } else {
                final int intValue = ((Integer) obj).intValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        WXTextView wXTextView = view;
                        if (wXTextView instanceof TextView) {
                            ((TextView) wXTextView).setTextColor(intValue);
                        } else if (!(wXComponent instanceof WXText) || !(wXTextView instanceof WXTextView)) {
                        } else {
                            try {
                                wXTextView.setTextColor(intValue);
                                view.invalidate();
                            } catch (Throwable th) {
                                com.alibaba.android.bindingx.core.h.a("can not update text color, try fallback to call the old API", th);
                                Layout textLayout = view.getTextLayout();
                                if (textLayout == null) {
                                    return;
                                }
                                TextPaint paint = textLayout.getPaint();
                                if (paint != null) {
                                    paint.setColor(intValue);
                                }
                                view.invalidate();
                            }
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private d() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) j.a(doubleValue, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private e() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) j.a(doubleValue, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) j.a(doubleValue, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private c() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        ((BorderDrawable) background).setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) j.a(doubleValue, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements com.alibaba.android.bindingx.plugin.weex.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private f() {
        }

        @Override // com.alibaba.android.bindingx.plugin.weex.h
        public void a(WXComponent wXComponent, final View view, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("915d8f7", new Object[]{this, wXComponent, view, obj, bVar, map});
            } else if (obj instanceof ArrayList) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() != 4) {
                    return;
                }
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        boolean z = arrayList.get(0) instanceof Double;
                        double d = mto.a.GEO_NOT_SUPPORT;
                        double doubleValue = z ? ((Double) arrayList.get(0)).doubleValue() : 0.0d;
                        double doubleValue2 = arrayList.get(1) instanceof Double ? ((Double) arrayList.get(1)).doubleValue() : 0.0d;
                        double doubleValue3 = arrayList.get(2) instanceof Double ? ((Double) arrayList.get(2)).doubleValue() : 0.0d;
                        if (arrayList.get(3) instanceof Double) {
                            d = ((Double) arrayList.get(3)).doubleValue();
                        }
                        BorderDrawable borderDrawable = (BorderDrawable) background;
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) j.a(doubleValue, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) j.a(doubleValue2, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) j.a(doubleValue3, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) j.a(d, bVar));
                    }
                });
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                j.a(new Runnable() { // from class: com.alibaba.android.bindingx.plugin.weex.j.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Drawable background = view.getBackground();
                        if (background == null || !(background instanceof BorderDrawable)) {
                            return;
                        }
                        BorderDrawable borderDrawable = (BorderDrawable) background;
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT, (float) j.a(doubleValue, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT, (float) j.a(doubleValue, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, (float) j.a(doubleValue, bVar));
                        borderDrawable.setBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, (float) j.a(doubleValue, bVar));
                    }
                });
            }
        }
    }

    private static double b(double d2, i.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1637dc8", new Object[]{new Double(d2), bVar})).doubleValue() : bVar.a(d2, new Object[0]);
    }

    private static View b(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5cdae650", new Object[]{wXComponent});
        }
        if (!(wXComponent instanceof WXScroller)) {
            com.alibaba.android.bindingx.core.h.d("scroll offset only support on Scroller Component");
            return null;
        }
        return ((WXScroller) wXComponent).getInnerView();
    }
}
