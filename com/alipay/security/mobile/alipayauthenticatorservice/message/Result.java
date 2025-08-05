package com.alipay.security.mobile.alipayauthenticatorservice.message;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class Result {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALIPAY_BASE64_ENCODE_ERROR = 272;
    public static final int ALIPAY_GENERATE_REG_NODE_FAILED = 278;
    public static final int ALIPAY_GENERATE_REG_RESPONSE_NODE_FAILED = 280;
    public static final int ALIPAY_GENERATE_RSA_KEY_FAILED = 276;
    public static final int ALIPAY_GENERATE_UNREG_NODE_FAILED = 290;
    public static final int ALIPAY_GENERATE_VERIFY_RESPONSE_NODE_FAILED = 289;
    public static final int ALIPAY_GENERATE_verify_NODE_FAILED = 281;
    public static final int ALIPAY_GET_FP_INDEX_FAILED = 277;
    public static final int ALIPAY_GET_HARD_DEVICE_ID_ERROR = 273;
    public static final int ALIPAY_PARAM_INVALID = 274;
    public static final int ALIPAY_READ_REG_INFO_FAILED = 295;
    public static final int ALIPAY_READ_RSA_KEY_INFO_FAILED = 293;
    public static final int ALIPAY_RSAKEY_MALLOC_FAILED = 275;
    public static final int ALIPAY_TEE_DELE_REG_FAILED = 306;
    public static final int ALIPAY_TEE_ERROR_ITEM_NOT_FOUND = 296;
    public static final int ALIPAY_TEE_GET_KEY_ID_FAILED = 307;
    public static final int ALIPAY_TEE_GET_USERNAME_FILED = 297;
    public static final int ALIPAY_TEE_READ_REG_FP_FAILED = 305;
    public static final int ALIPAY_TEE_REG_FP_UNMATCH = 304;
    public static final int ALIPAY_VERIFY_REG_NODE_FAILED = 279;
    public static final int ALIPAY_VERIFY_UNREG_NODE_FAILED = 291;
    public static final int ALIPAY_VERIFY_VERIFY_NODE_FAILED = 288;
    public static final int ALIPAY_WRITE_REG_INFO_FAILED = 294;
    public static final int ALIPAY_WRITE_RSA_KEY_INFO_FAILED = 292;
    public static final int IFAA_ERR_AUTHENTICATOR_SIGN = 2046820371;
    public static final int IFAA_ERR_BAD_ACCESS = 2046820354;
    public static final int IFAA_ERR_BAD_PARAM = 2046820355;
    public static final int IFAA_ERR_BUF_TOO_SHORT = 2046820357;
    public static final int IFAA_ERR_ERASE = 2046820366;
    public static final int IFAA_ERR_GEN_RESPONSE = 2046820368;
    public static final int IFAA_ERR_GET_AUTHENTICATOR_VERSION = 2046820373;
    public static final int IFAA_ERR_GET_DEVICEID = 2046820369;
    public static final int IFAA_ERR_GET_ID_LIST = 2046820372;
    public static final int IFAA_ERR_GET_LAST_IDENTIFIED_RESULT = 2046820370;
    public static final int IFAA_ERR_HASH = 2046820360;
    public static final int IFAA_ERR_KEY_GEN = 2046820363;
    public static final int IFAA_ERR_NOT_MATCH = 2046820367;
    public static final int IFAA_ERR_NO_OPTIONAL_LEVEL = 2046820375;
    public static final int IFAA_ERR_OUT_OF_MEM = 2046820358;
    public static final int IFAA_ERR_READ = 2046820364;
    public static final int IFAA_ERR_SIGN = 2046820361;
    public static final int IFAA_ERR_SUCCESS = 0;
    public static final int IFAA_ERR_TIMEOUT = 2046820359;
    public static final int IFAA_ERR_UNKNOWN = 2046820353;
    public static final int IFAA_ERR_UNKNOWN_CMD = 2046820356;
    public static final int IFAA_ERR_UN_INITIALIZED = 2046820374;
    public static final int IFAA_ERR_VERIFY = 2046820362;
    public static final int IFAA_ERR_WRITE = 2046820365;
    public static final int RESULT_FAIL = -65536;
    public static final int RESULT_SUCCESS = 0;
    public static String TAG = "com.alipay.security.mobile.alipayauthenticatorservice.message.Result";
    public byte[] data;
    public int status;

    /* loaded from: classes3.dex */
    public class StatusCode {
        public static final int RESULT_CANCELED = 102;
        public static final int RESULT_FAIL = 101;
        public static final int RESULT_NO_MATCH = 103;
        public static final int RESULT_SUCCESS = 100;
        public static final int RESULT_SYSTEMBLOCK = 129;
        public static final int RESULT_TIMEOUT = 113;
        public static final int STATUS_CAPTURE_IMAGE = 4;
        public static final int STATUS_INPUTTING = 2;
        public static final int STATUS_INPUT_COMPLETED = 3;
        public static final int STATUS_WAITING_FOR_INPUT = 1;
        public static final int USER_STATUS_IDX_REMOVE = 1;
        public static final int USER_STATUS_NOT_REGISTER = 0;
        public static final int USER_STATUS_REGISTER = 2;

        public StatusCode() {
        }
    }

    public static String getStatusString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d59e411d", new Object[]{new Integer(i)});
        }
        switch (i) {
            case ALIPAY_BASE64_ENCODE_ERROR /* 272 */:
                return "ALIPAY_BASE64_ENCODE_ERROR";
            case ALIPAY_GET_HARD_DEVICE_ID_ERROR /* 273 */:
                return "ALIPAY_GET_HARD_DEVICE_ID_ERROR";
            case ALIPAY_PARAM_INVALID /* 274 */:
                return "ALIPAY_PARAM_INVALID";
            case ALIPAY_RSAKEY_MALLOC_FAILED /* 275 */:
                return "ALIPAY_RSAKEY_MALLOC_FAILED";
            case 276:
                return "ALIPAY_GENERATE_RSA_KEY_FAILED";
            case ALIPAY_GET_FP_INDEX_FAILED /* 277 */:
                return "ALIPAY_GET_FP_INDEX_FAILED";
            case ALIPAY_GENERATE_REG_NODE_FAILED /* 278 */:
                return "ALIPAY_GENERATE_REG_NODE_FAILED";
            case ALIPAY_VERIFY_REG_NODE_FAILED /* 279 */:
                return "ALIPAY_VERIFY_REG_NODE_FAILED";
            case 280:
                return "ALIPAY_GENERATE_REG_RESPONSE_NODE_FAILED";
            case ALIPAY_GENERATE_verify_NODE_FAILED /* 281 */:
                return "ALIPAY_GENERATE_verify_NODE_FAILED";
            default:
                switch (i) {
                    case 288:
                        return "ALIPAY_VERIFY_VERIFY_NODE_FAILED";
                    case ALIPAY_GENERATE_VERIFY_RESPONSE_NODE_FAILED /* 289 */:
                        return "ALIPAY_GENERATE_VERIFY_RESPONSE_NODE_FAILED";
                    case ALIPAY_GENERATE_UNREG_NODE_FAILED /* 290 */:
                        return "ALIPAY_GENERATE_UNREG_NODE_FAILED";
                    case ALIPAY_VERIFY_UNREG_NODE_FAILED /* 291 */:
                        return "ALIPAY_VERIFY_UNREG_NODE_FAILED";
                    case ALIPAY_WRITE_RSA_KEY_INFO_FAILED /* 292 */:
                        return "ALIPAY_WRITE_RSA_KEY_INFO_FAILED";
                    case ALIPAY_READ_RSA_KEY_INFO_FAILED /* 293 */:
                        return "ALIPAY_READ_RSA_KEY_INFO_FAILED";
                    case ALIPAY_WRITE_REG_INFO_FAILED /* 294 */:
                        return "ALIPAY_WRITE_REG_INFO_FAILED";
                    case ALIPAY_READ_REG_INFO_FAILED /* 295 */:
                        return "ALIPAY_READ_REG_INFO_FAILED";
                    case ALIPAY_TEE_ERROR_ITEM_NOT_FOUND /* 296 */:
                        return "ALIPAY_TEE_ERROR_ITEM_NOT_FOUND";
                    case ALIPAY_TEE_GET_USERNAME_FILED /* 297 */:
                        return "ALIPAY_TEE_GET_USERNAME_FILED";
                    default:
                        switch (i) {
                            case 304:
                                return "ALIPAY_TEE_REG_FP_UNMATCH";
                            case 305:
                                return "ALIPAY_TEE_READ_REG_FP_FAILED";
                            case 306:
                                return "ALIPAY_TEE_DELE_REG_FAILED";
                            case 307:
                                return "ALIPAY_TEE_GET_KEY_ID_FAILED";
                            default:
                                return "NOT_SUPPORT_ERROR_TYPE";
                        }
                }
        }
    }

    public Result() {
        this.status = -1;
    }

    public Result(int i, byte[] bArr) {
        this.status = -1;
        this.status = i;
        this.data = bArr;
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.data;
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.data = bArr;
        }
    }

    public boolean isEmpty() {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr = this.data;
            if (i >= bArr.length) {
                break;
            }
            if (bArr[i] == 0) {
                i2++;
            }
            i++;
        }
        return i2 == bArr.length;
    }

    public String getStatusStringIFAA2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80eb681d", new Object[]{this});
        }
        int i = this.status;
        if (i == 0) {
            return "IFAA_ERR_SUCCESS";
        }
        switch (i) {
            case IFAA_ERR_UNKNOWN /* 2046820353 */:
                return "IFAA_ERR_UNKNOWN";
            case IFAA_ERR_BAD_ACCESS /* 2046820354 */:
                return "IFAA_ERR_BAD_ACCESS";
            case IFAA_ERR_BAD_PARAM /* 2046820355 */:
                return "IFAA_ERR_BAD_PARAM";
            case IFAA_ERR_UNKNOWN_CMD /* 2046820356 */:
                return "IFAA_ERR_UNKNOWN_CMD";
            case IFAA_ERR_BUF_TOO_SHORT /* 2046820357 */:
                return "IFAA_ERR_BUF_TOO_SHORT";
            case IFAA_ERR_OUT_OF_MEM /* 2046820358 */:
                return "IFAA_ERR_OUT_OF_MEM";
            case IFAA_ERR_TIMEOUT /* 2046820359 */:
                return "IFAA_ERR_TIMEOUT";
            case IFAA_ERR_HASH /* 2046820360 */:
                return "IFAA_ERR_HASH";
            case IFAA_ERR_SIGN /* 2046820361 */:
                return "IFAA_ERR_SIGN";
            case IFAA_ERR_VERIFY /* 2046820362 */:
                return "IFAA_ERR_VERIFY";
            case IFAA_ERR_KEY_GEN /* 2046820363 */:
                return "IFAA_ERR_KEY_GEN";
            case IFAA_ERR_READ /* 2046820364 */:
                return "IFAA_ERR_READ";
            case IFAA_ERR_WRITE /* 2046820365 */:
                return "IFAA_ERR_WRITE";
            case IFAA_ERR_ERASE /* 2046820366 */:
                return "IFAA_ERR_ERASE";
            case IFAA_ERR_NOT_MATCH /* 2046820367 */:
                return "IFAA_ERR_NOT_MATCH";
            case IFAA_ERR_GEN_RESPONSE /* 2046820368 */:
                return "IFAA_ERR_GEN_RESPONSE";
            case IFAA_ERR_GET_DEVICEID /* 2046820369 */:
                return "IFAA_ERR_GET_DEVICEID";
            case IFAA_ERR_GET_LAST_IDENTIFIED_RESULT /* 2046820370 */:
                return "IFAA_ERR_GET_LAST_IDENTIFIED_RESULT";
            case IFAA_ERR_AUTHENTICATOR_SIGN /* 2046820371 */:
                return "IFAA_ERR_AUTHENTICATOR_SIGN";
            case IFAA_ERR_GET_ID_LIST /* 2046820372 */:
                return "IFAA_ERR_GET_ID_LIST";
            case IFAA_ERR_GET_AUTHENTICATOR_VERSION /* 2046820373 */:
                return "IFAA_ERR_GET_AUTHENTICATOR_VERSION ";
            case IFAA_ERR_UN_INITIALIZED /* 2046820374 */:
                return "IFAA_ERR_UN_INITIALIZED";
            case IFAA_ERR_NO_OPTIONAL_LEVEL /* 2046820375 */:
                return "IFAA_ERR_NO_OPTIONAL_LEVEL";
            default:
                return "NOT_SUPPORT_ERROR_TYPE[" + this.status + riy.ARRAY_END_STR;
        }
    }

    public String getStatusString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36539780", new Object[]{this});
        }
        int i = this.status;
        if (i == 0) {
            return "SUCCESS";
        }
        switch (i) {
            case -100663296:
                return "TEE_ERR_UNKNOWN";
            case -100663295:
                return "TEE_ERR_BAD_ACCESS";
            case -100663294:
                return "TEE_ERR_BAD_PARAMETERS";
            case -100663293:
                return "TEE_ERR_BAD_COMMAND";
            case -100663292:
                return "TEE_ERR_SHORT_BUFFER";
            case -100663291:
                return "TEE_ERR_OUT_OF_MEMORY";
            case -100663290:
                return "TEE_ERR_TIMEOUT";
            default:
                switch (i) {
                    case -100659200:
                        return "TEE_ERR_SHA256";
                    case -100659199:
                        return "TEE_ERR_RSA_SIGN";
                    case -100659198:
                        return "TEE_ERR_RSA_VERIFY";
                    case -100659197:
                        return "TEE_ERR_RSA_KEY_GEN";
                    case -100659196:
                        return "TEE_ERR_READ_FILE";
                    case -100659195:
                        return "TEE_ERR_WRITE_FILE";
                    case -100659194:
                        return "TEE_ERR_DELETE_FILE";
                    default:
                        switch (i) {
                            case -100655104:
                                return "TEE_ERR_FP_ID_NOT_MATCHES";
                            case -100655103:
                                return "TEE_ERR_SERVER_DATA_CORRUPTED";
                            case -100655102:
                                return "TEE_ERR_GENERATE_RESPONSE";
                            case -100655101:
                                return "TEE_ERR_GET_DEVICE_ID";
                            case -100655100:
                                return "TEE_ERR_GET_LAST_IDENTIFIED_RESULT";
                            case -100655099:
                                return "TEE_ERR_GET_ID_LIST";
                            default:
                                switch (i) {
                                    case ALIPAY_BASE64_ENCODE_ERROR /* 272 */:
                                        return "ALIPAY_BASE64_ENCODE_ERROR";
                                    case ALIPAY_GET_HARD_DEVICE_ID_ERROR /* 273 */:
                                        return "ALIPAY_GET_HARD_DEVICE_ID_ERROR";
                                    case ALIPAY_PARAM_INVALID /* 274 */:
                                        return "ALIPAY_PARAM_INVALID";
                                    case ALIPAY_RSAKEY_MALLOC_FAILED /* 275 */:
                                        return "ALIPAY_RSAKEY_MALLOC_FAILED";
                                    case 276:
                                        return "ALIPAY_GENERATE_RSA_KEY_FAILED";
                                    case ALIPAY_GET_FP_INDEX_FAILED /* 277 */:
                                        return "ALIPAY_GET_FP_INDEX_FAILED";
                                    case ALIPAY_GENERATE_REG_NODE_FAILED /* 278 */:
                                        return "ALIPAY_GENERATE_REG_NODE_FAILED";
                                    case ALIPAY_VERIFY_REG_NODE_FAILED /* 279 */:
                                        return "ALIPAY_VERIFY_REG_NODE_FAILED";
                                    case 280:
                                        return "ALIPAY_GENERATE_REG_RESPONSE_NODE_FAILED";
                                    case ALIPAY_GENERATE_verify_NODE_FAILED /* 281 */:
                                        return "ALIPAY_GENERATE_verify_NODE_FAILED";
                                    default:
                                        switch (i) {
                                            case 288:
                                                return "ALIPAY_VERIFY_VERIFY_NODE_FAILED";
                                            case ALIPAY_GENERATE_VERIFY_RESPONSE_NODE_FAILED /* 289 */:
                                                return "ALIPAY_GENERATE_VERIFY_RESPONSE_NODE_FAILED";
                                            case ALIPAY_GENERATE_UNREG_NODE_FAILED /* 290 */:
                                                return "ALIPAY_GENERATE_UNREG_NODE_FAILED";
                                            case ALIPAY_VERIFY_UNREG_NODE_FAILED /* 291 */:
                                                return "ALIPAY_VERIFY_UNREG_NODE_FAILED";
                                            case ALIPAY_WRITE_RSA_KEY_INFO_FAILED /* 292 */:
                                                return "ALIPAY_WRITE_RSA_KEY_INFO_FAILED";
                                            case ALIPAY_READ_RSA_KEY_INFO_FAILED /* 293 */:
                                                return "ALIPAY_READ_RSA_KEY_INFO_FAILED";
                                            case ALIPAY_WRITE_REG_INFO_FAILED /* 294 */:
                                                return "ALIPAY_WRITE_REG_INFO_FAILED";
                                            case ALIPAY_READ_REG_INFO_FAILED /* 295 */:
                                                return "ALIPAY_READ_REG_INFO_FAILED";
                                            case ALIPAY_TEE_ERROR_ITEM_NOT_FOUND /* 296 */:
                                                return "ALIPAY_TEE_ERROR_ITEM_NOT_FOUND";
                                            case ALIPAY_TEE_GET_USERNAME_FILED /* 297 */:
                                                return "ALIPAY_TEE_GET_USERNAME_FILED";
                                            default:
                                                switch (i) {
                                                    case 304:
                                                        return "ALIPAY_TEE_REG_FP_UNMATCH";
                                                    case 305:
                                                        return "ALIPAY_TEE_READ_REG_FP_FAILED";
                                                    case 306:
                                                        return "ALIPAY_TEE_DELE_REG_FAILED";
                                                    case 307:
                                                        return "ALIPAY_TEE_GET_KEY_ID_FAILED";
                                                    default:
                                                        return "NOT_SUPPORT_ERROR_TYPE";
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
