package tb;

import android.content.DialogInterface;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.vi.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.b;
import com.ap.zoloz.hummer.common.h;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class cjr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RpcManager";
    private static cjr d;

    /* renamed from: a  reason: collision with root package name */
    private HummerGWFacade f26318a;
    private cjq b;
    private boolean c = false;
    private cjo e;

    static {
        kge.a(-414178168);
    }

    public static /* synthetic */ cjo a(cjr cjrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cjo) ipChange.ipc$dispatch("b518b7f1", new Object[]{cjrVar}) : cjrVar.e;
    }

    public static /* synthetic */ cjt a(cjr cjrVar, cjs cjsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cjt) ipChange.ipc$dispatch("e439f708", new Object[]{cjrVar, cjsVar}) : cjrVar.a(cjsVar);
    }

    public static cjr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjr) ipChange.ipc$dispatch("f034193", new Object[0]);
        }
        if (d == null) {
            synchronized (cjr.class) {
                if (d == null) {
                    d = new cjr();
                }
            }
        }
        return d;
    }

    public void a(HummerGWFacade hummerGWFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0da393", new Object[]{this, hummerGWFacade});
            return;
        }
        this.f26318a = hummerGWFacade;
        this.b = new cjq();
        this.c = true;
    }

    public void a(cjo cjoVar, cjs cjsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91426f4", new Object[]{this, cjoVar, cjsVar});
            return;
        }
        this.e = cjoVar;
        if (!this.c) {
            cjo cjoVar2 = this.e;
            if (cjoVar2 == null) {
                return;
            }
            cjoVar2.a(null);
            return;
        }
        new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, cjsVar);
    }

    /* loaded from: classes3.dex */
    public class a extends AsyncTask<cjs, Void, cjt> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1935536970);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2026216808) {
                super.onPreExecute();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [tb.cjt, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ cjt doInBackground(cjs[] cjsVarArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, cjsVarArr}) : a(cjsVarArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(cjt cjtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, cjtVar});
            } else {
                a(cjtVar);
            }
        }

        public cjt a(cjs... cjsVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cjt) ipChange.ipc$dispatch("41c67de8", new Object[]{this, cjsVarArr});
            }
            if (cjsVarArr[0].c) {
                com.ap.zoloz.hummer.common.a.a().a("", false, new DialogInterface.OnCancelListener() { // from class: tb.cjr.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                }, true);
            }
            return cjr.a(cjr.this, cjsVarArr[0]);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873a6298", new Object[]{this});
            } else {
                super.onPreExecute();
            }
        }

        public void a(cjt cjtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                return;
            }
            com.ap.zoloz.hummer.common.a.a().c();
            if (cjr.a(cjr.this) == null) {
                return;
            }
            cjr.a(cjr.this).a(cjtVar);
        }
    }

    private cjt a(cjs cjsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjt) ipChange.ipc$dispatch("49fd6b4d", new Object[]{this, cjsVar});
        }
        cjt cjtVar = new cjt();
        BioLog.i("RpcManager rpcRequest " + cjsVar.toString());
        BioLog.i("RpcManager versionToken of request " + cjsVar.f26321a.versionToken);
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(cjn.ZIM_IDENTIFY_NEXTINDEX, Integer.toString(cjsVar.f26321a.nextIndex.intValue()));
        hashMap.put("currentTaskName", cjsVar.b);
        hashMap.put("payload", String.valueOf(JSON.toJSONString(cjsVar.f26321a).getBytes().length / 1024));
        h.a().a("ztech_next_start", hashMap);
        try {
            if (this.b != null) {
                cjtVar.f26322a = this.b.a(cjsVar.f26321a, this.f26318a);
            }
        } catch (Throwable th) {
            boolean z = th instanceof IRpcException;
            if (z || (th instanceof RpcException)) {
                cjtVar.b = "network_exception";
                cjtVar.c = th.toString();
                hashMap.clear();
                if (z) {
                    IRpcException iRpcException = (IRpcException) th;
                    hashMap.put("rpcResultMsg", iRpcException.getMsg());
                    hashMap.put(rrv.RPC_RESULT_CODE, Integer.toString(iRpcException.getCode()));
                } else {
                    RpcException rpcException = (RpcException) th;
                    hashMap.put("rpcResultMsg", rpcException.getMsg());
                    hashMap.put(rrv.RPC_RESULT_CODE, Integer.toString(rpcException.getCode()));
                }
                hashMap.put("action", "next");
                h.a().a("ztech_rpc_error", hashMap);
                BioLog.e(th);
            } else {
                cjtVar.b = "exception";
            }
        }
        boolean isNullorEmpty = StringUtil.isNullorEmpty(cjtVar.b);
        String str = (cjtVar.f26322a.response == null || cjtVar.f26322a.response.size() <= 0) ? "" : cjtVar.f26322a.response.get(0).retCode;
        hashMap.clear();
        hashMap.put("success", Boolean.toString(isNullorEmpty));
        hashMap.put("currentTaskName", cjsVar.b);
        hashMap.put("bizResultCode", str);
        hashMap.put(rrv.UPLOAD_TIME, Long.toString(System.currentTimeMillis() - currentTimeMillis));
        h.a().a("ztech_next_end", hashMap);
        BioLog.i("RpcManager rpcResponse = " + cjtVar.toString());
        BioLog.i("RpcManager versionToken of response " + cjtVar.f26322a.versionToken);
        return cjtVar;
    }

    public cjs a(b bVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjs) ipChange.ipc$dispatch("a9a7a086", new Object[]{this, bVar, new Integer(i), new Boolean(z)});
        }
        if (bVar == null) {
            return null;
        }
        FactorNextRequest factorNextRequest = new FactorNextRequest();
        factorNextRequest.hummerId = bVar.f6457a;
        factorNextRequest.bizId = Long.toString(System.currentTimeMillis());
        factorNextRequest.versionToken = String.valueOf(bVar.a("versionToken"));
        factorNextRequest.nextIndex = Integer.valueOf(i);
        HashMap<String, Object> e = bVar.e();
        if (e != null) {
            factorNextRequest.params = e;
        }
        factorNextRequest.zStack = bVar.f();
        cjs cjsVar = new cjs();
        cjsVar.f26321a = factorNextRequest;
        cjsVar.b = (String) bVar.a("currentTaskName");
        cjsVar.c = z;
        return cjsVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (d == null) {
        } else {
            this.c = false;
            d = null;
            this.e = null;
        }
    }
}
