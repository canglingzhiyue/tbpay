package com.taobao.message.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.message.nav.InterceptChatProcessor;
import java.util.Set;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\n"}, d2 = {"Lcom/taobao/message/util/SimpleChatInterceptProcessor;", "Lcom/taobao/message/nav/InterceptChatProcessor;", "()V", "getUrl", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "parseIntent", "Landroid/os/Bundle;", "extBundle", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleChatInterceptProcessor implements InterceptChatProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(232230380);
        kge.a(-1713221249);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (10999 < r0) goto L8;
     */
    @Override // com.taobao.message.nav.InterceptChatProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getUrl(android.content.Intent r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.util.SimpleChatInterceptProcessor.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "79bd1043"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.q.c(r4, r0)
            r0 = 0
            android.os.Bundle r4 = parseIntent$default(r3, r4, r0, r2, r0)
            java.lang.String r0 = "bizType"
            boolean r1 = r4.containsKey(r0)
            java.lang.String r2 = "http://tb.cn/n/im/dynamic/loading.html"
            if (r1 == 0) goto L46
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L35
            kotlin.jvm.internal.q.a()     // Catch: java.lang.Throwable -> L45
        L35:
            java.lang.String r1 = "bundle.getString(\"bizType\")!!"
            kotlin.jvm.internal.q.a(r0, r1)     // Catch: java.lang.Throwable -> L45
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L45
            r1 = 10999(0x2af7, float:1.5413E-41)
            if (r0 >= 0) goto L43
            goto L46
        L43:
            if (r1 < r0) goto L46
        L45:
            return r2
        L46:
            java.lang.String r0 = "to_user"
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = "targetId"
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = "ccode"
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L69
            java.lang.String r4 = "SimpleChatInterceptProcessor"
            java.lang.String r0 = "lack params"
            com.taobao.tao.log.TLog.loge(r4, r0)
            return r2
        L69:
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mpm_data_switch"
            java.lang.String r1 = "useLoadingChatV6"
            boolean r4 = com.taobao.message.kit.util.ConfigUtil.getSamplingValue(r0, r1, r4)
            if (r4 == 0) goto L7e
            java.lang.String r4 = "http://tb.cn/n/im/dynamic/simple.html"
            return r4
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.util.SimpleChatInterceptProcessor.getUrl(android.content.Intent):java.lang.String");
    }

    public static /* synthetic */ Bundle parseIntent$default(SimpleChatInterceptProcessor simpleChatInterceptProcessor, Intent intent, Bundle bundle, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b6dd9da2", new Object[]{simpleChatInterceptProcessor, intent, bundle, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        return simpleChatInterceptProcessor.parseIntent(intent, bundle);
    }

    private final Bundle parseIntent(Intent intent, Bundle bundle) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("57173a85", new Object[]{this, intent, bundle});
        }
        Bundle bundle2 = null;
        if (intent == null) {
            return new Bundle();
        }
        try {
            bundle2 = intent.getExtras();
        } catch (IllegalArgumentException unused) {
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        Uri data = intent.getData();
        if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (!bundle2.containsKey(str)) {
                    bundle2.putString(str, data.getQueryParameter(str));
                }
            }
        }
        return bundle2;
    }
}
