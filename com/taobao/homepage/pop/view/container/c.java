package com.taobao.homepage.pop.view.container;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.view.container.application.ApplicationHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.main.MainHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.sub.SubHierarchyPopContainer;
import com.taobao.homepage.pop.view.container.window.WindowHierarchyPopContainer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kyu;
import tb.lak;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lak f17264a;
    private final Map<Integer, WeakReference<BasePopContainer>> b = new ConcurrentHashMap(4);

    public c(lak lakVar) {
        this.f17264a = lakVar;
    }

    public Map<Integer, WeakReference<BasePopContainer>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }

    public BasePopContainer a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("f9db05df", new Object[]{this, new Integer(i)});
        }
        WeakReference<BasePopContainer> weakReference = this.b.get(Integer.valueOf(i));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public BasePopContainer a(Context context, int i, kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("e009d330", new Object[]{this, context, new Integer(i), kyuVar});
        }
        WeakReference<BasePopContainer> remove = this.b.remove(Integer.valueOf(i));
        BasePopContainer basePopContainer = remove == null ? null : remove.get();
        if (basePopContainer != null) {
            basePopContainer.destroy();
            if (basePopContainer.getParent() instanceof ViewGroup) {
                ((ViewGroup) basePopContainer.getParent()).removeView(basePopContainer);
            }
        }
        BasePopContainer a2 = a(i, context, kyuVar);
        this.b.put(Integer.valueOf(i), new WeakReference<>(a2));
        com.taobao.homepage.pop.utils.c.a("PopContainerFactory ", "create container success, hierarchy=" + i);
        return a2;
    }

    private BasePopContainer a(int i, Context context, kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("8d73951a", new Object[]{this, new Integer(i), context, kyuVar});
        }
        if (i == 0) {
            return new WindowHierarchyPopContainer(context, this.f17264a, i, kyuVar);
        }
        if (i == 1) {
            return new MainHierarchyPopContainer(context, this.f17264a, i, kyuVar);
        }
        if (i == 3) {
            return new ApplicationHierarchyPopContainer(context, this.f17264a, i, kyuVar);
        }
        return new SubHierarchyPopContainer(context, this.f17264a, i, kyuVar);
    }
}
