package com.alibaba.jsi.standard.java;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.i;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes2.dex */
public class JSRuntimeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f3135a;
    private static final Pattern b;

    static {
        kge.a(1697342219);
        f3135a = Pattern.compile("^\\s*at ([^\\s]+) \\((.*):(\\d+):(\\d+)\\)$");
        b = Pattern.compile("^\\s*at (.*):(\\d+):(\\d+)$");
    }

    public JSRuntimeException(d dVar, i iVar) {
        super(iVar == null ? "" : iVar.c(dVar));
        String[] split;
        if (iVar == null) {
            return;
        }
        String d = iVar.d(dVar);
        iVar.a();
        if (d == null) {
            return;
        }
        Pattern compile = "jsc".equals(JSEngine.getEngineType()) ? Pattern.compile("^\\s*([^\\s]+)@(.*):(\\d+):(\\d+).*$") : f3135a;
        ArrayList arrayList = new ArrayList();
        for (String str : d.split("\n")) {
            Matcher matcher = compile.matcher(str);
            if (matcher.matches()) {
                arrayList.add(new StackTraceElement(WXExceptionConfig.KEY_JS, matcher.group(1), matcher.group(2), Integer.parseInt(matcher.group(3))));
            } else {
                Matcher matcher2 = b.matcher(str);
                if (matcher2.matches()) {
                    arrayList.add(new StackTraceElement(WXExceptionConfig.KEY_JS, "<anonymous>", matcher2.group(1), Integer.parseInt(matcher2.group(2))));
                }
            }
        }
        arrayList.addAll(Arrays.asList(getStackTrace()));
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }
}
