package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class kmj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f30165a = 3;

    public static List<kmr> a(List<kmr> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        for (kmr kmrVar : list) {
            if (a.v) {
                if (kmrVar.i) {
                    arrayList.add(kmrVar);
                } else if (i < f30165a) {
                    arrayList.add(kmrVar);
                    i++;
                }
            } else {
                if (kmrVar.h) {
                    z2 = true;
                }
                if (arrayList.size() < a.f17077a) {
                    arrayList.add(kmrVar);
                } else if (kmrVar.h) {
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(0, kmrVar);
                }
                if (z2 && arrayList.size() == a.f17077a) {
                    break;
                }
            }
        }
        if (!a.v) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((kmr) it.next()).i) {
                    z = true;
                    break;
                }
            }
            if (!z && arrayList.size() > 4) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return arrayList;
    }
}
