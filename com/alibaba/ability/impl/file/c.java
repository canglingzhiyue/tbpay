package com.alibaba.ability.impl.file;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(-713424222);
        INSTANCE = new c();
    }

    private c() {
    }

    public final ErrorResult a(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3f57d21a", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("ILLEGAL_PATH", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult a(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9f011157", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "不支持的摘要算法";
        }
        return cVar.b(str);
    }

    public final ErrorResult b(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d39641b9", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return a$a.Companion.b(msg);
    }

    public static /* synthetic */ ErrorResult b(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5aaa3f76", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件摘要计算失败";
        }
        return cVar.c(str);
    }

    public final ErrorResult c(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("67d4b158", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("DIGEST_COMPUTER_ERROR", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult c(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("16536d95", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "上级目录不存在";
        }
        return cVar.d(str);
    }

    public final ErrorResult d(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("fc1320f7", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("ILLEGAL_PATH", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult d(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d1fc9bb4", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件不存在";
        }
        return cVar.e(str);
    }

    public final ErrorResult e(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("90519096", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("FILE_NOT_EXIST", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult e(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("8da5c9d3", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不存在";
        }
        return cVar.f(str);
    }

    public final ErrorResult f(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("24900035", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("DIR_NOT_EXIST", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult f(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("494ef7f2", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有读权限";
        }
        return cVar.g(str);
    }

    public final ErrorResult g(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("b8ce6fd4", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("ILLEGAL_PATH", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult g(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4f82611", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有写权限";
        }
        return cVar.h(str);
    }

    public final ErrorResult h(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4d0cdf73", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("ILLEGAL_PATH", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult h(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("c0a15430", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径已存在文件/目录";
        }
        return cVar.i(str);
    }

    public final ErrorResult i(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("e14b4f12", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("ALREADY_EXIST", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult i(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("7c4a824f", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不为空";
        }
        return cVar.j(str);
    }

    public final ErrorResult j(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("7589beb1", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("DIR_NOT_EMPTY", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult j(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("37f3b06e", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是文件";
        }
        return cVar.k(str);
    }

    public final ErrorResult k(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9c82e50", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("NOT_FILE", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult k(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("f39cde8d", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是目录";
        }
        return cVar.l(str);
    }

    public final ErrorResult l(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9e069def", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("NOT_DIR", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult l(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("af460cac", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "单个文件大小超限";
        }
        return cVar.m(str);
    }

    public final ErrorResult m(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("32450d8e", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("SINGLE_FILE_OUT_OF_SPACE", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult m(c cVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("6aef3acb", new Object[]{cVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "存储空间已满";
        }
        return cVar.n(str);
    }

    public final ErrorResult n(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("c6837d2d", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("OUT_OF_SPACE", msg, (Map) null, 4, (o) null);
    }

    public final ErrorResult o(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5ac1eccc", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("NOT_ZIP_FILE", msg, (Map) null, 4, (o) null);
    }
}
