package com.taobao.android.upp;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes.dex */
public interface e {
    public static final String KEY_FIND_SOLUTION_STEP = "find_solution";
    public static final String KEY_SOLUTION_FINISHED_STEP = "solution_finish";
    public static final String KEY_SOLUTION_GET_INPUT_STEP = "solution_get_input";
    public static final String KEY_SOLUTION_MODEL_STEP = "solution_model";
    public static final String KEY_SOLUTION_PREPARE_STEP = "solution_prepare";
    public static final String KEY_SOLUTION_RUNNABLE_STEP = "solution_runnable";
    public static final String KEY_UPP_SCHEME_PARAMS_ALGORITHM = "bizParamsForAlg";
    public static final String KEY_UPP_SCHEME_PARAMS_BIZ_DATA = "candidates";
    public static final String KEY_UPP_SCHEME_PARAMS_UPP_INFO = "upp";
    public static final String UPP_DOWNGRADE = "UPPInnerDowngradeCode";

    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes6.dex */
    public interface b {
    }

    /* loaded from: classes6.dex */
    public interface c {
    }

    void addBizFeatures(Map<String, Object> map, String str);

    boolean isDisableWithSchemeIdAndBizIdString(String str);

    boolean isUppEnabled();

    @Deprecated
    String registerResourceSpace(String str, Activity activity, String str2, JSONObject jSONObject, a aVar);

    @Deprecated
    String registerResourceSpace(String str, JSONObject jSONObject, a aVar);

    @Deprecated
    String registerResourceSpace(String str, Object obj, String str2, JSONObject jSONObject, a aVar);

    void registerUPPCallbackWithScene(String str, Object obj, a aVar);

    void sendUCPEventWithScene(String str, String str2, JSONObject jSONObject);

    void unregisterResourceSpace(String str);
}
