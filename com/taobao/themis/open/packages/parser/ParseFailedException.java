package com.taobao.themis.open.packages.parser;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ParseFailedException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CERT_PATH_NOT_EXIST = 4;
    public static final int EMPTY_RES = 8;
    public static final int INVALID_PARAM = 1;
    public static final int OFFLINE_PATH_NOT_EXIST = 2;
    public static final int TAR_PATH_NOT_EXIST = 3;
    public static final int TAR_SIGNATURE_IS_EMPTY = 5;
    public static final int UN_KNOW_EXCEPTION = 7;
    public static final int VERIFY_FAIL = 6;
    private int code;
    private ParseContext parseContext;

    static {
        kge.a(1090793884);
    }

    public ParseFailedException(int i, String str) {
        super(str);
        this.code = i;
    }

    public ParseContext getParseContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParseContext) ipChange.ipc$dispatch("d5cee91", new Object[]{this}) : this.parseContext;
    }

    public void setParseContext(ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a92c83", new Object[]{this, parseContext});
        } else {
            this.parseContext = parseContext;
        }
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.code;
    }
}
