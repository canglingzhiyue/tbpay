package com.alibaba.android.icart.core.event;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ao extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(215797233);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (bmzVar == null) {
        } else {
            try {
                IDMComponent c = bmzVar.c();
                com.taobao.android.ultron.common.model.b b = b();
                if (c != null && b != null && (fields = b.getFields()) != null) {
                    String string = fields.getString("arg1");
                    ArrayMap<String, Object> extMap = c.getExtMap();
                    String str = "_pre_" + string;
                    if (extMap == null) {
                        return;
                    }
                    Object obj = extMap.get(str);
                    if (obj != null && (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue())) {
                        return;
                    }
                    this.f25791a.F().a(this.f25791a.F().a().a("cartUserTrack").a(bmzVar.e()).a(bmzVar.c()).c(bmzVar.f()));
                    extMap.put(str, true);
                }
            } catch (Throwable th) {
                UnifyLog.a("WidgetExposureSubscriber", "WidgetExposureSubscriber", "WidgetExposureSubscriber deal event exception.", th.getMessage());
            }
        }
    }
}
