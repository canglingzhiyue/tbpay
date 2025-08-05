package com.taobao.android.fluid.business.intelligence;

import com.taobao.android.fluid.core.FluidService;
import tb.jcq;
import tb.jcs;

/* loaded from: classes5.dex */
public interface IIntelligenceService extends FluidService {
    public static final int ERROR_CODE_DYNAMIC_REORDER_HANDLE_PARSE_MODEL_RESULT_ERROR = 1004;
    public static final int ERROR_CODE_DYNAMIC_REORDER_HANDLE_REORDER_ERROR = 1002;
    public static final int ERROR_CODE_DYNAMIC_REORDER_SEND_MODEL_ERROR = 1001;
    public static final int ERROR_CODE_FER_COMMON_TRACK_PARAMS_ERROR = 1011;
    public static final int ERROR_CODE_SERVICES_GESTURE_COLLECT_ERROR = 1006;
    public static final int ERROR_CODE_SERVICES_GET_UNEXPOSER_LIST_ERROR = 1009;
    public static final int ERROR_CODE_SERVICES_INIT_ERROR = 1005;
    public static final int ERROR_CODE_SERVICES_RECOMD_EXPOSURE_ERROR = 1008;
    public static final int ERROR_CODE_SERVICES_SEND_REODER_DATA_ERROR = 1007;
    public static final String KEY_ABTEST_UI_RELAYOUT = "mobileAI.layoutByGesture";

    Object getBehaviorInput(boolean z);

    jcq getBehaviorManager();

    jcs getConfig();
}
