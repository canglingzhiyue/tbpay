package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.g;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.d;
import com.taobao.taolive.sdk.ui.media.e;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.z;
import com.taobao.taolive.uikit.api.b;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pry implements IMediaPlayer.d, IMediaPlayer.e, IMediaPlayer.g, IMediaPlayer.i, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f32843a;
    private psc b;
    private boolean c;
    private Context d;
    private a e;
    private b f;
    private FrameLayout g;
    private boolean i;
    private boolean j = true;
    private Runnable k = new Runnable() { // from class: tb.pry.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("LiveCardPlayer", "complete");
            if (pry.b(pry.this) != null) {
                pry.b(pry.this).onComplete();
            }
            pry.a(pry.this, false);
        }
    };
    private Handler h = new Handler(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public interface a {
        void onClear(boolean z);

        void onComplete();

        void onError(int i);

        void onFirstFrame();

        void onInstallReadyRetry();

        void onNotInstallPlayError();

        void onPrepared();

        void onRetry();

        void onReuse();

        void onRevoked();
    }

    static {
        kge.a(665282834);
        kge.a(1292720338);
        kge.a(-449281332);
        kge.a(-2089353637);
        kge.a(-1534486350);
        kge.a(-553593734);
    }

    public static /* synthetic */ d a(pry pryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("4137f00b", new Object[]{pryVar}) : pryVar.f32843a;
    }

    public static /* synthetic */ void a(pry pryVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c141e33", new Object[]{pryVar, new Boolean(z)});
        } else {
            pryVar.d(z);
        }
    }

    public static /* synthetic */ a b(pry pryVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("939c1790", new Object[]{pryVar}) : pryVar.e;
    }

    public pry(Context context) {
        this.d = context;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        d dVar = this.f32843a;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        d dVar = this.f32843a;
        if (dVar != null) {
            return dVar.x();
        }
        return this.j;
    }

    public Bitmap i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6f3274e", new Object[]{this});
        }
        d dVar = this.f32843a;
        if (dVar == null) {
            return null;
        }
        return dVar.bG_();
    }

    public void a(psc pscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa364418", new Object[]{this, pscVar});
        } else {
            this.b = pscVar;
        }
    }

    public void a(String str, int i) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (this.f32843a == null || (context = this.d) == null) {
        } else {
            final Drawable drawable = context.getResources().getDrawable(i);
            this.f32843a.a(drawable, true);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            g.b(str, this.g, -1, -1, new g.a() { // from class: tb.pry.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.utils.g.a
                public void a(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                    } else if (pry.a(pry.this) == null) {
                    } else {
                        pry.a(pry.this).a((Drawable) bitmapDrawable, true);
                    }
                }

                @Override // com.taobao.taolive.room.utils.g.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (pry.a(pry.this) == null) {
                    } else {
                        pry.a(pry.this).a(drawable, true);
                    }
                }
            });
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc9c8b", new Object[]{this, bVar});
        } else {
            this.f = bVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352ef8a4", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        TLog.loge("LiveCardPlayer", "createPlayerInstance");
        if (this.b == null) {
            TLog.loge("LiveCardPlayer", "createPlayerInstance mData == null");
            return;
        }
        TLog.loge("LiveCardPlayer", "createPlayerInstance mediaLiveInfo = " + this.b.c + " url = " + this.b.b);
        this.g = frameLayout;
        this.f32843a = a(this.d, true, true);
        b(this.g);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        TLog.loge("LiveCardPlayer", "start");
        d dVar = this.f32843a;
        if (dVar == null) {
            TLog.loge("LiveCardPlayer", "start mMediaPlayController == null");
            return;
        }
        dVar.g();
        if (this.f32843a.D()) {
            TLog.loge("LiveCardPlayer", "onInfo firstFrame");
            a aVar = this.e;
            if (aVar != null) {
                aVar.onFirstFrame();
            }
        }
        if (this.b.f <= 0) {
            return;
        }
        this.h.postDelayed(this.k, this.b.f * 1000);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        TLog.loge("LiveCardPlayer", "warmup");
        d dVar = this.f32843a;
        if (dVar == null) {
            TLog.loge("LiveCardPlayer", "warmup mMediaPlayController == null");
        } else {
            dVar.f();
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        d dVar = this.f32843a;
        if (dVar == null) {
            return null;
        }
        return dVar.y();
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        d dVar = this.f32843a;
        if (!(dVar instanceof f)) {
            return null;
        }
        return ((f) dVar).L();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        d dVar = this.f32843a;
        if (dVar == null) {
            return null;
        }
        return dVar.K();
    }

    public ViewGroup g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this}) : this.g;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        d dVar = this.f32843a;
        if (dVar == null) {
            return null;
        }
        return dVar.e();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TLog.loge("LiveCardPlayer", "stop");
        d(z);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TLog.loge("LiveCardPlayer", com.taobao.android.weex_framework.util.a.ATOM_revoke);
        a aVar = this.e;
        if (aVar != null) {
            aVar.onRevoked();
        }
        d(false);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        TLog.loge("LiveCardPlayer", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear);
        a aVar = this.e;
        if (aVar != null) {
            aVar.onClear(z);
        }
        d(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        TLog.loge("LiveCardPlayer", "onError i = " + i + " hasRetry = " + this.c);
        if (this.i) {
            return false;
        }
        if (!this.c) {
            d dVar = this.f32843a;
            if (dVar != null) {
                dVar.I();
            }
            this.f32843a = a(this.d, false, false);
            b(this.g);
            this.f32843a.g();
            this.c = true;
            a aVar = this.e;
            if (aVar != null) {
                aVar.onRetry();
            }
        } else {
            a(i, i2);
            d(false);
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        TLog.loge("LiveCardPlayer", "complete");
        a aVar = this.e;
        if (aVar != null) {
            aVar.onComplete();
        }
        d(false);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3) {
            TLog.loge("LiveCardPlayer", "onInfo firstFrame");
            a aVar = this.e;
            if (aVar != null) {
                aVar.onFirstFrame();
            }
        }
        if ((obj instanceof String) && obj.equals(com.taobao.taolive.sdk.ui.media.g.MOCK_MEDIA_INFO_WHAT_RECYCLED)) {
            a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.onReuse();
            }
            return false;
        }
        a(j, j2, j3, obj);
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.onPrepared();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.onNotInstallPlayError();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.onInstallReadyRetry();
    }

    private d a(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("24b2a26a", new Object[]{this, context, new Boolean(z), new Boolean(z2)});
        }
        if (this.b.f32848a) {
            return c(context, z, z2);
        }
        return b(context, z, z2);
    }

    private d b(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8ee22a89", new Object[]{this, context, new Boolean(z), new Boolean(z2)});
        }
        d dVar = new d();
        dVar.a(context);
        dVar.h(false);
        dVar.e(z);
        dVar.f(z2);
        if (o.J()) {
            dVar.f_(true);
            dVar.a(this.j);
        } else {
            dVar.e_(true);
            dVar.a(true);
        }
        dVar.d(this.b.g);
        dVar.g(this.b.h);
        dVar.c(this.b.j);
        if (!StringUtils.isEmpty(this.b.e)) {
            b(dVar, this.b.e);
        } else if (!StringUtils.isEmpty(this.b.d)) {
            a(dVar, this.b.d);
            dVar.a((MediaData) null, this.b.d);
        }
        dVar.a(20132, 1L);
        dVar.a(z.a(this.b.k));
        dVar.a((IMediaPlayer.e) this);
        dVar.a((IMediaPlayer.d) this);
        dVar.a((IMediaPlayer.g) this);
        dVar.a((IMediaPlayer.i) this);
        dVar.a((d.a) this);
        return dVar;
    }

    private e c(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("f911b2c7", new Object[]{this, context, new Boolean(z), new Boolean(z2)});
        }
        psc pscVar = this.b;
        String a2 = pscVar != null ? r.a(pscVar.c, this.b.b) : null;
        h hVar = new h();
        hVar.f21934a = com.taobao.taolive.sdk.ui.media.g.e(a2);
        hVar.b = a2;
        e a3 = r.a(hVar);
        a3.s(this.b.l);
        a3.a(context);
        a3.h(false);
        a3.e(z);
        a3.f(z2);
        if (o.J()) {
            a3.f_(true);
            a3.a(this.j);
        } else {
            a3.e_(true);
            a3.a(true);
        }
        a3.d(this.b.g);
        a3.d(0);
        a3.g(this.b.h);
        a3.c(false);
        if (this.b.c == null) {
            if (!StringUtils.isEmpty(this.b.b)) {
                a3.a((MediaData) null, this.b.b);
            }
        } else {
            a3.a(this.b.c, (String) null);
        }
        a3.a(z.a(this.b.k));
        a3.a((IMediaPlayer.e) this);
        a3.a((IMediaPlayer.g) this);
        a3.a((IMediaPlayer.i) this);
        a3.a((d.a) this);
        return a3;
    }

    private void b(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
            return;
        }
        TLog.loge("LiveCardPlayer", "bindVideoToView");
        d dVar = this.f32843a;
        if (dVar == null || frameLayout == null) {
            TLog.loge("LiveCardPlayer", "bindVideoToView null error");
            return;
        }
        ViewGroup G = dVar.G();
        if (G == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) G.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(G);
        }
        try {
            frameLayout.removeAllViews();
            frameLayout.addView(G);
        } catch (Exception e) {
            TLog.loge("LiveCardPlayer", "bindVideoToView error " + e.getMessage());
            a(-90000);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.onError(i);
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.onMediaError(i, i2);
    }

    private void a(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e5f9b8", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.onMediaInfo(j, j2, j3, obj);
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = true;
        d dVar = this.f32843a;
        if (dVar != null) {
            dVar.a(true);
            if (z) {
                d dVar2 = this.f32843a;
                if (dVar2 instanceof f) {
                    ((f) dVar2).N();
                } else {
                    dVar2.I();
                }
            } else {
                this.f32843a.I();
            }
            this.f32843a = null;
        }
        this.g = null;
        this.c = false;
        this.e = null;
        this.f = null;
        this.d = null;
        this.h.removeCallbacks(this.k);
    }

    private void b(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a06f1b", new Object[]{this, dVar, str});
        } else if (dVar == null) {
        } else {
            dVar.j(str);
        }
    }

    public void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b357fc", new Object[]{this, dVar, str});
        } else if (StringUtils.isEmpty(str) || dVar == null) {
        } else {
            Uri parse = Uri.parse(str);
            String queryParameter = parse != null ? parse.getQueryParameter("timeMovingCacheKey") : "";
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("timeMovingCacheKey", queryParameter);
            dVar.b(hashMap);
        }
    }
}
