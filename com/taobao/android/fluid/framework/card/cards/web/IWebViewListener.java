package com.taobao.android.fluid.framework.card.cards.web;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public interface IWebViewListener {
    public static final String BIZ_SCENE = "game";
    public static final int JS_WEB_GAME_STATE_FAILED = 3;
    public static final int JS_WEB_GAME_STATE_FINISH = 2;
    public static final int JS_WEB_GAME_STATE_INIT = 0;
    public static final int JS_WEB_GAME_STATE_REGISTERED = 1;
    public static final int JS_WEB_LOAD_STATE_FAILED = 3;
    public static final int JS_WEB_LOAD_STATE_FINISH = 2;
    public static final int JS_WEB_LOAD_STATE_INIT = 0;
    public static final int JS_WEB_LOAD_STATE_START = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface JSWebLoadState {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface WebGameState {
    }
}
