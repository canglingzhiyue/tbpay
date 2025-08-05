package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes2.dex */
public final class a$a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-403872800);
        Companion = new a(null);
    }

    @JvmStatic
    public static final ErrorResult a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("3f57d21a", new Object[]{str}) : Companion.a(str);
    }

    @JvmStatic
    public static final ErrorResult b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("d39641b9", new Object[]{str}) : Companion.b(str);
    }

    @JvmStatic
    public static final ErrorResult c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("67d4b158", new Object[]{str}) : Companion.f(str);
    }

    @JvmStatic
    public static final ErrorResult d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("fc1320f7", new Object[]{str}) : Companion.e(str);
    }

    @JvmStatic
    public static final ErrorResult e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("90519096", new Object[]{str}) : Companion.c(str);
    }

    @JvmStatic
    public static final ErrorResult f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("24900035", new Object[]{str}) : Companion.d(str);
    }

    @JvmStatic
    public static final ErrorResult g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorResult) ipChange.ipc$dispatch("b8ce6fd4", new Object[]{str}) : Companion.g(str);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-629541080);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final ErrorResult a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3f57d21a", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(405, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("d39641b9", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(500, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("67d4b158", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(403, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("24900035", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(199, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("fc1320f7", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(100, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("90519096", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(101, str, (Map) null, 4, (o) null);
        }

        @JvmStatic
        public final ErrorResult g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("b8ce6fd4", new Object[]{this, str});
            }
            if (str == null) {
                str = "";
            }
            return new ErrorResult(102, str, (Map) null, 4, (o) null);
        }
    }
}
