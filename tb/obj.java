package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class obj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BubbleTipsBean f31889a;
    private b b;
    private a c;
    private d d;
    private CopyOnWriteArrayList<c> e = new CopyOnWriteArrayList<>();
    private String f;
    private Bitmap g;
    private List<com.taobao.share.globalmodel.b> h;
    private List<com.taobao.share.globalmodel.b> i;
    private List<com.taobao.share.globalmodel.b> j;

    /* loaded from: classes8.dex */
    public interface a {
        void onComponentData(List<com.taobao.share.globalmodel.b> list);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onComponentData(List<com.taobao.share.globalmodel.b> list);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void onQrData(Bitmap bitmap);
    }

    /* loaded from: classes8.dex */
    public interface d {
        void onComponentData(List<com.taobao.share.globalmodel.b> list);
    }

    static {
        kge.a(-47816355);
    }

    public void a(List<com.taobao.share.globalmodel.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.h = list;
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.onComponentData(this.h);
    }

    public void b(List<com.taobao.share.globalmodel.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        this.i = list;
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.onComponentData(this.i);
    }

    public void c(List<com.taobao.share.globalmodel.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        this.j = list;
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.onComponentData(this.j);
    }

    public void a(BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a720b4", new Object[]{this, bubbleTipsBean});
        } else {
            this.f31889a = bubbleTipsBean;
        }
    }

    public BubbleTipsBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BubbleTipsBean) ipChange.ipc$dispatch("301b2f34", new Object[]{this}) : this.f31889a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            e();
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6551dac3", new Object[]{this, bVar});
            return;
        }
        this.b = bVar;
        List<com.taobao.share.globalmodel.b> list = this.j;
        if (list == null) {
            return;
        }
        this.b.onComponentData(list);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6552c381", new Object[]{this, dVar});
            return;
        }
        this.d = dVar;
        List<com.taobao.share.globalmodel.b> list = this.i;
        if (list == null) {
            return;
        }
        this.d.onComponentData(list);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65516664", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        List<com.taobao.share.globalmodel.b> list = this.h;
        if (list == null) {
            return;
        }
        aVar.onComponentData(list);
    }

    public Bitmap d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("3863b0c9", new Object[]{this}) : this.g;
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        this.g = bitmap;
        if (bitmap == null) {
            return;
        }
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onQrData(bitmap);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65524f22", new Object[]{this, cVar});
            return;
        }
        this.e.add(cVar);
        if (this.g == null) {
            return;
        }
        for (c cVar2 : new ArrayList(this.e)) {
            if (cVar2 != null) {
                cVar2.onQrData(this.g);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e.clear();
        }
    }
}
