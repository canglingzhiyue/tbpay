package com.alibaba.android.aura.service.parse;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqq;
import tb.arc;
import tb.arj;
import tb.bbh;
import tb.bbl;
import tb.kge;

/* loaded from: classes2.dex */
public final class a extends arj<AURAParseIO, AURARenderIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSE_SERVICE_CODE = "aura.service.parse";

    /* renamed from: a  reason: collision with root package name */
    private c f2176a;
    private q c;

    static {
        kge.a(1012563142);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 339629984) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.c = qVar;
    }

    @Override // tb.arj
    public void a(AURAInputData<AURAParseIO> aURAInputData, aqq<AURARenderIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        this.f2176a = new AURAParseProcessor(this.c, new C0068a(aURAInputData, aqqVar), getExtensionManager());
        this.f2176a.a(aURAInputData.getGlobalData(), aURAInputData.getData());
    }

    /* renamed from: com.alibaba.android.aura.service.parse.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0068a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AURAInputData<AURAParseIO> f2177a;
        private final aqq<AURARenderIO> b;

        static {
            kge.a(297035272);
            kge.a(-416315845);
        }

        public static /* synthetic */ AURAInputData a(C0068a c0068a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURAInputData) ipChange.ipc$dispatch("ff403145", new Object[]{c0068a}) : c0068a.f2177a;
        }

        public static /* synthetic */ void a(C0068a c0068a, AURARenderComponent aURARenderComponent, AURAInputData aURAInputData, aqq aqqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23ea3fb9", new Object[]{c0068a, aURARenderComponent, aURAInputData, aqqVar});
            } else {
                c0068a.a(aURARenderComponent, aURAInputData, aqqVar);
            }
        }

        public static /* synthetic */ aqq b(C0068a c0068a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("32efce8a", new Object[]{c0068a}) : c0068a.b;
        }

        public C0068a(AURAInputData<AURAParseIO> aURAInputData, aqq<AURARenderIO> aqqVar) {
            this.f2177a = aURAInputData;
            this.b = aqqVar;
        }

        @Override // com.alibaba.android.aura.service.parse.b
        public void a(final AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            } else if (bbl.a()) {
                a(aURARenderComponent, this.f2177a, this.b);
            } else {
                final long currentTimeMillis = System.currentTimeMillis();
                bbh.b().postAtFrontOfQueue(new Runnable() { // from class: com.alibaba.android.aura.service.parse.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C0068a.a("线程切换耗时：" + (currentTimeMillis2 - currentTimeMillis), currentTimeMillis, currentTimeMillis2);
                        C0068a c0068a = C0068a.this;
                        C0068a.a(c0068a, aURARenderComponent, C0068a.a(c0068a), C0068a.b(C0068a.this));
                    }
                });
            }
        }

        public static void a(String str, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a352e032", new Object[]{str, new Long(j), new Long(j2)});
            } else {
                arc.a().a(str, arc.a.a().a("AURA/performance").a("switchThreadStartTime", j).a("switchThreadEndTime", j2).b());
            }
        }

        @Override // com.alibaba.android.aura.service.parse.b
        public void a(final com.alibaba.android.aura.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            } else {
                bbh.a(new Runnable() { // from class: com.alibaba.android.aura.service.parse.a.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            C0068a.b(C0068a.this).a(bVar);
                        }
                    }
                }, 0L);
            }
        }

        private void a(AURARenderComponent aURARenderComponent, AURAInputData<AURAParseIO> aURAInputData, aqq<AURARenderIO> aqqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8ea6d0b", new Object[]{this, aURARenderComponent, aURAInputData, aqqVar});
            } else if (aURARenderComponent == null) {
                aqqVar.a(new com.alibaba.android.aura.b(0, "AURAParseServiceDomain", "-1000_EMPTY_RENDER_TREE", "渲染树生成失败"));
            } else {
                aqqVar.a(com.alibaba.android.aura.datamodel.c.a(new AURARenderIO(aURARenderComponent), aURAInputData));
            }
        }
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.f2176a;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }
}
