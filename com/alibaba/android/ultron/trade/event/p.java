package com.alibaba.android.ultron.trade.event;

import com.alibaba.android.ultron.trade.event.model.SimplePopupModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class p extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AS_SELECT = "asSelect";
    public static final String KEY_DISABLED = "disabled";
    public static final String KEY_IS_CHECKED = "isChecked";

    static {
        kge.a(-1150249290);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (this.f.F().b() == null || this.h == null || "true".equals(this.h.getFields().getString("disabled")) || (parent = this.h.getParent()) == null) {
        } else {
            Object obj = parent.getExtMap().get(m.KEY_SIMPLE_POPUP_MODEL);
            Object obj2 = parent.getExtMap().get(m.KEY_SIMPLE_POPUP_FIELDS);
            if (!(obj instanceof SimplePopupModel) || !(obj2 instanceof JSONObject)) {
                return;
            }
            a((SimplePopupModel) obj, parent, (JSONObject) obj2);
        }
    }

    private void a(SimplePopupModel simplePopupModel, IDMComponent iDMComponent, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc949826", new Object[]{this, simplePopupModel, iDMComponent, jSONObject});
            return;
        }
        SimplePopupModel.AsSelect asSelect = simplePopupModel.getAsSelect();
        if (asSelect == null) {
            return;
        }
        boolean equals = Boolean.TRUE.toString().equals(asSelect.getOptional());
        try {
            i = Integer.parseInt(asSelect.getMax());
        } catch (Exception unused) {
            i = 1;
        }
        List<String> selectedIds = asSelect.getSelectedIds();
        if (selectedIds == null) {
            selectedIds = new ArrayList<>();
        }
        String string = this.h.getFields().getString("id");
        int size = selectedIds.size();
        List<IDMComponent> children = iDMComponent.getChildren();
        if (children == null) {
            return;
        }
        if (selectedIds.contains(string)) {
            if (equals || (size > 0 && i > 1)) {
                selectedIds.remove(string);
                this.h.getFields().put("isChecked", (Object) Boolean.FALSE.toString());
                for (IDMComponent iDMComponent2 : children) {
                    if (iDMComponent2 != null && !iDMComponent2.equals(this.h)) {
                        iDMComponent2.getFields().put("disabled", (Object) "false");
                    }
                }
                a(jSONObject, simplePopupModel);
            }
            this.f.y().m();
            return;
        }
        if (i == 1) {
            selectedIds.clear();
            selectedIds.add(string);
            this.h.getFields().put("isChecked", (Object) "true");
            for (IDMComponent iDMComponent3 : children) {
                if (iDMComponent3 != null && !iDMComponent3.equals(this.h)) {
                    iDMComponent3.getFields().put("isChecked", (Object) "false");
                }
            }
        } else if (size >= i) {
            return;
        } else {
            selectedIds.add(string);
            this.h.getFields().put("isChecked", (Object) "true");
            if (selectedIds.size() == i) {
                for (IDMComponent iDMComponent4 : children) {
                    if (iDMComponent4 != null && !"true".equals(iDMComponent4.getFields().getString("isChecked"))) {
                        iDMComponent4.getFields().put("disabled", (Object) "true");
                    }
                }
            }
        }
        a(jSONObject, simplePopupModel);
        this.f.y().m();
    }

    private void a(JSONObject jSONObject, SimplePopupModel simplePopupModel) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a346066a", new Object[]{this, jSONObject, simplePopupModel});
            return;
        }
        try {
            jSONObject2 = (JSONObject) JSONObject.toJSON(simplePopupModel);
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        jSONObject.putAll(jSONObject2);
    }
}
