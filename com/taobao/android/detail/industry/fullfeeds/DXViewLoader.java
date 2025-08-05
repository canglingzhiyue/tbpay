package com.taobao.android.detail.industry.fullfeeds;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.fullfeeds.DXViewLoader;
import com.taobao.android.detail.industry.tool.a;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import java.util.Collections;
import java.util.List;
import tb.fvb;
import tb.fve;
import tb.kge;

/* loaded from: classes4.dex */
public class DXViewLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private fve f10075a;
    private final DinamicXEngine b;
    private final Context c;
    private TemplateDownloadStatus d = TemplateDownloadStatus.INIT;

    /* renamed from: com.taobao.android.detail.industry.fullfeeds.DXViewLoader$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10076a = new int[TemplateDownloadStatus.values().length];

        static {
            try {
                f10076a[TemplateDownloadStatus.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10076a[TemplateDownloadStatus.MAIN_TEMPLATE_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum TemplateDownloadStatus {
        INIT,
        MAIN_TEMPLATE_DOWNLOAD
    }

    static {
        kge.a(856474363);
    }

    public static /* synthetic */ TemplateDownloadStatus a(DXViewLoader dXViewLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateDownloadStatus) ipChange.ipc$dispatch("d5e4f08a", new Object[]{dXViewLoader}) : dXViewLoader.d;
    }

    public static /* synthetic */ TemplateDownloadStatus a(DXViewLoader dXViewLoader, TemplateDownloadStatus templateDownloadStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateDownloadStatus) ipChange.ipc$dispatch("6fa9a218", new Object[]{dXViewLoader, templateDownloadStatus});
        }
        dXViewLoader.d = templateDownloadStatus;
        return templateDownloadStatus;
    }

    public static /* synthetic */ DXTemplateItem a(DXViewLoader dXViewLoader, String str, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("fa8cb0e6", new Object[]{dXViewLoader, str, list}) : dXViewLoader.a(str, list);
    }

    public static /* synthetic */ void a(DXViewLoader dXViewLoader, DXTemplateItem dXTemplateItem, JSONObject jSONObject, a$a a_a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb89ece9", new Object[]{dXViewLoader, dXTemplateItem, jSONObject, a_a});
        } else {
            dXViewLoader.b(dXTemplateItem, jSONObject, a_a);
        }
    }

    public DXViewLoader(Context context, DinamicXEngine dinamicXEngine) {
        this.b = dinamicXEngine;
        this.c = context;
    }

    public void a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, a$a a_a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf985ff", new Object[]{this, dXTemplateItem, jSONObject, a_a});
        } else {
            a(dXTemplateItem, jSONObject, true, a_a);
        }
    }

    public void a(DXTemplateItem dXTemplateItem, final JSONObject jSONObject, boolean z, final a$a a_a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a80935", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z), a_a});
            return;
        }
        DXTemplateItem a2 = this.b.a(dXTemplateItem);
        final String str = dXTemplateItem.f11925a;
        if (a2 != null && a2.b == dXTemplateItem.b) {
            b(a2, jSONObject, a_a);
            return;
        }
        if (a2 != null && z) {
            b(a2, jSONObject, a_a);
        }
        this.f10075a = new fve() { // from class: com.taobao.android.detail.industry.fullfeeds.a$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public void onNotificationListener(fvb fvbVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    return;
                }
                a.a("DXViewLoader", "onNotificationListener: " + JSON.toJSONString(fvbVar));
                int i = DXViewLoader.AnonymousClass1.f10076a[DXViewLoader.a(DXViewLoader.this).ordinal()];
                if (i != 1) {
                    if (i != 2 || fvbVar.c == null || fvbVar.c.isEmpty()) {
                        return;
                    }
                    DXViewLoader.this.a();
                    a_a.b();
                    return;
                }
                DXTemplateItem a3 = DXViewLoader.a(DXViewLoader.this, str, fvbVar.f28139a);
                if (a3 == null) {
                    a_a.a();
                    return;
                }
                DXViewLoader.a(DXViewLoader.this, DXViewLoader.TemplateDownloadStatus.MAIN_TEMPLATE_DOWNLOAD);
                DXViewLoader.a(DXViewLoader.this, a3, jSONObject, a_a);
            }
        };
        this.b.a(this.f10075a);
        this.b.a(Collections.singletonList(dXTemplateItem));
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
            return;
        }
        a.a("DXViewLoader", "refreshDx");
        this.b.a(dXWidgetNode, 0, new DXWidgetRefreshOption.a().a(true).b(true).a(2).a());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fve fveVar = this.f10075a;
        if (fveVar == null) {
            return;
        }
        this.b.d(fveVar);
        this.f10075a = null;
    }

    private void b(DXTemplateItem dXTemplateItem, JSONObject jSONObject, a$a a_a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5176509e", new Object[]{this, dXTemplateItem, jSONObject, a_a});
        } else {
            a_a.a(dXTemplateItem, this.b.a(this.b.b(this.c, dXTemplateItem).f11780a, jSONObject));
        }
    }

    private DXTemplateItem a(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c5375b7c", new Object[]{this, str, list});
        }
        if (list != null && !list.isEmpty() && str != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                if (str.equals(dXTemplateItem.f11925a)) {
                    return dXTemplateItem;
                }
            }
        }
        return null;
    }
}
