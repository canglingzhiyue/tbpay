package com.taobao.android.tbuprofen.plugin;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes6.dex */
public enum PluginCapacity {
    FUN_UNKNOWN("UNKNOWN"),
    FUN_BIG_ALLOC_MONITOR("BIG_ALLOC"),
    FUNC_GC_MONITOR("GC"),
    FUNC_MAIN_LOCK_MONITOR("MAIN_LOCK"),
    FUNC_CAUGHT_EXCEPTION_MONITOR("CAUGHT_EXCEPTION"),
    FUNC_CLASS_PREPARED_MONITOR("CLASS_PREPARED"),
    FUNC_SIGQUIT_DUMP("SIGQUIT_DUMP"),
    FUNC_DUMP_HEAP("DUMP_HEAP"),
    FUNC_THREAD_MONITOR("THREAD_MONITOR");
    
    private final String name;

    PluginCapacity(String str) {
        this.name = str;
    }

    public static PluginCapacity parse(String str) {
        PluginCapacity[] values;
        for (PluginCapacity pluginCapacity : values()) {
            if (StringUtils.equals(pluginCapacity.name, str)) {
                return pluginCapacity;
            }
        }
        return FUN_UNKNOWN;
    }
}
