package com.taobao.live.home.business;

import android.os.AsyncTask;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.android.task.Coordinator;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mfi;
import tb.mfj;
import tb.mfk;
import tb.mfm;
import tb.mfn;
import tb.mfo;
import tb.mfp;

/* loaded from: classes7.dex */
public abstract class a<ResponseBaseOutDo extends FeedListResponse, ItemClass extends IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17722a = "a";
    private BaseListRequest b;
    private a<ResponseBaseOutDo, ItemClass>.b c;
    private com.taobao.live.home.business.b d;
    private boolean e = false;
    private boolean f = false;
    private AtomicBoolean g = new AtomicBoolean(true);
    private boolean h = false;
    private boolean i = false;

    /* loaded from: classes7.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17726a;
        public Object b;
        public boolean c = false;

        public c(boolean z, Object obj) {
            this.f17726a = z;
            this.b = obj;
        }
    }

    public abstract ResponseBaseOutDo a(MtopResponse mtopResponse);

    public abstract List<ItemClass> a(Object obj);

    public MtopResponse b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("23e6c092", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ c a(a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("662aa18c", new Object[]{aVar, mtopResponse}) : aVar.c(mtopResponse);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b58acf9", new Object[]{aVar}) : aVar.k();
    }

    public static /* synthetic */ void a(a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62945b29", new Object[]{aVar, cVar});
        } else {
            aVar.a(cVar);
        }
    }

    public static /* synthetic */ BaseListRequest b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseListRequest) ipChange.ipc$dispatch("77f91da6", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9c97fc9", new Object[]{aVar})).booleanValue() : aVar.l();
    }

    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : f17722a;
    }

    public MtopResponse a(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("81b92e33", new Object[]{this, baseListRequest});
        }
        if (baseListRequest == null || 0 != baseListRequest.s) {
            return null;
        }
        String k = k();
        String str = f17722a;
        mfj.a(str, "read cache: " + k);
        Object a2 = mfi.a(k);
        if (!(a2 instanceof String)) {
            return null;
        }
        String str2 = (String) a2;
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setBytedata(str2.getBytes());
        return mtopResponse;
    }

    public void b(final MtopResponse mtopResponse) {
        BaseListRequest baseListRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null || (baseListRequest = this.b) == null || baseListRequest.s != 0) {
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("onCacheResponse") { // from class: com.taobao.live.home.business.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str = new String(mtopResponse.getBytedata());
                    String a2 = a.a(a.this);
                    mfj.b(a.i(), "feedList Mtop response write cache");
                    mfi.a(a2, str);
                }
            });
        }
    }

    public void b(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425cb487", new Object[]{this, baseListRequest});
        } else {
            this.b = baseListRequest;
        }
    }

    public void a(com.taobao.live.home.business.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1724bae6", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e || this.b == null) {
        } else {
            if (this.c != null && AsyncTask.Status.FINISHED != this.c.getStatus()) {
                return;
            }
            this.f = false;
            com.taobao.live.home.business.b bVar = this.d;
            if (bVar != null) {
                bVar.onLoadMore(this.b);
            }
            this.c = new b();
            e();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        BaseListRequest baseListRequest = this.b;
        if (baseListRequest == null) {
            return;
        }
        this.e = false;
        this.f = true;
        com.taobao.live.home.business.b bVar = this.d;
        if (bVar != null) {
            bVar.onReload(baseListRequest);
        }
        if (this.b.needCache() && mfm.p()) {
            j();
        }
        a<ResponseBaseOutDo, ItemClass>.b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.cancel(true);
        }
        this.c = new b();
        e();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c == null) {
        } else {
            mfj.b(f17722a, "feedList Mtop request start");
            this.c.execute(new Void[0]);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a<ResponseBaseOutDo, ItemClass>.b bVar = this.c;
        if (bVar != null) {
            bVar.cancel(true);
        }
        this.d = null;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!this.g.compareAndSet(true, false)) {
        } else {
            new AsyncTaskC0682a().execute(new Void[0]);
        }
    }

    private c c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("20f734ef", new Object[]{this, mtopResponse});
        }
        try {
            ResponseBaseOutDo a2 = a(mtopResponse);
            if (a2 != null && a2.mo2429getData() != null) {
                if (g()) {
                    mfk.a(mfk.CDN_REQUEST, "");
                    mfj.b(f17722a, "feedList CDN response handle success");
                }
                if (h()) {
                    mfj.c(f17722a, "feedList localDefault data handle success");
                }
                if (!h()) {
                    mfk.a(mfk.FEEDLIST_REQUEST, "");
                }
                return new c(true, a2);
            }
            if (g()) {
                mfk.a(mfk.CDN_REQUEST, "", "", "cdn-data-none");
                mfj.c(f17722a, "feedList CDN response handle fail");
            }
            if (h()) {
                mfj.c(f17722a, "feedList localDefault data handle fail");
            }
            if (h()) {
                return null;
            }
            mfk.a(mfk.FEEDLIST_REQUEST, "", "", "feedlist-data-none");
            return null;
        } catch (Exception e) {
            if (g()) {
                mfk.a(mfk.CDN_REQUEST, "", "", "cdn-responseConvert-fail");
            }
            if (!h()) {
                mfk.a(mfk.FEEDLIST_REQUEST, "", "", "cdn-responseConvert-fail");
            }
            mfj.a(f17722a, "handle response exp.", e);
            return null;
        }
    }

    private void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de02a1a8", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            try {
                if (cVar.f17726a) {
                    mfj.b(f17722a, "feedList data is obtained successfully,doPostExecute start");
                    if (this.d == null) {
                        return;
                    }
                    if (this.f) {
                        this.d.onPageReload((BaseOutDo) cVar.b);
                    } else {
                        this.d.onPageReceived((BaseOutDo) cVar.b);
                    }
                    this.e = this.d.onJudgeEnd();
                    if (!this.f && !this.e) {
                        this.e = cVar.c;
                    }
                    if (!this.e) {
                        return;
                    }
                    this.d.onPageEnd();
                } else if (this.d == null) {
                } else {
                    this.d.onPageError((String) cVar.b);
                }
            } catch (Exception e) {
                mfj.a(f17722a, "doPostExecute: exp", e);
            }
        }
    }

    /* renamed from: com.taobao.live.home.business.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class AsyncTaskC0682a extends AsyncTask<Void, Void, c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AsyncTaskC0682a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.live.home.business.a$c] */
        @Override // android.os.AsyncTask
        public /* synthetic */ c doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, cVar});
            } else {
                a(cVar);
            }
        }

        public c a(Void... voidArr) {
            c a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e49e2254", new Object[]{this, voidArr});
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            mfj.b(a.i(), "feedList localCache read start");
            a aVar = a.this;
            MtopResponse a3 = aVar.a(a.b(aVar));
            if (a3 != null && (a2 = a.a(a.this, a3)) != null) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                String i = a.i();
                mfj.c(i, "feedList localCache read success,spent time " + uptimeMillis2);
                return a2;
            }
            mfj.c(a.i(), "feedList localCache data is NULL");
            return new c(false, null);
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de02a1a8", new Object[]{this, cVar});
            } else if (cVar == null || !cVar.f17726a) {
            } else {
                a.a(a.this, cVar);
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b extends AsyncTask<Void, Void, c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.live.home.business.a$c] */
        @Override // android.os.AsyncTask
        public /* synthetic */ c doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, cVar});
            } else {
                a(cVar);
            }
        }

        public c a(Void... voidArr) {
            c a2;
            c a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e49e2254", new Object[]{this, voidArr});
            }
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) a.b(a.this));
            a(build);
            a.this.a(false);
            a.this.b(false);
            long uptimeMillis = SystemClock.uptimeMillis();
            MtopResponse syncRequest = build.syncRequest();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (syncRequest != null) {
                String i = a.i();
                mfj.c(i, "request [" + syncRequest.getApi() + "] spent time " + uptimeMillis2);
            }
            if (a(syncRequest)) {
                String i2 = a.i();
                mfj.b(i2, "feedList Mtop response success, response:" + syncRequest.getApi());
                if (a.b(a.this).needCache()) {
                    a.this.b(syncRequest);
                }
                c a4 = a.a(a.this, syncRequest);
                if (a4 == null) {
                    String i3 = a.i();
                    mfj.c(i3, "feedList Mtop response success, handle fail,response:" + syncRequest.toString());
                    mfk.a(mfk.MTOP_REQUEST, syncRequest.getApi(), "", "dataParse error");
                    if (a.c(a.this) && (a3 = a()) != null) {
                        return a3;
                    }
                } else {
                    String i4 = a.i();
                    mfj.b(i4, "feedList Mtop response dataParse start,apiName:" + syncRequest.getApi());
                    if (mfn.a(a.this.a(a4.b))) {
                        String i5 = a.i();
                        mfj.c(i5, "feedList Mtop response dataParse NULL,response" + syncRequest.toString());
                        mfk.a(mfk.MTOP_REQUEST, syncRequest.getApi(), "", "返回的数据为0");
                        if (a.c(a.this)) {
                            a4 = a();
                            if (a4 != null) {
                                return a4;
                            }
                        } else {
                            a4.c = true;
                        }
                    }
                    mfk.a(mfk.MTOP_REQUEST, syncRequest.getApi());
                    return a4;
                }
            } else {
                String i6 = a.i();
                StringBuilder sb = new StringBuilder();
                sb.append("feedList Mtop response fail, response:");
                sb.append(syncRequest == null ? "response is NULL =" : syncRequest.toString());
                mfj.c(i6, sb.toString());
                HashMap hashMap = new HashMap();
                if (syncRequest != null) {
                    hashMap.put("errorCode", syncRequest.getRetCode());
                    hashMap.put("errorMsg", syncRequest.getRetMsg());
                    String i7 = a.i();
                    mfj.c(i7, "MTOP : " + syncRequest.toString());
                } else {
                    hashMap.put("errorCode", "response is null");
                    hashMap.put("errorMsg", "response is null");
                    mfj.c(a.i(), "MTOP response is null");
                }
                mfp.c(k.HOME_MODULE, "mtopRequestError", hashMap);
                mfk.a(mfk.MTOP_REQUEST, syncRequest != null ? syncRequest.getApi() : "", "", "网络请求失败");
                if (a.c(a.this) && (a2 = a()) != null) {
                    return a2;
                }
            }
            String i8 = a.i();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MTOP ret:");
            String str = "MTOP ERROR";
            sb2.append(syncRequest != null ? syncRequest.getRetCode() : str);
            mfj.c(i8, sb2.toString());
            if (syncRequest != null) {
                str = syncRequest.getRetCode();
            }
            return new c(false, str);
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de02a1a8", new Object[]{this, cVar});
            } else {
                a.a(a.this, cVar);
            }
        }

        private void a(RemoteBusiness remoteBusiness) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809d8688", new Object[]{this, remoteBusiness});
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("x-m-biz-live-bizcode", aw.BIZCODE_TAOBAO);
            remoteBusiness.mo1297headers((Map<String, String>) hashMap);
            remoteBusiness.mo1305reqMethod(MethodEnum.POST);
            remoteBusiness.mo1340setBizId(47);
        }

        private boolean a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{this, mtopResponse})).booleanValue() : mtopResponse != null && mtopResponse.isApiSuccess();
        }

        private c a() {
            c a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("db5cb668", new Object[]{this});
            }
            mfj.c(a.i(), "RequestTask.bailoutDataRequest 请求失败，走打底数据");
            MtopResponse b = a.this.b();
            if (b != null && (a2 = a.a(a.this, b)) != null) {
                return a2;
            }
            return null;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.h;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        if (this.b == null) {
            return "mtop_response_cache_default";
        }
        return "mtop_response_cache_" + mfo.a(this.b.toString());
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.b.s == 0;
    }
}
