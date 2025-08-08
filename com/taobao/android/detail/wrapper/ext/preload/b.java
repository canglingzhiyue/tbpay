package com.taobao.android.detail.wrapper.ext.preload;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.performance.preload.core.task.c;
import com.taobao.android.detail.core.performance.preload.core.task.f;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.utils.i;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecg;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements f<MtopResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11327a = false;
    private f<Long> b;

    static {
        kge.a(914397656);
        kge.a(-1051003730);
    }

    public b() {
        emu.a("com.taobao.android.detail.wrapper.ext.preload.PreloadTaskCallback");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f11327a = z;
        }
    }

    public void a(f<Long> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5623d895", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    @Override // com.taobao.android.detail.core.performance.preload.core.task.f
    public void a(PreloadTaskEntity preloadTaskEntity, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4a8a3c", new Object[]{this, preloadTaskEntity, exc});
            return;
        }
        i.a(l.a("PreloadTaskCallback"), "预请求失败", exc);
        String a2 = c.a(preloadTaskEntity);
        String c = c.c(preloadTaskEntity);
        ecg.c(c, exc == null ? "" : exc.getMessage(), a2, com.taobao.android.detail.core.performance.preload.b.a(a2));
        if (!this.f11327a) {
            return;
        }
        ecg.c(c, a2);
    }

    @Override // com.taobao.android.detail.core.performance.preload.core.task.f
    public void a(PreloadTaskEntity preloadTaskEntity, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a217cf", new Object[]{this, preloadTaskEntity, mtopResponse});
            return;
        }
        f<Long> fVar = this.b;
        if (fVar != null) {
            fVar.a(preloadTaskEntity, (PreloadTaskEntity) Long.valueOf(SystemClock.uptimeMillis()));
        }
        String c = c.c(preloadTaskEntity);
        String b = c.b(preloadTaskEntity);
        String a2 = c.a(preloadTaskEntity);
        ecg.b(c, b, a2, com.taobao.android.detail.core.performance.preload.b.a(a2));
        if (this.f11327a) {
            ecg.b(c, a2);
        }
        if (preloadTaskEntity == null) {
            i.a(l.a("PreloadTaskCallback"), "预请求preloadTaskEntity为空,不保存");
        } else if (mtopResponse == null) {
            i.a(l.a("PreloadTaskCallback"), "预请求mtopResponse为空");
        } else {
            i.c(l.a("PreloadTaskCallback"), "预请求成功");
            JSONObject jSONObject = null;
            if (eip.K) {
                jSONObject = mtopResponse.getOriginFastJsonObject();
                i.c(l.a("PreloadTaskCallback"), "预加载数据使用json流式解析");
            }
            if (jSONObject == null) {
                String a3 = a.a(mtopResponse);
                if (StringUtils.isEmpty(a3)) {
                    i.c(l.a("PreloadTaskCallback"), "预请求结果为空");
                    return;
                }
                i.c(l.a("PreloadTaskCallback"), "预加载数据json解析为空，保存string形式");
                k.a().a(preloadTaskEntity, a3);
                return;
            }
            i.c(l.a("PreloadTaskCallback"), "预加载数据使用json流式解析成功");
            k.a().a(preloadTaskEntity, jSONObject);
        }
    }
}
