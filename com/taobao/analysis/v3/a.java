package com.taobao.analysis.v3;

import java.util.List;
import java.util.Map;
import tb.mzp;

/* loaded from: classes.dex */
public class a extends o implements f {
    public static final String INVOKE = "invoke";
    public static final String POST_PROCESS = "postProcess";
    public static final String PRE_PROCESS = "preProcess";

    public a(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list) {
        this(vVar, str, str2, j, map, list, FalcoSpanLayer.ABILITY);
    }

    public a(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list, String str3) {
        super(vVar, str, str2, j, map, list, str3);
    }
}
