package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.avplayer.av;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.awz;

/* loaded from: classes2.dex */
public class axa extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXAURAVIDEOVIEW_AURAVIDEOVIEW = 7965646646230168264L;
    public static final long DXAURAVIDEOVIEW_ENABLECONTROLSVIEW = 44800416707883368L;
    public static final long DXAURAVIDEOVIEW_ENABLEMUTEBUTTON = 2031920288429361294L;
    public static final long DXAURAVIDEOVIEW_ISORIGINMUTE = -609945470688825365L;
    public static final long DXAURAVIDEOVIEW_ONVIDEOLIFECYCLE = -3989344266007756940L;
    public static final long DXAURAVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DXAURAVIDEOVIEW_THUMBNAILSCALETYPE = -3390482391620443040L;
    public static final long DXAURAVIDEOVIEW_THUMBNAILURL = -738660921875005181L;
    public static final long DXAURAVIDEOVIEW_VIDEOID = 5435952498458972235L;
    public static final long DXAURAVIDEOVIEW_VIDEOURL = 7344459856848172626L;

    /* renamed from: a  reason: collision with root package name */
    private String f25662a = "true";
    private String b = "true";
    private String c = "true";
    private String d = AliSDetailScaleType.centerCrop;
    private String e = AliSDetailScaleType.centerCrop;
    private String f;
    private String g;
    private String h;

    static {
        kge.a(-223851611);
    }

    public static /* synthetic */ Object ipc$super(axa axaVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(axa axaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd5ee37", new Object[]{axaVar, map});
        } else {
            axaVar.a(map);
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1945087356);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new axa();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new axa();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof axa)) {
        } else {
            super.onClone(dXWidgetNode, z);
            axa axaVar = (axa) dXWidgetNode;
            this.f25662a = axaVar.f25662a;
            this.b = axaVar.b;
            this.c = axaVar.c;
            this.d = axaVar.d;
            this.e = axaVar.e;
            this.f = axaVar.f;
            this.g = axaVar.g;
            this.h = axaVar.h;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout)) {
            arc.a().b("DXAURAVideoViewWidgetNode.onRenderView:weakView is not FrameLayout");
            return;
        }
        final FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt != null && (childAt.getTag(R.id.aura_video_player) instanceof awz) && StringUtils.equals(this.g, ((awz) childAt.getTag(R.id.aura_video_player)).g())) {
                arc.a().a("DXAURAVideoViewWidgetNode.onRenderView:videoPlayer already added");
                return;
            }
            Runnable runnable = new Runnable() { // from class: tb.axa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        frameLayout.removeAllViews();
                    }
                }
            };
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                runnable.run();
            } else {
                frameLayout.post(runnable);
            }
        }
        final awz a2 = a(context, frameLayout);
        if (a2 == null) {
            arc.a().b("DXAURAVideoViewWidgetNode.onRenderView:videoPlayer is null");
            return;
        }
        final View f = a2.f();
        f.setTag(R.id.aura_video_player, a2);
        a(f);
        Runnable runnable2 = new Runnable() { // from class: tb.axa.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                frameLayout.addView(f, new FrameLayout.LayoutParams(-1, -1));
                f.setId(R.id.aura_video_player_view_id);
                a2.a(axa.this.getWidth(), axa.this.getHeight());
            }
        };
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable2.run();
        } else {
            frameLayout.post(runnable2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "onInit");
        hashMap.put("videoPlayer", a2);
        a(hashMap);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue() : super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXAURAVIDEOVIEW_ISORIGINMUTE) {
            this.f25662a = str;
        } else if (j == DXAURAVIDEOVIEW_ENABLEMUTEBUTTON) {
            this.b = str;
        } else if (j == DXAURAVIDEOVIEW_ENABLECONTROLSVIEW) {
            this.c = str;
        } else if (j == 1015096712691932083L) {
            this.d = str;
        } else if (j == DXAURAVIDEOVIEW_THUMBNAILSCALETYPE) {
            this.e = str;
        } else if (j == DXAURAVIDEOVIEW_THUMBNAILURL) {
            this.f = str;
        } else if (j == 5435952498458972235L) {
            this.g = str;
        } else if (j == 7344459856848172626L) {
            this.h = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : (j == DXAURAVIDEOVIEW_ISORIGINMUTE || j == DXAURAVIDEOVIEW_ENABLEMUTEBUTTON || j == DXAURAVIDEOVIEW_ENABLECONTROLSVIEW) ? "true" : (j == 1015096712691932083L || j == DXAURAVIDEOVIEW_THUMBNAILSCALETYPE) ? AliSDetailScaleType.centerCrop : super.getDefaultValueForStringAttr(j);
    }

    private awz a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awz) ipChange.ipc$dispatch("13cdff50", new Object[]{this, context, view});
        }
        if (!(context instanceof Activity)) {
            arc.a().b("DXAURAVideoViewWidgetNode.generateVideoPlayer:context is not Activity");
            return null;
        } else if (view == null) {
            arc.a().b("DXAURAVideoViewWidgetNode.generateVideoPlayer:container is null");
            return null;
        } else {
            awz.a aVar = new awz.a(context);
            aVar.h(this.f25662a).f(this.b).g(this.c).d(this.d).e(this.e).c(this.f).a(this.g).b(this.h).a(getWidth()).b(getHeight());
            return aVar.a();
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
            arc.a().b("DXAURAVideoViewWidgetNode.bindVideoLifecycleEvent:videoPlayerView is null");
        } else {
            final Object tag = view.getTag(R.id.aura_video_player);
            if (!(tag instanceof awz)) {
                arc.a().b("DXAURAVideoViewWidgetNode.bindVideoLifecycleEvent:can't get videoPlayer");
            } else {
                ((awz) tag).a(new av() { // from class: tb.axa.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.avplayer.av
                    public void onVideoClose() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoFullScreen() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5dcccbde", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoInfo(Object obj, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoNormalScreen() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ff4b0936", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoPrepared(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoSeekTo(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoStart() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onPlay");
                        hashMap.put("videoPlayer", tag);
                        axa.a(axa.this, hashMap);
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoPause(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onPause");
                        hashMap.put("videoPlayer", tag);
                        axa.a(axa.this, hashMap);
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoPlay() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onPlay");
                        hashMap.put("videoPlayer", tag);
                        axa.a(axa.this, hashMap);
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoError(Object obj, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onError");
                        hashMap.put("videoPlayer", tag);
                        hashMap.put("errorCode", Integer.valueOf(i));
                        axa.a(axa.this, hashMap);
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onComplete");
                        hashMap.put("videoPlayer", tag);
                        axa.a(axa.this, hashMap);
                    }

                    @Override // com.taobao.avplayer.av
                    public void onVideoProgressChanged(int i, int i2, int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", "onProgressChanged");
                        hashMap.put("videoPlayer", tag);
                        hashMap.put("playedTime", Integer.valueOf(i));
                        hashMap.put("totalTime", Integer.valueOf(i3));
                        axa.a(axa.this, hashMap);
                    }
                });
            }
        }
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        DXEvent dXEvent = new DXEvent(DXAURAVIDEOVIEW_ONVIDEOLIFECYCLE);
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                f fVar = null;
                if (value instanceof Integer) {
                    fVar = f.a(((Integer) value).longValue());
                } else if (value instanceof Long) {
                    fVar = f.a(((Long) value).longValue());
                } else if (value instanceof Float) {
                    fVar = f.a(((Float) value).doubleValue());
                } else if (value instanceof Double) {
                    fVar = f.a(((Double) value).doubleValue());
                } else if (value instanceof String) {
                    fVar = f.a((String) value);
                } else if (value instanceof Object) {
                    fVar = f.a(value);
                }
                if (fVar != null) {
                    hashMap.put(entry.getKey(), fVar);
                }
            }
            dXEvent.setArgs(hashMap);
        }
        postEvent(dXEvent);
    }
}
