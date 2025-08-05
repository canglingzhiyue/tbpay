package com.taobao.zcache.network;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.l;
import com.taobao.zcache.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class d implements Comparable<d>, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final PriorityBlockingQueue<d> f23655a;
    private static final ExecutorService b;
    private final DownloadRequest c;
    private final l d;
    private final c e;
    private ByteArrayOutputStream f;
    private File g;
    private RandomAccessFile h;
    private int i = 0;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, dVar})).intValue() : a(dVar);
    }

    public static /* synthetic */ PriorityBlockingQueue a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PriorityBlockingQueue) ipChange.ipc$dispatch("cf56bd", new Object[0]) : f23655a;
    }

    static {
        kge.a(818914);
        kge.a(-1390502639);
        kge.a(415966670);
        f23655a = new PriorityBlockingQueue<>();
        b = new ThreadPoolExecutor(1, 5, 3L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.taobao.zcache.network.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "ZCache.Download_" + runnable.hashCode());
            }
        }, new RejectedExecutionHandler() { // from class: com.taobao.zcache.network.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                } else {
                    d.a().put((d) runnable);
                }
            }
        });
    }

    public d(DownloadRequest downloadRequest, l lVar, c cVar) {
        this.c = downloadRequest;
        this.d = lVar;
        this.e = cVar;
    }

    public static void a(DownloadRequest downloadRequest, l lVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8605191", new Object[]{downloadRequest, lVar, cVar});
        } else if (cVar == null) {
        } else {
            if (downloadRequest == null || downloadRequest.url == null) {
                cVar.a(0, null, new Error(-1, "request \"null\" invalid URL"), null);
            } else {
                b.execute(new d(downloadRequest, lVar, cVar));
            }
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        File file = new File(n.a().getCacheDir().getAbsolutePath() + File.separator + "ZCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        String a2 = a(str.getBytes());
        if (a2 == null) {
            a2 = "TEMP_FILE_" + System.currentTimeMillis();
        }
        return file + File.separator + a2;
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public int a(d dVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43237f7d", new Object[]{this, dVar})).intValue();
        }
        int i2 = this.c.tempFilePath == null ? 0 : 1;
        if (dVar.c.tempFilePath == null) {
            i = 0;
        }
        return i2 - i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        for (d dVar = this; dVar != null; dVar = f23655a.poll()) {
            dVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.zcache.network.d.b():void");
    }

    private void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = new File(a(this.c.url));
        if (this.g.isDirectory()) {
            this.g.delete();
        }
        if (!this.g.exists()) {
            this.g.createNewFile();
        }
        this.h = new RandomAccessFile(this.g, "rwd");
        long length = this.h.length();
        if (length <= 0) {
            return;
        }
        this.h.seek(length);
        if (this.c.header == null) {
            this.c.header = new HashMap<>();
        }
        HashMap<String, String> hashMap = this.c.header;
        hashMap.put(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-");
    }

    private void a(int i, Map<String, String> map, Error error, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0c96ea", new Object[]{this, new Integer(i), map, error, bArr});
            return;
        }
        d();
        this.e.a(i, map, error, bArr);
    }

    private long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        if (str == null || !str.startsWith("bytes")) {
            return 0L;
        }
        String[] split = str.split("[ -/]]");
        if (split.length != 4) {
            return 0L;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            this.h.seek(parseLong);
            return parseLong;
        } catch (IOException unused) {
            return 0L;
        }
    }

    private void a(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{this, file, file2});
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.h;
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused) {
        }
        this.h = null;
    }
}
