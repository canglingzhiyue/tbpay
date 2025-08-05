package com.alibaba.alibity.container.file;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/alibaba/alibity/container/file/FileError;", "", "()V", "canNotRead", "Lcom/alibaba/ability/result/ErrorResult;", "msg", "", "canNotWrite", "digestError", "digestNonsupport", "directoryNotEmpty", "fileHasExits", "fileNotExist", "fileSizeExceedLimit", "isNotDirectory", "isNotFile", "nonsupportPath", "parentFileNotExist", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE = new b();

    private b() {
    }

    public static /* synthetic */ ErrorResult a(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("a58a420b", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "不支持的摘要算法";
        }
        return bVar.a(str);
    }

    public final ErrorResult a(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3f57d21a", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1016", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult b(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("7f540f4c", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件摘要计算失败";
        }
        return bVar.b(str);
    }

    public final ErrorResult b(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d39641b9", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1017", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult c(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("591ddc8d", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "上级目录不存在";
        }
        return bVar.c(str);
    }

    public final ErrorResult c(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("67d4b158", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1021", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult d(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("32e7a9ce", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件/目录不存在";
        }
        return bVar.d(str);
    }

    public final ErrorResult d(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("fc1320f7", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1022", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult e(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("cb1770f", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有读权限";
        }
        return bVar.e(str);
    }

    public final ErrorResult e(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("90519096", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1023", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult f(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("e67b4450", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有写权限";
        }
        return bVar.f(str);
    }

    public final ErrorResult f(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("24900035", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1024", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult g(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("c0451191", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径已存在文件/目录";
        }
        return bVar.g(str);
    }

    public final ErrorResult g(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("b8ce6fd4", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1025", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult h(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9a0eded2", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不为空";
        }
        return bVar.h(str);
    }

    public final ErrorResult h(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4d0cdf73", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1026", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult i(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("73d8ac13", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是文件";
        }
        return bVar.i(str);
    }

    public final ErrorResult i(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("e14b4f12", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1027", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult j(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4da27954", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是目录";
        }
        return bVar.j(str);
    }

    public final ErrorResult j(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("7589beb1", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1028", msg, (Map) null, 4, (o) null);
    }

    public static /* synthetic */ ErrorResult k(b bVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("276c4695", new Object[]{bVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "单个文件大小超限";
        }
        return bVar.k(str);
    }

    public final ErrorResult k(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9c82e50", new Object[]{this, msg});
        }
        q.d(msg, "msg");
        return new ErrorResult("1030", msg, (Map) null, 4, (o) null);
    }
}
