package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;

/* loaded from: classes7.dex */
public class lee extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lds f30518a;

    static {
        kge.a(764626968);
    }

    public static /* synthetic */ Object ipc$super(lee leeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c001722", new Object[]{this, view, obj, obj2});
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (!(obj3 instanceof InfoFlowDxUserContext)) {
        } else {
            InfoFlowDxUserContext infoFlowDxUserContext = (InfoFlowDxUserContext) obj3;
            ljs infoFlowContext = infoFlowDxUserContext.getInfoFlowContext();
            if (infoFlowContext == null) {
                ldf.d("HClickEventHandler", "infoFlowContext == null");
                return;
            }
            BaseSectionModel<?> baseSectionModel = infoFlowDxUserContext.getBaseSectionModel();
            if (baseSectionModel == null) {
                ldf.d("HClickEventHandler", "sectionModel == null");
                return;
            }
            BaseSubItemModel mo1095createBaseSubItemModel = baseSectionModel.mo1095createBaseSubItemModel(obj instanceof JSONObject ? (JSONObject) obj : null);
            if (mo1095createBaseSubItemModel == null) {
                ldf.d("HClickEventHandler", "subItemModel == null");
                return;
            }
            ljh.a(baseSectionModel, mo1095createBaseSubItemModel);
            a(infoFlowContext).a(baseSectionModel, mo1095createBaseSubItemModel, view);
        }
    }

    private lds a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lds) ipChange.ipc$dispatch("ac9ca688", new Object[]{this, ljsVar});
        }
        if (this.f30518a == null) {
            this.f30518a = new ldu(ljsVar);
        }
        return this.f30518a;
    }
}
