package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.osx;
import tb.osz;
import tb.ota;

/* loaded from: classes8.dex */
public class oss implements osy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final osu f32380a;
    private final osv b;
    private final osw c;

    static {
        kge.a(1224968130);
        kge.a(2032012812);
    }

    public oss(osu osuVar, osv osvVar, osw oswVar) {
        this.f32380a = osuVar;
        this.b = osvVar;
        this.c = oswVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32380a.a();
        this.c.a();
        this.b.a();
    }

    @Override // tb.osx
    public void a(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2e67", new Object[]{this, aVar});
        } else {
            this.f32380a.a(aVar);
        }
    }

    @Override // tb.osx
    public void b(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5a98a8", new Object[]{this, aVar});
        } else {
            this.f32380a.b(aVar);
        }
    }

    @Override // tb.osx
    public void a(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa2c6", new Object[]{this, bVar});
        } else {
            this.f32380a.a(bVar);
        }
    }

    @Override // tb.osx
    public void b(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b0d07", new Object[]{this, bVar});
        } else {
            this.f32380a.b(bVar);
        }
    }

    @Override // tb.osx
    public void a(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801725", new Object[]{this, cVar});
        } else {
            this.f32380a.a(cVar);
        }
    }

    @Override // tb.osx
    public void b(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b8166", new Object[]{this, cVar});
        } else {
            this.f32380a.b(cVar);
        }
    }

    @Override // tb.osz
    public void a(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8dfa5", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    @Override // tb.osz
    public void b(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc449e6", new Object[]{this, aVar});
        } else {
            this.b.b(aVar);
        }
    }

    @Override // tb.ota
    public void a(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f35f", new Object[]{this, aVar});
        } else {
            this.c.a(aVar);
        }
    }

    @Override // tb.ota
    public void b(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68015da0", new Object[]{this, aVar});
        } else {
            this.c.b(aVar);
        }
    }
}
