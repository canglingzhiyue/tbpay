package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.c;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.sdk.model.common.a;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.u;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class soe implements IMediaPlayer.g, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f33765a = new Runnable() { // from class: tb.soe.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            soe.a(soe.this, "mDelayStayTask run");
            if (soe.a(soe.this) != null) {
                soe.a(soe.this).C.d = System.currentTimeMillis();
            }
            soe.b(soe.this);
        }
    };
    private Handler b = new Handler(Looper.getMainLooper());
    private g c;
    private c d;
    private Context e;
    private f f;
    private boolean g;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "LiveRoomWarmManager";
    }

    public static /* synthetic */ c a(soe soeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2ac6f56", new Object[]{soeVar}) : soeVar.d;
    }

    public static /* synthetic */ void a(soe soeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb554b9", new Object[]{soeVar, str});
        } else {
            soeVar.a(str);
        }
    }

    public static /* synthetic */ void b(soe soeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda05f30", new Object[]{soeVar});
        } else {
            soeVar.i();
        }
    }

    static {
        kge.a(-1040820699);
        kge.a(191318335);
        kge.a(-449281332);
        TAG = soe.class.getSimpleName();
    }

    public soe(g gVar, Context context) {
        this.c = gVar;
        g gVar2 = this.c;
        if (gVar2 != null && (gVar2.y() instanceof c)) {
            this.d = (c) this.c.y();
        }
        this.e = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a("onDidAppear");
        if (!d() || !e()) {
            a("is not Legal or is not open");
            return;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.C.b = poy.ai(this.c);
            this.d.C.c = System.currentTimeMillis();
        }
        if (as.b() && kqr.a().b() != null) {
            a("has other running LiveRoomWarmManager");
            return;
        }
        this.g = true;
        this.b.postDelayed(this.f33765a, aa.e());
        ddw.a().a(this);
        kqr.a().a(this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a("onDidDisAppear");
        h();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(MessageID.onDestroy);
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!d() || !e()) {
            a("is not Legal or is not open");
        } else {
            c cVar = this.d;
            if (cVar != null) {
                cVar.C.f = System.currentTimeMillis();
            }
            ddw.a().b(this);
            this.b.removeCallbacks(this.f33765a);
            f fVar = this.f;
            if (fVar != null) {
                fVar.I();
                this.f = null;
            }
            kqr.a().b(this);
            this.g = false;
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!d() || !e()) {
            a("is not Legal or is not open");
        } else if (!"com.taobao.taolive.room.disable_update_scroll_bgimg".equals(str)) {
        } else {
            a("onEvent nextDataChanged");
            c cVar = this.d;
            if (cVar != null) {
                cVar.C.e = System.currentTimeMillis();
            }
            i();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.disable_update_scroll_bgimg"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        g gVar = this.c;
        if (gVar != null) {
            return gVar.G();
        }
        return null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (!d() || !e()) {
            a("is not Legal or is not open");
            return false;
        }
        if (this.g && j == 12000) {
            c cVar = this.d;
            if (cVar != null) {
                cVar.C.h = System.currentTimeMillis();
            }
            a("warm succ");
        }
        return false;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : (this.c == null || this.d == null || this.e == null) ? false : true;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : aa.al();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.b.removeCallbacks(this.f33765a);
        if (this.f != null) {
            a("onEvent releaseAndDestroy");
            this.f.I();
            this.f = null;
        }
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!d() || !e()) {
            a("is not Legal or is not open");
        } else {
            a("warmUp");
            TBLiveRecEngineV2.RecModel j = this.d.w() != null ? this.d.w().j() : null;
            if (j == null) {
                return;
            }
            MediaData a2 = a(j);
            if (a2 != null) {
                c cVar = this.d;
                if (cVar != null) {
                    cVar.C.f21820a = j.liveId;
                }
                a(a2);
                return;
            }
            a("warmUp nextData = null");
        }
    }

    private MediaData a(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("aa422314", new Object[]{this, recModel});
        }
        if (recModel != null && recModel.liveUrlList != null && !recModel.liveUrlList.isEmpty()) {
            return a.a(q.a(pqj.a(recModel)));
        }
        return null;
    }

    private void a(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7571f48", new Object[]{this, mediaData});
        } else if (mediaData == null) {
        } else {
            a("warmUpWithMediaData");
            String a2 = r.a(mediaData, null);
            h hVar = new h();
            hVar.f21934a = com.taobao.taolive.sdk.ui.media.g.e(a2);
            hVar.b = a2;
            this.f = new f(hVar);
            this.f.a(this.e);
            if (g()) {
                return;
            }
            j();
            pnk q = pmd.a().q();
            if (q != null) {
                this.f.e(q.a());
            }
            this.f.d("LiveRoom");
            f fVar = this.f;
            fVar.c("deviceLevel:" + d.k());
            a(this.f);
            int b = ad.b(pou.SWITCH_MODE, 1);
            String a3 = ad.a(pou.NEW_DEFINITION);
            if (b == 1) {
                a(this.f, "auto");
            } else if (!StringUtils.isEmpty(a3)) {
                a(this.f, a3);
            }
            this.f.d(u.D());
            this.f.e(u.E());
            this.f.f(u.F());
            this.f.j(false);
            this.f.a(mediaData, (String) null);
            this.f.d(0);
            this.f.a(this);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("liveActionType", obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
            this.f.a(hashMap);
            this.f.f();
            a("warmUpWithMediaData success playToken = " + this.f.y());
            c cVar = this.d;
            if (cVar == null) {
                return;
            }
            cVar.C.g = System.currentTimeMillis();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f.b(2);
        a("setRenderType");
        g gVar = this.c;
        if (gVar == null || gVar.y() == null || !o.a(this.c.y())) {
            return;
        }
        if (Build.VERSION.SDK_INT >= o.a(30)) {
            z = true;
        }
        String str = TAG;
        m.a(str, "setRenderType sdkEnable = " + z);
        if (!z) {
            return;
        }
        this.f.p(true);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        ViewGroup G = this.f.G();
        if (G == null) {
            a(" mediaView is null");
            return true;
        }
        Window window = ((Activity) this.e).getWindow();
        if (window == null) {
            a("window is null");
            return true;
        }
        View decorView = window.getDecorView();
        if (!(decorView instanceof ViewGroup)) {
            a("decorView not instanceof ViewGroup");
            return true;
        }
        ((ViewGroup) decorView).addView(G, 0, new ViewGroup.LayoutParams(1, 1));
        return false;
    }

    private void a(IMediaPlayer iMediaPlayer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b25c28", new Object[]{this, iMediaPlayer, str});
        } else if (iMediaPlayer == null) {
            n.a(TAG, "initDefinition mediaPlayController = null");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("initDefinition", str);
            iMediaPlayer.a((Map<String, String>) hashMap);
        }
    }

    private void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
            n.a(TAG, "setLiveMode mediaPlayController = null");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enAdaptiveLiveSwitch", "1");
            iMediaPlayer.a((Map<String, String>) hashMap);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.c == null) {
        } else {
            String str2 = TAG;
            m.a(str2, this.c.j() + " " + str);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.c != null) {
            return hashCode() + " " + this.c.j();
        }
        return String.valueOf(hashCode());
    }
}
