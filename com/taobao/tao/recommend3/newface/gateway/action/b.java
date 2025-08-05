package com.taobao.tao.recommend3.newface.gateway.action;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.gkl;
import tb.kge;
import tb.ope;

/* loaded from: classes.dex */
public class b implements gkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20930a;

    static {
        kge.a(-94375125);
        kge.a(41894641);
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i < 2 || i > 50) {
            i = i2;
        }
        if (i <= i3) {
            return i3 - i;
        }
        return 0;
    }

    public b(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f20930a = opeVar;
    }

    @Override // tb.gkl
    public Object a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8e00aaf9", new Object[]{this, list});
        }
        if (list == null || list.size() < 2) {
            return -1;
        }
        try {
            String[] strArr = (String[]) list.get(0);
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                int intValue = Integer.valueOf(list.get(1).toString()).intValue();
                int requestInAdvanceNum = this.f20930a.b(str).getRequestInAdvanceNum();
                if (requestInAdvanceNum < 2 || requestInAdvanceNum > 50) {
                    requestInAdvanceNum = intValue;
                }
                List<SectionModel> g = this.f20930a.g(str);
                if (g != null && !g.isEmpty()) {
                    return Integer.valueOf(a(requestInAdvanceNum, intValue, g.size()));
                }
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.a("gateway2.lastIndex", th, new String[0]);
            return -1;
        }
    }
}
