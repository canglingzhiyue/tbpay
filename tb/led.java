package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.tempate.a;
import com.taobao.android.dinamic.tempate.b;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.List;

/* loaded from: classes.dex */
public class led {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1515527642);
    }

    public void a(final List<DinamicTemplate> list, String str, final IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505c43d6", new Object[]{this, list, str, bVar});
            return;
        }
        ldf.d("Dx2TemplateDownloader", "downloadDX2Template module : " + str);
        if (list.isEmpty()) {
            ldf.d("Dx2TemplateDownloader", "dinamic2List isEmpty");
            return;
        }
        DTemplateManager.a(str).a(list, new a() { // from class: tb.led.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamic.tempate.a
            public void a(b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fab23079", new Object[]{this, bVar2});
                } else if (bVar2.b == null || bVar2.b.isEmpty()) {
                    ldf.d("Dx2TemplateDownloader", "dx2 2.0模板下载失败, list : " + JSON.toJSONString(list));
                } else {
                    IDxItemRenderService.b bVar3 = bVar;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a();
                }
            }
        });
        for (DinamicTemplate dinamicTemplate : list) {
            leg.a(dinamicTemplate.name, dinamicTemplate.version, dinamicTemplate.templateUrl, str);
        }
    }
}
