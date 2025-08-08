package com.taobao.tao.shop.common;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.shop.e;
import com.taobao.tao.shop.g;
import com.taobao.tao.shop.rule.util.c;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1667115587);
    }

    public boolean a(String str, Context context) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        if (com.taobao.tao.shop.rule.a.a() && !StringUtils.isEmpty(str)) {
            String config = OrangeConfig.getInstance().getConfig(com.taobao.tao.shop.rule.b.b, "startTimeMSec1", null);
            String config2 = OrangeConfig.getInstance().getConfig(com.taobao.tao.shop.rule.b.b, "endTimeMSec1", null);
            if (!StringUtils.isEmpty(config) && !StringUtils.isEmpty(config2)) {
                long j2 = -1;
                try {
                    j = Long.parseLong(config);
                    try {
                        j2 = Long.parseLong(config2);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    j = -1;
                }
                if (j >= 0 && j2 >= 0) {
                    long b = c.b();
                    if (j <= b && j2 >= b) {
                        return g.a().a(com.taobao.tao.shop.rule.b.b, str, e.b);
                    }
                }
            }
        }
        return false;
    }
}
