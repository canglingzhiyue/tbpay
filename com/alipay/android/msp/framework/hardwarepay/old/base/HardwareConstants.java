package com.alipay.android.msp.framework.hardwarepay.old.base;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HardwareConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTH_PACKAGE = "com.alipay.security.mobile.authenticator";
    public static final String AUTH_PACKAGE_QCOM = "com.alipay.security.mobile.authentication.qcom";
    public static final String HARDWAREPAY_BL = "wear";
    public static final String HARDWAREPAY_FACE_ID = "faceId";
    public static final String HARDWAREPAY_FP = "fp";
    public static final int HARDWAREPAY_TYPE_BL = 2;
    public static final int HARDWAREPAY_TYPE_FP = 1;
    public static final int MSG_AUTHENTICATOR_REQUEST = 3;
    public static final int MSG_AUTHENTICATOR_RESPONSE = 9;
    public static final int MSG_BRACELET_BIZ_PROCESS = 500;
    public static final int MSG_BRACELET_CLOSE = 502;
    public static final int MSG_BRACELET_FORCE_CLOSE = 505;
    public static final int MSG_BRACELET_OPEN = 501;
    public static final int MSG_BRACELET_STATUS_QUERY = 504;
    public static final int MSG_CALLBACK = 503;
    public static final int MSG_CHECK_UPDATE = 17;
    public static final int MSG_DEREGISTER_REQUEST = 4;
    public static final int MSG_DEREGISTER_RESPONSE = 10;
    public static final int MSG_FINGERPRINT_AUTHENTICATOR_CLOSE_OK = 604;
    public static final int MSG_FINGERPRINT_AUTHENTICATOR_OPEN = 602;
    public static final int MSG_FINGERPRINT_AUTHENTICATOR_OPEN_OK = 603;
    public static final int MSG_FINGERPRINT_CLOSE = 605;
    public static final int MSG_FINGERPRINT_OPEN = 601;
    public static final int MSG_GET_DEVICE_ID = 12;
    public static final int MSG_INIT_REQUEST = 0;
    public static final int MSG_INIT_RESPONSE = 6;
    public static final int MSG_LOGIN_REQUEST = 1;
    public static final int MSG_LOGIN_RESPONSE = 7;
    public static final int MSG_MSP_EXIT = 506;
    public static final int MSG_OPEN_FINGERPRINT_MANAGER = 16;
    public static final int MSG_PREPARE_KEYPARE = 15;
    public static final int MSG_QUERYTOKENS_REQUEST = 5;
    public static final int MSG_QUERYTOKENS_RESPONSE = 11;
    public static final int MSG_QUERY_FINGERPRINTS = 13;
    public static final int MSG_QUERY_USERSTATUS = 14;
    public static final int MSG_REGISTER_REQUEST = 2;
    public static final int MSG_REGISTER_RESPONSE = 8;
    public static final int MSG_SCAN_DEVICE = 112;
    public static final int MSG_STOP_SCAN_DEVICE = 507;
    public static final int RESULT_APP_NOT_FOUND = 107;
    public static final int RESULT_AUTHSERVICE_OK = 122;
    public static final int RESULT_AUTH_NO_BLUETOOTH_MAC = 125;
    public static final int RESULT_BLUETOOTH_OFF = 123;
    public static final int RESULT_CANCELED = 102;
    public static final int RESULT_CHANGE_TO_PASSWORD = 121;
    public static final int RESULT_FAILURE = 101;
    public static final int RESULT_FINGERPRINT_BUSY = 118;
    public static final int RESULT_HARDWARE_ERROR = 120;
    public static final int RESULT_INCORRECT_ORIGIN = 104;
    public static final int RESULT_NOT_COMPATIBLE = 106;
    public static final int RESULT_NOT_ENABLED = 115;
    public static final int RESULT_NOT_ENROLLED = 114;
    public static final int RESULT_NOT_INSTALLED = 105;
    public static final int RESULT_NOT_REGISTERED_FINGERPRINT = 112;
    public static final int RESULT_NOT_SUPPORT = 111;
    public static final int RESULT_NO_MATCH = 103;
    public static final int RESULT_REGISTERFINGER_DELETE = 119;
    public static final int RESULT_ROOT = 124;
    public static final int RESULT_SEC_SERVICE_BLOCKED = 126;
    public static final int RESULT_SENSOR_ERROR = 116;
    public static final int RESULT_SERVICE_OLD = 127;
    public static final int RESULT_SUCCESS = 100;
    public static final int RESULT_SYSTEM_BLOCK = 129;
    public static final int RESULT_TIMEOUT = 113;
    public static final int RESULT_TRANSACTION_ERROR = 109;
    public static final int RESULT_TSI_ERROR = 110;
    public static final int RESULT_UPDATE = 108;
    public static final int RESULT_USER_NOTREGISTER = 117;
    public static final int VERSION_NEW = 2;
    public static final int VERSION_OLD = 1;

    public static SparseIntArray getReqRespCodeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("c1ee5b8", new Object[0]);
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(0, 6);
        sparseIntArray.put(2, 8);
        sparseIntArray.put(3, 9);
        sparseIntArray.put(4, 10);
        sparseIntArray.put(501, 501);
        sparseIntArray.put(502, 502);
        sparseIntArray.put(504, 504);
        sparseIntArray.put(505, 505);
        return sparseIntArray;
    }
}
