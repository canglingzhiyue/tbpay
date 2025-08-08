package tb;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.utils.j;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/open/utils/SecSPUtils;", "", "()V", "SPNAME", "", RPCDataItems.SWITCH_TAG_LOG, "getEncryptComponent", "Lcom/taobao/wireless/security/sdk/dynamicdataencrypt/IDynamicDataEncryptComponent;", "context", "Landroid/content/Context;", "getString", "key", "putString", "", "value", "remove", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tlp INSTANCE;

    static {
        kge.a(1559720688);
        INSTANCE = new tlp();
    }

    private tlp() {
    }

    public final void a(String key, String value) {
        Application applicationContext;
        t tVar;
        String dynamicEncryptDDp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, key, value});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return;
        }
        TMSLogger.b("SecSPUtils", "put key: " + key + " value:" + value);
        try {
            Result.a aVar = Result.Companion;
            IDynamicDataEncryptComponent a2 = INSTANCE.a(applicationContext);
            if (a2 == null || (dynamicEncryptDDp = a2.dynamicEncryptDDp(value)) == null) {
                tVar = null;
            } else {
                j.a(applicationContext, "tbSecStorageSP", key, dynamicEncryptDDp);
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    public final String a(String key) {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, key});
        }
        q.d(key, "key");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        String str = null;
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return null;
        }
        String str2 = "";
        String b = j.b(applicationContext, "tbSecStorageSP", key, str2);
        if (!StringUtils.isEmpty(b)) {
            try {
                IDynamicDataEncryptComponent a2 = a(applicationContext);
                if (a2 != null) {
                    str = a2.dynamicDecryptDDp(b);
                }
                str2 = str;
            } catch (Throwable th) {
                TMSLogger.b("SecSPUtils", str2, th);
            }
        }
        TMSLogger.b("SecSPUtils", "get key: " + key + " value:" + str2);
        return str2;
    }

    private final IDynamicDataEncryptComponent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDynamicDataEncryptComponent) ipChange.ipc$dispatch("dfea69e0", new Object[]{this, context});
        }
        SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
        if (securityGuardManager == null) {
            return null;
        }
        return securityGuardManager.getDynamicDataEncryptComp();
    }

    public final void b(String key) {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, key});
            return;
        }
        q.d(key, "key");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return;
        }
        j.c(applicationContext, "tbSecStorageSP", key);
        TMSLogger.b("SecSPUtils", "remove key: " + key);
    }
}
