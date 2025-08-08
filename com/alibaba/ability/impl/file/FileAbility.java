package com.alibaba.ability.impl.file;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFileAbility;
import com.taobao.android.abilityidl.ability.FileCommonResult;
import com.taobao.android.abilityidl.ability.FileDirInfoResult;
import com.taobao.android.abilityidl.ability.FileItem;
import com.taobao.android.abilityidl.ability.FileReadAsStringResult;
import com.taobao.android.abilityidl.ability.FileRenameFileResult;
import com.taobao.android.abilityidl.ability.FileUnzipResult;
import com.taobao.android.abilityidl.ability.an;
import com.taobao.android.abilityidl.ability.ao;
import com.taobao.android.abilityidl.ability.aq;
import com.taobao.android.abilityidl.ability.ar;
import com.taobao.android.abilityidl.ability.at;
import com.taobao.android.abilityidl.ability.au;
import com.taobao.android.abilityidl.ability.av;
import com.taobao.android.abilityidl.ability.bp;
import com.taobao.android.abilityidl.ability.bq;
import com.taobao.android.abilityidl.ability.bs;
import com.taobao.android.abilityidl.ability.bt;
import com.taobao.android.abilityidl.ability.bu;
import com.taobao.tao.log.TLog;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.amg;
import tb.fxb;
import tb.kge;

/* loaded from: classes2.dex */
public final class FileAbility extends AbsFileAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final long MAX_DIR_SIZE = 52428800;
    public static final long MAX_FILE_SIZE = 10485760;

    static {
        kge.a(1872570180);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(FileAbility fileAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void appendFile(als context, av params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8567cc", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8793a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        String str2 = params.f8793a;
        q.b(str2, "params.path");
        if (kotlin.text.n.c(str2, "/", false, 2, (Object) null)) {
            callback.a(c.INSTANCE.k("指定的 path 路径不能以 / 结尾"));
            return;
        }
        i iVar2 = i.INSTANCE;
        String str3 = params.f8793a;
        q.b(str3, "params.path");
        String a3 = iVar2.a(f, d, str3);
        String str4 = params.b;
        String str5 = params.c;
        q.b(str5, "params.encoding");
        ExecuteResult a4 = a(context, a3, str4, null, str5, true);
        if (a4 instanceof ErrorResult) {
            callback.a((ErrorResult) a4);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = true;
        t tVar = t.INSTANCE;
        callback.a(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void copyFile(als context, ao params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e01e3f4e", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8786a;
        q.b(str, "params.src");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.b;
        q.b(str2, "params.dest");
        ErrorResult a3 = iVar2.a(str2);
        if (a3 != null) {
            callback.a(a3);
            return;
        }
        i iVar3 = i.INSTANCE;
        String str3 = params.f8786a;
        q.b(str3, "params.src");
        String a4 = iVar3.a(f, d, str3);
        i iVar4 = i.INSTANCE;
        String str4 = params.b;
        q.b(str4, "params.dest");
        String a5 = iVar4.a(f, d, str4);
        File file = new File(a4);
        if (!file.exists()) {
            callback.a(c.INSTANCE.e("指定的 srcPath 文件不存在"));
        } else if (file.isDirectory()) {
            callback.a(c.INSTANCE.k("指定的 srcPath 是一个已经存在的目录"));
        } else if (!file.canRead()) {
            callback.a(c.INSTANCE.g("指定的 srcPath 路径没有读权限"));
        } else {
            File file2 = new File(a5);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    file2 = new File(a5 + "/" + file.getName());
                } else {
                    callback.a(c.INSTANCE.i("指定的 destPath 路径已经存在"));
                    return;
                }
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            long b = d.b(file);
            Context f2 = context.f().f();
            q.a(f2);
            com.alibaba.ability.impl.file.a a6 = b.a(f2, context.f().d());
            Map<String, Object> e = context.e();
            Object obj = e != null ? e.get("maxDirSize") : null;
            if (!(obj instanceof Long)) {
                obj = null;
            }
            Long l = (Long) obj;
            if (l != null) {
                a6.c(l.longValue());
            }
            if (!a6.b(b)) {
                callback.a(c.m(c.INSTANCE, null, 1, null));
                return;
            }
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            k.INSTANCE.a(a4);
            k.INSTANCE.b(a5);
            byte[] a7 = h.INSTANCE.a(2048);
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        while (true) {
                            try {
                                int read = fileInputStream2.read(a7);
                                if (read > 0) {
                                    fileOutputStream2.write(a7, 0, read);
                                } else {
                                    FileCommonResult fileCommonResult = new FileCommonResult();
                                    fileCommonResult.succeed = true;
                                    t tVar = t.INSTANCE;
                                    callback.a(fileCommonResult);
                                    k.INSTANCE.c(a4);
                                    k.INSTANCE.c(a4);
                                    h.INSTANCE.a(a7);
                                    h.INSTANCE.a((Closeable) fileInputStream2);
                                    h.INSTANCE.a(fileOutputStream2);
                                    return;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream2;
                                fileInputStream = fileInputStream2;
                                a6.a(-b);
                                callback.a(new ErrorResult(String.valueOf(1000), "未知错误: " + e.getMessage(), (Map) null, 4, (o) null));
                                k.INSTANCE.c(a4);
                                k.INSTANCE.c(a4);
                                h.INSTANCE.a(a7);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                h.INSTANCE.a(fileOutputStream);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                fileInputStream = fileInputStream2;
                                k.INSTANCE.c(a4);
                                k.INSTANCE.c(a4);
                                h.INSTANCE.a(a7);
                                h.INSTANCE.a((Closeable) fileInputStream);
                                h.INSTANCE.a(fileOutputStream);
                                throw th;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void exists(als context, an params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39258b7a", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8785a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.f8785a;
        q.b(str2, "params.path");
        String a3 = iVar2.a(f, d, str2);
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = Boolean.valueOf(f.INSTANCE.b(a3));
        t tVar = t.INSTANCE;
        callback.a(fileCommonResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void getDirInfo(als context, an params, bq callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b086a22", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8785a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.f8785a;
        q.b(str2, "params.path");
        File file = new File(iVar2.a(f, d, str2));
        if (!file.exists()) {
            callback.a(c.e(c.INSTANCE, null, 1, null));
        } else if (!file.isDirectory()) {
            callback.a(c.k(c.INSTANCE, null, 1, null));
        } else if (!file.canRead()) {
            callback.a(c.f(c.INSTANCE, null, 1, null));
        } else {
            ArrayList arrayList = new ArrayList();
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    q.b(file2, "file");
                    m a3 = l.a(file2.getPath());
                    FileItem fileItem = new FileItem();
                    fileItem.size = Double.valueOf(a3.h);
                    fileItem.name = file2.getName();
                    fileItem.modifyTime = Double.valueOf(a3.j);
                    fileItem.accessTime = Double.valueOf(a3.i);
                    fileItem.type = file2.isFile() ? "FILE" : "DIR";
                    t tVar = t.INSTANCE;
                    arrayList.add(fileItem);
                }
            }
            FileDirInfoResult fileDirInfoResult = new FileDirInfoResult();
            fileDirInfoResult.files = arrayList;
            t tVar2 = t.INSTANCE;
            callback.a(fileDirInfoResult);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getFileInfo(tb.als r8, com.taobao.android.abilityidl.ability.ap r9, com.taobao.android.abilityidl.ability.br r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.FileAbility.getFileInfo(tb.als, com.taobao.android.abilityidl.ability.ap, com.taobao.android.abilityidl.ability.br):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void makeDir(als context, aq params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfb73ba", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8788a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.f8788a;
        q.b(str2, "params.path");
        File file = new File(iVar2.a(f, d, str2));
        if (file.exists()) {
            callback.a(c.h(c.INSTANCE, null, 1, null));
        } else if (params.b) {
            try {
                if (file.mkdirs()) {
                    FileCommonResult fileCommonResult = new FileCommonResult();
                    fileCommonResult.succeed = true;
                    t tVar = t.INSTANCE;
                    callback.a(fileCommonResult);
                    return;
                }
                new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (o) null);
            } catch (Throwable th) {
                callback.a(new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (o) null));
                TLog.loge(amg.MODULE_NAME, "FileAbility", "mkdir error", th);
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                callback.a(c.c(c.INSTANCE, null, 1, null));
                return;
            }
            File parentFile2 = file.getParentFile();
            if (parentFile2 == null || !parentFile2.canWrite()) {
                callback.a(c.g(c.INSTANCE, null, 1, null));
                return;
            }
            try {
                if (file.mkdir()) {
                    FileCommonResult fileCommonResult2 = new FileCommonResult();
                    fileCommonResult2.succeed = true;
                    t tVar2 = t.INSTANCE;
                    callback.a(fileCommonResult2);
                    return;
                }
                new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (o) null);
            } catch (Throwable th2) {
                callback.a(new ErrorResult(String.valueOf(1000), "未知错误，文件夹创建失败", (Map) null, 4, (o) null));
                TLog.loge(amg.MODULE_NAME, "FileAbility", "mkdir error", th2);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void readAsString(als context, ar params, bs callback) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d74150", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8789a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.f8789a;
        q.b(str2, "params.path");
        String a3 = iVar2.a(f, d, str2);
        File file = new File(a3);
        if (!file.exists()) {
            callback.a(c.d(c.INSTANCE, null, 1, null));
        } else if (file.isDirectory()) {
            callback.a(c.j(c.INSTANCE, null, 1, null));
        } else if (!file.canRead()) {
            callback.a(c.f(c.INSTANCE, null, 1, null));
        } else {
            FileInputStream fileInputStream2 = null;
            k.INSTANCE.a(a3);
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] a4 = h.INSTANCE.a((InputStream) fileInputStream);
                        if (a4 == null) {
                            callback.a(new ErrorResult(String.valueOf(1000), "未知错误", (Map) null, 4, (o) null));
                            k.INSTANCE.c(a3);
                            h.INSTANCE.a((Closeable) fileInputStream);
                            return;
                        }
                        String str3 = params.b;
                        int hashCode = str3.hashCode();
                        if (hashCode == 71419) {
                            if (str3.equals("HEX")) {
                                String a5 = g.INSTANCE.a(a4);
                                FileReadAsStringResult fileReadAsStringResult = new FileReadAsStringResult();
                                fileReadAsStringResult.data = a5;
                                t tVar = t.INSTANCE;
                                callback.a(fileReadAsStringResult);
                                k.INSTANCE.c(a3);
                                h.INSTANCE.a((Closeable) fileInputStream);
                            }
                            String str4 = params.b;
                            q.b(str4, "params.encoding");
                            Charset forName = Charset.forName(a(str4));
                            q.b(forName, "Charset.forName(convertEncoding(params.encoding))");
                            String str5 = new String(a4, forName);
                            FileReadAsStringResult fileReadAsStringResult2 = new FileReadAsStringResult();
                            fileReadAsStringResult2.data = str5;
                            t tVar2 = t.INSTANCE;
                            callback.a(fileReadAsStringResult2);
                            k.INSTANCE.c(a3);
                            h.INSTANCE.a((Closeable) fileInputStream);
                        } else if (hashCode != 1952093519) {
                            if (hashCode == 1959329793 && str3.equals("BINARY")) {
                                String str6 = new String(a4, kotlin.text.d.UTF_8);
                                FileReadAsStringResult fileReadAsStringResult3 = new FileReadAsStringResult();
                                fileReadAsStringResult3.data = str6;
                                t tVar3 = t.INSTANCE;
                                callback.a(fileReadAsStringResult3);
                                k.INSTANCE.c(a3);
                                h.INSTANCE.a((Closeable) fileInputStream);
                            }
                            String str42 = params.b;
                            q.b(str42, "params.encoding");
                            Charset forName2 = Charset.forName(a(str42));
                            q.b(forName2, "Charset.forName(convertEncoding(params.encoding))");
                            String str52 = new String(a4, forName2);
                            FileReadAsStringResult fileReadAsStringResult22 = new FileReadAsStringResult();
                            fileReadAsStringResult22.data = str52;
                            t tVar22 = t.INSTANCE;
                            callback.a(fileReadAsStringResult22);
                            k.INSTANCE.c(a3);
                            h.INSTANCE.a((Closeable) fileInputStream);
                        } else {
                            if (str3.equals("BASE64")) {
                                String encodeToString = Base64.encodeToString(a4, 2);
                                if (encodeToString == null) {
                                    callback.a(new ErrorResult(String.valueOf(1000), "未知错误", (Map) null, 4, (o) null));
                                    k.INSTANCE.c(a3);
                                    h.INSTANCE.a((Closeable) fileInputStream);
                                    return;
                                }
                                FileReadAsStringResult fileReadAsStringResult4 = new FileReadAsStringResult();
                                fileReadAsStringResult4.data = encodeToString;
                                t tVar4 = t.INSTANCE;
                                callback.a(fileReadAsStringResult4);
                                k.INSTANCE.c(a3);
                                h.INSTANCE.a((Closeable) fileInputStream);
                            }
                            String str422 = params.b;
                            q.b(str422, "params.encoding");
                            Charset forName22 = Charset.forName(a(str422));
                            q.b(forName22, "Charset.forName(convertEncoding(params.encoding))");
                            String str522 = new String(a4, forName22);
                            FileReadAsStringResult fileReadAsStringResult222 = new FileReadAsStringResult();
                            fileReadAsStringResult222.data = str522;
                            t tVar222 = t.INSTANCE;
                            callback.a(fileReadAsStringResult222);
                            k.INSTANCE.c(a3);
                            h.INSTANCE.a((Closeable) fileInputStream);
                        }
                    } catch (Exception e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        callback.a(new ErrorResult(String.valueOf(1000), "未知错误", (Map) null, 4, (o) null));
                        e.printStackTrace();
                        k.INSTANCE.c(a3);
                        h.INSTANCE.a((Closeable) fileInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        k.INSTANCE.c(a3);
                        h.INSTANCE.a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if ((r10.length == 0) != false) goto L50;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeDir(tb.als r9, com.taobao.android.abilityidl.ability.as r10, com.taobao.android.abilityidl.ability.bp r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.FileAbility.removeDir(tb.als, com.taobao.android.abilityidl.ability.as, com.taobao.android.abilityidl.ability.bp):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void removeFile(als context, an params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f3e73e", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8785a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.f8785a;
        q.b(str2, "params.path");
        File file = new File(iVar2.a(f, d, str2));
        if (!file.exists()) {
            callback.a(c.d(c.INSTANCE, null, 1, null));
        } else if (file.isDirectory()) {
            callback.a(c.j(c.INSTANCE, null, 1, null));
        } else if (!file.canWrite()) {
            callback.a(c.g(c.INSTANCE, null, 1, null));
        } else {
            Context f2 = context.f().f();
            q.a(f2);
            com.alibaba.ability.impl.file.a a3 = b.a(f2, context.f().d());
            if (d.a(file)) {
                a3.a(-d.b(file));
                FileCommonResult fileCommonResult = new FileCommonResult();
                fileCommonResult.succeed = true;
                t tVar = t.INSTANCE;
                callback.a(fileCommonResult);
                return;
            }
            callback.a(new ErrorResult(String.valueOf(1000), "未知错误，文件删除失败", (Map) null, 4, (o) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void rename(als context, at params, bt callback) {
        boolean renameTo;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863dd992", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8791a;
        q.b(str, "params.src");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str2 = params.b;
        q.b(str2, "params.dest");
        ErrorResult a3 = iVar2.a(str2);
        if (a3 != null) {
            callback.a(a3);
            return;
        }
        i iVar3 = i.INSTANCE;
        String str3 = params.f8791a;
        q.b(str3, "params.src");
        String a4 = iVar3.a(f, d, str3);
        i iVar4 = i.INSTANCE;
        String str4 = params.b;
        q.b(str4, "params.dest");
        String a5 = iVar4.a(f, d, str4);
        File file = new File(a4);
        if (!file.exists()) {
            callback.a(c.INSTANCE.e("指定的 src 文件不存在"));
        } else if (!file.canWrite()) {
            callback.a(c.INSTANCE.g("指定的 src 路径没有写权限"));
        } else {
            File file2 = new File(a5);
            if (file2.exists() && file2.isFile()) {
                callback.a(c.INSTANCE.i("指定路径已存在文件"));
                return;
            }
            File file3 = new File(f.INSTANCE.a(a5, a4));
            if (!file3.exists()) {
                if (file.renameTo(file3)) {
                    FileRenameFileResult fileRenameFileResult = new FileRenameFileResult();
                    fileRenameFileResult.savedFilePath = params.b;
                    t tVar = t.INSTANCE;
                    callback.a(fileRenameFileResult);
                    return;
                }
                callback.a(new ErrorResult(String.valueOf(1000), "未知错误，文件重命名失败", (Map) null, 4, (o) null));
                return;
            }
            if (file3.isDirectory()) {
                File parentFile2 = file3.getParentFile();
                if ((parentFile2 == null || !parentFile2.exists()) && ((parentFile = file3.getParentFile()) == null || !parentFile.mkdirs())) {
                    callback.a(c.INSTANCE.h("指定的 destPath 路径没有写权限"));
                    return;
                }
                renameTo = file.renameTo(new File(file3.getAbsolutePath() + fxb.DIR + file.getName()));
            } else if (file.isDirectory()) {
                callback.a(c.INSTANCE.k("src为目录时，destPath 必须为目录"));
                return;
            } else {
                renameTo = file.renameTo(file3);
            }
            if (renameTo) {
                FileRenameFileResult fileRenameFileResult2 = new FileRenameFileResult();
                fileRenameFileResult2.savedFilePath = params.b;
                t tVar2 = t.INSTANCE;
                callback.a(fileRenameFileResult2);
                return;
            }
            callback.a(new ErrorResult(String.valueOf(1000), "未知错误，文件重命名失败", (Map) null, 4, (o) null));
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.zip.ZipInputStream, T] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.zip.ZipInputStream, T] */
    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void unzip(als context, au params, bu callback) {
        String str;
        String str2;
        com.alibaba.ability.impl.file.a aVar;
        String str3;
        FileOutputStream fileOutputStream;
        String str4 = "未知错误: ";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cfc23a", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str5 = params.f8792a;
        q.b(str5, "params.zipFilePath");
        ErrorResult a2 = iVar.a(str5);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        i iVar2 = i.INSTANCE;
        String str6 = params.b;
        q.b(str6, "params.targetPath");
        ErrorResult a3 = iVar2.a(str6);
        if (a3 != null) {
            callback.a(a3);
            return;
        }
        i iVar3 = i.INSTANCE;
        String str7 = params.f8792a;
        q.b(str7, "params.zipFilePath");
        String a4 = iVar3.a(f, d, str7);
        i iVar4 = i.INSTANCE;
        String str8 = params.b;
        q.b(str8, "params.targetPath");
        String a5 = iVar4.a(f, d, str8);
        File file = new File(a4);
        if (!file.exists()) {
            callback.a(c.INSTANCE.e("源文件不存在 " + a4));
        } else if (file.isDirectory()) {
            callback.a(c.INSTANCE.o("源文件是一个目录 " + a4));
        } else if (!file.canRead()) {
            callback.a(c.INSTANCE.g("源文件没有读权限 " + a4));
        } else {
            File file2 = new File(a5);
            if (file2.exists()) {
                if (!file2.canWrite()) {
                    callback.a(c.INSTANCE.h("指定目标文件路径没有写权限 " + a5));
                    return;
                }
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            Context f2 = context.f().f();
            q.a(f2);
            com.alibaba.ability.impl.file.a a6 = b.a(f2, context.f().d());
            try {
                n a7 = n.Companion.a(a4);
                if (!a7.a()) {
                    callback.a(a$a.Companion.b("源文件不是zip类型"));
                } else if (a7.d()) {
                    callback.a(a$a.Companion.b("file path contains relative parent path"));
                } else {
                    if (a7.c() <= MAX_FILE_SIZE && a7.b() <= MAX_FILE_SIZE) {
                        long b = a7.b();
                        if (!a6.b(a7.b())) {
                            callback.a(c.INSTANCE.n("文件夹超限"));
                            return;
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = (ZipInputStream) 0;
                        byte[] a8 = h.INSTANCE.a(2048);
                        if (!kotlin.text.n.c(a5, "/", false, 2, (Object) null)) {
                            a5 = a5 + fxb.DIR;
                        }
                        try {
                            objectRef.element = new ZipInputStream(new BufferedInputStream(new FileInputStream(a4)));
                            Iterator a9 = kotlin.sequences.g.a(new FileAbility$unzip$3(objectRef)).a();
                            while (a9.hasNext()) {
                                ZipEntry zipEntry = (ZipEntry) a9.next();
                                String name = zipEntry.getName();
                                q.b(name, "zipEntry.name");
                                if (!StringUtils.isEmpty(name)) {
                                    Iterator it = a9;
                                    str2 = str4;
                                    try {
                                        if (kotlin.text.n.b(name, "../", false, 2, (Object) null) || kotlin.text.n.c(name, "/..", false, 2, (Object) null)) {
                                            aVar = a6;
                                        } else {
                                            aVar = a6;
                                            try {
                                                if (!kotlin.text.n.b((CharSequence) name, (CharSequence) "/../", false, 2, (Object) null)) {
                                                    File file3 = new File(a5 + name);
                                                    if (zipEntry.isDirectory()) {
                                                        file3.mkdirs();
                                                    } else {
                                                        File parentFile2 = file3.getParentFile();
                                                        if (parentFile2 == null) {
                                                            throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                                                        }
                                                        if (!parentFile2.exists()) {
                                                            parentFile2.mkdirs();
                                                        }
                                                        FileOutputStream fileOutputStream2 = null;
                                                        try {
                                                            fileOutputStream = new FileOutputStream(file3);
                                                            while (true) {
                                                                try {
                                                                    int read = ((ZipInputStream) objectRef.element).read(a8);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    fileOutputStream.write(a8, 0, read);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    h.INSTANCE.a(fileOutputStream);
                                                                    throw th;
                                                                }
                                                            }
                                                            h.INSTANCE.a(fileOutputStream);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            fileOutputStream = fileOutputStream2;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    th.printStackTrace();
                                                    aVar.a(-b);
                                                    callback.a(new ErrorResult(String.valueOf(1000), str2 + th.getMessage(), (Map) null, 4, (o) null));
                                                    return;
                                                } finally {
                                                    h.INSTANCE.a(a8);
                                                    h.INSTANCE.a((Closeable) ((ZipInputStream) objectRef.element));
                                                }
                                            }
                                        }
                                        a9 = it;
                                        str4 = str2;
                                        a6 = aVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        aVar = a6;
                                        th.printStackTrace();
                                        aVar.a(-b);
                                        callback.a(new ErrorResult(String.valueOf(1000), str2 + th.getMessage(), (Map) null, 4, (o) null));
                                        return;
                                    }
                                }
                            }
                            FileUnzipResult fileUnzipResult = new FileUnzipResult();
                            String str9 = params.b;
                            q.b(str9, "params.targetPath");
                            if (kotlin.text.n.c(str9, "/", false, 2, (Object) null)) {
                                String str10 = params.b;
                                q.b(str10, "params.targetPath");
                                int length = params.b.length() - 1;
                                if (str10 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                str3 = str10.substring(0, length);
                                q.b(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                str3 = params.b;
                            }
                            fileUnzipResult.path = str3;
                            t tVar = t.INSTANCE;
                            callback.a(fileUnzipResult);
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            str2 = str4;
                        }
                    }
                    str = str4;
                    try {
                        callback.a(c.INSTANCE.m("单个文件超限"));
                    } catch (Throwable th6) {
                        th = th6;
                        callback.a(new ErrorResult(String.valueOf(1000), str + th.getMessage(), (Map) null, 4, (o) null));
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = str4;
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFileAbility
    public void writeFile(als context, av params, bp callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb00a11", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String d = context.f().d();
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
            return;
        }
        i iVar = i.INSTANCE;
        String str = params.f8793a;
        q.b(str, "params.path");
        ErrorResult a2 = iVar.a(str);
        if (a2 != null) {
            callback.a(a2);
            return;
        }
        String str2 = params.f8793a;
        q.b(str2, "params.path");
        if (kotlin.text.n.c(str2, "/", false, 2, (Object) null)) {
            callback.a(c.INSTANCE.k("指定的 path 路径不能以 / 结尾"));
            return;
        }
        i iVar2 = i.INSTANCE;
        String str3 = params.f8793a;
        q.b(str3, "params.path");
        String a3 = iVar2.a(f, d, str3);
        String str4 = params.b;
        String str5 = params.c;
        q.b(str5, "params.encoding");
        ExecuteResult a4 = a(context, a3, str4, null, str5, false);
        if (a4 instanceof ErrorResult) {
            callback.a((ErrorResult) a4);
            return;
        }
        FileCommonResult fileCommonResult = new FileCommonResult();
        fileCommonResult.succeed = true;
        t tVar = t.INSTANCE;
        callback.a(fileCommonResult);
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        switch (str.hashCode()) {
            case -2056547891:
                if (str.equals("LATIN1")) {
                    return "latin1";
                }
                break;
            case 71419:
                if (str.equals("HEX")) {
                    return "hex";
                }
                break;
            case 2614125:
                if (str.equals("USC2")) {
                    return "ucs-2";
                }
                break;
            case 2615185:
                if (str.equals("UTF8")) {
                    return "utf-8";
                }
                break;
            case 62568241:
                if (str.equals("ASCII")) {
                    return "ascii";
                }
                break;
            case 81070572:
                if (str.equals("UTF16")) {
                    return "utf-16";
                }
                break;
            case 1952093519:
                if (str.equals("BASE64")) {
                    return "base64";
                }
                break;
        }
        return "utf-8";
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167 A[Catch: Exception -> 0x027d, TryCatch #1 {Exception -> 0x027d, blocks: (B:60:0x00e7, B:63:0x00f2, B:67:0x0107, B:70:0x0111, B:72:0x0115, B:74:0x011e, B:75:0x0123, B:77:0x0126, B:79:0x012e, B:80:0x0134, B:83:0x013e, B:84:0x0143, B:87:0x014e, B:89:0x0156, B:90:0x015d, B:92:0x0167, B:94:0x016e, B:95:0x0176, B:96:0x017b, B:140:0x0277, B:141:0x027c), top: B:149:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.alibaba.ability.result.ExecuteResult a(tb.als r24, java.lang.String r25, java.lang.String r26, java.nio.ByteBuffer r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.FileAbility.a(tb.als, java.lang.String, java.lang.String, java.nio.ByteBuffer, java.lang.String, boolean):com.alibaba.ability.result.ExecuteResult");
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(820497804);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
