package com.taobao.tao.shop.rule;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class h implements com.taobao.orange.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String[] f21100a;

    static {
        kge.a(1697609383);
        kge.a(1679926066);
    }

    public h(String... strArr) {
        this.f21100a = strArr;
    }

    @Override // com.taobao.orange.f
    public void onConfigUpdate(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str) && (strArr = this.f21100a) != null) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    f.a().b(str);
                }
            }
        }
    }
}
