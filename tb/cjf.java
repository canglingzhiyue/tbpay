package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.Logger;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMMetaInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.ClientConfig;
import com.ap.zoloz.hummer.common.a;
import com.ap.zoloz.hummer.common.b;
import com.ap.zoloz.hummer.common.c;
import com.ap.zoloz.hummer.common.h;
import com.ap.zoloz.hummer.common.i;
import java.util.Map;

/* loaded from: classes3.dex */
public class cjf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseFacade";
    public static boolean c;
    private static ClientConfig d;

    /* renamed from: a  reason: collision with root package name */
    public b f26303a;
    public c b;

    static {
        kge.a(1711616502);
        d = null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        b bVar = this.f26303a;
        if (bVar != null) {
            bVar.b = context;
            a.a().a(context);
            return;
        }
        BioLog.e("hummer context is null");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        BioLog.i("BaseFacade forceQuit");
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
        b bVar = this.f26303a;
        if (bVar != null) {
            bVar.c();
        }
        h.a().b();
        d = null;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.b != null && this.f26303a != null) {
            try {
                ClientConfig clientConfig = (ClientConfig) JSON.parseObject(str, ClientConfig.class);
                if (clientConfig == null) {
                    return false;
                }
                this.f26303a.a(clientConfig);
                if (clientConfig.factorContext == null || clientConfig.factorContext.size() == 0 || clientConfig.tasks == null || clientConfig.tasks.size() == 0 || clientConfig.clientStartIndex <= 0) {
                    return false;
                }
                this.f26303a.a(clientConfig.zStack);
                for (Map.Entry<String, Object> entry : clientConfig.factorContext.entrySet()) {
                    this.f26303a.a(entry.getKey(), "serverConfig", entry.getValue());
                }
                b bVar = this.f26303a;
                bVar.a("metaInfo", "context", b(bVar.b.getApplicationContext()));
                return true;
            } catch (Exception e) {
                BioLog.e(e.toString());
            }
        }
        return false;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        BioLog.setLogger(new Logger() { // from class: tb.cjf.1
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
        ApSecurityService apSecurityService = (ApSecurityService) BioServiceManager.getLocalService(context, ApSecurityService.class);
        if (apSecurityService != null) {
            apSecurityService.setContext(context);
        }
        try {
            ZIMMetaInfo zimMetaInfo = ZIMFacade.getZimMetaInfo(context, null);
            zimMetaInfo.setBioMetaInfo(new StringBuilder(zimMetaInfo.getBioMetaInfo()).replace(0, 6, "3.78.0").toString());
            return JSON.toJSONString(zimMetaInfo);
        } catch (Throwable th) {
            BioLog.e(th);
            return "";
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c = false;
        a.a().b();
        cjr.a().b();
        h.a().b();
        i.a().c();
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
            this.b = null;
        }
        b bVar = this.f26303a;
        if (bVar != null) {
            bVar.b();
            this.f26303a = null;
        }
        d = null;
    }
}
