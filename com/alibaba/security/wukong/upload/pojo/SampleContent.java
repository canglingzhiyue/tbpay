package com.alibaba.security.wukong.upload.pojo;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class SampleContent implements Serializable {
    public String content;
    public String type;

    public SampleContent(String str, String str2) {
        this.type = str;
        this.content = str2;
    }
}
