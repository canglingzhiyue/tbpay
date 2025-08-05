package com.huawei.nb.searchmanager.client.exception;

/* JADX WARN: Enum class init method not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes4.dex */
public final class SearchResult extends Enum<SearchResult> {
    public static final SearchResult DB_EXCEPTION = null;
    public static final SearchResult FAIL = null;
    public static final SearchResult FILE_RW_EXCEPTION = null;
    public static final SearchResult ILLEGAL_ARGUMENT = null;
    public static final SearchResult INNER_ERROR = null;
    public static final SearchResult IPC_EXCEPTION = null;
    public static final SearchResult OUT_OF_MEMORY = null;
    public static final SearchResult PERMISSION_DENIED = null;
    public static final SearchResult PERMISSION_GRANTED = null;
    public static final SearchResult SERVICE_NOT_CONNECT = null;
    public static final SearchResult SUCCESS = null;
    public static final SearchResult UNKNOWN_ERROR = null;

    public static SearchResult getSearchResult(int i) {
        throw new RuntimeException("stub");
    }

    public static SearchResult valueOf(String str) {
        throw new RuntimeException("stub");
    }

    public static SearchResult[] values() {
        throw new RuntimeException("stub");
    }

    public int getRetCode() {
        throw new RuntimeException("stub");
    }

    public String getRetMsg() {
        throw new RuntimeException("stub");
    }
}
