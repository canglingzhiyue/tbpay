package com.taobao.popupcenter.strategy;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class PopStrategy implements Serializable {
    public static final String IDENTIFIER_FLOAT = "float";
    public static final String IDENTIFIER_GUESS = "guessYouLike";
    public static final String IDENTIFIER_HIGH = "high";
    public static final String IDENTIFIER_LOW = "low";
    public static final String IDENTIFIER_NORMAL = "normal";
    public static final String IDENTIFIER_POPLAYER = "popLayer";
    public static final String IDENTIFIER_SPLASH = "splash";
    public static final String IDENTIFIER_TAO_PASSWORD = "taoPassword";
    public static final String IDENTIFIER_UPDATE = "update";
    public boolean canOverlay;
    public boolean firstShow;
    public long firstShowTimeout;
    public String identifier;
    public int priority;
    public boolean showDirect;

    public PopStrategy() {
        this.identifier = "";
        this.priority = Integer.MAX_VALUE;
        this.canOverlay = false;
        this.firstShow = false;
        this.firstShowTimeout = 0L;
        this.showDirect = false;
    }

    public PopStrategy(String str, int i, boolean z, boolean z2, long j, boolean z3) {
        this.identifier = "";
        this.priority = Integer.MAX_VALUE;
        this.canOverlay = false;
        this.firstShow = false;
        this.firstShowTimeout = 0L;
        this.showDirect = false;
        this.identifier = str;
        this.priority = i;
        this.canOverlay = z;
        this.firstShow = z2;
        this.firstShowTimeout = j;
        this.showDirect = z3;
    }
}
