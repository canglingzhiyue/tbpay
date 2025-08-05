package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.e;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.a;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.bip;
import tb.dkv;
import tb.dle;
import tb.dlr;
import tb.dmm;
import tb.hsu;
import tb.kge;

/* loaded from: classes4.dex */
public class a<P extends com.taobao.android.abilitykit.ability.pop.model.a, CONTEXT extends dlr> extends com.taobao.android.abilitykit.ability.pop.render.b<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    public static final String UT_PAGE_FLAG_KEY = "__fragment_as_ut_page__";
    private FragmentActivity b;
    private ViewGroup c;
    private Fragment d;
    private final Fragment e;

    static {
        kge.a(-1219967641);
        Companion = new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862045111) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -994991334) {
            super.a((a) ((dlr) objArr[0]), (dlr) ((com.taobao.android.abilitykit.ability.pop.model.c) objArr[1]), (View) objArr[2], (d) objArr[3]);
            return null;
        } else if (hashCode != 1714797822) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View contentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
        }
        q.d(contentView, "contentView");
        return false;
    }

    public static final /* synthetic */ Fragment a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("6f4e0c9e", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ Object a(a aVar, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4aeea4ab", new Object[]{aVar, fragmentActivity}) : aVar.b(fragmentActivity);
    }

    public static final /* synthetic */ void a(a aVar, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2074f6", new Object[]{aVar, fragment});
        } else {
            aVar.d = fragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, d dVar) {
        a((a<P, CONTEXT>) ((dlr) dleVar), (dlr) ((com.taobao.android.abilitykit.ability.pop.model.a) cVar), view, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b
    public /* bridge */ /* synthetic */ void a(dlr dlrVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, d dVar) {
        a((a<P, CONTEXT>) dlrVar, (dlr) ((com.taobao.android.abilitykit.ability.pop.model.a) cVar), view, dVar);
    }

    public a(Fragment fragment) {
        this.e = fragment;
    }

    public final FragmentActivity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("8b60e57b", new Object[]{this}) : this.b;
    }

    public final void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
        } else {
            this.b = fragmentActivity;
        }
    }

    public final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final ViewGroup b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7d42400c", new Object[]{this}) : this.c;
    }

    /* loaded from: classes4.dex */
    public static final class b {
        static {
            kge.a(-1603642385);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    public void a(CONTEXT abilityRuntimeContext, P params, View view, d callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d554d98", new Object[]{this, abilityRuntimeContext, params, view, callback});
            return;
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(params, "params");
        q.d(callback, "callback");
        super.a((a<P, CONTEXT>) abilityRuntimeContext, (CONTEXT) params, view, callback);
        Context a2 = abilityRuntimeContext.a();
        if (a2 instanceof FragmentActivity) {
            if (Build.VERSION.SDK_INT < 17) {
                callback.a(new dkv(10000, "OsVer not support"), new PopErrorView(a2, this.f8938a));
                return;
            } else {
                e.a(new RunnableC0343a(callback, a2, View.generateViewId(), params), -1L);
                return;
            }
        }
        d();
        callback.a(new dkv(10015, "Not FragmentActivity"), a2 != null ? new PopErrorView(a2, this.f8938a) : null);
    }

    /* renamed from: com.taobao.android.abilitykit.ability.pop.render.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class RunnableC0343a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ int d;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.a e;

        public RunnableC0343a(d dVar, Context context, int i, com.taobao.android.abilitykit.ability.pop.model.a aVar) {
            this.b = dVar;
            this.c = context;
            this.d = i;
            this.e = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: Throwable -> 0x00d2, TryCatch #0 {Throwable -> 0x00d2, blocks: (B:5:0x002a, B:7:0x0032, B:9:0x0042, B:10:0x0045, B:11:0x004c, B:12:0x004d, B:14:0x0062, B:20:0x006e, B:21:0x0078, B:23:0x00a2, B:24:0x00a7, B:26:0x00b5, B:27:0x00ca), top: B:32:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: Throwable -> 0x00d2, TryCatch #0 {Throwable -> 0x00d2, blocks: (B:5:0x002a, B:7:0x0032, B:9:0x0042, B:10:0x0045, B:11:0x004c, B:12:0x004d, B:14:0x0062, B:20:0x006e, B:21:0x0078, B:23:0x00a2, B:24:0x00a7, B:26:0x00b5, B:27:0x00ca), top: B:32:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[Catch: Throwable -> 0x00d2, TryCatch #0 {Throwable -> 0x00d2, blocks: (B:5:0x002a, B:7:0x0032, B:9:0x0042, B:10:0x0045, B:11:0x004c, B:12:0x004d, B:14:0x0062, B:20:0x006e, B:21:0x0078, B:23:0x00a2, B:24:0x00a7, B:26:0x00b5, B:27:0x00ca), top: B:32:0x002a }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.a.RunnableC0343a.run():void");
        }

        /* renamed from: com.taobao.android.abilitykit.ability.pop.render.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0344a extends FragmentManager.FragmentLifecycleCallbacks {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Fragment b;
            private String c;
            private String d;

            public C0344a(Fragment fragment) {
                this.b = fragment;
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c6cd07a1", new Object[]{this, fragmentManager, fragment, context});
                } else if (!q.a(fragment, this.b)) {
                } else {
                    UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                    q.b(uTAnalytics, "UTAnalytics.getInstance()");
                    UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
                    a aVar = a.this;
                    String str = null;
                    if (!(context instanceof FragmentActivity)) {
                        context = null;
                    }
                    Object a2 = a.a(aVar, (FragmentActivity) context);
                    Map<String, String> pageProperties = defaultTracker.getPageProperties(a2);
                    this.c = pageProperties != null ? pageProperties.get("spm-cnt") : null;
                    Map<String, String> pageProperties2 = defaultTracker.getPageProperties(a2);
                    if (pageProperties2 != null) {
                        str = pageProperties2.get("spm-url");
                    }
                    this.d = str;
                    defaultTracker.pageDisAppear(a2);
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                Uri uri;
                String tag;
                String str;
                String str2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                } else if (!q.a(fragment, this.b)) {
                } else {
                    String str3 = null;
                    try {
                        uri = Uri.parse(RunnableC0343a.this.e.c);
                    } catch (Throwable unused) {
                        uri = null;
                    }
                    UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                    q.b(uTAnalytics, "UTAnalytics.getInstance()");
                    UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
                    Fragment fragment2 = this.b;
                    if (uri == null || (tag = uri.getQueryParameter("pageName")) == null) {
                        tag = this.b.getTag();
                    }
                    defaultTracker.pageAppearDonotSkip(fragment2, tag);
                    Fragment fragment3 = this.b;
                    Pair[] pairArr = new Pair[3];
                    if (uri != null) {
                        str3 = uri.getQueryParameter("spm-cnt");
                    }
                    pairArr[0] = j.a("spm-cnt", str3);
                    if (uri == null || (str = uri.getQueryParameter("spm-url")) == null) {
                        str = this.c;
                    }
                    pairArr[1] = j.a("spm-url", str);
                    if (uri == null || (str2 = uri.getQueryParameter(bip.KEY_UMBRELLA_SPM_PRE)) == null) {
                        str2 = this.d;
                    }
                    pairArr[2] = j.a(bip.KEY_UMBRELLA_SPM_PRE, str2);
                    defaultTracker.updatePageProperties(fragment3, ai.a(pairArr));
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
                } else if (!q.a(fragment, this.b)) {
                } else {
                    UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                    q.b(uTAnalytics, "UTAnalytics.getInstance()");
                    uTAnalytics.getDefaultTracker().pageDisAppear(this.b);
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9620caf9", new Object[]{this, fragmentManager, fragment});
                } else if (!q.a(fragment, this.b)) {
                } else {
                    UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                    q.b(uTAnalytics, "UTAnalytics.getInstance()");
                    UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
                    a aVar = a.this;
                    Context context = RunnableC0343a.this.c;
                    if (!(context instanceof FragmentActivity)) {
                        context = null;
                    }
                    defaultTracker.pageAppear(a.a(aVar, (FragmentActivity) context));
                }
            }
        }
    }

    private final boolean a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0514e", new Object[]{this, fragment})).booleanValue();
        }
        Bundle arguments = fragment.getArguments();
        return arguments != null && arguments.getBoolean(UT_PAGE_FLAG_KEY, false);
    }

    private final Object b(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ad4d1318", new Object[]{this, fragmentActivity});
        }
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return null;
        }
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments.isEmpty()) {
            return fragmentActivity;
        }
        q.b(fragments, "fragments");
        for (Fragment it : fragments) {
            q.b(it, "it");
            if (a(it)) {
                return it;
            }
        }
        return fragmentActivity;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        viewGroup.requestLayout();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            d();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FragmentActivity fragmentActivity = this.b;
        if (fragmentActivity == null) {
            return;
        }
        Fragment fragment = this.d;
        if (fragment != null) {
            try {
                fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
                this.d = null;
            } catch (Throwable th) {
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                cVar.a("stdPopTag", "onFragmentRelease exp:" + dmm.a(th));
                AppMonitor.Alarm.commitFail("AbilityKit", "ExecuteException", "fragmentPopReleaseError", dmm.a(th));
            }
        }
        this.b = null;
        this.c = null;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        super.b(view);
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        this.c = (ViewGroup) view;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        super.a(type, jSONObject);
        FragmentActivity fragmentActivity = this.b;
        if (fragmentActivity == null) {
            return;
        }
        Intent intent = new Intent(type);
        intent.replaceExtras(hsu.a(intent.getExtras(), jSONObject));
        LocalBroadcastManager.getInstance(fragmentActivity.getApplicationContext()).sendBroadcast(intent);
    }
}
