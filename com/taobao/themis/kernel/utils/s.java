package com.taobao.themis.kernel.utils;

import android.content.Context;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.fxb;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/kernel/utils/UsrPathConversionUtils;", "", "()V", "LOCAL_PATH_FLAG", "", "PATH_PREFIX", "PATH_ROOT_LENGTH", "", RPCDataItems.SWITCH_TAG_LOG, "localPathToUsrPath", "context", "Landroid/content/Context;", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, "bizId", "usrPathToLocalPath", "usrPath", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final s INSTANCE;
    public static final String LOCAL_PATH_FLAG = "/themis/usr";
    public static final String PATH_PREFIX = "https://usr";

    static {
        kge.a(1952037148);
        INSTANCE = new s();
    }

    private s() {
    }

    @JvmStatic
    public static final String a(Context context, String usrPath, String bizId) {
        int length;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, usrPath, bizId});
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(usrPath, "usrPath");
        kotlin.jvm.internal.q.d(bizId, "bizId");
        TMSLogger.b("UsrPathConversionUtils", "usrPathToLocalPath，usrPath: " + usrPath + ", bizId: " + bizId);
        if (!(usrPath.length() == 0)) {
            if ((bizId.length() == 0) || (length = usrPath.length()) < 11) {
                return null;
            }
            if ((length == 11 && (!kotlin.jvm.internal.q.a((Object) usrPath, (Object) PATH_PREFIX))) || !kotlin.text.n.b(usrPath, PATH_PREFIX, false, 2, (Object) null)) {
                return null;
            }
            String b = e.b(context, "usr/" + bizId);
            String str = b;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
            File file = new File(b);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (length == 11) {
                return b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            String substring = usrPath.substring(11);
            kotlin.jvm.internal.q.b(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            String sb2 = sb.toString();
            TMSLogger.b("UsrPathConversionUtils", "usr local path: " + sb2);
            return sb2;
        }
        return null;
    }

    @JvmStatic
    public static final String b(Context context, String localPath, String bizId) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, localPath, bizId});
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(localPath, "localPath");
        kotlin.jvm.internal.q.d(bizId, "bizId");
        TMSLogger.b("UsrPathConversionUtils", "localPathToUsrPath, localPath: " + localPath + ", bizId: " + bizId);
        if (!(localPath.length() == 0)) {
            if (!(bizId.length() == 0)) {
                String b = e.b(context, "usr/" + bizId);
                String str = b;
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return null;
                }
                if (!kotlin.text.n.b(localPath, b + fxb.DIR, false, 2, (Object) null)) {
                    return null;
                }
                boolean a2 = kotlin.jvm.internal.q.a((Object) localPath, (Object) b);
                String str2 = PATH_PREFIX;
                if (!a2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    String substring = localPath.substring(b.length());
                    kotlin.jvm.internal.q.b(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    str2 = sb.toString();
                }
                TMSLogger.b("UsrPathConversionUtils", "localPathToUsrPath, usrPath: " + str2);
                return str2;
            }
        }
        return null;
    }
}
