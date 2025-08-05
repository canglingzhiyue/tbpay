package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class oge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Map<b, List<b.a>>> f32024a = new HashMap();
    private Map<Component, List<b.a>> b = new HashMap();

    static {
        kge.a(-894952379);
    }

    public <T> void a(Component component, String str, b<T, ?> bVar, T t) {
        Map<b, List<b.a>> map;
        List<b.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395885ac", new Object[]{this, component, str, bVar, t});
        } else if (!this.f32024a.isEmpty() && !TextUtils.isEmpty(str) && bVar != null && t != null && (map = this.f32024a.get(str)) != null && !map.isEmpty() && (list = map.get(bVar)) != null && !list.isEmpty()) {
            for (b.a aVar : list) {
                aVar.a(component, t);
            }
        }
    }

    public <T, Observer extends b.a<T>> T a(Component component, String str, b<T, Observer> bVar, Observer observer) {
        Component I;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("85cc6a1c", new Object[]{this, component, str, bVar, observer});
        }
        if (component == null || TextUtils.isEmpty(str) || bVar == null || observer == null) {
            return null;
        }
        Map<b, List<b.a>> map = this.f32024a.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.f32024a.put(str, map);
        }
        List<b.a> list = map.get(bVar);
        if (list == null) {
            list = new ArrayList<>();
            map.put(bVar, list);
        }
        if (list.contains(observer)) {
            return null;
        }
        list.add(observer);
        List<b.a> list2 = this.b.get(component);
        if (list2 == null) {
            list2 = new ArrayList<>();
            this.b.put(component, list2);
        }
        list2.add(observer);
        aa a2 = ad.a(component.getNode(), str);
        if (a2 == null || (I = a2.I()) == null || (t = (T) I.getComponentInfo(bVar)) == null) {
            return null;
        }
        observer.a(I, t);
        return t;
    }

    public <T, Observer extends b.a<T>> void b(Component component, String str, b<T, Observer> bVar, b.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e83975", new Object[]{this, component, str, bVar, aVar});
        } else if (component != null && aVar != null) {
            if (!TextUtils.isEmpty(str)) {
                a(this.f32024a.get(str), bVar, aVar);
            } else {
                for (Map.Entry<String, Map<b, List<b.a>>> entry : this.f32024a.entrySet()) {
                    a(entry.getValue(), bVar, aVar);
                }
            }
            List<b.a> list = this.b.get(component);
            if (list == null || list.isEmpty()) {
                return;
            }
            list.remove(aVar);
            if (list.size() != 0) {
                return;
            }
            this.b.remove(component);
        }
    }

    public void a(Component component) {
        List<b.a> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0962223", new Object[]{this, component});
        } else if (component != null && (remove = this.b.remove(component)) != null && !remove.isEmpty()) {
            for (b.a aVar : remove) {
                b(component, null, null, aVar);
            }
        }
    }

    private void a(Map<b, List<b.a>> map, b bVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c0c0c6", new Object[]{this, map, bVar, aVar});
        } else if (map != null && !map.isEmpty() && aVar != null) {
            if (bVar != null) {
                a(map.get(bVar), aVar);
                return;
            }
            for (Map.Entry<b, List<b.a>> entry : map.entrySet()) {
                a(entry.getValue(), aVar);
            }
        }
    }

    private void a(List<b.a> list, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5b9b1f", new Object[]{this, list, aVar});
        } else if (aVar == null || list == null || list.size() == 0) {
        } else {
            list.remove(aVar);
        }
    }
}
