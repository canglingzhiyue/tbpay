package com.alibaba.poplayer.utils;

import android.support.v4.view.InputDeviceCompat;
import tb.kge;

/* loaded from: classes3.dex */
public final class ConsoleLogger {
    public static final String LOG_TAG_OUT_CONSOLE = "Console";
    public static final String LOG_TAG_POPLAYER = "PopLayer";

    /* loaded from: classes3.dex */
    public enum Level {
        V('v', -1),
        I('i', -16711936),
        W('w', InputDeviceCompat.SOURCE_ANY),
        E('e', -65536),
        D('d', -16776961);
        
        public int color;
        public char sign;

        Level(char c, int i) {
            this.sign = c;
            this.color = i;
        }

        public static Level find(char c) {
            Level[] values;
            for (Level level : values()) {
                if (level.sign == c) {
                    return level;
                }
            }
            return D;
        }
    }

    static {
        kge.a(-1280213125);
    }
}
