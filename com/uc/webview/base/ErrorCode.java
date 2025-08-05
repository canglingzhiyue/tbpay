package com.uc.webview.base;

import com.alibaba.wireless.security.SecExceptionCode;

/* loaded from: classes9.dex */
public enum ErrorCode {
    CONTEXT_IS_NULL(1),
    NEED_AT_LEAST_ONE_LIB_CONFIG(2),
    INVALID_COMPRESSED_LIB(3),
    INVALID_DECOMPRESSED_DIR(4),
    CORE_DEX_FILE_NOT_EXISTS(100),
    VERIFY_DEX_FAILED(101),
    VERIFY_LIB_FAILED(102),
    CORE_FACTORY_NOT_FOUND(103),
    INVALID_ALLIN_CORE(104),
    NATIVE_LIBRARIES_MISSING(105),
    INIT_CORE_ENGINE_FAILED(106),
    INIT_WAIT_TIMEOUT(107),
    LOAD_NATIVE_LIB_FAILED(108),
    EXTRACT_MULIT_TIMES_AND_ALWAYS_INIT_FAILED(109),
    COMPATIABLE_INVALID_CONFIGS(110),
    COMPATIABLE_INVALID_APP_KEY(111),
    COMPATIABLE_NOT_SUPPORT_ARCH(112),
    COMPATIABLE_NOT_SUPPORT_ANDROID_VERSION(113),
    COMPATIABLE_NOT_SUPPORT_CORE_VERSION(114),
    LOAD_SEVEN_ZIP_LIB_FAILED(115),
    REPEAT_INITIALIZATION(116),
    STARTUP_CTRL_NOT_FOUND(117),
    LOAD_NATIVE_LIB_FAILED_AND_FILE_INVALID(118),
    CUSTOM_EXTRACTION_AND_VERIFY_FAILED(119),
    COMPATIABLE_UNAUTHORIZED_APP(120),
    MKDIR_FAILED(200),
    STORAGE_SPACE_NOT_ENOUGH(201),
    GEN_FILE_FAILED(202),
    U4_INIT_FAILED(203),
    DECOMPRESS_SEVENZIP_ERROR(300),
    DECOMPRESS_UNTRUSTED_DIR_TRAVERSAL(301),
    DECOMPRESS_CONTENTS_TOO_BIG(302),
    DECOMPRESS_FILES_TOO_MANY(303),
    DECOMPRESS_FINISH_BUT_NO_FILES(304),
    DECOMPRESS_INVALID_ZIP_FILE(305),
    DECOMPRESS_RENAME_FAILED(306),
    DECOMPRESS_CUSTOM_VERIFICATION_FAILED(307),
    DECOMPRESS_U4_VERIFICATION_FAILED(SecExceptionCode.SEC_ERROR_STA_NO_MEMORY),
    DECOMPRESS_SEVENZIP_ERROR_NOSPC(SecExceptionCode.SEC_ERROR_STA_NO_SUCH_INDEX),
    UPDATE_FEATURE_DISABLED(400),
    UPDATE_INVALID_URL(401),
    UPDATE_DOWNLOAD_INTERRUPTED(402),
    UPDATE_GET_URL_FILE_INFO_FAILED(403),
    UPDATE_DOWNLOAD_SIZE_NOT_MATCH(404),
    UPDATE_FAILED_BECAUSE_FALLBACK_SYSTEM(405),
    UPDATE_UC_PLAYER_DISABLED(406),
    UPDATE_INIT_DUPLICATED(407),
    UPDATE_MISSING_UCPLAYER_SO(408),
    EMBEDER_INIT_FINISHED_CALLBACK_FAILED(500),
    JSI_JSENGINE_NOT_FOUND(600),
    JSI_JSENGINE_INVALID_COMPRESSED_FILE(601),
    JSI_JSENGINE_INVALID_JSI_SO_FILE(602),
    JSI_JSENGINE_INVALID_CORE_SO_FILE(603),
    JSI_U4ENGINE_EXTRACT_FAILED(604),
    JSI_JSENGINE_LOADSO_FAILED(605),
    JSI_JSENGINE_INCOMPATIBLE_CORE(SecExceptionCode.SEC_ERROR_SIGNATURE_NO_SEEDSECRET);
    
    public final int code;

    ErrorCode(int i) {
        this.code = i;
    }

    public static boolean isErrorHasDetailMessage(int i) {
        return i == DECOMPRESS_SEVENZIP_ERROR.code || i == LOAD_NATIVE_LIB_FAILED.code || i == COMPATIABLE_NOT_SUPPORT_ARCH.code || i == EXTRACT_MULIT_TIMES_AND_ALWAYS_INIT_FAILED.code || i == EMBEDER_INIT_FINISHED_CALLBACK_FAILED.code;
    }

    public static boolean isErrorShouldCleanup(int i) {
        return i == MKDIR_FAILED.code || i == STORAGE_SPACE_NOT_ENOUGH.code || i == DECOMPRESS_SEVENZIP_ERROR_NOSPC.code;
    }

    public static boolean isErrorShouldReExtract(int i) {
        return i == DECOMPRESS_SEVENZIP_ERROR.code || i == VERIFY_DEX_FAILED.code || i == VERIFY_LIB_FAILED.code || i == LOAD_NATIVE_LIB_FAILED_AND_FILE_INVALID.code || i == DECOMPRESS_SEVENZIP_ERROR_NOSPC.code;
    }

    public static boolean isErrorShouldRestart(int i) {
        return i == CORE_FACTORY_NOT_FOUND.code || i == DECOMPRESS_FINISH_BUT_NO_FILES.code;
    }

    public static boolean isUnknownError(int i) {
        return i < 0;
    }

    public static boolean isUnknownError(UCKnownException uCKnownException) {
        return isUnknownError(uCKnownException.errCode());
    }

    public final boolean equals(int i) {
        return this.code == i;
    }

    public final boolean equals(UCKnownException uCKnownException) {
        return uCKnownException != null && this.code == uCKnownException.errCode();
    }

    public final void report() throws UCKnownException {
        throw new UCKnownException(this, (String) null, (Throwable) null);
    }

    public final void report(String str) throws UCKnownException {
        throw new UCKnownException(this, str, (Throwable) null);
    }

    public final void report(String str, Throwable th) throws UCKnownException {
        throw new UCKnownException(this, str, th);
    }

    public final void report(Throwable th) throws UCKnownException {
        throw new UCKnownException(this, (String) null, th);
    }
}
