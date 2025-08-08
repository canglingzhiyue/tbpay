package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.List;
import tb.bxp;
import tb.kel;
import tb.kge;
import tb.ldf;
import tb.ldk;
import tb.lfq;
import tb.ljh;
import tb.llb;
import tb.tiq;

/* loaded from: classes7.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOANIMATIONLAYOUT_HVIDEOANIMATIONLAYOUT = -4838666398042957198L;

    /* renamed from: a  reason: collision with root package name */
    public View f17549a;
    private int b;
    private AnimatorSet c;
    private AnimatorSet d;
    private ValueAnimator.AnimatorUpdateListener e;
    private ValueAnimator f;
    private AnimatorListenerAdapter g;
    private boolean i;
    private HVideoAnimationView j;
    private boolean k;
    private IMainLifecycleService l;
    private llb m;
    private int n;
    private boolean o;
    private int h = 0;
    private final Handler p = new Handler(Looper.getMainLooper()) { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            ldf.d("VideoAnimationLayoutWidgetNode", "视频播放超时:");
            ldk.a(d.VIDEO_ANIMATION, "videoPlayFail", "", d.VIDEO_ANIMATION_BIZ_NAME, "playTimeOut", null);
            a.l(a.this);
        }
    };
    private final ITopViewService.a q = new ITopViewService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            a aVar = a.this;
            if (!StringUtils.equals(tiq.BIZ_CODE, str)) {
                i = 1;
            }
            a.a(aVar, i);
            ldf.d("VideoAnimationLayoutWidgetNode", "onTopViewShow:onTopViewShow " + a.c(a.this));
        }

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            ldf.d("VideoAnimationLayoutWidgetNode", "onTopViewShow:onTopViewClose ");
            if (a.c(a.this) != 1 || a.i(a.this) == null) {
                return;
            }
            ldf.d("VideoAnimationLayoutWidgetNode", "onTopViewShow:闪屏结束开始播放 ");
            a aVar = a.this;
            a.b(aVar, a.i(aVar));
        }
    };

    static {
        kge.a(389902950);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc55c719", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.h = i;
        return i;
    }

    public static /* synthetic */ View a(a aVar, List list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("478292fa", new Object[]{aVar, list, str}) : aVar.a(list, str);
    }

    public static /* synthetic */ HVideoAnimationView a(a aVar, HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HVideoAnimationView) ipChange.ipc$dispatch("24f8f239", new Object[]{aVar, hVideoAnimationView});
        }
        aVar.j = hVideoAnimationView;
        return hVideoAnimationView;
    }

    public static /* synthetic */ c a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ebba35d4", new Object[]{aVar, view}) : aVar.a(view);
    }

    public static /* synthetic */ void a(a aVar, View view, View view2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfe68d0", new Object[]{aVar, view, view2, cVar});
        } else {
            aVar.a(view, view2, cVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("516e1b81", new Object[]{aVar})).booleanValue() : aVar.o;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc5606fb", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.k = z;
        return z;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31e77171", new Object[]{aVar})).intValue() : aVar.l();
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b073138", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.b = i;
        return i;
    }

    public static /* synthetic */ void b(a aVar, HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49dee2de", new Object[]{aVar, hVideoAnimationView});
        } else {
            aVar.a(hVideoAnimationView);
        }
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b07711a", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.o = z;
        return z;
    }

    public static /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1260c772", new Object[]{aVar})).intValue() : aVar.h;
    }

    public static /* synthetic */ void c(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b89b64", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.a(i);
        }
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2da1d80", new Object[]{aVar});
        } else {
            aVar.k();
        }
    }

    public static /* synthetic */ IVideoCardAnimationService e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoCardAnimationService) ipChange.ipc$dispatch("6eb433f2", new Object[]{aVar}) : aVar.i();
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3ccc986", new Object[]{aVar})).booleanValue() : aVar.k;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461f83", new Object[]{aVar});
        } else {
            aVar.j();
        }
    }

    public static /* synthetic */ int h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74bf7577", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static /* synthetic */ HVideoAnimationView i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HVideoAnimationView) ipChange.ipc$dispatch("f1317c51", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b22186", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ Handler k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("91c6e3df", new Object[]{aVar}) : aVar.p;
    }

    public static /* synthetic */ void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a4cd88", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71e2389", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    /* renamed from: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0671a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(597066557);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure:START:");
        ITopViewService iTopViewService = (ITopViewService) lfq.a(getDXRuntimeContext()).a(ITopViewService.class);
        if (iTopViewService != null) {
            iTopViewService.removeTopViewShowListener(this.q);
            iTopViewService.addTopViewShowListener(this.q);
        }
        int size = View.MeasureSpec.getSize(i);
        IVideoCardAnimationService i3 = i();
        if (i3 == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (!this.o && !i3.isMeasureSuccess()) {
            ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure:record originalHeightMeasureSpec");
            this.n = i2;
        }
        if (this.o) {
            ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure: 触发结束，恢复:");
            super.onMeasure(i, this.n);
        } else if (!i3.enableShow()) {
            super.onMeasure(i, i2);
            ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure:不满足展示条件");
        } else {
            float aspectRatio = i3.getAspectRatio();
            int i4 = (int) (size / aspectRatio);
            ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure，重置高度aspectRatio：" + aspectRatio + ",measureWidth:" + size + ",height:" + i4);
            if (i4 >= size) {
                super.onMeasure(i, i2);
                ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure:高度异常");
                return;
            }
            this.k = true;
            i3.setMeasureState(true);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            ldf.d("VideoAnimationLayoutWidgetNode", "onMeasure:高度设置成功:" + makeMeasureSpec);
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        view.post(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:START:");
                if (a.a(a.this)) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:isRevertHeight");
                    return;
                }
                a aVar = a.this;
                a.a(aVar, a.b(aVar));
                if (a.c(a.this) == 2) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:联动闪屏不展示:");
                    a.d(a.this);
                    return;
                }
                List<DXWidgetNode> children = a.this.getChildren();
                a aVar2 = a.this;
                aVar2.f17549a = a.a(aVar2, children, "card");
                if (a.this.f17549a == null) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:insertCardView null:");
                    return;
                }
                a aVar3 = a.this;
                a.b(aVar3, aVar3.f17549a.getHeight());
                View a2 = a.a(a.this, children, "videoCard");
                if (!(a2 instanceof HVideoAnimationView)) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "createInsertCardAnimation:not HVideoAnimationView:");
                    a.d(a.this);
                    return;
                }
                a.a(a.this, (HVideoAnimationView) a2);
                IVideoCardAnimationService e = a.e(a.this);
                if (e == null || !e.enableShow()) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:不满足展示条件:");
                    if (e == null || !e.isMeasureSuccess()) {
                        return;
                    }
                    ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView: 重置高度:");
                    a.d(a.this);
                } else if (!a.f(a.this)) {
                    a.a(a.this, true);
                    a.g(a.this);
                } else {
                    a aVar4 = a.this;
                    a.b(aVar4, a.h(aVar4) + 12);
                    a aVar5 = a.this;
                    c a3 = a.a(aVar5, aVar5.f17549a);
                    a aVar6 = a.this;
                    a.a(aVar6, a.i(aVar6), view, a3);
                }
            }
        });
    }

    private c a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bc9817f", new Object[]{this, view});
        }
        this.c = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        this.c.playTogether(ofFloat, ofFloat2);
        this.g = b(view);
        this.c.addListener(this.g);
        return a();
    }

    private AnimatorListenerAdapter b(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorListenerAdapter) ipChange.ipc$dispatch("26bf0811", new Object[]{this, view}) : new AnimatorListenerAdapter() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                } else if (hashCode != -1868320925) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onAnimationCancel((Animator) objArr[0]);
                    return null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                view2.setScaleX(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                super.onAnimationCancel(animator);
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                view2.setScaleX(1.0f);
            }
        };
    }

    private void a(View view, View view2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa630fb", new Object[]{this, view, view2, cVar});
            return;
        }
        this.d = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        this.f = ValueAnimator.ofInt(view2.getHeight(), this.b);
        this.f.setDuration(300L);
        this.d.playTogether(ofFloat, this.f);
        HVideoAnimationView hVideoAnimationView = (HVideoAnimationView) view;
        hVideoAnimationView.clearVideoStateListener();
        hVideoAnimationView.addVideoStateListener(a());
        hVideoAnimationView.addVideoStateListener(cVar);
        this.e = c(view);
        this.f.addUpdateListener(this.e);
        if (this.h != 0) {
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "createInsertCardAnimation:无闪屏直接播放:");
        a(this.j);
    }

    private ValueAnimator.AnimatorUpdateListener c(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("9e622722", new Object[]{this, view}) : new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int parseInt = Integer.parseInt(valueAnimator.getAnimatedValue().toString());
                if (parseInt != a.h(a.this)) {
                    a.c(a.this, parseInt);
                    return;
                }
                view.setVisibility(8);
                a.b(a.this, true);
                a.c(a.this, -2);
                a.g(a.this);
            }
        };
    }

    private c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4838fdc1", new Object[]{this}) : new c() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a.j(a.this);
                ldf.d("VideoAnimationLayoutWidgetNode", "onStatusChanged onStart:");
                a.k(a.this).removeCallbacksAndMessages(null);
            }

            @Override // com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.c
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                ldf.d("VideoAnimationLayoutWidgetNode", "onStatusChanged onComplete:");
                a.k(a.this).removeCallbacksAndMessages(null);
                a.l(a.this);
            }

            @Override // com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.c
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                } else {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onStatusChanged onPlayError:");
                }
            }

            @Override // com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.c
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                ldf.d("VideoAnimationLayoutWidgetNode", "onStatusChanged onPause:");
                a.k(a.this).removeCallbacksAndMessages(null);
                a.m(a.this);
                a.d(a.this);
            }

            @Override // com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.c
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                } else {
                    ldf.d("VideoAnimationLayoutWidgetNode", "onStatusChanged onStop:");
                }
            }
        };
    }

    private View a(List<DXWidgetNode> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("94d9d465", new Object[]{this, list, str});
        }
        View view = null;
        for (DXWidgetNode dXWidgetNode : list) {
            if (dXWidgetNode == null) {
                ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:node null:");
            } else if (!StringUtils.equals(dXWidgetNode.getUserId(), str)) {
                continue;
            } else {
                DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
                if (dXRuntimeContext == null) {
                    ldf.d("VideoAnimationLayoutWidgetNode", "createVideoCardAnimation:dxRuntimeContext null:");
                    return null;
                }
                view = dXRuntimeContext.v();
            }
        }
        return view;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null && !animatorSet.isRunning()) {
            this.c.start();
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 == null || animatorSet2.isRunning()) {
            return;
        }
        this.d.start();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h();
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null && animatorSet.isRunning()) {
            ldf.d("VideoAnimationLayoutWidgetNode", "stopAnimation zoomOutAnimatorSet cancel:");
            this.c.cancel();
            if (this.g != null) {
                ldf.d("VideoAnimationLayoutWidgetNode", "stopAnimation zoomOutAnimatorSet removeListener:");
                this.c.removeListener(this.g);
            }
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            ldf.d("VideoAnimationLayoutWidgetNode", "stopAnimation scaleAnimatorSet cancel:");
            this.d.cancel();
        }
        if (this.f == null || this.e == null) {
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "stopAnimation mScaleAnimator removeUpdateListener:");
        this.f.removeUpdateListener(this.e);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.l != null) {
            ldf.d("VideoAnimationLayoutWidgetNode", "registerLifecycle mLifecycleService 已存在:");
        } else {
            this.l = (IMainLifecycleService) lfq.a(getDXRuntimeContext()).a(IMainLifecycleService.class);
            if (this.l == null) {
                return;
            }
            this.m = f();
            ldf.d("VideoAnimationLayoutWidgetNode", "registerLifecycle mLifecycleService 注册");
            this.l.getPageLifeCycleRegister().a(this.m);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.l == null || this.m == null) {
            ldf.d("VideoAnimationLayoutWidgetNode", "unregisterLifecycle mLifecycleService 不存在");
        } else {
            ldf.d("VideoAnimationLayoutWidgetNode", "unregisterLifecycle mLifecycleService 注销");
            this.l.getPageLifeCycleRegister().b(this.m);
        }
    }

    private llb f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("357f9957", new Object[]{this}) : new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                    return;
                }
                ldf.d("VideoAnimationLayoutWidgetNode", "PageLifeCycle onPause");
                a.k(a.this).removeCallbacksAndMessages(null);
                a.m(a.this);
                a.d(a.this);
            }
        };
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.i) {
        } else {
            ldf.d("VideoAnimationLayoutWidgetNode", "notifyViewShown PopCenter  addPopOperation ");
            this.i = true;
            d();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.i) {
        } else {
            this.h = 0;
            this.i = false;
            e();
            ldf.d("VideoAnimationLayoutWidgetNode", "notifyTerminate PopCenter finishPopOperation ");
        }
    }

    private IVideoCardAnimationService i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoCardAnimationService) ipChange.ipc$dispatch("f2f6dc23", new Object[]{this}) : (IVideoCardAnimationService) lfq.a(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "onRenderView:满足展示条件,但高度未设置成功,重刷");
        getDXRuntimeContext().D().a(getDXRuntimeContext().s().getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().a(true).b(true).a(2).a());
    }

    private void a(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69591848", new Object[]{this, hVideoAnimationView});
        } else if (!hVideoAnimationView.playVideo()) {
            k();
            ldf.d("VideoAnimationLayoutWidgetNode", "播放失败");
        } else {
            IVideoCardAnimationService iVideoCardAnimationService = (IVideoCardAnimationService) lfq.a(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
            if (iVideoCardAnimationService == null) {
                k();
                return;
            }
            long timeOut = iVideoCardAnimationService.getTimeOut() * 1000;
            ldf.d("VideoAnimationLayoutWidgetNode", "playVideoAndPostTimeOutMessage time:" + timeOut);
            iVideoCardAnimationService.recordFatigue(iVideoCardAnimationService.getLocalVideoPath());
            this.p.removeCallbacksAndMessages(null);
            this.p.sendEmptyMessageDelayed(1, timeOut);
            ljh.a(iVideoCardAnimationService.getExposureParam(), (JSONObject) null);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXRootView s = getDXRuntimeContext().s();
        if (s == null) {
            ldf.d("VideoAnimationLayoutWidgetNode", "reSetParentHeight rootView null:");
            return;
        }
        ViewParent parent = s.getParent();
        if (!(parent instanceof ViewGroup)) {
            ldf.d("VideoAnimationLayoutWidgetNode", "reSetParentHeight parent view error:" + parent);
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "reSetParentHeight rootView height:" + i);
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.getLayoutParams().height = i;
        viewGroup.requestLayout();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "revertHeight");
        HVideoAnimationView hVideoAnimationView = this.j;
        if (hVideoAnimationView != null) {
            hVideoAnimationView.setVisibility(8);
        }
        this.o = true;
        a(-2);
        j();
    }

    private int l() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        String str = null;
        try {
            str = kel.k();
        } catch (Exception e) {
            ldf.a("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageSceneType error:", e);
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageSceneType:" + str);
        if (StringUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = StringUtils.equals(str, tiq.BIZ_CODE) ? 2 : 1;
        }
        ldf.d("VideoAnimationLayoutWidgetNode", "getBootImageState bootImageState:" + i);
        return i;
    }
}
