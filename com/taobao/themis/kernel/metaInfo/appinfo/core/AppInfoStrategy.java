package com.taobao.themis.kernel.metaInfo.appinfo.core;

/* loaded from: classes9.dex */
public enum AppInfoStrategy {
    ASYNC_LOAD("asyncLoad"),
    SYNC_LOAD("syncLoad"),
    LOCAL_LOAD("localLoad"),
    ALREADY_ASYNC_LOAD("alreadyAsyncLoad"),
    FORCE_SYNC_LOAD("forceSyncLoad");
    
    private String name;

    AppInfoStrategy(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
