package com.airbnb.lottie.network;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.akh;
import tb.riy;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final b f1782a;

    public d(b bVar) {
        this.f1782a = bVar;
    }

    private File a() {
        File a2 = this.f1782a.a();
        if (a2.isFile()) {
            a2.delete();
        }
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    private static String a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return sb.toString();
    }

    private File b(String str) throws FileNotFoundException {
        File file = new File(a(), a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(a(), a(str, FileExtension.ZIP, false));
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Pair<FileExtension, InputStream> a(String str) {
        try {
            File b = b(str);
            if (b == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(b);
            FileExtension fileExtension = b.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : FileExtension.JSON;
            akh.c("NetworkCache hit for " + str + " at " + b.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(a(), a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, FileExtension fileExtension) {
        File file = new File(a(), a(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        akh.a("Copying temp file to real file (" + file2 + riy.BRACKET_END_STR);
        if (!renameTo) {
            akh.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }
}
