package com.taobao.android.behavir.solution;

import android.content.Context;
import java.util.Map;
import tb.dqi;

/* loaded from: classes4.dex */
public interface BHRSolution<O, R> {

    /* loaded from: classes4.dex */
    public enum Status {
        DEVICE_NOT_SUPPORT(1, "Device is not support."),
        BUSINESS_DEGRADE(2, "Business degrade."),
        CHECK_FATIGUE_FAILED(3, "Check fatigue failed."),
        SCROLL_INSTANCE_NOT_ENOUGH(4, "Scroll instance is not enough."),
        SCROLL_DURATION_NOT_ENOUGH(5, "Scroll duration is not enough."),
        CUSTOM_LOGIC_FAILED(6, "Custom logic check failed.");
        
        private final int code;
        private final String msg;

        Status(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }
    }

    void a(dqi dqiVar, R r);

    void a(dqi dqiVar, Runnable runnable);

    boolean a();

    Context b();

    boolean c();

    boolean f(dqi dqiVar);

    Map<String, String> h(dqi dqiVar);

    O i(dqi dqiVar);
}
