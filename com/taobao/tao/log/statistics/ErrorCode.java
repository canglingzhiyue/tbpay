package com.taobao.tao.log.statistics;

import anet.channel.strategy.dispatch.DispatchCore;

/* loaded from: classes8.dex */
public enum ErrorCode {
    COMMON(0, "-1001"),
    CODE_EXC(1, "-1002"),
    DATA_EMPTY(2, DispatchCore.CHECK_SIGN_FAIL),
    DATA_ERROR(3, DispatchCore.RESOLVE_ANSWER_FAIL),
    NET_ERROR(4, "-1005"),
    UPLOAD_NOT_WIFI(5, "-1006"),
    UPLOAD_NO_FILE(6, "-1007"),
    NOT_IMPLEMENTED(7, "-1008"),
    TOKEN_REPLY_ERROR(8, "-1009"),
    TOKEN_EMPTY(9, "-1010"),
    UNSUPPORTED_BIZ_TYPE(10, "-1011"),
    BIZ_ERROR(11, "-1012"),
    TOKEN_REFUSE_ERROR(12, "-1013"),
    FILE_ZIP_ERROR(13, "-1014"),
    FILE_ZIP_NOT_EXIST(14, "-1015"),
    TLOG_INIT_ERROR(15, "-1016"),
    TOKEN_NO_NEED_UPLOAD(16, "-1017"),
    UDF_FILE_LARGE(17, "-1018"),
    MINI_TLOG_WRITE_FAILED(18, "-1019"),
    MINI_TLOG_BLOCK_ERROR(19, "-1020");
    
    private String desc;
    private int value;

    ErrorCode(int i, String str) {
        this.value = i;
        this.desc = str;
    }

    public String getValue() {
        return this.desc;
    }
}
