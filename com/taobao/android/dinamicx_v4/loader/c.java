package com.taobao.android.dinamicx_v4.loader;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fux;
import tb.fwo;
import tb.fwr;
import tb.fxb;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, DXWidgetNode> f12223a;
    private h b;
    private e c;
    private List<a> d = new ArrayList();

    static {
        kge.a(1679439908);
        kge.a(-202982083);
    }

    public c(h hVar, e eVar) {
        this.b = hVar;
        this.c = eVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.b.i());
        int f = fwrVar.f();
        if (f > 0) {
            for (int i = 0; i < f; i++) {
                a aVar = null;
                if (fwrVar.d() == 1) {
                    aVar = new a(this.c.a(fwrVar.f()), fwrVar.g());
                }
                if (aVar != null) {
                    this.d.add(aVar);
                }
            }
        }
        return true;
    }

    public void a(DXRuntimeContext dXRuntimeContext, Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e112cc0f", new Object[]{this, dXRuntimeContext, context});
            return;
        }
        List<a> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f12223a = new HashMap();
        String str = dXRuntimeContext.c().g.f11934a.split("/subTemplates/").length > 1 ? split[0] + "/subTemplates/" : dXRuntimeContext.c().g.f11934a.substring(0, dXRuntimeContext.c().g.f11934a.length() - 7) + "subTemplates/";
        for (a aVar : this.d) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = a.a(aVar);
            dXTemplateItem.b = a.b(aVar);
            com.taobao.android.dinamicx.template.download.f fVar = new com.taobao.android.dinamicx.template.download.f();
            fVar.f11934a = str + dXTemplateItem.f11925a + "/" + dXTemplateItem.b + "/" + fxb.DX_MAIN_TEMPLATE_NAME;
            fVar.b();
            fVar.b.put("logic", str + dXTemplateItem.f11925a + "/" + dXTemplateItem.b + "/logic");
            dXTemplateItem.g = fVar;
            DXRuntimeContext a2 = dXRuntimeContext.a((DXWidgetNode) null);
            a2.a(dXTemplateItem);
            DXWidgetNode a3 = new fwo(dXRuntimeContext.B().D()).a(dXTemplateItem, a2, context);
            if (a3 != null) {
                this.f12223a.put(a(dXTemplateItem), a3);
            } else {
                fux.b("load 子模版失败" + a(dXTemplateItem));
                if (DinamicXEngine.j()) {
                    throw new DXLoaderException("load 子模版失败" + a(dXTemplateItem));
                }
            }
        }
    }

    public String a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cf692af", new Object[]{this, dXTemplateItem});
        }
        return dXTemplateItem.f11925a + ":" + dXTemplateItem.b;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f12224a;
        private long b;

        static {
            kge.a(864693456);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("327dcb19", new Object[]{aVar}) : aVar.f12224a;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a155463a", new Object[]{aVar})).longValue() : aVar.b;
        }

        public a(String str, long j) {
            this.f12224a = str;
            this.b = j;
        }
    }
}
