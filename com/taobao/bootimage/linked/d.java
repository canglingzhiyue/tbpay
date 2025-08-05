package com.taobao.bootimage.linked;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.kej;
import tb.kem;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long f16706a;
    private final JSONObject b;

    static {
        kge.a(-184003622);
        f16706a = TimeUnit.HOURS.toSeconds(1L);
    }

    public d(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public Long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("c9b62fad", new Object[]{this});
        }
        try {
            long longValue = this.b.getLongValue("globalPeriodSeconds");
            if (longValue > 0) {
                return Long.valueOf(longValue);
            }
            return null;
        } catch (Throwable th) {
            kej.a("LinkedSplashDataExt", "getGlobalPeriodSeconds error", th);
            return null;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        try {
            if (this.b != null) {
                return this.b.getIntValue(kem.BACK_GROUND_WAIT_SECONDS);
            }
            return 0;
        } catch (Throwable th) {
            kej.a("LinkedSplashDataExt", "getBackgroundWaitSeconds error", th);
            return 0;
        }
    }
}
