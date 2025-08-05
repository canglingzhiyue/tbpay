package com.taobao.themis.kernel.utils;

import android.content.Context;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.io.File;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/kernel/utils/TempFileHandler;", "", "mBizId", "", "mContext", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "clearExpired", "", "getTempDirPath", "localPathToTmpPath", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, "tmpPathToLocalPath", "tmpPath", "Companion", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String LOCAL_PATH_FLAG = "/themis/tmp";
    public static final String PATH_PREFIX = "https://tmp";
    private static final ConcurrentHashMap<String, r> c;

    /* renamed from: a  reason: collision with root package name */
    private final String f22574a;
    private final Context b;

    private r(String str, Context context) {
        Executor executor;
        this.f22574a = str;
        this.b = context;
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.IO)) == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: com.taobao.themis.kernel.utils.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    r.a(r.this);
                }
            }
        });
    }

    public /* synthetic */ r(String str, Context context, kotlin.jvm.internal.o oVar) {
        this(str, context);
    }

    public static final /* synthetic */ void a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39b70ff", new Object[]{rVar});
        } else {
            rVar.c();
        }
    }

    public static final /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ba6647dd", new Object[0]) : c;
    }

    public final String a(String tmpPath) {
        int length;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, tmpPath});
        }
        kotlin.jvm.internal.q.d(tmpPath, "tmpPath");
        TMSLogger.b("TempPathConversionUtils", "tmpPathToLocalPath，tmpPath: " + tmpPath + ", bizId: " + this.f22574a);
        if (!(tmpPath.length() == 0)) {
            if ((this.f22574a.length() == 0) || (length = tmpPath.length()) < 11) {
                return null;
            }
            if ((length == 11 && (!kotlin.jvm.internal.q.a((Object) tmpPath, (Object) PATH_PREFIX))) || !kotlin.text.n.b(tmpPath, PATH_PREFIX, false, 2, (Object) null)) {
                return null;
            }
            String a2 = a();
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
            File file = new File(a2);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (length == 11) {
                return a2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            String substring = tmpPath.substring(11);
            kotlin.jvm.internal.q.b(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            String sb2 = sb.toString();
            TMSLogger.b("TempPathConversionUtils", "tmp local path: " + sb2);
            return sb2;
        }
        return null;
    }

    public final String b(String localPath) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, localPath});
        }
        kotlin.jvm.internal.q.d(localPath, "localPath");
        TMSLogger.b("TempPathConversionUtils", "localPathToTmpPath, localPath: " + localPath + ", bizId: " + this.f22574a);
        if (!(localPath.length() == 0)) {
            if (!(this.f22574a.length() == 0)) {
                String a2 = a();
                String str = a2;
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (z || !kotlin.text.n.b(localPath, String.valueOf(a2), false, 2, (Object) null)) {
                    return null;
                }
                boolean a3 = kotlin.jvm.internal.q.a((Object) localPath, (Object) a2);
                String str2 = PATH_PREFIX;
                if (!a3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    String substring = localPath.substring(a2.length());
                    kotlin.jvm.internal.q.b(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    str2 = sb.toString();
                }
                TMSLogger.b("TempPathConversionUtils", "localPathToTmpPath, usrPath: " + str2);
                return str2;
            }
        }
        return null;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return e.b(this.b, "tmp/" + this.f22574a);
    }

    private final void c() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String a2 = a();
        String str = a2;
        if ((str == null || str.length() == 0) || !com.taobao.themis.utils.io.c.b(a2)) {
            return;
        }
        Stack stack = new Stack();
        stack.push(a2);
        long currentTimeMillis = System.currentTimeMillis();
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            kotlin.jvm.internal.q.a(pop);
            File file = new File((String) pop);
            if (currentTimeMillis - file.lastModified() > 604800000) {
                com.taobao.themis.utils.io.a.a(file);
            } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                if (!(listFiles.length == 0)) {
                    for (File child : listFiles) {
                        kotlin.jvm.internal.q.b(child, "child");
                        stack.push(child.getAbsolutePath());
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/kernel/utils/TempFileHandler$Companion;", "", "()V", "LOCAL_PATH_FLAG", "", "PATH_PREFIX", "PATH_ROOT_LENGTH", "", RPCDataItems.SWITCH_TAG_LOG, "instances", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/taobao/themis/kernel/utils/TempFileHandler;", "getInstance", "bizId", "context", "Landroid/content/Context;", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1740526920);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final r a(String bizId, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r) ipChange.ipc$dispatch("c9dae997", new Object[]{this, bizId, context});
            }
            kotlin.jvm.internal.q.d(bizId, "bizId");
            kotlin.jvm.internal.q.d(context, "context");
            if (!r.b().contains(bizId)) {
                r.b().put(bizId, new r(bizId, context, null));
            }
            Object obj = r.b().get(bizId);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.utils.TempFileHandler");
            }
            return (r) obj;
        }
    }

    static {
        kge.a(-213194240);
        Companion = new a(null);
        c = new ConcurrentHashMap<>();
    }
}
