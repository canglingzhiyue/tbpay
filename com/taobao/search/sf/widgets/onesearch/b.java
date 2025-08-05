package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.s;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.util.k;
import com.taobao.search.sf.MainSearchResultActivity;
import kotlin.jvm.internal.q;
import tb.isr;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.jyx;
import tb.kge;
import tb.nfc;
import tb.noa;
import tb.nwk;
import tb.nxz;
import tb.riy;

/* loaded from: classes8.dex */
public final class b extends ius<a, FrameLayout, com.taobao.search.sf.a> implements View.OnLayoutChangeListener, com.taobao.android.weex_framework.g, com.taobao.android.xsearchplugin.weex.weex.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private p f19550a;
    private a b;
    private boolean c;
    private boolean d;
    private BroadcastReceiver e;
    private boolean f;
    private boolean h;

    static {
        kge.a(-355502365);
        kge.a(-311268728);
        kge.a(502437767);
        kge.a(-782512414);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1303831088:
                super.bindWithData(objArr[0]);
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean b(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1409239", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return true;
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFMusOnesearchWidget";
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    public static final /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("948489c2", new Object[]{bVar})).booleanValue() : bVar.f;
    }

    public static final /* synthetic */ p b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("a87369fc", new Object[]{bVar}) : bVar.f19550a;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((a) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, ium parent, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, aVar, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : new FrameLayout(getActivity());
    }

    public void a(a aVar) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845e0a61", new Object[]{this, aVar});
            return;
        }
        super.bindWithData(aVar);
        if (aVar == null) {
            return;
        }
        this.b = aVar;
        attachToContainer();
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = aVar.b();
        }
        p pVar = this.f19550a;
        if (pVar != null) {
            pVar.destroy();
        }
        String b = y.b(aVar.a(), "_mus_tpl");
        if (TextUtils.isEmpty(b)) {
            b = aVar.a();
        }
        String str = b;
        p a2 = s.a(getActivity(), this, null);
        a2.registerRenderListener(this);
        nxz.Companion.a(a2, str, aVar.a(), null, null);
        this.f19550a = a2;
        d();
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.e, new IntentFilter("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD"));
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new BroadcastReceiver() { // from class: com.taobao.search.sf.widgets.onesearch.SFMusOnesearchWidget$initReceiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    p b;
                    Bundle extras;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (!b.a(b.this) || (b = b.b(b.this)) == null || b.isDestroyed() || intent == null || (extras = intent.getExtras()) == null) {
                    } else {
                        int i = extras.getInt("tipNumber");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "count", (String) Integer.valueOf(i));
                        b.sendInstanceMessage("MUISE", "messageCountChange", jSONObject);
                    }
                }
            };
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final String f19551a;
        private final int b;
        private final boolean c;

        static {
            kge.a(-303017452);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a((Object) this.f19551a, (Object) aVar.f19551a) || this.b != aVar.b || this.c != aVar.c) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f19551a;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = ((i * 31) + this.b) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MusOnesearchBean(url=" + this.f19551a + ", height=" + this.b + ", newSearch=" + this.c + riy.BRACKET_END_STR;
        }

        public a(String url, int i, boolean z) {
            q.c(url, "url");
            this.f19551a = url;
            this.b = i;
            this.c = z;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19551a;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance == null) {
        } else {
            k.a(mUSDKInstance.getRenderRoot());
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        h();
        if (this.e == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.e);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = true;
        String valueOf = String.valueOf(i);
        if (str == null) {
            q.a();
        }
        a(valueOf, str);
        j();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.d = true;
        this.f = true;
        if (pVar != null) {
            View renderRoot = pVar.getRenderRoot();
            k.a(renderRoot);
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout != null) {
                frameLayout.addView(renderRoot);
            }
        }
        if (this.h) {
            return;
        }
        this.h = true;
        e();
        g();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = true;
        j();
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null || !aVar.c()) {
            return;
        }
        f();
        Activity activity = getActivity();
        if (!(activity instanceof MainSearchResultActivity)) {
            activity = null;
        }
        MainSearchResultActivity mainSearchResultActivity = (MainSearchResultActivity) activity;
        if (mainSearchResultActivity == null) {
            return;
        }
        a(System.currentTimeMillis() - mainSearchResultActivity.C());
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("load_time");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("sversion");
        AppMonitor.register(k.a.KEY_NS_PARAM_MODULE_NAME, nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, create, create2);
    }

    private final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue("load_time", j);
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("sversion", noa.SERVER_VERSION_VALUE);
        AppMonitor.Stat.commit(k.a.KEY_NS_PARAM_MODULE_NAME, nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, create2, create);
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null || !aVar.c()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "sversion", noa.SERVER_VERSION_VALUE);
        AppMonitor.Alarm.commitSuccess(k.a.KEY_NS_PARAM_MODULE_NAME, jyx.a.POINT_NAME, jSONObject.toString());
    }

    private final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.b;
        if (aVar == null || !aVar.c()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "sversion", noa.SERVER_VERSION_VALUE);
        AppMonitor.Alarm.commitFail(k.a.KEY_NS_PARAM_MODULE_NAME, "abailable", jSONObject.toString(), str, str2);
        AppMonitor.Alarm.commitFail(k.a.KEY_NS_PARAM_MODULE_NAME, "abailable_error", jSONObject.toString(), str, str2);
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        h();
        if (this.d) {
            return;
        }
        a("1010", "nerver load");
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        p pVar = this.f19550a;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        pVar.destroy();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        p pVar = this.f19550a;
        if (pVar != null) {
            pVar.onActivityStart();
        }
        p pVar2 = this.f19550a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityResume();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        p pVar = this.f19550a;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        p pVar2 = this.f19550a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityStop();
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.c) {
        } else {
            a aVar = this.b;
            if (aVar != null && aVar.c()) {
                ium parent = getParent();
                if (!(parent instanceof c)) {
                    parent = null;
                }
                c cVar = (c) parent;
                if (cVar == null) {
                    return;
                }
                cVar.destroyAndRemoveFromParent();
            } else {
                i();
                postEvent(nwk.g.a());
            }
            this.c = true;
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (str == null) {
            q.a();
        }
        postEvent(isr.c.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        if (view == null) {
            q.a();
        }
        int measuredHeight = view.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            q.a();
        }
        q.a((Object) frameLayout, "view!!");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            q.a();
        }
        if (measuredHeight == layoutParams.height) {
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) getView();
        if (frameLayout2 == null) {
            q.a();
        }
        q.a((Object) frameLayout2, "view!!");
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            q.a();
        }
        layoutParams2.height = measuredHeight;
        FrameLayout frameLayout3 = (FrameLayout) getView();
        if (frameLayout3 == null) {
            q.a();
        }
        frameLayout3.requestLayout();
    }
}
