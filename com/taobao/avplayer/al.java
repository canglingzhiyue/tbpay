package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dde;
import tb.ddg;
import tb.kcf;
import tb.kcj;
import tb.kck;
import tb.kcl;
import tb.kge;
import tb.oyx;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public class al implements aw, ax, com.taobao.mediaplay.player.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long A;
    private long B;
    private int C;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private com.taobao.mediaplay.c I;
    private boolean M;
    private boolean N;
    private boolean O;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16456a;
    public boolean b;
    private DWContext c;
    private FrameLayout d;
    private DWVideoContainer e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ImageView i;
    private DWVideoViewController j;
    private com.taobao.mediaplay.g k;
    private z l;
    private t m;
    private DWLifecycleType n;
    private com.taobao.avplayer.common.z o;
    private ArrayList<com.taobao.avplayer.common.q> p;
    private com.taobao.avplayer.common.u q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private int x;
    private boolean y;
    private boolean z;
    private long D = 0;
    private String J = null;
    private int K = 10;
    private boolean L = false;

    static {
        kge.a(77101918);
        kge.a(-123403623);
        kge.a(857599862);
        kge.a(-1602626051);
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean dU_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404b4f99", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ long a(al alVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf0bec72", new Object[]{alVar, new Long(j)})).longValue();
        }
        alVar.B = j;
        return j;
    }

    public static /* synthetic */ DWVideoViewController a(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWVideoViewController) ipChange.ipc$dispatch("7b56b5b4", new Object[]{alVar}) : alVar.j;
    }

    public static /* synthetic */ void a(al alVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82a951a", new Object[]{alVar, str, str2});
        } else {
            alVar.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf0c2892", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.z = z;
        return z;
    }

    public static /* synthetic */ z b(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("82365004", new Object[]{alVar}) : alVar.l;
    }

    public static /* synthetic */ boolean b(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb8d431", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.F = z;
        return z;
    }

    public static /* synthetic */ DWContext c(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("42b604e3", new Object[]{alVar}) : alVar.c;
    }

    public static /* synthetic */ boolean c(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0657fd0", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.h = z;
        return z;
    }

    public static /* synthetic */ boolean d(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9321988d", new Object[]{alVar})).booleanValue() : alVar.L;
    }

    public static /* synthetic */ boolean d(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1122b6f", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.E = z;
        return z;
    }

    public static /* synthetic */ boolean e(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc717d0e", new Object[]{alVar})).booleanValue() : alVar.F;
    }

    public static /* synthetic */ boolean e(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1bed70e", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.G = z;
        return z;
    }

    public static /* synthetic */ com.taobao.mediaplay.c f(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.c) ipChange.ipc$dispatch("f3e637a1", new Object[]{alVar}) : alVar.I;
    }

    public static /* synthetic */ boolean f(al alVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d26b82ad", new Object[]{alVar, new Boolean(z)})).booleanValue();
        }
        alVar.y = z;
        return z;
    }

    public static /* synthetic */ com.taobao.mediaplay.g g(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mediaplay.g) ipChange.ipc$dispatch("21bed27c", new Object[]{alVar}) : alVar.k;
    }

    public static /* synthetic */ boolean h(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38612a91", new Object[]{alVar})).booleanValue() : alVar.y;
    }

    public static /* synthetic */ boolean i(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b10f12", new Object[]{alVar})).booleanValue() : alVar.h;
    }

    public static /* synthetic */ DWLifecycleType j(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWLifecycleType) ipChange.ipc$dispatch("7d4cea35", new Object[]{alVar}) : alVar.n;
    }

    public static /* synthetic */ com.taobao.avplayer.common.z k(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.z) ipChange.ipc$dispatch("b4d7bf59", new Object[]{alVar}) : alVar.o;
    }

    public static /* synthetic */ boolean l(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dda0bc95", new Object[]{alVar})).booleanValue() : alVar.G;
    }

    public static /* synthetic */ void m(al alVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0a112", new Object[]{alVar});
        } else {
            alVar.K();
        }
    }

    public static /* synthetic */ FrameLayout n(al alVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("d4139f66", new Object[]{alVar}) : alVar.d;
    }

    public static /* synthetic */ void o(al alVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59906a14", new Object[]{alVar});
        } else {
            alVar.S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public al(com.taobao.avplayer.DWContext r11) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.al.<init>(com.taobao.avplayer.DWContext):void");
    }

    private boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(i, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "[13001]"))) {
            return false;
        }
        String videoUrl = this.c.mPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.k.q();
        this.k.a(this.I);
        String videoUrl2 = this.c.mPlayContext.getVideoUrl();
        if (StringUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.c.mPlayContext.unselectS266OfPlay();
        this.c.mPlayContext.setDegradeCode(i, this.c.mPlayContext.mSelectedUrlName);
        a(false);
        return true;
    }

    @Override // com.taobao.mediaplay.player.h
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String videoDefinition = this.c.mPlayContext.getVideoDefinition();
        if (!StringUtils.isEmpty(videoDefinition) && videoDefinition.contains("266")) {
            return b(i, i2);
        }
        return false;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.a(view);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.j();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return null;
        }
        return dWVideoViewController.a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.l.a();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.d();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return true;
        }
        return dWVideoViewController.l();
    }

    public void a(com.taobao.avplayer.common.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410cfe7d", new Object[]{this, xVar});
        } else {
            this.l.a(xVar);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.l.A();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        t tVar = this.m;
        if (tVar != null && tVar.a() != null) {
            this.m.a().setVisibility(0);
        }
        z zVar = this.l;
        if (zVar != null && zVar.x() != null) {
            this.l.x().setVisibility(0);
        }
        e(true);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        t tVar = this.m;
        if (tVar != null && tVar.a() != null) {
            this.m.a().setVisibility(4);
        }
        z zVar = this.l;
        if (zVar != null && zVar.x() != null) {
            this.l.x().setVisibility(4);
        }
        e(false);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        t tVar = this.m;
        if (tVar != null) {
            tVar.c();
        }
        ImageView imageView = this.i;
        if (imageView == null || this.c == null || imageView.getVisibility() != 0) {
            return;
        }
        e(true);
    }

    public void a(com.taobao.avplayer.common.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410ba160", new Object[]{this, uVar});
        } else {
            this.q = uVar;
        }
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        this.s++;
        R();
        this.f = false;
        this.M = false;
        this.v = kcj.b(this.c.getUserInfoAdapter().a(), this.c.getUserInfoAdapter().b());
        this.u = false;
        a((Map<String, String>) null, true);
        P();
        this.B = System.currentTimeMillis();
    }

    /* loaded from: classes6.dex */
    public class a implements ao {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1147076464);
            kge.a(-41774112);
        }

        public a() {
        }

        @Override // com.taobao.avplayer.ao
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (al.a(al.this) == null) {
                return false;
            }
            return al.a(al.this).z();
        }

        @Override // com.taobao.avplayer.ao
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (al.a(al.this) == null) {
                return false;
            }
            return al.a(al.this).B();
        }
    }

    public void a(com.taobao.avplayer.common.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4108e726", new Object[]{this, oVar});
        } else {
            this.l.a(oVar);
        }
    }

    /* loaded from: classes6.dex */
    public class c implements ay {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(494337427);
            kge.a(-800824686);
        }

        public c() {
        }

        @Override // com.taobao.avplayer.ay
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            al.c(al.this).mute(z);
            al.this.c(z);
        }

        @Override // com.taobao.avplayer.ay
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : al.c(al.this).isMute();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c.addPlayExpUtParams(this.k.e());
        this.j.a(this.c.mPlayContext.getVideoUrl(), z);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.l.q();
        this.L = true;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.l.p();
        this.L = false;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.l.b();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.l.c();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.l.d();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.l.e();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.v();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.w();
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else {
            ((com.taobao.avplayer.player.c) this.j.x()).a((com.taobao.avplayer.common.ae) new f());
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer == null) {
            return;
        }
        dWVideoContainer.setBackgroundColor(i);
    }

    public void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            return;
        }
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer == null) {
            return;
        }
        dWVideoContainer.setBackgroundDrawable(drawable);
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8549973", new Object[]{this, view, layoutParams});
            return;
        }
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer == null || layoutParams == null) {
            return;
        }
        dWVideoContainer.addView(view, layoutParams);
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer == null || view == null) {
            return;
        }
        dWVideoContainer.removeView(view);
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.t();
        this.l.h();
        this.l.a(str, z);
    }

    /* loaded from: classes6.dex */
    public class g implements DWVideoViewController.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1924128746);
            kge.a(-818173002);
        }

        private g() {
        }

        @Override // com.taobao.avplayer.DWVideoViewController.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (al.c(al.this) != null) {
                ddg ddgVar = al.c(al.this).mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, "ProcessVideoStartEvent.start##DWInstance start video ,videoUrl:" + al.c(al.this).mPlayContext.getVideoUrl());
            }
            if ((StringUtils.isEmpty(al.c(al.this).mPlayContext.getVideoUrl()) && !al.e(al.this) && !al.h(al.this)) || al.i(al.this)) {
                al.c(al.this, false);
                al.b(al.this, true);
                al.g(al.this).a(al.f(al.this));
            }
            al.b(al.this).k();
            al.b(al.this).h();
            al.a(al.this).y();
        }
    }

    /* loaded from: classes6.dex */
    public class f implements com.taobao.avplayer.common.ae {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1972730307);
            kge.a(18351072);
        }

        private f() {
        }

        @Override // com.taobao.avplayer.common.ae
        public void a(com.taobao.avplayer.player.c cVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4f22b7c", new Object[]{this, cVar});
            } else if (al.j(al.this) == DWLifecycleType.MID) {
            } else {
                if (cVar.f() == 1 && (al.this.f16456a || Build.VERSION.SDK_INT < 17)) {
                    al.this.a(DWLifecycleType.MID);
                } else if (StringUtils.isEmpty(al.c(al.this).getVideoToken()) || cVar.f() != 1) {
                    z = false;
                } else {
                    al.this.a(DWLifecycleType.MID);
                }
                if (!z || cVar == null) {
                    return;
                }
                cVar.a(null, 12100L, 0L, 0L, null);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class e implements com.taobao.avplayer.playercontrol.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1153023065);
            kge.a(-2052290451);
        }

        private e() {
        }

        @Override // com.taobao.avplayer.playercontrol.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            al.this.w();
            al.a(al.this).e();
        }

        @Override // com.taobao.avplayer.playercontrol.k
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (al.a(al.this).x() == null || al.a(al.this).x().f() == 6 || al.a(al.this).x().f() == 3 || al.a(al.this).x().f() == 0) {
            } else {
                al.a(al.this).x().c(i);
            }
        }

        @Override // com.taobao.avplayer.playercontrol.k
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else if (al.a(al.this).x() == null || al.a(al.this).x().f() == 6 || al.a(al.this).x().f() == 3 || al.a(al.this).x().f() == 0) {
            } else {
                al.a(al.this).x().d(i);
            }
        }

        @Override // com.taobao.avplayer.playercontrol.k
        public boolean a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue();
            }
            if (al.a(al.this).x() == null || al.a(al.this).x().f() == 6 || al.a(al.this).x().f() == 3 || al.a(al.this).x().f() == 0) {
                return false;
            }
            al.a(al.this).x().c(f);
            return true;
        }
    }

    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
        } else if (this.j.x() == null || this.j.x().f() == 6 || this.j.x().f() == 3 || this.j.x().f() == 0) {
        } else {
            this.j.x().c(f2);
        }
    }

    /* loaded from: classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1907077000);
            kge.a(-1201612728);
        }

        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (al.k(al.this) != null && al.k(al.this).hook()) {
            } else {
                if (al.c(al.this).screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || al.c(al.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    ViewGroup viewGroup = (ViewGroup) al.c(al.this).getActivity().getWindow().getDecorView();
                    int systemUiVisibility = viewGroup.getSystemUiVisibility();
                    if (Build.VERSION.SDK_INT > 18 && systemUiVisibility != 4102) {
                        viewGroup.setSystemUiVisibility(4102);
                        return;
                    }
                }
                if (al.c(al.this) != null && al.c(al.this).getVideo() != null && (al.c(al.this).getVideo().t() == 3 || al.c(al.this).getVideo().t() == 6)) {
                    if (al.a(al.this) == null || al.a(al.this).x() == null) {
                        return;
                    }
                    if (al.a(al.this) != null && al.a(al.this).x() != null && !al.a(al.this).x().g()) {
                        return;
                    }
                }
                if ((al.j(al.this) == DWLifecycleType.AFTER && al.c(al.this).isNeedBackCover()) || al.j(al.this) == DWLifecycleType.BEFORE || al.d(al.this)) {
                    return;
                }
                if (!al.b(al.this).u() && (!al.c(al.this).mMuteDisplay || al.c(al.this).mPlayContext.mEmbed)) {
                    al.b(al.this).o();
                } else {
                    al.b(al.this).t();
                }
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.l.f();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.l.g();
        }
    }

    public void a(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410372b2", new Object[]{this, cVar});
        } else {
            this.l.a(cVar);
        }
    }

    public void a(com.taobao.avplayer.common.z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
        } else {
            this.o = zVar;
        }
    }

    public void a(com.taobao.avplayer.common.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410872c7", new Object[]{this, nVar});
        } else {
            this.l.a(nVar);
        }
    }

    public void a(com.taobao.avplayer.common.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df60391b", new Object[]{this, aaVar});
        } else {
            this.e.setHookRootViewTouchListener(aaVar);
        }
    }

    public void a(com.taobao.avplayer.common.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109cfe4", new Object[]{this, qVar});
        } else if (this.p.contains(qVar)) {
        } else {
            this.p.add(qVar);
        }
    }

    public final void a(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159ff38e", new Object[]{this, dWLifecycleType});
            return;
        }
        this.n = dWLifecycleType;
        b(dWLifecycleType);
        if (this.n == DWLifecycleType.MID) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", true");
            e(true);
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", false");
        e(false);
    }

    private void b(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0528ad", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<com.taobao.avplayer.common.q> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public View v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2f714cff", new Object[]{this}) : this.d;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.j.a(i);
        }
    }

    public void a(bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173beb30", new Object[]{this, bcVar});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.a(bcVar);
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.j.a(i, z, z2);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            this.j.s();
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        t tVar = this.m;
        if (tVar != null) {
            tVar.a(z);
        }
        z zVar = this.l;
        if (zVar == null) {
            return;
        }
        zVar.b(z);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l.a(z);
        this.j.b(z);
        com.taobao.avplayer.common.u uVar = this.q;
        if (uVar != null) {
            uVar.onMutedChange(z);
        }
        e(!z);
    }

    public void a(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.a(f2, f3, f4);
    }

    public void dL_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30efb1fe", new Object[]{this});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.c();
    }

    public List<com.taobao.taobaoavsdk.f> a(List<com.taobao.taobaoavsdk.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return null;
        }
        return dWVideoViewController.a(list);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        if (this.h) {
            this.h = false;
            this.F = true;
            this.k.a(this.I);
        }
        this.j.i();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.j.i();
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.c.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(this.c.mFrom, this.c.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_PRE_DOWNLOAD_BIZCODE_BLACKLIST, ""))) {
            ddg ddgVar = this.c.mTlogAdapter;
            com.taobao.taobaoavsdk.util.c.a(ddgVar, "--->preDownload failed, bizcode " + this.c.mFrom + " in blacklist");
        } else {
            this.G = true;
            this.H = i;
            if (this.h) {
                this.h = false;
                this.F = true;
                this.k.a(this.I);
            }
            if (this.F) {
                return;
            }
            K();
            this.G = false;
        }
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (this.c.mPlayContext.getVideoUrl() == null || StringUtils.isEmpty(this.c.mPlayContext.getVideoUrl())) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                int i = 1048576;
                if (this.H > 1048576) {
                    i = this.H;
                }
                jSONObject.put("bytes", String.valueOf(i));
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                if (this.c.mPlayContext.isH265()) {
                    jSONObject2.put("encodeType", "h265");
                } else {
                    jSONObject2.put("encodeType", "h264");
                }
                String videoUrl = this.c.mPlayContext.getVideoUrl();
                String a2 = a(videoUrl);
                StringBuilder sb = new StringBuilder(100);
                if (!StringUtils.isEmpty(a2)) {
                    sb.append("cdnIp=" + a2);
                }
                if (!StringUtils.isEmpty(this.c.getPlayToken())) {
                    if (!StringUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("playTokenId=" + this.c.getPlayToken());
                }
                if (this.c.mConfigAdapter != null && this.c.mConfigAdapter.e() && this.c.mPlayContext.getVideoLength() > 0 && this.c.mPlayContext.getVideoLength() < 262144000 && this.c.mPlayContext.getVideoLength() != Integer.MAX_VALUE && this.c.mPlayContext.getVideoLength() > 0) {
                    if (!StringUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("videoLength=" + this.c.mPlayContext.getVideoLength());
                }
                jSONObject2.put("url", com.taobao.taobaoavsdk.util.b.a(videoUrl, sb));
                if (this.c.mPlayContext.getCacheKey() != null && !StringUtils.isEmpty(this.c.mPlayContext.getCacheKey())) {
                    jSONObject2.put("cacheKey", this.c.mPlayContext.getCacheKey());
                }
                jSONArray.put(jSONObject2);
                jSONObject.put("videoInfoList", jSONArray);
                oyx.a(this.c.getActivity(), jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            if (!str.startsWith("http:") || this.c.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(this.c.mConfigAdapter.getConfig("DWInteractive", "videoClipCDNIpEnable3", "true"))) {
                return null;
            }
            if (!com.taobao.taobaoavsdk.util.b.a(this.c.mConfigAdapter.getConfig("DWInteractive", "disableTotalHttpDnsIPV6", "false"))) {
                z = com.taobao.taobaoavsdk.util.b.a(this.c.mConfigAdapter.getConfig("DWInteractive", "VideoEnableIPV6", "true"));
            }
            return com.taobao.taobaoavsdk.util.f.c(str, z);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            this.j.j();
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        String str = "";
        if (this.c.mConfigAdapter != null) {
            str = this.c.mConfigAdapter.getConfig(str, "disablePreloadBizCodeList", str);
        }
        if (com.taobao.taobaoavsdk.util.b.b(this.c.mFrom, str)) {
            return;
        }
        if (this.h) {
            this.h = false;
            this.F = true;
            this.k.a(this.I);
        }
        this.j.C();
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        String str = "";
        if (this.c.mConfigAdapter != null) {
            str = this.c.mConfigAdapter.getConfig(str, "disablePreloadBizCodeList", str);
        }
        if (com.taobao.taobaoavsdk.util.b.b(this.c.mFrom, str)) {
            return;
        }
        if (this.h) {
            this.h = false;
            this.F = true;
            this.k.a(this.I);
        }
        this.j.D();
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.j.m();
        this.k.s();
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            this.j.k();
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        Q();
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController != null) {
            dWVideoViewController.E();
        }
        z zVar = this.l;
        if (zVar != null) {
            zVar.y();
        }
        t tVar = this.m;
        if (tVar != null) {
            tVar.b();
        }
        ArrayList<com.taobao.avplayer.common.q> arrayList = this.p;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.k.s();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.l.r();
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer != null) {
            dWVideoContainer.initGesture();
        }
        this.v = kcj.b(this.c.getUserInfoAdapter().a(), this.c.getUserInfoAdapter().b());
        this.u = false;
        a((Map<String, String>) null, true);
        P();
        this.B = System.currentTimeMillis();
        L();
    }

    private void L() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (this.c.mDWAlarmAdapter == null) {
        } else {
            DWStabilityData dWStabilityData = new DWStabilityData();
            StringBuffer stringBuffer = new StringBuffer(100);
            if (this.c.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.c.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.c.mVideoId);
                stringBuffer.append(",useCache=");
                DWVideoViewController dWVideoViewController = this.j;
                stringBuffer.append(dWVideoViewController != null ? dWVideoViewController.z() : false);
                stringBuffer.append(",hitCache=");
                DWVideoViewController dWVideoViewController2 = this.j;
                stringBuffer.append(dWVideoViewController2 != null ? dWVideoViewController2.A() : false);
                stringBuffer.append(",completeHitCache=");
                DWVideoViewController dWVideoViewController3 = this.j;
                if (dWVideoViewController3 != null) {
                    z = dWVideoViewController3.B();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(this.c.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.c.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(O());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.E);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.c.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=");
                stringBuffer.append(this.D);
                stringBuffer.append(",useTBNet=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.c.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            this.c.mDWAlarmAdapter.a(this.c.getActivity(), "DWVideo", "videoPlay", true, dWStabilityData);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext != null && dWContext.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource)) {
            HashMap hashMap = new HashMap();
            if (this.c.getVideo() != null) {
                hashMap.put("playTime", String.valueOf(this.A));
            }
            b(false, (Map<String, String>) hashMap);
        }
        if (!this.c.isMute() && !this.L) {
            this.l.o();
        }
        this.l.s();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        DWVideoContainer dWVideoContainer = this.e;
        if (dWVideoContainer != null) {
            dWVideoContainer.initGesture();
        }
        this.B = System.currentTimeMillis();
        this.l.n();
        this.l.r();
        if (!this.l.z()) {
            return;
        }
        this.l.h();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else {
            this.B = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        a("videoPlay", String.valueOf(i), String.valueOf(i2));
        if (!u()) {
            this.n = DWLifecycleType.AFTER;
            a(this.n);
        }
        this.l.s();
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.z) {
        } else {
            this.z = true;
            if (this.c.mDWAlarmAdapter == null) {
                return;
            }
            DWStabilityData dWStabilityData = new DWStabilityData();
            dWStabilityData.code = str2;
            dWStabilityData.msg = str3;
            StringBuffer stringBuffer = new StringBuffer(100);
            DWContext dWContext = this.c;
            if (dWContext != null && dWContext.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.c.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.c.mVideoId);
                stringBuffer.append(",useCache=");
                DWVideoViewController dWVideoViewController = this.j;
                stringBuffer.append(dWVideoViewController != null ? dWVideoViewController.z() : false);
                stringBuffer.append(",hitCache=");
                DWVideoViewController dWVideoViewController2 = this.j;
                stringBuffer.append(dWVideoViewController2 != null ? dWVideoViewController2.A() : false);
                stringBuffer.append(",completeHitCache=");
                DWVideoViewController dWVideoViewController3 = this.j;
                if (dWVideoViewController3 != null) {
                    z = dWVideoViewController3.B();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(StringUtils.isEmpty(this.c.mPlayContext.getVideoUrl()) ? "" : this.c.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.c.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(O());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.E);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.c.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=");
                stringBuffer.append(this.D);
                stringBuffer.append(",useTBNet=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.c.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.c.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            com.taobao.avplayer.common.ad adVar = this.c.mDWAlarmAdapter;
            Activity activity = this.c.getActivity();
            if (StringUtils.isEmpty(str)) {
                str = "videoPlay";
            }
            adVar.a(activity, "DWVideo", str, false, dWStabilityData);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 != j || !(obj2 instanceof Map)) {
        } else {
            this.f16456a = true;
            try {
                b((Map) obj2);
            } catch (Exception unused) {
            }
        }
    }

    public Map<String, String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcc6bb03", new Object[]{this});
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return null;
        }
        return dWVideoViewController.f();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.s++;
        R();
        this.f = false;
        this.M = false;
        a(DWLifecycleType.MID_END);
        this.l.s();
        this.n = DWLifecycleType.AFTER;
        a(this.n);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        this.f = false;
        this.M = false;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            N();
            if (this.c.isFloatingToggle()) {
                this.c.setFloating(true);
                i();
            }
        } else {
            this.r++;
            this.e.setAlpha(1.0f);
            M();
            h();
            this.c.setFloating(false);
        }
        if (this.i == null || this.c == null) {
            return;
        }
        e(true);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.B != 0) {
            this.A += System.currentTimeMillis() - this.B;
            this.C = (int) (this.C + (System.currentTimeMillis() - this.B));
        }
        this.B = System.currentTimeMillis();
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (this.c.mUTAdapter == null || "TBAudio".equals(this.c.mVideoSource)) {
        } else {
            this.c.mUTAdapter.a("DWVideo", "Button", "videoFullScreen", this.c.getUTParams(), null);
        }
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (this.c.mUTAdapter == null || "TBAudio".equals(this.c.mVideoSource)) {
        } else {
            this.c.mUTAdapter.a("DWVideo", "Button", "videoWindow", this.c.getUTParams(), null);
        }
    }

    private void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
        } else if (!this.c.needFirstPlayUT() && this.M && true != z) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.c.isMute() && !this.N) {
                hashMap.put("wifiAuto", "true");
            } else {
                hashMap.put("wifiAuto", "false");
            }
            hashMap.put("mute", Boolean.toString(this.c.isMute()));
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.c.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource)) {
                if (!this.c.statInRemoveList("videoFirstPlay")) {
                    this.c.mUTAdapter.a("DWVideo", "Button", "videoFirstPlay", this.c.getUTParams(), hashMap);
                }
                hashMap.putAll(this.c.getUTParams());
                Uri data = this.c.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!StringUtils.isEmpty(queryParameter)) {
                        hashMap.put("spm-url", queryParameter);
                    }
                }
                hashMap.put("play_sid", this.v);
                hashMap.put("barrage", "false");
                hashMap.put("item", String.valueOf(this.c.getShowGoodsList()));
                hashMap.put("instance_playid", this.w);
                hashMap.put("likes", "false");
                hashMap.put("is_live", "0");
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWVideoController commit 12002 at commitFirstPlayUT");
                this.c.mUTAdapter.a(null, null, 12002, (String) hashMap.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), "", "", hashMap);
            }
            this.M = true;
            this.N = true;
        }
    }

    private void b(Map<String, Long> map) {
        DWContext dWContext;
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.b || (dWContext = this.c) == null || dWContext.mDWAlarmAdapter == null || map == null || map.get("RENDER_END_TIME") == null || map.get("RENDER_START_TIME") == null) {
        } else {
            long longValue = map.get("RENDER_END_TIME").longValue() - map.get("RENDER_START_TIME").longValue();
            if (longValue >= 10000 || longValue == 0 || i < 0) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.args = String.valueOf(longValue);
                this.c.mDWAlarmAdapter.a(this.c.getActivity(), "DWVideo", "VideoOutInTime", false, dWStabilityData);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", O());
            hashMap.put("videoUrl", this.c.mPlayContext.getVideoUrl());
            DWVideoViewController dWVideoViewController = this.j;
            hashMap.put(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, String.valueOf(dWVideoViewController != null ? dWVideoViewController.z() : false));
            DWVideoViewController dWVideoViewController2 = this.j;
            hashMap.put("hitCache", String.valueOf(dWVideoViewController2 != null ? dWVideoViewController2.A() : false));
            DWVideoViewController dWVideoViewController3 = this.j;
            if (dWVideoViewController3 != null) {
                z = dWVideoViewController3.B();
            }
            hashMap.put("completeHitCache", String.valueOf(z));
            hashMap.put("usePlayManger", String.valueOf(this.E));
            hashMap.put("videoDefinition", this.c.mPlayContext.getVideoDefinition());
            hashMap.put("useTBNet", String.valueOf(this.c.mPlayContext.isUseTBNet()));
            hashMap.put("useHardwareHevc", String.valueOf(this.c.mPlayContext.isHardwareHevc()));
            hashMap.put("useHardwareAvc", String.valueOf(this.c.mPlayContext.isHardwareAvc()));
            hashMap.put("playToken", String.valueOf(this.c.getPlayToken()));
            hashMap.putAll(this.c.getUTParams());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("first_frame_start", Double.valueOf(map.get("RENDER_START_TIME").longValue()));
            hashMap2.put("first_frame_end", Double.valueOf(map.get("RENDER_END_TIME").longValue()));
            hashMap2.put(TaoLiveVideoView.MornitorFirstFrameRender, Double.valueOf(longValue));
            this.c.mDWAlarmAdapter.a("DWVideo", TaoLiveVideoView.MornitorFirstFrameRender, hashMap, hashMap2);
            if (kck.a()) {
                ddg ddgVar = this.c.mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, "--->commitMediaPlayerRender:" + hashMap2.toString() + " dimensionValues:" + hashMap.toString());
            }
            this.b = true;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        DWContext dWContext = this.c;
        if (dWContext == null) {
            return;
        }
        if (dWContext.mConfigAdapter != null) {
            this.K = com.taobao.taobaoavsdk.util.b.b(this.c.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_PLAYER_CONTROL_SAMPLE_RATE, "10"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(0));
        hashMap.put("error_code", str);
        hashMap.put("from", this.c.mFrom);
        hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, this.c.mPlayScenes);
        hashMap.put("play_scenario", String.valueOf(2));
        hashMap.put("errorMsg", str2);
        Map<String, String> playExpUTParams = this.c.getPlayExpUTParams();
        if (playExpUTParams != null) {
            hashMap.put("pctime", String.valueOf(com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pctime"))));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ((str == "0" && ((int) currentTimeMillis) % 10 >= this.K) || this.c.mUTAdapter == null) {
            return;
        }
        this.c.mUTAdapter.a("DWVideo", null, 19997, "pcservice", "", "", hashMap);
    }

    private String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a8fc60a", new Object[]{this});
        }
        DWContext dWContext = this.c;
        if (dWContext == null) {
            return "";
        }
        int playerType = dWContext.mPlayContext.getPlayerType();
        return playerType != 1 ? playerType != 3 ? "mediaPlayer" : "taobaoPlayer" : "ijkPlayer";
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (!this.c.needFirstPlayUT() || this.f) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.c.isMute() && !this.O) {
                hashMap.put("wifiAuto", "true");
            } else {
                hashMap.put("wifiAuto", "false");
            }
            hashMap.put("mute", Boolean.toString(this.c.isMute()));
            if (this.c.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource) && !this.c.statInRemoveList("videoRealPlay")) {
                this.c.mUTAdapter.a("DWVideo", "Button", "videoRealPlay", this.c.getUTParams(), hashMap);
            }
            this.f = true;
            this.O = true;
        }
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        } else if (!this.c.needCloseUT() || this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWVideoController commitCloseUT 12003 return by !mDWContext.needCloseUT()=");
            sb.append(!this.c.needCloseUT());
            sb.append(",mVideoDestroyed=");
            sb.append(this.g);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (this.c.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource)) {
                HashMap hashMap = new HashMap();
                if (this.c.getVideo() != null) {
                    hashMap.put("closeTime", String.valueOf(this.c.getVideo().o()));
                    hashMap.put("playTime", String.valueOf(this.A));
                }
                if (!this.c.statInRemoveList("videoClose")) {
                    this.c.mUTAdapter.a("DWVideo", "Button", "videoClose", this.c.getUTParams(), hashMap);
                }
                b(true, (Map<String, String>) hashMap);
                this.c.setNeedCloseUT(true);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DWVideoController commitCloseUT 12003 failed with mDWContext.mUTAdapter=");
                if (this.c.mUTAdapter != null) {
                    z = true;
                }
                sb2.append(z);
                sb2.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb2.append(!"TBAudio".equals(this.c.mVideoSource));
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb2.toString());
            }
            this.g = true;
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (!this.c.needCloseUT() || this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWVideoController commitEndForMultiplexing 12003 return by !mDWContext.needCloseUT()=");
            sb.append(!this.c.needCloseUT());
            sb.append(",mVideoDestroyed=");
            sb.append(this.g);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else if (this.c.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource)) {
            HashMap hashMap = new HashMap();
            if (this.c.getVideo() != null) {
                hashMap.put("closeTime", String.valueOf(this.c.getVideo().o()));
                hashMap.put("playTime", String.valueOf(this.A));
                hashMap.put("commitByActive", "1");
            }
            if (!this.c.statInRemoveList("videoClose")) {
                this.c.mUTAdapter.a("DWVideo", "Button", "videoClose", this.c.getUTParams(), hashMap);
            }
            a(true, (Map<String, String>) hashMap);
            this.c.setNeedCloseUT(true);
            this.x++;
            this.t = false;
            this.x = 0;
            this.C = 0;
            this.A = 0L;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DWVideoController commitEndForMultiplexing 12003 failed with mDWContext.mUTAdapter=");
            if (this.c.mUTAdapter != null) {
                z = true;
            }
            sb2.append(z);
            sb2.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
            sb2.append(!"TBAudio".equals(this.c.mVideoSource));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb2.toString());
        }
    }

    private void a(boolean z, Map<String, String> map) {
        Map<String, String> playExpUTParams;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
        } else if (this.c.mUTAdapter != null && !"TBAudio".equals(this.c.mVideoSource)) {
            Uri data = this.c.getActivity().getIntent().getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("spm");
                if (!StringUtils.isEmpty(queryParameter)) {
                    map.put("spm-url", queryParameter);
                }
            }
            int n = this.j.n();
            map.put("video_duration", String.valueOf(n));
            if (n < 0 || n > 3600000) {
                com.taobao.taobaoavsdk.util.c.b("DWInstance", "get video_duration error, video_duration =" + String.valueOf(n));
            }
            String str = "1";
            map.put("complete", this.t ? str : "0");
            if (this.r == 0) {
                str = "0";
            }
            map.put("full", str);
            map.put("play_sid", this.v);
            map.put("play_type", z ? "end" : "pause");
            map.put("switchScene", this.J);
            map.put("play_times", String.valueOf(this.x));
            map.put("instance_playid", this.w);
            map.put("duration_time", String.valueOf(this.C));
            map.put("play_token", this.c.getPlayToken());
            map.put("is_live", "0");
            int i = this.C;
            if (i < 0 || i > 3600000) {
                com.taobao.taobaoavsdk.util.c.b("DWInstance", "get duration_time error, mDurationTime =" + String.valueOf(this.C) + ", mLatestTime = " + String.valueOf(this.B));
            }
            map.putAll(this.c.getUTParams());
            if (z && (playExpUTParams = this.c.getPlayExpUTParams()) != null) {
                int b2 = com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pctime"));
                if (b2 > 0) {
                    map.put("pctime", "" + b2);
                }
                int b3 = com.taobao.taobaoavsdk.util.b.b(playExpUTParams.get("pcerror"));
                map.put("pcerror", "" + b3);
                map.put("resourcePassThroughData", playExpUTParams.get("resourcePassThroughData"));
                map.put("videoPassThroughData", playExpUTParams.get("videoPassThroughData"));
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWVideoController 12003 commit at commitPlayEndInfo");
            this.c.mUTAdapter.a(null, null, IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID), com.ut.mini.l.getInstance().getCurrentPageName(), map.get("playTime"), map);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("DWVideoController commitPlayEndInfo 12003 failed with mDWContext.mUTAdapter=");
            if (this.c.mUTAdapter != null) {
                z2 = true;
            }
            sb.append(z2);
            sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
            sb.append(!"TBAudio".equals(this.c.mVideoSource));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        }
    }

    private void b(boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12381a", new Object[]{this, new Boolean(z), map});
        } else if (!this.f || (this.u && z)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWVideoController commitVideoComplete2 12003 return by !mVideoStarted=");
            sb.append(!this.f);
            sb.append(",(mHasCommitVideoComplete && end)=");
            if (this.u && z) {
                z2 = true;
            }
            sb.append(z2);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (!this.u && z) {
                this.u = true;
            }
            if (z) {
                this.x++;
            }
            a(z, map);
            if (!z) {
                return;
            }
            this.C = 0;
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else if (this.c.mUTAdapter == null || "TBAudio".equals(this.c.mVideoSource)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DWVideoController commitCompleteUT 12003 return by (mDWContext.mUTAdapter == null)=");
            if (this.c.mUTAdapter == null) {
                z = true;
            }
            sb.append(z);
            sb.append(",(DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource))=");
            sb.append("TBAudio".equals(this.c.mVideoSource));
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, sb.toString());
        } else {
            HashMap hashMap = new HashMap();
            if (this.c.getVideo() != null) {
                hashMap.put("completeTime", String.valueOf(this.c.getVideo().n()));
                hashMap.put("playTime", String.valueOf(this.A));
            }
            if (!this.c.statInRemoveList("videoComplete")) {
                this.c.mUTAdapter.a("DWVideo", "Button", "videoComplete", this.c.getUTParams(), hashMap);
            }
            this.t = true;
            b(true, (Map<String, String>) hashMap);
            this.t = false;
        }
    }

    /* loaded from: classes6.dex */
    public class b implements com.taobao.mediaplay.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1906749965);
            kge.a(763125200);
        }

        public b() {
        }

        @Override // com.taobao.mediaplay.c
        public void a(boolean z, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                return;
            }
            al.d(al.this, z);
            al.b(al.this, false);
            if (al.l(al.this)) {
                al.m(al.this);
                al.e(al.this, false);
            }
            if (StringUtils.isEmpty(al.c(al.this).mPlayContext.getVideoUrl()) && StringUtils.isEmpty(al.c(al.this).getVideoToken())) {
                com.taobao.taobaoavsdk.util.c.c(al.c(al.this).mTlogAdapter, " DWVideoUrlPickCallBack.onPick## can not startVideo ,  url empty");
                if (al.n(al.this) == null) {
                    return;
                }
                al.n(al.this).post(new Runnable() { // from class: com.taobao.avplayer.al.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0163  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 518
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.al.b.AnonymousClass1.run():void");
                    }
                });
                return;
            }
            try {
                al.this.a(false);
                al.o(al.this);
            } catch (Exception e) {
                ddg ddgVar = al.c(al.this).mTlogAdapter;
                com.taobao.taobaoavsdk.util.c.c(ddgVar, " DWVideoUrlPickCallBack.onPick## setVideoSource error exception:" + e.getMessage());
            }
            al.a(al.this, String.valueOf(0), "");
        }
    }

    private void e(boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (this.i == null || (dWContext = this.c) == null) {
        } else {
            if (z && !dWContext.isFloating() && !this.c.isMute() && this.n == DWLifecycleType.MID && (this.c.screenType() != DWVideoScreenType.NORMAL ? this.c.getDWConfigObject().a().m() : this.c.getDWConfigObject().a().l())) {
                if (this.i.getVisibility() != 0) {
                    this.i.setVisibility(0);
                }
                DWContext dWContext2 = this.c;
                if (dWContext2 != null && dWContext2.mDWImageAdapter != null) {
                    this.c.mDWImageAdapter.a(this.c.getDWConfigObject().a().a(), this.i);
                }
                a(this.c, (FrameLayout.LayoutParams) this.i.getLayoutParams());
                this.i.requestLayout();
                return;
            }
            if (this.i.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
            DWContext dWContext3 = this.c;
            if (dWContext3 == null || dWContext3.mDWImageAdapter == null) {
                return;
            }
            this.c.mDWImageAdapter.a((String) null, this.i);
        }
    }

    private void S() {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.i != null || (dWContext = this.c) == null || dWContext.getActivity() == null || this.e == null || this.c.getDWConfigObject() == null || this.c.getDWConfigObject().a() == null || StringUtils.isEmpty(this.c.getDWConfigObject().a().a()) || this.c.getDWConfigObject().a().b() <= 0 || this.c.getDWConfigObject().a().c() <= 0) {
        } else {
            if ((!this.c.getDWConfigObject().a().l() && !this.c.getDWConfigObject().a().m()) || this.c.getDWConfigObject().a().d() <= 0 || this.c.getDWConfigObject().a().e() <= 0) {
                return;
            }
            this.i = new ImageView(this.c.getActivity());
            this.e.addView(this.i, 1, new FrameLayout.LayoutParams(kcl.a(this.c.getActivity(), this.c.getDWConfigObject().a().b()), kcl.a(this.c.getActivity(), this.c.getDWConfigObject().a().c())));
            e(true);
        }
    }

    private void a(DWContext dWContext, FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4419f6", new Object[]{this, dWContext, layoutParams});
        } else if (dWContext == null || layoutParams == null || dWContext.getActivity() == null) {
        } else {
            if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i = kcl.a(dWContext);
                i2 = kcl.b(dWContext);
            } else if (dWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i = kcl.b((Context) dWContext.getActivity());
                i2 = kcl.b(dWContext.getActivity());
            } else {
                i = dWContext.mWidth;
                i2 = dWContext.mHeight;
            }
            float g2 = dWContext.getVideo().g() / dWContext.getVideo().h();
            float f2 = i;
            float f3 = i2;
            float f4 = f2 / f3;
            if (g2 > f4) {
                i4 = (int) (f2 / g2);
                i3 = i;
            } else {
                i3 = (int) (f3 * g2);
                i4 = i2;
            }
            int b2 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().b() : dWContext.getDWConfigObject().a().d();
            int c2 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().c() : dWContext.getDWConfigObject().a().e();
            layoutParams.width = kcl.a(dWContext.getActivity(), b2);
            layoutParams.height = kcl.a(dWContext.getActivity(), c2);
            float h = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().h() : dWContext.getDWConfigObject().a().i();
            float j = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().j() : dWContext.getDWConfigObject().a().k();
            String f5 = dWContext.screenType() == DWVideoScreenType.NORMAL ? dWContext.getDWConfigObject().a().f() : dWContext.getDWConfigObject().a().g();
            if (h < 0.0f || j < 0.0f || j > 1.0f || h > 1.0f || StringUtils.isEmpty(f5)) {
                layoutParams.rightMargin = dWContext.screenType() == DWVideoScreenType.NORMAL ? kcl.a(dWContext.getActivity(), 10.0f) : kcl.a(dWContext.getActivity(), 15.0f);
                layoutParams.topMargin = dWContext.screenType() == DWVideoScreenType.NORMAL ? kcl.a(dWContext.getActivity(), 10.0f) : kcl.a(dWContext.getActivity(), 15.0f);
                layoutParams.gravity = 53;
            } else if (f5.equalsIgnoreCase("RB")) {
                layoutParams.leftMargin = (int) (i3 * h);
                layoutParams.topMargin = (int) (i4 * j);
                layoutParams.gravity = 51;
            } else if (f5.equalsIgnoreCase("RT")) {
                layoutParams.leftMargin = (int) (i3 * h);
                layoutParams.bottomMargin = (int) (i4 * (1.0f - j));
                layoutParams.gravity = 83;
            } else if (f5.equalsIgnoreCase("LB")) {
                layoutParams.rightMargin = (int) (i3 * (1.0f - h));
                layoutParams.topMargin = (int) (i4 * j);
                layoutParams.gravity = 53;
            } else if (f5.equalsIgnoreCase("LT")) {
                layoutParams.rightMargin = (int) (i3 * (1.0f - h));
                layoutParams.bottomMargin = (int) (i4 * (1.0f - j));
                layoutParams.gravity = 85;
            }
            if (g2 < f4) {
                int i5 = (i - i3) / 2;
                if ((layoutParams.gravity & 3) == 3) {
                    layoutParams.leftMargin += i5;
                    return;
                } else if ((layoutParams.gravity & 5) != 5) {
                    return;
                } else {
                    layoutParams.rightMargin += i5;
                    return;
                }
            }
            int i6 = (i4 - i2) / 2;
            if ((layoutParams.gravity & 48) == 48) {
                layoutParams.topMargin -= i6;
            } else if ((layoutParams.gravity & 80) != 80) {
            } else {
                layoutParams.bottomMargin -= i6;
            }
        }
    }

    public void a(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9a4d3", new Object[]{this, ddeVar});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.a(ddeVar);
    }

    public void a(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a40a2", new Object[]{this, innerStartFuncListener});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.a(innerStartFuncListener);
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (this.B == 0) {
        } else {
            this.A += System.currentTimeMillis() - this.B;
            this.C = (int) (this.C + (System.currentTimeMillis() - this.B));
            this.B = System.currentTimeMillis();
        }
    }

    public void a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
        } else if (this.c.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(this.c.mConfigAdapter.getConfig("DWInteractive", kcf.ORANGE_DISABLE_SWITCH_SCENE, "false"))) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWVideoController switchPlayerScene 12003 return by ORANGE_DISABLE_SWITCH_SCENE");
        } else {
            DWContext dWContext = this.c;
            dWContext.mSwitchScene = this.J;
            dWContext.mSwitchSceneTime = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", this.J);
            this.j.a(hashMap);
            T();
            HashMap hashMap2 = new HashMap();
            if (this.c.getVideo() != null) {
                hashMap2.put("completeTime", String.valueOf(this.c.getVideo().n()));
                hashMap2.put("playTime", String.valueOf(this.A));
            }
            this.t = true;
            this.x++;
            a(true, (Map<String, String>) hashMap2);
            this.A = 0L;
            this.x = 0;
            this.t = false;
            this.v = kcj.b(this.c.getUserInfoAdapter().a(), this.c.getUserInfoAdapter().b());
            this.w = kcj.b(this.c.getUserInfoAdapter().a(), this.c.getUserInfoAdapter().b());
            a((Map<String, String>) null, z);
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j.a(map);
        }
    }

    public long I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3844", new Object[]{this})).longValue() : this.A;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null) {
            return;
        }
        dWVideoViewController.c(z);
    }

    public void a(bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173b76d1", new Object[]{this, bbVar});
            return;
        }
        DWVideoViewController dWVideoViewController = this.j;
        if (dWVideoViewController == null || dWVideoViewController.x() == null) {
            return;
        }
        this.j.x().a(bbVar);
    }
}
