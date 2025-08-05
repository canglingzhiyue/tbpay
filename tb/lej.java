package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.List;

/* loaded from: classes.dex */
public class lej {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DinamicXEngine f30523a;

    static {
        kge.a(1915820252);
    }

    public static /* synthetic */ void a(lej lejVar, String str, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cd6fcf", new Object[]{lejVar, str, fvbVar});
        } else {
            lejVar.a(str, fvbVar);
        }
    }

    public static /* synthetic */ void a(lej lejVar, List list, String str, IDxItemRenderService.b bVar, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f7ccd5", new Object[]{lejVar, list, str, bVar, fvbVar});
        } else {
            lejVar.a(list, str, bVar, fvbVar);
        }
    }

    public lej(DinamicXEngine dinamicXEngine) {
        this.f30523a = dinamicXEngine;
    }

    public void a(final List<DXTemplateItem> list, final String str, final IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505c43d6", new Object[]{this, list, str, bVar});
            return;
        }
        ldf.d("Dx3TemplateDownloader", "downloadDX3Template module : " + str);
        if (!list.isEmpty()) {
            this.f30523a.a(list);
            this.f30523a.a(new fve() { // from class: tb.lej.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fve
                public void onNotificationListener(fvb fvbVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                        return;
                    }
                    lej.a(lej.this, list, str, bVar, fvbVar);
                    lej.a(lej.this, str, fvbVar);
                }
            });
            return;
        }
        ldf.d("Dx3TemplateDownloader", "downloadDX3Template 下载模板为空，module : " + str);
    }

    private void a(List<DXTemplateItem> list, String str, IDxItemRenderService.b bVar, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e02974", new Object[]{this, list, str, bVar, fvbVar});
        } else if (fvbVar.f28139a == null || fvbVar.f28139a.isEmpty()) {
            ldf.d("Dx3TemplateDownloader", "downloadDX3Template 3.0模板下载失败， list " + JSON.toJSONString(list));
        } else if (bVar == null) {
        } else {
            ldf.d("Dx3TemplateDownloader", "模板下载成功回调。 module : " + str);
            bVar.a();
        }
    }

    private void a(String str, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293a15d0", new Object[]{this, str, fvbVar});
        } else if (fvbVar.c != null && !fvbVar.c.isEmpty()) {
            ldf.d("Dx3TemplateDownloader", "模板下载失败回调。 module : " + str);
            for (fvd fvdVar : fvbVar.c) {
                if (fvdVar.c == 1000) {
                    JSONObject jSONObject = fvdVar.b;
                    ldf.d("Dx3TemplateDownloader", "渲染失败触发降级 ： " + jSONObject.toJSONString());
                    a(jSONObject);
                }
            }
        }
    }

    private void a(JSONObject jSONObject) {
        ldz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (a2 = leb.a(lix.b(jSONObject))) == null) {
        } else {
            a2.g();
            a2.a(true);
        }
    }
}
