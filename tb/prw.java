package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.k;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class prw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32837a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private long k = -1;
    private long l = -1;
    private long m = -1;
    private long n = -1;
    private boolean o;
    private boolean p;

    static {
        kge.a(-462521375);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.l == -1) {
            this.l = System.currentTimeMillis();
        }
        TLog.loge("CardPlayPerformanceTracker", "startPlay startPlayTimeMs = " + this.l);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.k == -1) {
            this.k = System.currentTimeMillis();
        }
        TLog.loge("CardPlayPerformanceTracker", "pageAppear startPlayTimeMs = " + this.k);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.l > 0) {
            this.m = System.currentTimeMillis() - this.l;
        }
        if (this.k > 0) {
            this.n = System.currentTimeMillis() - this.k;
        }
        TLog.loge("CardPlayPerformanceTracker", "firstFrame kPlayerFirstFrameDuration = " + this.m + " kLiveFirstFrameDuration = " + this.n);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.m < 0) {
        } else {
            e();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f32837a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.o) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.f32837a);
            hashMap.put("liveStatus", this.b);
            hashMap.put(pqq.KEY_LIVE_SOURCE, this.c);
            hashMap.put("deviceLevel", String.valueOf(k.a()));
            hashMap.put(aw.PARAM_PLAY_MODE, this.d);
            hashMap.put("startTimeMode", this.e);
            hashMap.put("liveUrlSource", this.f);
            hashMap.put(aw.PARAM_PLAYER_TOKEN, this.g);
            hashMap.put(sku.KEY_VIDEO_TYPE, this.h);
            hashMap.put("videoFormat", this.i);
            hashMap.put("playerScene", this.j);
            hashMap.put("isHitWarm", String.valueOf(this.p));
            hashMap.put("kPlayerFirstFrameDuration", String.valueOf(this.m));
            hashMap.put("kLiveFirstFrameDuration", String.valueOf(this.n));
            if (pmd.a().e() != null) {
                pmd.a().e().a("Page_TaoLive", "PlayerPerformance", hashMap);
            }
            TLog.loge("CardPlayPerformanceTracker", "ut " + hashMap);
            this.k = -1L;
            this.l = -1L;
            this.m = -1L;
            this.n = -1L;
        }
    }
}
