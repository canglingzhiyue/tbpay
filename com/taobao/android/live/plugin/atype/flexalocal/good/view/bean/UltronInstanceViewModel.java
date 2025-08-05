package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ConfigSource;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.TaoLiveMtopSubscriber;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taolive.sdk.utils.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.afn;
import tb.afo;
import tb.afq;
import tb.fnq;
import tb.hgy;
import tb.hgz;
import tb.hha;
import tb.hhd;
import tb.hhf;
import tb.hhg;
import tb.hhh;
import tb.hhi;
import tb.hhj;
import tb.hhk;
import tb.hhl;
import tb.hhm;
import tb.hhn;
import tb.hhp;
import tb.hhu;
import tb.hil;
import tb.his;
import tb.kge;
import tb.pgx;
import tb.phe;
import tb.pqj;
import tb.tet;

/* loaded from: classes6.dex */
public class UltronInstanceViewModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13834a;
    public ConfigSource b;
    private volatile com.alibaba.android.ultron.vfw.instance.d d;
    public boolean h;
    private final MutableLiveData<Boolean> e = new MutableLiveData<>();
    private boolean f = false;
    public final LiveData<Boolean> c = this.e;
    public f g = new f();
    private Deque<List<IDMComponent>> j = new ArrayDeque();
    private AtomicBoolean k = new AtomicBoolean(false);
    public boolean l = false;
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            UltronInstanceViewModel.e(UltronInstanceViewModel.this).set(false);
            if (message.what != 1 || message.obj == null) {
                return;
            }
            UltronInstanceViewModel.a(UltronInstanceViewModel.this).addAll((List) message.obj);
            his.c("UltronInstanceViewModel", "generateDMComponents | update cache.");
        }
    };

    static {
        kge.a(-1143180960);
    }

    public static /* synthetic */ Object ipc$super(UltronInstanceViewModel ultronInstanceViewModel, String str, Object... objArr) {
        if (str.hashCode() == -607929644) {
            super.onCleared();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Deque a(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Deque) ipChange.ipc$dispatch("df92d6a8", new Object[]{ultronInstanceViewModel}) : ultronInstanceViewModel.j;
    }

    public static /* synthetic */ MutableLiveData b(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLiveData) ipChange.ipc$dispatch("dd7cd8af", new Object[]{ultronInstanceViewModel}) : ultronInstanceViewModel.e;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.d c(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("a6f8459e", new Object[]{ultronInstanceViewModel}) : ultronInstanceViewModel.d;
    }

    public static /* synthetic */ Handler d(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4dd9ba4c", new Object[]{ultronInstanceViewModel}) : ultronInstanceViewModel.i;
    }

    public static /* synthetic */ AtomicBoolean e(UltronInstanceViewModel ultronInstanceViewModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("a216fe3b", new Object[]{ultronInstanceViewModel}) : ultronInstanceViewModel.k;
    }

    public com.alibaba.android.ultron.vfw.instance.d a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("5d0893f4", new Object[]{this, cVar});
        }
        if (this.d != null && this.d.a() == cVar.f()) {
            his.b("VMUltronInstance", "直播间内复用奥创引擎");
            this.d.q().v().a();
            this.d.q().v().a("dinamicx", new com.alibaba.android.ultron.vfw.viewholder.d(this.d.q()));
            this.d.a(1544903441687469454L, new pgx());
            return this.d;
        }
        this.h = (cVar.t().itemConfigInfo != null && com.taobao.taolive.sdk.utils.l.a(cVar.t().itemConfigInfo.getString("matchNewVersion"), 0) > 0) && v.b.a("goodlist", "enableNewGLPage", true);
        try {
            fnq.a(SmartLandingTask.Operation.STR_EQUAL, new hil());
        } catch (DinamicException e) {
            e.printStackTrace();
        }
        this.d = com.alibaba.android.ultron.vfw.instance.d.a(new UltronInstanceConfig().a(true).a("live").c(false), cVar.f());
        his.b("VMUltronInstance", "create Ultron Instance: " + this.d.hashCode());
        this.d.a(hgz.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new hgz());
        this.d.a(hgy.DX_PARSER_CALLFUN, new hgy());
        this.d.a(hha.DX_PARSER_TBLIVE_GETSERVERTIME, new hha());
        this.d.a(tet.DX_PARSER_TAOLIVEDXAB, new tet());
        this.d.a(afn.a(), new afn());
        this.d.a("tlStrMap", new afo());
        this.d.a(hhi.DX_EVENT_TBLIVE_ADDTOCART, new hhi());
        this.d.a(hhf.DX_EVENT_TBLIVEGOTODETAIL, new hhf());
        this.d.a(hhg.DX_EVENT_TBLIVEROOMACTION, new hhg());
        this.d.a(hhh.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new hhh());
        this.d.a(hhp.DX_EVENT_TLOPENINTERACTIVECOMPONENT, new hhp());
        this.d.a(hhk.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new hhk());
        this.d.a(hhj.DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT, new hhj());
        this.d.a(hhd.DX_EVENT_TAOLIVEROOMCOMMONHANDLER, new hhd());
        this.d.a(hhn.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new hhn());
        this.d.a(hhl.DX_EVENT_TBLIVE_GOODS_TOP_CARD, new hhl());
        this.d.a(hhm.DX_EVENT_TBLIVE_PRESALE, new hhm());
        this.d.a(hhu.DXTBLTIMER_TBLTIMER, new hhu.a());
        this.d.a(1544903441687469454L, new pgx());
        this.d.d().a("AbilityHub", new phe());
        this.d.d().a("tlOpenUrl", new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.c());
        this.d.d().a("tlToast", new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.d());
        this.d.d().a("tlMtop", new TaoLiveMtopSubscriber());
        this.d.d().a("tlTrack", new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.e());
        this.g.c();
        this.g.a(this.d);
        b(cVar);
        return this.d;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            c();
        }
    }

    private void b(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735816d0", new Object[]{this, cVar});
            return;
        }
        his.b("UltronInstanceViewModel", "fetchUltronConfig.");
        final Handler handler = new Handler(Looper.getMainLooper());
        final com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.i iVar = new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.i() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.i
            public void a(final String str, final ConfigSource configSource) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("731aa01a", new Object[]{this, str, configSource});
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        his.b("UltronInstanceViewModel", "onConfigFetched | source=" + configSource + " ultronConfigSource=" + UltronInstanceViewModel.this.b);
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (UltronInstanceViewModel.this.b != null && configSource.getIntValue() < UltronInstanceViewModel.this.b.getIntValue()) {
                            return;
                        }
                        UltronInstanceViewModel.this.b = configSource;
                        UltronInstanceViewModel.this.f13834a = str;
                        if (!TextUtils.isEmpty(UltronInstanceViewModel.this.f13834a)) {
                            UltronInstanceViewModel.this.f13834a = UltronInstanceViewModel.this.f13834a.replace("#{", "${");
                        }
                        UltronInstanceViewModel.b(UltronInstanceViewModel.this).setValue(Boolean.TRUE);
                    }
                };
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final boolean a2 = a.a(cVar);
                CountDownLatch countDownLatch = new CountDownLatch(3);
                new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.g(countDownLatch, a2).a(iVar);
                new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.h(countDownLatch, UltronInstanceViewModel.c(UltronInstanceViewModel.this) == null ? null : UltronInstanceViewModel.c(UltronInstanceViewModel.this).a(), a2).a(iVar);
                new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.l(countDownLatch, a2).a(iVar);
                try {
                    countDownLatch.await(1500L, TimeUnit.MILLISECONDS);
                    handler.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (ConfigSource.FILE != UltronInstanceViewModel.this.b) {
                                com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.k.a(UltronInstanceViewModel.this.f13834a, a2 ? "taolivegoodspage2" : "taolivegoodspage");
                            }
                            if (UltronInstanceViewModel.c(UltronInstanceViewModel.this) == null) {
                                return;
                            }
                            UltronInstanceViewModel.this.a();
                        }
                    });
                } catch (Throwable th) {
                    his.d("VMUltronInstance", th.toString());
                }
            }
        }, 50);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        his.b("VMUltronInstance", "开始下载或更新DX2 模板信息!, source=" + this.b + "    thread=" + Thread.currentThread() + "    this=" + this);
        JSONObject b = pqj.b(this.f13834a);
        if (b == null) {
            return;
        }
        this.d.r().a(b);
        this.d.a((d.c) null);
        this.d.q().g();
        this.f = true;
    }

    public f d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ce66c00f", new Object[]{this}) : this.g;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (TextUtils.isEmpty(this.f13834a) || this.d == null || this.k.compareAndSet(true, true)) {
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (UltronInstanceViewModel.c(UltronInstanceViewModel.this) == null) {
                        UltronInstanceViewModel.e(UltronInstanceViewModel.this).set(false);
                    } else {
                        com.alibaba.android.ultron.vfw.instance.d c = UltronInstanceViewModel.c(UltronInstanceViewModel.this);
                        his.c("UltronInstanceViewModel", "generateDMComponents | start.");
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < 20; i++) {
                            c.r().a(pqj.b(UltronInstanceViewModel.this.f13834a));
                            c.a(new afq(UltronInstanceViewModel.this.l ? "normal2" : "normal"));
                            arrayList.add(c.k().f());
                        }
                        his.c("UltronInstanceViewModel", "generateDMComponents | end.");
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = arrayList;
                        UltronInstanceViewModel.d(UltronInstanceViewModel.this).sendMessage(obtain);
                    }
                }
            });
        }
    }

    public List<IDMComponent> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        if (this.l && !TextUtils.equals(str, "normal2")) {
            return null;
        }
        if (!this.l && !TextUtils.equals(str, "normal")) {
            return null;
        }
        if (this.j.size() < 5) {
            b();
        }
        if (this.j.isEmpty()) {
            return null;
        }
        his.c("UltronInstanceViewModel", "getCacheComponents | in cache. cardType=" + str);
        return this.j.pop();
    }

    @Override // android.arch.lifecycle.ViewModel
    public void onCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3bad4", new Object[]{this});
            return;
        }
        super.onCleared();
        if (this.d != null) {
            String str = "Ultron Instance: " + this.d.hashCode() + " to destroy! with ViewModel Clear";
            this.d.m();
            this.d = null;
        }
        this.g.c();
        this.k.set(false);
        this.i.removeMessages(1);
    }
}
