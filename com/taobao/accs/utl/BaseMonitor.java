package com.taobao.accs.utl;

import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BaseMonitor extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALARM_CONNECT_RESULT = "conn_result";
    public static final String ALARM_LISTENER_TO_MAIN_FAIL = "listener_to_main_fail";
    public static final String ALARM_LISTENER_TO_MAIN_RESULT = "listener_to_main_result";
    public static final String ALARM_MAIN_BINDER_IPC_FAIL = "main_binder_ipc_fail";
    public static final String ALARM_MAIN_BINDER_IPC_RES = "main_binder_ipc_res";
    public static final String ALARM_MSG_ORDER = "msg_order";
    public static final String ALARM_MSG_ROUTING_RATE = "ele_routing_rate";
    public static final String ALARM_ONLY_BINDER_DIED = "only_binder_died";
    public static final String ALARM_ORANGE_SWITCH = "orange_switch";
    public static final String ALARM_POINT_AUTH = "auth";
    public static final String ALARM_POINT_BIND = "bind_v1";
    public static final String ALARM_POINT_CONNECT = "connect";
    public static final String ALARM_POINT_REQUEST = "Request_Success_Rate";
    public static final String ALARM_POINT_REQ_ERROR = "send_fail";
    public static final String ALARM_PUBLISH_FAIL = "publish_fail";
    public static final String ALARM_REMOVE_ALIAS = "agoo_rm_alias";
    public static final String ALARM_SET_ALIAS = "agoo_set_alias";
    public static final String BACKGROUND_RECV_MSG = "bg_recv_msgv1";
    public static final String COUNT_ACK = "ack";
    public static final String COUNT_AGOO_ACK = "agoo_ack";
    public static final String COUNT_AGOO_ARRIVE = "agoo_arrive";
    public static final String COUNT_AGOO_ARRIVE_ID = "agoo_arrive_id";
    public static final String COUNT_AGOO_ARRIVE_REAL_ID = "agoo_arrive_real_id";
    public static final String COUNT_AGOO_CLICK = "agoo_click";
    public static final String COUNT_AGOO_FAIL_ACK = "agoo_fail_ack";
    public static final String COUNT_AGOO_REPORT_ID = "agoo_report_id";
    public static final String COUNT_AGOO_SUCCESS_ACK = "agoo_success_ack";
    public static final String COUNT_AGOO_TOTAL_ARRIVE = "agoo_total_arrive";
    public static final String COUNT_APPKEY_CHANGED = "appkey_change_cnt";
    public static final String COUNT_BUSINESS_ACK_FAIL = "bizAckFail";
    public static final String COUNT_BUSINESS_ACK_SUCC = "bizAckSucc";
    public static final String COUNT_COLD_LAUNCH_TIME = "cold_launch_time";
    public static final String COUNT_DELTA_TIME = "delta_time";
    public static final String COUNT_DOWN_ACK = "accs_down_ack";
    public static final String COUNT_ERROR = "error";
    public static final String COUNT_EXCEPTIONS = "accs_exceptions";
    public static final String COUNT_EXCEPTIONS_RECEIVER = "expt_receiver";
    public static final String COUNT_FAKE_CONN = "accs_fake_connection";
    public static final String COUNT_FORE_BG = "fore_bg_cnt";
    public static final String COUNT_FULL_VERIFY = "accs_full_verify";
    public static final String COUNT_INVOKE_MAIN = "invoke_main";
    public static final String COUNT_MSG_LOST = "msg_lost";
    public static final String COUNT_PING_INTERVAL = "ping_interval";
    public static final String COUNT_POINT_DNS = "dns";
    public static final String COUNT_POINT_REGID_DISABLE = "regId_disable";
    public static final String COUNT_POINT_REGID_EXCEPTION = "regId_exception";
    public static final String COUNT_POINT_REGID_NATIVE = "regId_native";
    public static final String COUNT_POINT_REGID_ONLINE = "regId_online";
    public static final String COUNT_POINT_RESEND = "resend";
    public static final String COUNT_POINT_TO_BUSS = "to_buss";
    public static final String COUNT_POINT_TO_BUSS_SUCCESS = "to_buss_success";
    public static final String COUNT_RETRY_MULTI = "retry_multi";
    public static final String COUNT_SERVICE_ALIVE = "service_alive";
    public static final String COUNT_SERVICE_TYPE = "service_type";
    public static final String COUNT_SESSION_ERROR = "session_error";
    public static final String COUNT_START_PROC_SERVICE = "start_proc_service";
    public static final String COUNT_TRY_MOCK_LISTENER = "try_mock_listener";
    public static final String COUNT_VERIFY = "accs_verify";
    public static final String MODULE = "accs";
    private boolean isCommitted = false;

    static {
        kge.a(90999421);
    }

    public String checkString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b0704d6", new Object[]{this, str}) : str == null ? "none" : str;
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        if (this.isCommitted) {
            return false;
        }
        this.isCommitted = true;
        return true;
    }
}
