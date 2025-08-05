package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ha;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class Ia extends BaseWuKongActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3247a;
    public final /* synthetic */ Ha.b b;

    public Ia(Ha.b bVar, String str) {
        this.b = bVar;
        this.f3247a = str;
    }

    private void a(InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d8239e", new Object[]{this, inferContext});
        } else if (inferContext == null) {
        } else {
            Ma.b(inferContext.ccrcCode, inferContext.sceneName, inferContext.metaId);
        }
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i + 1 == i2;
    }

    public static /* synthetic */ Object ipc$super(Ia ia, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform
    public void accept(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed5b2c", new Object[]{this, str, str2, str3, str4, new Integer(i)});
            return;
        }
        InferContext inferContext = (InferContext) JsonUtils.parseObject(str, (Class<Object>) InferContext.class);
        if (inferContext == null) {
            Logging.e(Ha.f3243a, "infer context params is null");
            return;
        }
        Ha.a(Ha.this, str, actionPerformCode(), inferContext, str3, str4, str2);
        if (i != 1 && i != 0) {
            AtomicInteger atomicInteger = this.b.f3244a.get(inferContext.getMetaId());
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger(0);
                this.b.f3244a.put(inferContext.getMetaId(), atomicInteger);
            }
            if (!a(atomicInteger.getAndIncrement(), i)) {
                return;
            }
            this.b.f3244a.remove(inferContext.getMetaId());
            a(inferContext);
            return;
        }
        a(inferContext);
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this}) : this.f3247a;
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }
}
