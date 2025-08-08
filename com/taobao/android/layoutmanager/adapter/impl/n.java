package com.taobao.android.layoutmanager.adapter.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.g;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gvw;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.ohd;

/* loaded from: classes5.dex */
public class n implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f13131a = 0;

    static {
        kge.a(-1534890894);
        kge.a(906154419);
    }

    public static /* synthetic */ int a(n nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71dfde5b", new Object[]{nVar, new Integer(i)})).intValue();
        }
        nVar.f13131a = i;
        return i;
    }

    public n() {
        com.taobao.tao.navigation.e.a(new com.taobao.tao.navigation.d() { // from class: com.taobao.android.layoutmanager.adapter.impl.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.d
            public void onTabChanged(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                } else {
                    n.a(n.this, i);
                }
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        if (c != null && (c.getContext() instanceof Activity)) {
            return (Activity) c.getContext();
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{this, context, new Integer(i)})).intValue();
        }
        if (TBMainHost.a(context) != null) {
            try {
                TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
                int height = c.getHeight();
                View findViewById = c.findViewById(R.id.uik_navigation_tab_background);
                if (findViewById != null && findViewById.getHeight() > 0) {
                    height = findViewById.getHeight();
                }
                return height + i;
            } catch (Exception unused) {
            }
        }
        return i;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        return c != null ? c.getCurrentTab() == i : this.f13131a == i;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        if (c == null) {
            return 0;
        }
        return c.getCurrentTab();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean d() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Activity a2 = a();
        if ((a2 instanceof FragmentActivity) && (fragments = ((FragmentActivity) a2).getSupportFragmentManager().getFragments()) != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof TBMainFragment) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public List<Fragment> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        if (c == null) {
            return null;
        }
        return c.getFragments();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this}) : com.taobao.tao.navigation.e.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        if (a2 != null) {
            long a3 = a2.a("launchInteractiveTime", -1L);
            long a4 = a2.a("startProcessSystemTime", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            if (a3 != -1) {
                a3 = currentTimeMillis - (SystemClock.uptimeMillis() - a3);
            }
            if (a4 != -1) {
                hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d.APM_TIME_FROM_LAUNCH, Long.valueOf(currentTimeMillis - a4));
            }
            hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d.APM_HOME_LAUNCH_TIME, Long.valueOf(a3));
            hashMap.put(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d.APM_IS_EXTERNAL_LINK, Boolean.valueOf(com.taobao.tao.flexbox.layoutmanager.container.i.e()));
        }
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            try {
                return gvw.d(Uri.parse(str));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : TBMainHost.a(context) != null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(Object obj, Object obj2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d843", new Object[]{this, obj, obj2, new Boolean(z), num});
            return;
        }
        TBFragmentTabHost c = com.taobao.tao.navigation.e.c();
        if (c == null) {
            return;
        }
        FragmentActivity activity = c.getCurrentFragment() != null ? c.getCurrentFragment().getActivity() : null;
        if (z) {
            c.setUnSeletedNavigationTabsColorFilter(-1, null, null);
            if (num != null) {
                ohd.b((Activity) activity, num.intValue());
            }
            if (!oeb.a("setStatusBarInTab", false)) {
                return;
            }
            ohd.a((Activity) activity, 0, true);
            return;
        }
        c.setUnSeletedNavigationTabsColorFilter(1, Integer.valueOf(odx.a(obj)), Integer.valueOf(odx.a(obj2)));
        ohd.b((Activity) activity, odx.a(obj2));
        if (!oeb.a("setStatusBarInTab", false)) {
            return;
        }
        ohd.a((Activity) activity, 0, false);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            com.taobao.tao.navigation.e.d(i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1059b339", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        boolean z = !StringUtils.isEmpty(str);
        boolean z2 = !StringUtils.isEmpty(str2);
        boolean isEmpty = true ^ StringUtils.isEmpty(str3);
        if (!z && !z2 && !isEmpty) {
            return;
        }
        g c = com.taobao.tao.navigation.e.c(i);
        if (z && z2) {
            int c2 = ohd.c(ab.a(), str);
            int c3 = ohd.c(ab.a(), str2);
            c.a(NavigationTabIconSourceType.DRAWABLE);
            c.a(new Pair(Integer.valueOf(c3), Integer.valueOf(c2)));
        }
        if (isEmpty) {
            c.a(str3);
        }
        com.taobao.tao.navigation.e.c(i, c);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2) {
            com.taobao.tao.navigation.e.a(z);
        } else {
            com.taobao.tao.navigation.e.b(z);
        }
        NavigationTabModule.notifyNavigationShowHideStatus(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : com.taobao.tao.navigation.e.j();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i != 1) {
        } else {
            com.taobao.tao.navigation.e.a("tab2", "content", (View) null);
            com.taobao.tao.navigation.e.a("tab2", NavigationTabMsgMode.NONE, (String) null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be298f42", new Object[]{this, cVar});
        } else {
            com.taobao.tao.navigation.e.a(cVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void b(d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28591761", new Object[]{this, cVar});
        } else {
            com.taobao.tao.navigation.e.b(cVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be28a684", new Object[]{this, aVar});
        } else {
            com.taobao.tao.navigation.e.a(aVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(int i, final d.InterfaceC0837d interfaceC0837d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5306794e", new Object[]{this, new Integer(i), interfaceC0837d});
        } else {
            com.taobao.tao.navigation.e.a(i, interfaceC0837d == null ? null : new com.taobao.tao.navigation.h() { // from class: com.taobao.android.layoutmanager.adapter.impl.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.navigation.h
                public void onCurrentTabDoubleTap() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c22ad2be", new Object[]{this});
                    }
                }

                @Override // com.taobao.tao.navigation.h
                public void onCurrentTabLongClicked() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("79eae8f7", new Object[]{this});
                    }
                }

                @Override // com.taobao.tao.navigation.h
                public void onNavigationTabMessageChanged(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fd5f3e0", new Object[]{this, str});
                    }
                }

                @Override // com.taobao.tao.navigation.h
                public void onCurrentTabClicked() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f77f6793", new Object[]{this});
                        return;
                    }
                    d.InterfaceC0837d interfaceC0837d2 = interfaceC0837d;
                    if (interfaceC0837d2 == null) {
                        return;
                    }
                    interfaceC0837d2.onCurrentTabClicked();
                }
            });
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public void a(d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be291ae3", new Object[]{this, bVar});
        } else {
            com.taobao.tao.navigation.e.a(bVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        boolean b = b(context);
        return (b || str == null) ? b : StringUtils.equals(Uri.parse(str).getQueryParameter(gvw.CONFIG_LAUNCH), "0");
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : LauncherRuntime.k;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : h() == 0;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        Intent intent = null;
        if (context instanceof com.taobao.tao.flexbox.layoutmanager.container.d) {
            intent = ((com.taobao.tao.flexbox.layoutmanager.container.d) context).d();
        } else if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        }
        if (intent == null) {
            return false;
        }
        return com.taobao.android.launcher.bootstrap.tao.ability.b.d(intent);
    }
}
