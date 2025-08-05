package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.runtime.BioResManager;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.Logger;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.BaseWebService;
import com.ap.zoloz.hummer.common.ServiceDesc;
import com.ap.zoloz.hummer.common.WebTask;
import com.ap.zoloz.hummer.common.a;
import com.ap.zoloz.hummer.common.b;
import com.ap.zoloz.hummer.common.c;
import com.ap.zoloz.hummer.common.e;
import com.ap.zoloz.hummer.common.f;
import com.ap.zoloz.hummer.common.h;
import com.ap.zoloz.hummer.common.i;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class cjg extends cjf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EkycFacade";
    private static cjg d;
    private cjj e;
    private e f;

    static {
        kge.a(319320597);
    }

    public static /* synthetic */ Object ipc$super(cjg cjgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    public static /* synthetic */ void a(cjg cjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38a41f8", new Object[]{cjgVar});
        } else {
            cjgVar.f();
        }
    }

    public static /* synthetic */ void a(cjg cjgVar, cji cjiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab827046", new Object[]{cjgVar, cjiVar});
        } else {
            cjgVar.a(cjiVar);
        }
    }

    public static /* synthetic */ void b(cjg cjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20d4879", new Object[]{cjgVar});
        } else {
            cjgVar.g();
        }
    }

    public cjg() {
        this.f26303a = new b();
        this.f26303a.a("currentTaskName", "context", TAG);
        this.b = new c();
    }

    public static cjg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjg) ipChange.ipc$dispatch("1e668afc", new Object[0]);
        }
        if (d == null) {
            synchronized (cjg.class) {
                if (d == null) {
                    d = new cjg();
                }
            }
        }
        return d;
    }

    public void a(cjh cjhVar, cjj cjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3348a04", new Object[]{this, cjhVar, cjjVar});
            return;
        }
        BioLog.i("EkycFacade startEkyc " + cjhVar.toString());
        synchronized (cjg.class) {
            if (c) {
                a();
            }
        }
        c = true;
        this.e = cjjVar;
        if (cjhVar == null || this.f26303a == null || this.b == null) {
            BioLog.e("illegal request!");
            return;
        }
        if (cjhVar.c != null && cjhVar.c.containsKey("hummerContext") && (cjhVar.c.get("hummerContext") instanceof Activity)) {
            a((Context) cjhVar.c.get("hummerContext"));
        }
        if (this.f26303a.b == null) {
            BioLog.e("context is null!");
            cji cjiVar = new cji();
            cjiVar.f26311a = 1003;
            cjiVar.b = "Z7011";
            cjiVar.c = "context is null";
            a(cjiVar);
            return;
        }
        this.f = new e() { // from class: tb.cjg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.e
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.ap.zoloz.hummer.common.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    cjg.a(cjg.this);
                }
            }
        };
        if (StringUtil.isNullorEmpty(cjhVar.f26310a)) {
            this.f26303a.b(TAG, "Z7010");
            this.f26303a.a(TAG, "Z7010");
            a.a().a(this.f);
            return;
        }
        this.f26303a.f6457a = cjhVar.f26310a;
        if (StringUtil.isNullorEmpty(cjhVar.d)) {
            this.f26303a.b(TAG, "Z7012");
            this.f26303a.a(TAG, "Z7012");
            a.a().a(this.f);
        } else if (!a(cjhVar.d)) {
            this.f26303a.b(TAG, "Z7031");
            this.f26303a.a(TAG, "Z7031");
            a.a().a(this.f);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("hummerId", this.f26303a.f6457a);
            if (this.f26303a.a("DEVICE_ID") != null) {
                hashMap.put("DEVICE_ID", (String) this.f26303a.a("DEVICE_ID"));
            }
            if (this.f26303a.a("MERCHANT_USER_ID") != null) {
                hashMap.put("userId", (String) this.f26303a.a("MERCHANT_USER_ID"));
            }
            if (this.f26303a.a("REMOTELOG_URL") != null) {
                hashMap.put("REMOTELOG_URL", (String) this.f26303a.a("REMOTELOG_URL"));
            }
            hashMap.put("authType", "EKYC");
            h.a().a(this.f26303a.b.getApplicationContext(), hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sdkVersion", ZIMFacade.getZimMetaInfo(this.f26303a.b, null).getBioMetaInfo());
            h.a().a("ekycStart", hashMap2);
            synchronized (this) {
                if (this.f26303a == null) {
                    return;
                }
                MicroModuleContext.getInstance().attachContext(this.f26303a.b.getApplicationContext());
                cjp cjpVar = new cjp();
                cjpVar.a(this.f26303a.b.getApplicationContext());
                cjpVar.b(String.valueOf(this.f26303a.a("WORKSPACE_ID")));
                cjpVar.a(String.valueOf(this.f26303a.a("APP_ID")));
                cjpVar.setGW(String.valueOf(this.f26303a.a("GATEWAY_URL")));
                cjr.a().a((HummerGWFacade) cjpVar.getRpcProxy(HummerGWFacade.class));
                i.a().a(h());
                h.a().a("ztech_check_pass", (Map<String, String>) null);
                this.b.a(this.f26303a, new f() { // from class: tb.cjg.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ap.zoloz.hummer.common.f
                    public void a(b bVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3b350a3", new Object[]{this, bVar});
                            return;
                        }
                        cjg.this.f26303a.a("currentTaskName", "context", cjg.TAG);
                        cjg cjgVar = cjg.this;
                        cjgVar.f26303a = bVar;
                        cji cjiVar2 = (cji) cjgVar.f26303a.a("hummer_response");
                        cjiVar2.b = cjg.this.f26303a.h();
                        cjiVar2.c = JSON.toJSONString(cjg.this.f26303a.f());
                        if (cjiVar2 == null) {
                            return;
                        }
                        cjg.a(cjg.this, cjiVar2);
                    }
                }, true);
            }
        }
    }

    @Override // tb.cjf
    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        BioLog.i("releasing");
        super.b();
        c = false;
        if (d != null) {
            d = null;
        }
        this.e = null;
        this.f = null;
    }

    @Override // tb.cjf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BioLog.i("forceQuitting");
        super.a();
        this.f = null;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a3cf99c6", new Object[]{this}) : this.f26303a;
    }

    private void a(cji cjiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38b2ab6", new Object[]{this, cjiVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("prodRetCode", String.valueOf(cjiVar.f26311a));
        hashMap.put("prodSubRetCode", cjiVar.b);
        h.a().a("ekycEnd", hashMap);
        cjj cjjVar = this.e;
        if (cjjVar != null) {
            cjjVar.a(cjiVar);
        }
        BioLog.i("ekyc response =" + cjiVar.toString());
        b();
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        BioLog.i("endWebTask ");
        if (this.f26303a == null || this.b == null || this.f26303a.a() == null) {
            return;
        }
        if (this.f26303a.a().type.equals("webTask")) {
            WebTask webTask = (WebTask) this.b.a();
            if (webTask == null) {
                return;
            }
            webTask.handleResult(i, str);
            return;
        }
        this.f26303a.b(TAG, "Z7021");
        this.f26303a.a(TAG, "Z7021");
        a.a().a(this.f);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f26303a == null) {
        } else {
            int i = this.f26303a.i();
            if (i == 0) {
                this.f26303a.b(TAG, "Z7034");
                g();
                return;
            }
            cjr.a().a(new cjo() { // from class: tb.cjg.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjo
                public void a(cjt cjtVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                    } else {
                        cjg.b(cjg.this);
                    }
                }
            }, cjr.a().a(this.f26303a, i, false));
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        i.a().b();
        cji cjiVar = new cji();
        cjiVar.f26311a = 1003;
        if (this.f26303a != null) {
            cjiVar.b = this.f26303a.h();
            cjiVar.c = JSON.toJSONString(this.f26303a.f());
        }
        a(cjiVar);
    }

    private BaseWebService h() {
        if (this.f26303a == null) {
            return null;
        }
        try {
            return (BaseWebService) Class.forName(((ServiceDesc) JSON.parseObject(new String(FileUtil.getAssetsData(this.f26303a.b.getApplicationContext().getResources(), "hummer_service.json")), ServiceDesc.class)).className).newInstance();
        } catch (ClassNotFoundException e) {
            BioLog.e(e.toString());
            this.f26303a.b(TAG, "Z7017");
            a.a().a(this.f);
            return null;
        } catch (IllegalAccessException e2) {
            BioLog.e(e2.toString());
            this.f26303a.b(TAG, "Z7017");
            a.a().a(this.f);
            return null;
        } catch (InstantiationException e3) {
            BioLog.e(e3.toString());
            this.f26303a.b(TAG, "Z7017");
            a.a().a(this.f);
            return null;
        } catch (NullPointerException e4) {
            BioLog.e(e4.toString());
            this.f26303a.b(TAG, "Z7016");
            a.a().a(this.f);
            return null;
        }
    }

    public void a(final Context context, final cjk cjkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a1936c", new Object[]{this, context, cjkVar});
            return;
        }
        BioLog.setLogger(new Logger() { // from class: tb.cjg.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public String a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1003a7b3", new Object[]{this, th}) : "";
            }

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public int debug(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue();
                }
                return 0;
            }

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public int error(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue();
                }
                return 0;
            }

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public int info(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue();
                }
                return 0;
            }

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public int verbose(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue();
                }
                return 0;
            }

            @Override // com.alipay.mobile.security.bio.utils.Logger
            public int warn(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue();
                }
                return 0;
            }
        });
        int status = BioResManager.getInstance().getStatus();
        if (status == 5 || status == 3) {
            if (cjkVar == null) {
                return;
            }
            cjkVar.a(true);
        } else if (status == -1) {
            if (cjkVar == null) {
                return;
            }
            cjkVar.a(false);
        } else if (Runtime.isNeedtoDownload()) {
            AsyncTask.execute(new Runnable() { // from class: tb.cjg.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioRuntimeDependency bioRuntimeDependency = BioResManager.getBioRuntimeDependency(context);
                        if (bioRuntimeDependency == null) {
                            return;
                        }
                        int init = BioResManager.getInstance().init(context, bioRuntimeDependency, new BioResManager.Callback() { // from class: tb.cjg.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.security.bio.runtime.BioResManager.Callback
                            public void onDownloadComplete(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ccf49c71", new Object[]{this, str});
                                }
                            }

                            @Override // com.alipay.mobile.security.bio.runtime.BioResManager.Callback
                            public void onDownloadStart(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5560a96c", new Object[]{this, str});
                                }
                            }

                            @Override // com.alipay.mobile.security.bio.runtime.BioResManager.Callback
                            public void onInitComplete() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7bbdc66f", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.mobile.security.bio.runtime.BioResManager.Callback
                            public void onAllDownloadComplete() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("eff344a", new Object[]{this});
                                } else if (cjkVar == null) {
                                } else {
                                    cjkVar.a(true);
                                }
                            }

                            @Override // com.alipay.mobile.security.bio.runtime.BioResManager.Callback
                            public void onError(int i, int i2, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
                                } else if (cjkVar == null) {
                                } else {
                                    cjkVar.a(false);
                                }
                            }
                        });
                        if (init == 1) {
                            BioResManager.getInstance().startDownload();
                        } else if ((init != 5 && init != 3) || cjkVar == null) {
                        } else {
                            cjkVar.a(true);
                        }
                    } catch (Throwable th) {
                        BioLog.e(th.toString());
                    }
                }
            });
        } else if (cjkVar == null) {
        } else {
            cjkVar.a(false);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        int status = BioResManager.getInstance().getStatus();
        return status == 5 || status == 3;
    }
}
