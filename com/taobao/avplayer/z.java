package com.taobao.avplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.al;
import com.taobao.avplayer.playercontrol.DWPlayerController;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ddg;
import tb.kcm;
import tb.kge;
import tb.oyu;

/* loaded from: classes6.dex */
public class z implements com.taobao.avplayer.common.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public String f16626a;
    public boolean b;
    public boolean c;
    private DWContext d;
    private FrameLayout e;
    private DWPlayerController f;
    private com.taobao.avplayer.playercontrol.g g;
    private com.taobao.avplayer.playercontrol.e h;
    private com.taobao.avplayer.playercontrol.d i;
    private BroadcastReceiver j;
    private DWLifecycleType l;
    private ImageView m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private com.taobao.avplayer.common.n q;
    private ao r;
    private ay s;
    private com.taobao.avplayer.common.x t;
    private int v;
    private int w;
    private boolean x;
    private boolean k = false;
    private ArrayList<com.taobao.avplayer.common.q> u = new ArrayList<>();

    static {
        kge.a(1332828388);
        kge.a(556437024);
    }

    public static /* synthetic */ com.taobao.avplayer.playercontrol.g a(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.playercontrol.g) ipChange.ipc$dispatch("5d9b9028", new Object[]{zVar}) : zVar.g;
    }

    public static /* synthetic */ DWLifecycleType b(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWLifecycleType) ipChange.ipc$dispatch("55c64a2a", new Object[]{zVar}) : zVar.l;
    }

    public static /* synthetic */ com.taobao.avplayer.common.x c(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.x) ipChange.ipc$dispatch("77042aa8", new Object[]{zVar}) : zVar.t;
    }

    public static /* synthetic */ boolean d(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0bb8c6", new Object[]{zVar})).booleanValue() : zVar.x;
    }

    public static /* synthetic */ DWContext e(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("659f9f3c", new Object[]{zVar}) : zVar.d;
    }

    public static /* synthetic */ com.taobao.avplayer.common.n f(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.common.n) ipChange.ipc$dispatch("e7c04475", new Object[]{zVar}) : zVar.q;
    }

    public static /* synthetic */ ay g(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ay) ipChange.ipc$dispatch("37f09808", new Object[]{zVar}) : zVar.s;
    }

    public static /* synthetic */ void h(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fd63e", new Object[]{zVar});
        } else {
            zVar.B();
        }
    }

    public static /* synthetic */ ImageView i(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("a0943c93", new Object[]{zVar}) : zVar.n;
    }

    public static /* synthetic */ ImageView j(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("2dceee14", new Object[]{zVar}) : zVar.o;
    }

    public static /* synthetic */ ao k(z zVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ao) ipChange.ipc$dispatch("461d0dd6", new Object[]{zVar}) : zVar.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x01b7, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01ba, code lost:
        if (r13.d == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01c2, code lost:
        if (r13.d.getActivity() == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01c4, code lost:
        r0 = r13.d.getActivity().getSharedPreferences("PLAYERINFO", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x01d0, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01d2, code lost:
        r2 = r0.getBoolean("OPENDEBUG", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01d9, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01da, code lost:
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01dc, code lost:
        r13.m.setOnLongClickListener(new com.taobao.avplayer.z.AnonymousClass5());
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01e6, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x01e8, code lost:
        r0 = r0.getBoolean("cleanDWLastFreeFlowTipTime", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x01ef, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01f0, code lost:
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01f2, code lost:
        r0 = r13.d.getActivity().getSharedPreferences("NetFlow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01fe, code lost:
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0204, code lost:
        if (r0.edit() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0206, code lost:
        r0.edit().clear().commit();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(com.taobao.avplayer.DWContext r14) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.z.<init>(com.taobao.avplayer.DWContext):void");
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (this.b || this.o == null) {
        } else {
            this.b = true;
            this.s.a(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(400L);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            this.o.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.avplayer.z.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                {
                    z.this = this;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    z zVar = z.this;
                    zVar.b = false;
                    z.j(zVar).setVisibility(8);
                }
            });
            DWContext dWContext = this.d;
            if (dWContext == null || dWContext.mUTAdapter == null) {
                return;
            }
            this.d.mUTAdapter.a("DWVideo", "Button", "videoMute", this.d.getUTParams(), null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f.requestInteractiveAndRefresh();
        }
    }

    public void a(com.taobao.avplayer.common.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4108e726", new Object[]{this, oVar});
        } else {
            this.f.setIDWHookVideoBackButtonListener(oVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f.showGoodsListView();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f.hideGoodsListView();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.g.c(true);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g.b(true);
        }
    }

    public void a(com.taobao.avplayer.common.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4109cfe4", new Object[]{this, qVar});
        } else if (this.u.contains(qVar)) {
        } else {
            this.u.add(qVar);
        }
    }

    public void a(com.taobao.avplayer.common.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410872c7", new Object[]{this, nVar});
        } else {
            this.q = nVar;
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            this.h.a(str, z);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f.hideCloseView(true);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f.showCloseView(true);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.m.setVisibility(8);
    }

    public void i() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.avplayer.playercontrol.e eVar = this.h;
        if ((eVar != null && eVar.g()) || (imageView = this.m) == null || imageView.getVisibility() == 0 || !m()) {
            return;
        }
        this.m.setVisibility(0);
    }

    public void a(com.taobao.avplayer.playercontrol.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d0ba7", new Object[]{this, kVar});
        } else {
            this.f.setIDWPlayerControlListener(kVar);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f.addFullScreenCustomView(view);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.f.removeFullScreenCustomView();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.h.b();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.h.e();
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.h.d();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.h.c();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        if (z) {
            this.f.hideCloseView(false);
            if (this.d.mMuteIconDisplay && this.o != null) {
                if (this.d.mDWImageAdapter != null) {
                    this.d.mDWImageAdapter.a(R.drawable.dw_mute_open, this.o);
                } else {
                    this.o.setImageResource(R.drawable.dw_mute_open);
                }
                if (this.l == DWLifecycleType.MID) {
                    this.o.setVisibility(0);
                }
            }
        } else {
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            DWContext dWContext = this.d;
            if (dWContext != null && dWContext.getVideo() != null && this.d.getVideo().t() == 3) {
                this.f.showCloseView(false);
            }
        }
        this.g.d(z);
    }

    public void a(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410372b2", new Object[]{this, cVar});
        } else {
            this.f.setCloseViewClickListener(cVar);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f.showOrHideInteractive(z);
        this.g.a(z);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.f.showControllerInner();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.f.showControllerView();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.f.hideControllerView();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.m == null) {
        } else {
            if (this.d.mDWImageAdapter != null) {
                this.d.mDWImageAdapter.a(this.v, this.m);
            } else {
                this.m.setImageResource(this.v);
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.m == null) {
        } else {
            if (this.d.mDWImageAdapter != null) {
                this.d.mDWImageAdapter.a(this.w, this.m);
            } else {
                this.m.setImageResource(this.w);
            }
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.f.hideControllerInner();
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.f.showing();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        DWPlayerController dWPlayerController = this.f;
        if (dWPlayerController == null) {
            return;
        }
        dWPlayerController.showTopEventView();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        DWPlayerController dWPlayerController = this.f;
        if (dWPlayerController == null) {
            return;
        }
        dWPlayerController.hideTopEventView();
    }

    public ViewGroup x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2f38e236", new Object[]{this}) : this.e;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        try {
            if (this.j == null) {
                return;
            }
            this.d.getActivity().unregisterReceiver(this.j);
            this.j = null;
        } catch (Exception unused) {
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.j == null) {
            E();
        } else {
            try {
                this.d.getActivity().unregisterReceiver(this.j);
            } catch (Exception unused) {
            }
        }
        try {
            this.d.getActivity().registerReceiver(this.j, intentFilter);
        } catch (Exception unused2) {
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            this.j = new BroadcastReceiver() { // from class: com.taobao.avplayer.DWPlayerControlViewController$9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || context.getApplicationContext() == null) {
                    } else {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                            return;
                        }
                        if (type == 0) {
                            if (z.k(z.this) == null || !z.k(z.this).a() || !z.k(z.this).b() || !z.e(z.this).getShowPlayWithCacheHint()) {
                                try {
                                    if (z.e(z.this).getShowNotWifiHint() && type != oyu.b) {
                                        z.e(z.this).showToast(z.e(z.this).getActivity().getResources().getString(R.string.dw_tbavsdk_networktips));
                                    }
                                } catch (Exception e) {
                                    if (z.e(z.this).mTlogAdapter != null) {
                                        ddg ddgVar = z.e(z.this).mTlogAdapter;
                                        com.taobao.taobaoavsdk.util.c.a(ddgVar, " show netflow toast error:" + com.taobao.taobaoavsdk.util.c.a(e));
                                    }
                                }
                            } else {
                                z.e(z.this).showToast(z.e(z.this).getActivity().getResources().getString(R.string.dw_tbavsdk_networktips_cache_available));
                            }
                        }
                        oyu.b = type;
                    }
                }
            };
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        this.x = true;
        C();
        ArrayList<com.taobao.avplayer.common.q> arrayList = this.u;
        if (arrayList != null) {
            arrayList.clear();
        }
        com.taobao.avplayer.playercontrol.e eVar = this.h;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        ImageView imageView;
        ImageView imageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.l = dWLifecycleType;
        if (this.l == DWLifecycleType.BEFORE) {
            if (!this.d.isHiddenThumbnailPlayBtn()) {
                this.m.setVisibility(0);
            }
        } else if (this.l == DWLifecycleType.MID) {
            if (!kcm.a((Context) this.d.getActivity())) {
                this.c = true;
            }
            D();
            this.h.e();
            if (this.d.mMuteIconDisplay && (imageView = this.o) != null && this.k) {
                imageView.setVisibility(0);
            }
        }
        if (this.l == DWLifecycleType.MID_BEGIN) {
            this.h.e();
            this.e.bringToFront();
        }
        if (this.l == DWLifecycleType.AFTER || this.l == DWLifecycleType.MID_END) {
            h();
        }
        if (this.l != DWLifecycleType.MID && this.d.mMuteIconDisplay && (imageView2 = this.o) != null) {
            imageView2.setVisibility(8);
        }
        this.f.hideControllerInner();
        Iterator<com.taobao.avplayer.common.q> it = this.u.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public void a(al.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113839a9", new Object[]{this, aVar});
        } else {
            this.r = aVar;
        }
    }

    public void a(ay ayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1737d3d9", new Object[]{this, ayVar});
        } else {
            this.s = ayVar;
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.g.c();
    }

    public void a(com.taobao.avplayer.common.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410cfe7d", new Object[]{this, xVar});
        } else {
            this.t = xVar;
        }
    }

    public int A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue() : this.f.getNormalControllerHeight();
    }
}
