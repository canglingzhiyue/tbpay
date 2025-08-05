package com.alibaba.ability.impl.file;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    static {
        kge.a(-698597045);
        INSTANCE = new f();
    }

    private f() {
    }

    public final boolean a(String path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, path})).booleanValue();
        }
        q.d(path, "path");
        String str = path;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return kotlin.text.n.b(path, "../", false, 2, (Object) null) || kotlin.text.n.c(path, "/..", false, 2, (Object) null) || kotlin.text.n.b((CharSequence) str, (CharSequence) "/../", false, 2, (Object) null);
    }

    public final boolean c(String path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, path})).booleanValue();
        }
        q.d(path, "path");
        return Pattern.compile("^file://((?!\\.+)([^\\f\\n\\r\\t\\v/])+/?(?!//+))+$").matcher(path).matches();
    }

    public final boolean b(String absPath) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, absPath})).booleanValue();
        }
        q.d(absPath, "absPath");
        if (absPath.length() != 0) {
            z = false;
        }
        if (z) {
            return false;
        }
        File file = new File(absPath);
        if (kotlin.text.n.c(absPath, "/", false, 2, (Object) null) && file.isFile()) {
            return false;
        }
        return new File(absPath).exists();
    }

    public final String a(String path, String referPath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, path, referPath});
        }
        q.d(path, "path");
        q.d(referPath, "referPath");
        if (TextUtils.isEmpty(path)) {
            return path;
        }
        if (kotlin.text.n.c(path, "/", false, 2, (Object) null)) {
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = referPath;
            if (TextUtils.isEmpty(str)) {
                return path + file.getName();
            }
            String substring = referPath.substring(kotlin.text.n.b((CharSequence) str, "/", 0, false, 6, (Object) null) + 1);
            q.b(substring, "(this as java.lang.String).substring(startIndex)");
            if (TextUtils.isEmpty(substring)) {
                return path + file.getName();
            }
            return path + substring;
        }
        File parentFile = new File(path).getParentFile();
        if (parentFile.exists()) {
            return path;
        }
        parentFile.mkdirs();
        return path;
    }

    public final boolean b(String srcPath, String dstPath) {
        Object m2371constructorimpl;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, srcPath, dstPath})).booleanValue();
        }
        q.d(srcPath, "srcPath");
        q.d(dstPath, "dstPath");
        try {
            Result.a aVar = Result.Companion;
            file = new File(srcPath);
            if (!file.exists()) {
                file = null;
            }
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (file == null) {
            m2371constructorimpl = Result.m2371constructorimpl(null);
            Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        Throwable th2 = null;
        FileInputStream fileInputStream2 = fileInputStream;
        File file2 = new File(dstPath);
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        Throwable th3 = null;
        kotlin.io.a.a(fileInputStream2, fileOutputStream, 0, 2, null);
        kotlin.io.b.a(fileOutputStream, th3);
        kotlin.io.b.a(fileInputStream, th2);
        return true;
    }
}
