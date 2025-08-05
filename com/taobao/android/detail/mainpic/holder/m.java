package com.taobao.android.detail.mainpic.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.widget.RectObserveRelativeLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import com.taobao.weex.utils.WXViewUtils;
import java.util.HashMap;
import tb.bny;
import tb.etx;
import tb.euq;
import tb.euu;
import tb.euv;
import tb.euw;
import tb.eux;

/* loaded from: classes4.dex */
public class m extends com.alibaba.android.ultron.vfw.viewholder.b implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String f = "mainpicVideo";
    private int e;
    public RectObserveRelativeLayout g;
    public DWInstance h;
    public View i;
    public etx j;
    public com.taobao.android.detail.mainpic.g k;
    public IDMComponent l;
    public Context m;
    public boolean n;
    public com.taobao.avplayer.common.n o;
    public z p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private av u;

    /* loaded from: classes4.dex */
    public static class a implements RectObserveRelativeLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f10192a;
        private DWInstance b;

        public a(DWInstance dWInstance, float f) {
            this.b = dWInstance;
            this.f10192a = f;
        }

        @Override // com.taobao.android.detail.mainpic.widget.RectObserveRelativeLayout.a
        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            float f = i2;
            float f2 = i;
            float f3 = (1.0f * f) / f2;
            if (Math.abs(this.f10192a - f3) < 2.0E-5f) {
                return;
            }
            float f4 = this.f10192a;
            if (f4 > f3) {
                i = (int) (f / f4);
            } else {
                i2 = (int) (f2 * f4);
            }
            DWInstance dWInstance = this.b;
            if (dWInstance == null) {
                return;
            }
            dWInstance.setFrame(i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public static /* synthetic */ void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641bca04", new Object[]{mVar});
        } else {
            mVar.g();
        }
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e b(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("290efa1b", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new m(bnyVar, etx.this, gVar);
            }
        };
    }

    public m(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.s = true;
        this.n = false;
        this.u = new av() { // from class: com.taobao.android.detail.mainpic.holder.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("24db3403", new Object[]{this});
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
            public void onVideoPause(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
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
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
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

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (m.this.l == null || m.this.l.getFields() == null) {
                } else {
                    JSONObject fields = m.this.l.getFields();
                    euw.a(m.this.k, fields.getString("url"), fields.getString("videoId"));
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                } else if (m.this.h == null) {
                } else {
                    m.this.h.setDWLifecycleType(DWLifecycleType.BEFORE);
                }
            }
        };
        this.o = new com.taobao.avplayer.common.n() { // from class: com.taobao.android.detail.mainpic.holder.m.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.n
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                m.a(m.this);
                return false;
            }
        };
        this.p = new z() { // from class: com.taobao.android.detail.mainpic.holder.m.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
                if (r0.getVideoState() == 6) goto L12;
             */
            @Override // com.taobao.avplayer.common.z
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean hook() {
                /*
                    r7 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.mainpic.holder.m.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L19
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    r1[r2] = r7
                    java.lang.String r2 = "e6b1302e"
                    java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L19:
                    com.taobao.android.detail.mainpic.holder.m r0 = com.taobao.android.detail.mainpic.holder.m.this
                    com.taobao.avplayer.DWInstance r0 = r0.h
                    com.taobao.android.detail.mainpic.holder.m r1 = com.taobao.android.detail.mainpic.holder.m.this
                    tb.etx r1 = r1.j
                    com.taobao.android.detail.mainpic.holder.m r4 = com.taobao.android.detail.mainpic.holder.m.this
                    com.taobao.android.ultron.common.model.IDMComponent r4 = r4.l
                    if (r0 == 0) goto L3d
                    int r5 = r0.getVideoState()
                    if (r5 == 0) goto L34
                    int r5 = r0.getVideoState()
                    r6 = 4
                    if (r5 != r6) goto L3d
                L34:
                    r0.start()
                    com.taobao.android.detail.mainpic.holder.m r0 = com.taobao.android.detail.mainpic.holder.m.this
                    com.taobao.android.detail.mainpic.holder.m.a(r0)
                    goto L53
                L3d:
                    if (r0 == 0) goto L49
                    int r5 = r0.getVideoState()
                    if (r5 != r3) goto L49
                    r1.a(r4, r0)
                    goto L53
                L49:
                    if (r0 == 0) goto L53
                    int r1 = r0.getVideoState()
                    r3 = 6
                    if (r1 != r3) goto L53
                    goto L34
                L53:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.mainpic.holder.m.AnonymousClass4.hook():boolean");
            }
        };
        this.j = etxVar;
        this.k = gVar;
        this.m = bnyVar.k();
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        f();
        int i = this.e;
        if (i != 1 && i != 5 && i != 8) {
            z = false;
        }
        if (z) {
            this.h.playVideo();
        }
        this.h.showController();
        this.q = false;
        c(this.l);
        this.h.setRootViewClickListener(this.p);
        this.h.setHookStartListener(this.o);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.t = this.k.j();
        if (euv.a(this.k) || this.n || !this.t) {
            return;
        }
        com.taobao.android.detail.mainpic.h k = this.k.k();
        if (k != null && (k.a() || k.b())) {
            if (k.b()) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.7631564.1999020712");
                JSONObject fields = this.l.getFields();
                hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, fields.getString("videoId"));
                hashMap.put("item_id", fields.getString("itemId"));
                hashMap.put("seller_id", fields.getString("sellerId"));
                eux.a(eux.f27590a, 2101, "Page_Detail_Button-VideoMemPlay", "", "", hashMap);
            }
            z = true;
        }
        if (z) {
            if (this.h.getVideoState() == 0) {
                this.h.mute(true);
            }
            this.h.start();
        }
        this.n = true;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        DWInstance dWInstance = this.h;
        if (dWInstance == null) {
            return;
        }
        this.e = dWInstance.getVideoState();
        if (1 != this.e) {
            return;
        }
        this.h.pauseVideo();
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void I_() {
        int i;
        DWInstance dWInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e202bd", new Object[]{this});
            return;
        }
        this.t = true;
        if (!this.s && (dWInstance = this.h) != null) {
            dWInstance.mute(this.r);
        }
        this.s = false;
        f();
        DWInstance dWInstance2 = this.h;
        if (dWInstance2 != null && dWInstance2.getVideoState() == 4) {
            this.h.setDWLifecycleType(DWLifecycleType.BEFORE);
        }
        this.h.showController();
        if (!this.k.f().b(this.h, this.l) && ((i = this.e) == 1 || i == 5 || i == 8)) {
            this.h.playVideo();
        }
        this.h.setVideoLifecycleListener(this.u);
        c(this.l);
        this.h.setRootViewClickListener(this.p);
        this.h.setHookStartListener(this.o);
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void H_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d2a1e", new Object[]{this});
            return;
        }
        this.t = false;
        this.r = this.h.isMute();
        if (this.k.f().a(this.h, this.l)) {
            return;
        }
        this.e = this.h.getVideoState();
        if (1 != this.e) {
            return;
        }
        this.h.pauseVideo();
    }

    private void a(RectObserveRelativeLayout rectObserveRelativeLayout, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a535fa9", new Object[]{this, rectObserveRelativeLayout, iDMComponent});
            return;
        }
        IDMComponent a2 = euq.a(iDMComponent);
        int screenWidth = WXViewUtils.getScreenWidth(this.m);
        if (this.k.k().j()) {
            screenWidth = euu.b(this.m);
        }
        int a3 = euu.a(a2, this.k);
        com.taobao.android.detail.mainpic.g gVar = this.k;
        if (gVar != null && gVar.u()) {
            if (rectObserveRelativeLayout != null) {
                rectObserveRelativeLayout.setBackgroundColor(-16777216);
                ViewGroup.LayoutParams layoutParams = rectObserveRelativeLayout.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -1);
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                rectObserveRelativeLayout.setLayoutParams(layoutParams);
                rectObserveRelativeLayout.setOnSizeChangedListener(new a(this.h, (a3 * 1.0f) / screenWidth));
            }
            this.h.setPicModeScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.h.setFrame(screenWidth, a3);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.g = new RectObserveRelativeLayout(viewGroup.getContext());
        return this.g;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent.getFields() == null) {
        } else {
            this.l = iDMComponent;
            c(iDMComponent);
        }
    }

    private boolean c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f962e", new Object[]{this, iDMComponent})).booleanValue();
        }
        View view = this.i;
        if (view != null && view.getParent() != null && this.i.getParent().equals(this.g)) {
            return false;
        }
        this.k.k().h();
        com.taobao.android.detail.mainpic.d f2 = this.k.f();
        this.h = f2.a(iDMComponent);
        this.h.setVideoLifecycleListener(this.u);
        this.h.setRootViewClickListener(this.p);
        this.h.setHookStartListener(this.o);
        this.i = f2.a(this.h);
        a(this.g, iDMComponent);
        int i = -1;
        if (this.k.k().j() || this.k.u()) {
            i = -2;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
        layoutParams.addRule(13);
        layoutParams.addRule(15);
        layoutParams.addRule(14);
        layoutParams.addRule(3);
        a(this.g, this.i, layoutParams);
        this.k.k().h().a();
        return true;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.k.k().c()) {
        } else {
            this.k.k().b(true);
        }
    }

    private void a(ViewGroup viewGroup, View view, RelativeLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c048ab27", new Object[]{this, viewGroup, view, layoutParams});
            return;
        }
        try {
            if (view.getParent() != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2.getAnimation() != null) {
                    viewGroup2.getAnimation().cancel();
                }
                viewGroup2.setLayoutTransition(null);
                viewGroup2.removeView(view);
            }
            viewGroup.addView(view, layoutParams);
        } catch (Exception unused) {
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.i;
    }
}
