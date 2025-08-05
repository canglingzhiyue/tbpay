package com.taobao.taolive.sdk.business;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import com.taobao.taolive.sdk.utils.k;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e f21810a;
    private NetRequest b;
    private Handler c;
    private String d;
    private String e;
    private HashMap<String, String> f;
    private com.taobao.taolive.sdk.adapter.network.c g;

    /* loaded from: classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f21811a;
        public NetResponse b;
        public NetBaseOutDo c;

        static {
            kge.a(-1136451808);
        }

        public a() {
        }
    }

    static {
        kge.a(-412849015);
    }

    public static /* synthetic */ NetRequest a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetRequest) ipChange.ipc$dispatch("6061ee0a", new Object[]{jVar}) : jVar.b;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.adapter.network.c b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.adapter.network.c) ipChange.ipc$dispatch("5f984b38", new Object[]{jVar}) : jVar.g;
    }

    public static /* synthetic */ String c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92e24b0d", new Object[]{jVar}) : jVar.d;
    }

    public static /* synthetic */ String d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b876540e", new Object[]{jVar}) : jVar.e;
    }

    public static /* synthetic */ HashMap e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52d7dad4", new Object[]{jVar}) : jVar.f;
    }

    public static /* synthetic */ Handler f(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b7e18436", new Object[]{jVar}) : jVar.c;
    }

    public j(com.taobao.taolive.sdk.adapter.network.c cVar) {
        this(cVar, aw.BIZCODE_TAOBAO, null);
    }

    public j(com.taobao.taolive.sdk.adapter.network.c cVar, String str, String str2) {
        this.d = null;
        this.e = null;
        this.g = cVar;
        this.d = str;
        this.e = str2;
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
        this.b = netRequest;
        if (this.b == null) {
            m.b("TAO_LIVE mtop request is null");
        } else {
            com.taobao.taolive.sdk.utils.c.a(new b(i, cls, z), ThreadPoolType.MTOP, new Void[0]);
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eac65a", new Object[]{this, eVar});
        } else {
            this.f21810a = eVar;
        }
    }

    public void a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e49798", new Object[]{this, handler});
        } else {
            this.c = handler;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.f21810a = null;
    }

    /* loaded from: classes8.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;
        private Class<?> d;

        static {
            kge.a(-1724740359);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(a aVar) {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.taolive.sdk.business.j$a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ a doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public b(int i, Class<?> cls, boolean z) {
            this.b = i;
            this.c = z;
            this.d = cls;
        }

        public a a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5988fd84", new Object[]{this, voidArr});
            }
            try {
                if (j.a(j.this) != null && j.b(j.this) != null) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(j.c(j.this))) {
                        hashMap.put("x-m-biz-live-bizcode", j.c(j.this));
                    }
                    if (!TextUtils.isEmpty(j.d(j.this))) {
                        hashMap.put("x-m-biz-live-biztoken", j.d(j.this));
                    }
                    if (j.e(j.this) != null) {
                        hashMap.putAll(j.e(j.this));
                    }
                    j.a(j.this).setRequestHeaders(hashMap);
                    j.a(j.this).setUseWua(this.c);
                    if (j.f(j.this) != null) {
                        j.a(j.this).setRequestNotifyHandler(j.f(j.this));
                    }
                    NetResponse a2 = j.b(j.this).a(j.a(j.this));
                    a aVar = new a();
                    aVar.b = a2;
                    if (a2.isApiSuccess()) {
                        aVar.f21811a = System.currentTimeMillis();
                        if (this.d != null && a2.getBytedata() != null && a2.getBytedata().length > 0) {
                            aVar.c = (NetBaseOutDo) JSON.parseObject(a2.getBytedata(), this.d, new Feature[0]);
                        }
                    }
                    if (j.this.f21810a != null) {
                        j.this.f21810a.a(aVar.b, aVar.c);
                    }
                    return aVar;
                }
                return null;
            } catch (Exception e) {
                Log.e("AFCDetailBusiness", "do in background error ", e);
                return null;
            }
        }
    }
}
