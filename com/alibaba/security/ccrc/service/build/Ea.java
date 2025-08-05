package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.track.model.TLogHttpReq;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Ea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC1223k f3236a;

    private synchronized InterfaceC1223k a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC1223k) ipChange.ipc$dispatch("269002f1", new Object[]{this, context});
        }
        if (this.f3236a == null) {
            this.f3236a = new C1220j(context);
        }
        return this.f3236a;
    }

    public void a(List<TrackLog> list, String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440f245", new Object[]{this, list, str, context});
        } else if (list != null && !list.isEmpty()) {
            TLogHttpReq tLogHttpReq = new TLogHttpReq();
            for (TrackLog trackLog : list) {
                String str2 = trackLog.ccrcCode;
                Map<String, Object> map = trackLog.ext;
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("source", str);
                trackLog.ext = map;
                if (!tLogHttpReq.ccrcCodes.contains(str2)) {
                    tLogHttpReq.ccrcCodes.add(str2);
                }
            }
            tLogHttpReq.logs = JsonUtils.toJSONString(list);
            a(context).a(tLogHttpReq, null);
        }
    }
}
