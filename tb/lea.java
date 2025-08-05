package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;

/* loaded from: classes.dex */
public class lea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_FIRST_SCREEN_CARD = 8;

    /* renamed from: a  reason: collision with root package name */
    private final DinamicXEngine f30515a;

    static {
        kge.a(-535075759);
    }

    public lea(DinamicXEngine dinamicXEngine) {
        this.f30515a = dinamicXEngine;
    }

    public void a(ljs ljsVar, List<BaseSectionModel> list, List<DinamicTemplate> list2, List<DXTemplateItem> list3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a34abe", new Object[]{this, ljsVar, list, list2, list3, new Boolean(z)});
            return;
        }
        for (BaseSectionModel baseSectionModel : list) {
            ldz a2 = a((BaseSectionModel<?>) baseSectionModel);
            if (a2 != null) {
                if (!a2.a()) {
                    DinamicTemplate e = a2.e();
                    if (e != null && !a(e, list2)) {
                        list2.add(e);
                    }
                } else {
                    DXTemplateItem f = a2.f();
                    if (!a(f, list3)) {
                        list3.add(f);
                    }
                    if (z) {
                        a(f, baseSectionModel, ljsVar);
                    }
                }
            }
        }
    }

    private void a(DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65598974", new Object[]{this, dXTemplateItem, baseSectionModel, ljsVar});
            return;
        }
        DXRenderOptions a2 = new DXRenderOptions.a().a((ba) new InfoFlowDxUserContext(ljsVar, baseSectionModel)).a();
        DXTemplateItem a3 = this.f30515a.a(dXTemplateItem);
        if (a3 == null) {
            if (baseSectionModel != null && baseSectionModel.getIndex() < 6) {
                StringBuilder sb = new StringBuilder();
                sb.append("templateName: ");
                sb.append(dXTemplateItem == null ? "" : dXTemplateItem.f11925a);
                ldk.a("presetTemplate", "homepage", "1.0", null, null, null, "templateNotPreset", sb.toString());
            }
            ldf.d("DinamicX3Render", "prefetchTemplate availableTemplate == null");
        } else if (a3.b != dXTemplateItem.b) {
        } else {
            ldf.d("DinamicX3Render", "prefetchTemplate name：" + a3.f11925a + " version: " + a3.b);
            this.f30515a.a(DinamicXEngine.i(), baseSectionModel, a3, -1, a2);
        }
    }

    private ldz a(BaseSectionModel<?> baseSectionModel) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldz) ipChange.ipc$dispatch("92148114", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel != null && (b = lix.b(baseSectionModel)) != null) {
            return leb.a(b);
        }
        return null;
    }

    private boolean a(DXTemplateItem dXTemplateItem, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef2e7106", new Object[]{this, dXTemplateItem, list})).booleanValue();
        }
        for (DXTemplateItem dXTemplateItem2 : list) {
            if (dXTemplateItem2.equals(dXTemplateItem)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(DinamicTemplate dinamicTemplate, List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee9bf67", new Object[]{this, dinamicTemplate, list})).booleanValue();
        }
        for (DinamicTemplate dinamicTemplate2 : list) {
            if (dinamicTemplate2.equals(dinamicTemplate)) {
                return true;
            }
        }
        return false;
    }

    public static int a(JSONObject jSONObject) {
        String string;
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject == null || jSONObject.getJSONObject("args") == null || (string = jSONObject.getJSONObject("args").getString("index")) == null) {
            return -1;
        }
        try {
            parseInt = Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            ldf.d("DxTemplateClassifier", "NumberFormatException，无法转换坑位");
        }
        if (parseInt >= 0 && parseInt < 8) {
            return parseInt;
        }
        return -1;
    }
}
