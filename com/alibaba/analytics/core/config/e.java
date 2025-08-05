package com.alibaba.analytics.core.config;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import tb.aof;
import tb.kge;

@TableName("utap_system")
/* loaded from: classes.dex */
public class e extends aof {
    @Column("key")

    /* renamed from: a  reason: collision with root package name */
    public String f2056a;
    @Column("value")
    public String b;

    static {
        kge.a(1468822776);
    }
}
