package com.taobao.android.xsearchplugin.jarvis.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes6.dex */
public class JarvisConstant {
    public static final String ACTION_APPEND_PARAMS = "appendParams";
    public static final String ACTION_INSERT = "insert";
    public static final String ACTION_PREFETCH = "prefetch";
    public static final String ACTION_REFRESH = "refresh";
    public static final String ACTION_RERANK = "rerank";
    public static final String ACTION_RERANK_AND_TRACK = "rerankAndTrack";
    public static final String EVENT_RECORD_ITME_CLICk = "recordItemClick";
    public static final String KEY_ACTION_ID = "actionId";
    public static final String KEY_EXPOSED_COUNT = "exposedCount";
    public static final String KEY_JARVIS_CONFIG = "jarvisConfig";
    public static final String KEY_JARVIS_CONTEXT = "jarvisContext";
    public static final String KEY_JARVIS_INDEX = "jarvisIndex";
    public static final String KEY_JARVIS_MODEL_NAME = "jarvisModelName";
    public static final String KEY_JARVIS_TRIGGER = "trigger";
    public static final String KEY_JARVIS_TRIGGER_OPTION = "triggerOption";
    public static final String KEY_RERANK_IDS = "rerankIds";
    public static final String TRIGGER_POINT_AFTER = "after";
    public static final String TRIGGER_POINT_CELL_EXPOSE = "expose";
    public static final String TRIGGER_POINT_CLICK = "click";
    public static final String TRIGGER_POINT_DETAIL_BACK = "detailBack";
    public static final String TRIGGER_POINT_IDLE = "idle";
    public static final String TRIGGER_POINT_SCROLL_STOP = "stopScroll";

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface JarvisTriggerPoint {
    }

    static {
        kge.a(666991010);
    }
}
