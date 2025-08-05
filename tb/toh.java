package tb;

import android.app.Application;
import android.content.Context;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.r;
import com.taobao.themis.kernel.utils.s;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.open.utils.LocalPathType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0003J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/open/utils/ConversionPathTool;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "apPathToLocalPath", "bizId", "apPath", "apPathType", "Lcom/taobao/themis/open/utils/ApPathType;", "getApPathType", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getDirSize", "", "getLocalPathType", "Lcom/taobao/themis/open/utils/LocalPathType;", a.CONFIG_LOCAL_PATH, "localPathToApPath", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class toh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final toh INSTANCE;

    static {
        kge.a(-1868435040);
        INSTANCE = new toh();
    }

    private toh() {
    }

    public static /* synthetic */ String a(String str, String str2, ApPathType apPathType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3c599eb", new Object[]{str, str2, apPathType, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            apPathType = null;
        }
        return a(str, str2, apPathType);
    }

    @JvmStatic
    public static final String a(String bizId, String apPath, ApPathType apPathType) {
        IEnvironmentService iEnvironmentService;
        Application applicationContext;
        Context applicationContext2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebdd156", new Object[]{bizId, apPath, apPathType});
        }
        q.d(bizId, "bizId");
        q.d(apPath, "apPath");
        TMSLogger.b("ConversionPathTool", "apPathToLocalPath:bizId = " + bizId + ", apPath = " + apPath + ", apPathType = " + apPathType);
        if (!(apPath.length() == 0)) {
            if (bizId.length() == 0) {
                z = true;
            }
            if (!z && (iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class)) != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null && (applicationContext2 = applicationContext.getApplicationContext()) != null) {
                if (apPathType == null) {
                    apPathType = b(apPath);
                }
                if (apPathType != null) {
                    int i = toi.$EnumSwitchMapping$0[apPathType.ordinal()];
                    if (i == 1) {
                        return s.a(applicationContext2, apPath, bizId);
                    }
                    if (i == 2) {
                        return r.Companion.a(bizId, applicationContext2).a(apPath);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String b(String bizId, String localPath, ApPathType apPathType) {
        IEnvironmentService iEnvironmentService;
        Application applicationContext;
        Context applicationContext2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d780917", new Object[]{bizId, localPath, apPathType});
        }
        q.d(bizId, "bizId");
        q.d(localPath, "localPath");
        q.d(apPathType, "apPathType");
        String str = bizId;
        if (str.length() == 0) {
            TMSLogger.d("ConversionPathTool", "apPathToLocalPath:bizId is null");
            return null;
        }
        TMSLogger.b("ConversionPathTool", "apPathToLocalPath:bizId = " + bizId + ", localPath = " + localPath + ", apPathType = " + apPathType);
        if (!(localPath.length() == 0)) {
            if (str.length() == 0) {
                z = true;
            }
            if (!z && (iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class)) != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null && (applicationContext2 = applicationContext.getApplicationContext()) != null) {
                int i = toi.$EnumSwitchMapping$1[apPathType.ordinal()];
                if (i == 1) {
                    return s.b(applicationContext2, localPath, bizId);
                }
                if (i == 2) {
                    return r.Companion.a(bizId, applicationContext2).b(localPath);
                }
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final ApPathType a(String apPath, f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApPathType) ipChange.ipc$dispatch("784c3f2d", new Object[]{apPath, instance});
        }
        q.d(apPath, "apPath");
        q.d(instance, "instance");
        if (n.b(apPath, s.PATH_PREFIX, false, 2, (Object) null)) {
            return ApPathType.AP_PATH_TYPE_USR;
        }
        if (n.b(apPath, r.PATH_PREFIX, false, 2, (Object) null)) {
            return ApPathType.AP_PATH_TYPE_TEMP;
        }
        if (n.b(apPath, k.HTTP_PREFIX, false, 2, (Object) null) || n.b(apPath, k.HTTPS_PREFIX, false, 2, (Object) null)) {
            return ApPathType.AP_PATH_TYPE_NETWORK;
        }
        if (toj.a(apPath, instance)) {
            return ApPathType.AP_PATH_TYPE_PKG;
        }
        return ApPathType.AP_PATH_TYPE_UNKNOWN;
    }

    @JvmStatic
    private static final ApPathType b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApPathType) ipChange.ipc$dispatch("d457c1a9", new Object[]{str});
        }
        if (n.b(str, s.PATH_PREFIX, false, 2, (Object) null)) {
            return ApPathType.AP_PATH_TYPE_USR;
        }
        if (!n.b(str, r.PATH_PREFIX, false, 2, (Object) null)) {
            return null;
        }
        return ApPathType.AP_PATH_TYPE_TEMP;
    }

    @JvmStatic
    public static final LocalPathType a(String localPath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalPathType) ipChange.ipc$dispatch("25178c56", new Object[]{localPath});
        }
        q.d(localPath, "localPath");
        if (n.b(localPath, s.LOCAL_PATH_FLAG, false, 2, (Object) null)) {
            return LocalPathType.LOCAL_PATH_TYPE_USR;
        }
        if (n.b(localPath, r.LOCAL_PATH_FLAG, false, 2, (Object) null)) {
            return LocalPathType.LOCAL_PATH_TYPE_TEMP;
        }
        return LocalPathType.LOCAL_PATH_TYPE_UNKNOWN;
    }
}
