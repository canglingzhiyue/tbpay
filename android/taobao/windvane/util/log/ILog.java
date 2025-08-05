package android.taobao.windvane.util.log;

import com.taobao.search.sf.util.tlog.TLogTracker;

/* loaded from: classes.dex */
public interface ILog {

    /* loaded from: classes.dex */
    public enum LogLevelEnum {
        VERBOSE(0, "V"),
        DEBUG(1, TLogTracker.LEVEL_DEBUG),
        INFO(2, TLogTracker.LEVEL_INFO),
        WARNING(3, "W"),
        ERROR(4, "E");
        
        private int LogLevel;
        private String LogLevelName;

        LogLevelEnum(int i, String str) {
            this.LogLevelName = str;
            this.LogLevel = i;
        }

        public int getLogLevel() {
            return this.LogLevel;
        }

        public String getLogLevelName() {
            return this.LogLevelName;
        }
    }

    void d(String str, String str2);

    void d(String str, String str2, Throwable th);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void i(String str, String str2);

    void i(String str, String str2, Throwable th);

    void v(String str, String str2);

    void v(String str, String str2, Throwable th);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);
}
