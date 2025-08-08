package com.xiaomi.push.service;

import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.el;
import com.xiaomi.push.gb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class ao {

    /* renamed from: a  reason: collision with other field name */
    private static final Pattern f929a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a  reason: collision with root package name */
    private static long f24644a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f928a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private static String a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    com.xiaomi.push.x.a(bufferedReader);
                    return sb2;
                }
                sb.append("\n");
                sb.append(readLine);
            }
        } catch (Exception unused2) {
            com.xiaomi.push.x.a(bufferedReader);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.xiaomi.push.x.a(bufferedReader);
            throw th;
        }
    }

    public static void a() {
        el.a m2324a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f928a.getActiveCount() <= 0 || currentTimeMillis - f24644a >= android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE) && gb.m1954a().m1959a() && (m2324a = bw.a().m2324a()) != null && m2324a.e() > 0) {
            f24644a = currentTimeMillis;
            a(m2324a.mo1910a(), true);
        }
    }

    public static void a(List<String> list, boolean z) {
        f928a.execute(new ap(list, z));
    }

    public static void b() {
        String a2 = a("/proc/self/net/tcp");
        if (!StringUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("dump tcp for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.b.m1616a(a2);
        }
        String a3 = a("/proc/self/net/tcp6");
        if (!StringUtils.isEmpty(a3)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("dump tcp6 for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.b.m1616a(a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.b.m1616a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(com.xiaomi.push.cq.m1787a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            com.xiaomi.channel.commonutils.logger.b.m1616a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
