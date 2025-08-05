package com.taobao.android.ultron.datamodel.imp.delta;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.jok;
import tb.jon;
import tb.kge;

/* loaded from: classes6.dex */
public class h extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "replace";
    public static final String TAG = "OperateReplace";

    static {
        kge.a(15480610);
    }

    @Override // com.taobao.android.ultron.datamodel.imp.delta.a
    public void a(com.taobao.android.ultron.datamodel.imp.b bVar, JSONObject jSONObject, List<jok> list) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4278c96f", new Object[]{this, bVar, jSONObject, list});
        } else if (jSONObject instanceof JSONObject) {
            String string = jSONObject.getString("target");
            List<IDMComponent> b = bVar.b();
            Map<String, DMComponent> u = bVar.u();
            DMComponent dMComponent = u.get(string);
            if (dMComponent == null) {
                UnifyLog.a(bVar.h(), TAG, "replaceOp target is null", new String[0]);
                return;
            }
            DMComponent a2 = com.taobao.android.ultron.datamodel.imp.a.a(bVar, bVar.o().getJSONObject(string), string);
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 == null) {
                return;
            }
            int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
            if (indexOf == -1) {
                UnifyLog.a(bVar.h(), TAG, "target component index is -1", new String[0]);
            }
            dMComponent2.getChildren().remove(indexOf);
            dMComponent2.getChildren().add(indexOf, a2);
            a2.setParent(dMComponent2);
            ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
            if (extMap2 != null && (extMap = a2.getExtMap()) != null) {
                for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                    extMap.put(entry.getKey(), entry.getValue());
                }
            }
            String b2 = i.b(a2, dMComponent2);
            String a3 = i.a(a2, dMComponent2);
            a2.setComponentCardGroupTag(b2);
            a2.setComponentPosition(a3);
            jon jonVar = new jon();
            jonVar.a(a2);
            jonVar.b(dMComponent);
            jonVar.a(indexOf);
            list.add(jonVar);
            int indexOf2 = b.indexOf(dMComponent);
            b.remove(indexOf2);
            b.add(indexOf2, a2);
            u.put(string, a2);
        }
    }
}
