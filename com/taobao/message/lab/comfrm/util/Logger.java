package com.taobao.message.lab.comfrm.util;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.ag;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes7.dex */
public class Logger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PRE_TAG = "MSGFTL";

    static {
        kge.a(-2006606197);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            TLog.logd(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else {
            TLog.loge(str, (String) null, th);
        }
    }

    /* loaded from: classes7.dex */
    public static class FormatLog {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String DI = "|";
        private String ext;
        private String identifier;
        private String module;
        private String point;
        private int traceId;
        private int type;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes7.dex */
        public @interface LogType {
            public static final int TYPE_ERROR = 1;
            public static final int TYPE_SP = 2;
            public static final int TYPE_STEP = 0;
        }

        static {
            kge.a(1248153812);
        }

        public static /* synthetic */ String access$002(FormatLog formatLog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57c46c82", new Object[]{formatLog, str});
            }
            formatLog.module = str;
            return str;
        }

        public static /* synthetic */ String access$102(FormatLog formatLog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("800aacc3", new Object[]{formatLog, str});
            }
            formatLog.identifier = str;
            return str;
        }

        public static /* synthetic */ String access$202(FormatLog formatLog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a850ed04", new Object[]{formatLog, str});
            }
            formatLog.point = str;
            return str;
        }

        public static /* synthetic */ int access$302(FormatLog formatLog, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("20c843e5", new Object[]{formatLog, new Integer(i)})).intValue();
            }
            formatLog.type = i;
            return i;
        }

        public static /* synthetic */ int access$402(FormatLog formatLog, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("db3de466", new Object[]{formatLog, new Integer(i)})).intValue();
            }
            formatLog.traceId = i;
            return i;
        }

        public static /* synthetic */ String access$502(FormatLog formatLog, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2123adc7", new Object[]{formatLog, str});
            }
            formatLog.ext = str;
            return str;
        }

        /* loaded from: classes7.dex */
        public static class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String errorCode;
            private String errorMsg;
            private String ext;
            private String identifier;
            private String module;
            private String point;
            private int type = 0;
            private int traceId = -1;

            static {
                kge.a(1298666411);
            }

            public Builder identifier(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("d2f2ac60", new Object[]{this, str});
                }
                this.identifier = str;
                return this;
            }

            public Builder module(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("63695156", new Object[]{this, new Integer(i)});
                }
                this.module = String.valueOf(i);
                return this;
            }

            public Builder module(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1584363", new Object[]{this, str});
                }
                this.module = str;
                return this;
            }

            public Builder point(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("dc53a6b2", new Object[]{this, new Integer(i)});
                }
                this.point = String.valueOf(i);
                return this;
            }

            public Builder point(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("4e2fd187", new Object[]{this, str});
                }
                this.point = str;
                return this;
            }

            public Builder type(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("f65af248", new Object[]{this, new Integer(i)});
                }
                this.type = i;
                return this;
            }

            public Builder traceId(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("9303b502", new Object[]{this, new Integer(i)});
                }
                this.traceId = i;
                return this;
            }

            public Builder errMsg(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("92e890d3", new Object[]{this, str});
                }
                this.errorMsg = str;
                return this;
            }

            public Builder errCode(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("9f768869", new Object[]{this, str});
                }
                this.errorCode = str;
                return this;
            }

            public Builder ext(Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("3b168092", new Object[]{this, bundle});
                }
                if (bundle != null && bundle.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : bundle.keySet()) {
                        sb.append(str);
                        sb.append("=");
                        sb.append(bundle.get(str));
                        sb.append(";");
                    }
                    this.ext = sb.toString();
                }
                return this;
            }

            public Builder ext(String... strArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("85c8665d", new Object[]{this, strArr});
                }
                if (strArr != null && strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strArr.length; i += 2) {
                        sb.append(strArr[i]);
                        sb.append("=");
                        sb.append(strArr[i + 1]);
                        sb.append(";");
                    }
                    this.ext = sb.toString();
                }
                return this;
            }

            public FormatLog build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FormatLog) ipChange.ipc$dispatch("e8369e52", new Object[]{this});
                }
                FormatLog formatLog = new FormatLog();
                FormatLog.access$002(formatLog, this.module);
                FormatLog.access$102(formatLog, this.identifier);
                FormatLog.access$202(formatLog, this.point);
                FormatLog.access$302(formatLog, this.type);
                FormatLog.access$402(formatLog, this.traceId);
                if (!StringUtils.isEmpty(this.errorCode)) {
                    this.ext += ag.ARG_ERROR_CODE + this.errorCode + ";";
                }
                if (!StringUtils.isEmpty(this.errorMsg)) {
                    this.ext += "errorMsg=" + this.errorMsg + ";";
                }
                FormatLog.access$502(formatLog, this.ext);
                return formatLog;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            String str = this.identifier;
            String str2 = "-";
            if (str == null) {
                str = str2;
            }
            sb.append(str);
            sb.append("|");
            String str3 = this.module;
            if (str3 == null) {
                str3 = str2;
            }
            sb.append(str3);
            sb.append("|");
            String str4 = this.point;
            if (str4 == null) {
                str4 = str2;
            }
            sb.append(str4);
            sb.append("|");
            int i = this.type;
            sb.append(i == -1 ? str2 : Integer.valueOf(i));
            sb.append("|");
            int i2 = this.traceId;
            sb.append(i2 == -1 ? str2 : Integer.valueOf(i2));
            sb.append("|");
            String str5 = this.ext;
            if (str5 != null) {
                str2 = str5;
            }
            sb.append(str2);
            sb.append("|");
            return sb.toString();
        }
    }

    public static void ftl(FormatLog formatLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26436228", new Object[]{formatLog});
        } else {
            e(PRE_TAG, formatLog.toString());
        }
    }
}
