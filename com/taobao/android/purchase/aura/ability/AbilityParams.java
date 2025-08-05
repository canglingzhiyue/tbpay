package com.taobao.android.purchase.aura.ability;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.abilitykit.ability.pop.model.c;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class AbilityParams {
    @JSONField(name = "bizId")
    public String bizId;
    @JSONField(name = "content")
    public Map<String, Object> content;
    @JSONField(name = c.KEY_EXT_CONFIG)
    public a extConfig;
    @JSONField(name = c.KEY_POP_CONFIG)
    public b popConfig;
    @JSONField(name = "popId")
    public String popId;
    @JSONField(name = "queryParams")
    public Map<String, String> queryParams;
    @JSONField(name = "url")
    public String url;

    /* loaded from: classes6.dex */
    public static class a {
        @JSONField(name = "fragmentClass")

        /* renamed from: a  reason: collision with root package name */
        public String f14729a;
        @JSONField(name = "droidFragmentTag")
        public String b;

        static {
            kge.a(-1566144613);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        @JSONField(name = "animation")

        /* renamed from: a  reason: collision with root package name */
        public String f14730a;
        @JSONField(name = "panEnable")
        public String b;
        @JSONField(name = "attachMode")
        public String c;
        @JSONField(name = "contentBackColor")
        public String d;
        @JSONField(name = "maxHeight")
        public float e;
        @JSONField(name = "backgroundMode")
        public String f;
        @JSONField(name = "backgroundStyle")
        public String g;
        @JSONField(name = "shouldBlockClose")
        public String h;
        @JSONField(name = "droidFullScreen")
        public String i;
        @JSONField(name = com.taobao.android.detail.wrapper.nav.c.STDPOP_CONFIG_BACK)
        public String j;
        @JSONField(name = "cornerRadius")
        public float k;

        static {
            kge.a(1232483275);
        }
    }

    static {
        kge.a(1038087546);
    }
}
