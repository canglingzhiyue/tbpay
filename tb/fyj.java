package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class fyj extends fxx<fxw, fym> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1808265863);
    }

    public fyj(fxz<fxw, fym> fxzVar, Comparator<fxw> comparator, boolean z, boolean z2) {
        super(fxzVar, comparator, z, z2);
    }

    @Override // tb.fxx
    public boolean a(List<fxw> list, List<fxw> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        if (list2.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a() != list2.get(i).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.fxx
    public fyc<fym> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fyc) ipChange.ipc$dispatch("2619c54b", new Object[]{this}) : new fyd();
    }

    @Override // tb.fxx
    public List<fxw> a(List<fxw> list, fxw fxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("27765b03", new Object[]{this, list, fxwVar});
        }
        ArrayList arrayList = new ArrayList();
        for (fxw fxwVar2 : list) {
            if (fxwVar2.a() != fxwVar.a()) {
                arrayList.add(fxwVar2);
            }
        }
        return arrayList;
    }

    @Override // tb.fxx
    public List<fxw> b(List<fxw> list, fxw fxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ea62c462", new Object[]{this, list, fxwVar});
        }
        ArrayList arrayList = new ArrayList();
        for (fxw fxwVar2 : list) {
            if (fxwVar2.a() != fxwVar.a()) {
                arrayList.add(fxwVar2);
            }
        }
        arrayList.add(fxwVar);
        return arrayList;
    }

    @Override // tb.fxx
    public List<fxw> b(List<fxw> list, List<fxw> list2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("94b42b1c", new Object[]{this, list, list2});
        }
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (fxw fxwVar : list) {
            Iterator<fxw> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (fxwVar.a() == it.next().a()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                arrayList.add(fxwVar);
            }
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    @Override // tb.fxx
    public List<fym> a(fxw fxwVar, List<fxw> list, fyc<fym> fycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60338d83", new Object[]{this, fxwVar, list, fycVar});
        }
        ArrayList arrayList = new ArrayList();
        for (fym fymVar : fycVar.h()) {
            Integer g = fycVar.g(fymVar);
            if (g == null || g.intValue() < 0 || g.intValue() > list.size() - 1) {
                return null;
            }
            if (fxwVar.a() == list.get(g.intValue()).a()) {
                arrayList.add(fymVar);
            }
        }
        return arrayList;
    }

    @Override // tb.fxx
    public int a(fxw fxwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9755ac6", new Object[]{this, fxwVar})).intValue() : fxwVar.a();
    }
}
