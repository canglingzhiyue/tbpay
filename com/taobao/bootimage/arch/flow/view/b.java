package com.taobao.bootimage.arch.flow.view;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.taobao.util.i;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.arch.flow.view.d;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.h;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.kej;
import tb.keq;
import tb.kge;
import tb.pbe;
import tb.srn;
import tb.ssf;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BootImageInfo f16665a;
    private final d b;
    private int c;
    private d.a.InterfaceC0637a d;
    private int e;
    private String g = "ColdStart";
    private int h = 200;
    private boolean k = false;
    private final i i = new i(Looper.getMainLooper()) { // from class: com.taobao.bootimage.arch.flow.view.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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
            if (message.what == 1002) {
                kej.a("2ARCH_Presenter", "handleMessage: 跳过点击");
                b.a(b.this, 201);
                b.a(b.this, keq.EXPOSE_SUCCESS, (String) null);
                b.a(b.this);
            }
            if (message.what == 1000) {
                b.b(b.this);
                b bVar = b.this;
                b.a(bVar, String.valueOf(b.c(bVar)));
                if (b.c(b.this) <= 0) {
                    kej.a("2ARCH_Presenter", "handleMessage: 倒计时结束");
                    b.a(b.this, 200);
                    b.a(b.this, keq.EXPOSE_SUCCESS, (String) null);
                    b.a(b.this);
                    return;
                }
                sendEmptyMessageDelayed(1000, 1000L);
            }
            if (message.what != 1001) {
                return;
            }
            b.d(b.this);
        }
    };
    private final pbe.a j = new pbe.a() { // from class: com.taobao.bootimage.arch.flow.view.b.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pbe.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            kej.a("2ARCH_Presenter", "show video: on started");
            b.i(b.this).sendEmptyMessageDelayed(1001, b.j(b.this) == null ? 0L : b.j(b.this).removeBGDelayMs);
            b.a(b.this, keq.VIDEO_PLAY_START, (String) null);
        }

        @Override // tb.pbe.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            kej.a("2ARCH_Presenter", "show video: onComplete:" + System.currentTimeMillis());
            b.a(b.this, keq.VIDEO_PLAY_SUCCESS, (String) null);
        }

        @Override // tb.pbe.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            b.f(b.this).l();
            kej.a("2ARCH_Presenter", "onError: what " + i + " , extra " + i2);
            b.a(b.this, keq.VIDEO_PLAY_ERROR, String.valueOf(i));
        }
    };
    private final keq f = h.a("").h();

    static {
        kge.a(1369439528);
    }

    public static /* synthetic */ int a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60287d56", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.h = i;
        return i;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7d29a0", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    public static /* synthetic */ void a(b bVar, d.a.b bVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9094929", new Object[]{bVar, bVar2, new Boolean(z)});
        } else {
            bVar.a(bVar2, z);
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1272b6a", new Object[]{bVar, str});
        } else {
            bVar.a(str);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf240eb4", new Object[]{bVar, str, str2});
        } else {
            bVar.a(str, str2);
        }
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("526992f2", new Object[]{bVar})).intValue();
        }
        int i = bVar.c;
        bVar.c = i - 1;
        return i;
    }

    public static /* synthetic */ int c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1555fc51", new Object[]{bVar})).intValue() : bVar.c;
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84265bd", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b2ecf20", new Object[]{bVar})).booleanValue() : bVar.k;
    }

    public static /* synthetic */ d f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("995693f1", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ d.a.InterfaceC0637a g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a.InterfaceC0637a) ipChange.ipc$dispatch("67a30496", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f40b39", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    public static /* synthetic */ i i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("33351bec", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ BootImageInfo j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("39d04c9d", new Object[]{bVar}) : bVar.f16665a;
    }

    public b(BootImageInfo bootImageInfo, d dVar) {
        this.f16665a = bootImageInfo;
        this.b = dVar;
        kej.a("2ARCH_Presenter", "BootImagePresenter data: " + this.f16665a.toString());
    }

    public c a(Activity activity, int i, d.a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3454b699", new Object[]{this, activity, new Integer(i), bVar});
        }
        this.g = i == 1000 ? "ColdStart" : "HotStart";
        if (activity == null) {
            this.h = 202;
            a(keq.EXPOSE_ERROR, "activity null");
            return new c();
        }
        c a2 = this.b.a(activity);
        if (a2 == null) {
            this.h = 202;
            a(keq.EXPOSE_ERROR, "baseView null");
            return new c();
        } else if (StringUtils.isEmpty(this.f16665a.bizType)) {
            a(keq.EXPOSE_ERROR, "bizType null");
            this.h = 202;
            return new c();
        } else {
            if (!this.f16665a.hideTBLogo && ssf.b(this.f16665a.bizType)) {
                this.b.h();
            }
            if (ssf.c(this.f16665a.bizType)) {
                this.b.i();
            }
            if (ssf.d(this.f16665a.bizType)) {
                this.b.j();
            }
            if (ssf.e(this.f16665a.bizType)) {
                this.b.k();
            }
            this.e = ssf.a(this.f16665a.bizType);
            int i2 = this.e;
            if (i2 == 2) {
                kej.a("2ARCH_Presenter", "createView: OTHER");
                a(keq.EXPOSE_ERROR, "viewType Other error");
                return new c();
            }
            this.k = true;
            if (i2 == 1) {
                kej.a("2ARCH_Presenter", "createView: IMAGE");
                if (!srn.a(this.f16665a.imgUrl)) {
                    this.h = 203;
                    return new c();
                }
                a(bVar, false);
                return a2;
            }
            if (i2 == 0) {
                kej.a("2ARCH_Presenter", "createView: VIDEO");
                if (!srn.a(this.f16665a.imgUrl) && !srn.a(this.f16665a.firstFrameImageUrl)) {
                    this.h = 203;
                    return new c();
                }
                a(bVar);
                if (StringUtils.isEmpty(this.f16665a.videoUrl)) {
                    kej.a("2ARCH_Presenter", "createView: videoUrl null loadFirstFrame");
                    return a2;
                } else if (!this.b.a(this.f16665a.videoUrl, this.f16665a.haveVoice, this.j)) {
                    this.h = 204;
                }
            }
            return a2;
        }
    }

    public void a(d.a.InterfaceC0637a interfaceC0637a, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4276870", new Object[]{this, interfaceC0637a, new Boolean(z)});
            return;
        }
        kej.a("2ARCH_Presenter", "notifyViewShow needPlay: " + z);
        this.d = interfaceC0637a;
        this.b.g();
        if (this.e != 0 || !z) {
            return;
        }
        kej.a("2ARCH_Presenter", "notifyViewShow playVideo: ");
        e();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = this.f16665a.waitTime;
        g();
        kej.a("2ARCH_Presenter", "startCountDown: " + this.c);
        this.b.a(String.valueOf(this.c));
        this.i.sendEmptyMessageDelayed(1000, 1000L);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kej.a("2ARCH_Presenter", "setCountDownText: ");
        this.b.a(str);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        kej.a("2ARCH_Presenter", "onTerminate: ");
        this.k = false;
        this.i.removeCallbacksAndMessages(null);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        this.b.o();
        d.a.InterfaceC0637a interfaceC0637a = this.d;
        if (interfaceC0637a == null) {
            return;
        }
        interfaceC0637a.a();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        kej.a("2ARCH_Presenter", "removeFirstImage: ");
        if (this.h == 204) {
            kej.a("2ARCH_Presenter", "LOAD_VIDEO_FAIL not removeFirstImage: ");
        } else {
            this.b.m();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        kej.a("2ARCH_Presenter", "playVideo: ");
        this.b.n();
    }

    private void a(final d.a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e9b43", new Object[]{this, bVar});
            return;
        }
        kej.a("2ARCH_Presenter", "loadFirstFrameImage: " + this.f16665a.firstFrameImageUrl);
        a(this.f16665a.firstFrameImageUrl, new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.arch.flow.view.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!b.e(b.this)) {
                    kej.a("2ARCH_Presenter", "loadFirstFrameImage success not CreateBootImage: return");
                    return true;
                }
                kej.a("2ARCH_Presenter", "loadFirstFrameImage success: ");
                b.f(b.this).a(succPhenixEvent.getDrawable());
                b bVar2 = b.this;
                bVar2.a(b.g(bVar2), true);
                b.h(b.this);
                return true;
            }
        }, new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.arch.flow.view.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (!b.e(b.this)) {
                    kej.a("2ARCH_Presenter", "loadFirstFrameImage fail not CreateBootImage: return");
                    return false;
                }
                kej.a("2ARCH_Presenter", "loadFirstFrameImage fail: ");
                b.a(b.this, bVar, true);
                return false;
            }
        });
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.a(new View.OnClickListener() { // from class: com.taobao.bootimage.arch.flow.view.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    kej.a("2ARCH_Presenter", "onClick: skip");
                    b.a(b.this, 201);
                    b.i(b.this).sendEmptyMessage(1002);
                }
            });
        }
    }

    private void a(final d.a.b bVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4357ff1", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        kej.a("2ARCH_Presenter", "loadDefaultImage: " + this.f16665a.imgUrl);
        a(this.f16665a.imgUrl, new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.arch.flow.view.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!b.e(b.this)) {
                    kej.a("2ARCH_Presenter", "loadDefaultImage success not CreateBootImage: return");
                    return true;
                }
                kej.a("2ARCH_Presenter", "loadDefaultImage success playVideo: " + z);
                b.f(b.this).b(succPhenixEvent.getDrawable());
                b bVar2 = b.this;
                bVar2.a(b.g(bVar2), z);
                b.h(b.this);
                return true;
            }
        }, new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.arch.flow.view.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                if (!b.e(b.this)) {
                    kej.a("2ARCH_Presenter", "loadDefaultImage fail not CreateBootImage: return");
                    return false;
                }
                kej.a("2ARCH_Presenter", "loadDefaultImage fail: " + failPhenixEvent.getResultCode());
                b.a(b.this, 203);
                b.a(b.this);
                bVar.a("loadDefaultImage fail");
                return false;
            }
        });
    }

    private void a(String str, com.taobao.phenix.intf.event.a<SuccPhenixEvent> aVar, com.taobao.phenix.intf.event.a<FailPhenixEvent> aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d5d690", new Object[]{this, str, aVar, aVar2});
            return;
        }
        String b = srn.b(str);
        kej.a("2ARCH_Presenter", "loadImage originalUrl:" + str + ",suffixImageUrl: " + b);
        PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, b);
        a2.mo1206onlyCache();
        a2.succListener(aVar);
        a2.failListener(aVar2);
        a2.fetch();
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f.a(this.f16665a.sceneType, this.g, str, this.f16665a.bizType, str2, null);
        }
    }
}
