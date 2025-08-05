package com.taobao.search.m3.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class M3VideoView extends FrameLayout implements av, ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final float countDownTranslation;
    private final CountDownView countDownView;
    private final M3ImageView cover;
    private float currentRadius;
    private long delayTime;
    private boolean hideCountDown;
    private String itemId;
    private final b playHandler;
    private final int playMsg;
    private String rn;
    private boolean showIcon;
    private String videoId;
    private bl videoInstance;
    private com.taobao.search.m3.video.a videoListener;
    private String videoUrl;
    private final boolean waterfall;

    /* loaded from: classes7.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                M3VideoView.access$playImpl(M3VideoView.this);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                M3VideoView.this.requestLayout();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(M3VideoView m3VideoView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3VideoView(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.waterfall = z;
        this.countDownView = new CountDownView(context);
        this.cover = new M3ImageView(context, this.waterfall, true);
        this.itemId = "";
        this.rn = "";
        this.playMsg = 1;
        this.currentRadius = M3ImageView.Companion.a();
        this.playHandler = new b(Looper.getMainLooper());
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.video.M3VideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), M3VideoView.access$getCurrentRadius$p(M3VideoView.this));
            }
        });
        this.cover.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.cover, new FrameLayout.LayoutParams(-1, -1));
        addView(this.countDownView);
        this.countDownView.setTranslationX(countDownTranslation);
        this.countDownView.setTranslationY(countDownTranslation);
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(M3VideoView m3VideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("311755b6", new Object[]{m3VideoView})).floatValue() : m3VideoView.currentRadius;
    }

    public static final /* synthetic */ void access$playImpl(M3VideoView m3VideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53cd79", new Object[]{m3VideoView});
        } else {
            m3VideoView.playImpl();
        }
    }

    public static final /* synthetic */ void access$setCurrentRadius$p(M3VideoView m3VideoView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8dfdc6", new Object[]{m3VideoView, new Float(f)});
        } else {
            m3VideoView.currentRadius = f;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(43341017);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(1920989905);
        kge.a(688755897);
        kge.a(857599862);
        Companion = new a(null);
        countDownTranslation = j.a(13.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        super.dispatchDraw(canvas);
        bl blVar = this.videoInstance;
        if (blVar != null) {
            if (blVar == null) {
                q.a();
            }
            ViewGroup l = blVar.l();
            if (l == null) {
                q.a();
            }
            if (l.getVisibility() != 8) {
                return;
            }
        }
        canvas.drawColor(M3ImageView.Companion.b());
    }

    private final void playImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc351fb", new Object[]{this});
            return;
        }
        bl blVar = this.videoInstance;
        if (blVar != null) {
            if (blVar == null) {
                q.a();
            }
            blVar.e();
            return;
        }
        String str = this.videoUrl;
        if (str == null) {
            str = "";
        }
        bl createDwInstance = createDwInstance(str, this.videoId);
        addView(createDwInstance.l(), 1, new FrameLayout.LayoutParams(-1, -1));
        this.playHandler.post(new c());
        createDwInstance.c();
        this.videoInstance = createDwInstance;
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        this.playHandler.removeMessages(this.playMsg);
        long j = this.delayTime;
        if (j > 0) {
            this.playHandler.sendEmptyMessageDelayed(this.playMsg, j);
        } else {
            playImpl();
        }
    }

    public final void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.playHandler.removeMessages(this.playMsg);
        bl blVar = this.videoInstance;
        if (blVar != null) {
            removeView(blVar.l());
            blVar.f();
            blVar.m();
        }
        this.videoInstance = null;
        if (!this.showIcon) {
            return;
        }
        this.countDownView.update(false, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean update(com.taobao.search.m3.M3CellBean r7, com.taobao.search.m3.video.a r8, com.taobao.search.searchdoor.sf.config.TbSearchStyle r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.video.M3VideoView.update(com.taobao.search.m3.M3CellBean, com.taobao.search.m3.video.a, com.taobao.search.searchdoor.sf.config.TbSearchStyle):boolean");
    }

    private final bl createDwInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl) ipChange.ipc$dispatch("81e31296", new Object[]{this, str, str2});
        }
        Context context = getContext();
        if (context != null) {
            bl.a aVar = new bl.a((Activity) context);
            aVar.a(str);
            try {
                aVar.a(0.0f);
            } catch (Throwable unused) {
                aVar.d(true);
            }
            aVar.j(false);
            aVar.i(false);
            aVar.c(false);
            aVar.c(getMeasuredWidth());
            aVar.d(getMeasuredHeight());
            aVar.b(str2);
            aVar.f(noa.DEFAULT_VIDEO_BIZ_CODE);
            aVar.k(noa.DEFAULE_VIDEO_PLAY_SCENES);
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("item_id", r.c(this.itemId));
            hashMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, r.c(this.rn));
            aVar.a(hashMap);
            aVar.a(com.taobao.search.musie.video.a.a("cover"));
            bl dwInstance = aVar.c();
            dwInstance.b((z) null);
            dwInstance.a((av) this);
            dwInstance.a((ax) this);
            q.a((Object) dwInstance, "dwInstance");
            return dwInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.search.m3.video.a aVar = this.videoListener;
        if (aVar != null) {
            aVar.a(false);
        }
        stop();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        stop();
        com.taobao.search.m3.video.a aVar = this.videoListener;
        if (aVar == null) {
            return;
        }
        aVar.a(true);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        stop();
        com.taobao.search.m3.video.a aVar = this.videoListener;
        if (aVar == null) {
            return;
        }
        aVar.a(true);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        stop();
        com.taobao.search.m3.video.a aVar = this.videoListener;
        if (aVar == null) {
            return;
        }
        aVar.a(false);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.showIcon) {
        } else {
            this.countDownView.update(!this.hideCountDown, i3, i);
        }
    }
}
