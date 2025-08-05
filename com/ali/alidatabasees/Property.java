package com.ali.alidatabasees;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum Property implements Serializable {
    Key("key"),
    BusyTimeout("busy_timeout"),
    JournalMode("journal_mode"),
    Synchronous("synchronous"),
    LockingMode("locking_mode"),
    MaxPageCount("max_page_count"),
    PageSize("page_size"),
    ManualWalCheckpoint("manul_wal_checkpoint"),
    WalCheckpoint("wal_checkpoint"),
    UserVersion("user_version");
    
    final String propertyName;

    Property(String str) {
        this.propertyName = str;
    }
}
