package tb;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.data.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.xsearchplugin.muise.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;

/* loaded from: classes6.dex */
public final class htm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, List<iuk<?, ?>>> f28777a;
    private final HashMap<String, List<iuk<?, ?>>> b;
    private final HashMap<String, List<iuk<?, ?>>> c;
    private final ArrayList<iuk<?, ?>> d;
    private final htd e;
    private final irr<?, ?, ?, ?, ?> f;

    static {
        kge.a(1922151130);
    }

    public htm(htd htdVar, irr<?, ?, ?, ?, ?> parentWidget) {
        q.c(parentWidget, "parentWidget");
        this.e = htdVar;
        this.f = parentWidget;
        this.f28777a = new HashMap<>();
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new ArrayList<>();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.clear();
        this.f28777a.clear();
        a(this.b, true);
        Iterator<iuk<?, ?>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().destroyAndRemoveFromParent();
        }
        this.d.clear();
    }

    public final List<iuk<?, ?>> a(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, type});
        }
        q.c(type, "type");
        return this.f28777a.get(type);
    }

    public final iuk<BaseTypedBean, ?> a(BaseTypedBean bean, String widgetType, b<?, ?> dataSource, rul<? super String, ? extends ise<irp, ? extends itn>> muiseGetter, rul<? super String, ? extends ise<irp, ? extends ito>> weexGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("925a9f93", new Object[]{this, bean, widgetType, dataSource, muiseGetter, weexGetter});
        }
        q.c(bean, "bean");
        q.c(widgetType, "widgetType");
        q.c(dataSource, "dataSource");
        q.c(muiseGetter, "muiseGetter");
        q.c(weexGetter, "weexGetter");
        iuk<BaseTypedBean, ?> iukVar = null;
        irq I = this.f.I();
        q.a((Object) I, "parentWidget.creatorParam");
        I.g = new iuo();
        if (isj.a(bean)) {
            TemplateBean template = dataSource.getTemplate(bean.type);
            if (template == null) {
                return iukVar;
            }
            ito a2 = weexGetter.mo2421invoke(widgetType).a(new irp(I, template));
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
            }
            return a2;
        } else if (isj.b(bean)) {
            TemplateBean template2 = dataSource.getTemplate(bean.type);
            if (template2 == null) {
                return iukVar;
            }
            itn a3 = muiseGetter.mo2421invoke(widgetType).a(new irp(I, template2));
            if (a3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
            }
            return a3;
        } else {
            iuk<BaseTypedBean, ?> a4 = this.f.c().i().a((Class<? extends BaseTypedBean>) bean.getClass(), (Class<?>) I);
            if (a4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
            }
            return a4;
        }
    }

    private final iuk<BaseTypedBean, ?> a(BaseTypedBean baseTypedBean, List<iuk<BaseTypedBean, ?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("ac7f1255", new Object[]{this, baseTypedBean, list});
        }
        iuk<BaseTypedBean, ?> iukVar = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iuk<BaseTypedBean, ?> iukVar2 = list.get(i);
            if (((iukVar2 instanceof o) && q.a(((o) iukVar2).t(), baseTypedBean)) || ((iukVar2 instanceof jzf) && q.a(((jzf) iukVar2).t(), baseTypedBean))) {
                iukVar = list.remove(i);
                break;
            }
        }
        return iukVar == null ? list.remove(0) : iukVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    public final iuk<BaseTypedBean, ?> a(c mod, b<?, ?> dataSource, rul<? super String, ? extends ise<irp, ? extends itn>> muiseGetter, rul<? super String, ? extends ise<irp, ? extends ito>> weexGetter) {
        List<iuk<?, ?>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("f49ac43c", new Object[]{this, mod, dataSource, muiseGetter, weexGetter});
        }
        q.c(mod, "mod");
        q.c(dataSource, "dataSource");
        q.c(muiseGetter, "muiseGetter");
        q.c(weexGetter, "weexGetter");
        ViewParent viewParent = null;
        iuk<BaseTypedBean, ?> iukVar = null;
        htd htdVar = this.e;
        if (htdVar != null && htdVar.a(mod.b().type) && (list = this.c.get(mod.b().type)) != null && (true ^ list.isEmpty())) {
            iukVar = a(mod.b(), x.f(list));
            ?? view = iukVar.getView();
            ViewParent parent = view != 0 ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewParent = parent;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            if (viewGroup != 0) {
                viewGroup.removeView(iukVar.getView());
            }
        }
        if (iukVar == null) {
            iukVar = a(mod.b(), mod.a(), dataSource, muiseGetter, weexGetter);
        }
        if (iukVar != null) {
            List<iuk<?, ?>> a2 = a(this.f28777a, mod.a());
            if (a2 != null) {
                a2.add(iukVar);
            }
            if (StringUtils.isEmpty(mod.b().type)) {
                this.d.add(iukVar);
            } else {
                List<iuk<?, ?>> a3 = a(this.b, mod.b().type);
                if (a3 != null) {
                    a3.add(iukVar);
                }
            }
        }
        return iukVar;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(this.c, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    private final void a(iuk<?, ?> iukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6429b9", new Object[]{this, iukVar});
            return;
        }
        ?? view = iukVar.getView();
        if (view == 0) {
            q.a();
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != 0) {
            viewGroup.removeView(iukVar.getView());
        }
        iukVar.destroyAndRemoveFromParent();
    }

    private final List<iuk<?, ?>> a(HashMap<String, List<iuk<?, ?>>> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50cd452", new Object[]{this, hashMap, str});
        }
        if (str == null) {
            return null;
        }
        List<iuk<?, ?>> list = hashMap.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        hashMap.put(str, arrayList);
        return arrayList;
    }

    private final void a(HashMap<String, List<iuk<?, ?>>> hashMap, boolean z) {
        List<iuk<?, ?>> list;
        htd htdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480c7fe9", new Object[]{this, hashMap, new Boolean(z)});
            return;
        }
        Set<String> keySet = hashMap.keySet();
        q.a((Object) keySet, "headers.keys");
        for (String str : keySet) {
            if (str != null && (list = hashMap.get(str)) != null) {
                for (iuk<?, ?> iukVar : list) {
                    if (z && (htdVar = this.e) != null && htdVar.a(str)) {
                        List<iuk<?, ?>> a2 = a(this.c, str);
                        if (a2 != null) {
                            a2.add(iukVar);
                        }
                    } else {
                        a(iukVar);
                    }
                }
            }
        }
        hashMap.clear();
    }
}
