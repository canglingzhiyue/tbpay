package com.taobao.android.detail.ttdetail.component.module;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.ezh;
import tb.ezr;

/* loaded from: classes4.dex */
public class g implements ezh.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10543a;

    public g(e eVar) {
        this.f10543a = eVar;
    }

    @Override // tb.ezh.d
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        e.b(this.f10543a, true);
        e.a(this.f10543a, (View) viewGroup);
        e eVar = this.f10543a;
        e.$ipChange.a(false);
        ezr b = this.f10543a.mDetailContext.b();
        e eVar2 = this.f10543a;
        b.a(e.$ipChange);
        this.f10543a.mView.setTag(R.id.tt_detail_dx_view_bind_component_data_id, this.f10543a.mComponentData.b());
    }

    @Override // tb.ezh.d
    public void a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        e.b(this.f10543a, false);
        e.a(this.f10543a, e.$ipChange, str);
        e eVar = this.f10543a;
        e.$ipChange.a(true);
        ezr b = this.f10543a.mDetailContext.b();
        e eVar2 = this.f10543a;
        b.a(e.$ipChange);
        com.taobao.android.detail.ttdetail.utils.i.a(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: " + str);
        if (this.f10543a.mDetailContext == null || this.f10543a.mDetailContext.e() == null) {
            z = false;
        }
        final String str2 = "";
        final String str3 = z ? (String) this.f10543a.mDetailContext.e().a("traceId") : str2;
        if (z) {
            str2 = (String) this.f10543a.mDetailContext.e().a("requestItemId");
        }
        if (this.f10543a.mComponentData != 0 && this.f10543a.mComponentData.o() != null) {
            String o = this.f10543a.mComponentData.o();
            if (o.contains("bottomBar")) {
                i = -100001;
            } else {
                i = (o.contains("detail3Price") || o.contains("detail3Atmosphere")) ? -100002 : -1;
            }
            if (i != -1) {
                ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent$2$1
                    {
                        put("itemId", str2);
                        put("traceId", str3);
                        e eVar3 = g.this.f10543a;
                        put("DxName", e.$ipChange.getName());
                        e eVar4 = g.this.f10543a;
                        put("DxVersion", e.$ipChange.getVersion());
                        put("isAsyncDx", String.valueOf(com.taobao.android.detail.ttdetail.utils.a.a(g.this.f10543a.mComponentData)));
                        put("isPreloadData", String.valueOf(g.this.f10543a.mDetailContext.a().c()));
                    }
                }, i, str);
                return;
            }
        }
        ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent$2$2
            {
                put("itemId", str2);
                put("traceId", str3);
                e eVar3 = g.this.f10543a;
                put("DxName", e.$ipChange.getName());
                e eVar4 = g.this.f10543a;
                put("DxVersion", e.$ipChange.getVersion());
                put("isAsyncDx", String.valueOf(com.taobao.android.detail.ttdetail.utils.a.a(g.this.f10543a.mComponentData)));
            }
        }, -100007, str);
    }
}
