package com.taobao.android.editionswitcher;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import tb.ghj;
import tb.gho;
import tb.ghp;
import tb.kge;

/* loaded from: classes5.dex */
public class TBEditionSwitcherPopBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_VALUE = "standard_version";
    private static final String PAGE_HOME = "Page_Home";
    public static final String SWITCHER_VERSION = "switcherVersion";
    public static final String SWITCH_TO_VERSION = "switchToVersion";
    private static final String TAG = "TBEditionSwitcherPopBridge";

    static {
        kge.a(-697687476);
    }

    public static /* synthetic */ Object ipc$super(TBEditionSwitcherPopBridge tBEditionSwitcherPopBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.logd("Edition_Switcher", "TBEditionSwitcherPopBridge; bridge: action" + str + "params:" + str2);
        if (SWITCH_TO_VERSION.equals(str)) {
            return switchToVersion(str2, wVCallBackContext);
        }
        r rVar = new r();
        rVar.a("errorMsg", "no matched method");
        wVCallBackContext.error(rVar);
        return false;
    }

    private boolean switchToVersion(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf6251b", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = null;
        if (!StringUtils.isEmpty(str)) {
            try {
                str2 = JSONObject.parseObject(str).getString("switcherVersion");
            } catch (Exception unused) {
            }
        }
        if (StringUtils.isEmpty(str2)) {
            TLog.loge("Page_Home", TAG, "switchToVersionValue is null");
            return true;
        } else if (k.a("switcherVersion", "standard_version").equals(str2)) {
            TLog.loge("Page_Home", TAG, "Pop Bridge change version stoped, reasion: Same Version");
            return true;
        } else {
            com.taobao.android.editionswitcher.core.b.a().a(ghj.a().a("popBridge").a(ghp.a().c(str2).a("switcherVersion", str2)), new gho(com.taobao.android.editionswitcher.core.b.TRIGGER_REQUEST));
            commitEvent("Page_Home", 2101, "button-change", "action=" + str2);
            TLog.loge("Page_Home", TAG, "Pop Bridge change version = " + str2);
            wVCallBackContext.success();
            return true;
        }
    }

    public static void commitEvent(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb96d94", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, obj, null, null, strArr);
        } catch (Exception unused) {
        }
    }
}
