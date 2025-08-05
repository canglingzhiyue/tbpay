package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.osx;

/* loaded from: classes8.dex */
public class osu implements osx, otb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<osx.a> f32382a = new CopyOnWriteArrayList();
    private List<osx.b> b = new CopyOnWriteArrayList();
    private List<osx.c> c = new CopyOnWriteArrayList();

    static {
        kge.a(-128011541);
        kge.a(2054331939);
        kge.a(-1746833149);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32382a.clear();
        this.b.clear();
        this.c.clear();
    }

    @Override // tb.osx
    public void a(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2e67", new Object[]{this, aVar});
            return;
        }
        if (this.f32382a == null) {
            this.f32382a = new CopyOnWriteArrayList();
        }
        this.f32382a.add(aVar);
    }

    @Override // tb.osx
    public void b(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5a98a8", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f32382a.remove(aVar);
        }
    }

    @Override // tb.osx
    public void a(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa2c6", new Object[]{this, bVar});
            return;
        }
        if (this.b == null) {
            this.b = new CopyOnWriteArrayList();
        }
        this.b.add(bVar);
    }

    @Override // tb.osx
    public void b(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b0d07", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.b.remove(bVar);
        }
    }

    @Override // tb.osx
    public void a(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801725", new Object[]{this, cVar});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(cVar);
    }

    @Override // tb.osx
    public void b(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b8166", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.c.remove(cVar);
        }
    }

    @Override // tb.otb
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        List<osx.a> list = this.f32382a;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osx.a aVar : this.f32382a) {
            aVar.a(view);
        }
    }

    @Override // tb.otb
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        List<osx.a> list = this.f32382a;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<osx.a> it = this.f32382a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<osx.b> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osx.b bVar : this.b) {
            bVar.a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<osx.b> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<osx.b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // tb.otb
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        List<osx.c> list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (osx.c cVar : this.c) {
            cVar.a(j);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<osx.c> list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<osx.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
