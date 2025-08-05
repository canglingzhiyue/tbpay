package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.d;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.b;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;

/* loaded from: classes.dex */
public class lec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2114952684);
    }

    public View a(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1a39fd2b", new Object[]{this, context, viewGroup, dinamicTemplate});
        }
        try {
            b b = d.a(lfq.DINAMIC_MODULE).b(context, viewGroup, DTemplateManager.a(lfq.DINAMIC_MODULE).d(dinamicTemplate), null);
            if (!b.c()) {
                return null;
            }
            return b.e();
        } catch (Exception e) {
            ldf.a("DinamicX2Render", "createViewHolder failed", e);
            return null;
        }
    }

    public void a(View view, BaseSectionModel<?> baseSectionModel, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d16db", new Object[]{this, view, baseSectionModel, infoFlowDxUserContext});
            return;
        }
        try {
            d.a(lfq.DINAMIC_MODULE).a(view, baseSectionModel.toJsonObject(), infoFlowDxUserContext);
            a(baseSectionModel);
        } catch (Throwable th) {
            ldf.a("DynamicViewProvider", "bind failed", th);
        }
    }

    private void a(BaseSectionModel<?> baseSectionModel) {
        BaseTemplateModel mo1099getTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
        } else if (!lcz.b() || (mo1099getTemplate = baseSectionModel.mo1099getTemplate()) == null) {
        } else {
            String name = mo1099getTemplate.getName();
            String version = mo1099getTemplate.getVersion();
            ldf.e("DinamicX2Render", "【警报】发现 DX2 卡片， name : " + name + ", version: " + version);
        }
    }
}
