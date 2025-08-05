package com.taobao.message.uikit.media.expression;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class Expression implements Serializable {
    public String gif;
    @JSONField(name = "cid")
    public String id;
    @Deprecated
    public int index;
    public int localResInt;
    public String meaning;
    public int pathType;
    public String preview;
    public String source;
    public int type;
    public String value;

    static {
        kge.a(-1620120324);
        kge.a(1028243835);
    }

    public Expression() {
        this.index = 0;
        this.type = 0;
        this.id = "default";
    }

    public Expression(int i, int i2, String str, String str2) {
        this.index = 0;
        this.type = 0;
        this.id = "default";
        this.index = i;
        this.localResInt = i2;
        this.value = str;
        this.meaning = str2;
    }

    public Expression(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, int i4) {
        this.index = 0;
        this.type = 0;
        this.id = "default";
        this.type = i;
        this.id = str;
        this.index = i2;
        this.localResInt = i3;
        this.source = str2;
        this.preview = str3;
        this.value = str4;
        this.meaning = str5;
        this.gif = str6;
        this.pathType = i4;
    }

    public Expression(String str, String str2, String str3) {
        this(0, "default", 0, 0, str, null, str2, str3, null, 2);
    }

    public Expression(int i, String str, String str2) {
        this.index = 0;
        this.type = 0;
        this.id = "default";
        this.type = i;
        this.source = str;
        this.meaning = str2;
    }

    public Expression(String str, String str2, int i, String str3, int i2) {
        this(0, "default", 0, i2, str3, null, str, str2, null, i);
    }
}
