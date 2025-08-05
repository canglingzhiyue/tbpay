package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.factory.manager.AbsFactoryManager;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class eox extends AbsFactoryManager<eov> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Pair<Integer, eou>> b = new ArrayList<>();
    public ArrayList<Pair<Integer, eow>> c = new ArrayList<>();
    public ArrayList<Pair<Integer, eor>> d = new ArrayList<>();
    public ArrayList<Pair<Integer, eot>> e = new ArrayList<>();
    public ArrayList<Pair<Integer, eos>> f = new ArrayList<>();

    static {
        kge.a(-596942065);
    }

    public static /* synthetic */ Object ipc$super(eox eoxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(eov eovVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68237", new Object[]{this, eovVar, new Integer(i)});
        } else if (eovVar instanceof eou) {
            a((eox) ((eou) eovVar), i, (ArrayList<Pair<Integer, eox>>) this.b);
        } else if (eovVar instanceof eor) {
            a((eox) ((eor) eovVar), i, (ArrayList<Pair<Integer, eox>>) this.d);
        } else if (eovVar instanceof eow) {
            a((eox) ((eow) eovVar), i, (ArrayList<Pair<Integer, eox>>) this.c);
        } else if (eovVar instanceof eot) {
            a((eox) ((eot) eovVar), i, (ArrayList<Pair<Integer, eox>>) this.e);
        } else if (!(eovVar instanceof eos)) {
        } else {
            a((eox) ((eos) eovVar), i, (ArrayList<Pair<Integer, eox>>) this.f);
        }
    }

    public b a(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fc2d4f78", new Object[]{this, iDMComponent, bVar}) : a(this.b, iDMComponent, bVar);
    }

    public epi b(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epi) ipChange.ipc$dispatch("366f61a3", new Object[]{this, iDMComponent, bVar}) : (epi) a(this.c, iDMComponent, bVar);
    }

    public b c(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1b9cb47a", new Object[]{this, iDMComponent, bVar}) : a(this.d, iDMComponent, bVar);
    }

    public epe d(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epe) ipChange.ipc$dispatch("69cdeaa9", new Object[]{this, iDMComponent, bVar});
        }
        if (iDMComponent == null) {
            return null;
        }
        for (int size = this.f.size() - 1; size >= 0; size--) {
            epe b = ((eos) this.f.get(size).second).b(iDMComponent, bVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    private <E extends eov<T>, T extends b> T a(ArrayList<Pair<Integer, E>> arrayList, IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d1585f52", new Object[]{this, arrayList, iDMComponent, bVar});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (iDMComponent.getFields() != null) {
            String string = iDMComponent.getFields().getString("filter");
            if (!TextUtils.isEmpty(string) && eni.a(epo.a(), string, bVar.a())) {
                return null;
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = (T) ((eov) arrayList.get(size).second).b(iDMComponent, bVar);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
