package com.taobao.tao.log.logger;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.f;
import com.taobao.tao.log.interceptor.g;
import com.taobao.tao.log.utils.d;
import tb.kge;
import tb.myo;
import tb.myr;

/* loaded from: classes.dex */
public class SpanLogger implements myo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FIELD_BAGGAGE = "bags";
    private static final String FIELD_FINISH_TIME = "finish";
    private static final String FIELD_LOG_EVENT = "event";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SPAN_ID = "sid";
    private static final String FIELD_START_TIME = "start";
    private static final String FIELD_TAGS = "tags";
    private static final String FIELD_TRACE_ID = "tid";
    private static final String FIELD_TYPE = "type";
    private static final String MODULE = "SpanLog";
    private static final int TYPE_FINISH = 3;
    private static final int TYPE_LOG = 2;
    private static final int TYPE_START = 1;

    static {
        kge.a(488271854);
        kge.a(-470766481);
    }

    @Override // tb.myo
    public void startSpan(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf6febd", new Object[]{this, myrVar});
        } else {
            writeStart(myrVar);
        }
    }

    public void debugLog(myr myrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955965ac", new Object[]{this, myrVar, str});
        } else {
            writeLog(myrVar, str, LogLevel.D);
        }
    }

    @Override // tb.myo
    public void releaseLog(myr myrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc74da78", new Object[]{this, myrVar, str});
        } else {
            writeLog(myrVar, str, LogLevel.I);
        }
    }

    @Override // tb.myo
    public void finishSpan(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26944ee", new Object[]{this, myrVar});
        } else {
            writerFinish(myrVar);
        }
    }

    private static void writeStart(final myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba9a534", new Object[]{myrVar});
        } else {
            d.a().b(new Runnable() { // from class: com.taobao.tao.log.logger.-$$Lambda$SpanLogger$l-_chlAKin-x7ymAA6sdrB-DyPY
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writeStart$0(myr.this);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$writeStart$0(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88eff13d", new Object[]{myrVar});
            return;
        }
        try {
            write(myrVar, myrVar.toString(), LogLevel.I, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeLog(final myr myrVar, final String str, final LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d18016", new Object[]{myrVar, str, logLevel});
        } else if (logLevel == LogLevel.D && !f.a().q()) {
            String valueOf = String.valueOf(2);
            g.a(logLevel, LogCategory.SpanLog, MODULE, valueOf, str);
            TLog.toLogcat(logLevel, MODULE, valueOf, str);
        } else {
            d.a().b(new Runnable() { // from class: com.taobao.tao.log.logger.-$$Lambda$SpanLogger$Ltr1rlVfuFe9HpEXGwYncM2MmHQ
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writeLog$1(myr.this, str, logLevel);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$writeLog$1(myr myrVar, String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b006d8c", new Object[]{myrVar, str, logLevel});
            return;
        }
        try {
            write(myrVar, str, logLevel, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writerFinish(final myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989733d7", new Object[]{myrVar});
        } else {
            d.a().b(new Runnable() { // from class: com.taobao.tao.log.logger.-$$Lambda$SpanLogger$T3c1srKK6qUwOt3YFTG5g8QLWzQ
                @Override // java.lang.Runnable
                public final void run() {
                    SpanLogger.lambda$writerFinish$2(myr.this);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$writerFinish$2(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b193d4e2", new Object[]{myrVar});
            return;
        }
        try {
            write(myrVar, myrVar.toString(), LogLevel.I, 3);
            g.a(myrVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write(myr myrVar, String str, LogLevel logLevel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5137a7", new Object[]{myrVar, str, logLevel, new Integer(i)});
        } else {
            TLogNative.writeLog(LogCategory.SpanLog, logLevel, MODULE, String.valueOf(i), str);
        }
    }
}
