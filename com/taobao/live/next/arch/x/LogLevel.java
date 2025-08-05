package com.taobao.live.next.arch.x;

import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/live/next/arch/x/LogLevel;", "", "value", "Lkotlin/UInt;", "<init>", "(Ljava/lang/String;II)V", "getValue-pVg5ArA", "()I", TLogTracker.LEVEL_INFO, "LOG_DEBUG", "LOG_INFO", "LOG_WARN", "LOG_ERROR", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogLevel extends Enum<LogLevel> {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final int value;
    public static final LogLevel LOG_DEBUG = new LogLevel("LOG_DEBUG", 0, 2330);
    public static final LogLevel LOG_INFO = new LogLevel("LOG_INFO", 1, 2331);
    public static final LogLevel LOG_WARN = new LogLevel("LOG_WARN", 2, 2332);
    public static final LogLevel LOG_ERROR = new LogLevel("LOG_ERROR", 3, 2333);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{LOG_DEBUG, LOG_INFO, LOG_WARN, LOG_ERROR};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LogLevel(String str, int i, int i2) {
        this.value = i2;
    }

    public static a<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    /* renamed from: getValue-pVg5ArA  reason: not valid java name */
    public final int m1113getValuepVg5ArA() {
        return this.value;
    }
}
