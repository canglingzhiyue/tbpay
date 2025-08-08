package com.o2o.ad.click.cpa;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f8101a = new HashMap();
    private String b;
    private String c;

    static {
        kge.a(-571276904);
    }

    public b(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a538fae", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.f8101a.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f3cb1d4d", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.f8101a.put("namespace", str);
        }
        return this;
    }

    public String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : new a(this.b, this.c, this.f8101a).a(map);
    }
}
