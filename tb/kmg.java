package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class kmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<kmr, List<kmt>> f30159a = new ConcurrentHashMap<>();

    public List<kmr> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<kmr, List<kmt>> entry : this.f30159a.entrySet()) {
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    public void a(List<kmr> list, kmt kmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ea7237", new Object[]{this, list, kmtVar});
            return;
        }
        for (kmr kmrVar : list) {
            if (kmrVar != null && kmrVar.e != null && kmrVar.e.f30167a.contains("/messagesdkwrapper.so")) {
                if (this.f30159a.get(kmrVar) == null) {
                    kmv.d("TaskSource", "-------addTask", "list is empty " + kmrVar.toString());
                } else {
                    kmv.d("TaskSource", "-------addTask", "exist old task is ongoing " + kmrVar.toString());
                }
            }
            List<kmt> list2 = this.f30159a.get(kmrVar);
            if (list2 == null) {
                list2 = Collections.synchronizedList(new ArrayList());
                this.f30159a.put(kmrVar, list2);
            } else {
                kmv.b("TaskSource", "addTask", "exist old task is ongoing");
            }
            list2.add(kmtVar);
        }
    }

    public void a(kmr kmrVar, kmt kmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e871f766", new Object[]{this, kmrVar, kmtVar});
        } else if (!this.f30159a.containsKey(kmrVar)) {
        } else {
            this.f30159a.get(kmrVar).remove(kmtVar);
            if (!this.f30159a.get(kmrVar).isEmpty()) {
                return;
            }
            this.f30159a.remove(kmrVar);
        }
    }

    public void a(int i, kmp kmpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fa8fd", new Object[]{this, new Integer(i), kmpVar});
            return;
        }
        for (Map.Entry<kmr, List<kmt>> entry : this.f30159a.entrySet()) {
            entry.getKey();
            List<kmt> value = entry.getValue();
            if (value != null) {
                Iterator<kmt> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        kmt next = it.next();
                        if (i == next.b) {
                            if (kmpVar.d != null) {
                                next.f30172a = kmpVar.d.intValue();
                            }
                            if (kmpVar.f30168a != null) {
                                next.c.q = kmpVar.f30168a.booleanValue();
                            }
                            if (kmpVar.b != null) {
                                next.c.d = kmpVar.b.intValue();
                            }
                            if (kmpVar.c != null) {
                                next.c.e = kmpVar.c.intValue();
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            a(i, new kmp(Integer.valueOf(i2)));
        }
    }
}
