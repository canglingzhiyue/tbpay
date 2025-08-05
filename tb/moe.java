package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.impl.trace.l;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.tbmainfragment.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class moe extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<WeakReference<Fragment>, Long> f31162a = new ConcurrentHashMap();
    private final Map<Fragment, IPage> b = new HashMap();
    private l c;
    private j d;
    private final Activity e;
    private final String f;
    private final IPage g;

    public static /* synthetic */ Object ipc$super(moe moeVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070443536:
                super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -2001641611:
                super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1926632732:
                super.onFragmentActivityCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case -1776235783:
                super.onFragmentDetached((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1547495758:
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1501849859:
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1306679736:
                super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                return null;
            case -959641695:
                super.onFragmentAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                return null;
            case -473528248:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -408572854:
                super.onFragmentSaveInstanceState((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 165640294:
                super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                return null;
            case 632639987:
                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 951718524:
                super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 2067268814:
                super.onFragmentPreCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public moe(Activity activity, IPage iPage, String str) {
        this.e = activity;
        this.f = str;
        this.g = iPage;
        m a2 = a.a(a.FRAGMENT_LIFECYCLE_DISPATCHER);
        if (a2 instanceof l) {
            this.c = (l) a2;
        }
        m a3 = a.a(a.FRAGMENT_LIFECYCLE_FUNCTION_DISPATCHER);
        if (a3 instanceof j) {
            this.d = (j) a3;
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df7866", new Object[]{this, fragmentManager, fragment, context});
            return;
        }
        super.onFragmentPreAttached(fragmentManager, fragment, context);
        String b = b(this.e, fragment);
        mov a2 = new mov().a(fragment);
        if (!d.o && !mna.b(fragment.getClass().getName())) {
            z = false;
        }
        IPage a3 = a2.c(z).a(this.e.getWindow()).a(this.g).a(this.f).a();
        this.b.put(fragment, a3);
        ProcedureGlobal.PROCEDURE_MANAGER.a(fragment, a3);
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.containsKey("CLICK_TIME")) {
            a3.e().i(arguments.getLong("CLICK_TIME"));
        }
        a3.d().a(com.taobao.monitor.impl.util.d.b(fragment), b, a(this.e, fragment));
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentPreAttached", h.a());
        }
        a(fragment, "onFragmentPreAttached");
        if (!f.a(this.c)) {
            this.c.a(fragment, h.a());
        }
        f31162a.put(new WeakReference<>(fragment), Long.valueOf(h.a()));
        if (!b(fragment)) {
            return;
        }
        String str = mnd.u;
        com.taobao.application.common.impl.d.a().b("lastJumpPageSchemaUrl", str);
        mnd.u = b(this.e, fragment);
        if (!(a3 instanceof mou)) {
            return;
        }
        ((mou) a3).e(str);
    }

    private Map<String, Object> a(Activity activity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21d25a6d", new Object[]{this, activity, fragment});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityName", com.taobao.monitor.impl.util.d.b(activity));
        hashMap.put("fullPageName", com.taobao.monitor.impl.util.d.a(fragment));
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            if (arguments.getBoolean(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false)) {
                hashMap.put(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL, true);
                hashMap.put("navStartTime", Long.valueOf(h.a(arguments.getLong("NAV_TO_URL_START_TIME", -1L))));
                hashMap.put("navStartPageTime", Long.valueOf(h.a(arguments.getLong(s.KEY_FRAGMENT_START_TIME, -1L))));
            }
            hashMap.put("constructPageTime", Long.valueOf(arguments.getLong("CONSTRUCT_PAGE_TIME")));
        }
        if (!hashMap.containsKey("navStartTime")) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    hashMap.put("navStartTime", Long.valueOf(h.a(intent.getLongExtra("NAV_TO_URL_START_TIME", -1L))));
                    hashMap.put("navStartPageTime", Long.valueOf(h.a(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                }
            } catch (Exception e) {
                mpi.c("FragmentLifecycle", e);
            }
        }
        return hashMap;
    }

    private boolean b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6442eded", new Object[]{this, fragment})).booleanValue();
        }
        Bundle arguments = fragment.getArguments();
        return arguments != null && arguments.getBoolean(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false);
    }

    private String b(Activity activity, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cabc9fe9", new Object[]{this, activity, fragment});
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.getBoolean(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL, false)) {
            Object obj = arguments.get(s.KEY_FRAGMENT_URL);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
        return com.taobao.monitor.impl.util.d.a(activity);
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd07a1", new Object[]{this, fragmentManager, fragment, context});
            return;
        }
        super.onFragmentAttached(fragmentManager, fragment, context);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentAttached", h.a());
        }
        a(fragment, "onFragmentAttached");
        if (f.a(this.c)) {
            return;
        }
        this.c.b(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3804ce", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentPreCreated(fragmentManager, fragment, bundle);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentPreCreated", h.a());
        }
        a(fragment, "onFragmentPreCreated");
        if (f.a(this.c)) {
            return;
        }
        this.c.c(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b551f3", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentCreated", h.a());
        }
        a(fragment, "onFragmentCreated");
        if (!f.a(this.c)) {
            this.c.d(fragment, h.a());
        }
        IPage iPage = this.b.get(fragment);
        if (!(iPage instanceof mou)) {
            return;
        }
        iPage.g().a(mpa.RECOVERY_FROM_SAVED_INSTANCE, bundle == null ? null : bundle.getString("apmFragmentRecovery"));
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d29eae4", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentActivityCreated", h.a());
        }
        a(fragment, "onFragmentActivityCreated");
        if (f.a(this.c)) {
            return;
        }
        this.c.e(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21da648", new Object[]{this, fragmentManager, fragment, view, bundle});
            return;
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentViewCreated", h.a());
        }
        a(fragment, "onFragmentViewCreated");
        if (f.a(this.c)) {
            return;
        }
        this.c.f(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c68848", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStarted(fragmentManager, fragment);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentStarted", h.a());
        }
        a(fragment, "onFragmentStarted");
        if (f.a(this.c)) {
            return;
        }
        this.c.g(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        mnd.i = com.taobao.monitor.impl.util.d.a(fragment);
        IPage iPage = this.b.get(fragment);
        if (iPage != null) {
            iPage.d().a();
        }
        if (b(fragment)) {
            mnd.u = b(this.e, fragment);
            if (iPage instanceof mou) {
                com.taobao.application.common.impl.d.a().b("lastJumpPageSchemaUrl", ((mou) iPage).s());
            }
        }
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentResumed", h.a());
        }
        a(fragment, "onFragmentResumed");
        if (!f.a(this.c)) {
            this.c.h(fragment, h.a());
        }
        mnx.a().b(iPage);
        com.taobao.application.common.impl.d.a().b("currFragmentName", com.taobao.monitor.impl.util.d.a(fragment));
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        mnd.i = "";
        IPage iPage = this.b.get(fragment);
        if (d.al) {
            if ((iPage instanceof mou) && (iPage.d() instanceof mod)) {
                iPage.d().c();
            }
        } else if ((iPage instanceof mou) && (iPage.d() instanceof mod)) {
            ((mod) iPage.d()).b();
        }
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentPaused", h.a());
        }
        a(fragment, "onFragmentPaused");
        if (!f.a(this.c)) {
            this.c.i(fragment, h.a());
        }
        mnx.a().c(iPage);
        com.taobao.application.common.impl.d.a().a("currFragmentName");
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ba127c", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
        if (!d.al) {
            IPage iPage = this.b.get(fragment);
            if (iPage instanceof mou) {
                iPage.d().c();
            }
        }
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentStopped", h.a());
        }
        a(fragment, "onFragmentStopped");
        if (f.a(this.c)) {
            return;
        }
        this.c.j(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a5ac4a", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentSaveInstanceState", h.a());
        }
        a(fragment, "onFragmentSaveInstanceState");
        if (!f.a(this.c)) {
            this.c.k(fragment, h.a());
        }
        IPage iPage = this.b.get(fragment);
        if (!(iPage instanceof mou)) {
            return;
        }
        bundle.putString("apmFragmentRecovery", iPage.c());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b15f75", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentViewDestroyed", h.a());
        }
        a(fragment, "onFragmentViewDestroyed");
        if (f.a(this.c)) {
            return;
        }
        this.c.l(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849789f0", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentDestroyed", h.a());
        }
        a(fragment, "onFragmentDestroyed");
        if (f.a(this.c)) {
            return;
        }
        this.c.m(fragment, h.a());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9620caf9", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDetached(fragmentManager, fragment);
        a(fragment, "onFragmentDetached");
        IPage iPage = this.b.get(fragment);
        if (iPage != null) {
            iPage.d().d();
            ProcedureGlobal.PROCEDURE_MANAGER.a(iPage);
            this.b.remove(fragment);
        }
        if (!f.a(this.d)) {
            this.d.a(fragment.getActivity(), fragment, "onFragmentDetached", h.a());
        }
        if (!f.a(this.c)) {
            this.c.n(fragment, h.a());
        }
        Iterator<Map.Entry<WeakReference<Fragment>, Long>> it = f31162a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakReference<Fragment>, Long> next = it.next();
            if (next.getKey() == null || next.getKey().get() == null || next.getKey().get() == fragment) {
                it.remove();
            }
        }
    }

    public static long a(Fragment fragment) {
        Fragment fragment2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f0513e", new Object[]{fragment})).longValue();
        }
        for (Map.Entry<WeakReference<Fragment>, Long> entry : f31162a.entrySet()) {
            if (entry.getKey() != null && (fragment2 = entry.getKey().get()) != null && fragment2 == fragment) {
                return entry.getValue().longValue();
            }
        }
        return -1L;
    }

    private void a(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e37c94", new Object[]{this, fragment, str});
            return;
        }
        IPage iPage = this.b.get(fragment);
        if (iPage == null) {
            mpi.a("PageLifeCycle", "nonFragmentPageSession", com.taobao.monitor.impl.util.d.a(fragment), str);
        } else {
            mpi.a("PageLifeCycle", iPage.c(), com.taobao.monitor.impl.util.d.a(fragment), str);
        }
    }
}
