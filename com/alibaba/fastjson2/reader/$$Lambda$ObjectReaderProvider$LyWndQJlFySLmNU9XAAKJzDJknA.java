package com.alibaba.fastjson2.reader;

import java.util.TimeZone;

/* compiled from: lambda */
/* renamed from: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$LyWndQJlFySLmNU9XAAKJzDJknA  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class $$Lambda$ObjectReaderProvider$LyWndQJlFySLmNU9XAAKJzDJknA implements com.alibaba.fastjson2.function.d {
    public static final /* synthetic */ $$Lambda$ObjectReaderProvider$LyWndQJlFySLmNU9XAAKJzDJknA INSTANCE = new $$Lambda$ObjectReaderProvider$LyWndQJlFySLmNU9XAAKJzDJknA();

    private /* synthetic */ $$Lambda$ObjectReaderProvider$LyWndQJlFySLmNU9XAAKJzDJknA() {
    }

    @Override // com.alibaba.fastjson2.function.d
    public final Object apply(Object obj) {
        TimeZone timeZone;
        timeZone = TimeZone.getTimeZone((String) obj);
        return timeZone;
    }
}
