package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.android.bindingx.core.internal.w;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, bbp> f25762a;
    private static final e b = new e();
    private static final f c = new f();
    private static final List<String> d = Arrays.asList("width", "height", com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_left, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_right, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_top, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom);
    private static final Handler e = new Handler(Looper.getMainLooper());

    public static /* synthetic */ double a(double d2, i.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c2bb47", new Object[]{new Double(d2), bVar})).doubleValue() : b(d2, bVar);
    }

    public static /* synthetic */ int a(Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7b3ce9a", new Object[]{map, str})).intValue() : b(map, str);
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
        f25762a = hashMap;
        hashMap.put("opacity", new g());
        f25762a.put("transform.translate", new n());
        f25762a.put("transform.translateX", new o());
        f25762a.put("transform.translateY", new p());
        f25762a.put("transform.scale", new k());
        f25762a.put("transform.scaleX", new l());
        f25762a.put("transform.scaleY", new m());
        f25762a.put("transform.rotate", new h());
        f25762a.put("transform.rotateZ", new h());
        f25762a.put("transform.rotateX", new i());
        f25762a.put("transform.rotateY", new j());
        f25762a.put("background-color", new a());
        f25762a.put("color", new b());
        f25762a.put("scroll.contentOffsetX", new c());
        f25762a.put("scroll.contentOffsetY", new d());
    }

    public static bbp a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbp) ipChange.ipc$dispatch("7c6d57e4", new Object[]{str});
        }
        bbp bbpVar = f25762a.get(str);
        if (bbpVar != null) {
            return bbpVar;
        }
        if (d.contains(str)) {
            b.a(str);
            return b;
        }
        com.alibaba.android.bindingx.core.h.d("unknown property [" + str + riy.ARRAY_END_STR);
        return c;
    }

    /* loaded from: classes2.dex */
    public static final class f implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bbp
        public void a(View view, String str, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            }
        }

        private f() {
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
    public static final class g implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private g() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final float doubleValue = (float) ((Double) obj).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.g.1
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
    public static final class n implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private n() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof ArrayList)) {
            } else {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() < 2 || !(arrayList.get(0) instanceof Double) || !(arrayList.get(1) instanceof Double)) {
                    return;
                }
                final double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                final double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.n.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        view.setTranslationX((float) bbt.a(doubleValue, bVar));
                        view.setTranslationY((float) bbt.a(doubleValue2, bVar));
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private o() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.o.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setTranslationX((float) bbt.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private p() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.p.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setTranslationY((float) bbt.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private k() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.k.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Pair<Float, Float> a2 = w.a(w.a(map, "transformOrigin"), view);
                        if (a2 != null) {
                            view.setPivotX(((Float) a2.first).floatValue());
                            view.setPivotY(((Float) a2.second).floatValue());
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
    public static final class l implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private l() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.l.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Pair<Float, Float> a2 = w.a(w.a(map, "transformOrigin"), view);
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
    public static final class m implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private m() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.m.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Pair<Float, Float> a2 = w.a(w.a(map, "transformOrigin"), view);
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
    public static final class h implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private h() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), bbt.a(map, Constants.Name.PERSPECTIVE));
                        Pair<Float, Float> a3 = w.a(w.a(map, "transformOrigin"), view);
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
    public static final class i implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private i() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), bbt.a(map, Constants.Name.PERSPECTIVE));
                        Pair<Float, Float> a3 = w.a(w.a(map, "transformOrigin"), view);
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
    public static final class j implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private j() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, final Object obj, i.b bVar, final Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                bbt.a(new Runnable() { // from class: tb.bbt.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int a2 = w.a(view.getContext(), bbt.a(map, Constants.Name.PERSPECTIVE));
                        Pair<Float, Float> a3 = w.a(w.a(map, "transformOrigin"), view);
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
    public static final class a implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Integer)) {
            } else {
                final int intValue = ((Integer) obj).intValue();
                bbt.a(new Runnable() { // from class: tb.bbt.a.1
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
    public static final class b implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Integer)) {
            } else {
                final int intValue = ((Integer) obj).intValue();
                bbt.a(new Runnable() { // from class: tb.bbt.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        View view2 = view;
                        if (!(view2 instanceof TextView)) {
                            return;
                        }
                        ((TextView) view2).setTextColor(intValue);
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private c() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setScrollX((int) bbt.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private d() {
        }

        @Override // tb.bbp
        public void a(final View view, String str, Object obj, final i.b bVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6744446", new Object[]{this, view, str, obj, bVar, map});
            } else if (!(obj instanceof Double)) {
            } else {
                final double doubleValue = ((Double) obj).doubleValue();
                bbt.a(new Runnable() { // from class: tb.bbt.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view.setScrollY((int) bbt.a(doubleValue, bVar));
                        }
                    }
                });
            }
        }
    }

    private static double b(double d2, i.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1637dc8", new Object[]{new Double(d2), bVar})).doubleValue() : bVar.a(d2, new Object[0]);
    }

    private static int b(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39066b39", new Object[]{map, str})).intValue();
        }
        if (map == null || StringUtils.isEmpty(str) || (obj = map.get(str)) == null) {
            return 0;
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    /* loaded from: classes2.dex */
    public static final class e implements bbp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f25767a;

        private e() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f25767a = str;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
            if (r12.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom) != false) goto L14;
         */
        @Override // tb.bbp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(final android.view.View r10, java.lang.String r11, java.lang.Object r12, com.alibaba.android.bindingx.core.i.b r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.bbt.e.a(android.view.View, java.lang.String, java.lang.Object, com.alibaba.android.bindingx.core.i$b, java.util.Map):void");
        }
    }
}
