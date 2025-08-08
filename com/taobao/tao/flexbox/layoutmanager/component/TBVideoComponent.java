package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import com.taobao.tao.flexbox.layoutmanager.view.CustomRoundRectFeature;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.RoundedCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.gwh;
import tb.kge;
import tb.obw;
import tb.ody;
import tb.odz;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogl;
import tb.ogu;
import tb.ogv;
import tb.ogw;
import tb.ohb;
import tb.ohd;
import tb.oid;

/* loaded from: classes8.dex */
public class TBVideoComponent extends Component<RoundedCornerLayout, c> implements com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, ScrollChangeListener, FlatViewGroup.d, FlatViewGroup.e, oid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_MUTE_CHANGE = "onMuteClick";
    public static final String MSG_VIDEOSTATE_CHANGE = "onvideostatechanged";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20054a;
    private static a f;
    private ac d;
    private View j;
    private ObjectAnimator k;
    private String l;
    private Boolean c = null;
    private boolean e = true;
    private boolean g = false;
    private String h = null;
    private boolean i = false;
    public boolean b = false;
    private Runnable m = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TBVideoComponent.a(TBVideoComponent.this) != null && ((c) TBVideoComponent.b(TBVideoComponent.this)).L) {
            } else {
                TBVideoComponent.this.e();
            }
        }
    };
    private Runnable n = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.11
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBVideoComponent.this.e();
            }
        }
    };
    private Runnable o = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.12
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBVideoComponent.a(TBVideoComponent.this, false);
            if (!((c) TBVideoComponent.c(TBVideoComponent.this)).bB) {
                return;
            }
            List<com.taobao.tao.flexbox.layoutmanager.core.aa> a2 = com.taobao.tao.flexbox.layoutmanager.player.c.a().a(TBVideoComponent.d(TBVideoComponent.this), TBVideoComponent.this.n());
            for (int i = 0; i < a2.size(); i++) {
                if (TBVideoComponent.this.f().equals(((TBVideoComponent) a2.get(i).I()).f())) {
                    if (i < a2.size() - 1) {
                        aaVar = a2.get(i + 1);
                    } else {
                        TBVideoComponent.a(TBVideoComponent.this, a2);
                        aaVar = a2.get(0);
                    }
                    ((TBVideoComponent) aaVar.I()).e();
                }
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c p = new c.a<RoundedCornerLayout, c>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, RoundedCornerLayout roundedCornerLayout, c cVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f907f943", new Object[]{this, fVar, roundedCornerLayout, cVar, dVar});
            } else if (TBVideoComponent.l(TBVideoComponent.this) == null || oec.a(cVar.c, ((TNodeImageView) TBVideoComponent.l(TBVideoComponent.this)).getImageSrc())) {
            } else {
                ((TNodeImageView) TBVideoComponent.l(TBVideoComponent.this)).loadImageIfInSlowScroll(TBVideoComponent.m(TBVideoComponent.this));
                ((TNodeImageView) TBVideoComponent.l(TBVideoComponent.this)).setImageSrc(TBVideoComponent.o(TBVideoComponent.this).k(), cVar.c, TBVideoComponent.n(TBVideoComponent.this).f20361a, TBVideoComponent.p(TBVideoComponent.this).b, ImageLoader.a.a(ImageLoader.Scene.VIDEO_COVER, TBVideoComponent.q(TBVideoComponent.this), cVar.by), null, false);
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c q = new c.a<RoundedCornerLayout, c>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, RoundedCornerLayout roundedCornerLayout, c cVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f907f943", new Object[]{this, fVar, roundedCornerLayout, cVar, dVar});
            } else if (cVar.X) {
                TBVideoComponent.a(TBVideoComponent.this, true);
            } else {
                TBVideoComponent.e(TBVideoComponent.this);
            }
        }
    };
    private com.taobao.tao.flexbox.layoutmanager.core.c r = new c.a<RoundedCornerLayout, c>() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, RoundedCornerLayout roundedCornerLayout, c cVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f907f943", new Object[]{this, fVar, roundedCornerLayout, cVar, dVar});
                return;
            }
            TBVideoComponent.a(TBVideoComponent.this, false);
            TBVideoComponent.e(TBVideoComponent.this);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public String[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this}) : new String[]{"videoId", "videoUrl", LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, "liveUrl"};
        }
    };

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f20078a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(-242785786);
        }

        public b(Drawable drawable, int i, String str, String str2) {
            this.f20078a = drawable;
            this.b = i;
            this.c = str;
            this.d = str2;
        }
    }

    public static /* synthetic */ Object ipc$super(TBVideoComponent tBVideoComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1446611556:
                super.bindEvent();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.oid
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.oid
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(RoundedCornerLayout roundedCornerLayout, c cVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, roundedCornerLayout, cVar, map, new Boolean(z)});
        } else {
            a(roundedCornerLayout, cVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$c, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ c mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : d();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.flexbox.layoutmanager.view.RoundedCornerLayout, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ RoundedCornerLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa A(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2a82fb90", new Object[]{tBVideoComponent}) : tBVideoComponent.node;
    }

    public static /* synthetic */ ogl B(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("ade9d145", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void C(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf31822c", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.L();
        }
    }

    public static /* synthetic */ void D(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e2cb", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.M();
        }
    }

    public static /* synthetic */ long a(TBVideoComponent tBVideoComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61e3baa", new Object[]{tBVideoComponent, new Long(j)})).longValue();
        }
        tBVideoComponent.clickTimeStamp = j;
        return j;
    }

    public static /* synthetic */ ogl a(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c6eb22e4", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void a(TBVideoComponent tBVideoComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1083e544", new Object[]{tBVideoComponent, view});
        } else {
            tBVideoComponent.c(view);
        }
    }

    public static /* synthetic */ void a(TBVideoComponent tBVideoComponent, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f405bf", new Object[]{tBVideoComponent, list});
        } else {
            tBVideoComponent.a((List<com.taobao.tao.flexbox.layoutmanager.core.aa>) list);
        }
    }

    public static /* synthetic */ void a(TBVideoComponent tBVideoComponent, odz odzVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698e1e6d", new Object[]{tBVideoComponent, odzVar, str, str2});
        } else {
            tBVideoComponent.a(odzVar, str, str2);
        }
    }

    public static /* synthetic */ void a(TBVideoComponent tBVideoComponent, odz odzVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487fcc1b", new Object[]{tBVideoComponent, odzVar, new Boolean(z)});
        } else {
            tBVideoComponent.a(odzVar, z);
        }
    }

    public static /* synthetic */ void a(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61e77c6", new Object[]{tBVideoComponent, new Boolean(z)});
        } else {
            tBVideoComponent.b(z);
        }
    }

    public static /* synthetic */ ogl b(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c7b9a165", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ boolean b(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("994a2b0b", new Object[]{tBVideoComponent, new Boolean(z)})).booleanValue() : tBVideoComponent.e(z);
    }

    public static /* synthetic */ ogl c(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c8881fe6", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ boolean c(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c75de4c", new Object[]{tBVideoComponent, new Boolean(z)})).booleanValue();
        }
        tBVideoComponent.g = z;
        return z;
    }

    public static /* synthetic */ Component d(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("67a6bf26", new Object[]{tBVideoComponent}) : tBVideoComponent.F();
    }

    public static /* synthetic */ void e(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe574a", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.w();
        }
    }

    public static /* synthetic */ String f(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c86ebd7", new Object[]{tBVideoComponent}) : tBVideoComponent.l;
    }

    public static /* synthetic */ String g(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0dfd18", new Object[]{tBVideoComponent}) : tBVideoComponent.r();
    }

    public static /* synthetic */ ogl h(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("cc90986b", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ boolean i(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("407fd9ca", new Object[]{tBVideoComponent})).booleanValue() : tBVideoComponent.K();
    }

    public static /* synthetic */ ogl j(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("ce2d956d", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ ogl k(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("cefc13ee", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ View l(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cf31125", new Object[]{tBVideoComponent}) : tBVideoComponent.j;
    }

    public static /* synthetic */ boolean m(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24015c46", new Object[]{tBVideoComponent})).booleanValue() : tBVideoComponent.G();
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r n(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("58f2e367", new Object[]{tBVideoComponent}) : tBVideoComponent.measureResult;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa o(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("7ee5e43e", new Object[]{tBVideoComponent}) : tBVideoComponent.node;
    }

    public static /* synthetic */ a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7c6c5140", new Object[0]) : f;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.r p(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.r) ipChange.ipc$dispatch("d0453fa5", new Object[]{tBVideoComponent}) : tBVideoComponent.measureResult;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa q(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("f1df0fc0", new Object[]{tBVideoComponent}) : tBVideoComponent.node;
    }

    public static /* synthetic */ ogl r(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d4a18975", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ long s(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79439ff0", new Object[]{tBVideoComponent})).longValue() : tBVideoComponent.clickTimeStamp;
    }

    public static /* synthetic */ ogl t(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d63e8677", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ View u(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8226defc", new Object[]{tBVideoComponent}) : tBVideoComponent.view;
    }

    public static /* synthetic */ View v(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e481f5db", new Object[]{tBVideoComponent}) : tBVideoComponent.view;
    }

    public static /* synthetic */ View w(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("46dd0cba", new Object[]{tBVideoComponent}) : tBVideoComponent.view;
    }

    public static /* synthetic */ ogl x(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d978807b", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa y(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("bdc3bdc8", new Object[]{tBVideoComponent}) : tBVideoComponent.node;
    }

    public static /* synthetic */ ogl z(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("db157d7d", new Object[]{tBVideoComponent}) : tBVideoComponent.viewParams;
    }

    static {
        kge.a(-1173849173);
        kge.a(-1420926486);
        kge.a(771458270);
        kge.a(328095190);
        kge.a(727465342);
        kge.a(-894641085);
        kge.a(1891838068);
        f20054a = true;
        f = new a();
    }

    private void a(List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((TBVideoComponent) list.get(i).I()).b = false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.e
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (view != this.view) {
        } else {
            boolean z2 = this.e;
            if (i != 0) {
                z = false;
            }
            if (z2 == z) {
                return;
            }
            if (z) {
                w();
            } else {
                b(false);
            }
            this.e = z;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.d
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean z2 = i3 <= 0 || i4 <= 0;
        if (i > 0 && i2 > 0) {
            z = false;
        }
        if (z2 == z) {
            return;
        }
        if (z) {
            b(false);
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBVideoComponent.e(TBVideoComponent.this);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.g.c r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.taobao.tao.flexbox.layoutmanager.ac.g.d r11) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L25
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r7
            r1[r6] = r8
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r8 = "f67261c"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L25:
            P extends tb.ogl r0 = r7.viewParams
            com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$c r0 = (com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.c) r0
            boolean r0 = r0.L
            if (r0 == 0) goto La8
            r0 = -1
            int r1 = r9.hashCode()
            switch(r1) {
                case -200636813: goto L62;
                case 542719893: goto L57;
                case 2095646874: goto L4c;
                case 2095727029: goto L41;
                case 2095824515: goto L36;
                default: goto L35;
            }
        L35:
            goto L6c
        L36:
            java.lang.String r1 = "playerStop"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6c
            r0 = 1
            goto L6c
        L41:
            java.lang.String r1 = "playerPlay"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6c
            r0 = 0
            goto L6c
        L4c:
            java.lang.String r1 = "playerMute"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6c
            r0 = 3
            goto L6c
        L57:
            java.lang.String r1 = "playerPause"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6c
            r0 = 2
            goto L6c
        L62:
            java.lang.String r1 = "playerUnmute"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6c
            r0 = 4
        L6c:
            if (r0 == 0) goto L97
            if (r0 == r6) goto L93
            if (r0 == r4) goto L8f
            if (r0 == r3) goto L83
            if (r0 == r2) goto L77
            goto La8
        L77:
            com.taobao.tao.flexbox.layoutmanager.player.c r0 = com.taobao.tao.flexbox.layoutmanager.player.c.a()
            java.lang.String r1 = r7.f()
            r0.c(r5, r1)
            goto La9
        L83:
            com.taobao.tao.flexbox.layoutmanager.player.c r0 = com.taobao.tao.flexbox.layoutmanager.player.c.a()
            java.lang.String r1 = r7.f()
            r0.c(r6, r1)
            goto La9
        L8f:
            r7.z()
            goto La9
        L93:
            r7.c(r5)
            goto La9
        L97:
            com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$a r0 = com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.f
            java.lang.Runnable r1 = r7.n
            r0.a(r1)
            com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$a r0 = com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.f
            java.lang.Runnable r1 = r7.n
            r2 = 0
            r0.a(r1, r2)
            goto La9
        La8:
            r6 = 0
        La9:
            if (r6 != 0) goto Laf
            boolean r6 = super.invoke(r8, r9, r10, r11)
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.g$c, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.g$d):boolean");
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Handler f20076a;
        private int b;

        static {
            kge.a(-155501880);
        }

        private a() {
            this.f20076a = new HandlerC0839a(Looper.getMainLooper());
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6fd164", new Object[]{aVar})).intValue();
            }
            int i = aVar.b;
            aVar.b = i - 1;
            return i;
        }

        public static /* synthetic */ void a(a aVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42975c62", new Object[]{aVar, list});
            } else {
                aVar.b(list);
            }
        }

        public static /* synthetic */ void b(a aVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4f27341", new Object[]{aVar, list});
            } else {
                aVar.a((List<com.taobao.tao.flexbox.layoutmanager.core.aa>) list);
            }
        }

        /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public class HandlerC0839a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(-989736702);
            }

            public static /* synthetic */ Object ipc$super(HandlerC0839a handlerC0839a, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            public HandlerC0839a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                super.dispatchMessage(message);
                a.a(a.this);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                if (message.what == 1) {
                    try {
                        boolean z2 = message.arg1 > 0;
                        if (message.arg2 <= 0) {
                            z = false;
                        }
                        Component component = (Component) message.obj;
                        if (component != null && component.getNode() != null) {
                            component.getNode().a(R.id.layout_manager_list_first_check_visible, (Object) false);
                        }
                        List<com.taobao.tao.flexbox.layoutmanager.core.aa> a2 = com.taobao.tao.flexbox.layoutmanager.player.c.a().a(component, z);
                        if (!ogv.b(a2)) {
                            return;
                        }
                        if (z) {
                            if (z2) {
                                a.a(a.this, a2);
                            } else {
                                a.b(a.this, a2);
                            }
                        }
                        com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().a(component, a2, z);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private void a(List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            int min = Math.min(list.size(), com.taobao.tao.flexbox.layoutmanager.player.c.f20466a);
            for (int i = 0; i < min; i++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = list.get(i);
                if (aaVar != null) {
                    TBVideoComponent tBVideoComponent = (TBVideoComponent) aaVar.I();
                    if (com.taobao.tao.flexbox.layoutmanager.player.c.a().e() || (TBVideoComponent.b(tBVideoComponent, false) && !com.taobao.tao.flexbox.layoutmanager.player.c.a().d(tBVideoComponent.f()))) {
                        ((TBVideoComponent) aaVar.I()).e();
                    }
                }
            }
        }

        private void b(List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
                return;
            }
            int size = list.size();
            int i = com.taobao.tao.flexbox.layoutmanager.player.c.f20466a;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = list.get(i3);
                if (aaVar != null) {
                    TBVideoComponent tBVideoComponent = (TBVideoComponent) aaVar.I();
                    if (!com.taobao.tao.flexbox.layoutmanager.player.c.a().d(tBVideoComponent.f())) {
                        if (com.taobao.tao.flexbox.layoutmanager.player.c.a().e() && !tBVideoComponent.b && TBVideoComponent.b(tBVideoComponent, false)) {
                            tBVideoComponent.e();
                            if (tBVideoComponent.f().equals(((TBVideoComponent) list.get(size - 1).I()).f())) {
                                for (int i4 = 0; i4 < size; i4++) {
                                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = list.get(i4);
                                    if (aaVar2 != null) {
                                        ((TBVideoComponent) aaVar2.I()).b = false;
                                    }
                                }
                            }
                            i2++;
                        } else if (i2 == i && i3 >= i2 && tBVideoComponent.b) {
                            tBVideoComponent.b = false;
                        }
                    }
                }
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b > com.taobao.tao.flexbox.layoutmanager.player.c.f20466a - 1;
        }

        public void a(Runnable runnable, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
                return;
            }
            this.b++;
            this.f20076a.postDelayed(runnable, j);
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            this.f20076a.removeCallbacksAndMessages(obj);
            if (obj == null) {
                this.b = 0;
            } else {
                this.b--;
            }
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (!this.f20076a.hasCallbacks(runnable)) {
            } else {
                this.f20076a.removeCallbacks(runnable);
                this.b--;
            }
        }

        public void a(int i, Object obj, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b74c8157", new Object[]{this, new Integer(i), obj, new Integer(i2), new Integer(i3)});
                return;
            }
            Message obtain = Message.obtain(this.f20076a, i, obj);
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            this.f20076a.sendMessage(obtain);
            this.b++;
        }

        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            } else if (!this.f20076a.hasMessages(i, obj)) {
            } else {
                this.f20076a.removeMessages(i, obj);
                this.b--;
            }
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.g) {
        } else {
            this.g = true;
            a(new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                    } else {
                        TBVideoComponent.c(TBVideoComponent.this, true);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoadFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                    } else {
                        TBVideoComponent.c(TBVideoComponent.this, false);
                    }
                }
            });
        }
    }

    private String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : (String) this.node.e("firstFrameUrl");
    }

    private void a(final ImageLoader.c cVar) {
        ImageLoader.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7c878", new Object[]{this, cVar});
            return;
        }
        String r = r();
        if (StringUtils.isEmpty(r)) {
            return;
        }
        if (oeb.aa()) {
            ImageLoader.a a2 = ImageLoader.a.a(0, ImageAdapter.IMAGE_QUALITY_Q90, "", "", com.taobao.tao.flexbox.layoutmanager.player.c.image_test_biz_name, 9103, ImageLoader.Scene.FIRST_FRAME);
            this.l = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(r, 1200, 1200, a2);
            bVar = new ImageLoader.b(null, this.node.N(), r, this.l, 1200, 1200, a2, false);
        } else {
            bVar = new ImageLoader.b(null, this.node.N(), r, r, -1, -1, ImageLoader.a.a(ImageLoader.Scene.FIRST_FRAME, this.node), false);
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(bVar, false, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                } else {
                    cVar.onImageLoaded(bitmapDrawable);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoadFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                } else {
                    cVar.onImageLoadFailed();
                }
            }
        });
    }

    private void c(View view) {
        String str;
        VideoView videoView;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (this.view == 0 || this.viewParams == 0 || ((c) this.viewParams).M) {
        } else {
            if (!((c) this.viewParams).aO_()) {
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().c();
                final odz odzVar = new odz();
                a(new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.16
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                            return;
                        }
                        if (oeb.bg()) {
                            if (StringUtils.isEmpty(TBVideoComponent.f(TBVideoComponent.this))) {
                                odzVar.b(TBVideoComponent.g(TBVideoComponent.this));
                            } else {
                                odzVar.b(TBVideoComponent.f(TBVideoComponent.this));
                            }
                        } else {
                            odzVar.b(bitmapDrawable);
                        }
                        ogg.d("AVSDK_TBVideoComponentSharePlayer", "下载首帧");
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                    public void onImageLoadFailed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                        } else {
                            ogg.d("AVSDK_TBVideoComponentSharePlayer", "下载首帧失败");
                        }
                    }
                });
                boolean z = !com.taobao.tao.flexbox.layoutmanager.player.c.a().e(f());
                ogg.d("AVSDK_TBVideoComponentSharePlayer", "preChangeAspectRatio:" + ((c) this.viewParams).Y);
                if ((com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.c((c) this.viewParams) || z) && J()) {
                    ogg.d("AVSDK_TBVideoComponentSharePlayer", "视频未播起来");
                    final boolean J = J();
                    final String r = r();
                    com.taobao.tao.flexbox.layoutmanager.player.c.a().a(new c.InterfaceC0852c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.17
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.player.c.InterfaceC0852c
                        public void a(bl blVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("17400287", new Object[]{this, blVar});
                            } else if (blVar == null || !J) {
                            } else {
                                c cVar = (c) TBVideoComponent.h(TBVideoComponent.this);
                                if (TBVideoComponent.this.a(cVar)) {
                                    odzVar.b(TBVideoComponent.i(TBVideoComponent.this));
                                } else {
                                    odzVar.b(cVar.q);
                                }
                                odzVar.c(TBVideoComponent.this.f());
                                odzVar.c(true);
                                odzVar.a(blVar);
                                odzVar.c(TBVideoComponent.this.f());
                                odzVar.a(true);
                                if (com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a((c) TBVideoComponent.j(TBVideoComponent.this))) {
                                    TBVideoComponent.a(TBVideoComponent.this, odzVar, true);
                                }
                                TBVideoComponent tBVideoComponent = TBVideoComponent.this;
                                TBVideoComponent.a(tBVideoComponent, odzVar, r, ((c) TBVideoComponent.k(tBVideoComponent)).E);
                                ogg.d("AVSDK_TBVideoComponentSharePlayer", "视频创建好dw实例，未起播视频 给coverObject赋值");
                            }
                        }

                        @Override // com.taobao.tao.flexbox.layoutmanager.player.c.InterfaceC0852c
                        public void a(boolean z2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                                return;
                            }
                            ogg.d("AVSDK_TBVideoComponentSharePlayer", "firstFrameRender 双列流首帧是否渲染完成：isRender：" + z2);
                            odzVar.d(z2);
                        }
                    });
                    f.a(this.m);
                    f.a(this.m, 0L);
                }
                b a2 = a(false);
                if (a2 != null && a2.f20078a != null) {
                    ogg.d("AVSDK_TBVideoComponentSharePlayer", "videoSnapshot != null && videoSnapshot.drawable != null coverObject有值");
                    boolean J2 = J();
                    odzVar.a(a2.f20078a);
                    odzVar.c(a2.b);
                    odzVar.a(a2.c);
                    a(odzVar);
                    if ((this.node.N() instanceof Activity) && (findViewById = ((Activity) this.node.N()).getWindow().getDecorView().findViewById(16908290)) != null) {
                        odzVar.d(findViewById.getHeight());
                    }
                    if ((k() instanceof VideoView) && !com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.c((c) this.viewParams) && (videoView = (VideoView) k()) != null) {
                        ogg.d("AVSDK_TBVideoComponentSharePlayer", "VideoView dwInstance");
                        odzVar.a(videoView.getDwInstance());
                    }
                    ((RoundedCornerLayout) this.view).getLocationOnScreen(odzVar.f31966a);
                    str = "snapshot" + a2.hashCode();
                    this.h = str;
                    ody.a().a(str, odzVar);
                    if (J2) {
                        c cVar = (c) this.viewParams;
                        if (a(cVar)) {
                            odzVar.b(K());
                        } else {
                            odzVar.b(cVar.q);
                        }
                        odzVar.c(f());
                        odzVar.c(true);
                        if (com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a((c) this.viewParams)) {
                            odzVar.d(((c) this.viewParams).F);
                            a(odzVar, false);
                        } else {
                            odzVar.d(((c) this.viewParams).E);
                        }
                        com.taobao.tao.flexbox.layoutmanager.player.b.a().a(str, odzVar);
                        this.i = true;
                    }
                    ogg.d("AVSDK_TBVideoComponentSharePlayer", "双列流点击设置，view宽：" + ((RoundedCornerLayout) this.view).getWidth() + ",view高:" + ((RoundedCornerLayout) this.view).getHeight() + ",视频宽 :" + ((c) this.viewParams).g + ",视频高：" + ((c) this.viewParams).h);
                } else {
                    ogg.d("AVSDK_TBVideoComponentSharePlayer", "videoSnapshot == null && videoSnapshot.drawable == null coverObject为null");
                    str = null;
                }
                if (oeb.bc() && com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.b.containsKey(((c) this.viewParams).D)) {
                    if (com.taobao.tao.flexbox.layoutmanager.player.c.a().i() != null) {
                        odzVar.a((JSONObject) getTNode().D());
                        odzVar.a(com.taobao.tao.flexbox.layoutmanager.player.c.a().i());
                    }
                    odzVar.f(true);
                }
            } else {
                str = null;
            }
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put(FullPage.PRE_PLAYER_MAP_KEY, str);
            }
            String a3 = oec.a(this.node.e("onclick"), (String) null);
            if (a3 != null) {
                if (this.node.e("trackinfo") != null) {
                    sendMessage(getNode(), "click", null, null, null);
                }
                sendMessage(this.node, "onclick", a3, hashMap, com.taobao.tao.flexbox.layoutmanager.event.c.a().b());
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa t = t();
            if (t == null) {
                return;
            }
            if (t.e("trackinfo") != null) {
                sendMessage(t, "click", null, null, null);
            }
            String a4 = oec.a(t.e("onclick"), (String) null);
            if (a4 == null) {
                return;
            }
            sendMessage(t, "onclick", a4, hashMap, com.taobao.tao.flexbox.layoutmanager.event.c.a().b());
        }
    }

    private void a(odz odzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b87f73", new Object[]{this, odzVar});
        } else if (((c) this.viewParams).Y && s()) {
            odzVar.a(((c) this.viewParams).h);
            odzVar.b(((c) this.viewParams).g);
            odzVar.e(true);
            ogg.b("AVSDK_TBVideoComponentSharePlayer，手动旋转");
        } else {
            odzVar.a(((RoundedCornerLayout) this.view).getWidth());
            odzVar.b(((RoundedCornerLayout) this.view).getHeight());
            odzVar.e(false);
            ogg.b("AVSDK_TBVideoComponentSharePlayer，无需旋转");
        }
    }

    private boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        if (((RoundedCornerLayout) this.view).getWidth() > ((RoundedCornerLayout) this.view).getHeight() && ((c) this.viewParams).g > ((c) this.viewParams).h) {
            return false;
        }
        return ((RoundedCornerLayout) this.view).getWidth() >= ((RoundedCornerLayout) this.view).getHeight() || ((c) this.viewParams).g >= ((c) this.viewParams).h;
    }

    private void a(odz odzVar, boolean z) {
        c.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5821c1", new Object[]{this, odzVar, new Boolean(z)});
        } else if ((!com.taobao.tao.flexbox.layoutmanager.player.c.a().e(f()) && !z) || (bVar = com.taobao.tao.flexbox.layoutmanager.player.c.a().b().get(f())) == null || !(bVar.f20469a instanceof com.taobao.tao.flexbox.layoutmanager.player.d) || ((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).j == null) {
        } else {
            odzVar.e(((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).j.toString());
        }
    }

    public boolean a(c cVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c70ba33", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar.C == null || cVar.B == null) {
            z = false;
            z2 = false;
        } else {
            z2 = cVar.C instanceof String ? !StringUtils.isEmpty((String) cVar.C) : true;
            z = cVar.B instanceof String ? !StringUtils.isEmpty((String) cVar.B) : true;
        }
        return z2 && z;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.h;
    }

    private void a(final odz odzVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26c3707", new Object[]{this, odzVar, str, str2});
        } else if (!StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            try {
                final String string = new org.json.JSONObject(str2).getString("coverUrl");
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(this.node.N(), string, -1, -1, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                    public void onImageLoadFailed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                            return;
                        }
                        odzVar.b(bitmapDrawable);
                        ogg.d("AVSDK_TBVideoComponentSharePlayer", "coverImageForNoPlayVideo，coverImageUrl为null，resourceStr不为null，设置首帧,coverUrl:" + string);
                    }
                });
            } catch (Throwable unused) {
                ogg.a(obw.VIDEO_ACTION_TYPE_SHAREPLAYER, "sharePlayerForFollow json 解析异常");
            }
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ec9202a3", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node;
        do {
            aaVar = aaVar.J();
            if (aaVar == null) {
                return null;
            }
        } while (aaVar.e("onclick") == null);
        return aaVar;
    }

    private View u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e53fb3be", new Object[]{this});
        }
        View x = x();
        if (H()) {
            q();
        }
        ((RoundedCornerLayout) this.view).addView(x, new FrameLayout.LayoutParams(-1, -1));
        return x;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if ("cover".equals(str)) {
            return this.p;
        }
        if ("forceInvisible".equals(str)) {
            return this.q;
        }
        if ("videoId".equals(str) || "videoUrl".equals(str) || LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID.equals(str) || "liveUrl".equals(str)) {
            return this.r;
        }
        return super.getAttributeHandler(str);
    }

    public void a(RoundedCornerLayout roundedCornerLayout, c cVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626026f8", new Object[]{this, roundedCornerLayout, cVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(roundedCornerLayout, cVar, map, z);
        if (((RoundedCornerLayout) this.view).getChildCount() != 0) {
            return;
        }
        this.j = u();
        b(false);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
            return;
        }
        super.bindEvent();
        View.OnClickListener onClickListener = this.clickListener;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if ((((c) TBVideoComponent.r(TBVideoComponent.this)).bb > 0 && currentTimeMillis - TBVideoComponent.s(TBVideoComponent.this) < ((c) TBVideoComponent.t(TBVideoComponent.this)).bb) || !com.taobao.tao.flexbox.layoutmanager.event.c.a().a(TBVideoComponent.this.getNode())) {
                    return;
                }
                TBVideoComponent.a(TBVideoComponent.this, view);
                TBVideoComponent.a(TBVideoComponent.this, currentTimeMillis);
            }
        };
        setComponentClickListener(onClickListener2);
        if (this.touchListener != null || onClickListener == null) {
            return;
        }
        ((RoundedCornerLayout) this.view).setOnClickListener(onClickListener2);
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d65fea72", new Object[]{this}) : new c();
    }

    private boolean v() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        boolean a2 = f.a();
        if ((com.taobao.tao.flexbox.layoutmanager.player.c.a().e() || com.taobao.tao.flexbox.layoutmanager.player.c.a().f() || e(true)) && n() && this.view != 0 && !((c) this.viewParams).X && !g()) {
            z = true;
        }
        if (!z) {
            return z;
        }
        if (!((c) this.viewParams).U || !oeb.bh()) {
            return z & (!a2);
        }
        f.a((Object) null);
        return z;
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (!v()) {
        } else {
            if (com.taobao.tao.flexbox.layoutmanager.player.c.a().b(this.node.N())) {
                com.taobao.tao.flexbox.layoutmanager.player.c.a().b(f());
            } else {
                f.a(this.m);
                f.a(this.m, 0L);
            }
            this.i = false;
        }
    }

    private View x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3d47f81", new Object[]{this});
        }
        PlayerCoverView a2 = gwh.a(this.node.N());
        a2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        a2.setShowAnimation(((c) this.viewParams).T);
        a2.loadImageIfInSlowScroll(G());
        a2.setImageSrc(this.node.k(), ((c) this.viewParams).c, this.measureResult.f20361a, this.measureResult.b, ImageLoader.a.a(ImageLoader.Scene.VIDEO_COVER, this.node, ((c) this.viewParams).by), null, false);
        a2.setImageLoadCallback(new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoadFailed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
            public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                } else if (TBVideoComponent.u(TBVideoComponent.this) == null) {
                } else {
                    TBVideoComponent tBVideoComponent = TBVideoComponent.this;
                    tBVideoComponent.updateAPMToken(TBVideoComponent.v(tBVideoComponent), com.taobao.monitor.procedure.v.APM_VIEW_VALID);
                }
            }
        });
        a2.setPlayIcon(this.node.k(), ((c) this.viewParams).s, ((c) this.viewParams).t, ((c) this.viewParams).u);
        return a2;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.player.c.a().a(new c.d() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.player.c.d
            public void a(c.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f46169d", new Object[]{this, bVar});
                    return;
                }
                TBVideoComponent tBVideoComponent = TBVideoComponent.this;
                tBVideoComponent.updateAPMToken(TBVideoComponent.w(tBVideoComponent), com.taobao.monitor.procedure.v.APM_VIEW_VALID);
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().a(bVar);
            }
        });
        if (((c) this.viewParams).U) {
            this.b = false;
        } else {
            this.b = true;
        }
        if (!com.taobao.tao.flexbox.layoutmanager.player.c.a().a(this, this.node.N(), this.measureResult.f20361a, this.measureResult.b, f(), true, ((c) this.viewParams).o, J(), this.i) || !((c) this.viewParams).aO_() || ((c) this.viewParams).Q == Long.MAX_VALUE || ((c) this.viewParams).Q <= 0) {
            return;
        }
        f.a(this.o);
        f.a(this.o, ((c) this.viewParams).Q);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.viewParams != 0 && ((c) this.viewParams).L) {
        } else {
            d(z);
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            d(z);
        }
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean J = J();
        if (this.i && J) {
            return;
        }
        f.a(this.m);
        if (!com.taobao.tao.flexbox.layoutmanager.player.c.a().d(f())) {
            return;
        }
        f.a((Object) null);
        com.taobao.tao.flexbox.layoutmanager.player.c.a().a(z, f());
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else if (((c) this.viewParams).L) {
        } else {
            A();
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            A();
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        boolean J = J();
        if (!this.i || !J) {
            f.a(this.m);
            if (com.taobao.tao.flexbox.layoutmanager.player.c.a().d(f())) {
                f.a((Object) null);
                com.taobao.tao.flexbox.layoutmanager.player.c.a().a(f());
                return;
            } else if (!com.taobao.tao.flexbox.layoutmanager.player.c.a().h()) {
                return;
            } else {
                this.b = false;
                return;
            }
        }
        this.b = false;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return this.node.N().toString() + this.node.E();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        ac acVar = this.d;
        return acVar == null || !acVar.a(false);
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        Component F = F();
        if (F != null) {
            return oec.c(F.getView());
        }
        return oec.c(this.node.M().x());
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.view != 0 && n() && !g();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.view != 0 && !g();
    }

    public void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || this.view == 0) {
        } else {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            try {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.measureResult.f20361a, this.measureResult.b);
                if (oeb.ab()) {
                    if (((RoundedCornerLayout) this.view).getChildCount() <= 0) {
                        return;
                    }
                    ((RoundedCornerLayout) this.view).addView(view, ((RoundedCornerLayout) this.view).getChildCount() - 1, layoutParams);
                } else if (((c) this.viewParams).aO_() && com.taobao.tao.flexbox.layoutmanager.player.c.a().c()) {
                    ((RoundedCornerLayout) this.view).addView(view, 0, layoutParams);
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                view.bringToFront();
                            }
                        }
                    }, 250L);
                } else {
                    ((RoundedCornerLayout) this.view).addView(view, layoutParams);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ogg.a(obw.VIDEO_ACTION_TYPE_SHAREPLAYER, "设置回调引用为null");
        com.taobao.tao.flexbox.layoutmanager.player.c.a().a((c.InterfaceC0852c) null);
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        o();
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        c(this.view);
        return true;
    }

    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this});
        }
        if (this.view == 0 || ((RoundedCornerLayout) this.view).getChildCount() <= 0) {
            return null;
        }
        for (int i = 0; i < ((RoundedCornerLayout) this.view).getChildCount(); i++) {
            if (((RoundedCornerLayout) this.view).getChildAt(i) instanceof VideoView) {
                return ((RoundedCornerLayout) this.view).getChildAt(i);
            }
        }
        return null;
    }

    private TextureView a(ViewGroup viewGroup) {
        TextureView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("d7ce0388", new Object[]{this, viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        final Component F = F();
        f.a(1, F);
        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TBVideoComponent.p().a(1, F, ((c) TBVideoComponent.x(TBVideoComponent.this)).Z ? 1 : 0, TBVideoComponent.this.n() ? 1 : 0);
                }
            }
        });
    }

    public RoundedCornerLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedCornerLayout) ipChange.ipc$dispatch("e383ba86", new Object[]{this, context});
        }
        this.d = new ac(this.node, c.a((c) this.viewParams), c.b((c) this.viewParams), this, this);
        this.e = ((c) this.viewParams).aU;
        RoundedCornerLayout f2 = ogu.f(context);
        f2.addSizeChangedCallback(this);
        f2.addVisibilityChangedCallback(this);
        if (((c) this.viewParams).U) {
            ohb.a(f2, new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBVideoComponent.y(TBVideoComponent.this).k().e(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.10.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    TBVideoComponent.e(TBVideoComponent.this);
                                }
                            }
                        });
                    }
                }
            });
        }
        updateAPMToken(f2, com.taobao.monitor.procedure.v.APM_VIEW_INVALID);
        return f2;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        Object g = this.node.k().g();
        if (g instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
            return ((com.taobao.tao.flexbox.layoutmanager.container.f) g).isFinishing();
        }
        if (!(g instanceof ab.c)) {
            return false;
        }
        return ((ab.c) g).isDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        char c2;
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        String str = eVar.c;
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1055330882:
                if (str.equals("onpagescrollstatechanged")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -654012496:
                if (str.equals("onpagerefreshstatechanged")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -552345454:
                if (str.equals("onwilldisappear")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -434039193:
                if (str.equals("onsimulatedclick")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -144601415:
                if (str.equals("onselectchanged")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 238360901:
                if (str.equals("onrefreshchangestate")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2122668806:
                if (str.equals("onwillappear")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                if (H()) {
                    w();
                }
                D();
                this.b = false;
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().d();
                break;
            case 1:
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().e();
                com.taobao.tao.flexbox.layoutmanager.player.c.a().a((c.d) null);
                String a2 = oec.a(eVar.d.get("type"), "delete");
                switch (a2.hashCode()) {
                    case -1335458389:
                        if (a2.equals("delete")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 114581:
                        if (a2.equals("tab")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 3242771:
                        if (a2.equals("item")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 3433103:
                        if (a2.equals("page")) {
                            c3 = 0;
                            break;
                        }
                        break;
                }
                if (c3 == 0) {
                    if (l()) {
                        com.taobao.tao.flexbox.layoutmanager.player.c.a().g();
                        this.b = false;
                        b(false);
                        break;
                    } else if (!((c) this.viewParams).aO_()) {
                        y();
                        break;
                    } else {
                        b(true);
                        break;
                    }
                } else if (c3 == 1) {
                    b(true);
                    break;
                } else if (c3 == 2) {
                    this.b = false;
                    b(false);
                    Component F = F();
                    if (F != null && F.getNode() != null && B() && ((bool = (Boolean) F.getNode().a(R.id.layout_manager_list_first_check_visible)) == null || bool.booleanValue())) {
                        C();
                        break;
                    }
                } else if (c3 == 3) {
                    b(false);
                    break;
                }
                break;
            case 2:
                if (((c) this.viewParams).R) {
                    if (oeb.m()) {
                        if (n()) {
                            f.a(this.m);
                            f.a(this.m, 0L);
                            break;
                        }
                    } else {
                        w();
                        break;
                    }
                }
                break;
            case 3:
                if (oec.a(eVar.d.get("state"), 0) == 0) {
                    w();
                    break;
                }
                break;
            case 4:
                if (eVar.d.get("state") != TBRefreshHeader.RefreshState.NONE) {
                    z = false;
                }
                if (z) {
                    w();
                    break;
                }
                break;
            case 5:
                TBRefreshHeader.RefreshState refreshState = (TBRefreshHeader.RefreshState) eVar.d.get("state");
                TBRefreshHeader.RefreshState refreshState2 = (TBRefreshHeader.RefreshState) eVar.d.get("oldState");
                if (refreshState == TBRefreshHeader.RefreshState.PULL_TO_REFRESH || refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH || refreshState == TBRefreshHeader.RefreshState.REFRESHING) {
                    com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().b();
                    break;
                } else if (refreshState2 != refreshState && refreshState == TBRefreshHeader.RefreshState.NONE) {
                    Component F2 = F();
                    if (F2 != null && F2.getNode() != null) {
                        F2.getNode().a(R.id.layout_manager_list_first_check_visible, (Object) false);
                    }
                    com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().a(F2, com.taobao.tao.flexbox.layoutmanager.player.c.a().a(F2, n()), n());
                    com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().a(this);
                    D();
                    E();
                    break;
                }
                break;
            case 6:
                if (oeb.aI()) {
                    c(this.view);
                    return true;
                }
                break;
        }
        return false;
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (!com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a((c) this.viewParams)) {
        } else {
            if (System.currentTimeMillis() - com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.d <= 5000 && com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.d != 0) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a((IRemoteBaseListener) null);
            com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.d = System.currentTimeMillis();
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (!oeb.bc() || !com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.b.containsKey(((c) this.viewParams).D) || System.currentTimeMillis() - com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.f20482a <= 5000) {
        } else {
            try {
                com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.f20482a = System.currentTimeMillis();
                com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.a(new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.19
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            com.taobao.tao.flexbox.layoutmanager.player.c.a().a(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject(com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.a.b.get(((c) TBVideoComponent.z(TBVideoComponent.this)).D)));
                        } catch (Throwable th) {
                            ogg.a("TBVideoComponent", "updateVideoQuickOpenConfig failed" + th.getMessage());
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            ogg.a("TBVideoComponent", "updateVideoQuickOpenConfig failed");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            ogg.a("TBVideoComponent", "updateVideoQuickOpenConfig failed");
                        }
                    }
                });
            } catch (Throwable th) {
                ogg.a("TBVideoComponent", "updateVideoQuickOpenConfig failed" + th.getMessage());
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        d(false);
        ac acVar = this.d;
        if (acVar != null) {
            acVar.b();
        }
        if (this.view != 0) {
            ((RoundedCornerLayout) this.view).removeSizeChangedCallback(this);
            ((RoundedCornerLayout) this.view).removeVisibilityChangedCallback(this);
            for (int childCount = ((RoundedCornerLayout) this.view).getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = ((RoundedCornerLayout) this.view).getChildAt(childCount);
                if (childAt instanceof PlayerCoverView) {
                    PlayerCoverView playerCoverView = (PlayerCoverView) childAt;
                    playerCoverView.cancel();
                    gwh.a(playerCoverView);
                    ((TNodeImageView) childAt).removeFeature(CustomRoundRectFeature.class);
                } else if (childAt instanceof RoundedCornerLayout) {
                    ogu.a((RoundedCornerLayout) childAt);
                }
            }
            ogu.a((RoundedCornerLayout) this.view);
        }
        super.detach(z);
    }

    public TNodeImageView m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("85d5eae6", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        for (int i = 0; i < ((RoundedCornerLayout) this.view).getChildCount(); i++) {
            View childAt = ((RoundedCornerLayout) this.view).getChildAt(i);
            if (childAt instanceof TNodeImageView) {
                return (TNodeImageView) childAt;
            }
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d(m());
        b(i);
        c(i);
    }

    private boolean e(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef535ec", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Iterator<Map.Entry<String, c.b>> it = com.taobao.tao.flexbox.layoutmanager.player.c.a().b().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Map.Entry<String, c.b> next = it.next();
            if (next.getValue() != null && next.getValue().b != null && next.getValue().b.getViewParams().U) {
                z2 = true;
                break;
            }
        }
        return ((c) this.viewParams).U != z2 ? ((c) this.viewParams).U : !((c) this.viewParams).U && !z;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Component F = F();
        if (F == null || !(F instanceof m) || F.getView() == null) {
            return;
        }
        if (i == 0) {
            com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().a(this);
        } else {
            com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.b.a().b();
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.view != 0 && (g() || ((c) this.viewParams).Z)) {
            b(false);
        }
        Component F = F();
        if (i != 0 || F == null || F.getView() == null) {
            return;
        }
        if (this.viewParams != 0 && ((c) this.viewParams).L) {
            ogg.a("TBVideoComponent", "manualControl场景不销毁播放器");
        } else {
            com.taobao.tao.flexbox.layoutmanager.player.c.a().a(true);
        }
        if (!com.taobao.tao.flexbox.layoutmanager.player.c.a().e() && !e(true)) {
            return;
        }
        C();
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
            return;
        }
        if (view instanceof TNodeImageView) {
            ((TNodeImageView) view).loadImageIfInSlowScroll(G());
        }
        if (!H()) {
            return;
        }
        q();
    }

    private Component F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("fecccd48", new Object[]{this});
        }
        ac acVar = this.d;
        if (acVar == null) {
            return null;
        }
        return acVar.a();
    }

    private boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
        }
        Component F = F();
        if (!(F instanceof m)) {
            return true;
        }
        return ((m) F).g();
    }

    private boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        ac acVar = this.d;
        return acVar == null || acVar.c() == 0;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        boolean z = ((c) this.viewParams).m;
        return !((c) this.viewParams).n ? z & com.taobao.tao.flexbox.layoutmanager.player.c.a().a(getNode().N()) : z;
    }

    public b a(boolean z) {
        TextureView a2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("16226694", new Object[]{this, new Boolean(z)});
        }
        if (!((c) this.viewParams).aO_()) {
            int childCount = ((RoundedCornerLayout) this.view).getChildCount();
            if (childCount == 1) {
                return new b(((TNodeImageView) this.j).getDrawable(), 0, ((c) this.viewParams).e, ((c) this.viewParams).d);
            }
            if (childCount == 2) {
                View childAt = ((RoundedCornerLayout) this.view).getChildAt(0);
                TNodeImageView tNodeImageView = (TNodeImageView) this.j;
                if (childAt instanceof ViewGroup) {
                    if (z && (a2 = a((ViewGroup) childAt)) != null && (bitmap = a2.getBitmap()) != null) {
                        return new b(new BitmapDrawable(bitmap), com.taobao.tao.flexbox.layoutmanager.player.c.a().h(f()), ((c) this.viewParams).e, null);
                    }
                    if (com.taobao.tao.flexbox.layoutmanager.player.c.a().d(f())) {
                        return new b(tNodeImageView.getDrawable(), com.taobao.tao.flexbox.layoutmanager.player.c.a().h(f()), ((c) this.viewParams).e, ((c) this.viewParams).d);
                    }
                }
                return new b(tNodeImageView.getDrawable(), 0, ((c) this.viewParams).e, ((c) this.viewParams).d);
            }
        }
        return null;
    }

    @Override // tb.oid
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d(m());
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Object B;
        public Object C;
        public String D;
        public String E;
        public String F;
        public String G;
        public String N;
        public String O;
        public String P;
        public String T;
        public boolean U;

        /* renamed from: a  reason: collision with root package name */
        public String f20079a;
        public String b;
        public Object c;
        public String d;
        public String e;
        public String f;
        public int g;
        public int h;
        public String i;
        public String k;
        public HashMap<String, String> l;
        public Object s;
        public int t;
        public int u;
        public int v;
        public int w;
        public long j = -1;
        public boolean m = false;
        public boolean n = false;
        public boolean o = false;
        public boolean p = false;
        public boolean q = true;
        public String r = "center_crop";
        public int x = -1;
        public int y = -1;
        public int z = -1;
        public int A = -1;
        public boolean H = false;
        public boolean I = false;
        public boolean J = false;
        public int K = 0;
        public boolean L = false;
        public boolean M = false;
        public long Q = Long.MAX_VALUE;
        public boolean R = false;
        public int S = 0;
        public int by = 2;
        public boolean V = false;
        public boolean W = true;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = com.taobao.tao.flexbox.layoutmanager.player.c.b;
        public boolean bB = false;
        private float bw = 1.0f - com.taobao.tao.flexbox.layoutmanager.player.c.c;
        private float bx = 1.0f - com.taobao.tao.flexbox.layoutmanager.player.c.c;

        static {
            kge.a(2054313037);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ float a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c70ba1f", new Object[]{cVar})).floatValue() : cVar.bw;
        }

        public static /* synthetic */ float b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ebb6efe", new Object[]{cVar})).floatValue() : cVar.bx;
        }

        public boolean aO_() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("975b8a1c", new Object[]{this})).booleanValue() : "live".equals(this.f20079a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
            if (r9.equals("videoUrl") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 1546
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.c.a(android.content.Context, java.lang.String, java.lang.Object):void");
        }

        private HashMap<String, String> a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("a289da40", new Object[]{this, map});
            }
            if (map == null) {
                return null;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                String obj = value != null ? value.toString() : null;
                if (obj != null) {
                    hashMap.put(entry.getKey().toString(), obj);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes8.dex */
    public static class PlayerCoverView extends TNodeImageView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int height;
        private Drawable playIcon;
        private int width;

        static {
            kge.a(-1228000766);
        }

        public static /* synthetic */ Object ipc$super(PlayerCoverView playerCoverView, String str, Object... objArr) {
            if (str.hashCode() == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ Drawable access$4102(PlayerCoverView playerCoverView, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("7c692a3d", new Object[]{playerCoverView, drawable});
            }
            playerCoverView.playIcon = drawable;
            return drawable;
        }

        public PlayerCoverView(Context context) {
            super(context);
        }

        public void setPlayIcon(ab abVar, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17a7c5d9", new Object[]{this, abVar, obj, new Integer(i), new Integer(i2)});
            } else if (obj != null && i > 0 && i2 > 0) {
                this.width = i;
                this.height = i2;
                if (abVar == null) {
                    return;
                }
                ogw.a(null, abVar, obj, i, i2, ImageLoader.a.a(), null, false, new ogw.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.PlayerCoverView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ogw.a
                    public void a(Object obj2, Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91476368", new Object[]{this, obj2, drawable});
                            return;
                        }
                        PlayerCoverView.access$4102(PlayerCoverView.this, drawable);
                        PlayerCoverView.this.invalidate();
                    }

                    @Override // tb.ogw.a
                    public void a(Object obj2, int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj2, new Integer(i3)});
                            return;
                        }
                        PlayerCoverView.access$4102(PlayerCoverView.this, null);
                        PlayerCoverView.this.invalidate();
                    }
                });
            } else {
                this.playIcon = null;
                this.height = 0;
                this.width = 0;
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView, com.taobao.uikit.feature.view.TImageView, android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            super.draw(canvas);
            Drawable drawable = this.playIcon;
            if (drawable == null) {
                return;
            }
            int width = getWidth();
            int i = this.width;
            int i2 = ((width - i) / 2) + i;
            int height = getHeight();
            int i3 = this.height;
            drawable.setBounds((getWidth() - this.width) / 2, (getHeight() - this.height) / 2, i2, ((height - i3) / 2) + i3);
            this.playIcon.draw(canvas);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public Component.b getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component.b) ipChange.ipc$dispatch("1d100afe", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        if (com.taobao.tao.flexbox.layoutmanager.player.c.a().d(f())) {
            com.taobao.tao.flexbox.layoutmanager.player.c.a().a(f());
        }
        b a2 = a(true);
        if (a2 == null || !(a2.f20078a instanceof BitmapDrawable)) {
            return null;
        }
        Component.b bVar = new Component.b();
        bVar.f20279a = a2.d;
        bVar.b = oec.b((View) this.view);
        bVar.c = ((BitmapDrawable) a2.f20078a).getBitmap();
        return bVar;
    }

    private boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : !((c) this.viewParams).H && oeb.j() && !ohd.a(3);
    }

    private boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        if (((c) this.viewParams).V) {
            if (this.c == null) {
                this.c = Boolean.valueOf(((c) this.viewParams).W);
            }
            return this.c.booleanValue();
        }
        return f20054a;
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (((c) this.viewParams).V) {
            if (this.c == null) {
                this.c = Boolean.valueOf(((c) this.viewParams).W);
            }
            this.c = Boolean.valueOf(!this.c.booleanValue());
        } else {
            f20054a = !f20054a;
        }
    }

    /* loaded from: classes8.dex */
    public static class VideoView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TBVideoComponent component;
        private bl dwInstance;
        private com.taobao.avplayer.s liveInstance;
        private c viewParams;

        static {
            kge.a(1206400999);
        }

        public static /* synthetic */ Object ipc$super(VideoView videoView, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void access$4500(VideoView videoView, TNodeImageView tNodeImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df18b4b6", new Object[]{videoView, tNodeImageView});
            } else {
                videoView.setMuteImage(tNodeImageView);
            }
        }

        public static /* synthetic */ c access$4600(VideoView videoView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7bc82d8", new Object[]{videoView}) : videoView.viewParams;
        }

        public static /* synthetic */ com.taobao.avplayer.s access$4700(VideoView videoView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.avplayer.s) ipChange.ipc$dispatch("7906e1d4", new Object[]{videoView}) : videoView.liveInstance;
        }

        public static /* synthetic */ bl access$4800(VideoView videoView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("ab5cc206", new Object[]{videoView}) : videoView.dwInstance;
        }

        public VideoView(Context context) {
            super(context);
        }

        public void setDwInstance(bl blVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ec42f0", new Object[]{this, blVar});
                return;
            }
            this.dwInstance = blVar;
            addView(blVar.l(), new FrameLayout.LayoutParams(-1, -1));
        }

        public void setLiveDwInstance(com.taobao.avplayer.s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2915b5f7", new Object[]{this, sVar});
                return;
            }
            this.liveInstance = sVar;
            addView(sVar.e(), new FrameLayout.LayoutParams(-1, -1));
        }

        private void setMuteImage(TNodeImageView tNodeImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe382cb", new Object[]{this, tNodeImageView});
            } else {
                tNodeImageView.setImageSrc(TBVideoComponent.A(this.component).k(), TBVideoComponent.i(this.component) ? this.viewParams.B : this.viewParams.C, this.viewParams.v, this.viewParams.w, ImageLoader.a.a(), null, false);
            }
        }

        public void setMuteInfo(final TBVideoComponent tBVideoComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffec9546", new Object[]{this, tBVideoComponent});
                return;
            }
            this.component = tBVideoComponent;
            this.viewParams = (c) TBVideoComponent.B(tBVideoComponent);
            if (this.viewParams.B == null || this.viewParams.C == null) {
                return;
            }
            final TNodeImageView a2 = ogu.a(getContext());
            a2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            setMuteImage(a2);
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.VideoView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TBVideoComponent.C(tBVideoComponent);
                    VideoView.access$4500(VideoView.this, a2);
                    try {
                        if (VideoView.access$4600(VideoView.this).aO_()) {
                            VideoView.access$4700(VideoView.this).a(TBVideoComponent.i(tBVideoComponent));
                        } else {
                            VideoView.access$4800(VideoView.this).e(TBVideoComponent.i(tBVideoComponent));
                        }
                    } catch (Throwable th) {
                        ogg.b(th.getMessage());
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa node = tBVideoComponent.getNode();
                    if (node.e(TBVideoComponent.MSG_MUTE_CHANGE) == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", TBVideoComponent.i(tBVideoComponent) ? "mute" : "unmute");
                    tBVideoComponent.sendMessage(node, TBVideoComponent.MSG_MUTE_CHANGE, null, hashMap, null);
                }
            });
            addView(a2, createMuteIconLayoutParams());
        }

        public FrameLayout.LayoutParams createMuteIconLayoutParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("6a7f8f8e", new Object[]{this});
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.viewParams.v, this.viewParams.w);
            layoutParams.gravity = 0;
            if (this.viewParams.x >= 0) {
                layoutParams.leftMargin = this.viewParams.x;
                layoutParams.gravity |= 3;
            }
            if (this.viewParams.y >= 0) {
                layoutParams.topMargin = this.viewParams.y;
                layoutParams.gravity |= 48;
            }
            if (this.viewParams.z >= 0) {
                layoutParams.rightMargin = this.viewParams.z;
                layoutParams.gravity |= 5;
            }
            if (this.viewParams.A >= 0) {
                layoutParams.bottomMargin = this.viewParams.A;
                layoutParams.gravity |= 80;
            }
            return layoutParams;
        }

        public c getVideoParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b66a5979", new Object[]{this}) : this.viewParams;
        }

        public boolean isMute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
            }
            TBVideoComponent tBVideoComponent = this.component;
            return tBVideoComponent != null ? TBVideoComponent.i(tBVideoComponent) : TBVideoComponent.f20054a;
        }

        public void attachVideoView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5e7d990", new Object[]{this, view});
            } else {
                this.component.a(view);
            }
        }

        public void hideCoverView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("964a6361", new Object[]{this});
            } else {
                TBVideoComponent.D(this.component);
            }
        }

        public bl getDwInstance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("7761690", new Object[]{this}) : this.dwInstance;
        }

        public com.taobao.avplayer.s getLiveDWInstance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.avplayer.s) ipChange.ipc$dispatch("9b3cc8d5", new Object[]{this}) : this.liveInstance;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!oeb.ab() || this.j == null) {
        } else {
            ObjectAnimator objectAnimator = this.k;
            if (objectAnimator != null) {
                objectAnimator.end();
            }
            this.j.setAlpha(1.0f);
        }
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (!oeb.ab() || this.j == null) {
        } else {
            if (!((c) this.viewParams).aO_() && !com.taobao.tao.flexbox.layoutmanager.player.c.a().e(f())) {
                return;
            }
            this.k = ObjectAnimator.ofFloat(this.j, "alpha", 1.0f, 0.0f);
            this.k.setDuration(250L);
            this.k.setInterpolator(new LinearInterpolator());
            this.k.start();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f2, List<com.taobao.tao.flexbox.layoutmanager.core.aa> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f2), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f2, list);
        if (componentAlpha && this.view != 0) {
            if (!z) {
                f2 *= ((c) this.viewParams).aT;
            }
            for (int i = 0; i < ((RoundedCornerLayout) this.view).getChildCount(); i++) {
                ((RoundedCornerLayout) this.view).getChildAt(i).setAlpha(f2);
            }
        }
        return componentAlpha;
    }
}
