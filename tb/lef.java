package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import java.util.List;

/* loaded from: classes7.dex */
public class lef extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lds f30519a;

    static {
        kge.a(-511581079);
    }

    public static /* synthetic */ Object ipc$super(lef lefVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (a(obj3)) {
            b(view, obj, obj3);
        } else {
            ldf.d("RTapEventHandler", "异常走到老架构！");
        }
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : obj instanceof InfoFlowDxUserContext;
    }

    private void b(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7203e281", new Object[]{this, view, obj, obj2});
            return;
        }
        InfoFlowDxUserContext infoFlowDxUserContext = (InfoFlowDxUserContext) obj2;
        ljs infoFlowContext = infoFlowDxUserContext.getInfoFlowContext();
        if (infoFlowContext == null) {
            ldf.d("RTapEventHandler", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> baseSectionModel = infoFlowDxUserContext.getBaseSectionModel();
        if (baseSectionModel == null) {
            ldf.d("RTapEventHandler", "sectionModel == null");
            return;
        }
        JSONObject b = b(obj);
        if (b == null) {
            ldf.d("RTapEventHandler", "tapData == null");
        }
        BaseSubItemModel mo1095createBaseSubItemModel = baseSectionModel.mo1095createBaseSubItemModel(b);
        if (mo1095createBaseSubItemModel == null) {
            ldf.d("RTapEventHandler", "subItemModel == null");
            return;
        }
        ljh.a(baseSectionModel, mo1095createBaseSubItemModel);
        a(infoFlowContext).a(baseSectionModel, mo1095createBaseSubItemModel, view);
    }

    private JSONObject b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c3e02a5", new Object[]{this, obj});
        }
        if (obj instanceof List) {
            return (JSONObject) ((List) obj).get(0);
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) obj;
    }

    private lds a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lds) ipChange.ipc$dispatch("ac9ca688", new Object[]{this, ljsVar});
        }
        if (this.f30519a == null) {
            this.f30519a = new ldv(ljsVar);
        }
        return this.f30519a;
    }
}
