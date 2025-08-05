package com.etao.feimagesearch.intelli;

import com.etao.feimagesearch.nn.NetConfig;
import mtopsdk.ssrcore.util.SsrLoginOption;
import tb.cpe;

/* loaded from: classes3.dex */
public enum ClientModelType {
    MNN("mnn"),
    ALINN(NetConfig.CONFIG_ALINN_URL),
    CLIENT(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID),
    SILENT(SsrLoginOption.SILENT);
    
    public static final String KEY_CLIENT_MODEL_TYPE = "cmt";
    private final String type;

    ClientModelType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
