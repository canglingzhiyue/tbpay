package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.playcontrol.observe.a;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class htx implements AudioManager.OnAudioFocusChangeListener, TaoLiveVideoView.a, TaoLiveVideoView.b, IMediaPlayer, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f28779a;
    private k b;
    private MediaData c;
    private String d;
    private final List<IMediaPlayer.d> e = new CopyOnWriteArrayList();
    private final List<Object> f = new CopyOnWriteArrayList();
    private final List<IMediaPlayer.i> g = new CopyOnWriteArrayList();
    private final List<IMediaPlayer.e> h = new CopyOnWriteArrayList();
    private final List<IMediaPlayer.g> i = new CopyOnWriteArrayList();
    private final List<IMediaPlayer.j> j = new CopyOnWriteArrayList();
    private final List<IMediaPlayer.h> k = new CopyOnWriteArrayList();
    private final List<AudioManager.OnAudioFocusChangeListener> l = new CopyOnWriteArrayList();
    private boolean o = false;
    private boolean m = true;
    private boolean n = false;

    static {
        kge.a(1476871611);
        kge.a(1033693273);
        kge.a(-111960633);
        kge.a(1345538278);
        kge.a(-1423519514);
        kge.a(-121259976);
        kge.a(233018416);
        kge.a(-1491822649);
        kge.a(-1773133372);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public s C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("de6a8e25", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd73caaf", new Object[]{this, aspectRatio});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7f1ae0", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80ec5c", new Object[]{this, fVar});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list, IMediaPlayer.UpdataUrlListMode updataUrlListMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feedbc8", new Object[]{this, list, updataUrlListMode});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public Bitmap bG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9ad47c3f", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cA_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e94427ec", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.WarmState h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.WarmState) ipChange.ipc$dispatch("6b283b75", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public List<s> n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3971b0e8", new Object[]{this, new Boolean(z)});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.c u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.c) ipChange.ipc$dispatch("e534b3b1", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public /* synthetic */ View r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this}) : a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5edf8658", new Object[]{this, aVar});
            return;
        }
        this.f28779a = aVar;
        a aVar2 = this.f28779a;
        if (aVar2 == null) {
            return;
        }
        aVar2.f(String.valueOf(hashCode()));
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        return (ViewGroup) kVar.q();
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        try {
            return kVar.b();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.g(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        return kVar.q();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = new k(context, false, MediaConstant.LBLIVE_SOURCE);
        this.b.p(sst.a());
        this.b.c("TBMiniLive");
        hty htyVar = new hty();
        this.b.a((ddc) htyVar);
        this.b.a((ddh) htyVar);
        this.b.a((TaoLiveVideoView.a) this);
        this.b.a((IMediaPlayer.OnCompletionListener) this);
        this.b.a((IMediaPlayer.OnErrorListener) this);
        this.b.a((IMediaPlayer.OnInfoListener) this);
        this.b.a((IMediaPlayer.OnPreparedListener) this);
        this.b.a((TaoLiveVideoView.b) this);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ca8c8", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(drawable, z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.b((TaoLiveVideoView.a) this);
            this.b.b((IMediaPlayer.OnCompletionListener) this);
            this.b.b((IMediaPlayer.OnErrorListener) this);
            this.b.b((IMediaPlayer.OnInfoListener) this);
            this.b.b((IMediaPlayer.OnPreparedListener) this);
            this.b.b((TaoLiveVideoView.b) this);
            this.b.s();
            this.b = null;
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.j();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1e0712", new Object[]{this, mediaData, str});
            return;
        }
        this.c = mediaData;
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(a(mediaData), str);
    }

    private MediaLiveInfo a(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("8814ae0f", new Object[]{this, mediaData});
        }
        if (mediaData == null) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = mediaData.h265;
        mediaLiveInfo.rateAdapte = mediaData.rateAdapte;
        mediaLiveInfo.anchorId = mediaData.anchorId;
        mediaLiveInfo.liveId = mediaData.liveId;
        mediaLiveInfo.mediaSourceType = mediaData.mediaSourceType;
        mediaLiveInfo.edgePcdn = mediaData.edgePcdn;
        mediaLiveInfo.mediaConfig = mediaData.mediaConfig;
        if (mediaData.liveUrlList != null && mediaData.liveUrlList.size() > 0) {
            int size = mediaData.liveUrlList.size();
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                QualityLiveItem qualityLiveItem = new QualityLiveItem();
                qualityLiveItem.artpUrl = mediaData.liveUrlList.get(i).artpUrl;
                qualityLiveItem.definition = mediaData.liveUrlList.get(i).definition;
                qualityLiveItem.flvUrl = mediaData.liveUrlList.get(i).flvUrl;
                qualityLiveItem.h265Url = mediaData.liveUrlList.get(i).h265Url;
                qualityLiveItem.hlsUrl = mediaData.liveUrlList.get(i).hlsUrl;
                qualityLiveItem.artpUrl = mediaData.liveUrlList.get(i).artpUrl;
                qualityLiveItem.name = mediaData.liveUrlList.get(i).name;
                qualityLiveItem.replayUrl = mediaData.liveUrlList.get(i).replayUrl;
                qualityLiveItem.videoUrl = mediaData.liveUrlList.get(i).videoUrl;
                qualityLiveItem.wholeH265ArtpUrl = mediaData.liveUrlList.get(i).wholeH265ArtpUrl;
                qualityLiveItem.wholeH265FlvUrl = mediaData.liveUrlList.get(i).wholeH265FlvUrl;
                qualityLiveItem.bfrtcUrl = mediaData.liveUrlList.get(i).bfrtcUrl;
                qualityLiveItem.rtcLiveUrl = mediaData.liveUrlList.get(i).rtcLiveUrl;
                mediaLiveInfo.liveUrlList.add(qualityLiveItem);
            }
        }
        return mediaLiveInfo;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public MediaData d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaData) ipChange.ipc$dispatch("5cc8f1cb", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(i, j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.f(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.d(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.f(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(false, i, 0, 0, 0);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.b(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(f);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.q(z);
        }
        this.o = z;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cy_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48d38ab4", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.p();
            this.b.f();
            a(this.m);
        }
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.p();
            if (z) {
                this.b.w();
            }
            this.b.f();
        }
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.p();
            if (!TextUtils.isEmpty(this.d)) {
                try {
                    this.b.h(this.d);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.b.f();
            a(this.m);
        }
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.g();
        }
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        this.m = z;
        kVar.e(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return 0;
        }
        return kVar.m();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return 0;
        }
        return kVar.o();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return false;
        }
        return kVar.d();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.e((int) j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return 0L;
        }
        return kVar.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.k();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(hashMap);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return 0L;
        }
        return kVar.h();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.l();
        }
        a aVar = this.f28779a;
        if (aVar == null) {
            return;
        }
        aVar.j();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(context);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        return kVar.c();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        this.n = z;
        kVar.h(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e824979", new Object[]{this, iVar});
        } else if (this.g.contains(iVar)) {
        } else {
            this.g.add(iVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80039e", new Object[]{this, dVar});
        } else if (this.e.contains(dVar)) {
        } else {
            this.e.add(dVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8077fd", new Object[]{this, eVar});
        } else if (this.h.contains(eVar)) {
        } else {
            this.h.add(eVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8160bb", new Object[]{this, gVar});
        } else if (this.i.contains(gVar)) {
        } else {
            this.i.add(gVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e82bdd8", new Object[]{this, jVar});
        } else if (this.j.contains(jVar)) {
        } else {
            this.j.add(jVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e81d51a", new Object[]{this, hVar});
        } else if (this.k.contains(hVar)) {
        } else {
            this.k.add(hVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        if (!this.l.contains(onAudioFocusChangeListener)) {
            this.l.add(onAudioFocusChangeListener);
        }
        if (this.l.size() != 1) {
            return;
        }
        this.b.a((AudioManager.OnAudioFocusChangeListener) this);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (this.b == null || tLiveMsg == null) {
        } else {
            TBLiveMSGInfo tBLiveMSGInfo = new TBLiveMSGInfo();
            tBLiveMSGInfo.bizCode = tLiveMsg.bizCode;
            tBLiveMSGInfo.data = tLiveMsg.data;
            tBLiveMSGInfo.from = tLiveMsg.from;
            tBLiveMSGInfo.messageId = tLiveMsg.messageId;
            tBLiveMSGInfo.needAck = tLiveMsg.needAck;
            tBLiveMSGInfo.priority = tLiveMsg.priority;
            tBLiveMSGInfo.qosLevel = tLiveMsg.qosLevel;
            tBLiveMSGInfo.sendFullTags = tLiveMsg.sendFullTags;
            tBLiveMSGInfo.tags = tLiveMsg.tags;
            tBLiveMSGInfo.timestamp = tLiveMsg.timestamp;
            tBLiveMSGInfo.to = tLiveMsg.to;
            tBLiveMSGInfo.topic = tLiveMsg.topic;
            tBLiveMSGInfo.type = tLiveMsg.type;
            tBLiveMSGInfo.userId = tLiveMsg.userId;
            this.b.a(tBLiveMSGInfo);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.c(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.k(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.j(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.e(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.a(new dde() { // from class: tb.htx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dde
                public long getStartTime() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : j;
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.a(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.b(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.c(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.i(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.j(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        k kVar = this.b;
        return kVar != null && kVar.t();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.k(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        k kVar = this.b;
        return kVar != null && kVar.u();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.v();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.f(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.k();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.d(z);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        for (IMediaPlayer.i iVar : this.g) {
            iVar.onPrepared(this);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        } else if (this.n) {
            k kVar = this.b;
            if (kVar == null) {
                return;
            }
            kVar.e(0);
            this.b.f();
        } else {
            for (IMediaPlayer.d dVar : this.e) {
                dVar.onCompletion(this);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (IMediaPlayer.e eVar : this.h) {
            eVar.onError(this, i, i2);
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        for (IMediaPlayer.g gVar : this.i) {
            gVar.onInfo(this, j, j2, j3, obj);
        }
        return false;
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
    public void onStart(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        for (IMediaPlayer.j jVar : this.j) {
            jVar.onStart(this);
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
    public void onPause(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            return;
        }
        for (IMediaPlayer.h hVar : this.k) {
            hVar.onPause(this);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        for (AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener : this.l) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.b(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public HashMap<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dc76df", new Object[]{this, map});
        }
        k kVar = this.b;
        if (kVar == null) {
            return null;
        }
        return kVar.c(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public float dX_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4569d962", new Object[]{this})).floatValue();
        }
        k kVar = this.b;
        if (kVar == null) {
            return -1.0f;
        }
        return kVar.e();
    }
}
