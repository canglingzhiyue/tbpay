package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cv {

    /* renamed from: a  reason: collision with root package name */
    public String f8800a;
    public String b;
    public String c;

    static {
        kge.a(488047947);
    }

    public cv() {
        this.f8800a = "";
    }

    public cv(Map<String, ? extends Object> map) {
        this();
        String a2 = ImagePreviewType.Companion.a(com.alibaba.ability.e.b(map, "type", (String) null));
        if (a2 == null) {
            throw new RuntimeException("type 参数必传！");
        }
        this.f8800a = a2;
        this.b = com.alibaba.ability.e.b(map, "imageURL", (String) null);
        this.c = com.alibaba.ability.e.b(map, com.taobao.taolive.room.utils.aw.PUBLISH_VIDEO_TMP_PATH, (String) null);
    }
}
