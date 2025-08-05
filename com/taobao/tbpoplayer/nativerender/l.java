package com.taobao.tbpoplayer.nativerender;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.AnimationModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.l;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cab;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_NAME_CLICK = "click";
    public static final String TRIGGER_NAME_CLOSE = "close";
    public static final String TRIGGER_NAME_EXPOSE = "expose";
    public static final String TRIGGER_NAME_SCROLL_STATUS = "scrollStatus";

    /* renamed from: a */
    private final Map<String, Integer> f22235a = new ConcurrentHashMap();
    private final Map<String, Integer> b = new ConcurrentHashMap();

    /* loaded from: classes8.dex */
    public interface a {
        void onAnimationItemEnd(AnimationModel animationModel);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onAnimationEnd();
    }

    /* loaded from: classes8.dex */
    public static class c {

        /* renamed from: a */
        public String f22239a;
        public List<AnimationModel> b;
        public View c;
        public ComponentBaseModel d;
        public b e;
        public ActionLineModule f;

        static {
            kge.a(-1458488584);
        }

        public c(String str, List<AnimationModel> list, View view, ComponentBaseModel componentBaseModel, b bVar) {
            this.f22239a = str;
            this.b = list;
            this.c = view;
            this.d = componentBaseModel;
            this.e = bVar;
        }
    }

    static {
        kge.a(916962231);
    }

    public static /* synthetic */ void lambda$kSmwez7tLh8H3wnRN_3HnmlI0CM(View view, AnimatorSet animatorSet, d dVar) {
        a(view, animatorSet, dVar);
    }

    public void a(JSONObject jSONObject) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("sourceName");
            String string2 = jSONObject.getString("event");
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || jSONObject2 == null) {
                return;
            }
            if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                if (!jSONObject2.containsKey("state")) {
                    return;
                }
                int intValue = jSONObject2.getIntValue("state");
                this.b.put(string, Integer.valueOf(intValue));
                com.alibaba.poplayer.utils.c.a("executePageEventAnimate.syncScrollState.saveScrollState.sourceName=%s.event=%s.state=%s", string, string2, Integer.valueOf(intValue));
            }
            if (!com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLLED.equals(string2) || (num = this.f22235a.get(string)) == null) {
                return;
            }
            int intValue2 = num.intValue() + jSONObject2.getIntValue("dy");
            this.f22235a.put(string, Integer.valueOf(intValue2));
            com.alibaba.poplayer.utils.c.a("executePageEventAnimate.syncScrollState.saveScrollInstances.sourceName=%s.event=%s.lastInstance=%s.scrollYDistance=%s", string, string2, num, Integer.valueOf(intValue2));
        }
    }

    public void a(e eVar, JSONObject jSONObject, ComponentBaseModel componentBaseModel, View view) {
        String str;
        AnimationModel animationModel;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0d31dc", new Object[]{this, eVar, jSONObject, componentBaseModel, view});
        } else if (jSONObject != null && componentBaseModel != null && componentBaseModel.animation != null && !componentBaseModel.animation.isEmpty() && view != null) {
            String str2 = "sourceName";
            String string = jSONObject.getString(str2);
            String string2 = jSONObject.getString("event");
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || jSONObject2 == null) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("executePageEventAnimate.sourceName=%s.event=%s.scrollInstances=%s.", string, string2, this.f22235a);
            if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                if (!jSONObject2.containsKey("state")) {
                    return;
                }
                com.alibaba.poplayer.utils.c.a("executePageEventAnimate.scrollStateChanged.sourceName=%s.event=%s.mScrollState=%s.", string, string2, this.b);
                Integer num2 = this.b.get(string);
                int intValue = jSONObject2.getIntValue("state");
                if (num2 != null && num2.intValue() == intValue) {
                    com.alibaba.poplayer.utils.c.a("executePageEventAnimate.scrollStateChanged.sameState.pass.state=%s", Integer.valueOf(intValue));
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (AnimationModel animationModel2 : componentBaseModel.animation) {
                if (animationModel2.isValid()) {
                    JSONObject jSONObject3 = animationModel2.trigger;
                    if (TRIGGER_NAME_SCROLL_STATUS.equals(jSONObject3.getString("name"))) {
                        String string3 = jSONObject3.getString(str2);
                        if (!TextUtils.isEmpty(string3) && string3.equals(string)) {
                            if ("vertical".equals(jSONObject3.getString("direction"))) {
                                long longValue = jSONObject3.getLongValue("listenTimes");
                                if (longValue <= 0) {
                                    longValue = animationModel2.listenTimes;
                                }
                                if (longValue > 0) {
                                    str = str2;
                                    animationModel = animationModel2;
                                    if (animationModel2.costTimes >= longValue) {
                                        com.alibaba.poplayer.utils.c.a("executePageEventAnimate.costTimes>=listenTimes.return.triggerSourceName=%s", string3);
                                        str2 = str;
                                    }
                                } else {
                                    str = str2;
                                    animationModel = animationModel2;
                                }
                                int intValue2 = jSONObject3.getIntValue("safeDistance");
                                String string4 = jSONObject3.getString("listenDirection");
                                if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string2)) {
                                    if ("0".equals(jSONObject2.getString("state"))) {
                                        this.f22235a.remove(string);
                                        if ("Idle".equals(string4)) {
                                            arrayList.add(animationModel);
                                            str2 = str;
                                        }
                                    } else {
                                        AnimationModel animationModel3 = animationModel;
                                        if ("1".equals(jSONObject2.getString("state"))) {
                                            this.f22235a.put(string, 0);
                                            if ("Scrolling".equals(string4)) {
                                                arrayList.add(animationModel3);
                                                str2 = str;
                                            }
                                        }
                                    }
                                } else {
                                    AnimationModel animationModel4 = animationModel;
                                    if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_SCROLLED.equals(string2) && (num = this.f22235a.get(string)) != null) {
                                        int intValue3 = num.intValue() + jSONObject2.getIntValue("dy");
                                        boolean z = Math.abs(num.intValue()) <= Math.abs(intValue2) && Math.abs(intValue3) > Math.abs(intValue2);
                                        com.alibaba.poplayer.utils.c.a("executePageEventAnimate.sourceName=%s.event=%s.canStart=%s...lastInstance=%s.safeDistance=%s.scrollYDistance=%s ", string, string2, Boolean.valueOf(z), num, Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                                        if (z && (("ScrollingUp".equals(string4) && intValue3 < 0) || ("ScrollingDown".equals(string4) && intValue3 > 0))) {
                                            arrayList.add(animationModel4);
                                        }
                                        str2 = str;
                                    }
                                }
                            }
                        }
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            a(eVar, new c(TRIGGER_NAME_SCROLL_STATUS, arrayList, view, componentBaseModel, null));
        }
    }

    public void a(e eVar, String str, List<AnimationModel> list, View view, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9834e7ea", new Object[]{this, eVar, str, list, view, bVar});
        } else {
            a(eVar, str, list, view, (ComponentBaseModel) null, bVar);
        }
    }

    public void a(e eVar, String str, List<AnimationModel> list, View view, ComponentBaseModel componentBaseModel, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52616028", new Object[]{this, eVar, str, list, view, componentBaseModel, bVar});
        } else if (TextUtils.isEmpty(str) || list == null || list.isEmpty() || view == null) {
            if (bVar == null) {
                return;
            }
            bVar.onAnimationEnd();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                for (AnimationModel animationModel : list) {
                    if (animationModel.isValid() && str.equals(animationModel.trigger.get("name"))) {
                        arrayList.add(animationModel);
                    }
                }
                if (arrayList.isEmpty()) {
                    if (bVar == null) {
                        return;
                    }
                    bVar.onAnimationEnd();
                    return;
                }
                final d a2 = eVar.a();
                final ActionLineModule actionLineModule = new ActionLineModule(a2.m(), a2.n(), a2.o());
                actionLineModule.e = str;
                actionLineModule.d = false;
                actionLineModule.g = new ArrayList();
                c cVar = new c(str, arrayList, view, componentBaseModel, new b() { // from class: com.taobao.tbpoplayer.nativerender.l.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        l.this = this;
                    }

                    @Override // com.taobao.tbpoplayer.nativerender.l.b
                    public void onAnimationEnd() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c281bbd", new Object[]{this});
                            return;
                        }
                        b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.onAnimationEnd();
                        }
                        cab.c(a2.C(), a2.D(), a2.E(), a2.G(), actionLineModule);
                    }
                });
                cVar.f = actionLineModule;
                a(eVar, cVar);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAnimateExecutor.executeAnimate.error", th);
                if (bVar == null) {
                    return;
                }
                bVar.onAnimationEnd();
            }
        }
    }

    private void a(final e eVar, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2764a09e", new Object[]{this, eVar, cVar});
        } else if (cVar == null) {
        } else {
            final b bVar = cVar.e;
            if (cVar.b == null || cVar.b.isEmpty()) {
                if (bVar == null) {
                    return;
                }
                bVar.onAnimationEnd();
                return;
            }
            final AnimationModel remove = cVar.b.remove(0);
            final ActionLineModule.ActionItem actionItem = new ActionLineModule.ActionItem();
            actionItem.f3202a = remove.id;
            actionItem.d = cVar.d != null ? cVar.d.id : "";
            if (cVar.f != null && cVar.f.g != null) {
                cVar.f.g.add(actionItem);
            }
            if (!com.taobao.tbpoplayer.nativerender.b.a(remove.preCondition, eVar, false)) {
                actionItem.c = "preConditionRestrict";
                if (bVar == null) {
                    return;
                }
                bVar.onAnimationEnd();
                return;
            }
            final View view = cVar.c;
            view.post(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$l$dcfWtxxrQDMDqMFnCw24jN9YgIw
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.a(eVar, remove, view, cVar, actionItem, bVar);
                }
            });
        }
    }

    public /* synthetic */ void a(final e eVar, AnimationModel animationModel, final View view, final c cVar, final ActionLineModule.ActionItem actionItem, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4449b5a", new Object[]{this, eVar, animationModel, view, cVar, actionItem, bVar});
        } else {
            a(eVar, animationModel, view, new a() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$l$ILF1WzqvftNjkhpfSLbE6AtZaeg
                @Override // com.taobao.tbpoplayer.nativerender.l.a
                public final void onAnimationItemEnd(AnimationModel animationModel2) {
                    l.this.a(view, eVar, cVar, actionItem, bVar, animationModel2);
                }
            });
        }
    }

    public /* synthetic */ void a(View view, e eVar, c cVar, ActionLineModule.ActionItem actionItem, b bVar, AnimationModel animationModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafaf102", new Object[]{this, view, eVar, cVar, actionItem, bVar, animationModel});
            return;
        }
        if (animationModel != null) {
            try {
                String str = animationModel.endBehavior;
                if ("gone".equals(str)) {
                    view.setVisibility(8);
                } else if ("hide".equals(str)) {
                    view.setVisibility(4);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopAnimateExecutor.executeAnimationItem.error", th);
                actionItem.c = "executeError";
                if (bVar == null) {
                    return;
                }
                bVar.onAnimationEnd();
                return;
            }
        }
        a(eVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.tbpoplayer.nativerender.e r21, com.taobao.tbpoplayer.nativerender.dsl.AnimationModel r22, final android.view.View r23, com.taobao.tbpoplayer.nativerender.l.a r24) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.l.a(com.taobao.tbpoplayer.nativerender.e, com.taobao.tbpoplayer.nativerender.dsl.AnimationModel, android.view.View, com.taobao.tbpoplayer.nativerender.l$a):void");
    }

    /* renamed from: com.taobao.tbpoplayer.nativerender.l$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ AnimatorSet f22237a;
        public boolean c = false;
        public final /* synthetic */ d d;
        public final /* synthetic */ String e;
        public final /* synthetic */ AnimationModel f;
        public final /* synthetic */ e g;
        public final /* synthetic */ a h;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
            if (str.hashCode() == -1868320925) {
                super.onAnimationCancel((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void lambda$XW912z4lFotTXYtdr6aVc1L5D6M(AnimatorSet animatorSet) {
            a(animatorSet);
        }

        public AnonymousClass2(d dVar, String str, AnimationModel animationModel, e eVar, AnimatorSet animatorSet, a aVar) {
            l.this = r1;
            this.d = dVar;
            this.e = str;
            this.f = animationModel;
            this.g = eVar;
            this.f22237a = animatorSet;
            this.h = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            super.onAnimationCancel(animator);
            this.c = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
            } else {
                com.alibaba.poplayer.utils.c.a("onAnimationStart.duration=%s", Long.valueOf(animator.getDuration()));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            com.alibaba.poplayer.utils.c.a("onAnimationEnd.", new Object[0]);
            if (this.d.g() || !this.d.m().equals(this.e) || this.c) {
                com.alibaba.poplayer.utils.c.a("onAnimationEnd.cancel=%s", Boolean.valueOf(this.c));
                return;
            }
            try {
                long j = 1;
                if (this.f.loopTimes != null) {
                    j = this.f.loopTimes.longValue();
                } else if (this.f.loop != null && this.f.loop.booleanValue()) {
                    j = 0;
                }
                if (j > 0) {
                    this.f.curLoopTimes++;
                    if (j <= this.f.curLoopTimes) {
                        z = false;
                    }
                }
                if (z) {
                    e eVar = this.g;
                    final AnimatorSet animatorSet = this.f22237a;
                    eVar.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$l$2$XW912z4lFotTXYtdr6aVc1L5D6M
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.AnonymousClass2.lambda$XW912z4lFotTXYtdr6aVc1L5D6M(animatorSet);
                        }
                    });
                } else if (this.h == null) {
                } else {
                    this.h.onAnimationItemEnd(this.f);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("onAnimationEnd.loop.error.", th);
            }
        }

        public static /* synthetic */ void a(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cafd7869", new Object[]{animatorSet});
                return;
            }
            try {
                animatorSet.start();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(View view, AnimatorSet animatorSet, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d124cc6", new Object[]{view, animatorSet, dVar});
            return;
        }
        try {
            Object tag = view.getTag(R.id.poplayer_native_animator_view_id);
            if (tag instanceof AnimatorSet) {
                ((AnimatorSet) tag).cancel();
            }
            view.setTag(R.id.poplayer_native_animator_view_id, animatorSet);
            if (((Integer) view.getTag(R.id.poplayer_native_animator_state_index)).intValue() == dVar.o()) {
                z = false;
            }
            if (dVar.g() || z) {
                return;
            }
            animatorSet.start();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("onAnimationEnd.loop.error.", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x006a, code lost:
        if (r8.equals("translateY") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.nativerender.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "9f352ae"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L18:
            r0 = -1
            int r1 = r8.hashCode()
            java.lang.String r5 = "scaleY"
            java.lang.String r6 = "scaleX"
            switch(r1) {
                case -1721943862: goto L6d;
                case -1721943861: goto L63;
                case -1267206133: goto L58;
                case -925180581: goto L4d;
                case -908189618: goto L45;
                case -908189617: goto L3d;
                case 1384173149: goto L32;
                case 1384173150: goto L27;
                default: goto L26;
            }
        L26:
            goto L78
        L27:
            java.lang.String r1 = "rotateY"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            r2 = 4
            goto L79
        L32:
            java.lang.String r1 = "rotateX"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            r2 = 3
            goto L79
        L3d:
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L78
            r2 = 7
            goto L79
        L45:
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L78
            r2 = 6
            goto L79
        L4d:
            java.lang.String r1 = "rotate"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            r2 = 2
            goto L79
        L58:
            java.lang.String r1 = "opacity"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            r2 = 5
            goto L79
        L63:
            java.lang.String r1 = "translateY"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            goto L79
        L6d:
            java.lang.String r1 = "translateX"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L78
            r2 = 0
            goto L79
        L78:
            r2 = -1
        L79:
            switch(r2) {
                case 0: goto L94;
                case 1: goto L90;
                case 2: goto L8c;
                case 3: goto L88;
                case 4: goto L84;
                case 5: goto L81;
                case 6: goto L80;
                case 7: goto L7f;
                default: goto L7c;
            }
        L7c:
            java.lang.String r8 = ""
            return r8
        L7f:
            return r5
        L80:
            return r6
        L81:
            java.lang.String r8 = "alpha"
            return r8
        L84:
            java.lang.String r8 = "rotationY"
            return r8
        L88:
            java.lang.String r8 = "rotationX"
            return r8
        L8c:
            java.lang.String r8 = "rotation"
            return r8
        L90:
            java.lang.String r8 = "translationY"
            return r8
        L94:
            java.lang.String r8 = "translationX"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.l.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x007b, code lost:
        if (r6.equals("easeInSine") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.animation.TimeInterpolator b(java.lang.String r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.nativerender.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "c654a6f3"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            android.animation.TimeInterpolator r6 = (android.animation.TimeInterpolator) r6
            return r6
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L24
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        L24:
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1700042016: goto L75;
                case -1383205240: goto L6b;
                case -1197605014: goto L61;
                case -1102672091: goto L56;
                case -749065269: goto L4b;
                case 98580269: goto L41;
                case 1088816001: goto L37;
                case 1396267464: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L7e
        L2d:
            java.lang.String r1 = "easeInOutSine"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 3
            goto L7f
        L37:
            java.lang.String r1 = "anticipateOvershoot"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 7
            goto L7f
        L41:
            java.lang.String r1 = "easeOutSine"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 2
            goto L7f
        L4b:
            java.lang.String r1 = "overshoot"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 6
            goto L7f
        L56:
            java.lang.String r1 = "linear"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 0
            goto L7f
        L61:
            java.lang.String r1 = "anticipate"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 5
            goto L7f
        L6b:
            java.lang.String r1 = "bounce"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            r2 = 4
            goto L7f
        L75:
            java.lang.String r1 = "easeInSine"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L7e
            goto L7f
        L7e:
            r2 = -1
        L7f:
            switch(r2) {
                case 0: goto Lb2;
                case 1: goto Lac;
                case 2: goto La6;
                case 3: goto La0;
                case 4: goto L9a;
                case 5: goto L94;
                case 6: goto L8e;
                case 7: goto L88;
                default: goto L82;
            }
        L82:
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        L88:
            android.view.animation.AnticipateOvershootInterpolator r6 = new android.view.animation.AnticipateOvershootInterpolator
            r6.<init>()
            return r6
        L8e:
            android.view.animation.OvershootInterpolator r6 = new android.view.animation.OvershootInterpolator
            r6.<init>()
            return r6
        L94:
            android.view.animation.AnticipateInterpolator r6 = new android.view.animation.AnticipateInterpolator
            r6.<init>()
            return r6
        L9a:
            android.view.animation.BounceInterpolator r6 = new android.view.animation.BounceInterpolator
            r6.<init>()
            return r6
        La0:
            android.view.animation.AccelerateDecelerateInterpolator r6 = new android.view.animation.AccelerateDecelerateInterpolator
            r6.<init>()
            return r6
        La6:
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>()
            return r6
        Lac:
            android.view.animation.AccelerateInterpolator r6 = new android.view.animation.AccelerateInterpolator
            r6.<init>()
            return r6
        Lb2:
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.l.b(java.lang.String):android.animation.TimeInterpolator");
    }

    private float a(e eVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93c69103", new Object[]{this, eVar, str, new Integer(i)})).floatValue();
        }
        if (str.contains(riy.MOD)) {
            try {
                float floatValue = NumberFormat.getPercentInstance().parse(str).floatValue();
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                } else if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                return i * floatValue;
            } catch (ParseException e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        return eVar.l().a(eVar.a().a(), Float.parseFloat(str));
    }
}
