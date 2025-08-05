package com.taobao.android.ultron.datamodel.imp.delta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.jok;
import tb.jol;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "delete";
    public static final String TAG = "OperateDelete";

    static {
        kge.a(-677528707);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
        } else if (!(jSONObject instanceof JSONObject)) {
        } else {
            a(bVar, jSONObject.getString("target"), list);
        }
    }

    private void a(com.taobao.android.ultron.datamodel.imp.b bVar, String str, List<jok> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c231d6ed", new Object[]{this, bVar, str, list});
            return;
        }
        List<IDMComponent> b = bVar.b();
        Map<String, DMComponent> u = bVar.u();
        DMComponent dMComponent = u.get(str);
        if (dMComponent == null) {
            UnifyLog.a(bVar.h(), TAG, "delete target is null", new String[0]);
            return;
        }
        DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
        if (dMComponent2 == null) {
            UnifyLog.a(bVar.h(), TAG, "delete target's parent is null", new String[0]);
            return;
        }
        int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
        if (b.remove(dMComponent)) {
            jol jolVar = new jol();
            jolVar.a(dMComponent);
            jolVar.a(indexOf);
            list.add(jolVar);
        }
        u.remove(str);
        dMComponent2.getChildren().remove(indexOf);
        dMComponent.setParent(null);
        bVar.c(str, dMComponent2.getKey());
        if (dMComponent.getChildren() == null) {
            return;
        }
        for (int size = dMComponent.getChildren().size() - 1; size >= 0; size--) {
            a(bVar, str, list);
        }
    }
}
