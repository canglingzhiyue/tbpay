package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.h;
import com.taobao.tao.flexbox.layoutmanager.container.k;
import com.taobao.tao.flexbox.layoutmanager.container.l;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohb;

/* loaded from: classes5.dex */
public class d implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f13198a;
    private f b;
    private List<Pair<View, String>> c;
    private View d;
    private boolean e;
    private boolean f;
    private l.a g;

    static {
        kge.a(1385245597);
        kge.a(-1310744837);
    }

    public static /* synthetic */ List a(List list, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1fdae4e", new Object[]{list, view}) : b(list, view);
    }

    public static /* synthetic */ void a(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bb17ef", new Object[]{view, rect});
        } else {
            b(view, rect);
        }
    }

    public static /* synthetic */ void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e78b84", new Object[]{obj, arrayList, arrayList2});
        } else {
            c(obj, arrayList, arrayList2);
        }
    }

    public static /* synthetic */ void a(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{list, new Integer(i)});
        } else {
            b(list, i);
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9addb732", new Object[]{dVar})).booleanValue() : dVar.e;
    }

    public static void a(f fVar, f fVar2, List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca22399", new Object[]{fVar, fVar2, list});
        } else if (fVar2 instanceof b) {
            if (list != null && !list.isEmpty()) {
                ogg.a("PageTransition prePageLeaveAndNewPageEnter with shareview");
                d dVar = new d(fVar, fVar2, list, false);
                b bVar = (b) fVar2;
                bVar.setPageTransition(dVar);
                fVar2.getPageContainer().c().addView(bVar.a());
                fVar2.postponedEnterTransition();
                return;
            }
            ogg.a("PageTransition prePageLeaveAndNewPageEnter with no shareview");
            fVar2.getPageContainer().c().addView(((b) fVar2).a());
            if (fVar != null || fVar2.getPageContainer().a()) {
                return;
            }
            fVar2.getActivity().postponeEnterTransition();
        } else if (fVar2 == null || !"FullPage".equals(fVar2.getClass().getSimpleName())) {
        } else {
            if (list != null && !list.isEmpty()) {
                ogg.a("PageTransition prePageLeaveAndNewPageEnter with shareview");
                fVar2.setPageTransition(new d(fVar, fVar2, list, false));
                fVar2.getPageContainer().c().addView(fVar2.getDecorView());
                fVar2.postponedEnterTransition();
                return;
            }
            ogg.a("PageTransition prePageLeaveAndNewPageEnter with no shareview");
            fVar2.getPageContainer().c().addView(fVar2.getDecorView());
            if (fVar != null || fVar2.getPageContainer().a()) {
                return;
            }
            fVar2.getActivity().postponeEnterTransition();
        }
    }

    public static void a(f fVar, final f fVar2, boolean z, final h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aefad", new Object[]{fVar, fVar2, new Boolean(z), aVar});
            return;
        }
        ogg.a("PageTransition popPage " + fVar2);
        if (fVar2 == null) {
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!f.this.isRootPage(true)) {
                    f.this.getPageContainer().c().removeView(f.this.getDecorView());
                }
                h.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        };
        final boolean a2 = oeb.a("syncRemovePopView", false);
        if (z) {
            new d(fVar, fVar2, null, true).a(new h.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.h.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        oec.a(runnable, a2);
                    }
                }
            });
        } else {
            oec.a(runnable, a2);
        }
    }

    public d(f fVar, f fVar2, List<Pair<View, String>> list, boolean z) {
        this.f13198a = fVar;
        this.b = fVar2;
        this.c = list;
        this.e = z;
        if (!z && fVar != null) {
            fVar.setCurrentSharedViews(list);
        }
        this.f = z && fVar2.getPageContainer().a() && fVar2.getPageContainer().h().isEmpty();
        if (this.f) {
            this.g = fVar2.getPageContainer().b();
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.h
    public void a(View view, h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3f2eeb", new Object[]{this, view, aVar});
            return;
        }
        ogg.a("PageTransition startTransition");
        b(view, aVar);
    }

    public void a(h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab31d4e9", new Object[]{this, aVar});
        } else if (this.b.startExitTransition(aVar)) {
        } else {
            if (this.b.getPageContainer().a() || !this.b.getPageContainer().h().isEmpty()) {
                a((View) null, aVar);
            } else if (aVar == null) {
            } else {
                aVar.a();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.h
    public List<View> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<Pair<View, String>> list = this.c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Pair<View, String> pair : this.c) {
                arrayList.add(pair.first);
            }
            return arrayList;
        }
        return k.a().b();
    }

    private void b(View view, final h.a aVar) {
        f fVar;
        f fVar2;
        List list;
        ArrayList arrayList;
        boolean z;
        ArrayList<View> arrayList2;
        ArrayMap arrayMap;
        ArrayList arrayList3;
        ArrayList arrayList4;
        f fVar3;
        Transition transition;
        Transition transition2;
        List<Pair<View, String>> list2;
        l.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af565c4a", new Object[]{this, view, aVar});
            return;
        }
        ogg.a("PageTransition startTransitionInternal");
        this.d = view;
        if (this.e) {
            fVar = this.f13198a;
            fVar2 = this.b;
        } else {
            fVar = this.b;
            fVar2 = this.f13198a;
        }
        final f fVar4 = fVar;
        f fVar5 = fVar2;
        if (fVar4 != null) {
            fVar4.getDecorView().setVisibility(0);
        }
        if (fVar5 != null) {
            fVar5.onBeforeStartTransition(this, false);
        }
        if (fVar4 != null) {
            fVar4.onBeforeStartTransition(this, true);
        }
        Transition exitTransition = fVar5 != null ? fVar5.getExitTransition() : null;
        Transition enterTransition = fVar4 != null ? fVar4.getEnterTransition() : null;
        TransitionSet sharedElementReturnTransition = this.e ? fVar5.getSharedElementReturnTransition() : fVar4.getSharedElementEnterTransition();
        if (sharedElementReturnTransition != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(sharedElementReturnTransition);
            sharedElementReturnTransition = transitionSet;
        }
        boolean a2 = a(sharedElementReturnTransition, "MaterialContainerTransform");
        if (this.e) {
            if (a(sharedElementReturnTransition, "CornerRadiusTransition")) {
                sharedElementReturnTransition = null;
            }
            if (a2) {
                list = new ArrayList();
                list.add(new Pair(fVar5.getDecorView(), fVar5.getDecorView().getTransitionName()));
            } else {
                List<aa> a3 = fVar5.getTNodeEngine() != null ? fVar5.getTNodeEngine().s().a() : null;
                if (a3 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (aa aaVar : a3) {
                        View transitionView = aaVar.I().getTransitionView();
                        arrayList5.add(new Pair(transitionView, transitionView.getTransitionName()));
                    }
                    list = arrayList5;
                } else {
                    list = null;
                }
            }
        } else {
            list = this.c;
        }
        Transition transition3 = sharedElementReturnTransition;
        if (this.e) {
            if (fVar4 != null) {
                list2 = fVar4.getCurrentSharedViews();
            } else {
                list2 = (!this.f || (aVar2 = this.g) == null) ? null : aVar2.b;
            }
            if (list2 != null && list2.size() > 0) {
                arrayList = new ArrayList();
                if (oeb.bi()) {
                    for (Pair<View, String> pair : list2) {
                        arrayList.add(pair.first);
                    }
                } else {
                    arrayList.add(list2.get(0).first);
                }
            }
            arrayList = null;
        } else {
            if (view != null) {
                arrayList = new ArrayList();
                arrayList.add(view);
            }
            arrayList = null;
        }
        final ArrayList arrayList6 = new ArrayList();
        final ArrayList arrayList7 = new ArrayList();
        final View view2 = new View(this.e ? fVar5.getActivity() : fVar4.getActivity());
        ArrayMap arrayMap2 = new ArrayMap();
        if (transition3 == null || list == null || list.isEmpty() || arrayList == null) {
            z = a2;
            arrayList2 = null;
        } else {
            ArrayList arrayList8 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                arrayList6.add(pair2.first);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = it2;
                        View view3 = (View) it2.next();
                        Iterator it4 = it;
                        boolean z2 = a2;
                        if (TextUtils.equals((CharSequence) pair2.second, view3.getTransitionName())) {
                            if (!arrayList8.contains(view3)) {
                                arrayList8.add(view3);
                            }
                            arrayMap2.put(pair2.second, pair2.second);
                            it = it4;
                            a2 = z2;
                        } else {
                            arrayMap2.put(pair2.second, null);
                            it2 = it3;
                            it = it4;
                            a2 = z2;
                        }
                    }
                }
            }
            z = a2;
            arrayList2 = null;
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                if (!arrayList8.contains((View) it5.next())) {
                    it5.remove();
                }
            }
            if (arrayList != null) {
                arrayList7.addAll(arrayList);
            }
            arrayList7.add(view2);
            b(transition3, view2, arrayList6);
            a(transition3, (View) arrayList6.get(0));
            if (fVar5 != null && fVar5.getExitTransition() != null) {
                a(fVar5.getExitTransition(), (View) arrayList6.get(0));
            }
            final Rect rect = new Rect();
            if (arrayList != null && fVar4 != null) {
                a(fVar4.getEnterTransition(), rect);
            }
            final View view4 = (arrayList != null) & (arrayList.size() > 0) ? (View) arrayList.get(0) : null;
            ohb.a(this.f ? (View) fVar5.getPageContainer().c().getParent() : fVar4.getPageContainer().c(), new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View view5 = view4;
                    if (view5 == null) {
                        return;
                    }
                    d.a(view5, rect);
                }
            });
        }
        if (enterTransition == null && transition3 == null && exitTransition == null) {
            if (aVar == null) {
                return;
            }
            aVar.a();
            return;
        }
        ArrayList<View> a4 = fVar5 != null ? a(exitTransition, fVar5.getDecorView(), arrayList6, view2) : arrayList2;
        View decorView = this.f ? this.g.f20264a : fVar4.getDecorView();
        ArrayList<View> a5 = a(enterTransition, decorView, arrayList7, view2);
        if (this.e && (a5 == null || a5.isEmpty())) {
            a5 = new ArrayList<>();
            a5.add(decorView);
        }
        ArrayList<View> arrayList9 = a5;
        b(arrayList9, 4);
        Transition a6 = a(exitTransition, enterTransition, transition3);
        if (a6 == null) {
            if (aVar == null) {
                return;
            }
            aVar.a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            arrayMap = arrayMap2;
            final boolean z3 = z;
            transition = transition3;
            fVar3 = fVar4;
            transition2 = a6;
            arrayList3 = arrayList7;
            arrayList4 = arrayList6;
            transition2.addListener(new Transition.TransitionListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition4});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition4});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition4});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition4});
                    } else if (!z3 || d.a(d.this) || oeb.a(fVar4)) {
                    } else {
                        d.a(arrayList6, 4);
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition4) {
                    f fVar6;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition4});
                        return;
                    }
                    if (d.a(d.this)) {
                        if (z3) {
                            d.a(arrayList7, 0);
                        }
                        if (fVar4 != null && oeb.a("enableFixSharedViewVisibility", true)) {
                            List<Pair<View, String>> currentSharedViews = fVar4.getCurrentSharedViews();
                            ArrayList arrayList10 = new ArrayList();
                            if (currentSharedViews != null && currentSharedViews.size() > 0) {
                                for (Pair<View, String> pair3 : currentSharedViews) {
                                    arrayList10.add(pair3.first);
                                }
                            }
                            d.a(d.a((List) arrayList10, view2), 0);
                        }
                    }
                    if (!d.a(d.this) && (fVar6 = fVar4) != null && fVar6.getTransitionInfo().d()) {
                        d.a(d.a((List) arrayList6, view2), 4);
                    }
                    h.a aVar3 = aVar;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.a();
                }
            });
        } else {
            arrayMap = arrayMap2;
            arrayList3 = arrayList7;
            arrayList4 = arrayList6;
            fVar3 = fVar4;
            transition = transition3;
            transition2 = a6;
        }
        a(fVar5, a4);
        ArrayList<String> a7 = a((ArrayList<View>) arrayList3);
        Transition transition4 = transition;
        a(transition2, enterTransition, arrayList9, exitTransition, a4, transition4, arrayList3);
        ViewGroup c = (this.e ? fVar5.getPageContainer() : fVar3.getPageContainer()).c();
        if (this.e) {
            if (fVar5.getPageContainer().a() && fVar5.getPageContainer().h().isEmpty()) {
                c = (ViewGroup) c.getParent();
            }
        } else if (fVar3.getPageContainer().a() && fVar3.getPageContainer().h().size() == 1) {
            c = (ViewGroup) c.getParent();
        }
        TransitionManager.beginDelayedTransition(c, transition2);
        ArrayList arrayList10 = arrayList3;
        ArrayList arrayList11 = arrayList4;
        a(c, arrayList11, arrayList10, a7, arrayMap);
        b(arrayList9, 0);
        b(transition4, arrayList11, arrayList10);
    }

    private static List<View> b(List<View> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b52038f", new Object[]{list, view});
        }
        ArrayList arrayList = new ArrayList();
        for (View view2 : list) {
            if (view2 != view && oec.a(view2.getTag(R.id.layout_manager_transition_card_view), false)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    private static void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a70385", new Object[]{obj, arrayList, arrayList2});
            return;
        }
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet == null) {
            return;
        }
        transitionSet.getTargets().clear();
        transitionSet.getTargets().addAll(arrayList2);
        c(transitionSet, arrayList, arrayList2);
    }

    private static void a(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702938c5", new Object[]{view, arrayList, arrayList2, arrayList3, map});
            return;
        }
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String transitionName = ViewCompat.getTransitionName(view2);
            arrayList4.add(transitionName);
            if (transitionName != null) {
                ViewCompat.setTransitionName(view2, null);
                String str = map.get(transitionName);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (TextUtils.equals(str, arrayList3.get(i2))) {
                        ViewCompat.setTransitionName(arrayList2.get(i2), transitionName);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ohb.a(view, new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (int i3 = 0; i3 < size; i3++) {
                    ViewCompat.setTransitionName((View) arrayList2.get(i3), (String) arrayList3.get(i3));
                    ViewCompat.setTransitionName((View) arrayList.get(i3), (String) arrayList4.get(i3));
                }
            }
        });
    }

    private static void b(List<View> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{list, new Integer(i)});
        } else if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).setVisibility(i);
            }
        }
    }

    private static void c(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93667b86", new Object[]{obj, arrayList, arrayList2});
            return;
        }
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                c(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    private static void a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b30f4a", new Object[]{obj, obj2, arrayList, obj3, arrayList2, obj4, arrayList3});
        } else {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                        return;
                    }
                    Object obj5 = obj2;
                    if (obj5 != null) {
                        d.a(obj5, arrayList, (ArrayList) null);
                    }
                    Object obj6 = obj3;
                    if (obj6 != null) {
                        d.a(obj6, arrayList2, (ArrayList) null);
                    }
                    Object obj7 = obj4;
                    if (obj7 == null) {
                        return;
                    }
                    d.a(obj7, arrayList3, (ArrayList) null);
                }
            });
        }
    }

    private static ArrayList<String> a(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a85ead1c", new Object[]{arrayList});
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ViewCompat.getTransitionName(view));
            ViewCompat.setTransitionName(view, null);
        }
        return arrayList2;
    }

    private static void a(f fVar, final ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b57122", new Object[]{fVar, arrayList});
        } else if (fVar == null || fVar.getExitTransition() == null) {
        } else {
            fVar.getDecorView().setVisibility(0);
            a((Object) fVar.getExitTransition(), fVar.getDecorView(), arrayList);
            ohb.a(fVar.getPageContainer().c(), new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setVisibility(4);
                    }
                }
            });
        }
    }

    private static void a(Object obj, final View view, final ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241a765c", new Object[]{obj, view, arrayList});
        } else {
            ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                    }
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition});
                        return;
                    }
                    transition.removeListener(this);
                    view.setVisibility(8);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) arrayList.get(i)).setVisibility(0);
                    }
                }
            });
        }
    }

    private static Transition a(Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("8cb124be", new Object[]{obj, obj2, obj3});
        }
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    private static void a(ArrayList<View> arrayList, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ebbf50", new Object[]{arrayList, view});
        } else if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    private static ArrayList<View> a(Object obj, View view, ArrayList<View> arrayList, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c10659d0", new Object[]{obj, view, arrayList, view2});
        }
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            a(arrayList2, view);
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view2);
                a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    private static void a(Object obj, final Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e37d3d5", new Object[]{obj, rect});
        } else if (obj == null) {
        } else {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Rect) ipChange2.ipc$dispatch("d9c53a38", new Object[]{this, transition});
                    }
                    Rect rect2 = rect;
                    if (rect2 != null && !rect2.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }

    private static void a(Object obj, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6789580e", new Object[]{obj, view});
        } else if (view == null) {
        } else {
            final Rect rect = new Rect();
            b(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.d.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("d9c53a38", new Object[]{this, transition}) : rect;
                }
            });
        }
    }

    private static void b(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b353e30", new Object[]{view, rect});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    private static void b(Object obj, View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a9fa9d", new Object[]{obj, view, arrayList});
            return;
        }
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        a(transitionSet, arrayList);
    }

    private static void a(Object obj, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2c59e6", new Object[]{obj, arrayList});
            return;
        }
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (a(transition) || !a(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    private static boolean a(List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue() : list == null || list.isEmpty();
    }

    private static boolean a(Transition transition) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3e61f6e", new Object[]{transition})).booleanValue() : !a(transition.getTargetIds()) || !a(transition.getTargetNames()) || !a(transition.getTargetTypes());
    }

    private static void c(List<View> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136e5897", new Object[]{list, view});
            return;
        }
        int size = list.size();
        if (a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean a(List<View> list, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("411cd74e", new Object[]{list, view, new Integer(i)})).booleanValue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Transition transition, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38e02b8", new Object[]{transition, str})).booleanValue();
        }
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    if (a(transitionSet.getTransitionAt(i), str)) {
                        return true;
                    }
                }
            } else {
                return TextUtils.equals(transition.getClass().getSimpleName(), str);
            }
        }
        return false;
    }
}
