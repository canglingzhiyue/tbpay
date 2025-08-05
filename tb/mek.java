package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class mek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<pqt> f31050a = new ArrayList<>();
    private a b;

    /* loaded from: classes7.dex */
    public interface a {
        void a(mek mekVar);

        void a(mek mekVar, View view);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f69708", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a(ArrayList<pqt> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else {
            this.f31050a = arrayList;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Iterator<pqt> it = this.f31050a.iterator();
        while (it.hasNext()) {
            pqt next = it.next();
            if (next != null) {
                next.pause();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<pqt> it = this.f31050a.iterator();
        while (it.hasNext()) {
            pqt next = it.next();
            if (next != null) {
                next.resume();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Iterator<pqt> it = this.f31050a.iterator();
        while (it.hasNext()) {
            pqt next = it.next();
            if (next != null) {
                next.destroy();
            }
        }
        this.f31050a.clear();
        this.b = null;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(this, view);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(this);
    }
}
