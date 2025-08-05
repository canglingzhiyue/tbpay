package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<b> f25444a = new SparseArray<>();

    static {
        kge.a(816307010);
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<ane> f25445a;
        private final int b;

        static {
            kge.a(-1497918439);
        }

        private b() {
            this.f25445a = new ArrayList<>();
            this.b = 2;
        }
    }

    public ane a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ane) ipChange.ipc$dispatch("e65f4fb3", new Object[]{this, new Integer(i)});
        }
        b bVar = this.f25444a.get(i);
        if (bVar == null || bVar.f25445a.isEmpty()) {
            return null;
        }
        ArrayList<ane> arrayList = bVar.f25445a;
        return arrayList.remove(arrayList.size() - 1);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1776331476);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private b b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("25973775", new Object[]{this, new Integer(i)});
        }
        b bVar = this.f25444a.get(i);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f25444a.put(i, bVar2);
        return bVar2;
    }

    public void a(ane aneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0580600", new Object[]{this, aneVar});
            return;
        }
        int b2 = aneVar.b();
        if (b2 == -1) {
            return;
        }
        ArrayList<ane> arrayList = b(b2).f25445a;
        if (2 <= arrayList.size()) {
            return;
        }
        arrayList.add(aneVar);
    }
}
