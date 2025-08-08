package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class dy implements LoggerInterface {

    /* renamed from: a  reason: collision with root package name */
    private static volatile dy f24439a;

    /* renamed from: a  reason: collision with other field name */
    private Context f247a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f248a;
    private String b;
    private String c = "";

    /* renamed from: a  reason: collision with other field name */
    private static final SimpleDateFormat f245a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a  reason: collision with other field name */
    public static String f244a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private static List<Pair<String, Throwable>> f246a = Collections.synchronizedList(new ArrayList());

    private dy(Context context) {
        this.f247a = context;
        if (context.getApplicationContext() != null) {
            this.f247a = context.getApplicationContext();
        }
        this.b = this.f247a.getPackageName() + "-" + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f248a = new Handler(handlerThread.getLooper());
    }

    public static dy a(Context context) {
        if (f24439a == null) {
            synchronized (dy.class) {
                if (f24439a == null) {
                    f24439a = new dy(context);
                }
            }
        }
        return f24439a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a  reason: collision with other method in class */
    public void m1830a() {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    if (StringUtils.isEmpty(this.c) && (externalFilesDir = this.f247a.getExternalFilesDir(null)) != null) {
                        this.c = externalFilesDir.getAbsolutePath() + "";
                    }
                    File file = new File(this.c + f244a);
                    if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                        return;
                    }
                    File file2 = new File(file, "log.lock");
                    if (!file2.exists() || file2.isDirectory()) {
                        file2.createNewFile();
                    }
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                            while (!f246a.isEmpty()) {
                                try {
                                    Pair<String, Throwable> remove = f246a.remove(0);
                                    String str = (String) remove.first;
                                    if (remove.second != null) {
                                        str = (str + "\n") + Log.getStackTraceString((Throwable) remove.second);
                                    }
                                    bufferedWriter2.write(str + "\n");
                                } catch (Exception e) {
                                    e = e;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(this.b, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e2) {
                                            Log.e(this.b, "", e2);
                                        }
                                    }
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e3) {
                                            Log.e(this.b, "", e3);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        return;
                                    }
                                    randomAccessFile.close();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter2;
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e4) {
                                            Log.e(this.b, "", e4);
                                        }
                                    }
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e5) {
                                            Log.e(this.b, "", e5);
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException e6) {
                                            Log.e(this.b, "", e6);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            File file3 = new File(file, "log1.txt");
                            if (file3.length() >= 1048576) {
                                File file4 = new File(file, "log0.txt");
                                if (file4.exists() && file4.isFile()) {
                                    file4.delete();
                                }
                                file3.renameTo(file4);
                            }
                            if (0 != 0) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e7) {
                                    Log.e(this.b, "", e7);
                                }
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e8) {
                                    Log.e(this.b, "", e8);
                                }
                            }
                            randomAccessFile.close();
                        } catch (Exception e9) {
                            e = e9;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileLock = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileLock = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileLock = null;
                    randomAccessFile = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                    randomAccessFile = null;
                }
            } catch (IOException e12) {
                Log.e(this.b, "", e12);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th) {
        this.f248a.post(new dz(this, str, th));
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.b = str;
    }
}
