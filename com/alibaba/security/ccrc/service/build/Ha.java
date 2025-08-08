package com.alibaba.security.ccrc.service.build;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class Ha {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3243a = "WuKongActionManager";
    public final Map<String, BaseWuKongActionPerform> b = new HashMap();
    public final b d = new b();
    public final a c = new a();

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2, InferContext inferContext, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("293fdc68", new Object[]{this, str, str2, inferContext, str3, str4, str5});
            } else if (inferContext == null) {
                Logging.e(Ha.f3243a, "infer context params is null");
            } else {
                String str6 = inferContext.ccrcCode;
                if (StringUtils.isEmpty(str6)) {
                    Logging.e(Ha.f3243a, "ccrcCode is empty,can not dispatch action correctly");
                    return;
                }
                Ga a2 = Ga.a(str6);
                if (a2 == null || a2.a() == null) {
                    return;
                }
                for (BaseActionPerform baseActionPerform : a2.a()) {
                    if (StringUtils.equals(str2, baseActionPerform.actionPerformCode())) {
                        baseActionPerform.accept(str, inferContext, str3, str4, str5);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentHashMap<String, AtomicInteger> f3244a = new ConcurrentHashMap<>();

        public b() {
        }

        public BaseWuKongActionPerform a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseWuKongActionPerform) ipChange.ipc$dispatch("71cafe2d", new Object[]{this, str}) : new Ia(this, str);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b.containsKey(str)) {
        } else {
            BaseWuKongActionPerform a2 = this.d.a(str);
            this.b.put(str, a2);
            WuKongNativeManager.a().a(a2);
        }
    }

    public static /* synthetic */ void a(Ha ha, String str, String str2, InferContext inferContext, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cfefd9d", new Object[]{ha, str, str2, inferContext, str3, str4, str5});
        } else {
            ha.c.a(str, str2, inferContext, str3, str4, str5);
        }
    }

    private void a(String str, String str2, InferContext inferContext, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293fdc68", new Object[]{this, str, str2, inferContext, str3, str4, str5});
        } else {
            this.c.a(str, str2, inferContext, str3, str4, str5);
        }
    }
}
