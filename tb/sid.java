package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.tao.content.business.b;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.HashMap;
import java.util.Map;
import tb.snt;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class sid implements z, TaoLiveVideoView.b, snz, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33599a;
    private final sic b;
    private s c;
    private snv d;
    private boolean e;
    private boolean f;
    private sok g;

    static {
        kge.a(1918432110);
        kge.a(854340662);
        kge.a(-1423519514);
        kge.a(-1226623529);
        kge.a(-111960633);
        kge.a(233018416);
        kge.a(-121259976);
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
        }
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
        }
    }

    public static /* synthetic */ sic a(sid sidVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sic) ipChange.ipc$dispatch("711cf4cf", new Object[]{sidVar}) : sidVar.b;
    }

    public sid(sic sicVar) {
        this.f33599a = sicVar.z();
        this.b = sicVar;
        c();
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this}) : this.d;
    }

    public HashMap<String, String> a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f1e2dc9", new Object[]{this, bVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        sps sessionParams = ((ISceneConfigService) this.f33599a.getService(ISceneConfigService.class)).getSessionParams();
        Map<String, String> thisCardCommonTrack = ((ITrackService) this.f33599a.getService(ITrackService.class)).getThisCardCommonTrack(this.b);
        skl j = ((IDataService) this.f33599a.getService(IDataService.class)).getConfig().j();
        if (thisCardCommonTrack != null) {
            hashMap.putAll(thisCardCommonTrack);
        }
        HashMap hashMap2 = new HashMap();
        noi.a(this.f33599a, hashMap2, bVar.f12530a);
        noi.a(hashMap2, this.b.v().a());
        noi.a(hashMap, hashMap2);
        hashMap.put("spm", obw.f31903a);
        if (StringUtils.isEmpty(bVar.f12530a.e())) {
            hashMap.put("taoke_accountId", bVar.f12530a.c());
        } else {
            hashMap.put("taoke_accountId", bVar.f12530a.d());
            hashMap.put("keyname", bVar.f12530a.e());
        }
        if (j != null && !StringUtils.isEmpty(j.w)) {
            hashMap.put(b.BIZ_TYPE, j.w);
        }
        String str = sessionParams.c;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feed_id", (Object) bVar.a());
        jSONObject.put("page", (Object) str);
        hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_UCM, jSONObject.toJSONString());
        hashMap.put("page", str);
        hashMap.put("content_id", bVar.a());
        hashMap.put("platform", "phone");
        t trackTint = ((ITrackService) this.f33599a.getService(ITrackService.class)).getTrackTint();
        if (trackTint != null) {
            hashMap.putAll(trackTint.a());
        }
        return hashMap;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        final boolean isFirstSetAdapter = ((ITrackService) this.f33599a.getService(ITrackService.class)).isFirstSetAdapter();
        ((ITrackService) this.f33599a.getService(ITrackService.class)).setFirstSetAdapter(false);
        sps sessionParams = ((ISceneConfigService) this.f33599a.getService(ISceneConfigService.class)).getSessionParams();
        s.a aVar = new s.a((Activity) this.b.y());
        s.a b = aVar.a(0).g(MediaConstant.LBLIVE_SOURCE).b(sessionParams.c).b(a(this.b.h()));
        FluidContext fluidContext = this.f33599a;
        b.a(ljm.a(fluidContext, ljm.a(fluidContext, this.b.v().a(), this.b.h().f12530a), isFirstSetAdapter)).f(((ISceneConfigService) this.f33599a.getService(ISceneConfigService.class)).getSessionExtParams().e()).a(sjs.a(this.b.h().e(), this.b.l().cK_()));
        if (soj.b(this.f33599a)) {
            aVar.j(true);
            aVar.k(false);
        }
        aVar.i(true);
        this.c = aVar.a();
        this.d = new snt.a((Activity) this.b.y()).a(this.c);
        this.c.a(new dde() { // from class: tb.sid.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dde
            public long getStartTime() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : isFirstSetAdapter ? sid.a(sid.this).cf_().c() : sid.a(sid.this).k().b();
            }
        });
        this.c.e(false);
        this.c.a(jqy.a(this.b.h()), (String) null);
        this.c.a((IMediaPlayer.OnErrorListener) this);
        this.c.a((z) this);
        this.c.a((TaoLiveVideoView.b) this);
        this.c.a((IMediaPlayer.OnPreparedListener) this);
        this.c.a((IMediaPlayer.OnInfoListener) this);
        this.c.q();
        this.b.i().a(this.d);
        boolean a2 = this.b.a();
        spz.c("DWInstanceManager", "预热标识，canUseLivWarmup = " + a2);
        if (!a2 || this.b.h() == null || !tdg.c()) {
            return;
        }
        spz.c("DWInstanceManager", "开始预热");
        this.d.a((MediaLiveWarmupConfig) null);
        this.e = true;
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        this.b.P().hook(this.b);
        this.b.Q().hook(this.b);
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.b.P().onError(this.b, iMediaPlayer, i, i2);
        this.b.Q().onError(this.b, iMediaPlayer, i, i2);
        s sVar = this.c;
        if (sVar != null) {
            this.b.a(sVar.e());
        }
        return false;
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        s sVar = this.c;
        if (sVar == null) {
            return;
        }
        this.b.cf_().b(sVar.e());
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        this.b.P().onPrepared(this.b, iMediaPlayer);
        this.b.Q().onPrepared(this.b, iMediaPlayer);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        this.b.P().onInfo(this.b, iMediaPlayer, j, j2, j3, obj);
        this.b.Q().onInfo(this.b, iMediaPlayer, j, j2, j3, obj);
        if (3 == j && (sVar = this.c) != null) {
            this.b.a(sVar.e());
        } else if (12000 == j) {
            spz.c("DWInstanceManager", "预热成功");
            this.f = true;
        }
        return false;
    }

    public void a(sic sicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7e2eb", new Object[]{this, sicVar});
            return;
        }
        spz.c("DWInstanceManager", "释放直播播放器：" + this.c);
        s sVar = this.c;
        if (sVar == null) {
            return;
        }
        ViewGroup e = sVar.e();
        if (tdg.c()) {
            if (e != null && (e.getParent() instanceof ViewGroup)) {
                ((ViewGroup) e.getParent()).removeView(e);
            }
        } else {
            sicVar.cf_().a().removeView(e);
        }
        this.c.c();
        this.c.f();
        if (this.g != null && this.f33599a.getService(IMuteService.class) != null && sil.f()) {
            ((IMuteService) this.f33599a.getService(IMuteService.class)).b(this.g);
        }
        this.c = null;
        this.d = null;
        sicVar.b(false);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.O().a(this);
        }
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        } else if (this.c != null || this.b.h() == null) {
        } else {
            b();
            this.b.cf_().a(this.c.e(), this.b.cf_().b());
            this.b.k().c();
            ljq.c(this.b, this.c.r());
            this.g = f.a(this.b.z(), this.b.g().a());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
