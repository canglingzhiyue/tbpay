package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.a;
import tb.osx;
import tb.osz;
import tb.ota;

/* loaded from: classes8.dex */
public class osr implements osy, otc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final oss f32379a;
    private final ost b;

    static {
        kge.a(1719864993);
        kge.a(1953942958);
        kge.a(2032012812);
    }

    public osr() {
        osu osuVar = new osu();
        osv osvVar = new osv();
        osw oswVar = new osw();
        this.f32379a = new oss(osuVar, osvVar, oswVar);
        this.b = new ost(osuVar, osvVar, oswVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32379a.a();
        }
    }

    @Override // tb.osx
    public void a(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2e67", new Object[]{this, aVar});
        } else {
            this.f32379a.a(aVar);
        }
    }

    @Override // tb.osx
    public void b(osx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5a98a8", new Object[]{this, aVar});
        } else {
            this.f32379a.b(aVar);
        }
    }

    @Override // tb.osx
    public void a(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa2c6", new Object[]{this, bVar});
        } else {
            this.f32379a.a(bVar);
        }
    }

    @Override // tb.osx
    public void b(osx.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b0d07", new Object[]{this, bVar});
        } else {
            this.f32379a.b(bVar);
        }
    }

    @Override // tb.osx
    public void a(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801725", new Object[]{this, cVar});
        } else {
            this.f32379a.a(cVar);
        }
    }

    @Override // tb.osx
    public void b(osx.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b8166", new Object[]{this, cVar});
        } else {
            this.f32379a.b(cVar);
        }
    }

    @Override // tb.osz
    public void a(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8dfa5", new Object[]{this, aVar});
        } else {
            this.f32379a.a(aVar);
        }
    }

    @Override // tb.osz
    public void b(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc449e6", new Object[]{this, aVar});
        } else {
            this.f32379a.b(aVar);
        }
    }

    @Override // tb.otb
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.b.a(view);
        }
    }

    @Override // tb.otb
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.b.b(view);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    @Override // tb.otb
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b.a(j);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    @Override // tb.otd
    public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
        } else {
            this.b.a(str, str2, awesomeGetData, z);
        }
    }

    @Override // tb.otd
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            this.b.a(str, str2, str3);
        }
    }

    @Override // tb.otd
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        } else {
            this.b.a(str, awesomeGetRequestParams, str2, z);
        }
    }

    @Override // tb.otd
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1acb7ed", new Object[]{this, str, awesomeGetRequestParams, aVar});
        } else {
            this.b.a(str, awesomeGetRequestParams, aVar);
        }
    }

    @Override // tb.ota
    public void a(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f35f", new Object[]{this, aVar});
        } else {
            this.f32379a.a(aVar);
        }
    }

    @Override // tb.ota
    public void b(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68015da0", new Object[]{this, aVar});
        } else {
            this.f32379a.b(aVar);
        }
    }

    @Override // tb.ote
    public void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            this.b.a(z, z2, z3);
        }
    }

    @Override // tb.ote
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.e();
        }
    }
}
