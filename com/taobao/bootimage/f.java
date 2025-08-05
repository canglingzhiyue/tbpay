package com.taobao.bootimage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.view.c;
import com.taobao.homepage.view.manager.broadcast.BroadcastManager;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.HashMap;
import tb.kec;
import tb.kej;
import tb.kel;
import tb.keo;
import tb.keq;
import tb.ket;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ColdStartSplashManager";
    private static com.taobao.bootimage.linked.h b;
    private static Application c;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f16681a;

    static {
        kge.a(-386616959);
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c0768a", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.a(z);
        }
    }

    public static /* synthetic */ com.taobao.bootimage.linked.h c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.bootimage.linked.h) ipChange.ipc$dispatch("157cc5f0", new Object[0]) : b;
    }

    public f(Activity activity) {
        this.f16681a = activity;
    }

    public boolean a() {
        BootImageInfo e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!d() || (e = e()) == null) {
            return false;
        }
        return a(e);
    }

    private boolean a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        String str = "";
        final keq h = com.taobao.bootimage.linked.h.a(str).h();
        FrameLayout b2 = d.b(this.f16681a);
        if (bootImageInfo != null && !TextUtils.isEmpty(bootImageInfo.bizType)) {
            str = bootImageInfo.bizType;
        }
        final String str2 = str;
        final com.taobao.bootimage.view.d dVar = new com.taobao.bootimage.view.d(this.f16681a, bootImageInfo, b2);
        if (dVar.g == null) {
            h.a("Market", "ColdStart", keq.EXPOSE_ERROR, str2, keq.CODE_VIEW_CREATE_FAIL, "BootImageContent rootView null");
            return false;
        }
        dVar.d = new c.a() { // from class: com.taobao.bootimage.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.view.c.a
            public void b(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str3});
                }
            }

            @Override // com.taobao.bootimage.view.c.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    kej.a(f.TAG, "market expose success");
                }
            }

            @Override // com.taobao.bootimage.view.c.a
            public void a(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    return;
                }
                if (dVar.g.getParent() != null) {
                    ((ViewGroup) dVar.g.getParent()).removeView(dVar.g);
                }
                f.a(f.this, false);
                kel.a(false);
            }

            @Override // com.taobao.bootimage.view.c.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    h.a("Market", "ColdStart", keq.EXPOSE_ERROR, str2, String.valueOf(i), String.valueOf(i));
                }
            }
        };
        b2.addView(dVar.g, new FrameLayout.LayoutParams(-1, -1));
        boolean b3 = dVar.b();
        if (!b3) {
            ViewGroup viewGroup = (ViewGroup) dVar.g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(dVar.g);
            }
            kej.a(TAG, "showSplashAD do addADSplashView failed");
            h.a("Market", "ColdStart", keq.EXPOSE_ERROR, str2, keq.CODE_VIEW_CREATE_FAIL, "BootImageContent show fail");
        } else {
            h.a("Market", "ColdStart", keq.EXPOSE_SUCCESS, str2, null, null);
            dVar.a(new Runnable() { // from class: com.taobao.bootimage.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    dVar.n.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setFillBefore(true);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setInterpolator(new LinearInterpolator());
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.bootimage.f.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                return;
                            }
                            dVar.c();
                            f.c().e().c();
                        }
                    });
                    dVar.n.startAnimation(alphaAnimation);
                }
            });
            ket.a(bootImageInfo.exposureParam);
            BootImageDataMgr.a().a(bootImageInfo.itemId, true, Long.valueOf(keo.b()));
            kel.a(true);
            a(true);
        }
        return b3;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = !z ? BroadcastManager.ACTION_SPLASH_CLOSE : BroadcastManager.ACTION_SPLASH_SHOW;
        if (!kel.b) {
            return;
        }
        LocalBroadcastManager.getInstance(this.f16681a).sendBroadcast(new Intent(str));
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : kel.c && kel.d;
    }

    private BootImageInfo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("df7fe012", new Object[]{this});
        }
        BootImageDataMgr.a().d();
        BootImageData g = BootImageDataMgr.a().g();
        if (g != null && g.result != null && g.result.size() != 0) {
            for (int i = 0; i < g.result.size(); i++) {
                BootImageInfo bootImageInfo = g.result.get(i);
                if (bootImageInfo.coldStart && BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo.bizType) && b(bootImageInfo)) {
                    return bootImageInfo;
                }
            }
        }
        return null;
    }

    private boolean b(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ef7fb31", new Object[]{this, bootImageInfo})).booleanValue() : c(bootImageInfo) && d(bootImageInfo) && e(bootImageInfo);
    }

    private boolean c(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e86f88d0", new Object[]{this, bootImageInfo})).booleanValue();
        }
        if (bootImageInfo == null) {
            return false;
        }
        long b2 = keo.b();
        return b2 >= bootImageInfo.gmtStartMs && b2 <= bootImageInfo.gmtEndMs && !TextUtils.isEmpty(bootImageInfo.itemId);
    }

    private boolean d(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e7166f", new Object[]{this, bootImageInfo})).booleanValue();
        }
        BootImageDataMgr.a().c();
        return BootImageDataMgr.a().a(bootImageInfo);
    }

    private boolean e(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5ea40e", new Object[]{this, bootImageInfo})).booleanValue();
        }
        String c2 = keo.c(bootImageInfo.imgUrl);
        if (!TextUtils.isEmpty(c2)) {
            File file = new File(keo.d("Market"), c2);
            if (file.exists()) {
                bootImageInfo.videoLocalPath = file.getAbsolutePath();
                return true;
            }
        }
        return false;
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        a(application);
        Application b2 = b();
        if (b2 == null) {
            kej.a(TAG, "ColdStart init mApplication is null");
            return;
        }
        kel.a(b2);
        com.taobao.bootimage.linked.h a2 = com.taobao.bootimage.linked.h.a("");
        b = a2;
        a2.h().a(b2);
        kel.e();
        kej.a(TAG, "coldStartNewEnable:" + kel.c);
        if (!kel.c) {
            return;
        }
        kej.a(TAG, "ColdStart start loadAdCache");
        if (kel.c()) {
            b.j().a();
        }
        b.f().b();
        kej.a(TAG, "ColdStart enableOptimizedCodeSwitch true");
        b2.registerActivityLifecycleCallbacks(new kec());
    }

    public static Application b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("2271dcb8", new Object[0]);
        }
        if (c == null) {
            kej.a(TAG, "coldStartNewEnable mApplication is null");
            c = Globals.getApplication();
        }
        return c;
    }

    private static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (application != null) {
            c = application;
        } else {
            kej.a(TAG, "coldStartNewEnable application is null");
            if (Globals.getApplication() != null) {
                c = Globals.getApplication();
            } else {
                kej.a(TAG, "coldStartNewEnable Globals application is null");
            }
        }
    }
}
