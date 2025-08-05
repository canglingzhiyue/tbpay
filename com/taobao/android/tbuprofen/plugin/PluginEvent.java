package com.taobao.android.tbuprofen.plugin;

/* loaded from: classes6.dex */
public enum PluginEvent {
    CUSTOM_EVENT_BIG_MEM_ALLOC("BIG_MEM_ALLOC", 1000),
    CUSTOM_EVENT_MAIN_THREAD_LONG_BLOCK("MAIN_THREAD_LONG_BLOCK", 1001);
    
    private final int index;
    private final String name;

    PluginEvent(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}
