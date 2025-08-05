package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import tb.kge;

/* loaded from: classes8.dex */
public class InvalidJsonPatchException extends JsonPatchApplicationException {
    static {
        kge.a(718139214);
    }

    public InvalidJsonPatchException(String str) {
        super(str);
    }

    public InvalidJsonPatchException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidJsonPatchException(Throwable th) {
        super(th);
    }
}
