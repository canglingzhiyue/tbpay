package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class box {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1618482926);
    }

    public static void a(b bVar, bnv bnvVar, d.c cVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabe61d7", new Object[]{bVar, bnvVar, cVar, dVar});
        } else if (bVar.H() != null && !bVar.H().isEmpty()) {
            a(bVar.H(), cVar, bnvVar, dVar);
        } else {
            dVar.a(cVar);
            dVar.a(127);
        }
    }

    public static void a(List<jok> list, d.c cVar, bnv bnvVar, d dVar) {
        ArrayList arrayList;
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989dedb2", new Object[]{list, cVar, bnvVar, dVar});
            return;
        }
        List<IDMComponent> f = bnvVar.f();
        List<IDMComponent> e = bnvVar.e();
        List<IDMComponent> g = bnvVar.g();
        int i2 = -1;
        Iterator<jok> it = list.iterator();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        IDMComponent iDMComponent = null;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                arrayList = arrayList2;
                z = false;
                break;
            }
            jok next = it.next();
            if (next instanceof jon) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                jon jonVar = (jon) next;
                IDMComponent a2 = jonVar.a();
                IDMComponent b = jonVar.b();
                if (e.contains(b)) {
                    int indexOf = e.indexOf(b);
                    e.remove(indexOf);
                    e.add(indexOf, a2);
                    z3 = true;
                } else if (g.contains(b)) {
                    int indexOf2 = g.indexOf(b);
                    g.remove(indexOf2);
                    g.add(indexOf2, a2);
                    z2 = true;
                } else {
                    if (f.contains(b)) {
                        arrayList2.add(a2);
                    }
                    if (i2 > 0 && arrayList2.size() > 0) {
                        i = f.indexOf(b);
                        if (Math.abs(i - i2) > 1) {
                            arrayList = arrayList2;
                            z = true;
                            break;
                        }
                    } else {
                        i = 0;
                    }
                    i2 = i;
                }
            }
            if (next instanceof jol) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add(((jol) next).a());
            }
            if (next instanceof jom) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                jom jomVar = (jom) next;
                iDMComponent = jomVar.b();
                arrayList4.addAll(jomVar.a());
            }
        }
        if (a(arrayList, arrayList3, arrayList4) >= 2) {
            z = true;
        }
        if (z) {
            dVar.a(cVar);
            dVar.a(127);
            return;
        }
        a(z3, z2, arrayList, arrayList3, arrayList4, iDMComponent, cVar, dVar);
    }

    private static void a(final boolean z, final boolean z2, final List<IDMComponent> list, final List<IDMComponent> list2, final List<IDMComponent> list3, final IDMComponent iDMComponent, final d.c cVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe08818", new Object[]{new Boolean(z), new Boolean(z2), list, list2, list3, iDMComponent, cVar, dVar});
        } else {
            PanguApplication.runOnUiThread(new Runnable() { // from class: tb.box.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (z || z2) {
                        boolean z3 = z;
                        if (z2) {
                            i = 4;
                        }
                        dVar.b((z3 ? 1 : 0) | i);
                    }
                    if (list != null) {
                        dVar.a(cVar);
                        dVar.a(list);
                        return;
                    }
                    List<IDMComponent> list4 = list2;
                    if (list4 != null) {
                        dVar.b(list4);
                        return;
                    }
                    List<IDMComponent> list5 = list3;
                    if (list5 == null) {
                        return;
                    }
                    dVar.a(list5, iDMComponent);
                }
            });
        }
    }

    private static int a(List<?>... listArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85e6a11", new Object[]{listArr})).intValue();
        }
        if (listArr == null) {
            return 0;
        }
        int i = 0;
        for (List<?> list : listArr) {
            if (list != null) {
                i++;
            }
        }
        return i;
    }
}
