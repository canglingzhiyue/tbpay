package com.taobao.taobao.internal.helper;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Map;

/* loaded from: classes8.dex */
public class AbilityParams {
    @JSONField(name = "bizId")
    public String bizId;
    @JSONField(name = "content")
    public Map<String, Object> content;
    @JSONField(name = com.taobao.android.abilitykit.ability.pop.model.c.KEY_EXT_CONFIG)
    public a extConfig;
    @JSONField(name = com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG)
    public b popConfig;
    @JSONField(name = "popId")
    public String popId;
    @JSONField(name = "queryParams")
    public Map<String, String> queryParams;
    @JSONField(name = "url")
    public String url;

    /* loaded from: classes8.dex */
    public static class a {
    }

    /* loaded from: classes8.dex */
    public static class b {
        @JSONField(name = "animation")

        /* renamed from: a  reason: collision with root package name */
        public String f21211a;
        @JSONField(name = "panEnable")
        public String b;
        @JSONField(name = "attachMode")
        public String c;
        @JSONField(name = "contentBackColor")
        public String d;
        @JSONField(name = "maxHeight")
        public float e;
    }
}
