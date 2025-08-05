package tb;

import android.app.Activity;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.datasdk.factory.manager.AbsFactoryManager;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class dzy extends AbsFactoryManager<dzr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<Integer, dzq>> b = new ArrayList<>();
    private ArrayList<Pair<Integer, dzo>> c = new ArrayList<>();
    private ArrayList<Pair<Integer, dzs>> d = new ArrayList<>();
    private ArrayList<Pair<Integer, dzp>> e = new ArrayList<>();

    static {
        kge.a(-631631373);
    }

    public static /* synthetic */ Object ipc$super(dzy dzyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dzy() {
        a(new dzw(), 5);
        a(new dzt(), 5);
        a(new dzx(), 5);
        a(new dzu(), 5);
        emu.a("com.taobao.android.detail.core.detail.kit.view.factory.manager.ViewHolderFactoryManager");
    }

    public void a(dzr dzrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8d37c7", new Object[]{this, dzrVar, new Integer(i)});
        } else if (dzrVar instanceof dzq) {
            a((dzy) ((dzq) dzrVar), i, (ArrayList<Pair<Integer, dzy>>) this.b);
        } else if (dzrVar instanceof dzo) {
            a((dzy) ((dzo) dzrVar), i, (ArrayList<Pair<Integer, dzy>>) this.c);
        } else if (dzrVar instanceof dzs) {
            a((dzy) ((dzs) dzrVar), i, (ArrayList<Pair<Integer, dzy>>) this.d);
        } else if (!(dzrVar instanceof dzp)) {
        } else {
            a((dzy) ((dzp) dzrVar), i, (ArrayList<Pair<Integer, dzy>>) this.e);
        }
    }

    public c<b> a(Activity activity, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6d46f79b", new Object[]{this, activity, bVar});
        }
        c<b> cVar = (c) a((ArrayList) this.b, activity, (Activity) bVar);
        return (cVar != null || !(bVar instanceof epf)) ? cVar : a(activity, (epf) bVar);
    }

    public c<egq> a(Activity activity, egq egqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e978434", new Object[]{this, activity, egqVar}) : (c) a((ArrayList) this.c, activity, (Activity) egqVar);
    }

    public c<epi> a(Activity activity, epi epiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6c9bcdc5", new Object[]{this, activity, epiVar}) : (c) a((ArrayList) this.d, activity, (Activity) epiVar);
    }

    public com.taobao.android.detail.core.detail.kit.view.holder.desc.b<epf> a(Activity activity, epf epfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) ipChange.ipc$dispatch("f7bcaee7", new Object[]{this, activity, epfVar}) : (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) a((ArrayList) this.e, activity, (Activity) epfVar);
    }

    private <E extends dzr<T, R>, T, R> R a(ArrayList<Pair<Integer, E>> arrayList, Activity activity, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("78e3ca42", new Object[]{this, arrayList, activity, t});
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            R r = (R) ((dzr) arrayList.get(size).second).a(activity, t);
            if (r != null) {
                return r;
            }
        }
        return null;
    }
}
