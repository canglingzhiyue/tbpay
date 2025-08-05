package com.alipay.mobile.common.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class RpcException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_SOURCE_CLIENT = 1;
    public static final int ERROR_SOURCE_SERVER = 2;
    public static final int INIT_ALERT = -100;
    public static final int NO_ALERT = 0;
    public static final int TOAST_ALERT = 1;
    public int alert;
    public int errorSource;
    public boolean isBgRpc;
    public int mCode;
    public String mControl;
    public boolean mIsControlOwn;
    public String mMsg;
    public String mOperationType;

    /* loaded from: classes3.dex */
    public interface ErrorCode {
        public static final int BACKGROUND_FETCH_FUSE_RPC_ERROR = 25;
        public static final int BIZ_INTERCEPTOR_HANDLE_ERROR = 21;
        public static final int CLIENT_DESERIALIZER_ERROR = 10;
        public static final int CLIENT_HANDLE_ERROR = 9;
        public static final int CLIENT_INTERUPTED_ERROR = 13;
        public static final int CLIENT_LOGIN_FAIL_ERROR = 11;
        public static final int CLIENT_NETWORK_AUTH_ERROR = 15;
        public static final int CLIENT_NETWORK_CACHE_ERROR = 14;
        public static final int CLIENT_NETWORK_CONNECTION_ERROR = 4;
        public static final int CLIENT_NETWORK_DNS_ERROR = 16;
        public static final int CLIENT_NETWORK_ERROR = 7;
        public static final int CLIENT_NETWORK_SCHEDULE_ERROR = 8;
        public static final int CLIENT_NETWORK_SERVER_ERROR = 6;
        public static final int CLIENT_NETWORK_SOCKET_ERROR = 5;
        public static final int CLIENT_NETWORK_SSL_ERROR = 3;
        public static final int CLIENT_NETWORK_UNAVAILABLE_ERROR = 2;
        public static final int CLIENT_NOTIN_WHITELIST = 17;
        public static final int CLIENT_REQ_OVERSIZE_ERROR = 22;
        public static final int CLIENT_RES_OVERSIZE_ERROR = 23;
        public static final int CLIENT_SERIALIZER_ERROR = 20;
        public static final int CLIENT_TRANSPORT_UNAVAILABAL_ERROR = 1;
        public static final int CLIENT_UNKNOWN_ERROR = 0;
        public static final int CLIENT_USER_CHANGE_ERROR = 12;
        public static final int LOGIN_REFRESH_ERROR = 24;
        public static final int NETWORK_AUTH_WIFI = 19;
        public static final int NETWORK_TRAFIC_BEYOND_LIMIT = 18;
        public static final int OK = 1000;
        public static final int PRC_APIVERSION_EMPTY = 7010;
        public static final int PRC_DID_EMPTY = 7006;
        public static final int PRC_IMEI_EMPTY = 7008;
        public static final int PRC_IMSI_EMPTY = 7009;
        public static final int PRC_NO_AUTHORIZED = 7011;
        public static final int PRC_NO_PUBLISHED = 7012;
        public static final int PRC_OPERATIONTYPE_EMPTY = 7004;
        public static final int PRC_PRODCUTID_EMPTY = 7005;
        public static final int PRC_REQUESTTIME_EMPTY = 7007;
        public static final int PRC_SECRET_EMPTY = 7013;
        public static final int PRC_SID_EMPTY = 7016;
        public static final int PRC_SID_INVALID = 7017;
        public static final int PRC_SIGN_EMPTY = 7014;
        public static final int PRC_SIGN_INVALID = 7015;
        public static final int PRC_TOKEN_ALIPAYUSER_EMPTY = 7019;
        public static final int PRC_TOKEN_INVALID = 7018;
        public static final int PUBLIC_KEY_NOT_FOUND = 7000;
        public static final int RESPONSE_DATA_NOT_MODIFIED = 8001;
        public static final int SERVER_APP_NO_PERMISSION_TO_ACCESS = 1005;
        public static final int SERVER_BIZEXCEPTION = 6666;
        public static final int SERVER_CREATEPROXYERROR = 4003;
        public static final int SERVER_CRYPT_ERROR = 3003;
        public static final int SERVER_ILLEGALACCESS = 6003;
        public static final int SERVER_ILLEGALARGUMENT = 6005;
        public static final int SERVER_INVOKEEXCEEDLIMIT = 1002;
        public static final int SERVER_JSONPARSEREXCEPTION = 6004;
        public static final int SERVER_METHODNOTFOUND = 6001;
        public static final int SERVER_OPERATIONTYPEMISSED = 3000;
        public static final int SERVER_PARAMMISSING = 6002;
        public static final int SERVER_PERMISSIONDENY = 1001;
        public static final int SERVER_REMOTEACCESSEXCEPTION = 4002;
        public static final int SERVER_REQUESTDATAMISSED = 3001;
        public static final int SERVER_REQUESTTIMEOUT = 4001;
        public static final int SERVER_SERVICENOTFOUND = 6000;
        public static final int SERVER_SESSIONSTATUS = 2000;
        public static final int SERVER_UNKNOWERROR = 5000;
        public static final int SERVER_VALUEINVALID = 3002;
        public static final int SIGNA_PARAM_MISSING = 7001;
        public static final int SIGN_TIME_STAMP_ERROR = 7003;
        public static final int SIGN_VERIFY_FAILED = 7002;
    }

    public int getAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8307120", new Object[]{this})).intValue() : this.alert;
    }

    public void setAlert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c027582", new Object[]{this, new Integer(i)});
        } else {
            this.alert = i;
        }
    }

    public boolean isToast() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55d3f128", new Object[]{this})).booleanValue() : this.alert == 1;
    }

    public boolean isDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eca9a9d", new Object[]{this})).booleanValue();
        }
        int i = this.alert;
        return (i == 0 || i == 1) ? false : true;
    }

    public boolean isSilent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("827be32a", new Object[]{this})).booleanValue() : this.alert == 0;
    }

    public boolean isBgRpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a6f29e1", new Object[]{this})).booleanValue() : this.isBgRpc;
    }

    public void setBgRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e70cdcf", new Object[]{this, new Boolean(z)});
        } else {
            this.isBgRpc = z;
        }
    }

    public RpcException(Integer num, String str) {
        super(format(num, str));
        this.mIsControlOwn = true;
        this.errorSource = -1;
        this.isBgRpc = false;
        this.alert = -100;
        this.mCode = num.intValue();
        this.mMsg = str;
        setErrorSource();
    }

    public RpcException(Integer num, Throwable th) {
        super(th);
        this.mIsControlOwn = true;
        this.errorSource = -1;
        this.isBgRpc = false;
        this.alert = -100;
        this.mCode = num.intValue();
        setErrorSource();
    }

    public RpcException(Integer num, String str, Throwable th) {
        super(th);
        this.mIsControlOwn = true;
        this.errorSource = -1;
        this.isBgRpc = false;
        this.alert = -100;
        this.mCode = num.intValue();
        this.mMsg = str;
        setErrorSource();
    }

    public RpcException(String str) {
        super(str);
        this.mIsControlOwn = true;
        this.errorSource = -1;
        this.isBgRpc = false;
        this.alert = -100;
        this.mCode = 0;
        this.mMsg = str;
    }

    public RpcException(Exception exc) {
        super(exc == null ? null : exc.getMessage());
        this.mIsControlOwn = true;
        this.errorSource = -1;
        this.isBgRpc = false;
        this.alert = -100;
        this.mCode = 0;
        this.mMsg = (exc == null || exc.getMessage() == null) ? "" : exc.getMessage();
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this}) : this.mOperationType;
    }

    public void setOperationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97479150", new Object[]{this, str});
        } else {
            this.mOperationType = str;
        }
    }

    public String getControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d4049c32", new Object[]{this}) : this.mControl;
    }

    public void setControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39272ec", new Object[]{this, str});
        } else {
            this.mControl = str;
        }
    }

    public boolean isControlOwn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39d668be", new Object[]{this})).booleanValue() : this.mIsControlOwn;
    }

    public void setControlOwn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6a5b22", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsControlOwn = z;
        }
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.mCode;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.mMsg;
    }

    public int getErrorSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb6dfd07", new Object[]{this})).intValue() : this.errorSource;
    }

    public static String format(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d092f0bd", new Object[]{num, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
        if (num != null) {
            sb.append(riy.ARRAY_START_STR);
            sb.append(num);
            sb.append(riy.ARRAY_END_STR);
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean isClientError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b94c47e", new Object[]{this})).booleanValue() : this.errorSource == 1;
    }

    public boolean isServerError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d04f006", new Object[]{this})).booleanValue() : this.errorSource == 2;
    }

    public void setErrorSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164ead7b", new Object[]{this, new Integer(i)});
        } else {
            this.errorSource = i;
        }
    }

    public boolean isNetworkUnavailableError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f2f4fe7", new Object[]{this})).booleanValue() : this.mCode == 2;
    }

    public boolean maybeNetworkUnavailableError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cedd9e9", new Object[]{this})).booleanValue();
        }
        int i = this.mCode;
        return i > 0 && i < 1000;
    }

    public void setErrorSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32449688", new Object[]{this});
            return;
        }
        int i = this.mCode;
        if (i < 1000) {
            this.errorSource = 1;
        } else if (i > 1000) {
            this.errorSource = 2;
        } else {
            this.errorSource = -1;
        }
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.mMsg = str;
        }
    }
}
