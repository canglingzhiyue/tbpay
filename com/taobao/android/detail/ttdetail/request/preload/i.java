package com.taobao.android.detail.ttdetail.request.preload;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import com.taobao.android.detail.ttdetail.request.preload.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final f f10799a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private String c;

    public static /* synthetic */ e a(i iVar, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("43f44aee", new Object[]{iVar, dVar}) : iVar.a(dVar);
    }

    static {
        kge.a(928754748);
        f10799a = new f();
    }

    public i(String str) {
        this.c = str;
    }

    public static i a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("40556463", new Object[]{str}) : new i(str);
    }

    public synchronized void a(List<c> list, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f312d7d", new Object[]{this, list, dVar});
        } else if (!this.b.get()) {
            if (list != null && !list.isEmpty()) {
                for (c cVar : list) {
                    if (cVar != null) {
                        String str = cVar.b;
                        if (!TextUtils.isEmpty(str)) {
                            if (h.a().a(str) != null) {
                                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailRealTask", "预加载缓存已有数据");
                            } else if (f10799a.a(str)) {
                                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailRealTask", "已在预加载运行队列中");
                            } else {
                                dVar.a(cVar);
                            }
                        }
                    }
                }
                f10799a.a(new f.a() { // from class: com.taobao.android.detail.ttdetail.request.preload.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.request.preload.f.a
                    public e getPromoteTask() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (e) ipChange2.ipc$dispatch("e25b9563", new Object[]{this}) : i.a(i.this, dVar);
                    }
                });
                if (!f10799a.a()) {
                    f10799a.a(a(dVar));
                }
                this.b.set(true);
            }
        }
    }

    private e a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c6b53d0d", new Object[]{this, dVar});
        }
        List<c> a2 = dVar.a();
        if (a2.isEmpty()) {
            return null;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailRealTask", "预加载有效items=" + a2.size());
        return new e(f10799a, new PreloadRequestParams(this.c, a2));
    }
}
