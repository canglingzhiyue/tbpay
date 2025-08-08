package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.AnimationModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.qnt;
import tb.qnu;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final h f22240a;
    private FrameLayout b;
    private FrameLayout c;
    private RelativeLayout d;
    private View e;
    private View f;
    private final List<com.taobao.tbpoplayer.nativerender.render.component.c> g = new CopyOnWriteArrayList();

    static {
        kge.a(1560679385);
        kge.a(717479522);
    }

    public static /* synthetic */ boolean lambda$4jHBvmSucOMgAAYQyJUVivefRWE(e eVar, StateBaseModel stateBaseModel, View view) {
        return a(eVar, stateBaseModel, view);
    }

    /* renamed from: lambda$7QFa_H5SPL-4DpD6Edk_UAIV1vI */
    public static /* synthetic */ void m1456lambda$7QFa_H5SPL4DpD6Edk_UAIV1vI(m mVar, e eVar, StateBaseModel stateBaseModel, View view) {
        mVar.b(eVar, stateBaseModel, view);
    }

    public static /* synthetic */ void lambda$Cpxuj1XgWsxCMCnbZYQpihYFclw(e eVar, StateBaseModel stateBaseModel) {
        a(eVar, stateBaseModel);
    }

    public static /* synthetic */ boolean lambda$CudUXVRKmP8Oom4zI7AABwbmf8Q(e eVar, StateBaseModel stateBaseModel, View view, int i, KeyEvent keyEvent) {
        return a(eVar, stateBaseModel, view, i, keyEvent);
    }

    /* renamed from: lambda$IGW-yirhWEdO-AcU3eZl1g8kTaQ */
    public static /* synthetic */ int m1457lambda$IGWyirhWEdOAcU3eZl1g8kTaQ(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        return a(atomicBoolean, jSONObject, jSONObject2);
    }

    public static /* synthetic */ void lambda$JYcOVdOSE2MpR1w4bO_BY77ZWVk(m mVar, ComponentBaseModel componentBaseModel, int i, AtomicInteger atomicInteger, e.b bVar) {
        mVar.a(componentBaseModel, i, atomicInteger, bVar);
    }

    public static /* synthetic */ void lambda$YE_27gclka8GOjzQX7LmE_fuZTo(m mVar) {
        mVar.k();
    }

    public static /* synthetic */ void lambda$gWOyiQCJATF_j2wsqOQYlEr02v8(m mVar, int i, AtomicInteger atomicInteger, e.b bVar, boolean z) {
        mVar.a(i, atomicInteger, bVar, z);
    }

    public static /* synthetic */ void lambda$kFWMGEi6C00CHntsKmTkuMVb_BE(e eVar, PopCloseBtnModel popCloseBtnModel, View view, View view2) {
        a(eVar, popCloseBtnModel, view, view2);
    }

    public static /* synthetic */ void lambda$uja2WHEzifPjhBUSKT53eX4u4V0(e eVar, PopCloseBtnModel popCloseBtnModel) {
        a(eVar, popCloseBtnModel);
    }

    public static /* synthetic */ void lambda$vFqwVPlGvt2j5aBmgoaBSJ2xFEI(m mVar, StateBaseModel stateBaseModel, e eVar) {
        mVar.a(stateBaseModel, eVar);
    }

    public static /* synthetic */ boolean lambda$vMHz6KPs7nVNtBVoagWi75VicIE(e eVar, PopCloseBtnModel popCloseBtnModel, View view) {
        return a(eVar, popCloseBtnModel, view);
    }

    public static /* synthetic */ void lambda$xUzVVWwaOkibzIRs9GTVsh9HYWY(m mVar, int i, AtomicInteger atomicInteger, e.b bVar, boolean z) {
        mVar.b(i, atomicInteger, bVar, z);
    }

    public static /* synthetic */ void lambda$zqspJsoUOZAzxWJtexJ0BF1gQ2k(m mVar) {
        mVar.j();
    }

    public m(h hVar) {
        this.f22240a = hVar;
    }

    private RelativeLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("9118223d", new Object[]{this});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f22240a.k().a());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.poplayer.utils.c.a("onGradualExpose", new Object[0]);
        if (this.c == null || this.b == null) {
            return;
        }
        e m = this.f22240a.m();
        m.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$YE_27gclka8GOjzQX7LmE_fuZTo
            {
                m.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.lambda$YE_27gclka8GOjzQX7LmE_fuZTo(m.this);
            }
        });
        m.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$zqspJsoUOZAzxWJtexJ0BF1gQ2k
            {
                m.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.lambda$zqspJsoUOZAzxWJtexJ0BF1gQ2k(m.this);
            }
        });
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            ViewParent parent = this.b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.b);
            }
            this.c.addView(this.b);
            View findViewById = this.c.findViewById(R.id.poplayer_native_state_center_loading_id);
            if (findViewById == null) {
                return;
            }
            this.c.removeView(findViewById);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopStateManager.onGradualExpose.error", th);
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        g();
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(com.taobao.tbpoplayer.nativerender.dsl.StateModel r21, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.m.a(com.taobao.tbpoplayer.nativerender.dsl.StateModel, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel, boolean, boolean):android.view.View");
    }

    private void a(StateModel stateModel, StateVersionModel stateVersionModel, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z, boolean z2) {
        View g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374a8154", new Object[]{this, stateModel, stateVersionModel, frameLayout, frameLayout2, new Boolean(z), new Boolean(z2)});
            return;
        }
        final StateModel stateModel2 = stateVersionModel != 0 ? stateVersionModel : stateModel;
        final e m = this.f22240a.m();
        this.e = frameLayout;
        d a2 = m.a();
        a2.a(stateModel);
        a2.a(stateVersionModel);
        a2.a((StateBaseModel) stateModel2);
        if (!z && !z2) {
            a2.p();
        }
        List<JSONObject> arrayList = new ArrayList(stateModel2.children);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Collections.sort(arrayList, new Comparator() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$IGW-yirhWEdO-AcU3eZl1g8kTaQ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.m1457lambda$IGWyirhWEdOAcU3eZl1g8kTaQ(atomicBoolean, (JSONObject) obj, (JSONObject) obj2);
            }
        });
        if (!atomicBoolean.get()) {
            arrayList = stateModel2.children;
        }
        if (z && !z2) {
            this.f22240a.a(qnu.a(m, arrayList, true));
        }
        final PopCloseBtnModel popCloseBtnModel = null;
        for (JSONObject jSONObject : arrayList) {
            String string = jSONObject.getString("type");
            if (!Boolean.FALSE.equals(jSONObject.getBoolean("vConditionResult"))) {
                if (qnt.TYPE_CLOSE_BTN.equals(string)) {
                    popCloseBtnModel = (PopCloseBtnModel) jSONObject.toJavaObject(PopCloseBtnModel.class);
                } else {
                    com.taobao.tbpoplayer.nativerender.render.component.c a3 = qnt.a(jSONObject, m, false, false);
                    if (a3 != null && (g = a3.g()) != null) {
                        frameLayout.addView(g);
                        this.g.add(a3);
                    }
                }
            }
        }
        if (this.g.isEmpty()) {
            m.a("StateNoUiContent", "");
            return;
        }
        Context a4 = m.a().a();
        com.alibaba.poplayer.utils.i l = m.l();
        boolean equals = "center".equals(stateModel2.layout);
        boolean equals2 = "fullscreen".equals(stateModel2.layout);
        if (popCloseBtnModel != null) {
            com.taobao.tbpoplayer.nativerender.render.component.b bVar = new com.taobao.tbpoplayer.nativerender.render.component.b(m, popCloseBtnModel);
            final View g2 = bVar.g();
            this.g.add(bVar);
            StyleModel styleModel = popCloseBtnModel.style;
            int b = qnu.b(m, styleModel.width);
            int b2 = qnu.b(m, styleModel.height);
            if (equals) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.leftMargin = layoutParams2.leftMargin;
                layoutParams.topMargin = (layoutParams2.height / 2) + (b2 / 2) + (popCloseBtnModel.belowStateMargin > 0 ? (int) l.a(a4, popCloseBtnModel.belowStateMargin) : 0) + layoutParams2.topMargin;
                frameLayout2.addView(g2, layoutParams);
            } else if (equals2) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(b, b2);
                layoutParams3.rightMargin = popCloseBtnModel.alignScreenRightMargin > 0 ? (int) l.a(a4, popCloseBtnModel.alignScreenRightMargin) : 0;
                if (h()) {
                    layoutParams3.topMargin = (popCloseBtnModel.alignScreenTopMargin > 0 ? (int) l.a(a4, popCloseBtnModel.alignScreenTopMargin) : 0) + com.alibaba.poplayer.utils.g.a(a4);
                } else {
                    layoutParams3.topMargin = popCloseBtnModel.alignScreenTopMargin > 0 ? (int) l.a(a4, popCloseBtnModel.alignScreenTopMargin) : 0;
                }
                layoutParams3.addRule(10);
                layoutParams3.addRule(11);
                this.d.addView(g2, layoutParams3);
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(b, b2);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams4.leftMargin = popCloseBtnModel.alignLeftStateMargin > 0 ? (int) l.a(a4, popCloseBtnModel.alignLeftStateMargin) : 0;
                layoutParams4.topMargin = (popCloseBtnModel.belowStateMargin > 0 ? (int) l.a(a4, popCloseBtnModel.belowStateMargin) : 0) - layoutParams5.bottomMargin;
                layoutParams4.addRule(5, R.id.poplayer_native_state_id);
                layoutParams4.addRule(3, R.id.poplayer_native_state_id);
                this.d.addView(g2, layoutParams4);
            }
            g2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$kFWMGEi6C00CHntsKmTkuMVb_BE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.lambda$kFWMGEi6C00CHntsKmTkuMVb_BE(e.this, popCloseBtnModel, g2, view);
                }
            });
            g2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$vMHz6KPs7nVNtBVoagWi75VicIE
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return m.lambda$vMHz6KPs7nVNtBVoagWi75VicIE(e.this, popCloseBtnModel, view);
                }
            });
            this.f = g2;
            a2.a(popCloseBtnModel);
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$7QFa_H5SPL-4DpD6Edk_UAIV1vI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.m1456lambda$7QFa_H5SPL4DpD6Edk_UAIV1vI(m.this, m, stateModel2, view);
            }
        });
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$4jHBvmSucOMgAAYQyJUVivefRWE
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return m.lambda$4jHBvmSucOMgAAYQyJUVivefRWE(e.this, stateModel2, view);
            }
        });
        m.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$vFqwVPlGvt2j5aBmgoaBSJ2xFEI
            @Override // java.lang.Runnable
            public final void run() {
                m.lambda$vFqwVPlGvt2j5aBmgoaBSJ2xFEI(m.this, stateModel2, m);
            }
        }, 200L);
    }

    public static /* synthetic */ int a(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fad65bdb", new Object[]{atomicBoolean, jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex);
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            return 0;
        }
    }

    public static /* synthetic */ void a(final e eVar, final PopCloseBtnModel popCloseBtnModel, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beaf19a1", new Object[]{eVar, popCloseBtnModel, view, view2});
        } else {
            eVar.e().a(eVar, "click", popCloseBtnModel.animation, view, popCloseBtnModel, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$uja2WHEzifPjhBUSKT53eX4u4V0
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    m.lambda$uja2WHEzifPjhBUSKT53eX4u4V0(e.this, popCloseBtnModel);
                }
            });
        }
    }

    public static /* synthetic */ void a(e eVar, PopCloseBtnModel popCloseBtnModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf3ffa1", new Object[]{eVar, popCloseBtnModel});
        } else {
            eVar.a(popCloseBtnModel, "click", popCloseBtnModel.action, popCloseBtnModel.actions);
        }
    }

    public static /* synthetic */ boolean a(e eVar, PopCloseBtnModel popCloseBtnModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3c2b95", new Object[]{eVar, popCloseBtnModel, view})).booleanValue();
        }
        eVar.a(popCloseBtnModel, "longClick", popCloseBtnModel.action, popCloseBtnModel.actions);
        return true;
    }

    public /* synthetic */ void b(final e eVar, final StateBaseModel stateBaseModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f06165", new Object[]{this, eVar, stateBaseModel, view});
        } else {
            eVar.e().a(eVar, "click", stateBaseModel.animation, this.e, stateBaseModel, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$Cpxuj1XgWsxCMCnbZYQpihYFclw
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    m.lambda$Cpxuj1XgWsxCMCnbZYQpihYFclw(e.this, stateBaseModel);
                }
            });
        }
    }

    public static /* synthetic */ void a(e eVar, StateBaseModel stateBaseModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcf462e", new Object[]{eVar, stateBaseModel});
        } else {
            eVar.a(stateBaseModel, "click", stateBaseModel.action, stateBaseModel.actions);
        }
    }

    public static /* synthetic */ boolean a(e eVar, StateBaseModel stateBaseModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("754237e8", new Object[]{eVar, stateBaseModel, view})).booleanValue();
        }
        eVar.a(stateBaseModel, "longClick", stateBaseModel.action, stateBaseModel.actions);
        return true;
    }

    public /* synthetic */ void a(final StateBaseModel stateBaseModel, final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb192f6a", new Object[]{this, stateBaseModel, eVar});
            return;
        }
        try {
            if (StringUtils.isEmpty(stateBaseModel.focusComponent) && Build.VERSION.SDK_INT >= 19 && this.f != null && this.f.isAttachedToWindow()) {
                this.f.sendAccessibilityEvent(8);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("sendAccessibilityEvent.error", th);
        }
        try {
            if (!s.a(s.TRIGGER_ACTION_KEY_BACK, stateBaseModel.triggerActions)) {
                return;
            }
            this.d.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                this.d.setDefaultFocusHighlightEnabled(false);
            }
            this.d.requestFocusFromTouch();
            this.d.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$CudUXVRKmP8Oom4zI7AABwbmf8Q
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return m.lambda$CudUXVRKmP8Oom4zI7AABwbmf8Q(e.this, stateBaseModel, view, i, keyEvent);
                }
            });
        } catch (Throwable th2) {
            com.alibaba.poplayer.utils.c.a("needHandleTriggerKeyBack.error", th2);
        }
    }

    public static /* synthetic */ boolean a(e eVar, StateBaseModel stateBaseModel, View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6955a41", new Object[]{eVar, stateBaseModel, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return false;
        }
        return s.a(eVar, s.TRIGGER_ACTION_KEY_BACK, true, stateBaseModel.triggerActions);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (com.taobao.tbpoplayer.view.c.PAGE_EVENT_NAME.equals(str)) {
            e m = this.f22240a.m();
            StateBaseModel k = m.a().k();
            PopCloseBtnModel l = m.a().l();
            g.a(m, k, jSONObject);
            if (k != null) {
                m.e().a(m, jSONObject, k, this.e);
            }
            if (l != null) {
                m.e().a(m, jSONObject, l, this.f);
            }
            for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
                if (cVar != null) {
                    cVar.a(str, jSONObject);
                }
            }
            m.e().a(jSONObject);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (!this.f22240a.o()) {
            g();
        }
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g();
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        g();
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null) {
                cVar.bh_();
            }
        }
    }

    public void b(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4833f129", new Object[]{this, bVar});
            return;
        }
        e m = this.f22240a.m();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        StateBaseModel k = m.a().k();
        a(m, this.e, k, k != null ? k.animation : null, 2, atomicInteger, bVar);
        a(m, this.d, k, k != null ? k.pageAnimation : null, 2, atomicInteger, bVar);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
            if (cVar != null && cVar.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public void a(final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
            return;
        }
        try {
            final int size = this.g.size() + 1;
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            b(new e.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$xUzVVWwaOkibzIRs9GTVsh9HYWY
                @Override // com.taobao.tbpoplayer.nativerender.e.b
                public final void onPreCloseDone(boolean z) {
                    m.lambda$xUzVVWwaOkibzIRs9GTVsh9HYWY(m.this, size, atomicInteger, bVar, z);
                }
            });
            for (com.taobao.tbpoplayer.nativerender.render.component.c cVar : this.g) {
                if (cVar != null) {
                    cVar.a(new e.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$gWOyiQCJATF_j2wsqOQYlEr02v8
                        @Override // com.taobao.tbpoplayer.nativerender.e.b
                        public final void onPreCloseDone(boolean z) {
                            m.lambda$gWOyiQCJATF_j2wsqOQYlEr02v8(m.this, size, atomicInteger, bVar, z);
                        }
                    });
                } else {
                    a(size, atomicInteger, bVar);
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopStateManager.onClosed.error", th);
            if (bVar == null) {
                return;
            }
            bVar.onPreCloseDone(false);
        }
    }

    public /* synthetic */ void b(int i, AtomicInteger atomicInteger, e.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39837c94", new Object[]{this, new Integer(i), atomicInteger, bVar, new Boolean(z)});
            return;
        }
        com.alibaba.poplayer.utils.c.a("onClosed.executeAnimate.mStateComponents.done", new Object[0]);
        a(i, atomicInteger, bVar);
    }

    public /* synthetic */ void a(int i, AtomicInteger atomicInteger, e.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a175", new Object[]{this, new Integer(i), atomicInteger, bVar, new Boolean(z)});
            return;
        }
        com.alibaba.poplayer.utils.c.a("onClosed.executeAnimate.mCurComponents.Item.done", new Object[0]);
        a(i, atomicInteger, bVar);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        e m = this.f22240a.m();
        d a2 = m.a();
        StateBaseModel k = a2.k();
        PopCloseBtnModel l = a2.l();
        if (k != null) {
            m.e().a(m, "expose", k.animation, this.e, k, (l.b) null);
            m.e().a(m, "expose", k.pageAnimation, this.d, k, (l.b) null);
        }
        if (l == null) {
            return;
        }
        m.e().a(m, "expose", l.animation, this.f, l, (l.b) null);
    }

    private void a(e eVar, View view, final ComponentBaseModel componentBaseModel, List<AnimationModel> list, final int i, final AtomicInteger atomicInteger, final e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6685dfdc", new Object[]{this, eVar, view, componentBaseModel, list, new Integer(i), atomicInteger, bVar});
        } else if (view != null && componentBaseModel != null && list != null) {
            eVar.e().a(eVar, "close", list, view, componentBaseModel, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$m$JYcOVdOSE2MpR1w4bO_BY77ZWVk
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    m.lambda$JYcOVdOSE2MpR1w4bO_BY77ZWVk(m.this, componentBaseModel, i, atomicInteger, bVar);
                }
            });
        } else {
            a(i, atomicInteger, bVar);
        }
    }

    public /* synthetic */ void a(ComponentBaseModel componentBaseModel, int i, AtomicInteger atomicInteger, e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cebe8ef", new Object[]{this, componentBaseModel, new Integer(i), atomicInteger, bVar});
            return;
        }
        com.alibaba.poplayer.utils.c.a("onClosed.executeAnimate.Item.done.componentModelId=" + componentBaseModel.id, new Object[0]);
        a(i, atomicInteger, bVar);
    }

    private void a(int i, AtomicInteger atomicInteger, e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2115393f", new Object[]{this, new Integer(i), atomicInteger, bVar});
            return;
        }
        atomicInteger.incrementAndGet();
        com.alibaba.poplayer.utils.c.a("onClosed.onComponentPreCloseAnimDone.curCount.get()=" + atomicInteger.get() + ".allCount=" + i, new Object[0]);
        if (atomicInteger.get() != i || bVar == null) {
            return;
        }
        bVar.onPreCloseDone(false);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.f22240a.k().x().enableFullScreenInImmersive && com.alibaba.poplayer.utils.g.a(this.f22240a.k().a());
    }
}
