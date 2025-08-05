package com.taobao.tao.flexbox.layoutmanager.core;

import android.text.TextUtils;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.IndicatorComponent;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.SliderComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import tb.gwa;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f20346a;
    private static List<com.taobao.tao.flexbox.layoutmanager.component.h> b;
    private static HashMap<String, Class<? extends Component>> c;
    private static HashSet<String> d;
    private static HashMap<String, Boolean> e;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(Component component);
    }

    public static /* synthetic */ boolean a(String str, String str2, Class cls, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bde5909", new Object[]{str, str2, cls, aVar})).booleanValue() : b(str, str2, cls, aVar);
    }

    static {
        kge.a(-1717030860);
        f20346a = new HashMap<>();
        b = new ArrayList();
        c = new HashMap<>();
        d = new HashSet<>();
        e = new HashMap<>();
        b();
        b("text", TextComponent.class);
        b("image", com.taobao.tao.flexbox.layoutmanager.component.j.class);
        b("div", com.taobao.tao.flexbox.layoutmanager.component.e.class);
        b("highlight", com.taobao.tao.flexbox.layoutmanager.component.e.class);
        b("input", EditTextComponent.class);
        b("textarea", EditTextComponent.class);
        b("richText", RichTextComponent.class);
        b(Constants.Value.GRID, com.taobao.tao.flexbox.layoutmanager.component.m.class);
        b("list", com.taobao.tao.flexbox.layoutmanager.component.m.class);
        b(AbsListWidgetInstance.SLOT_SECTION, com.taobao.tao.flexbox.layoutmanager.component.s.class);
        b("header", com.taobao.tao.flexbox.layoutmanager.component.g.class);
        b("cells", com.taobao.tao.flexbox.layoutmanager.component.d.class);
        b("scrollView", ScrollViewComponent.class);
        b(WXBasicComponentType.SLIDER, SliderComponent.class);
        b("poplayer", PopLayerComponent.class);
        b("TabBar", com.taobao.tao.flexbox.layoutmanager.component.u.class);
        b("TabBarController", TabBarControllerComponent.class);
        b("drawer", DrawerComponent.class);
        b("TabBarHeader", com.taobao.tao.flexbox.layoutmanager.component.v.class);
        b("node", com.taobao.tao.flexbox.layoutmanager.component.p.class);
        b("mediaBrowser", com.taobao.tao.flexbox.layoutmanager.component.c.class);
        b("browserex", com.taobao.tao.flexbox.layoutmanager.component.c.class);
        b(WXBasicComponentType.INDICATOR, IndicatorComponent.class);
        b("maskLayer", com.taobao.tao.flexbox.layoutmanager.component.o.class);
        b("richtext", RichTextContainerComponent.class);
        b("ellipsize", com.taobao.tao.flexbox.layoutmanager.component.f.class);
        b("expandableView", com.taobao.tao.flexbox.layoutmanager.component.a.class);
        b("expandIndicator", com.taobao.tao.flexbox.layoutmanager.component.e.class);
        b("tracker", com.taobao.tao.flexbox.layoutmanager.component.z.class);
        b("progress", com.taobao.tao.flexbox.layoutmanager.component.q.class);
        b("effectView", com.taobao.tao.flexbox.layoutmanager.component.b.class);
        b("sheet", com.taobao.tao.flexbox.layoutmanager.component.t.class);
        b("marqueeex", com.taobao.tao.flexbox.layoutmanager.component.n.class);
        b("marquee", TextComponent.class);
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            a(new gwa());
        }
    }

    public static void a(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else if (c.put(str, cls) == null) {
        } else {
            ogg.b(str + " already in the factory");
        }
    }

    private static void b(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d214a62a", new Object[]{str, cls});
            return;
        }
        a(str, cls);
        d.add(str);
    }

    public static void a(com.taobao.tao.flexbox.layoutmanager.component.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc06734a", new Object[]{hVar});
        } else {
            b.add(hVar);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            f20346a.put(str, str2);
        }
    }

    public static Component a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (com.taobao.tao.flexbox.layoutmanager.component.h hVar : b) {
                Component a2 = hVar.a(str);
                if (a2 != null) {
                    a2.name = str;
                    return a2;
                }
            }
        }
        Class<? extends Component> cls = c.get(str);
        if (cls != null) {
            try {
                Component newInstance = cls.newInstance();
                if (newInstance != null) {
                    newInstance.name = str;
                }
                return newInstance;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (InstantiationException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (c.containsKey(str)) {
            return true;
        }
        String str2 = f20346a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return a(str, str2, null);
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379e21f4", new Object[]{str, aVar});
            return;
        }
        Component a2 = a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        String str2 = f20346a.get(str);
        if (TextUtils.isEmpty(str2)) {
            ogg.a("ComponentFactory loadComponent failed, remoteClassName is NULL for type " + str);
            aVar.a();
            return;
        }
        w.a(false, "type", str2);
        a(str, str2, aVar);
    }

    private static boolean a(final String str, final String str2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89998b6e", new Object[]{str, str2, aVar})).booleanValue();
        }
        try {
            Class<?> cls = Class.forName(str2, true, com.alibaba.flexa.compat.c.class.getClassLoader());
            if (e.get(str) == null) {
                e.put(str, true);
            }
            return b(str, str2, cls, aVar);
        } catch (Throwable th) {
            ogg.c("ComponentFactory", "loadComponent failed, type:" + str + " name:" + str2 + " msg:" + th.getMessage());
            com.alibaba.flexa.compat.c.a(str2, new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls2});
                    } else if (cls2 != null) {
                        e.a(str, str2, cls2, aVar);
                    } else {
                        ogg.a("ComponentFactory loadComponent failed,  newInstance failed for type " + str);
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a();
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        return;
                    }
                    ogg.a("ComponentFactory loadComponent failed, ClassNotFound for type " + str);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    w.a(true, "type", str2, "error", "ClassNotFound");
                }
            });
            if (e.get(str) == null) {
                e.put(str, false);
            }
            return false;
        }
    }

    private static boolean b(String str, String str2, Class cls, a aVar) {
        try {
            c.put(str, cls);
            Component component = (Component) cls.newInstance();
            component.name = str;
            if (aVar != null) {
                aVar.a(component);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            w.a(true, "type", str2, "error", th.toString());
            ogg.a("ComponentFactory loadComponent failed,  newInstance failed for type " + str);
            if (aVar != null) {
                aVar.a();
            }
            return false;
        }
    }
}
