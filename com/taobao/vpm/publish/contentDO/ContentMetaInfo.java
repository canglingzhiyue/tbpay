package com.taobao.vpm.publish.contentDO;

/* loaded from: classes9.dex */
public class ContentMetaInfo extends a {
    public PublishState e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* loaded from: classes9.dex */
    public enum PublishState {
        SUCCESS,
        ERROR
    }

    public ContentMetaInfo(String str, String str2, String str3, String str4, PublishState publishState, String str5, String str6, String str7, String str8, String str9) {
        super(str, str2, str3, str4);
        this.e = publishState;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }
}
