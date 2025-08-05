package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.media.IMediaService;
import java.util.List;

/* loaded from: classes5.dex */
public class sjn implements shm, sht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PLAY_RATE = "1.00";
    public static final String DOUBLE_SPEED_PLAY_RATE = "2.00";

    /* renamed from: a  reason: collision with root package name */
    public sjo f33632a;
    private final FluidContext d;
    private final sii e;
    public boolean b = false;
    public String c = DEFAULT_PLAY_RATE;
    private boolean f = false;

    static {
        kge.a(-1292585034);
        kge.a(-1514374609);
        kge.a(267465044);
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        }
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        }
    }

    @Override // tb.sht
    public void onDoubleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // tb.sht
    public void onPendingClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        }
    }

    @Override // tb.sht
    public void onTripleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        }
    }

    public sjn(sii siiVar) {
        this.d = siiVar.z();
        this.e = siiVar;
        c();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : ((IDataService) this.d.getService(IDataService.class)).getConfig().i();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (z) {
            this.e.aa().c(true);
        } else {
            this.e.aa().c(false);
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            this.c = str;
        }
        float b = oec.b(str, 1);
        sii siiVar = this.e;
        ljq.d(siiVar, RateNode.TAG + b);
        this.e.k().a(b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.t().a(this);
        this.e.u().a(this);
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
        } else {
            a(DEFAULT_PLAY_RATE, true);
        }
    }

    @Override // tb.sht
    public boolean onLongClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        spz.c("PlayRateManager", "倍速播放,ShortVideoCard onLongClick():" + z);
        if (a() && z && this.e.k().j()) {
            this.e.ao();
            this.f = true;
            a(true);
            ((IMediaService) this.d.getService(IMediaService.class)).getConfig().c(true);
            a(DOUBLE_SPEED_PLAY_RATE, false);
            if (this.f33632a == null) {
                this.f33632a = new sjo(this.e.z(), (ViewGroup) this.e.B());
            }
            this.f33632a.a();
            this.e.A().a(false);
            b.c(this.e.z(), true);
            return true;
        }
        b.c(this.e.z(), false);
        return false;
    }

    @Override // tb.sht
    public void onLongClickCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
        } else if (!a() || !this.f) {
        } else {
            ((IMediaService) this.d.getService(IMediaService.class)).getConfig().c(false);
            a(this.c, false);
            if (this.f33632a == null) {
                this.f33632a = new sjo(this.e.z(), (ViewGroup) this.e.B());
            }
            this.f33632a.b();
            this.f = false;
            a(false);
            this.e.A().a(true);
        }
    }

    @Override // tb.sht
    public void onSingleClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        spz.c("PlayRateManager", "video card ShortVideoCard.onCardClick " + this.e.r() + ",id=" + this.e.w());
        StringBuilder sb = new StringBuilder();
        sb.append("video card ShortVideoCard.onPauseMedia ");
        sb.append(this.e.r());
        spz.a("changfeng", sb.toString());
        this.e.X().a(f, f2);
    }
}
