package com.taobao.android.detail2.core.framework.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.fky;
import tb.kge;

/* loaded from: classes5.dex */
public class NewDetailWVLocalWeexBranch extends NewDetailBaseWVPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CLEAR_BRANCH = "clearBranch";
    private static final String ACTION_SAVE_BRANCH = "saveBranch";
    private static final String ERROR_CODE_CONTAINER_NAME_EMPTY = "10006";
    private static final String ERROR_CODE_VERSION_EMPTY = "10005";
    private static final String ERROR_MSG_CONTAINER_NAME_EMPTY = "containerName为空";
    private static final String ERROR_MSG_VERSION_EMPTY = "wlm为空";
    public static final String NAME = "NewDetailLocalWeexBranch";

    static {
        kge.a(2024392069);
    }

    @Override // com.taobao.android.detail2.core.framework.base.windvane.NewDetailBaseWVPlugin
    public boolean onExecute(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c452fe34", new Object[]{this, str, jSONObject, wVCallBackContext, str2})).booleanValue();
        }
        if (ACTION_SAVE_BRANCH.equals(str)) {
            String string = jSONObject.getString("wlm");
            String string2 = jSONObject.getString("containerName");
            if (TextUtils.isEmpty(string)) {
                handleCallbackFail("10005", ERROR_MSG_VERSION_EMPTY, wVCallBackContext);
                return false;
            } else if (TextUtils.isEmpty(string2)) {
                handleCallbackFail("10006", ERROR_MSG_CONTAINER_NAME_EMPTY, wVCallBackContext);
                return false;
            } else {
                fky.d(Global.getApplication(), string2, string);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new r("HY_SUCCESS"));
                }
            }
        } else if (ACTION_CLEAR_BRANCH.equals(str)) {
            String string3 = jSONObject.getString("containerName");
            if (TextUtils.isEmpty(string3)) {
                handleCallbackFail("10006", ERROR_MSG_CONTAINER_NAME_EMPTY, wVCallBackContext);
                return false;
            }
            fky.a(Global.getApplication(), "all".equals(string3), string3);
            if (wVCallBackContext != null) {
                wVCallBackContext.success(new r("HY_SUCCESS"));
            }
        }
        return true;
    }
}
