package com.meizu.cloud.pushsdk.d;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f7877a = new SimpleDateFormat("yyyy-MM-dd");
    private final d b = new d("lo");
    private BufferedWriter c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(".log.txt");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Comparator<File> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }

    public void a() throws IOException {
        BufferedWriter bufferedWriter = this.c;
        if (bufferedWriter != null) {
            bufferedWriter.flush();
            this.c.close();
            this.c = null;
        }
    }

    void a(File file) {
        File[] listFiles = file.listFiles(new a());
        if (listFiles != null) {
            if (listFiles.length <= 7) {
                return;
            }
            Arrays.sort(listFiles, new b());
            for (int i = 7; i < listFiles.length; i++) {
                listFiles[i].delete();
            }
        }
    }

    public void a(String str) throws IOException {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("create " + str + " dir failed!!!");
        }
        String format = this.f7877a.format(new Date());
        File file2 = new File(str, format + ".log.txt");
        if (!file2.exists()) {
            if (!file2.createNewFile()) {
                Log.e("EncryptionWriter", "create new file " + format + " failed !!!");
            } else {
                a(file);
            }
        }
        this.c = new BufferedWriter(new FileWriter(file2, true));
    }

    public void a(String str, String str2, String str3) throws IOException {
        if (this.c != null) {
            this.c.write(this.b.a((str + str2 + " " + str3).getBytes()));
            this.c.write("\r\n");
        }
    }
}
