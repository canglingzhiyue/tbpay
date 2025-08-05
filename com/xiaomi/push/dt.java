package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
class dt {

    /* renamed from: a  reason: collision with root package name */
    private static String f24431a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private int f225a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f228a;

    /* renamed from: b  reason: collision with other field name */
    private String f229b;
    private String c;

    /* renamed from: a  reason: collision with other field name */
    private final SimpleDateFormat f226a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int b = 2097152;

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<File> f227a = new ArrayList<>();

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f229b.length() + start);
                if (this.f228a) {
                    if (substring.compareTo(this.c) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.f229b) >= 0) {
                    this.f228a = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f229b.length();
                }
                i = start + indexOf;
            }
            if (this.f228a) {
                int i3 = read - i2;
                this.f225a += i3;
                if (z) {
                    bufferedWriter.write(cArr, i2, i3);
                    return;
                }
                bufferedWriter.write(cArr, i2, i3);
                if (this.f225a > this.b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    private void a(File file) {
        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            } catch (FileNotFoundException e) {
                e = e;
                bufferedReader = null;
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                bufferedWriter = null;
            }
            try {
                bufferedWriter.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + com.xiaomi.push.service.bw.m2320a() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                this.f225a = 0;
                Iterator<File> it = this.f227a.iterator();
                while (it.hasNext()) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                    try {
                        a(bufferedReader, bufferedWriter, compile);
                        bufferedReader.close();
                        bufferedReader2 = bufferedReader;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        bufferedReader2 = bufferedWriter;
                        com.xiaomi.channel.commonutils.logger.b.c("LOG: filter error = " + e.getMessage());
                        x.a(bufferedReader2);
                        x.a(bufferedReader);
                        return;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader2 = bufferedWriter;
                        com.xiaomi.channel.commonutils.logger.b.c("LOG: filter error = " + e.getMessage());
                        x.a(bufferedReader2);
                        x.a(bufferedReader);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        x.a(bufferedWriter);
                        x.a(bufferedReader2);
                        throw th;
                    }
                }
                bufferedWriter.write(cs.a().c());
                x.a(bufferedWriter);
                x.a(bufferedReader2);
            } catch (FileNotFoundException e5) {
                e = e5;
                bufferedReader = bufferedReader2;
            } catch (IOException e6) {
                e = e6;
                bufferedReader = bufferedReader2;
            } catch (Throwable th3) {
                th = th3;
                x.a(bufferedWriter);
                x.a(bufferedReader2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    dt m1824a(File file) {
        if (file.exists()) {
            this.f227a.add(file);
        }
        return this;
    }

    dt a(Date date, Date date2) {
        String format;
        if (date.after(date2)) {
            this.f229b = this.f226a.format(date2);
            format = this.f226a.format(date);
        } else {
            this.f229b = this.f226a.format(date);
            format = this.f226a.format(date2);
        }
        this.c = format;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(Context context, Date date, Date date2, File file) {
        File file2;
        File file3;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = new File(context.getExternalFilesDir(null), com.xiaomi.push.service.bj.Q);
            if (!file2.exists()) {
                file2 = new File(context.getFilesDir(), com.xiaomi.push.service.bj.Q);
            }
            if (!file2.exists()) {
                file2 = context.getFilesDir();
            }
            m1824a(new File(file2, "xmsf.log.1"));
            file3 = new File(file2, "xmsf.log");
        } else {
            file2 = new File(context.getExternalFilesDir(null) + f24431a);
            m1824a(new File(file2, "log0.txt"));
            file3 = new File(file2, "log1.txt");
        }
        m1824a(file3);
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + "-" + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        a(file5);
        com.xiaomi.channel.commonutils.logger.b.c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            x.a(file4, file5);
            com.xiaomi.channel.commonutils.logger.b.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (i != 0) {
            this.b = i;
        }
    }
}
