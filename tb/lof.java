package tb;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.taolive.uikit.homepage.d;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class lof implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private loe f30768a;
    private Context b;
    private psh c;
    private ITbLiveCardService.c d;
    private int e;
    private Rect f;
    private int h;
    private int i;
    private final pqy g = new pqy(this);
    private boolean j = true;
    private Rect k = null;

    static {
        kge.a(-1992455592);
        kge.a(-1317704444);
    }

    public static /* synthetic */ pqy a(lof lofVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("4379d099", new Object[]{lofVar}) : lofVar.g;
    }

    public static /* synthetic */ int b(lof lofVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1aee729", new Object[]{lofVar})).intValue() : lofVar.e;
    }

    public lof(Context context) {
        this.b = context;
        e();
    }

    @Override // tb.pqu
    public void handleMessage(Message message) {
        psh pshVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 4097) {
            ITbLiveCardService.c cVar = this.d;
            if (cVar == null) {
                return;
            }
            cVar.onVideoStart();
        } else if (i != 4098 || (pshVar = this.c) == null) {
        } else {
            if (2 != pshVar.e) {
                c();
            } else if (this.c.j) {
            } else {
                c();
            }
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        loe loeVar = this.f30768a;
        if (loeVar != null) {
            return loeVar.e();
        }
        return null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c != null;
    }

    public boolean a(ITbLiveCardService.b bVar, ITbLiveCardService.a aVar, ITbLiveCardService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b6aa95c", new Object[]{this, bVar, aVar, cVar})).booleanValue();
        }
        psh a2 = a(bVar.a(), bVar.b(), aVar.a(), aVar.b());
        if (!prc.a() || this.f30768a == null) {
            return false;
        }
        if (this.c == null) {
            return a(a2, cVar);
        }
        if (this.d == cVar) {
            return true;
        }
        if (a2.f < this.c.f || !a2.k.intersect(f())) {
            return false;
        }
        c();
        return a(a2, cVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        loe loeVar = this.f30768a;
        if (loeVar != null) {
            loeVar.c();
            ITbLiveCardService.c cVar = this.d;
            if (cVar != null) {
                cVar.onVideoStop();
            }
        }
        this.d = null;
        this.c = null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c();
        this.g.removeCallbacksAndMessages(null);
        loe loeVar = this.f30768a;
        if (loeVar != null) {
            loeVar.d();
        }
        this.b = null;
        this.f30768a = null;
    }

    public void a(ITbLiveCardService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cfbc36", new Object[]{this, dVar});
            return;
        }
        loe loeVar = this.f30768a;
        if (loeVar == null) {
            return;
        }
        loeVar.a(dVar);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f30768a = new loe(this.b, MediaConstant.LBLIVE_SOURCE);
        this.f30768a.a(false, 2, 0, 0, 0);
        this.f30768a.a(this.j);
        this.f30768a.b(ldj.a("enableUseBfrtc", true));
        this.f30768a.c(ldj.a("enableUseRtcLive", true));
        IMediaPlayer.OnInfoListener onInfoListener = new IMediaPlayer.OnInfoListener() { // from class: tb.lof.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && lof.a(lof.this) != null) {
                    lof.a(lof.this).sendEmptyMessage(4097);
                    lof.a(lof.this).sendEmptyMessageDelayed(4098, lof.b(lof.this) * 1000);
                }
                return false;
            }
        };
        this.i = gbg.b(this.b);
        this.h = gbg.c(this.b);
        this.f30768a.a(onInfoListener);
    }

    private boolean a(psh pshVar, ITbLiveCardService.c cVar) {
        loe loeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ae56a6", new Object[]{this, pshVar, cVar})).booleanValue();
        }
        this.g.removeCallbacksAndMessages(null);
        this.f30768a.a(pshVar.d);
        this.f30768a.a(pshVar.e);
        this.f30768a.b(pshVar.h);
        if (2 == pshVar.e) {
            this.f30768a.d(pshVar.j);
        } else {
            this.f30768a.d(false);
        }
        if (this.j == pshVar.i) {
            this.j = !pshVar.i;
            this.f30768a.a(this.j);
        }
        if (this.f30768a == null || pshVar.c <= 0) {
            return false;
        }
        this.c = pshVar;
        this.d = cVar;
        if (this.c.l == null) {
            if (!StringUtils.isEmpty(this.c.b)) {
                this.f30768a.a((MediaLiveInfo) null, this.c.b);
            } else {
                this.c = null;
                return false;
            }
        } else {
            this.f30768a.a(this.c.l, (String) null);
        }
        if (cVar != null) {
            cVar.onVideoPrepare();
        }
        this.f30768a.a();
        this.f30768a.b();
        if (!this.c.g.equals(this.f)) {
            this.f = this.c.g;
            if (Build.VERSION.SDK_INT >= 21 && (loeVar = this.f30768a) != null && loeVar.e() != null) {
                this.f30768a.e().setOutlineProvider(new d(this.f));
                this.f30768a.e().setClipToOutline(true);
            }
        }
        return true;
    }

    private psh a(JSONObject jSONObject, String str, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psh) ipChange.ipc$dispatch("7335d86f", new Object[]{this, jSONObject, str, rect, rect2});
        }
        psh pshVar = new psh(null, str, a(jSONObject));
        pshVar.g = rect2;
        pshVar.f = 1;
        pshVar.k = rect;
        pshVar.d = "homepageLiveCard";
        pshVar.c = ldj.a("livePlayDuration", 10000);
        this.e = pshVar.c;
        return pshVar;
    }

    private MediaLiveInfo a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("dcd999cf", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("queryParams")) {
            return null;
        }
        int intValue = jSONObject.getIntValue("roomStatus");
        this.e = jSONObject.getIntValue("playDuration");
        if (intValue != 1) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("liveUrlList");
        int size = jSONArray.size();
        mediaLiveInfo.h265 = jSONObject2.getBoolean("h265").booleanValue();
        mediaLiveInfo.mediaConfig = jSONObject2.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.PARAM_MEDIA_INFO_MEDIACONFIG);
        mediaLiveInfo.rateAdapte = jSONObject2.getBoolean("rateAdapte").booleanValue();
        mediaLiveInfo.liveUrlList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            QualityLiveItem qualityLiveItem = new QualityLiveItem();
            qualityLiveItem.artpUrl = jSONObject3.getString("artpUrl");
            qualityLiveItem.definition = jSONObject3.getString("definition");
            qualityLiveItem.flvUrl = jSONObject3.getString("flvUrl");
            qualityLiveItem.h265Url = jSONObject3.getString("h265Url");
            qualityLiveItem.hlsUrl = jSONObject3.getString("hlsUrl");
            qualityLiveItem.name = jSONObject3.getString("name");
            qualityLiveItem.wholeH265FlvUrl = jSONObject3.getString("wholeH265FlvUrl");
            qualityLiveItem.bfrtcUrl = jSONObject3.getString(MediaConstant.BFRTC_URL_NAME);
            qualityLiveItem.rtcLiveUrl = jSONObject3.getString(MediaConstant.RTCLIVE_URL_NAME);
            mediaLiveInfo.liveUrlList.add(qualityLiveItem);
        }
        return mediaLiveInfo;
    }

    private Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dcdd376", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new Rect();
            int i = this.h;
            int i2 = (int) (i * 0.4d);
            this.k.set(0, i2, this.i, ((int) (i * 0.5d)) + i2);
        }
        return this.k;
    }
}
