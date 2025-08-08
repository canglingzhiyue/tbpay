package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class kxh implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f30374a;

    static {
        kge.a(467479311);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public kxh(lbo lboVar) {
        this.f30374a = lboVar;
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        if (!StringUtils.equals(com.taobao.android.home.component.utils.i.a(), kwyVar.c())) {
            return i.FAILURE;
        }
        if (!kwyVar.b()) {
            return i.FAILURE;
        }
        if (!n.n().a()) {
            sdy.a(new Runnable() { // from class: tb.kxh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        m.b(kxh.this.f30374a.a().getCurActivity());
                    }
                }
            });
        }
        e.b("Home.LazyInitSubscriber", "start LazyInit");
        this.f30374a.f().c().a();
        this.f30374a.o().a();
        this.f30374a.y().j();
        kxf.a().b(TaobaoMediaPlayer.FFP_PROP_INT64_AUDIO_DISABLE, this);
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
