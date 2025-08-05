package com.alibaba.triver.triver_shop.container.shopLoft;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.ut.share.business.ShareContent;
import java.io.Serializable;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes3.dex */
public final class MiniVideoLoftView implements b, com.taobao.mediaplay.player.e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b.c actionCallback;
    private MediaAspectRatio aspectRatio = MediaAspectRatio.DW_CENTER_CROP;
    private Context context;
    private String coverUrl;
    private MediaPlayCenter mediaPlayCenter;
    private JSONObject params;
    private String url;

    /* loaded from: classes3.dex */
    public static final class a implements com.taobao.mediaplay.player.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.mediaplay.player.f
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b.c access$getActionCallback$p = MiniVideoLoftView.access$getActionCallback$p(MiniVideoLoftView.this);
            if (access$getActionCallback$p == null) {
                return;
            }
            access$getActionCallback$p.a("onPause", null);
        }
    }

    static {
        kge.a(-109698808);
        kge.a(-563039837);
        kge.a(-613305621);
        kge.a(1028243835);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static final /* synthetic */ b.c access$getActionCallback$p(MiniVideoLoftView miniVideoLoftView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("76ebb6b7", new Object[]{miniVideoLoftView}) : miniVideoLoftView.actionCallback;
    }

    public final MediaAspectRatio getAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaAspectRatio) ipChange.ipc$dispatch("dd8523ae", new Object[]{this}) : this.aspectRatio;
    }

    public final void setAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f4294", new Object[]{this, mediaAspectRatio});
            return;
        }
        q.d(mediaAspectRatio, "<set-?>");
        this.aspectRatio = mediaAspectRatio;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.context = context;
        this.params = jSONObject;
        this.actionCallback = cVar;
        parseParams();
        initMediaPlayer();
    }

    private final void parseParams() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.params;
        String str = null;
        this.url = jSONObject == null ? null : jSONObject.getString("videoUrl");
        JSONObject jSONObject2 = this.params;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("coverPicUrl");
        }
        this.coverUrl = str;
        JSONObject jSONObject3 = this.params;
        if (jSONObject3 != null && jSONObject3.containsKey("autoRelease")) {
            z = true;
        }
        if (!z) {
            return;
        }
        registerAutoRelease();
    }

    private final void registerAutoRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfea16bc", new Object[]{this});
            return;
        }
        final Context context = this.context;
        if (!(context instanceof FragmentActivity)) {
            return;
        }
        ((FragmentActivity) context).getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView$registerAutoRelease$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPaused() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c47335f4", new Object[]{this});
                    return;
                }
                try {
                    Result.a aVar = Result.Companion;
                    Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    Result.m2371constructorimpl(kotlin.i.a(th));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                    return;
                }
                try {
                    Result.a aVar = Result.Companion;
                    Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    Result.m2371constructorimpl(kotlin.i.a(th));
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                    return;
                }
                ((FragmentActivity) context).getLifecycle().removeObserver(this);
                MiniVideoLoftView miniVideoLoftView = this;
                try {
                    Result.a aVar = Result.Companion;
                    miniVideoLoftView.onDestroyed();
                    Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    Result.m2371constructorimpl(kotlin.i.a(th));
                }
            }
        });
    }

    private final void initMediaPlayer() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        String str = this.url;
        this.mediaPlayCenter = new MediaPlayCenter(this.context);
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        q.a(mediaPlayCenter);
        mediaPlayCenter.setMediaUrl(str);
        MediaPlayCenter mediaPlayCenter2 = this.mediaPlayCenter;
        q.a(mediaPlayCenter2);
        mediaPlayCenter2.setMediaType(MediaType.VIDEO);
        MediaPlayCenter mediaPlayCenter3 = this.mediaPlayCenter;
        q.a(mediaPlayCenter3);
        mediaPlayCenter3.setConfigGroup("DW");
        MediaPlayCenter mediaPlayCenter4 = this.mediaPlayCenter;
        q.a(mediaPlayCenter4);
        mediaPlayCenter4.setNeedPlayControlView(false);
        MediaPlayCenter mediaPlayCenter5 = this.mediaPlayCenter;
        q.a(mediaPlayCenter5);
        mediaPlayCenter5.hideController();
        MediaPlayCenter mediaPlayCenter6 = this.mediaPlayCenter;
        q.a(mediaPlayCenter6);
        mediaPlayCenter6.setBusinessId("shop_mini_video");
        MediaPlayCenter mediaPlayCenter7 = this.mediaPlayCenter;
        q.a(mediaPlayCenter7);
        mediaPlayCenter7.setMediaSource("CDNVideo");
        MediaPlayCenter mediaPlayCenter8 = this.mediaPlayCenter;
        q.a(mediaPlayCenter8);
        mediaPlayCenter8.setPlayerType(3);
        MediaPlayCenter mediaPlayCenter9 = this.mediaPlayCenter;
        q.a(mediaPlayCenter9);
        mediaPlayCenter9.setScenarioType(0);
        MediaPlayCenter mediaPlayCenter10 = this.mediaPlayCenter;
        q.a(mediaPlayCenter10);
        mediaPlayCenter10.setVideoLoop(true);
        MediaPlayCenter mediaPlayCenter11 = this.mediaPlayCenter;
        q.a(mediaPlayCenter11);
        mediaPlayCenter11.setMediaAspectRatio(this.aspectRatio);
        MediaPlayCenter mediaPlayCenter12 = this.mediaPlayCenter;
        q.a(mediaPlayCenter12);
        mediaPlayCenter12.setMediaLifecycleListener(this);
        try {
            Result.a aVar = Result.Companion;
            MediaPlayCenter mediaPlayCenter13 = this.mediaPlayCenter;
            q.a(mediaPlayCenter13);
            mediaPlayCenter13.setVideoRecycleListener(new a());
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a(m2374exceptionOrNullimpl);
        }
        MediaPlayCenter mediaPlayCenter14 = this.mediaPlayCenter;
        q.a(mediaPlayCenter14);
        mediaPlayCenter14.setup();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            play();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            pause();
        }
    }

    public final void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.prepareToFirstFrame();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.start();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.mute(z);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        q.a(mediaPlayCenter);
        mediaPlayCenter.pause();
        MediaPlayCenter mediaPlayCenter2 = this.mediaPlayCenter;
        q.a(mediaPlayCenter2);
        mediaPlayCenter2.release();
        MediaPlayCenter mediaPlayCenter3 = this.mediaPlayCenter;
        q.a(mediaPlayCenter3);
        mediaPlayCenter3.destroy();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.start();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.mediaPlayCenter;
        if (mediaPlayCenter != null) {
            return mediaPlayCenter.getView();
        }
        return null;
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        b.c cVar = this.actionCallback;
        if (cVar == null) {
            return;
        }
        cVar.a("onPlay", null);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        b.c cVar = this.actionCallback;
        if (cVar == null) {
            return;
        }
        cVar.a("onPause", null);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        b.c cVar = this.actionCallback;
        if (cVar == null) {
            return;
        }
        cVar.a("onPlay", null);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        jSONObject.put((JSONObject) "errorCode", sb.toString());
        b.c cVar = this.actionCallback;
        if (cVar == null) {
            return;
        }
        cVar.a("onError", jSONObject);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        b.c cVar = this.actionCallback;
        if (cVar == null) {
            return;
        }
        cVar.a("onFinish", null);
    }
}
