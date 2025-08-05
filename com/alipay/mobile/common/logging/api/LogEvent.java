package com.alipay.mobile.common.logging.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.RequestMethodConstants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogEvent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public Bundle bundle;
    public String category;
    public boolean hasSetMessage;
    public IRender iRender;
    public Level level;
    public String message;
    public String tag;
    public long timeStamp;
    public String uploadUrl;

    public LogEvent(String str, String str2, Level level, String str3) {
        this.hasSetMessage = false;
        this.category = str;
        this.tag = str2;
        this.level = level;
        this.message = str3;
        this.timeStamp = System.currentTimeMillis();
    }

    public LogEvent(String str, String str2, Level level, String str3, IRender iRender) {
        this.hasSetMessage = false;
        this.category = str;
        this.tag = str2;
        this.level = level;
        this.message = str3;
        this.iRender = iRender;
        this.timeStamp = System.currentTimeMillis();
    }

    public LogEvent() {
        this.hasSetMessage = false;
    }

    private void a() {
        IRender iRender;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.message != null || (iRender = this.iRender) == null || this.hasSetMessage) {
        } else {
            try {
                this.message = iRender.doRender();
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().warn("LogEvent", th);
            }
        }
    }

    public String getCategory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this}) : this.category;
    }

    public void setCategory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf6f611", new Object[]{this, str});
        } else {
            this.category = str;
        }
    }

    public Level getLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Level) ipChange.ipc$dispatch("7a3fdebd", new Object[]{this}) : this.level;
    }

    public void setLevel(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee63a0f", new Object[]{this, level});
        } else {
            this.level = level;
        }
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public long getTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue() : this.timeStamp;
    }

    public void setTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8ea8e9", new Object[]{this, new Long(j)});
        } else {
            this.timeStamp = j;
        }
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        a();
        return this.message;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
            return;
        }
        this.message = str;
        this.hasSetMessage = true;
    }

    public String getUploadUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19761501", new Object[]{this}) : this.uploadUrl;
    }

    public void setUploadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978a46fd", new Object[]{this, str});
        } else {
            this.uploadUrl = str;
        }
    }

    public Bundle getBundle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("673e5703", new Object[]{this}) : this.bundle;
    }

    public void setBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb69b0e9", new Object[]{this, bundle});
        } else {
            this.bundle = bundle;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        a();
        return this.message;
    }

    public boolean isIllegal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49a28977", new Object[]{this})).booleanValue() : TextUtils.isEmpty(getCategory()) || getLevel() == null;
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class Level implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ALL_INT = Integer.MIN_VALUE;
        public static final int DEBUG_INT = 10000;
        public static final int ERROR_INT = 40000;
        public static final int INFO_INT = 20000;
        public static final int OFF_INT = 5000;
        public static final int VERBOSE_INT = 5000;
        public static final int WARN_INT = 30000;
        private static final long serialVersionUID = -814092767334282137L;
        public int levelInt;
        public String levelStr;
        public int loggerLevel;
        public static final Level ERROR = new Level(40000, "E");
        public static final Level WARN = new Level(30000, "W");
        public static final Level INFO = new Level(20000, TLogTracker.LEVEL_INFO);
        public static final Level DEBUG = new Level(10000, TLogTracker.LEVEL_DEBUG);
        public static final Level VERBOSE = new Level(5000, "V");
        public static final Level OFF = new Level(5000, "OFF");
        public static final Level ALL = new Level(Integer.MIN_VALUE, "ALL");
        public static final Level LOGGER_HIGH = new Level(1);
        public static final Level LOGGER_MEDIUM = new Level(2);
        public static final Level LOGGER_LOW = new Level(3);

        public Level(int i) {
            this.loggerLevel = -1;
            this.loggerLevel = i;
        }

        private Level(int i, String str) {
            this.loggerLevel = -1;
            this.levelInt = i;
            this.levelStr = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.levelStr;
        }

        public int toInt() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1178e5ee", new Object[]{this})).intValue() : this.levelInt;
        }

        public boolean isGreaterOrEqual(Level level) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f866a1b4", new Object[]{this, level})).booleanValue() : this.levelInt >= level.levelInt;
        }

        public static Level toLevel(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Level) ipChange.ipc$dispatch("58d3c682", new Object[]{str}) : toLevel(str, DEBUG);
        }

        public static Level valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Level) ipChange.ipc$dispatch("79def521", new Object[]{str}) : toLevel(str, DEBUG);
        }

        public static Level toLevel(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Level) ipChange.ipc$dispatch("cbebdf9b", new Object[]{new Integer(i)}) : toLevel(i, DEBUG);
        }

        public static Level toLevel(int i, Level level) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Level) ipChange.ipc$dispatch("d618bc4d", new Object[]{new Integer(i), level});
            }
            if (i == 5000) {
                return VERBOSE;
            }
            if (i == 10000) {
                return DEBUG;
            }
            if (i == 20000) {
                return INFO;
            }
            if (i == 30000) {
                return WARN;
            }
            return i != 40000 ? level : ERROR;
        }

        public static Level toLevel(String str, Level level) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Level) ipChange.ipc$dispatch("4e23d7c6", new Object[]{str, level});
            }
            if (str == null) {
                return level;
            }
            if (str.equalsIgnoreCase("ALL")) {
                return ALL;
            }
            if (str.equalsIgnoreCase(RequestMethodConstants.TRACE_METHOD)) {
                return VERBOSE;
            }
            if (str.equalsIgnoreCase("DEBUG")) {
                return DEBUG;
            }
            if (str.equalsIgnoreCase("INFO")) {
                return INFO;
            }
            if (str.equalsIgnoreCase("WARN")) {
                return WARN;
            }
            if (str.equalsIgnoreCase("ERROR")) {
                return ERROR;
            }
            return str.equalsIgnoreCase("OFF") ? OFF : level;
        }
    }
}
