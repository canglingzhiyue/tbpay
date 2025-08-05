package com.etao.feimagesearch.videosearch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.VideoIrpActivity;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.avplayer.bk;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.cpf;
import tb.kge;

/* loaded from: classes4.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int HIDE_MSG = 1;
    public static final int HIDE_PLAY = 3;
    public static final String HIDE_TAG = "2";
    public static final String PLAY_URL = "https://img.alicdn.com/tfs/TB17Q8n4pY7gK0jSZKzXXaikpXa-226-278.png";
    public static final String TAG = "VideoSearch_ProgressController";
    public static final int UPDATE_PROGRESS_MSG = 2;

    /* renamed from: a  reason: collision with root package name */
    private final String f7077a;
    private final VideoIrpActivity b;
    private final SeekBar c;
    private bk d;
    private final View e;
    private final b f;
    private final com.etao.feimagesearch.videosearch.a g;
    private final com.etao.feimagesearch.videosearch.a h;
    private final com.etao.feimagesearch.videosearch.a i;
    private final com.etao.feimagesearch.videosearch.a j;
    private final com.etao.feimagesearch.videosearch.a k;
    private final TUrlImageView l;
    private final LinearLayout m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private final TextView r;
    private int s;

    /* loaded from: classes4.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                n.h(n.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TextureView j = n.e(n.this).j();
            Bitmap bitmap = j != null ? j.getBitmap() : null;
            if (bitmap != null) {
                if (n.e(n.this).i() != 0) {
                    n nVar = n.this;
                    bitmap = n.a(nVar, bitmap, n.e(nVar).i());
                }
                cpf.a(n.e(n.this), bitmap, n.f(n.this), PhotoFrom.Values.VIDEO_SHOT);
            }
            coy.a("Page_VideoSearchDetect", "GoPhotoSearch", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(n.e(n.this).g()), "pauseTime", String.valueOf(n.g(n.this)));
        }
    }

    static {
        kge.a(-1085006551);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-456890063);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public n(VideoIrpActivity activity, String str) {
        kotlin.jvm.internal.q.c(activity, "activity");
        this.f7077a = str;
        this.b = activity;
        View findViewById = activity.findViewById(R.id.sb_video);
        this.c = (SeekBar) (!(findViewById instanceof SeekBar) ? null : findViewById);
        View findViewById2 = activity.findViewById(R.id.view_progress_control);
        this.e = !(findViewById2 instanceof View) ? null : findViewById2;
        this.f = new b(this);
        this.g = new com.etao.feimagesearch.videosearch.a(-1.0f, 1.0f, false);
        this.h = new com.etao.feimagesearch.videosearch.a(-1.0f, 0.0f, true);
        this.i = new com.etao.feimagesearch.videosearch.a(-1.0f, 0.0f, true);
        this.j = new com.etao.feimagesearch.videosearch.a(-1.0f, 0.0f, true);
        this.k = new com.etao.feimagesearch.videosearch.a(-1.0f, 1.0f, false);
        View findViewById3 = activity.findViewById(R.id.iv_play);
        if (findViewById3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.l = (TUrlImageView) findViewById3;
        View findViewById4 = activity.findViewById(R.id.btn_video_shot);
        if (findViewById4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.m = (LinearLayout) findViewById4;
        View findViewById5 = activity.findViewById(R.id.tv_progress);
        if (findViewById5 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.r = (TextView) findViewById5;
        j();
        i();
        k();
        p();
        l();
    }

    public static final /* synthetic */ Bitmap a(n nVar, Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e9b0ba77", new Object[]{nVar, bitmap, new Integer(i)}) : nVar.a(bitmap, i);
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.a a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.a) ipChange.ipc$dispatch("de33a5b", new Object[]{nVar}) : nVar.g;
    }

    public static final /* synthetic */ void a(n nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3a4e7f", new Object[]{nVar, new Integer(i)});
        } else {
            nVar.p = i;
        }
    }

    public static final /* synthetic */ void a(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3a8e50", new Object[]{nVar, new Boolean(z)});
        } else {
            nVar.q = z;
        }
    }

    public static final /* synthetic */ void b(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e033c5", new Object[]{nVar});
        } else {
            nVar.q();
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.a c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.a) ipChange.ipc$dispatch("c9ca0619", new Object[]{nVar}) : nVar.k;
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.a d(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.a) ipChange.ipc$dispatch("a7bd6bf8", new Object[]{nVar}) : nVar.j;
    }

    public static final /* synthetic */ VideoIrpActivity e(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoIrpActivity) ipChange.ipc$dispatch("c126528f", new Object[]{nVar}) : nVar.b;
    }

    public static final /* synthetic */ String f(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57b850f7", new Object[]{nVar}) : nVar.f7077a;
    }

    public static final /* synthetic */ int g(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4275d7d", new Object[]{nVar})).intValue() : nVar.s;
    }

    public static final /* synthetic */ void h(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b968cc4b", new Object[]{nVar});
        } else {
            nVar.o();
        }
    }

    public static final /* synthetic */ void k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692d188e", new Object[]{nVar});
        } else {
            nVar.m();
        }
    }

    public final bk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("88d7d26e", new Object[]{this}) : this.d;
    }

    public final void a(bk bkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173f8e28", new Object[]{this, bkVar});
        } else {
            this.d = bkVar;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.o;
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View findViewById = this.m.findViewById(R.id.iv_video_shot);
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.m.setAlpha(0.0f);
        ((TUrlImageView) findViewById).setImageUrl("https://img.alicdn.com/tfs/TB1SSpJ4pP7gK0jSZFjXXc5aXXa-76-72.png");
        this.m.setOnClickListener(new d());
    }

    private final Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{this, bitmap, new Integer(i)});
        }
        if ((i / 90) % 2 != 1) {
            return bitmap;
        }
        Bitmap rotated = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas();
        canvas.setBitmap(rotated);
        Matrix matrix = new Matrix();
        matrix.postRotate(i, bitmap.getHeight() / 2.0f, bitmap.getHeight() / 2.0f);
        canvas.drawBitmap(bitmap, matrix, null);
        kotlin.jvm.internal.q.a((Object) rotated, "rotated");
        return rotated;
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.l.setImageUrl(PLAY_URL);
        this.l.setAlpha(0.0f);
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.c;
        if (seekBar != null) {
            seekBar.setThumb(new p());
        }
        SeekBar seekBar2 = this.c;
        if (seekBar2 != null) {
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.etao.feimagesearch.videosearch.VideoProgressController$initSeekBar$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cb0524b", new Object[]{this, seekBar3});
                        return;
                    }
                    cot.c(n.TAG, "onStartTrackingTouch");
                    if (!n.this.b()) {
                        n.h(n.this);
                    }
                    cox.a("dragprogress", new String[0]);
                    n nVar = n.this;
                    n.$ipChange.setVisibility(0);
                    n.a(n.this, false);
                    n nVar2 = n.this;
                    if (seekBar3 == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    n.a(nVar2, seekBar3.getProgress());
                    bk a2 = n.this.a();
                    if (a2 != null) {
                        a2.playVideo();
                    }
                    n nVar3 = n.this;
                    LinearLayout linearLayout = n.$ipChange;
                    if (linearLayout == null) {
                        return;
                    }
                    linearLayout.setAlpha(0.0f);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar3, int i, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c49e629f", new Object[]{this, seekBar3, new Integer(i), new Boolean(z)});
                        return;
                    }
                    cot.c(n.TAG, "onProgressChanged: progress " + i + ", fromUser " + z);
                    if (!z) {
                        return;
                    }
                    n.a(n.this, i);
                    n nVar = n.this;
                    if (seekBar3 == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    nVar.a(i, seekBar3.getMax());
                    bk a2 = n.this.a();
                    if (a2 == null) {
                        return;
                    }
                    a2.seekTo(i);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2e63d74d", new Object[]{this, seekBar3});
                        return;
                    }
                    cot.c(n.TAG, "onStopTrackingTouch ");
                    n nVar = n.this;
                    n.$ipChange.setVisibility(8);
                    if (seekBar3 == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    int progress = seekBar3.getProgress();
                    bk a2 = n.this.a();
                    if (a2 != null) {
                        a2.seekTo(progress);
                    }
                    n.a(n.this, true);
                    n nVar2 = n.this;
                    LinearLayout linearLayout = n.$ipChange;
                    if (linearLayout != null) {
                        linearLayout.setAlpha(1.0f);
                    }
                    n.k(n.this);
                }
            });
        }
        this.k.a(this.l);
        this.k.a(this.m);
        this.j.a(this.l);
        this.i.a(this.m);
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new c());
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.j.a()) {
            this.j.c();
        }
        this.k.b();
        this.f.removeMessages(3);
        this.f.sendEmptyMessageDelayed(3, 3000L);
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.f.removeMessages(3);
        if (this.k.a()) {
            this.k.c();
        }
        if (!this.j.a()) {
            this.j.b();
        }
        if (this.i.a()) {
            return;
        }
        this.i.b();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        bk bkVar = this.d;
        if (bkVar != null) {
            bkVar.playVideo();
        }
        if (!this.o) {
            return;
        }
        o();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        bk bkVar = this.d;
        if (bkVar != null) {
            bkVar.pauseVideo();
        }
        if (this.o) {
            return;
        }
        o();
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        cot.c(TAG, "onVideoTouched virtualPaused = " + this.o);
        this.b.o();
        if (this.o) {
            this.o = false;
            bk bkVar = this.d;
            if (bkVar != null) {
                bkVar.playVideo();
            }
            if (this.h.a()) {
                this.h.c();
            }
            this.g.b();
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            q();
            n();
            return;
        }
        m();
        if (this.g.a()) {
            this.g.c();
        }
        this.h.b();
        bk bkVar2 = this.d;
        if (bkVar2 != null) {
            this.p = bkVar2.getCurrentPosition();
        }
        bk bkVar3 = this.d;
        if (bkVar3 != null) {
            bkVar3.pauseVideo();
        }
        this.l.setVisibility(0);
        this.m.setVisibility(0);
        coy.a("Page_VideoSearchDetect", "GoPhotoSearchExpose", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(this.b.g()), "pauseTime", String.valueOf(this.s));
        this.f.removeMessages(2);
        this.o = true;
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        View btnAll = this.b.findViewById(R.id.btn_show_all);
        kotlin.jvm.internal.q.a((Object) btnAll, "btnAll");
        btnAll.setTag("2");
        this.g.a(btnAll);
        this.h.a(btnAll);
        btnAll.setAlpha(0.0f);
        btnAll.setVisibility(8);
        View loading = this.b.findViewById(R.id.view_loading);
        this.g.a(loading);
        this.h.a(loading);
        kotlin.jvm.internal.q.a((Object) loading, "loading");
        loading.setAlpha(1.0f);
        loading.setVisibility(0);
        View noResult = this.b.findViewById(R.id.tv_no_result);
        kotlin.jvm.internal.q.a((Object) noResult, "noResult");
        noResult.setTag("2");
        this.g.a(noResult);
        this.h.a(noResult);
        noResult.setAlpha(0.0f);
        noResult.setVisibility(8);
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        bk bkVar = this.d;
        if (bkVar == null || this.o) {
            return;
        }
        SeekBar seekBar = this.c;
        if (seekBar != null) {
            seekBar.setProgress(bkVar.getCurrentPosition());
        }
        this.f.sendEmptyMessageDelayed(2, 20L);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.q) {
            this.q = false;
            bk bkVar = this.d;
            if (bkVar == null) {
                return;
            }
            bkVar.pauseVideo();
        } else {
            bk bkVar2 = this.d;
            if (bkVar2 == null) {
                return;
            }
            bkVar2.seekTo(this.p);
        }
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String a2 = com.etao.feimagesearch.util.l.a(i);
        String a3 = com.etao.feimagesearch.util.l.a(i2);
        TextView textView = this.r;
        textView.setText(a2 + " / " + a3);
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        this.n = false;
        bk bkVar = this.d;
        if (bkVar == null) {
            return 0;
        }
        SeekBar seekBar = this.c;
        if (seekBar != null) {
            seekBar.setMax((int) bkVar.getDuration());
        }
        return (int) bkVar.getDuration();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cot.c(TAG, "onVideoPause");
        this.n = true;
    }

    public final void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.s = i;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.c;
        bk bkVar = this.d;
        if (seekBar == null || bkVar == null) {
            return;
        }
        seekBar.setProgress(bkVar.getCurrentPosition());
    }

    /* loaded from: classes4.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final n f7078a;

        static {
            kge.a(1044003);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n controller) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.q.c(controller, "controller");
            this.f7078a = controller;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            kotlin.jvm.internal.q.c(msg, "msg");
            int i = msg.what;
            if (i == 1) {
                if (n.a(this.f7078a).a()) {
                    return;
                }
                n.a(this.f7078a).b();
            } else if (i == 2) {
                removeMessages(2);
                n.b(this.f7078a);
            } else if (i != 3) {
            } else {
                if (n.c(this.f7078a).a()) {
                    n.c(this.f7078a).c();
                }
                n.d(this.f7078a).b();
            }
        }
    }
}
