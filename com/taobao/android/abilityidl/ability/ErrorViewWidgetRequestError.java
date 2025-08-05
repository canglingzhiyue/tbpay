package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.IAbilityResult;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import java.util.Map;
import tb.arz;
import tb.kge;

/* loaded from: classes4.dex */
public final class ErrorViewWidgetRequestError implements IAbilityResult {
    public String api;
    public String code;
    public String mappingCode;
    public String message;
    public String responseCode;
    public String url;

    static {
        kge.a(363247120);
        kge.a(1305549738);
    }

    public ErrorViewWidgetRequestError() {
    }

    public ErrorViewWidgetRequestError(Map<String, ? extends Object> map) {
        this();
        this.api = com.alibaba.ability.e.b(map, "api", (String) null);
        this.url = com.alibaba.ability.e.b(map, "url", (String) null);
        this.responseCode = com.alibaba.ability.e.b(map, ZimMessageChannel.K_RPC_RES_CODE, (String) null);
        this.mappingCode = com.alibaba.ability.e.b(map, arz.KEY_MAPPING_CODE, (String) null);
        this.code = com.alibaba.ability.e.b(map, "code", (String) null);
        this.message = com.alibaba.ability.e.b(map, "message", (String) null);
    }
}
