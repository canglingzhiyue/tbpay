package com.taobao.android.livehome.plugin.atype.flexalocal.business;

import android.os.AsyncTask;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopConvert;
import tb.kge;
import tb.mfj;

/* loaded from: classes6.dex */
public class BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IRemoteBaseListener f14136a;
    public IRemoteExtendListener b;
    private MtopRequest c;
    private long e;
    private boolean d = false;
    private String f = null;
    private boolean g = false;

    /* loaded from: classes6.dex */
    public interface IRemoteExtendListener extends IMTOPDataObject {
        void dataParseBegin(long j);
    }

    /* loaded from: classes6.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f14137a;
        public MtopResponse b;
        public BaseOutDo c;

        static {
            kge.a(1504410085);
        }

        public a() {
        }
    }

    static {
        kge.a(-167175452);
    }

    public static /* synthetic */ MtopRequest a(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("5ccd6d20", new Object[]{baseDetailBusiness}) : baseDetailBusiness.c;
    }

    public static /* synthetic */ boolean b(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a73bf98", new Object[]{baseDetailBusiness})).booleanValue() : baseDetailBusiness.g;
    }

    public static /* synthetic */ boolean c(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60150237", new Object[]{baseDetailBusiness})).booleanValue() : baseDetailBusiness.d;
    }

    public static /* synthetic */ long d(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5b644c6", new Object[]{baseDetailBusiness})).longValue() : baseDetailBusiness.e;
    }

    public static /* synthetic */ String e(BaseDetailBusiness baseDetailBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49661d4f", new Object[]{baseDetailBusiness}) : baseDetailBusiness.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public BaseDetailBusiness(IRemoteBaseListener iRemoteBaseListener) {
        this.f14136a = iRemoteBaseListener;
    }

    public void a(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e86b0", new Object[]{this, new Integer(i), iMTOPDataObject, cls});
        } else {
            a(i, iMTOPDataObject, cls, false);
        }
    }

    public void a(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c430224", new Object[]{this, new Integer(i), iMTOPDataObject, cls, new Boolean(z)});
        } else {
            a(i, MtopConvert.inputDoToMtopRequest(iMTOPDataObject), cls, z);
        }
    }

    public void a(int i, MtopRequest mtopRequest, Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c280c37", new Object[]{this, new Integer(i), mtopRequest, cls, new Boolean(z)});
            return;
        }
        this.c = mtopRequest;
        if (this.d && this.f == null) {
            MtopRequest mtopRequest2 = this.c;
            if (mtopRequest2 != null) {
                this.f = mtopRequest2.getApiName();
            } else {
                this.d = false;
            }
        }
        new b(i, cls, z).execute(new Void[0]);
        this.e = System.currentTimeMillis();
    }

    /* loaded from: classes6.dex */
    public class b extends AsyncTask<Void, Void, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;
        private Class<?> d;

        static {
            kge.a(-1462400300);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness$a] */
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
                return (a) ipChange.ipc$dispatch("8cda284", new Object[]{this, voidArr});
            }
            if (BaseDetailBusiness.a(BaseDetailBusiness.this) == null) {
                return null;
            }
            MtopBuilder mo1297headers = Mtop.instance(Globals.getApplication()).build(BaseDetailBusiness.a(BaseDetailBusiness.this), "").mo1340setBizId(59).mo1305reqMethod(BaseDetailBusiness.b(BaseDetailBusiness.this) ? MethodEnum.POST : MethodEnum.GET).mo1297headers(new HashMap());
            if (this.c) {
                mo1297headers.mo1335useWua();
            }
            mfj.a("BaseDetailBusiness", "mtopBegin real:" + System.currentTimeMillis());
            MtopResponse syncRequest = mo1297headers.syncRequest();
            a aVar = new a();
            aVar.b = syncRequest;
            mfj.a("BaseDetailBusiness", "mtopend:" + System.currentTimeMillis());
            if (syncRequest.isApiSuccess()) {
                aVar.f14137a = System.currentTimeMillis();
                aVar.c = MtopConvert.jsonToOutputDO(syncRequest.getBytedata(), this.d);
            }
            return aVar;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8fc0bd8", new Object[]{this, aVar});
            } else if (aVar == null) {
                if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                    AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - BaseDetailBusiness.d(BaseDetailBusiness.this))), "0", "response is null 2");
                }
                if (BaseDetailBusiness.this.f14136a == null) {
                    return;
                }
                BaseDetailBusiness.this.f14136a.onError(this.b, null, BaseDetailBusiness.this);
            } else {
                if (BaseDetailBusiness.this.b != null && "mtop.mediaplatform.live.livedetail".equals(aVar.b.getApi())) {
                    BaseDetailBusiness.this.b.dataParseBegin(aVar.f14137a);
                }
                String format = String.format("time=%d;source=java", Long.valueOf(System.currentTimeMillis() - BaseDetailBusiness.d(BaseDetailBusiness.this)));
                if (aVar.b == null) {
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format, "0", "response is null");
                    }
                    if (BaseDetailBusiness.this.f14136a == null) {
                        return;
                    }
                    BaseDetailBusiness.this.f14136a.onError(this.b, null, BaseDetailBusiness.this);
                } else if (aVar.b.isApiSuccess()) {
                    mfj.b("BaseDetailBusiness", "isApiSuccess-----");
                    BaseOutDo baseOutDo = aVar.c;
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitSuccess("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format);
                    }
                    if (BaseDetailBusiness.this.f14136a == null) {
                        return;
                    }
                    if (aVar.b != null) {
                        com.taobao.android.livehome.plugin.atype.flexalocal.utils.a.a(aVar.b.getHeaderFields(), BaseDetailBusiness.this.b);
                    }
                    BaseDetailBusiness.this.f14136a.onSuccess(this.b, aVar.b, baseOutDo, BaseDetailBusiness.this);
                } else {
                    if (BaseDetailBusiness.c(BaseDetailBusiness.this)) {
                        AppMonitor.Alarm.commitFail("taolive", BaseDetailBusiness.e(BaseDetailBusiness.this), format, aVar.b.getRetCode(), aVar.b.getRetMsg());
                    }
                    if (aVar.b.isSessionInvalid()) {
                        mfj.b("BaseDetailBusiness", "isApiFail----- session invalid");
                        if (BaseDetailBusiness.this.f14136a == null) {
                            return;
                        }
                        BaseDetailBusiness.this.f14136a.onSystemError(this.b, aVar.b, BaseDetailBusiness.this);
                    } else if (aVar.b.isSystemError() || aVar.b.isNetworkError() || aVar.b.isExpiredRequest() || aVar.b.is41XResult() || aVar.b.isApiLockedResult() || aVar.b.isMtopSdkError()) {
                        mfj.b("BaseDetailBusiness", "isApiFail----- system error");
                        if (BaseDetailBusiness.this.f14136a == null) {
                            return;
                        }
                        BaseDetailBusiness.this.f14136a.onSystemError(this.b, aVar.b, BaseDetailBusiness.this);
                    } else {
                        mfj.b("BaseDetailBusiness", "isApiFail----- business error");
                        if (BaseDetailBusiness.this.f14136a == null) {
                            return;
                        }
                        BaseDetailBusiness.this.f14136a.onError(this.b, aVar.b, BaseDetailBusiness.this);
                    }
                }
            }
        }
    }
}
