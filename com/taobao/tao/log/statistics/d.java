package com.taobao.tao.log.statistics;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DP2_TLOG_ERROR_EVENT = "dp2_tlog_error_event";
    public static final String PARAM_ERR_CODE = "errCode";
    public static final String PARAM_ERR_MSG = "errMsg";
    public static final String PARAM_IS_DEBUG = "isDebug";
    public static final String PARAM_IS_INNER = "isInner";
    public static final String PARAM_IS_RETRY = "isRetry";
    public static final String PARAM_IS_SLICE = "isSlice";
    public static final String PARAM_OP_CODE = "opCode";
    public static final String PARAM_SESSION_ID = "sessionID";
    public static final String PARAM_TASK_ID = "taskID";
    public static final String PARAM_TLOG_ENGINE = "tlogEngine";
    public static final String PARAM_UPLOAD_BIZ_CODE = "bizCode";
    public static final String PARAM_UPLOAD_BIZ_TYPE = "bizType";
    public static final String PARAM_UPLOAD_FILE_COUNT = "fileCount";
    public static final String PARAM_UPLOAD_FILE_TYPE = "fileType";
    public static final String PARAM_UPLOAD_ID = "uploadID";
    public static final String PARAM_UPLOAD_REASON = "reason";
    public static final String PARAM_UPLOAD_STAGE = "stage";
    public static final String PARAM_UPLOAD_SUCCESS_COUNT = "successCount";
    public static final String PARAM_VERSION = "version";
    public static final String TLOG_ERROR_THREADPOOL_REJECTED = "threadpool_rejected";
    public static final String UT_TLOG_ARUP_CANCEL = "ut_tlog_arup_cancel";
    public static final String UT_TLOG_ARUP_ERR = "ut_tlog_arup_err";
    public static final String UT_TLOG_ARUP_REQUEST = "ut_tlog_arup_request";
    public static final String UT_TLOG_ARUP_START = "ut_tlog_arup_start";
    public static final String UT_TLOG_ARUP_SUCCESS = "ut_tlog_arup_success";
    public static final String UT_TLOG_CMD_EXECUTE = "ut_tlog_cmd_execute";
    public static final String UT_TLOG_CMD_EXECUTE_ERR = "ut_tlog_cmd_execute_err";
    public static final String UT_TLOG_CMD_PARSE_ERR = "ut_tlog_cmd_parse_err";
    public static final String UT_TLOG_CMD_PULL = "ut_tlog_cmd_pull";
    public static final String UT_TLOG_CMD_RECEIVE = "ut_tlog_cmd_receive";
    public static final String UT_TLOG_CONFIG_ERR = "ut_tlog_config_err";
    public static final String UT_TLOG_CONFIG_RECEIVE = "ut_tlog_config_rev";
    public static final String UT_TLOG_CONFIG_REPLY = "ut_tlog_config_reply";
    public static final String UT_TLOG_FILE_SIZE = "ut_tlog_file_size";
    public static final String UT_TLOG_FILE_UPLOAD_DONE = "ut_tlog_file_upload_done";
    public static final String UT_TLOG_FILE_UPLOAD_ERR = "ut_tlog_file_upload_err";
    public static final String UT_TLOG_FILE_UPLOAD_EXECUTE = "ut_tlog_file_upload_execute";
    public static final String UT_TLOG_FILE_UPLOAD_ONE = "ut_tlog_file_upload_one";
    public static final String UT_TLOG_FILE_UPLOAD_ONE_ERROR = "ut_tlog_file_upload_one_err";
    public static final String UT_TLOG_FILE_UPLOAD_ONE_RETRY = "ut_tlog_file_upload_one_retry";
    public static final String UT_TLOG_FILE_UPLOAD_ONE_SUCCESS = "ut_tlog_file_upload_one_success";
    public static final String UT_TLOG_FILE_UPLOAD_REPLY_ERROR = "ut_tlog_file_upload_reply_err";
    public static final String UT_TLOG_FILE_UPLOAD_REPLY_SUCCESS = "ut_tlog_file_upload_reply_success";
    public static final String UT_TLOG_FILE_UPLOAD_REQ = "ut_tlog_file_upload_req";
    public static final String UT_TLOG_FILE_UPLOAD_RETRY = "ut_tlog_file_upload_retry";
    public static final String UT_TLOG_FILE_UPLOAD_TOKEN_REQ = "ut_tlog_file_upload_token_req";
    public static final String UT_TLOG_FILE_UPLOAD_TOKEN_RES = "ut_tlog_file_upload_token_res";
    public static final String UT_TLOG_INIT = "ut_tlog_init";
    public static final String UT_TLOG_INIT_ERR = "ut_tlog_init_err";
    public static final String UT_TLOG_STARTUP_INFO = "ut_tlog_startup_info";

    static {
        kge.a(-1794977478);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str.startsWith("dp2_");
    }
}
