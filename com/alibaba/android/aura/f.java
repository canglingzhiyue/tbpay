package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.arc;
import tb.ard;
import tb.ark;
import tb.baz;
import tb.kge;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2140a = "AURAExtensionManager";
    private List<ark> b;
    private final d c;

    static {
        kge.a(-1580318084);
    }

    public f(d dVar) {
        this.c = dVar;
    }

    public <T> T a(Object obj, String str, Class<T> cls) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("896ef123", new Object[]{this, obj, str, cls});
        }
        if (obj != null && (dVar = this.c) != null) {
            IAURAInputField a2 = dVar.a(obj.getClass(), str);
            if (a2 == null) {
                arc.a().c("AURAExtensionManager", obj.getClass() + ".getExtInputField", "参数【" + str + "】没有注入");
                return null;
            }
            try {
                return (T) a2.mo136getData();
            } catch (Throwable th) {
                arc.a().c("AURAExtensionManager", obj.getClass() + ".getExtInputField", a2.getErrorMessage() + "|类型转换失败，error=" + th.getMessage());
            }
        }
        return null;
    }

    public void a(ark arkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0931e3e", new Object[]{this, arkVar});
            return;
        }
        if (this.b == null) {
            if (baz.a("useCopyOnWriteForExtensionManager", true, true)) {
                this.b = new CopyOnWriteArrayList();
            } else {
                this.b = new ArrayList();
            }
        }
        if (this.b.contains(arkVar)) {
            return;
        }
        this.b.add(arkVar);
    }

    public <E extends ark> E a(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("271855f7", new Object[]{this, cls});
        }
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            ard a2 = arc.a();
            a2.c("AURAExtensionManager", "getExtensionImpl", "请确保传入的extensionImplInterfaceClass是一个扩展点类(接口或者抽象类),extensionImplInterfaceClass=" + cls);
            return null;
        }
        List<ark> list = this.b;
        if (list == null || list.isEmpty()) {
            ard a3 = arc.a();
            a3.a("AURAExtensionManager", "getExtensionImpl", "未注册该扩展点，请确认是否正确,extensionImplInterfaceClass=" + cls);
            return null;
        }
        Iterator<ark> it = this.b.iterator();
        while (it.hasNext()) {
            E e = (E) it.next();
            if (cls.isAssignableFrom(e.getClass())) {
                return e;
            }
        }
        return null;
    }

    public <E extends ark> List<E> b(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2da1953", new Object[]{this, cls});
        }
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            ard a2 = arc.a();
            a2.c("AURAExtensionManager", "getExtensionImpls", "请确保传入的extensionImplInterfaceClass是一个扩展点类(接口或者抽象类),extensionImplInterfaceClass=" + cls);
            return Collections.emptyList();
        }
        List<ark> list = this.b;
        if (list == null || list.isEmpty()) {
            ard a3 = arc.a();
            a3.a("AURAExtensionManager", "getExtensionImpls", "未注册该扩展点，请确认是否正确,extensionImplInterfaceClass=" + cls);
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ark arkVar : this.b) {
            if (cls.isAssignableFrom(arkVar.getClass())) {
                try {
                    arrayList.add(arkVar);
                } catch (Throwable th) {
                    arc.a().c("AURAExtensionManager", "getExtensionImpls", th.getMessage());
                }
            }
        }
        return arrayList;
    }

    public List<ark> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<ark> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<ark> list = this.b;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b();
        }
    }
}
