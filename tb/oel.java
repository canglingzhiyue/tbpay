package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class oel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1641857054);
    }

    public static /* synthetic */ List a(Component component, List list, boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("93b2c3c6", new Object[]{component, list, new Boolean(z), new Integer(i), new Long(j)}) : b(component, list, z, i, j);
    }

    public static /* synthetic */ List a(aa aaVar, oeh oehVar, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a5350bbb", new Object[]{aaVar, oehVar, dVar, new Boolean(z)}) : b(aaVar, oehVar, dVar, z);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f31976a;
        private a b;
        private oej c;

        static {
            kge.a(-1630639307);
        }

        public b(a aVar) {
            this.b = aVar;
        }

        public void a(oej oejVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7bf5104", new Object[]{this, oejVar});
            } else {
                this.c = oejVar;
            }
        }

        public void a(AnimatorSet animatorSet, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94b207ba", new Object[]{this, animatorSet, new Integer(i)});
            } else if (animatorSet == null || animatorSet.getChildAnimations().isEmpty()) {
            } else {
                this.f31976a++;
                animatorSet.addListener(new c(i, this.c) { // from class: tb.oel.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.oel.c
                    public void a(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cb2ed485", new Object[]{this, animator});
                        } else {
                            b.this.a();
                        }
                    }
                });
            }
        }

        public void a() {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f31976a--;
            if (this.f31976a != 0 || (aVar = this.b) == null) {
                return;
            }
            aVar.a();
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f31978a;
        private oej b;

        static {
            kge.a(-1008757864);
            kge.a(1420754541);
        }

        public abstract void a(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        public c(int i, oej oejVar) {
            this.f31978a = i;
            this.b = oejVar;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b == null) {
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(oel.a(this.b.f, this.b.e, (d) null, oeb.cf()));
                animatorSet.playTogether(oel.a(this.b.f.I(), (List) arrayList, false, 0, 0L));
                animatorSet.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            int i = this.f31978a;
            if (i > 0) {
                this.f31978a = i - 1;
                if (oeb.a("resetKeyFrameAnimation", false)) {
                    a();
                }
                animator.start();
                return;
            }
            a(animator);
        }
    }

    public static oem a(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oem) ipChange.ipc$dispatch("d6073cb5", new Object[]{aaVar, str});
        }
        if ("flip-from-left".equals(str)) {
            return oez.a(aaVar, -180.0f, 0.0f, false);
        }
        if ("flip-from-right".equals(str)) {
            return oez.a(aaVar, 180.0f, 0.0f, false);
        }
        if ("flip-from-top".equals(str)) {
            return oey.a(aaVar, -180.0f, 0.0f, false);
        }
        if (!"flip-from-bottom".equals(str)) {
            return null;
        }
        return oey.a(aaVar, 180.0f, 0.0f, false);
    }

    public static Animator a(final TextComponent textComponent, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("640921b1", new Object[]{textComponent, new Float(f), new Float(f2)});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.oel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextComponent.this.ensureTextLayoutHelper(false);
                TextComponent.this.setFontSize(floatValue);
                TextComponent.this.layoutText();
                TextComponent.this.updateTextLayout();
            }
        });
        return ofFloat;
    }

    /* loaded from: classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31979a = Integer.MIN_VALUE;
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = Integer.MIN_VALUE;
        public int e;
        public int f;
        public ogl g;

        static {
            kge.a(555702917);
        }

        public static d a(int i, int i2, ogl oglVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ed52a74c", new Object[]{new Integer(i), new Integer(i2), oglVar});
            }
            d dVar = new d();
            dVar.g = oglVar;
            dVar.e = i;
            dVar.f = i2;
            return dVar;
        }

        public static d a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("407f79c8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            d dVar = new d();
            dVar.f31979a = i;
            dVar.b = i2;
            dVar.c = i3;
            dVar.d = i4;
            return dVar;
        }
    }

    public static AnimatorSet a(ab abVar, int i, oeg oegVar, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("742714ce", new Object[]{abVar, new Integer(i), oegVar, dVar}) : a(abVar, i, oegVar, dVar, (b) null);
    }

    public static AnimatorSet a(ab abVar, int i, oeg oegVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("8b4b55f4", new Object[]{abVar, new Integer(i), oegVar}) : a(abVar, i, oegVar, (b) null);
    }

    public static AnimatorSet a(ab abVar, int i, oeg oegVar, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("f9e78c90", new Object[]{abVar, new Integer(i), oegVar, bVar}) : a(abVar, i, oegVar, (d) null, bVar);
    }

    private static AnimatorSet a(ab abVar, int i, final oeg oegVar, final d dVar, final b bVar) {
        oej oejVar;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("546e02ea", new Object[]{abVar, new Integer(i), oegVar, dVar, bVar});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        boolean z = oegVar.g != null && !oegVar.g.isEmpty();
        if (!z) {
            animatorSet.setDuration(oegVar.f31970a);
            animatorSet.setInterpolator(a(oegVar));
        }
        animatorSet.setStartDelay(oegVar.b);
        final aa a2 = abVar.a(oegVar.d != 0 ? oegVar.d : i);
        if (a2 == null) {
            return animatorSet;
        }
        if (oegVar.f == null) {
            oegVar.f = new oei();
        }
        oej oejVar2 = null;
        if (z) {
            i2 = oegVar.a();
            if (i2 > 0) {
                oejVar2 = oej.a(a2);
            }
            ArrayList arrayList = new ArrayList();
            for (oej oejVar3 : oegVar.g) {
                ArrayList arrayList2 = new ArrayList();
                if (!StringUtils.isEmpty(oejVar3.d.b)) {
                    arrayList2.add(a(a2, oejVar3.d.b));
                }
                if (oejVar3.e != null) {
                    arrayList2.addAll(b(a2, oejVar3.e, dVar, true));
                }
                if (!arrayList2.isEmpty()) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    AnimatorSet.Builder play = animatorSet2.play(((oem) arrayList2.get(i3)).a());
                    for (int i4 = 1; i4 < arrayList2.size(); i4++) {
                        play.with(((oem) arrayList2.get(i4)).a());
                    }
                    animatorSet2.setStartDelay(oejVar3.f31973a);
                    animatorSet2.setDuration(oejVar3.c);
                    arrayList.add(animatorSet2);
                }
                i3 = 0;
            }
            animatorSet.playTogether(arrayList);
            oejVar = oejVar2;
        } else {
            if (oegVar.h != null || !StringUtils.isEmpty(oegVar.f.b) || dVar != null) {
                ArrayList arrayList3 = new ArrayList();
                if (!StringUtils.isEmpty(oegVar.f.b)) {
                    arrayList3.add(a(a2, oegVar.f.b));
                }
                arrayList3.addAll(b(a2, oegVar.h, dVar, oeb.cf()));
                animatorSet.playTogether(b(a2.I(), arrayList3, oegVar.f.d, oegVar.a(), oegVar.f31970a));
            }
            oejVar = null;
            i2 = 0;
        }
        if (oegVar.j != null) {
            animatorSet.addListener(new c(i2, oejVar) { // from class: tb.oel.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oel.c
                public void a(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cb2ed485", new Object[]{this, animator});
                        return;
                    }
                    List a3 = oel.a(a2.I(), oel.a(a2, oegVar.j, dVar, oeb.cf()), false, 0, oegVar.i);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setDuration(oegVar.i);
                    animatorSet3.setStartDelay(0L);
                    animatorSet3.playTogether(a3);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(animatorSet3, 0);
                    }
                    animatorSet3.start();
                }
            });
        } else if (bVar != null) {
            bVar.a(oejVar);
            bVar.a(animatorSet, i2);
        }
        return animatorSet;
    }

    public static AnimatorSet a(ab abVar, int i, List<oeg> list, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("78942f2c", new Object[]{abVar, new Integer(i), list, new Boolean(z), bVar});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(a(abVar, i, list.get(i2), bVar));
        }
        if (z) {
            animatorSet.playSequentially(arrayList);
        } else {
            animatorSet.playTogether(arrayList);
        }
        if (bVar != null) {
            bVar.a(animatorSet, 0);
        }
        return animatorSet;
    }

    private static List<oem> b(aa aaVar, oeh oehVar, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5d21793c", new Object[]{aaVar, oehVar, dVar, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        View x = aaVar.x();
        if (x == null) {
            return arrayList;
        }
        if (oehVar != null) {
            h(arrayList, aaVar, x, oehVar, dVar, z);
            f(arrayList, aaVar, x, oehVar, dVar, z);
            e(arrayList, aaVar, x, oehVar, dVar, z);
            d(arrayList, aaVar, x, oehVar, dVar, z);
            c(arrayList, aaVar, x, oehVar, dVar, z);
            b(arrayList, aaVar, x, oehVar, dVar, z);
            a(arrayList, aaVar, x, oehVar, dVar, z);
            g(arrayList, aaVar, x, oehVar, dVar, z);
            if (oehVar.h != null) {
                e(arrayList, aaVar, x, oehVar.h, dVar, z);
                d(arrayList, aaVar, x, oehVar.h, dVar, z);
                c(arrayList, aaVar, x, oehVar.h, dVar, z);
                b(arrayList, aaVar, x, oehVar.h, dVar, z);
                a(arrayList, aaVar, x, oehVar.h, dVar, z);
            }
        }
        if (dVar != null) {
            a(arrayList, aaVar, x, dVar);
        }
        return arrayList;
    }

    private static void a(List<oem> list, aa aaVar, View view, d dVar) {
        oep a2;
        oew a3;
        ofc a4;
        oeu a5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b6628b", new Object[]{list, aaVar, view, dVar});
            return;
        }
        if (dVar.f31979a != Integer.MIN_VALUE && (a5 = oeu.a(aaVar, view.getLeft(), dVar.f31979a, false)) != null) {
            list.add(a5);
        }
        if (dVar.b != Integer.MIN_VALUE && (a4 = ofc.a(aaVar, view.getTop(), dVar.b, false)) != null) {
            list.add(a4);
        }
        if (dVar.c != Integer.MIN_VALUE && (a3 = oew.a(aaVar, view.getWidth(), aaVar.G().f20361a, view.getRight(), dVar.c, false)) != null) {
            list.add(a3);
        }
        if (dVar.d == Integer.MIN_VALUE || (a2 = oep.a(aaVar, view.getHeight(), aaVar.G().b, view.getBottom(), dVar.d, false)) == null) {
            return;
        }
        list.add(a2);
    }

    private static void a(List<oem> list, aa aaVar, View view, ofg ofgVar, d dVar, boolean z) {
        ofe a2;
        ofd a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591e9ba9", new Object[]{list, aaVar, view, ofgVar, dVar, new Boolean(z)});
            return;
        }
        PointF pointF = ofgVar.e;
        if (pointF == null) {
            return;
        }
        if (pointF.x != -2.14748365E9f) {
            if (dVar != null) {
                a3 = ofd.a(aaVar, pointF.x, 0.0f, false);
            } else {
                a3 = ofd.a(aaVar, view.getTranslationX(), pointF.x, z);
            }
            if (a3 != null) {
                list.add(a3);
            }
        }
        if (pointF.y == -2.14748365E9f) {
            return;
        }
        if (dVar != null) {
            a2 = ofe.a(aaVar, pointF.y, 0.0f, false);
        } else {
            a2 = ofe.a(aaVar, view.getTranslationY(), pointF.y, z);
        }
        if (a2 == null) {
            return;
        }
        list.add(a2);
    }

    private static void b(List<oem> list, aa aaVar, View view, ofg ofgVar, d dVar, boolean z) {
        ofb a2;
        ofa a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca63eaa", new Object[]{list, aaVar, view, ofgVar, dVar, new Boolean(z)});
            return;
        }
        PointF pointF = ofgVar.d;
        if (pointF == null) {
            return;
        }
        if (pointF.x >= 0.0f) {
            if (dVar != null) {
                a3 = ofa.a(aaVar, pointF.x, 1.0f, false);
            } else {
                a3 = ofa.a(aaVar, view.getScaleX(), pointF.x, z);
            }
            if (a3 != null) {
                list.add(a3);
            }
        }
        if (pointF.y < 0.0f) {
            return;
        }
        if (dVar != null) {
            a2 = ofb.a(aaVar, pointF.y, 1.0f, false);
        } else {
            a2 = ofb.a(aaVar, view.getScaleY(), pointF.y, z);
        }
        if (a2 == null) {
            return;
        }
        list.add(a2);
    }

    private static void c(List<oem> list, aa aaVar, View view, ofg ofgVar, d dVar, boolean z) {
        oez a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602de1ab", new Object[]{list, aaVar, view, ofgVar, dVar, new Boolean(z)});
        } else if (ofgVar.b == -2.14748365E9f) {
        } else {
            if (dVar != null) {
                a2 = oez.a(aaVar, ofgVar.b, 0.0f, false);
            } else {
                a2 = oez.a(aaVar, view.getRotationY(), ofgVar.b, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void d(List<oem> list, aa aaVar, View view, ofg ofgVar, d dVar, boolean z) {
        oey a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b584ac", new Object[]{list, aaVar, view, ofgVar, dVar, new Boolean(z)});
        } else if (ofgVar.f31986a == -2.14748365E9f) {
        } else {
            if (dVar != null) {
                a2 = oey.a(aaVar, ofgVar.f31986a, 0.0f, false);
            } else {
                a2 = oey.a(aaVar, view.getRotationX(), ofgVar.f31986a, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void e(List<oem> list, aa aaVar, View view, ofg ofgVar, d dVar, boolean z) {
        oex a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673d27ad", new Object[]{list, aaVar, view, ofgVar, dVar, new Boolean(z)});
        } else if (ofgVar.c == -2.14748365E9f) {
        } else {
            if (dVar != null) {
                a2 = oex.a(aaVar, ofgVar.c, 0.0f, false);
            } else {
                a2 = oex.a(aaVar, view.getRotation(), ofgVar.c, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void a(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d168280b", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
            return;
        }
        oev a2 = oev.a(oehVar.d);
        a2.a(aaVar, 1.0f, 2.0f);
        list.add(a2);
    }

    private static void b(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        ofd a2;
        ofe a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4efcb0c", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
            return;
        }
        PointF pointF = oehVar.c;
        if (pointF == null) {
            return;
        }
        if (dVar != null) {
            a2 = ofd.a(aaVar, pointF.x, 0.0f, false);
        } else {
            a2 = ofd.a(aaVar, view.getTranslationX(), view.getTranslationX() + pointF.x, z);
        }
        if (a2 != null) {
            list.add(a2);
        }
        if (dVar != null) {
            a3 = ofe.a(aaVar, pointF.y, 0.0f, false);
        } else {
            a3 = ofe.a(aaVar, view.getTranslationY(), view.getTranslationY() + pointF.y, z);
        }
        if (a3 == null) {
            return;
        }
        list.add(a3);
    }

    private static void c(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        oen a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8776e0d", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.e == -1.0f) {
        } else {
            if (dVar != null) {
                a2 = oen.a(aaVar, oehVar.e, dVar.g.aT, false);
            } else {
                a2 = oen.a(aaVar, view.getAlpha(), oehVar.e, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void d(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        oes a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbff110e", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.b == -1) {
        } else {
            if (dVar != null) {
                a2 = oes.a(aaVar, oehVar.b, dVar.f, false);
            } else {
                a2 = oes.a(aaVar, view.getHeight(), oehVar.b, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void e(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        off a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df86b40f", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.f31971a == -1) {
        } else {
            if (dVar != null) {
                a2 = off.a(aaVar, oehVar.f31971a, dVar.e, false);
            } else {
                a2 = off.a(aaVar, view.getWidth(), oehVar.f31971a, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void f(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        oeo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30e5710", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.f == 1) {
        } else {
            if (dVar != null) {
                a2 = oeo.a(aaVar, oehVar.f, dVar.g.aE, false);
            } else {
                a2 = oeo.a(aaVar, oeo.a(view), oehVar.f, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void h(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        tft a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1d9d12", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.i == -1) {
        } else {
            if (dVar != null) {
                a2 = tft.a(aaVar, oehVar.i, dVar.g.ag, false);
            } else {
                float paddingLeft = view.getPaddingLeft();
                if (aaVar.I() instanceof u) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getChildCount() > 0) {
                        paddingLeft = viewGroup.getChildAt(0).getPaddingLeft();
                    }
                }
                a2 = tft.a(aaVar, (int) paddingLeft, oehVar.i, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static void g(List<oem> list, aa aaVar, View view, oeh oehVar, d dVar, boolean z) {
        oeq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e695fa11", new Object[]{list, aaVar, view, oehVar, dVar, new Boolean(z)});
        } else if (oehVar.g == -1) {
        } else {
            if (dVar != null) {
                a2 = oeq.a(aaVar, oehVar.g, dVar.g.aJ, false);
            } else {
                a2 = oeq.a(aaVar, (int) oeq.a(view), oehVar.g, z);
            }
            if (a2 == null) {
                return;
            }
            list.add(a2);
        }
    }

    private static List<Animator> b(Component component, List<oem> list, boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92d95325", new Object[]{component, list, new Boolean(z), new Integer(i), new Long(j)});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            Iterator<oem> it = list.iterator();
            while (it.hasNext()) {
                oem next = it.next();
                if (next == null || next.a() == null) {
                    it.remove();
                } else {
                    Animator a2 = next.a();
                    if (a2 instanceof ValueAnimator) {
                        ValueAnimator valueAnimator = (ValueAnimator) a2;
                        valueAnimator.setRepeatCount(i);
                        valueAnimator.setRepeatMode(z ? 2 : 1);
                    }
                    a2.setDuration(j);
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    private static Interpolator a(oeg oegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("757bb07c", new Object[]{oegVar});
        }
        return a((oegVar == null || oegVar.f == null || StringUtils.isEmpty(oegVar.f.f31972a)) ? "linear" : oegVar.f.f31972a);
    }

    public static Interpolator a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("1042ff47", new Object[]{str});
        }
        if (str == null) {
            str = "linear";
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1965120668:
                if (str.equals("ease-in")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 0;
                    break;
                }
                break;
            case -789192465:
                if (str.equals("ease-out")) {
                    c2 = 2;
                    break;
                }
                break;
            case -361990811:
                if (str.equals("ease-in-out")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3105774:
                if (str.equals("ease")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new LinearInterpolator();
        }
        if (c2 == 1 || c2 == 2) {
            return new DecelerateInterpolator();
        }
        if (c2 == 3) {
            return new AccelerateInterpolator();
        }
        if (c2 == 4) {
            return new AccelerateDecelerateInterpolator();
        }
        return new LinearInterpolator();
    }
}
