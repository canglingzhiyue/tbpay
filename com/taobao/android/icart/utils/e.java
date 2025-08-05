package com.taobao.android.icart.utils;

import android.taobao.windvane.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import tb.bed;
import tb.jpt;
import tb.kge;

/* loaded from: classes5.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-956724798);
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        return i < 0 ? "预热任务执行时间比进入购物车时间晚" : i == 0 ? "预热任务还未开始执行" : j < 500 ? "500ms内" : j < 1000 ? "大于500ms，小于1s" : j < 3000 ? "大于1s，小于3s" : j < 30000 ? "大于3s，小于30s" : j < 60000 ? "大于30s，小于1分钟" : j < b.DEFAULT_SMALL_MAX_AGE ? "大于1分钟，小于半小时" : j < 3600000 ? "大于半小时，小于1小时" : "大于或等于1小时";
    }

    public static void a(long j, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262f8adc", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
            return;
        }
        bed.a b = bed.a.b("cartPrefetch");
        long prefetchStartTime = CartVEngineFactory.getPrefetchStartTime();
        long j2 = 0;
        if (prefetchStartTime > 0) {
            j2 = j - prefetchStartTime;
        }
        b.c("c1", "冷起到购物车间隔时长：" + a(j2));
        jpt a2 = b.a(0.001f).a(z2);
        if (z2) {
            str = "预创建成功 cache=" + z;
        } else {
            str = "预创建失败";
        }
        a2.c(str).a("intervalTime=" + j2);
        bed.a(b);
    }
}
