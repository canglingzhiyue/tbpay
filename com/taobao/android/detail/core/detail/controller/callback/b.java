package com.taobao.android.detail.core.detail.controller.callback;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import tb.dya;
import tb.dyg;
import tb.emu;
import tb.enh;
import tb.god;
import tb.kge;
import tb.oqd;

/* loaded from: classes4.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(424954322);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b() {
        emu.a("com.taobao.android.detail.core.detail.controller.callback.DefaultMainRequestHandleCallback");
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.a
    public void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{this, detailCoreActivity});
            return;
        }
        String a2 = l.a("DefaultHandleMainRequestCallback");
        i.c(a2, "current thread:" + Thread.currentThread());
        b(detailCoreActivity);
        com.taobao.android.detail.core.perf.c.b(detailCoreActivity, oqd.MTOP_STAGE_NETWORKREQUEST);
        com.taobao.android.detail.core.perf.c.a(detailCoreActivity, "detailDataProcess");
    }

    private void b(DetailCoreActivity detailCoreActivity) {
        dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6c7d2", new Object[]{this, detailCoreActivity});
        } else if (detailCoreActivity == null || detailCoreActivity.f9411a == null || (y = detailCoreActivity.y()) == null || !y.c()) {
        } else {
            long j = detailCoreActivity.f9411a.w;
            long j2 = y.y;
            h.e(detailCoreActivity, j2 - j, SystemClock.uptimeMillis() - j2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.a
    public void a(DetailCoreActivity detailCoreActivity, JSONObject jSONObject, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f313cb7", new Object[]{this, detailCoreActivity, jSONObject, bVar});
        } else if (detailCoreActivity == null) {
            i.c(l.a("DefaultHandleMainRequestCallback"), "主接口请求处理 activity 为空 ");
        } else if (detailCoreActivity.f9411a == null) {
            i.c(l.a("DefaultHandleMainRequestCallback"), "主接口请求处理 queryParams 为空 ");
        } else {
            if (god.j) {
                detailCoreActivity.a(bVar);
            }
            String str = detailCoreActivity.f9411a.q;
            if (!com.taobao.android.detail.core.performance.e.a(str) && !com.taobao.android.detail.core.performance.e.b(str)) {
                i.c(l.a("DefaultHandleMainRequestCallback"), "主接口请求处理 预加载功能未打开 ");
            } else {
                dyg.a(detailCoreActivity, jSONObject, bVar);
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.a
    public void a(DetailCoreActivity detailCoreActivity, enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587eb124", new Object[]{this, detailCoreActivity, enhVar});
        } else {
            dyg.a(detailCoreActivity, enhVar);
        }
    }
}
