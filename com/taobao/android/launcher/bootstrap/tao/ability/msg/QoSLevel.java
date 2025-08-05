package com.taobao.android.launcher.bootstrap.tao.ability.msg;

import android.os.Handler;
import android.os.Message;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.jzi;
import tb.xjn;

/* loaded from: classes5.dex */
public class QoSLevel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH = 2;
    public static final int LOW = 0;
    public static final int NORMAL = 1;
    public static final int URGENT = 3;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Level {
    }

    public static int a(jzi jziVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba7e7ae5", new Object[]{jziVar, message})).intValue();
        }
        if (jziVar.f && (message.getCallback() instanceof xjn)) {
            return 2;
        }
        Handler target = message.getTarget();
        if (target == null || !target.getClass().getName().startsWith(ProcessUtils.ACTIVITY_THREAD)) {
            return 1;
        }
        return ((jziVar.e && message.what == 113) || message.what == 121 || message.what == 114 || message.what == 115) ? 3 : 1;
    }
}
