package com.taobao.taolive.sdk.business;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import com.taobao.taolive.sdk.utils.k;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqi;
import tb.scm;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";

    /* renamed from: a */
    private NetRequest f21790a;
    public com.taobao.taolive.sdk.adapter.network.d b;
    public IRemoteExtendListener c;
    public e d;
    private Handler e;
    private boolean f;
    private long g;
    private String h;
    private String i;
    private String j;
    private HashMap<String, String> k;
    public AsyncTaskC0903b l;

    /* loaded from: classes8.dex */
    public class a {

        /* renamed from: a */
        public long f21791a;
        public NetResponse b;
        public NetBaseOutDo c;
        public long e;

        static {
            kge.a(-1368054911);
        }

        public a() {
            b.this = r1;
        }
    }

    static {
        kge.a(1059674824);
    }

    public static /* synthetic */ void lambda$dIWFpwsswaDGHEvCDM4Xm69etPo(b bVar, String str, int i, a aVar, NetBaseOutDo netBaseOutDo, long j) {
        bVar.a(str, i, aVar, netBaseOutDo, j);
    }

    public static /* synthetic */ NetRequest a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetRequest) ipChange.ipc$dispatch("8f85f912", new Object[]{bVar}) : bVar.f21790a;
    }

    public static /* synthetic */ void a(b bVar, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaae155d", new Object[]{bVar, new Integer(i), netResponse, obj});
        } else {
            bVar.b(i, netResponse, obj);
        }
    }

    public static /* synthetic */ void a(b bVar, int i, a aVar, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb223466", new Object[]{bVar, new Integer(i), aVar, netBaseOutDo, obj});
        } else {
            bVar.a(i, aVar, netBaseOutDo, obj);
        }
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8869604", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ void b(b bVar, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b995b39e", new Object[]{bVar, new Integer(i), netResponse, obj});
        } else {
            bVar.a(i, netResponse, obj);
        }
    }

    public static /* synthetic */ String c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e1a9f05", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ HashMap d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("91bceebd", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ Handler e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("559eed6d", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ boolean f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b57f1d9c", new Object[]{bVar})).booleanValue() : bVar.f;
    }

    public static /* synthetic */ long g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9d0e6b", new Object[]{bVar})).longValue() : bVar.g;
    }

    public static /* synthetic */ String h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9fecc0a", new Object[]{bVar}) : bVar.h;
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.k = hashMap;
        }
    }

    public b(com.taobao.taolive.sdk.adapter.network.d dVar) {
        this(dVar, aw.BIZCODE_TAOBAO, null);
    }

    public b(com.taobao.taolive.sdk.adapter.network.d dVar, boolean z) {
        this(dVar, aw.BIZCODE_TAOBAO, null, z);
    }

    public b(com.taobao.taolive.sdk.adapter.network.d dVar, String str, String str2) {
        this(dVar, str, str2, false);
    }

    public b(com.taobao.taolive.sdk.adapter.network.d dVar, String str, String str2, boolean z) {
        this.f = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = dVar;
        this.f = z;
        this.i = str;
        this.j = str2;
    }

    public void a(int i, INetDataObject iNetDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff74e7e", new Object[]{this, new Integer(i), iNetDataObject, cls});
        } else {
            a(i, iNetDataObject, cls, false);
        }
    }

    public void a(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef33416", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z)});
        } else {
            a(i, iNetDataObject, cls, z, false);
        }
    }

    public void a(int i, INetDataObject iNetDataObject, Class<?> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f74017e", new Object[]{this, new Integer(i), iNetDataObject, cls, new Boolean(z), new Boolean(z2)});
            return;
        }
        NetRequest a2 = a(iNetDataObject);
        if (a2 != null) {
            a2.setPost(z2);
        }
        a(i, a2, cls, z);
    }

    private NetRequest a(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("70d007c7", new Object[]{this, iNetDataObject});
        }
        return iNetDataObject != null ? k.a(iNetDataObject) : new NetRequest();
    }

    public void a(int i, NetRequest netRequest, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96cef13", new Object[]{this, new Integer(i), netRequest, cls});
        } else {
            a(i, netRequest, cls, false);
        }
    }

    public void a(int i, NetRequest netRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7431a621", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z)});
            return;
        }
        this.f21790a = netRequest;
        if (this.f && this.h == null) {
            NetRequest netRequest2 = this.f21790a;
            if (netRequest2 != null) {
                this.h = netRequest2.getApiName();
            } else {
                this.f = false;
            }
        }
        if (this.f21790a == null) {
            pmd.a().m().a(pnj.LOG_TAG, "mtop request is null");
            return;
        }
        this.l = new AsyncTaskC0903b(i, cls, z);
        com.taobao.taolive.sdk.utils.c.a(this.l, ThreadPoolType.MTOP, new Void[0]);
        this.g = System.currentTimeMillis();
    }

    public void a(IRemoteExtendListener iRemoteExtendListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bf8082", new Object[]{this, iRemoteExtendListener});
        } else {
            this.c = iRemoteExtendListener;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.f21790a = null;
        this.e = null;
        this.d = null;
        if (this.l == null || !u.ap()) {
            return;
        }
        if (!this.l.isCancelled()) {
            this.l.cancel(true);
        }
        this.l = null;
    }

    /* renamed from: com.taobao.taolive.sdk.business.b$b */
    /* loaded from: classes8.dex */
    public class AsyncTaskC0903b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;
        private Class<?> d;

        static {
            kge.a(-314501960);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.taolive.sdk.business.b$a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ a doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, aVar});
            } else {
                a(aVar);
            }
        }

        public AsyncTaskC0903b(int i, Class<?> cls, boolean z) {
            b.this = r1;
            this.b = i;
            this.c = z;
            this.d = cls;
        }

        public a a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("59855a8c", new Object[]{this, voidArr});
            }
            try {
                if (b.a(b.this) != null && pmd.a().g() != null) {
                    HashMap hashMap = new HashMap();
                    if (!StringUtils.isEmpty(b.b(b.this))) {
                        hashMap.put("x-m-biz-live-bizcode", b.b(b.this));
                    }
                    if (!StringUtils.isEmpty(b.c(b.this))) {
                        hashMap.put("x-m-biz-live-biztoken", b.c(b.this));
                    }
                    if (("mtop.tblive.live.detail.query".equals(b.a(b.this).getApiName()) || "mtop.mediaplatform.live.livedetail".equals(b.a(b.this).getApiName())) && pmd.a().u() != null) {
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "live");
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "source=" + pmd.a().u().a((Context) null));
                    }
                    if (b.d(b.this) != null) {
                        hashMap.putAll(b.d(b.this));
                    }
                    b.a(b.this).setRequestHeaders(hashMap);
                    b.a(b.this).setUseWua(this.c);
                    if (b.e(b.this) != null) {
                        b.a(b.this).setRequestNotifyHandler(b.e(b.this));
                    }
                    if (com.taobao.taolive.sdk.utils.b.d(pmd.a().u().c())) {
                        pnj m = pmd.a().m();
                        m.c(pnj.LOG_TAG, "request " + JSON.toJSONString(b.a(b.this)));
                    }
                    NetResponse a2 = pmd.a().g().a(b.a(b.this));
                    a aVar = new a();
                    aVar.b = a2;
                    if (a2.isApiSuccess()) {
                        aVar.f21791a = System.currentTimeMillis();
                        if (this.d != null && a2.getBytedata() != null && a2.getBytedata().length > 0) {
                            aVar.c = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.d, new Feature[0]);
                        }
                        aVar.e = System.currentTimeMillis();
                    }
                    if (b.this.d != null) {
                        b.this.d.a(aVar.b, aVar.c);
                    }
                    return aVar;
                }
                return null;
            } catch (Exception e) {
                Log.e("BaseDetailBusiness", "do in background error ", e);
                return null;
            }
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c090620", new Object[]{this, aVar});
            } else if (aVar == null) {
                if (b.f(b.this)) {
                    String format = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - b.g(b.this)));
                    if (pmd.a().n() != null) {
                        pmd.a().n().a("taolive", b.h(b.this), format, "0", "response is null 2");
                    }
                }
                if (b.this.b == null) {
                    return;
                }
                b.this.b.onError(this.b, null, b.this);
            } else {
                if (b.this.c != null && ("mtop.mediaplatform.live.livedetail".equals(aVar.b.getApi()) || "mtop.tblive.live.item.getVideoDetailItemListWithPagination".equals(aVar.b.getApi()))) {
                    b.this.c.dataParseBegin(aVar.f21791a);
                }
                String format2 = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - b.g(b.this)));
                if (aVar.b == null) {
                    if (b.f(b.this) && pmd.a().n() != null) {
                        pmd.a().n().a("taolive", b.h(b.this), format2, "response is null");
                    }
                    if (b.this.b == null) {
                        return;
                    }
                    b.this.b.onError(this.b, null, b.this);
                } else if (aVar.b.isApiSuccess()) {
                    NetBaseOutDo netBaseOutDo = aVar.c;
                    if (b.f(b.this) && pmd.a().n() != null) {
                        pmd.a().n().a("taolive", b.h(b.this), format2);
                    }
                    if (b.c()) {
                        try {
                            b.a(b.this, this.b, aVar, netBaseOutDo, b.this);
                            return;
                        } catch (Throwable th) {
                            pqi.a().c("mtopCrash", pqi.a().a(th));
                            return;
                        }
                    }
                    b bVar = b.this;
                    b.a(bVar, this.b, aVar, netBaseOutDo, bVar);
                } else {
                    if (b.f(b.this) && pmd.a().n() != null) {
                        pmd.a().n().a("taolive", b.h(b.this), format2, aVar.b.getRetCode(), aVar.b.getRetMsg());
                    }
                    if (k.a(aVar.b)) {
                        b.a(b.this, this.b, aVar.b, b.this);
                    } else if (k.b(aVar.b)) {
                        b.a(b.this, this.b, aVar.b, b.this);
                    } else {
                        b.b(b.this, this.b, aVar.b, b.this);
                    }
                }
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableMtopCatch", "false"));
    }

    private void a(final int i, final a aVar, final NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6cb31b", new Object[]{this, new Integer(i), aVar, netBaseOutDo, obj});
            return;
        }
        if (this.b != null && aVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String api = aVar.b.getApi();
            Runnable runnable = new Runnable() { // from class: com.taobao.taolive.sdk.business.-$$Lambda$b$dIWFpwsswaDGHEvCDM4Xm69etPo
                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$dIWFpwsswaDGHEvCDM4Xm69etPo(b.this, api, i, aVar, netBaseOutDo, currentTimeMillis);
                }
            };
            if (l.a().contains(api)) {
                runnable.run();
            } else {
                ADaemon.postMainLooper(runnable, new long[0]);
            }
        }
        if (aVar == null) {
            return;
        }
        a(AccessListenerEnum.mtopRequestSuccess, aVar.b);
    }

    public /* synthetic */ void a(String str, int i, a aVar, NetBaseOutDo netBaseOutDo, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630f0e6f", new Object[]{this, str, new Integer(i), aVar, netBaseOutDo, new Long(j)});
            return;
        }
        scm.a("mtop_" + str);
        com.taobao.taolive.sdk.adapter.network.d dVar = this.b;
        if (dVar != null) {
            dVar.onSuccess(i, aVar.b, netBaseOutDo, this);
        }
        scm.a();
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> b = pqi.a().b();
        b.put("api", aVar.b.getApi() + aVar.b.getV());
        b.put("dataParseTime", "" + (aVar.e - aVar.f21791a));
        b.put("threadSwitch", "" + (j - aVar.e));
        b.put("onSuccessTime", "" + (currentTimeMillis - j));
        b.put("totalTime", "" + (currentTimeMillis - this.g));
        b.put("deviceLevel", "" + com.taobao.taolive.room.service.c.M());
        pqi.a().a("liveroomMtop", JSON.toJSONString(b));
    }

    private void a(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87613d2", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        com.taobao.taolive.sdk.adapter.network.d dVar = this.b;
        if (dVar != null) {
            dVar.onError(i, netResponse, this);
            Map<String, String> b = pqi.a().b();
            b.put("api", netResponse.getApi() + netResponse.getV());
            pqi.a().a("liveroomMtop", JSON.toJSONString(b), netResponse.getRetMsg(), netResponse.getRetCode());
        }
        a(AccessListenerEnum.mtopRequestFail, netResponse);
    }

    private void a(AccessListenerEnum accessListenerEnum, Object... objArr) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447e8c5c", new Object[]{this, accessListenerEnum, objArr});
            return;
        }
        com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
        if (a2 == null || a2.o() == null || (o = a2.o()) == null) {
            return;
        }
        o.accessListener(accessListenerEnum, objArr);
    }

    private void b(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8d4131", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        com.taobao.taolive.sdk.adapter.network.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.onSystemError(i, netResponse, this);
        Map<String, String> b = pqi.a().b();
        b.put("api", netResponse.getApi() + netResponse.getV());
        pqi.a().a("liveroomMtop", JSON.toJSONString(b), netResponse.getRetMsg(), netResponse.getRetCode());
    }
}
