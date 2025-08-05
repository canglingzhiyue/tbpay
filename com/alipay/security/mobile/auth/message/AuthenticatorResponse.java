package com.alipay.security.mobile.auth.message;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class AuthenticatorResponse extends AuthenticatorMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_APP_NOT_FOUND = 107;
    public static final int RESULT_AUTHSERVICE_OK = 122;
    public static final int RESULT_BLUETOOTH_OFF = 123;
    public static final int RESULT_CANCELED = 102;
    public static final int RESULT_CHANGE_TO_PASSWORD = 121;
    public static final int RESULT_DEVICE_TYPE_UNKNOWN = 128;
    public static final int RESULT_FAILURE = 101;
    public static final int RESULT_FINGERPRINT_BUSY = 118;
    public static final int RESULT_HARDWARE_ERROR = 120;
    public static final int RESULT_INCORRECT_ORIGIN = 104;
    public static final int RESULT_INTERRUPT_BACKGROUND = 134;
    public static final int RESULT_NOT_COMPATIBLE = 106;
    public static final int RESULT_NOT_ENABLED = 115;
    public static final int RESULT_NOT_ENROLLED = 114;
    public static final int RESULT_NOT_INSTALLED = 105;
    public static final int RESULT_NOT_REGISTERED_FINGERPRINT = 112;
    public static final int RESULT_NOT_SUPPORT = 111;
    public static final int RESULT_NO_BLUETOOTH_MAC = 125;
    public static final int RESULT_NO_MATCH = 103;
    public static final int RESULT_PERMISSION_DENY = 403;
    public static final int RESULT_REGISTERFINGER_DELETE = 119;
    public static final int RESULT_ROOT = 124;
    public static final int RESULT_SENSOR_ERROR = 116;
    public static final int RESULT_SERVICE_OLD = 127;
    public static final int RESULT_SERVICE_START_ERROR = 126;
    public static final int RESULT_SUCCESS = 100;
    public static final int RESULT_SWITCH_OTHER_PRODUCT = 135;
    public static final int RESULT_SYSTEMBLOCK = 129;
    public static final int RESULT_TEE_INVOKE_RETURN_NULL = 405;
    public static final int RESULT_TIMEOUT = 113;
    public static final int RESULT_TRANSACTION_ERROR = 109;
    public static final int RESULT_TSI_ERROR = 110;
    public static final int RESULT_UPDATE = 108;
    public static final int RESULT_USER_NOTREGISTER = 117;
    public List<String> resgistedTokens;
    public int result;
    public String resultMessage;

    public List<String> getResgistedTokens() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4b2f6fda", new Object[]{this}) : this.resgistedTokens;
    }

    public void setResgistedTokens(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557f932", new Object[]{this, list});
        } else {
            this.resgistedTokens = list;
        }
    }

    public void setResultMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63be479", new Object[]{this, str});
        } else {
            this.resultMessage = str;
        }
    }

    public AuthenticatorResponse() {
        this.result = 100;
    }

    public AuthenticatorResponse(int i, int i2, String str) {
        super(i, i2, str);
        this.result = 100;
    }

    public AuthenticatorResponse(int i, int i2) {
        super(i, i2);
        this.result = 100;
    }

    public void setResult(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d62fb9d", new Object[]{this, new Integer(i)});
        } else {
            this.result = i;
        }
    }

    public int getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc18ae0d", new Object[]{this})).intValue() : this.result;
    }

    public String getResultMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9dbbe05", new Object[]{this}) : this.resultMessage;
    }
}
