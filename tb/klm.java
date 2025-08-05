package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class klm implements kli {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Integer, kln> f30136a = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap a(klm klmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("4765663a", new Object[]{klmVar}) : klmVar.f30136a;
    }

    @Override // tb.kli
    public void addTask(final List<kmr> list, final kmt kmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f872021c", new Object[]{this, list, kmtVar});
            return;
        }
        final kln a2 = new klk().a(kmtVar.c);
        this.f30136a.put(Integer.valueOf(kmtVar.b), a2);
        knd.a(new Runnable() { // from class: tb.klm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (kmr kmrVar : list) {
                    a2.a(kmrVar, kmtVar.d);
                }
                klm.a(klm.this).remove(Integer.valueOf(kmtVar.b));
            }
        }, false);
    }

    @Override // tb.kli
    public void modifyTask(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbd5146", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        kln klnVar = this.f30136a.get(Integer.valueOf(i));
        if (klnVar == null) {
            return;
        }
        if (1 == i2) {
            klnVar.b();
        } else if (2 != i2) {
        } else {
            klnVar.a();
        }
    }
}
