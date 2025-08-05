package com.alibaba.android.umf.node.service.parse;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.b;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.alibaba.android.umf.node.service.parse.ParseProcess;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bpx;
import tb.bqb;
import tb.bqd;
import tb.bqe;
import tb.bqo;
import tb.bqp;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends bqo<UMFParseIO, UMFRenderIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ParseProcess f2849a = new ParseProcess();
    private final ParseProcess.a b = new ParseProcess.a() { // from class: com.alibaba.android.umf.node.service.parse.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.umf.node.service.parse.ParseProcess.a
        public void a(List<AURARenderComponent> list, List<Map<String, String>> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            } else if (a.a(a.this) != null && list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Map<String, String> map : list2) {
                    if (map != null) {
                        for (String str : map.keySet()) {
                            arrayList.add(new b.a(str, map.get(str)));
                        }
                    }
                }
                b bVar = new b();
                bVar.a(arrayList);
                a.a(a.this).a((bpx) new UMFRenderIO(list, bVar));
            }
        }
    };
    private bpx<UMFRenderIO> c;

    static {
        kge.a(536045999);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1108555646) {
            super.onAfterExecute((UMFBaseIO) objArr[0], (com.alibaba.android.umf.datamodel.b) objArr[1]);
            return null;
        } else if (hashCode != 2016452897) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onBeforeExecute((UMFBaseIO) objArr[0], (com.alibaba.android.umf.datamodel.b) objArr[1]);
            return null;
        }
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onAfterExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdecc882", new Object[]{this, uMFBaseIO, bVar});
        } else {
            a((UMFRenderIO) uMFBaseIO, bVar);
        }
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onBeforeExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7830a121", new Object[]{this, uMFBaseIO, bVar});
        } else {
            a((UMFParseIO) uMFBaseIO, bVar);
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar, bpx bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b708d66", new Object[]{this, uMFBaseIO, bVar, bpxVar});
        } else {
            a((UMFParseIO) uMFBaseIO, bVar, bpxVar);
        }
    }

    public static /* synthetic */ bpx a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bpx) ipChange.ipc$dispatch("ffe66525", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ ParseProcess b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParseProcess) ipChange.ipc$dispatch("ad4bc10c", new Object[]{aVar}) : aVar.f2849a;
    }

    public a() {
        this.f2849a.a(this.b);
    }

    public void a(final UMFParseIO uMFParseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c614d", new Object[]{this, uMFParseIO, bVar});
            return;
        }
        super.onBeforeExecute(uMFParseIO, bVar);
        a(bqp.class, new bqb<bqp>() { // from class: com.alibaba.android.umf.node.service.parse.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public /* bridge */ /* synthetic */ void a(bqp bqpVar) {
            }
        });
    }

    public void a(final UMFParseIO uMFParseIO, final com.alibaba.android.umf.datamodel.b bVar, bpx<UMFRenderIO> bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864f093", new Object[]{this, uMFParseIO, bVar, bpxVar});
            return;
        }
        this.c = bpxVar;
        List list = (List) a(bqp.class, new bqb<bqp>() { // from class: com.alibaba.android.umf.node.service.parse.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public void a(bqp bqpVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e23c2537", new Object[]{this, bqpVar});
                    return;
                }
                bqd a2 = bqe.a();
                a2.a("UMFParseService", "parse finish， bizCode=" + bVar.d());
                if (uMFParseIO.dataProtocol == null) {
                    throw new IllegalArgumentException("Input 参数【dataProtocol】为NULL");
                }
                a.b(a.this).a(uMFParseIO.dataProtocol, bqpVar);
            }
        }).a();
        if (list != null && !list.isEmpty()) {
            return;
        }
        bpxVar.a(new com.alibaba.android.umf.datamodel.a("-1", "至少需要提供一个 IUMFParseAbility 的实现"));
    }

    public void a(final UMFRenderIO uMFRenderIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01089b7", new Object[]{this, uMFRenderIO, bVar});
            return;
        }
        super.onAfterExecute(uMFRenderIO, bVar);
        a(bqp.class, new bqb<bqp>() { // from class: com.alibaba.android.umf.node.service.parse.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public /* bridge */ /* synthetic */ void a(bqp bqpVar) {
            }
        });
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ParseProcess.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        this.f2849a.b(aVar);
    }
}
