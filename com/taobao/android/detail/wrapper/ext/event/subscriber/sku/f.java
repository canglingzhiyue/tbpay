package com.taobao.android.detail.wrapper.ext.event.subscriber.sku;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import tb.dyn;
import tb.dyo;
import tb.ecg;
import tb.eik;
import tb.eip;
import tb.eja;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes5.dex */
public class f implements eja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Runnable f11302a = new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (f.a(f.this) == null || f.b(f.this) == null) {
                i.c(n.a("StreamSKUDataProvider"), "activity为空 异常");
            } else {
                String b = dyo.b(f.a(f.this));
                dyo.a b2 = dyo.b(b);
                if (b2 == null || StringUtils.isEmpty(b2.d)) {
                    i.c(n.a("StreamSKUDataProvider"), "post delay 没有获取到数据");
                    f fVar = f.this;
                    f.a(fVar, f.b(fVar));
                    return;
                }
                if (b2.c != null) {
                    f.a(f.this, b2.c.booleanValue());
                }
                b2.f27116a = 1;
                dyo.a(b);
                f.b(f.this).a(b2.d);
                i.c(n.a("StreamSKUDataProvider"), "post delay 获取数据");
                ecg.s(f.a(f.this), (f.a(f.this).y() == null || f.a(f.this).y().f == null) ? "" : f.a(f.this).y().f.f27180a);
            }
        }
    };
    private final DetailCoreActivity b;
    private dyn c;

    static {
        kge.a(2055703785);
        kge.a(898066342);
    }

    public static /* synthetic */ DetailCoreActivity a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("57d9a96b", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ void a(f fVar, dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583e6eb7", new Object[]{fVar, dynVar});
        } else {
            fVar.b(dynVar);
        }
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4703574", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.a(z);
        }
    }

    public static /* synthetic */ dyn b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyn) ipChange.ipc$dispatch("2d23a2ec", new Object[]{fVar}) : fVar.c;
    }

    public f(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.sku.StreamSKUDataProvider");
    }

    @Override // tb.eja
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String b = dyo.b(this.b);
        dyo.a b2 = dyo.b(b);
        if (b2 == null || StringUtils.isEmpty(b2.d)) {
            i.c(n.a("StreamSKUDataProvider"), "获取流式分段合并数据的结果为空");
            return null;
        }
        if (b2.c != null) {
            a(b2.c.booleanValue());
        }
        i.c(n.a("StreamSKUDataProvider"), "获取流式分段合并数据的结果不为空");
        b2.f27116a = 1;
        dyo.a(b);
        return b2.d;
    }

    private void a(boolean z) {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.b.C();
        if (C == null || (f = eqb.f(C.f10055a)) == null) {
            return;
        }
        f.newbuyShowSku = z;
    }

    @Override // tb.eja
    public void a(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e615a9bf", new Object[]{this, dynVar});
            return;
        }
        dyo.a b = dyo.b(dyo.b(this.b));
        this.c = dynVar;
        DetailCoreActivity detailCoreActivity = this.b;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            i.c(n.a("StreamSKUDataProvider"), "requestSKUData 方法参数异常了");
        } else if (b == null || b.f27116a == 3) {
            i.c(n.a("StreamSKUDataProvider"), "DetailStreamDataEngine.status:error");
            b(dynVar);
        } else if (!eip.u) {
            b(dynVar);
        } else {
            Handler A = this.b.A();
            if (A == null) {
                b(dynVar);
                i.c(n.a("StreamSKUDataProvider"), "handler 参数异常了");
                return;
            }
            A.removeCallbacks(this.f11302a);
            A.postDelayed(this.f11302a, eik.h());
            this.b.a(this.f11302a);
        }
    }

    private void b(final dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d498b040", new Object[]{this, dynVar});
            return;
        }
        this.b.y().a(new dyn() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.sku.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dyn
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                i.c(n.a("StreamSKUDataProvider"), "发起全量兜底请求成功");
                dynVar.a(str);
                f.a(f.this).y().a((dyn) null);
            }

            @Override // tb.dyn
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                i.c(n.a("StreamSKUDataProvider"), "发起全量兜底请求失败");
                dynVar.b(str);
                f.a(f.this).y().a((dyn) null);
            }
        });
        this.b.x();
        i.c(n.a("StreamSKUDataProvider"), "拉起sku面板无数据，发起全量兜底请求");
        ecg.o(this.b, this.b.y().f != null ? this.b.y().f.f27180a : "");
    }
}
