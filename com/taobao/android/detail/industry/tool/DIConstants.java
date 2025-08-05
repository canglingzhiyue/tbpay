package com.taobao.android.detail.industry.tool;

import com.alibaba.android.aura.datamodel.render.a;

/* loaded from: classes4.dex */
public interface DIConstants {
    public static final String EVENT_NAME_LIFE_CYCLE = "lifecycle";
    public static final String WEXX_EVENT_MODULE = "detailWeex2";

    /* loaded from: classes4.dex */
    public enum RenderType {
        WEEX(a.b.g),
        WEEX2("weex2"),
        H5(a.b.b),
        TRIVER_WIDGET("triverWidget"),
        DX(a.b.f2133a),
        NATIVE(a.b.c);
        
        private final String value;

        RenderType(String str) {
            this.value = str;
        }

        public static boolean isAsyncRenderType(String str) {
            return WEEX.getValue().equals(str) || WEEX2.getValue().equals(str) || H5.getValue().equals(str) || TRIVER_WIDGET.getValue().equals(str);
        }

        public String getValue() {
            return this.value;
        }
    }
}
