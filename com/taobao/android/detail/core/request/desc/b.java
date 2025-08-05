package com.taobao.android.detail.core.request.desc;

import android.content.Context;
import android.os.AsyncTask;
import anetwork.channel.Response;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.e;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.util.MtopStatistics;
import tb.ecg;
import tb.emu;
import tb.enl;
import tb.enm;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f9826a;
    public c b;
    public enm c;
    public enl d;
    public MtopRequestListener<enl> e;
    public MtopRequestListener<enl> f;
    private MtopRequestClient g;
    private boolean h;
    private HashMap<Integer, DescDynamicClient> i = new HashMap<>();
    private h j;
    private Context k;

    static {
        kge.a(1786018896);
    }

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("881d4e48", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ void a(b bVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5735063", new Object[]{bVar, hashMap});
        } else {
            bVar.a((HashMap<String, com.taobao.android.detail.datasdk.model.datamodel.template.b>) hashMap);
        }
    }

    public static /* synthetic */ HashMap b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c864152", new Object[]{bVar}) : bVar.i;
    }

    public b(Context context, d dVar, c cVar) {
        this.f9826a = dVar;
        this.b = cVar;
        this.k = context;
        this.c = new enm(context);
        this.j = (h) n.a(context);
        emu.a("com.taobao.android.detail.core.request.desc.DescRequestClient");
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
        HashMap<Integer, DescDynamicClient> hashMap = this.i;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, DescDynamicClient> entry : this.i.entrySet()) {
            entry.getValue().cancel();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        enl enlVar = this.d;
        if (enlVar == null || !enlVar.a() || !this.i.isEmpty()) {
            return;
        }
        a(this.d.b);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = new MtopRequestListener<enl>() { // from class: com.taobao.android.detail.core.request.desc.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.request.c
            public /* synthetic */ void b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                } else {
                    a((enl) obj);
                }
            }

            public void a(enl enlVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                    return;
                }
                b.this.d = enlVar;
                if (enlVar != null && enlVar.a()) {
                    b.a(b.this, enlVar.b);
                }
                b.this.b.a(enlVar);
                HashMap hashMap = new HashMap();
                hashMap.put("requestParams", b.this.f9826a);
                ecg.a(b.a(b.this), enlVar, hashMap);
            }

            @Override // com.taobao.android.detail.core.request.c
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                b.this.b.a(new a(mtopResponse));
                HashMap hashMap = new HashMap();
                hashMap.put("requestParams", b.this.f9826a);
                ecg.a(b.a(b.this), mtopResponse, hashMap);
                ecg.j(b.a(b.this), b.this.f9826a != null ? b.this.f9826a.f9832a : "", mtopResponse.toString());
            }
        };
        DescMtopStaticRequestParams descMtopStaticRequestParams = new DescMtopStaticRequestParams(this.f9826a);
        if (this.h) {
            if (!a(descMtopStaticRequestParams.toMap())) {
                this.g = new DescRecommendRequestClient(descMtopStaticRequestParams, SDKConfig.getInstance().getGlobalTtid(), this.e, this.c);
            }
        } else if (!a(descMtopStaticRequestParams.toMap())) {
            this.g = new DescMtopStaticRequestClient(descMtopStaticRequestParams, SDKConfig.getInstance().getGlobalTtid(), this.e, this.c);
            this.g.setContext(this.k);
        }
        MtopRequestClient mtopRequestClient = this.g;
        if (mtopRequestClient == null) {
            return;
        }
        mtopRequestClient.execute();
    }

    private boolean a(Map<String, String> map) {
        e d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        h hVar = this.j;
        if (hVar == null) {
            return false;
        }
        if (this.h) {
            d = hVar.e();
        } else {
            d = hVar.d();
        }
        if (d == null) {
            return false;
        }
        d.a(map, new com.taobao.android.detail.core.open.d() { // from class: com.taobao.android.detail.core.request.desc.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.open.d
            public void a(int i, String str, String str2, MtopStatistics mtopStatistics) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b7d33790", new Object[]{this, new Integer(i), str, str2, mtopStatistics});
                }
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.android.detail.core.request.desc.b$2$1] */
            @Override // com.taobao.android.detail.core.open.d
            public void a(String str, Map<String, String> map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20476513", new Object[]{this, str, map2});
                } else {
                    new AsyncTask<String, Void, enl>() { // from class: com.taobao.android.detail.core.request.desc.b.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.enl] */
                        @Override // android.os.AsyncTask
                        public /* synthetic */ enl doInBackground(String[] strArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ void onPostExecute(enl enlVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b105c779", new Object[]{this, enlVar});
                            } else {
                                a(enlVar);
                            }
                        }

                        public enl a(String... strArr) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (enl) ipChange3.ipc$dispatch("4801ae6c", new Object[]{this, strArr});
                            }
                            try {
                                return b.this.c.a(strArr[0] != null ? strArr[0] : null);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }

                        public void a(enl enlVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                                return;
                            }
                            MtopRequestListener<enl> mtopRequestListener = b.this.e;
                            if (mtopRequestListener == null) {
                                return;
                            }
                            mtopRequestListener.b(enlVar);
                        }
                    }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
                }
            }
        });
        return true;
    }

    private void a(HashMap<String, com.taobao.android.detail.datasdk.model.datamodel.template.b> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            a(hashMap.get(str));
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.template.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3267000a", new Object[]{this, bVar});
            return;
        }
        this.f = new com.taobao.android.detail.core.request.desc.a<enl>() { // from class: com.taobao.android.detail.core.request.desc.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.request.c
            public /* bridge */ /* synthetic */ void a(MtopResponse mtopResponse) {
            }

            @Override // com.taobao.android.detail.core.request.c
            public /* bridge */ /* synthetic */ void b(Object obj) {
            }

            @Override // com.taobao.android.detail.core.request.desc.a
            public void a(int i, enl enlVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb6edb48", new Object[]{this, new Integer(i), enlVar});
                    return;
                }
                b.b(b.this).remove(Integer.valueOf(i));
                b.this.b.b(enlVar);
            }

            @Override // com.taobao.android.detail.core.request.desc.a
            public void a(int i, MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e31568a0", new Object[]{this, new Integer(i), mtopResponse});
                } else {
                    b.b(b.this).remove(Integer.valueOf(i));
                }
            }
        };
        DescDynamicClient descDynamicClient = new DescDynamicClient(new DescDynamicParams(bVar.b), SDKConfig.getInstance().getGlobalTtid(), this.f, this.c);
        this.i.put(Integer.valueOf(descDynamicClient.hashCode()), descDynamicClient);
        descDynamicClient.execute();
    }

    /* loaded from: classes4.dex */
    public static class a implements Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MtopResponse f9831a;

        static {
            kge.a(-622603430);
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
            this.f9831a = mtopResponse;
        }

        @Override // anetwork.channel.Response
        public int getStatusCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue() : this.f9831a.getResponseCode();
        }

        @Override // anetwork.channel.Response
        public String getDesc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.f9831a.getRetMsg();
        }

        @Override // anetwork.channel.Response
        public byte[] getBytedata() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6e9b5c0e", new Object[]{this}) : this.f9831a.getBytedata();
        }

        @Override // anetwork.channel.Response
        public Map<String, List<String>> getConnHeadFields() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3de6d7b7", new Object[]{this}) : this.f9831a.getHeaderFields();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f9831a.toString();
        }
    }
}
