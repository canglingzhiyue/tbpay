package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.s;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import com.taobao.tbpoplayer.nativerender.dsl.VideoModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.j;
import com.taobao.tbpoplayer.nativerender.l;
import com.taobao.tbpoplayer.nativerender.p;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class h extends c<VideoModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private s e;
    private int f;
    private volatile boolean g;
    private volatile boolean h;

    static {
        kge.a(1785387292);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == 93762283) {
            super.d();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$3UOv03lb-Hizsqq4n2SZ2I96pI0 */
    public static /* synthetic */ void m1462lambda$3UOv03lbHizsqq4n2SZ2I96pI0(h hVar) {
        hVar.i();
    }

    public static /* synthetic */ boolean lambda$4hkChAePZFxDH0B6uTC5uDbp4HQ(h hVar, View view) {
        return hVar.b(view);
    }

    public static /* synthetic */ void lambda$BC0ZFaE5xEwHyt03NEkKFM4bGas(h hVar, FrameLayout frameLayout) {
        hVar.a(frameLayout);
    }

    public static /* synthetic */ void lambda$E5vbzdsH9gt5DpK_m6KTPCOEnHE(h hVar, TriggerActionsModel triggerActionsModel) {
        hVar.a(triggerActionsModel);
    }

    /* renamed from: lambda$IeGOSj5kv0SN-TQfoIoqUmX08dM */
    public static /* synthetic */ void m1463lambda$IeGOSj5kv0SNTQfoIoqUmX08dM(h hVar, View view) {
        hVar.c(view);
    }

    public static /* synthetic */ void lambda$fqhKuLit5emOgI0GsRxZdFS8ptE(h hVar) {
        hVar.h();
    }

    public static /* synthetic */ void lambda$rDdHyedLgbbA62aO5DSCmyugf4Q(h hVar) {
        hVar.j();
    }

    public static /* synthetic */ s a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("271a88ac", new Object[]{hVar}) : hVar.e;
    }

    public static /* synthetic */ void a(h hVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff9b40a", new Object[]{hVar, view});
        } else {
            hVar.a(view);
        }
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("505a8c10", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.g = z;
        return z;
    }

    public static /* synthetic */ boolean b(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad02c91", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.h = z;
        return z;
    }

    public h(com.taobao.tbpoplayer.nativerender.e eVar, VideoModel videoModel, boolean z) {
        super(eVar, videoModel, z);
        this.f = 0;
        this.g = false;
        this.h = false;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public StyleModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("815a627d", new Object[]{this});
        }
        if (this.b == 0) {
            return null;
        }
        return ((VideoModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        final TriggerActionsModel triggerActionsModel;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        final FrameLayout frameLayout = new FrameLayout(context);
        a(frameLayout, ((VideoModel) this.b).style);
        com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$BC0ZFaE5xEwHyt03NEkKFM4bGas
            {
                h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h.lambda$BC0ZFaE5xEwHyt03NEkKFM4bGas(h.this, frameLayout);
            }
        });
        Iterator<TriggerActionsModel> it = ((VideoModel) this.b).triggerActions.iterator();
        while (true) {
            triggerActionsModel = null;
            if (!it.hasNext()) {
                l = null;
                break;
            }
            triggerActionsModel = it.next();
            if (triggerActionsModel.isValid() && "loadOutOfTime".equals(triggerActionsModel.trigger.getString("type"))) {
                l = Long.valueOf(triggerActionsModel.trigger.getLongValue("timeLimit"));
                break;
            }
        }
        if (l != null && l.longValue() > 0) {
            frameLayout.postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$E5vbzdsH9gt5DpK_m6KTPCOEnHE
                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$E5vbzdsH9gt5DpK_m6KTPCOEnHE(h.this, triggerActionsModel);
                }
            }, l.longValue());
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$IeGOSj5kv0SN-TQfoIoqUmX08dM
            {
                h.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.m1463lambda$IeGOSj5kv0SNTQfoIoqUmX08dM(h.this, view);
            }
        });
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$4hkChAePZFxDH0B6uTC5uDbp4HQ
            {
                h.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return h.lambda$4hkChAePZFxDH0B6uTC5uDbp4HQ(h.this, view);
            }
        });
        return frameLayout;
    }

    public /* synthetic */ void a(final FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        try {
            s.a aVar = new s.a(PopLayer.getReference().internalGetCurrentActivity());
            if (!TextUtils.isEmpty(((VideoModel) this.b).videoId)) {
                aVar.c(p.a(this.f22246a, ((VideoModel) this.b).videoId));
            } else {
                aVar.a(p.a(this.f22246a, ((VideoModel) this.b).url));
            }
            if (((VideoModel) this.b).loopTimes == 1) {
                aVar.c(false);
            } else if (((VideoModel) this.b).loopTimes >= 0) {
                aVar.c(true);
            }
            aVar.d("TBVideo").a(true).a(DWInstanceType.VIDEO).f("PopLayer").b("Pop4");
            DWAspectRatio dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
            if (((VideoModel) this.b).style != null && ((VideoModel) this.b).style.objectFit.equals("cover")) {
                dWAspectRatio = DWAspectRatio.DW_CENTER_CROP;
            }
            aVar.a(dWAspectRatio);
            this.e = aVar.a();
            frameLayout.addView(this.e.e(), -1, -1);
            frameLayout.setAlpha(0.0f);
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.addView", new Object[0]);
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    h.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    try {
                        int width = frameLayout.getWidth();
                        int height = frameLayout.getHeight();
                        h.a(h.this).a(width, height);
                        h.a(h.this, frameLayout);
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onGlobalLayout.width=" + width + ".height=" + height, new Object[0]);
                    } catch (Throwable th) {
                        try {
                            com.alibaba.poplayer.utils.c.a("PopVideoComponent.onGlobalLayout.error", th);
                        } finally {
                            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    }
                }
            });
            frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.tbpoplayer.nativerender.render.component.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                    }
                }

                {
                    h.this = this;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                        return;
                    }
                    try {
                        h.a(h.this).f();
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onViewDetachedFromWindow.destroy", new Object[0]);
                    } catch (Throwable th) {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onViewDetachedFromWindow.error", th);
                    }
                }
            });
            this.e.a(new ax() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$rDdHyedLgbbA62aO5DSCmyugf4Q
                @Override // com.taobao.avplayer.ax
                public final void onLoopCompletion() {
                    h.lambda$rDdHyedLgbbA62aO5DSCmyugf4Q(h.this);
                }
            });
            this.e.a(new aw() { // from class: com.taobao.tbpoplayer.nativerender.render.component.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.aw
                public void onVideoProgressChanged(int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                {
                    h.this = this;
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoStart", new Object[0]);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoPause(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoPause." + z, new Object[0]);
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoPlay() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoPlay", new Object[0]);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoSeekTo(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoSeekTo", new Object[0]);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoPrepared(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoPrepared.startPlay", new Object[0]);
                    try {
                        h.a(h.this, true);
                        h.this.f22246a.j();
                    } catch (Throwable th) {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onImageLoaded.error", th);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoError(Object obj, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoError", new Object[0]);
                    try {
                        if (com.taobao.tbpoplayer.nativerender.s.a(h.this.f22246a, "loadFail", true, ((VideoModel) h.this.b).triggerActions) || h.this.f22246a.a().F() || !h.this.f22246a.a().h()) {
                            return;
                        }
                        h.this.f22246a.a("VideoLoadFail", String.valueOf(i), false, (j) null);
                    } catch (Throwable th) {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoError.error", th);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoInfo. what = " + j + " extra = " + j2, new Object[0]);
                    if (j != 3) {
                        return;
                    }
                    h.b(h.this, true);
                    h hVar = h.this;
                    h.a(hVar, hVar.c);
                    StyleModel a2 = h.this.a();
                    if (!TextUtils.isEmpty(a2.opacity)) {
                        frameLayout.setAlpha(Float.parseFloat(a2.opacity));
                    } else {
                        frameLayout.setAlpha(1.0f);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoComplete", new Object[0]);
                    try {
                        com.taobao.tbpoplayer.nativerender.s.a(h.this.f22246a, "playEnd", true, ((VideoModel) h.this.b).triggerActions);
                    } catch (Throwable th) {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoComplete.error", th);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoClose() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoClose", new Object[0]);
                    }
                }

                @Override // com.taobao.avplayer.aw
                public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopVideoComponent.onVideoScreenChanged." + dWVideoScreenType.getValue(), new Object[0]);
                }
            });
            if (this.f22246a.a().F()) {
                this.e.a();
            } else {
                this.e.q();
                this.e.d();
            }
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.prepareToFirstFrame", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.create.error", th);
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            this.f++;
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.onLoopCompletion.mLoopCount=" + this.f, new Object[0]);
            if (((VideoModel) this.b).loopTimes <= 0 || this.f != ((VideoModel) this.b).loopTimes - 1) {
                return;
            }
            this.e.d(false);
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.onLoopCompletion.setVideoLoop=false", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.onLoopCompletion.error", th);
        }
    }

    public /* synthetic */ void a(TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8947b619", new Object[]{this, triggerActionsModel});
            return;
        }
        try {
            if (this.g) {
                return;
            }
            this.f22246a.a(this.b, "loadOutOfTime", triggerActionsModel.action, triggerActionsModel.actions);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.outOfTime.error", th);
        }
    }

    public /* synthetic */ void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else {
            this.f22246a.e().a(this.f22246a, "click", ((VideoModel) this.b).animation, this.c, this.b, new l.b() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$3UOv03lb-Hizsqq4n2SZ2I96pI0
                @Override // com.taobao.tbpoplayer.nativerender.l.b
                public final void onAnimationEnd() {
                    h.m1462lambda$3UOv03lbHizsqq4n2SZ2I96pI0(h.this);
                }
            });
        }
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f22246a.a(this.b, "click", ((VideoModel) this.b).action, ((VideoModel) this.b).actions);
        }
    }

    public /* synthetic */ boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        this.f22246a.a(this.b, "longClick", ((VideoModel) this.b).action, ((VideoModel) this.b).actions);
        return true;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        com.alibaba.poplayer.utils.c.a("PopVideoComponent.onDisplayed", new Object[0]);
        com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$h$fqhKuLit5emOgI0GsRxZdFS8ptE
            {
                h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h.lambda$fqhKuLit5emOgI0GsRxZdFS8ptE(h.this);
            }
        });
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            this.e.a();
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.start", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.start.error", th);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.setClickArea.notReady.width=" + width + ".height=" + height, new Object[0]);
        } else if (!this.h) {
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.setClickArea.mFirstFramePlayed=false", new Object[0]);
        } else {
            int[] a2 = a(view, PopLayerNativeView.class);
            if (a2 != null) {
                Rect rect = new Rect();
                rect.left = a2[0];
                rect.top = a2[1];
                rect.right = rect.left + width;
                rect.bottom = rect.top + height;
                this.f22246a.a(rect);
            }
            com.alibaba.poplayer.utils.c.a("PopVideoComponent.setClickArea.width=" + width + ".height=" + height, new Object[0]);
        }
    }

    private int[] a(View view, Class<?> cls) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("81692e31", new Object[]{this, view, cls});
        }
        ViewParent parent = view.getParent();
        int i = 0;
        int i2 = 0;
        while (true) {
            z = parent instanceof View;
            if (!z || parent.getClass() == cls) {
                break;
            }
            View view2 = (View) parent;
            i += view2.getLeft();
            i2 += view2.getTop();
            parent = view2.getParent();
        }
        if (z) {
            return new int[]{i, i2};
        }
        return null;
    }
}
