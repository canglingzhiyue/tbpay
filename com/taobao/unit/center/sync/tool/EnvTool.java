package com.taobao.unit.center.sync.tool;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000426\u0010\t\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/unit/center/sync/tool/EnvTool;", "", "()V", EnvTool.KEY_LAST_ENV1, "", EnvTool.KEY_LAST_ENV2, "isSwitchEnv", "", "key", "actFunc", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "curEnv", "lastEnv", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class EnvTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final EnvTool INSTANCE;
    public static final String KEY_LAST_ENV1 = "KEY_LAST_ENV1";
    public static final String KEY_LAST_ENV2 = "KEY_LAST_ENV2";

    static {
        kge.a(2061722400);
        INSTANCE = new EnvTool();
    }

    private EnvTool() {
    }

    public final boolean isSwitchEnv(String key, ruw<? super Integer, ? super Integer, t> actFunc) {
        int intSharedPreference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4ba2bc0", new Object[]{this, key, actFunc})).booleanValue();
        }
        q.c(key, "key");
        q.c(actFunc, "actFunc");
        try {
            if (ApplicationUtil.isDebug() && ApplicationUtil.getEnvType() != (intSharedPreference = SharedPreferencesUtil.getIntSharedPreference(key, 0))) {
                SharedPreferencesUtil.addIntSharedPreference(key, ApplicationUtil.getEnvType());
                actFunc.mo2423invoke(Integer.valueOf(ApplicationUtil.getEnvType()), Integer.valueOf(intSharedPreference));
                return true;
            }
        } catch (Throwable th) {
            TLog.loge(SyncConstant.TAG, Log.getStackTraceString(th));
        }
        return false;
    }
}
