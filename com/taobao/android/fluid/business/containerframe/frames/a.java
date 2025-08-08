package com.taobao.android.fluid.business.containerframe.frames;

import android.animation.ValueAnimator;
import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.pti;
import tb.sma;
import tb.snd;
import tb.sni;
import tb.spj;
import tb.spy;

/* loaded from: classes5.dex */
public class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pti f;
    private boolean g;
    private boolean h;
    private View i;

    static {
        kge.a(1120125578);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ View a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("82dc257", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27453df", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab0f934", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d911fd13", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ pti d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pti) ipChange.ipc$dispatch("b7966b0f", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d404d1", new Object[]{aVar});
        } else {
            aVar.n();
        }
    }

    public a(FluidContext fluidContext) {
        super(fluidContext);
        this.g = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r1.equals("prepare") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.fluid.framework.data.datamodel.AlbumData r9, com.taobao.android.fluid.framework.data.datamodel.a.c r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.business.containerframe.frames.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r8
            r1[r4] = r9
            r1[r3] = r10
            java.lang.String r9 = "1e724201"
            r0.ipc$dispatch(r9, r1)
            return
        L18:
            com.taobao.android.fluid.core.FluidContext r0 = r8.f12380a
            java.lang.Class<com.taobao.android.fluid.framework.deprecated.message.IMessageService> r1 = com.taobao.android.fluid.framework.deprecated.message.IMessageService.class
            com.taobao.android.fluid.core.FluidService r0 = r0.getService(r1)
            com.taobao.android.fluid.framework.deprecated.message.IMessageService r0 = (com.taobao.android.fluid.framework.deprecated.message.IMessageService) r0
            tb.sma r0 = r0.getMessageCenter()
            java.lang.String r1 = r9.type
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case -318370553: goto L51;
                case 3202370: goto L47;
                case 3529469: goto L3c;
                case 1935998362: goto L31;
                default: goto L30;
            }
        L30:
            goto L5a
        L31:
            java.lang.String r2 = "updateGraymaskVisible"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r2 = 1
            goto L5b
        L3c:
            java.lang.String r2 = "show"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r2 = 2
            goto L5b
        L47:
            java.lang.String r2 = "hide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r2 = 3
            goto L5b
        L51:
            java.lang.String r7 = "prepare"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L5a
            goto L5b
        L5a:
            r2 = -1
        L5b:
            if (r2 == 0) goto L76
            if (r2 == r4) goto L72
            if (r2 == r3) goto L68
            if (r2 == r5) goto L64
            goto L67
        L64:
            r8.a()
        L67:
            return
        L68:
            r8.a(r10)
            r8.b()
            r8.a(r9, r0, r10)
            return
        L72:
            r8.a(r10)
            return
        L76:
            r8.a(r0)
            tb.pti r9 = r8.f
            java.lang.String r10 = r10.c
            r9.a(r10)
            tb.pti r9 = r8.f
            r9.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.containerframe.frames.a.a(com.taobao.android.fluid.framework.data.datamodel.AlbumData, com.taobao.android.fluid.framework.data.datamodel.a$c):void");
    }

    public void a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a16adc", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.fluid_sdk_album_detail);
            this.c = viewStub.inflate();
            if (this.c instanceof AlbumDetailViewGroup) {
                ((AlbumDetailViewGroup) this.c).setPullRightCallback(new Runnable() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a.a(a.this, "willHide");
                        if (a.a(a.this) == null || a.a(a.this).getVisibility() != 0) {
                            return;
                        }
                        a.this.a();
                    }
                });
            }
            ((ILifecycleService) this.f12380a.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void onResume() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                    } else {
                        a.b(a.this);
                    }
                }

                @Override // tb.snd.a, tb.snd
                public void onPause() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                    } else {
                        a.c(a.this);
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.b
    public void a() {
        sni lockListListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (e()) {
            a("hide");
        }
        super.a();
        k();
        if (c()) {
            ((IBackEventService) this.f12380a.getService(IBackEventService.class)).getBackKeyEventDetector().a(this);
        }
        if (this.b instanceof Activity) {
            SlidingLayout.disableScroll((Activity) this.b, false);
        }
        if (!spj.e(this.f12380a) || (lockListListener = ((ISceneConfigService) this.f12380a.getService(ISceneConfigService.class)).getLockListListener()) == null) {
            return;
        }
        lockListListener.b(false);
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.b
    public void b() {
        sni lockListListener;
        pti ptiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!e()) {
            View view = this.i;
            if (view != null && view.getVisibility() == 0 && (ptiVar = this.f) != null && ptiVar.b() == null) {
                this.f.g();
            }
            a("show");
        }
        super.b();
        k();
        if (c()) {
            ((IBackEventService) this.f12380a.getService(IBackEventService.class)).getBackKeyEventDetector().b(this);
        }
        if (this.b instanceof Activity) {
            SlidingLayout.disableScroll((Activity) this.b, true);
        }
        if (!spj.e(this.f12380a) || (lockListListener = ((ISceneConfigService) this.f12380a.getService(ISceneConfigService.class)).getLockListListener()) == null) {
            return;
        }
        lockListListener.b(true);
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c
    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5eda45", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            if (this.e != null && StringUtils.equals(this.e.c, cVar.c)) {
                return;
            }
            sma messageCenter = ((IMessageService) this.f12380a.getService(IMessageService.class)).getMessageCenter();
            a(messageCenter);
            this.f.a(cVar.c);
            messageCenter.sendMessage(new spy(spy.MSG_UPDATE_ALBUM_DETAIL, cVar.c, cVar.a(this.f12380a)));
            this.e = cVar;
            this.d = false;
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c, tb.plm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!e()) {
        } else {
            a();
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.frames.c, tb.plm
    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        if (e()) {
            a("willHide");
        }
        View view = this.i;
        if (view != null && view.getVisibility() == 0) {
            a();
        }
        return true;
    }

    private void k() {
        pti ptiVar;
        pti ptiVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.g && e()) {
            if (!this.h && (ptiVar2 = this.f) != null) {
                ptiVar2.d();
            }
            this.h = true;
        } else {
            if (this.h && (ptiVar = this.f) != null) {
                ptiVar.e();
            }
            this.h = false;
        }
    }

    private void a(final sma smaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feff5831", new Object[]{this, smaVar});
        } else if (this.f != null) {
        } else {
            this.f = new pti(this.f12380a, (ViewGroup) this.c);
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        smaVar.registerMessageHandler(a.d(a.this));
                    }
                }
            });
            this.f.a(new TNodeView.b() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutCompleted(aa aaVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).setVisibility(8);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
                public void onLayoutError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                    } else {
                        a.e(a.this);
                    }
                }
            });
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.g = true;
        k();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.g = false;
        k();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        IMessageService iMessageService = (IMessageService) this.f12380a.getService(IMessageService.class);
        if (iMessageService == null) {
            return;
        }
        String str2 = this.e != null ? this.e.c : "-1";
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("type", "slideRight");
        iMessageService.sendMessage(new spy("VSMSG_albumDetailStateChanged", str2, hashMap));
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.c == null) {
        } else {
            View view = this.i;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            this.i = ((ViewStub) this.c.findViewById(R.id.album_exception_layout)).inflate();
            this.i.setBackgroundColor(-16777216);
            this.i.findViewById(R.id.v_error_action).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (a.d(a.this) == null) {
                    } else {
                        a.d(a.this).g();
                    }
                }
            });
            this.i.findViewById(R.id.tbvideo_back).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        a.this.a();
                    }
                }
            });
        }
    }

    private void a(AlbumData albumData, sma smaVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2448c18", new Object[]{this, albumData, smaVar, cVar});
            return;
        }
        String str = albumData.albumPosition;
        Map a2 = cVar.a(this.f12380a);
        a2.put(LogContext.NEED_MOVE, albumData.needMove);
        a2.put("albumPosition", str);
        smaVar.sendMessage(new spy(spy.MSG_UPDATE_ALBUM_DETAIL, cVar.c, a2));
        o();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.c == null) {
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.business.containerframe.frames.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
            });
            ofFloat.start();
        }
    }
}
