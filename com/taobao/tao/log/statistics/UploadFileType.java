package com.taobao.tao.log.statistics;

/* loaded from: classes8.dex */
public enum UploadFileType {
    UNKNOWN(0, "UNKNOWN", "application/x-unknown"),
    LOG(1, "TLOG", "application/x-tlog"),
    UDF(2, "USER_UPLOAD", "application/x-udf"),
    METHOD_TRACE(3, "METHOD_TRACE", "application/x-perf-methodtrace"),
    HEAP_DUMP(4, "HEAP_DUMP", "application/x-perf-heapdump");
    
    private final String contentType;
    private final String name;
    private final int value;

    UploadFileType(int i, String str, String str2) {
        this.value = i;
        this.name = str;
        this.contentType = str2;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return String.valueOf(this.value);
    }
}
