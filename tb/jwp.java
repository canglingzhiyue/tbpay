package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import mtopsdk.common.util.StringUtils;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.application.common.c;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.az;
import com.taobao.avplayer.s;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.Map;
import tb.rtm;

/* loaded from: classes6.dex */
public class jwp implements aw, az, rtm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f29835a;
    private rtm.a b;
    private Surface c;
    private String f;
    private String i;
    private boolean j;
    private int o;
    private int p;
    private int q;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private long d = -1;
    private long e = -1;
    private String g = "";
    private String h = "TBVideo";
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n = 0;
    private long r = 0;
    private boolean z = false;

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.rtm
    public void a(long j, long j2, String str, Context context, Map<String, Object> map, SurfaceTexture surfaceTexture, rtm.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91dc7c8", new Object[]{this, new Long(j), new Long(j2), str, context, map, surfaceTexture, aVar});
            return;
        }
        this.d = j;
        this.b = aVar;
        this.e = j2;
        this.f = str;
        this.c = new Surface(surfaceTexture);
        if (map != null) {
            this.l = ((Boolean) map.get("loop")).booleanValue();
            this.j = ((Boolean) map.get(MusLiveVideo.ATTR_MUTE)).booleanValue();
            this.g = (String) map.get("video-id");
            this.h = (String) map.get("video-source");
            this.s = (String) map.get("from");
            this.i = (String) map.get("video-play-scenes");
            this.z = "0".equals(map.get("scenario-type") != null ? (String) map.get("scenario-type") : "");
            if (map.get("autoplay") == null || !((Boolean) map.get("autoplay")).booleanValue()) {
                z = false;
            }
            this.m = z;
        }
        a(context, this.c);
    }

    private void a(Context context, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e9022c", new Object[]{this, context, surface});
            return;
        }
        s.a aVar = new s.a((Activity) context);
        aVar.a(surface);
        if (this.z) {
            aVar.a(0);
        } else {
            aVar.c(this.g);
        }
        aVar.d(this.h);
        aVar.b(this.s);
        aVar.a(this.f);
        aVar.a(this.j);
        aVar.c(this.l);
        aVar.f(this.i);
        this.f29835a = aVar.a();
        HashMap<String, String> hashMap = new HashMap<>();
        int a2 = c.a().a("deviceLevel", -1);
        String str = a2 == 1 ? "50" : a2 == 2 ? "100" : a2 == 3 ? "200" : "";
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("_progressTime", str);
            this.f29835a.c(hashMap);
        }
        f();
        if (this.z) {
            this.f29835a.q();
            if (!this.m) {
                return;
            }
            this.f29835a.a();
            return;
        }
        this.f29835a.d();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f29835a.a((aw) this);
        this.f29835a.a((az) this);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.a(this.d, this.e, this.f29835a.l(), this.q, this.p, (int) this.r);
        }
    }

    @Override // tb.rtm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return;
        }
        if (sVar.j() == 2) {
            this.f29835a.g();
        } else {
            this.f29835a.a();
        }
    }

    @Override // tb.rtm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return;
        }
        sVar.b();
    }

    @Override // tb.rtm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            h();
        }
    }

    @Override // tb.rtm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            h();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return;
        }
        if (this.z) {
            sVar.c();
        }
        this.f29835a.f();
        this.f29835a = null;
    }

    @Override // tb.rtm
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return;
        }
        sVar.d(z);
    }

    @Override // tb.rtm
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return;
        }
        sVar.a(z);
    }

    @Override // tb.rtm
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ("timeupdate".equals(str)) {
            this.t = true;
        } else if ("ended".equals(str)) {
            this.u = true;
        } else if ("firstvideoframe".equals(str)) {
            this.x = true;
        } else if ("error".equals(str)) {
            this.v = true;
        } else if (AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING.equals(str)) {
            this.w = true;
        } else if (!"pause".equals(str)) {
        } else {
            this.y = true;
        }
    }

    @Override // tb.rtm
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        s sVar = this.f29835a;
        if (sVar == null) {
            return 0.0f;
        }
        return sVar.k() / 1000.0f;
    }

    @Override // com.taobao.avplayer.az
    public void onVideoPlayTimeChanged(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0ba6", new Object[]{this, new Long(j)});
        } else if (!this.t) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("currentTime", Float.valueOf(this.n / 1000.0f));
            hashMap.put("duration", Float.valueOf(this.o / 1000.0f));
            hashMap.put("totalPlayTime", Long.valueOf(j));
            this.b.b(this.d, hashMap);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else if (!this.w) {
        } else {
            this.b.a(this.d);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else if (!this.y) {
        } else {
            this.b.b(this.d);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else if (!this.w) {
        } else {
            this.b.a(this.d);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (!this.v) {
        } else {
            this.b.a(this.d, i, i2);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        int i2 = (int) j;
        if (i2 != 3) {
            if (i2 == 10001) {
                this.r = j2;
            } else if (i2 != 10008) {
            } else {
                this.q = (int) j2;
                this.p = (int) j3;
                g();
            }
        } else if (!this.x) {
        } else {
            HashMap hashMap = new HashMap();
            s sVar = this.f29835a;
            int o = sVar != null ? sVar.o() : 0;
            s sVar2 = this.f29835a;
            if (sVar2 != null) {
                i = sVar2.p();
            }
            hashMap.put("originWidth", Integer.valueOf(o));
            hashMap.put("originHeight", Integer.valueOf(i));
            this.b.a(this.d, hashMap);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.n = 0;
        if (!this.u) {
            return;
        }
        this.b.c(this.d);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.n = i;
        if (this.o != 0) {
            return;
        }
        this.o = i3;
    }
}
