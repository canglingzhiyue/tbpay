package com.etao.feimagesearch.pipline;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import tb.kge;

/* loaded from: classes3.dex */
public final class ProcessResult {
    public static final int ERROR_DECODE_FAILED = -3;
    public static final int ERROR_DOWNLOAD_FAILED = -4;
    public static final int ERROR_EMPTY_IMG_FILE = -8;
    public static final int ERROR_EMPTY_PATH = -2;
    public static final int ERROR_INVALID_CHANNEL = -7;
    public static final int ERROR_INVALID_PARAMS = -18;
    public static final int ERROR_LIMIT_TRAFFIC = -17;
    public static final int ERROR_NO_NETWORK = -10;
    public static final int ERROR_PROCESS_TIMEOUT = -12;
    public static final int ERROR_SEARCH_EMPTY = -15;
    public static final int ERROR_SEARCH_ERROR = -14;
    public static final int ERROR_SEARCH_LOGIN_CANCEL = -16;
    public static final int ERROR_THREAD_INTERRUPT = -13;
    public static final int ERROR_TOO_SMALL = -5;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UPLOAD_FAILED = -6;
    public static final ProcessResult INSTANCE;
    public static final int STATUS_FAILURE = -1;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_SUCCESS_WITH_DATA = 2;

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ProcessResultStatus {
    }

    static {
        kge.a(-1639289863);
        INSTANCE = new ProcessResult();
    }

    private ProcessResult() {
    }
}
