package com.taobao.tao.flexbox.layoutmanager.component;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.v;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.NestViewPager;
import com.taobao.weex.common.Constants;
import java.util.Map;
import tb.kge;
import tb.odx;
import tb.oec;

/* loaded from: classes8.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(950844380);
    }

    public static /* synthetic */ boolean a(ViewPager viewPager, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53e5142", new Object[]{viewPager, view})).booleanValue() : b(viewPager, view);
    }

    public static u a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("f0b4d85c", new Object[]{aaVar, strArr});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa b = b(aaVar, strArr);
        if (b == null) {
            return null;
        }
        return (u) b.I();
    }

    public static com.taobao.tao.flexbox.layoutmanager.core.aa b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("61c5910", new Object[]{aaVar, strArr}) : aaVar.k().A().a(u.class, new aa.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.x.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : odx.a(((u) ((com.taobao.tao.flexbox.layoutmanager.core.aa) obj).I()).getViewParams().m, strArr);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                }
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = (com.taobao.tao.flexbox.layoutmanager.core.aa) obj;
                return aaVar2.K().equals(Constants.Value.GRID) || aaVar2.K().equals("list");
            }
        }, false);
    }

    public static v a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final String[] strArr, boolean z) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("67bb1825", new Object[]{aaVar, strArr, new Boolean(z)});
        }
        if (z) {
            a2 = aaVar.a(v.class, new aa.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.x.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : odx.a(((v.a) ((com.taobao.tao.flexbox.layoutmanager.core.aa) obj).I().getViewParams()).f20202a, strArr);
                }
            }, true);
        } else {
            a2 = aaVar.k().A().a(v.class, new aa.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.x.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : odx.a(((v.a) ((com.taobao.tao.flexbox.layoutmanager.core.aa) obj).I().getViewParams()).f20202a, strArr);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
                public boolean b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = (com.taobao.tao.flexbox.layoutmanager.core.aa) obj;
                    return aaVar2.K().equals(Constants.Value.GRID) || aaVar2.K().equals("list");
                }
            }, false);
        }
        if (a2 == null) {
            return null;
        }
        return (v) a2.I();
    }

    public static TabBarControllerComponent a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarControllerComponent) ipChange.ipc$dispatch("8002a8ad", new Object[]{aaVar});
        }
        final View x = aaVar.x();
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = aaVar.k().A().a(TabBarControllerComponent.class, new aa.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.x.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : x.a((NestViewPager) ((com.taobao.tao.flexbox.layoutmanager.core.aa) obj).x(), x);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
                }
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = (com.taobao.tao.flexbox.layoutmanager.core.aa) obj;
                return aaVar2.K().equals(Constants.Value.GRID) || aaVar2.K().equals("list");
            }
        }, false);
        if (a2 == null) {
            return null;
        }
        return (TabBarControllerComponent) a2.I();
    }

    private static boolean b(ViewPager viewPager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15f41e03", new Object[]{viewPager, view})).booleanValue();
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == viewPager) {
                return true;
            }
            if ((parent instanceof ViewPager) && parent != viewPager) {
                return false;
            }
        }
        return false;
    }

    public static void a(String str, Map map, Component component, String[] strArr, w wVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd09a7a", new Object[]{str, map, component, strArr, wVar});
        } else if (wVar == null) {
        } else {
            if (component instanceof u) {
                z = true ^ ((u) component).f20193a;
            }
            if (str.equals("weexfoldtab")) {
                if (!odx.a(oec.a(map.get("group"), (String[]) null), strArr) || !z) {
                    return;
                }
                wVar.b(map);
            } else if (str.equals("foldtab") || str.equals("onscroll")) {
                if (!odx.a(oec.a(map.get("group"), (String[]) null), strArr) || !z) {
                    return;
                }
                wVar.a(map);
            } else if (!str.equals("canscrollvertical") || !odx.a(oec.a(map.get("group"), (String[]) null), strArr) || !z || !map.containsKey("canScrollVertically") || !map.get("canScrollVertically").equals("-1")) {
            } else {
                wVar.d();
            }
        }
    }
}
