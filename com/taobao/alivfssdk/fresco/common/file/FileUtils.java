package com.taobao.alivfssdk.fresco.common.file;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.common.internal.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import tb.kge;

/* loaded from: classes4.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class FileDeleteException extends IOException {
        static {
            kge.a(-1477070738);
        }

        public FileDeleteException(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    public static class ParentDirNotFoundException extends FileNotFoundException {
        static {
            kge.a(-580215305);
        }

        public ParentDirNotFoundException(String str) {
            super(str);
        }
    }

    static {
        kge.a(480765546);
    }

    public static void a(File file) throws CreateDirectoryException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new CreateDirectoryException(file.getAbsolutePath(), new FileDeleteException(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static void a(File file, File file2) throws RenameException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{file, file2});
            return;
        }
        c.a(file);
        c.a(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th = null;
        if (file2.exists()) {
            th = new FileDeleteException(file2.getAbsolutePath());
        } else if (!file.getParentFile().exists()) {
            th = new ParentDirNotFoundException(file.getAbsolutePath());
        } else if (!file.exists()) {
            th = new FileNotFoundException(file.getAbsolutePath());
        }
        throw new RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
    }

    /* loaded from: classes4.dex */
    public static class CreateDirectoryException extends IOException {
        static {
            kge.a(-1294037096);
        }

        public CreateDirectoryException(String str) {
            super(str);
        }

        public CreateDirectoryException(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* loaded from: classes4.dex */
    public static class RenameException extends IOException {
        static {
            kge.a(-1938441129);
        }

        public RenameException(String str) {
            super(str);
        }

        public RenameException(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }
}
