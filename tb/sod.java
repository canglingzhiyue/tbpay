package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.avplayer.DWVideoScreenType;
import com.uc.webview.export.media.MessageID;
import java.util.Iterator;
import tb.hjl;
import tb.hni;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class sod implements hjl, hna, hnh, hni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33764a;
    private final f<hnh> b = new f<>();
    private final f<hjl> c = new f<>();
    private final f<hni> d = new f<>();
    private int k = -1;

    static {
        kge.a(-1840406421);
        kge.a(-335557632);
        kge.a(-1848471929);
        kge.a(387453491);
        kge.a(1120919262);
    }

    public sod(FluidContext fluidContext) {
        this.f33764a = fluidContext;
    }

    public void a(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4b4f76", new Object[]{this, hnhVar});
        } else if (hnhVar == null) {
        } else {
            this.b.a(hnhVar);
        }
    }

    public void b(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dace55f7", new Object[]{this, hnhVar});
        } else if (hnhVar == null) {
        } else {
            this.b.c(hnhVar);
        }
    }

    public void a(hjl hjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec14c2ee", new Object[]{this, hjlVar});
        } else if (hjlVar == null) {
        } else {
            this.c.a(hjlVar);
        }
    }

    public void a(hjl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c4b791", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.a(aVar);
        }
    }

    public void a(hni hniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4bc3d5", new Object[]{this, hniVar});
        } else if (hniVar == null) {
        } else {
            this.d.a(hniVar);
        }
    }

    @Override // tb.hna
    public void addVideoPlayerListener(hni.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a41b86", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.d.a(aVar);
        }
    }

    public void b(hjl hjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da97c96f", new Object[]{this, hjlVar});
        } else if (hjlVar == null) {
        } else {
            this.c.c(hjlVar);
        }
    }

    public void b(hjl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a021d2", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.c(aVar);
        }
    }

    public void b(hni hniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daceca56", new Object[]{this, hniVar});
        } else if (hniVar == null) {
        } else {
            this.d.c(hniVar);
        }
    }

    public void a(hni.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f1ab8", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.d.c(aVar);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.k;
    }

    @Override // tb.hnh
    public boolean hook(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ed3d4a", new Object[]{this, pswVar})).booleanValue();
        }
        for (hnh hnhVar : this.b.a()) {
            try {
                hnhVar.hook(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hnhVar, kal.POINT_HOOK, e);
            }
        }
        return false;
    }

    @Override // tb.hjl
    public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        ogh.a("onInfo");
        for (hjl hjlVar : this.c.a()) {
            try {
                hjlVar.onInfo(pswVar, iMediaPlayer, j, j2, j3, obj);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hjlVar, "onInfo", e);
            }
        }
        ogh.b();
        return false;
    }

    @Override // tb.hjl
    public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (hjl hjlVar : this.c.a()) {
            try {
                hjlVar.onError(pswVar, iMediaPlayer, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hjlVar, "onError", e);
            }
        }
        return false;
    }

    @Override // tb.hjl
    public void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4c7581", new Object[]{this, pswVar, iMediaPlayer});
            return;
        }
        ogh.a(MessageID.onPrepared);
        for (hjl hjlVar : this.c.a()) {
            try {
                hjlVar.onPrepared(pswVar, iMediaPlayer);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hjlVar, MessageID.onPrepared, e);
            }
        }
        ogh.b();
    }

    @Override // tb.hjl
    public void onCompletion(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f520420", new Object[]{this, pswVar, iMediaPlayer});
            return;
        }
        for (hjl hjlVar : this.c.a()) {
            try {
                hjlVar.onCompletion(pswVar, iMediaPlayer);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hjlVar, "", e);
            }
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
            return;
        }
        ogh.a("onVideoStateChanged");
        this.k = i;
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoStateChanged(pswVar, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoStateChanged", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onPreCompletion");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onPreCompletion(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onPreCompletion", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onVideoClose");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoClose(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoClose", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onVideoComplete");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoComplete(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoComplete", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
            return;
        }
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoError(pswVar, obj, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoError", e);
            }
        }
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        ogh.a("onVideoInfo");
        Iterator<hni> it = this.d.a().iterator();
        while (it.hasNext()) {
            hni next = it.next();
            Iterator<hni> it2 = it;
            try {
                next.onVideoInfo(pswVar, obj, j, j2, j3, obj2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, next, "onVideoInfo", e);
            }
            it = it2;
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        ogh.a("onVideoPause");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoPause(pswVar, z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoPause", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onVideoPlay");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoPlay(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoPlay", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
            return;
        }
        ogh.a("onVideoPrepared");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoPrepared(pswVar, obj);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoPrepared", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ogh.a("onVideoProgressChanged");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoProgressChanged(pswVar, i, i2, i3);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoProgressChanged", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
            return;
        }
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoScreenChanged(pswVar, dWVideoScreenType);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoScreenChanged", e);
            }
        }
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
            return;
        }
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoSeekTo(pswVar, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoSeekTo", e);
            }
        }
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onVideoStart");
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onVideoStart(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onVideoStart", e);
            }
        }
        ogh.b();
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
            return;
        }
        for (hni hniVar : this.d.a()) {
            try {
                hniVar.onLoopCompletion(pswVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33764a, hniVar, "onLoopCompletion", e);
            }
        }
    }
}
