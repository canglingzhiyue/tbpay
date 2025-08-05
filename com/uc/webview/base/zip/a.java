package com.uc.webview.base.zip;

import android.content.Context;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.b;
import com.uc.webview.base.io.c;
import com.uc.webview.base.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import tb.riy;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f23813a = Collections.synchronizedSet(new HashSet());
    public final Context b;
    public final File c;
    public final File d;
    public final c e;
    public final b f;
    public final boolean g = GlobalSettings.getBoolValue(73);

    /* renamed from: com.uc.webview.base.zip.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public class C1039a {
        private File b;
        private File c;

        public C1039a(File file, File file2) {
            this.b = file;
            this.c = file2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
        /* JADX WARN: Type inference failed for: r11v3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a() {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.base.zip.a.C1039a.a():boolean");
        }
    }

    public a(Context context, File file, File file2) {
        this.b = context;
        this.c = file;
        this.d = file2;
        this.e = PathUtils.a(this.d);
        this.f = PathUtils.a(context, "UnZipper");
    }

    public static void a(File file, File file2) {
        StringBuilder sb;
        if (file.equals(file2)) {
            return;
        }
        try {
            if (file.listFiles() == null) {
                ErrorCode.DECOMPRESS_FINISH_BUT_NO_FILES.report();
            }
            if (file2.exists()) {
                d.a("UnZipper", file2, false, (ArrayList<File>) null);
            }
            if (file2.exists()) {
                File file3 = new File(file2.getAbsolutePath() + "-td");
                File file4 = file3;
                int i = 0;
                while (file4.exists() && (i = i + 1) < 5) {
                    file4 = new File(file3 + String.valueOf(i));
                }
                boolean renameTo = file2.renameTo(file4);
                d.a(new StringBuilder(), file4);
                Log.d("UnZipper", "moveFiles target exception " + renameTo + " {" + sb.toString() + "\n}");
            }
            String str = "moveFiles [" + file.getAbsolutePath() + "] to [" + file2.getAbsolutePath() + riy.ARRAY_END_STR;
            if (file.renameTo(file2)) {
                Log.i("UnZipper", str);
            } else {
                Log.e("UnZipper", "failed ".concat(String.valueOf(str)));
                ErrorCode.DECOMPRESS_RENAME_FAILED.report();
            }
        } finally {
            d.a("UnZipper", file);
        }
    }

    public static boolean a(File file) {
        return file != null && file.isDirectory() && f23813a.contains(file.getAbsolutePath());
    }
}
