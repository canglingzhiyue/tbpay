package com.taobao.weex.ui.view.border;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.taobao.weex.dom.CSSShorthand;

/* loaded from: classes9.dex */
enum BorderStyle {
    SOLID,
    DASHED,
    DOTTED;

    /* renamed from: com.taobao.weex.ui.view.border.BorderStyle$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle = new int[BorderStyle.values().length];

        static {
            try {
                $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle[BorderStyle.DOTTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$weex$ui$view$border$BorderStyle[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Shader getLineShader(float f, int i, CSSShorthand.EDGE edge) {
        int i2 = AnonymousClass1.$SwitchMap$com$taobao$weex$ui$view$border$BorderStyle[ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
        } else if (edge == CSSShorthand.EDGE.LEFT || edge == CSSShorthand.EDGE.RIGHT) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, f * 2.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
        } else {
            if (edge == CSSShorthand.EDGE.TOP || edge == CSSShorthand.EDGE.BOTTOM) {
                return new LinearGradient(0.0f, 0.0f, f * 2.0f, 0.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
            }
        }
        if (edge == CSSShorthand.EDGE.LEFT || edge == CSSShorthand.EDGE.RIGHT) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, f * 6.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
        }
        if (edge != CSSShorthand.EDGE.TOP && edge != CSSShorthand.EDGE.BOTTOM) {
            return null;
        }
        return new LinearGradient(0.0f, 0.0f, 6.0f * f, 0.0f, new int[]{i, 0}, new float[]{0.5f, 0.5f}, Shader.TileMode.REPEAT);
    }
}
