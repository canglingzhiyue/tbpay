package tb;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.utils.k;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f32568a;
    public IRemoteExtendListener b;
    private NetRequest c;
    private long d;
    private String e;
    private String f = null;
    private boolean g;

    /* loaded from: classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f32569a;
        public NetResponse b;
        public NetBaseOutDo c;

        public a() {
        }
    }

    public static /* synthetic */ NetRequest a(pek pekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetRequest) ipChange.ipc$dispatch("2a6a1297", new Object[]{pekVar}) : pekVar.c;
    }

    public static /* synthetic */ void a(pek pekVar, int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fe66ec", new Object[]{pekVar, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            pekVar.a(i, netResponse, netBaseOutDo, obj);
        }
    }

    public static /* synthetic */ void a(pek pekVar, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fd90f8", new Object[]{pekVar, new Integer(i), netResponse, obj});
        } else {
            pekVar.b(i, netResponse, obj);
        }
    }

    public static /* synthetic */ String b(pek pekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a5867d", new Object[]{pekVar}) : pekVar.e;
    }

    public static /* synthetic */ void b(pek pekVar, int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcef57", new Object[]{pekVar, new Integer(i), netResponse, obj});
        } else {
            pekVar.a(i, netResponse, obj);
        }
    }

    public static /* synthetic */ String c(pek pekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a52321c", new Object[]{pekVar}) : pekVar.f;
    }

    public static /* synthetic */ boolean d(pek pekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4fdb189", new Object[]{pekVar})).booleanValue() : pekVar.g;
    }

    public static /* synthetic */ long e(pek pekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b380b7fa", new Object[]{pekVar})).longValue() : pekVar.d;
    }

    public pek(d dVar, int i, boolean z) {
        this.e = null;
        this.g = false;
        this.f32568a = dVar;
        this.e = String.valueOf(i);
        this.g = z;
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

    public void a(int i, NetRequest netRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7431a621", new Object[]{this, new Integer(i), netRequest, cls, new Boolean(z)});
            return;
        }
        this.c = netRequest;
        if (this.c == null) {
            pex.a(pnj.LOG_TAG, "mtop request is null");
            return;
        }
        new b(i, cls, z).execute(new Void[0]);
        this.d = System.currentTimeMillis();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32568a = null;
        this.c = null;
    }

    /* loaded from: classes8.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;
        private Class<?> d;

        /* JADX WARN: Type inference failed for: r4v4, types: [tb.pek$a, java.lang.Object] */
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

        public b(int i, Class<?> cls, boolean z) {
            this.b = i;
            this.c = z;
            this.d = cls;
        }

        public a a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("69631cff", new Object[]{this, voidArr});
            }
            try {
                if (pek.a(pek.this) != null && pmd.a().g() != null) {
                    HashMap hashMap = new HashMap();
                    if (!StringUtils.isEmpty(pek.b(pek.this))) {
                        hashMap.put("x-m-biz-live-bizcode", pek.b(pek.this));
                    }
                    if (!StringUtils.isEmpty(pek.c(pek.this))) {
                        hashMap.put("x-m-biz-live-biztoken", pek.c(pek.this));
                    }
                    if ("mtop.tblive.live.detail.query".equals(pek.a(pek.this).getApiName()) || "mtop.mediaplatform.live.livedetail".equals(pek.a(pek.this).getApiName())) {
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "live");
                        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "source=taobao");
                    }
                    pek.a(pek.this).setRequestHeaders(hashMap);
                    pek.a(pek.this).setUseWua(this.c);
                    pek.a(pek.this).setPost(pek.d(pek.this));
                    NetResponse a2 = pmd.a().g().a(pek.a(pek.this));
                    a aVar = new a();
                    aVar.b = a2;
                    if (a2.isApiSuccess()) {
                        aVar.f32569a = System.currentTimeMillis();
                        if (this.d != null && a2.getBytedata() != null && a2.getBytedata().length > 0) {
                            aVar.c = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.d, new Feature[0]);
                        }
                    }
                    return aVar;
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d9a1da5", new Object[]{this, aVar});
            } else if (aVar == null) {
                if (pek.this.f32568a == null) {
                    return;
                }
                pek.this.f32568a.onError(this.b, null, pek.this);
            } else {
                if (pek.this.b != null && "mtop.mediaplatform.live.livedetail".equals(aVar.b.getApi())) {
                    pek.this.b.dataParseBegin(aVar.f32569a);
                }
                String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - pek.e(pek.this)));
                if (aVar.b == null) {
                    if (pek.this.f32568a == null) {
                        return;
                    }
                    pek.this.f32568a.onError(this.b, null, pek.this);
                } else if (aVar.b.isApiSuccess()) {
                    pek.a(pek.this, this.b, aVar.b, aVar.c, pek.this);
                } else if (k.a(aVar.b)) {
                    pek.a(pek.this, this.b, aVar.b, pek.this);
                } else if (k.b(aVar.b)) {
                    pek.a(pek.this, this.b, aVar.b, pek.this);
                } else {
                    pek.b(pek.this, this.b, aVar.b, pek.this);
                }
            }
        }
    }

    private void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943cf852", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        d dVar = this.f32568a;
        if (dVar == null) {
            return;
        }
        dVar.onSuccess(i, netResponse, netBaseOutDo, this);
    }

    private void a(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87613d2", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        d dVar = this.f32568a;
        if (dVar == null) {
            return;
        }
        dVar.onError(i, netResponse, this);
    }

    private void b(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8d4131", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        d dVar = this.f32568a;
        if (dVar == null) {
            return;
        }
        dVar.onSystemError(i, netResponse, this);
    }
}
