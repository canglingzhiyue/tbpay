package com.xiaomi.clientreport.processor;

import mtopsdk.common.util.StringUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class e {
    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        long[] m1632a;
        if (perfClientReport == null || (m1632a = m1632a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = m1632a[0];
        perfClientReport.perfLatencies = m1632a[1];
        return perfClientReport;
    }

    private static PerfClientReport a(String str) {
        PerfClientReport perfClientReport = null;
        try {
            String[] m1633a = m1633a(str);
            if (m1633a == null || m1633a.length < 4 || StringUtils.isEmpty(m1633a[0]) || StringUtils.isEmpty(m1633a[1]) || StringUtils.isEmpty(m1633a[2]) || StringUtils.isEmpty(m1633a[3])) {
                return null;
            }
            perfClientReport = PerfClientReport.getBlankInstance();
            perfClientReport.production = Integer.parseInt(m1633a[0]);
            perfClientReport.clientInterfaceId = m1633a[1];
            perfClientReport.reportType = Integer.parseInt(m1633a[2]);
            perfClientReport.code = Integer.parseInt(m1633a[3]);
            return perfClientReport;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.b.c("parse per key error");
            return perfClientReport;
        }
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* renamed from: a  reason: collision with other method in class */
    private static HashMap<String, String> m1631a(String str) {
        BufferedReader bufferedReader;
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str) || !new File(str).exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader2 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split("%%%");
                        bufferedReader2 = split.length;
                        if (bufferedReader2 >= 2) {
                            bufferedReader2 = 0;
                            bufferedReader2 = 0;
                            if (!StringUtils.isEmpty(split[0]) && !StringUtils.isEmpty(split[1])) {
                                bufferedReader2 = split[0];
                                hashMap.put(bufferedReader2, split[1]);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        x.a(bufferedReader2);
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        x.a(bufferedReader);
                        throw th;
                    }
                }
                x.a(bufferedReader);
            } catch (Exception e2) {
                e = e2;
            }
            return hashMap;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Closeable, java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(android.content.Context, java.lang.String):java.util.List");
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        if (StringUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
            } catch (Exception e2) {
                bufferedWriter = null;
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                x.a((Closeable) null);
                throw th;
            }
            try {
                for (String str2 : hashMap.keySet()) {
                    bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                    bufferedWriter.newLine();
                }
                x.a(bufferedWriter);
            } catch (Exception e3) {
                e = e3;
                com.xiaomi.channel.commonutils.logger.b.a(e);
                x.a(bufferedWriter);
            }
        } catch (Throwable th3) {
            th = th3;
            x.a((Closeable) null);
            throw th;
        }
    }

    public static void a(String str, com.xiaomi.clientreport.data.a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        if (aVarArr == null || aVarArr.length <= 0 || StringUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLock = null;
        try {
            File file = new File(str + ".lock");
            x.m2368a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
                HashMap<String, String> m1631a = m1631a(str);
                for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                    if (aVar != null) {
                        String a2 = a((PerfClientReport) aVar);
                        long j = ((PerfClientReport) aVar).perfCounts;
                        long j2 = ((PerfClientReport) aVar).perfLatencies;
                        if (!StringUtils.isEmpty(a2) && j > 0 && j2 >= 0) {
                            a(m1631a, a2, j, j2);
                        }
                    }
                }
                a(str, m1631a);
            } catch (Throwable unused) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.c("failed to write perf to file ");
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e) {
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                        }
                    }
                    x.a(randomAccessFile);
                } finally {
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e2) {
                            com.xiaomi.channel.commonutils.logger.b.a(e2);
                        }
                    }
                    x.a(randomAccessFile);
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    private static void a(HashMap<String, String> hashMap, String str, long j, long j2) {
        StringBuilder sb;
        String str2 = hashMap.get(str);
        if (StringUtils.isEmpty(str2)) {
            hashMap.put(str, j + "#" + j2);
            return;
        }
        long[] m1632a = m1632a(str2);
        if (m1632a == null || m1632a[0] <= 0 || m1632a[1] < 0) {
            sb = new StringBuilder();
        } else {
            j += m1632a[0];
            j2 += m1632a[1];
            sb = new StringBuilder();
        }
        sb.append(j);
        sb.append("#");
        sb.append(j2);
        hashMap.put(str, sb.toString());
    }

    /* renamed from: a  reason: collision with other method in class */
    protected static long[] m1632a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String[] m1633a(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
