package com.taobao.bootimage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.util.i;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageInfoManager;
import com.taobao.bootimage.activity.BootImageActivity;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.view.c;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.alj;
import tb.kej;
import tb.kek;
import tb.kem;
import tb.keo;
import tb.kep;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_TYPE_OTHER = "other";
    public static final String CLOSE_TYPE_SKIP = "skip";

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f16675a;
    private long b;
    private long c;
    private String d;
    private String e;
    private a h;
    private boolean i;
    private boolean j;
    private ViewGroup m;
    private ViewGroup n;
    private TUrlImageView o;
    private boolean p;
    private com.taobao.bootimage.view.c q;
    private BootImageInfoManager r;
    private String f = "other";
    private AtomicBoolean g = new AtomicBoolean(false);
    private i k = new i(Looper.getMainLooper(), this);

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-912919416);
        kge.a(-1043440182);
    }

    public static /* synthetic */ String a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("818dbfca", new Object[]{dVar, str});
        }
        dVar.f = str;
        return str;
    }

    public static /* synthetic */ void a(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a40b78", new Object[]{dVar, new Long(j)});
        } else {
            dVar.a(j);
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35fd04d0", new Object[]{dVar})).booleanValue() : dVar.i;
    }

    public static /* synthetic */ boolean a(d dVar, BootImageInfo bootImageInfo, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1e6f929d", new Object[]{dVar, bootImageInfo, new Integer(i)})).booleanValue() : dVar.a(bootImageInfo, i);
    }

    public static /* synthetic */ long b(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a50b70b", new Object[]{dVar, new Long(j)})).longValue();
        }
        dVar.c = j;
        return j;
    }

    public static /* synthetic */ BootImageInfoManager b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfoManager) ipChange.ipc$dispatch("d802b60f", new Object[]{dVar}) : dVar.r;
    }

    public static /* synthetic */ boolean c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("889ccdd2", new Object[]{dVar})).booleanValue() : dVar.j;
    }

    public static /* synthetic */ ViewGroup d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a0db3ee6", new Object[]{dVar}) : dVar.n;
    }

    public static /* synthetic */ boolean e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db3c96d4", new Object[]{dVar})).booleanValue() : dVar.p;
    }

    public static /* synthetic */ long f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48c7b45", new Object[]{dVar})).longValue() : dVar.b;
    }

    public static /* synthetic */ Properties g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Properties) ipChange.ipc$dispatch("4f464840", new Object[]{dVar}) : dVar.g();
    }

    public static /* synthetic */ AtomicBoolean h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6405a1d3", new Object[]{dVar}) : dVar.g;
    }

    public static /* synthetic */ TUrlImageView i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("5b2372a8", new Object[]{dVar}) : dVar.o;
    }

    public static /* synthetic */ void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cc0d55", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    public d(boolean z, boolean z2) {
        this.p = z;
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        if (a2 != null) {
            this.d = Integer.toString(a2.a(com.taobao.tbdeviceevaluator.c.KEY_OLD_SCORE, -1));
        }
        this.r = new BootImageInfoManager(z, z2);
        this.j = false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        kej.a(kem.TAG, "preInit start");
        BootImageInfoManager bootImageInfoManager = this.r;
        if (bootImageInfoManager != null) {
            bootImageInfoManager.a();
            kej.a(kem.TAG, "preInit start success");
            return true;
        }
        kej.a(kem.TAG, "preInit start fail");
        return false;
    }

    public boolean a(Activity activity) {
        WeakReference<Activity> weakReference;
        Activity activity2;
        boolean z;
        Set<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        kej.a(kem.TAG, "init start");
        this.f16675a = new WeakReference<>(activity);
        this.e = activity.getLocalClassName();
        kej.a("BootImageMgr", "BootImageMgr init start");
        kej.a(kem.TAG, "init 校验冷启动配置");
        if (!kem.a().a("isColdStartEnabled") && this.p) {
            kej.a("BootImageMgr", "BootImageMgr init notColdStartEnabled");
            return false;
        }
        kej.a(kem.TAG, "init 校验热启动配置");
        if (!kem.a().a("isHotStartEnabled") && !this.p) {
            kej.a("BootImageMgr", "BootImageMgr init notHotStartEnabled");
            return false;
        }
        kej.a(kem.TAG, "init 黑名单校验");
        if (!this.p && !TextUtils.isEmpty(this.e) && (a2 = keo.a(kem.a().a(KeepModel.STRATEGY_BLACK_LIST, (String) null))) != null && a2.size() > 0 && a2.contains(this.e)) {
            kej.a("BootImageMgr", "BootImageMgr init block_by_black_white_list");
            return false;
        }
        kej.a(kem.TAG, "init 初始化参数校验");
        if (this.h == null || (weakReference = this.f16675a) == null || (activity2 = weakReference.get()) == null) {
            kej.a("BootImageMgr", "BootImageMgr init manager_member_illegal");
            return false;
        }
        this.b = keo.b();
        kej.a(kem.TAG, "init 冷启动优先初始化");
        if (this.p) {
            c(activity2);
            kej.a(kem.TAG, "init bootImageDialog show");
            i();
        }
        BootImageInfoManager bootImageInfoManager = this.r;
        bootImageInfoManager.f16647a = this.e;
        bootImageInfoManager.f = this.f16675a;
        if (!this.p) {
            com.taobao.bootimage.data.a k = BootImageDataMgr.a().k();
            if (!k.a()) {
                kej.a("BootImageMgr", "热启闪屏次数超过配置的总次数 ： " + k.c);
                z = false;
                if (z && !this.p && a(activity.getApplicationContext())) {
                    kej.a("BootImageMgr", "is in globalFatigue");
                    z = false;
                }
                if (z && this.r.b == null) {
                    kej.a(kem.TAG, "init updateImageInfo");
                    this.r.a();
                }
                if (this.r.d != BootImageInfoManager.ImageInfoStatus.READING || this.r.d == BootImageInfoManager.ImageInfoStatus.PENDING) {
                    kej.a(kem.TAG, "init imageInfo is reading or pending");
                    this.j = true;
                } else {
                    kej.a(kem.TAG, "init no imageInfo");
                    this.j = false;
                    kej.a("BootImageMgr", "pick info failure");
                    j();
                }
                kej.a(kem.TAG, "init result:" + this.j);
                kej.a("BootImageMgr", "mInited = " + this.j);
                return this.j;
            }
        }
        z = true;
        if (z) {
            kej.a("BootImageMgr", "is in globalFatigue");
            z = false;
        }
        if (z) {
            kej.a(kem.TAG, "init updateImageInfo");
            this.r.a();
        }
        if (this.r.d != BootImageInfoManager.ImageInfoStatus.READING) {
        }
        kej.a(kem.TAG, "init imageInfo is reading or pending");
        this.j = true;
        kej.a(kem.TAG, "init result:" + this.j);
        kej.a("BootImageMgr", "mInited = " + this.j);
        return this.j;
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        Long a2 = com.taobao.bootimage.linked.h.a(this.e).b().a();
        if (a2 == null) {
            kej.a("BootImageMgr", "pass,globalPeriodSeconds == null");
            return false;
        }
        long millis = TimeUnit.SECONDS.toMillis(a2.longValue());
        kep a3 = kep.a();
        a3.a(context);
        a3.a(millis);
        boolean c = a3.c();
        kej.a("BootImageMgr", "isBootImageGlobalFatigue = " + c);
        return c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.taobao.util.i, com.taobao.bootimage.d$a, com.taobao.bootimage.BootImageInfoManager] */
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = false;
        kej.a(kem.TAG, "bootImageMgr destory");
        try {
            if (this.k != null) {
                kej.a(kem.TAG, "===> bootImageMgr destroy removeMessages");
                this.k.removeMessages(1);
                this.k.removeMessages(2);
                this.k.a();
                this.k = null;
            }
            kej.a(kem.TAG, "destroy view");
            if (this.g.getAndSet(false) && this.b > 0 && this.c > 0) {
                Properties g = g();
                long b = keo.b();
                g.setProperty(ag.KEY_LOAD_TIME, Long.toString(b - this.b));
                g.setProperty("runTime", Long.toString(b - this.c));
                g.setProperty("close", this.f);
                TBS.Ext.commitEvent("BootImage_Finish", g);
                if (this.r != null) {
                    this.r.b();
                }
            }
            if (this.q != null) {
                this.q.a();
                if (this.n != null) {
                    this.n.removeView(this.q.g);
                }
            }
            j();
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } finally {
                this.k = null;
                this.h = null;
                this.r = null;
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "bootImageMgr startShowTimer start");
        if (this.r != null) {
            kej.a(kem.TAG, "bootImageMgr startShowTimer start22");
            BootImageInfo bootImageInfo = this.r.b;
            if (bootImageInfo != null) {
                int i = bootImageInfo.waitTime;
                if (i <= 0) {
                    i = 4;
                }
                long j = bootImageInfo.waitTimeOffsetSeconds;
                if (j <= 0) {
                    j = kem.a().b();
                }
                a((i + j) * 1000);
                kej.a(kem.TAG, "waitTime: " + i);
                return;
            } else if (this.r.d == BootImageInfoManager.ImageInfoStatus.PENDING || this.r.d == BootImageInfoManager.ImageInfoStatus.IDLE) {
                kej.a(kem.TAG, "bootImageMgr startShowTimer" + kem.a().d());
                this.k.sendEmptyMessageDelayed(2, (long) kem.a().d());
                return;
            } else {
                kej.a(kem.TAG, "bootImageMgr startShowTimer 异常了1");
                return;
            }
        }
        kej.a(kem.TAG, "bootImageMgr startShowTimer 异常了2");
    }

    public boolean d() {
        Activity activity;
        Activity activity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        kej.a(kem.TAG, "bootImageMgr show start");
        if (this.i) {
            kej.a("BootImageMgr", "show, true, mShowed");
            return true;
        }
        kej.a(kem.TAG, "bootImageMgr show start");
        if (this.j) {
            kej.a("BootImageMgr", "show(), start, mInited = true");
            final int i = this.p ? 1 : 2;
            kej.a("BootImageMgr", "layerType:" + i);
            if (this.r.d == BootImageInfoManager.ImageInfoStatus.READING) {
                kej.a(kem.TAG, "bootImageMgr show start");
                if (!this.p) {
                    WeakReference<Activity> weakReference = this.f16675a;
                    if (weakReference == null || (activity2 = weakReference.get()) == null) {
                        return false;
                    }
                    c(activity2);
                }
                kej.a("BootImageMgr", "show(), start, showContent");
                if (a(this.r.b, i)) {
                    this.i = true;
                }
            } else if (this.r.d == BootImageInfoManager.ImageInfoStatus.PENDING) {
                kej.a(kem.TAG, "bootImageMgr show start55");
                if (!this.p) {
                    WeakReference<Activity> weakReference2 = this.f16675a;
                    if (weakReference2 == null || (activity = weakReference2.get()) == null) {
                        return false;
                    }
                    c(activity);
                }
                TUrlImageView tUrlImageView = this.o;
                if (tUrlImageView != null) {
                    tUrlImageView.setVisibility(0);
                    this.o.setImageResource(R.drawable.splash);
                }
                this.r.e = new BootImageInfoManager.a() { // from class: com.taobao.bootimage.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.bootimage.BootImageInfoManager.a
                    public void a(BootImageInfoManager.ImageInfoStatus imageInfoStatus) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c86d7293", new Object[]{this, imageInfoStatus});
                            return;
                        }
                        kej.a(kem.TAG, "bootImageMgr show start66 status:" + imageInfoStatus);
                        if (!d.a(d.this)) {
                            return;
                        }
                        if (imageInfoStatus != BootImageInfoManager.ImageInfoStatus.READING) {
                            if (imageInfoStatus != BootImageInfoManager.ImageInfoStatus.INVALID) {
                                return;
                            }
                            d.a(d.this, 0L);
                            return;
                        }
                        d dVar = d.this;
                        if (d.a(dVar, d.b(dVar).b, i)) {
                            return;
                        }
                        d.a(d.this, 0L);
                    }
                };
                this.i = true;
            }
        }
        if (this.i) {
            kej.a(kem.TAG, "bootImageMgr show view start success");
            return true;
        }
        j();
        kej.a(kem.TAG, "bootImageMgr show view start fail");
        return false;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.k == null) {
        } else {
            kej.a(kem.TAG, "bootImageMgr stopInUIThreadAndNotifyListener");
            if (j > 0) {
                this.k.sendEmptyMessageDelayed(1, j);
            } else {
                this.k.sendEmptyMessage(1);
            }
        }
    }

    public boolean f() {
        BootImageInfoManager bootImageInfoManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        kej.a(kem.TAG, "bootImageMgr canShow start");
        if (!this.j || (bootImageInfoManager = this.r) == null) {
            kej.a("BootImageMgr", "canShow, false, mInited = false || mInfoManager == null");
            return false;
        } else if (bootImageInfoManager.d == BootImageInfoManager.ImageInfoStatus.PENDING || this.r.d == BootImageInfoManager.ImageInfoStatus.READING) {
            kej.a(kem.TAG, "bootImageMgr canShow success");
            kej.a("BootImageMgr", "canShow, true, mImageInfoStatus = (PENDING|READING)");
            return true;
        } else {
            kej.a("BootImageMgr", "canShow, false, mImageInfoStatus = " + this.r.d);
            return false;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a3f9ef", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    private boolean a(BootImageInfo bootImageInfo, int i) {
        Properties c;
        BootImageInfo bootImageInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8db739", new Object[]{this, bootImageInfo, new Integer(i)})).booleanValue();
        }
        kej.a(kem.TAG, "bootImageMgr showContent start");
        try {
            if (bootImageInfo == null) {
                kej.a("BootImageMgr", "showContent, return false, bootImageInfo == null");
                return false;
            } else if (this.n == null) {
                kej.a(kem.TAG, "show failed: no containerview.");
                return false;
            } else if (!this.j) {
                kej.a("BootImageMgr", "showContent, return false, mInited == false");
                return false;
            } else {
                if (this.r != null && (bootImageInfo2 = this.r.b) != null) {
                    BootImageDataMgr.a().a(bootImageInfo2.itemId, false, Long.valueOf(keo.b()));
                }
                if (1 == i) {
                    kej.a("BootImageMgr", "showContent, success false, TYPE_LAYER_VIEW == layerType");
                    kej.a(kem.TAG, "showContent view");
                    this.q = kek.a(bootImageInfo, this.m.getContext(), this.n);
                } else {
                    kej.a("BootImageMgr", "showContent, success false, other layerType");
                    kej.a(kem.TAG, "showContent activity");
                    Activity activity = this.f16675a.get();
                    if (activity != null) {
                        Intent intent = new Intent(activity, BootImageActivity.class);
                        intent.setAction(BootImageActivity.ACTION_FILL_CONTENT);
                        intent.putExtra(BootImageActivity.PARAM_BOOT_IMAGE_INFO, JSONObject.toJSONString(bootImageInfo));
                        if (this.r != null && (c = this.r.c()) != null) {
                            intent.putExtra("bidid", c.getProperty("bidid"));
                            intent.putExtra("feedid", c.getProperty("feedid"));
                        }
                        intent.putExtra("deviceScore", this.d);
                        intent.putExtra("pageName", this.e);
                        activity.startActivity(intent);
                        activity.overridePendingTransition(0, 0);
                        kej.a("BootImageMgr", "showContent, startActivity BootImageActivity");
                        return true;
                    }
                }
                if (this.q == null) {
                    return false;
                }
                if (!kek.a(bootImageInfo, this.p) && this.o != null) {
                    this.o.setVisibility(8);
                } else if (this.o != null) {
                    this.o.setVisibility(0);
                    this.o.setImageResource(R.drawable.splash);
                }
                this.q.d = new c.a() { // from class: com.taobao.bootimage.d.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.bootimage.view.c.a
                    public void a() {
                        BootImageInfo bootImageInfo3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        kej.a(kem.TAG, "bootImageMgr showContent onSuccess");
                        if (d.b(d.this) == null || !d.c(d.this) || d.b(d.this).b == null || d.d(d.this) == null) {
                            kej.a(kem.TAG, "showContainerView failed: resources is release.");
                            d.a(d.this, 0L);
                            return;
                        }
                        d.d(d.this).setVisibility(0);
                        d.e(d.this);
                        if (d.b(d.this) == null || (bootImageInfo3 = d.b(d.this).b) == null) {
                            return;
                        }
                        BootImageDataMgr.a().a(bootImageInfo3.itemId, true, null);
                        BootImageDataMgr.a().a(d.e(d.this));
                        long b = keo.b() - d.f(d.this);
                        kej.a(kem.TAG, "launchTime: " + b);
                        AppMonitor.Counter.commit(BootImageDataMgr.CACHE_MODULE, "launchTime", bootImageInfo3.itemId, (double) b);
                        TBS.Ext.commitEvent("BootImage_Show", d.g(d.this));
                        d.h(d.this).set(true);
                        d.b(d.this, keo.b());
                        AppMonitor.Alarm.commitSuccess(BootImageDataMgr.CACHE_MODULE, "showresult");
                        if (d.i(d.this) == null) {
                            return;
                        }
                        d.i(d.this).setVisibility(8);
                    }

                    @Override // com.taobao.bootimage.view.c.a
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        kej.a(kem.TAG, "bootImageMgr showContent close");
                        d.a(d.this, str);
                        d.j(d.this);
                    }

                    @Override // com.taobao.bootimage.view.c.a
                    public void a(int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                            return;
                        }
                        d.j(d.this);
                        AppMonitor.Alarm.commitFail(BootImageDataMgr.CACHE_MODULE, "showresult", "" + i2, "onerror");
                        kej.a(kem.TAG, "bootImageMgr showContent error");
                    }

                    @Override // com.taobao.bootimage.view.c.a
                    public void b(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            TBS.Ext.commitEvent(str, d.g(d.this));
                        }
                    }
                };
                boolean b = this.q.b();
                if (b) {
                    ViewGroup viewGroup = this.q.g;
                    if (viewGroup != null) {
                        kej.a(kem.TAG, "bootImageMgr showContent success");
                        this.n.addView(viewGroup);
                        HashMap<String, String> hashMap = new HashMap<>();
                        Activity activity2 = this.f16675a.get();
                        if (activity2 != null) {
                            hashMap.put("page", activity2.getClass().getSimpleName());
                        }
                        alj.a().a(PopStrategy.IDENTIFIER_SPLASH, hashMap);
                    } else {
                        kej.a(kem.TAG, "bootImageMgr showContent fail");
                        return false;
                    }
                }
                return b;
            }
        } catch (Throwable th) {
            kej.a(kem.TAG, "show error:", th);
            return false;
        }
    }

    private void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        kej.a(kem.TAG, "initBootImageDialog view");
        this.m = new FrameLayout(activity);
        this.n = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.p) {
            layoutParams.setMargins(0, c.a().c(), 0, 0);
        }
        this.n.setLayoutParams(layoutParams);
        this.n.setVisibility(4);
        this.m.addView(this.n);
        this.o = new TUrlImageView(activity.getApplicationContext());
        this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.o.setScaleType(ImageView.ScaleType.FIT_XY);
        this.m.addView(this.o);
    }

    private Properties g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("f3e90824", new Object[]{this});
        }
        Properties properties = new Properties();
        BootImageInfoManager bootImageInfoManager = this.r;
        if (bootImageInfoManager == null) {
            return properties;
        }
        Properties c = bootImageInfoManager.c();
        if (c != null) {
            properties = c;
        }
        BootImageInfo bootImageInfo = this.r.b;
        if (bootImageInfo == null) {
            return properties;
        }
        properties.setProperty("type", bootImageInfo.bizType);
        properties.setProperty("id", bootImageInfo.itemId);
        properties.setProperty(LogStrategyManager.ACTION_TYPE_BOOT, Boolean.toString(this.p));
        properties.setProperty("deviceScore", this.d);
        properties.setProperty("page", this.e);
        return properties;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "bootImageMgr stopAndNotifyListener start");
        a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        b();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            kej.a(kem.TAG, "bootImageMgr handleMessage MSG_STOP_AND_NOTIFY_BOOTIMAGE");
            h();
        } else if (i == 2) {
            kej.a(kem.TAG, "bootImageMgr handleMessage MSG_STOP_PENDING_BOOTIMAGE11");
            BootImageInfoManager bootImageInfoManager = this.r;
            if (bootImageInfoManager == null || bootImageInfoManager.d != BootImageInfoManager.ImageInfoStatus.READING) {
                kej.a(kem.TAG, "bootImageMgr handleMessage MSG_STOP_PENDING_BOOTIMAGE22");
                h();
            } else if (this.r.b != null) {
                kej.a(kem.TAG, "bootImageMgr handleMessage MSG_STOP_PENDING_BOOTIMAGE33");
                c();
            }
        }
        return true;
    }

    public static FrameLayout b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c6b99d7e", new Object[]{activity});
        }
        View findViewById = activity.findViewById(16908290);
        while (true) {
            ViewParent parent = findViewById.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            findViewById = (ViewGroup) parent;
        }
        if (findViewById != null && (findViewById instanceof FrameLayout)) {
            return (FrameLayout) findViewById;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (childAt != null && (childAt instanceof FrameLayout)) {
            return (FrameLayout) childAt;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "showSplashView activity or view");
        Activity activity = this.f16675a.get();
        kej.a(kem.TAG, "show splash view");
        if (activity == null) {
            return;
        }
        this.n.setVisibility(0);
        if (this.m.getParent() != null) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        b(activity).addView(this.m, new FrameLayout.LayoutParams(-1, -1));
    }

    private void j() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "hideSplashView");
        ViewGroup viewGroup = this.m;
        if (viewGroup != null && viewGroup.getParent() != null && (activity = this.f16675a.get()) != null) {
            b(activity).removeView(this.m);
        }
        this.o = null;
        this.m = null;
        this.n = null;
        this.q = null;
    }
}
