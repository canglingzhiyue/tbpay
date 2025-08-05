package com.taobao.android.detail.industry.scene.weex2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIComponentProtocol;
import com.taobao.android.detail.industry.tool.monitor.DIMonitorUtil;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.jvr;
import tb.jvw;
import tb.kge;
import tb.noa;

/* loaded from: classes4.dex */
public class d implements jvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DIComponentProtocol f10120a;

    static {
        kge.a(1117864227);
        kge.a(712408660);
    }

    public d(DIComponentProtocol dIComponentProtocol) {
        this.f10120a = dIComponentProtocol;
        emu.a("com.taobao.android.detail.industry.scene.weex2.DIWeexReportInfoListener");
    }

    @Override // tb.jvr
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            Object obj = map.get(jvw.KEY_PAGE_STAGES_AREA_COVERAGE);
            if (!(obj instanceof String)) {
                return;
            }
            try {
                if (Integer.parseInt((String) obj) >= com.taobao.android.detail.industry.tool.b.a()) {
                    return;
                }
                String str = this.f10120a.containType + "#" + DIMonitorUtil.BLANK_ERROR;
                HashMap hashMap = new HashMap();
                if (this.f10120a != null) {
                    hashMap.put("industryCode", this.f10120a.industryCode);
                    hashMap.put("subBizCode", this.f10120a.bizCode);
                    hashMap.put("componentKey", this.f10120a.componentKey);
                }
                DIMonitorUtil.a(hashMap.toString(), str, noa.VALUE_CLICK_AREA_BLANK);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
