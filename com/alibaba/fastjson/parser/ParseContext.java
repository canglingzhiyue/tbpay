package com.alibaba.fastjson.parser;

import java.lang.reflect.Type;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class ParseContext {
    public final Object fieldName;
    public Object object;
    public final ParseContext parent;
    private transient String path;
    public Type type;

    static {
        kge.a(-1323585054);
    }

    public ParseContext(ParseContext parseContext, Object obj, Object obj2) {
        this.parent = parseContext;
        this.object = obj;
        this.fieldName = obj2;
    }

    public String toString() {
        StringBuilder sb;
        String sb2;
        if (this.path == null) {
            if (this.parent == null) {
                sb2 = "$";
            } else {
                if (this.fieldName instanceof Integer) {
                    sb = new StringBuilder();
                    sb.append(this.parent.toString());
                    sb.append(riy.ARRAY_START_STR);
                    sb.append(this.fieldName);
                    sb.append(riy.ARRAY_END_STR);
                } else {
                    sb = new StringBuilder();
                    sb.append(this.parent.toString());
                    sb.append(".");
                    sb.append(this.fieldName);
                }
                sb2 = sb.toString();
            }
            this.path = sb2;
        }
        return this.path;
    }
}
