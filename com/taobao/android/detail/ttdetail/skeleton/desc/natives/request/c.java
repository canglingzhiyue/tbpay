package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import android.content.Context;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e f10845a;
    public d b;
    public h c;
    public com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g d;
    public f<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> e;
    public f<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g> f;
    private MtopRequestClient g;
    private HashMap<Integer, DescDynamicClient> h = new HashMap<>();
    private Context i;

    static {
        kge.a(-1588657401);
    }

    public static /* synthetic */ HashMap a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("6495e079", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ void a(c cVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8283495d", new Object[]{cVar, hashMap});
        } else {
            cVar.a(hashMap);
        }
    }

    public c(Context context, e eVar, d dVar) {
        this.f10845a = eVar;
        this.b = dVar;
        this.i = context;
        this.c = new h(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopRequestClient mtopRequestClient = this.g;
        if (mtopRequestClient != null) {
            mtopRequestClient.cancel();
        }
        HashMap<Integer, DescDynamicClient> hashMap = this.h;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, DescDynamicClient> entry : this.h.entrySet()) {
            entry.getValue().cancel();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar = this.d;
        if (gVar == null || !gVar.a() || !this.h.isEmpty()) {
            return;
        }
        a(this.d.f10863a);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = new f<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.g
            public /* synthetic */ void b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                } else {
                    a((com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) obj);
                }
            }

            public void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("865d096e", new Object[]{this, gVar});
                    return;
                }
                c.this.d = gVar;
                if (gVar != null && gVar.a()) {
                    c.a(c.this, gVar.f10863a);
                }
                c.this.b.a(gVar);
                new HashMap().put("requestParams", c.this.f10845a);
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.g
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                c.this.b.a(new a(mtopResponse));
                new HashMap().put("requestParams", c.this.f10845a);
            }
        };
        this.g = new DescMtopStaticRequestClient(new DescMtopStaticRequestParams(this.f10845a), SDKConfig.getInstance().getGlobalTtid(), this.e, this.c);
        this.g.setContext(this.i);
        MtopRequestClient mtopRequestClient = this.g;
        if (mtopRequestClient == null) {
            return;
        }
        mtopRequestClient.execute();
    }

    private void a(HashMap<String, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.e> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            a(hashMap.get(str));
        }
    }

    private void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865c20b0", new Object[]{this, eVar});
            return;
        }
        this.f = new b<com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.g
            public /* bridge */ /* synthetic */ void a(MtopResponse mtopResponse) {
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.g
            public /* bridge */ /* synthetic */ void b(Object obj) {
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b
            public void a(int i, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f55a661", new Object[]{this, new Integer(i), gVar});
                    return;
                }
                c.a(c.this).remove(Integer.valueOf(i));
                c.this.b.b(gVar);
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.b
            public void a(int i, MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e31568a0", new Object[]{this, new Integer(i), mtopResponse});
                } else {
                    c.a(c.this).remove(Integer.valueOf(i));
                }
            }
        };
        DescDynamicClient descDynamicClient = new DescDynamicClient(new DescDynamicParams(eVar.b), SDKConfig.getInstance().getGlobalTtid(), this.f, this.c);
        this.h.put(Integer.valueOf(descDynamicClient.hashCode()), descDynamicClient);
        descDynamicClient.execute();
    }

    /* loaded from: classes5.dex */
    public static class a implements Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MtopResponse f10848a;

        static {
            kge.a(-1319105519);
            kge.a(-2097101041);
        }

        @Override // anetwork.channel.Response
        public Throwable getError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("4db6723e", new Object[]{this});
            }
            return null;
        }

        @Override // anetwork.channel.Response
        public StatisticData getStatisticData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatisticData) ipChange.ipc$dispatch("396a8f27", new Object[]{this});
            }
            return null;
        }

        public a(MtopResponse mtopResponse) {
            this.f10848a = mtopResponse;
        }

        @Override // anetwork.channel.Response
        public int getStatusCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue() : this.f10848a.getResponseCode();
        }

        @Override // anetwork.channel.Response
        public String getDesc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.f10848a.getRetMsg();
        }

        @Override // anetwork.channel.Response
        public byte[] getBytedata() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this}) : this.f10848a.getBytedata();
        }

        @Override // anetwork.channel.Response
        public Map<String, List<String>> getConnHeadFields() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3de6d7b7", new Object[]{this}) : this.f10848a.getHeaderFields();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f10848a.toString();
        }
    }
}
