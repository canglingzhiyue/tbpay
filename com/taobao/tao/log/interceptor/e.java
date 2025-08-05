package com.taobao.tao.log.interceptor;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.tao.log.interceptor.b;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes8.dex */
public class e implements com.taobao.tao.log.interceptor.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long k;
    private static long l;
    private static long m;
    private static long n;
    private static long o;

    /* renamed from: a */
    private Context f20693a;
    private RealTimeLogConfig b;
    private b.a c;
    private final String d;
    private final String e;
    private final AtomicBoolean f;
    private ThreadPoolExecutor g;
    private ThreadPoolExecutor h;
    private a i;
    private final List<String> j;

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(String str, String str2);
    }

    static {
        kge.a(1092691930);
        kge.a(1120462685);
    }

    public static /* synthetic */ void lambda$FZlU5EuDAOjjG6VEr0kJdXKug_k(e eVar, String str) {
        eVar.c(str);
    }

    public static /* synthetic */ void lambda$m2ELJo04hXStVbq2U_YagYCw9qw(e eVar) {
        eVar.j();
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        long j2 = n + j;
        n = j2;
        return j2;
    }

    public static /* synthetic */ a a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c0262eb1", new Object[]{eVar}) : eVar.i;
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : k;
    }

    public static /* synthetic */ long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{new Long(j)})).longValue();
        }
        long j2 = o + j;
        o = j2;
        return j2;
    }

    public static /* synthetic */ List b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c2306e9f", new Object[]{eVar}) : eVar.j;
    }

    public static /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue() : l;
    }

    public static /* synthetic */ long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b488e", new Object[]{new Long(j)})).longValue();
        }
        long j2 = k + j;
        k = j2;
        return j2;
    }

    public static /* synthetic */ b.a c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("f506c3d2", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : m;
    }

    public static /* synthetic */ long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad40212d", new Object[]{new Long(j)})).longValue();
        }
        long j2 = l + j;
        l = j2;
        return j2;
    }

    public static /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : n;
    }

    public static /* synthetic */ long e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f9cc", new Object[]{new Long(j)})).longValue();
        }
        long j2 = m + j;
        m = j2;
        return j2;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : o;
    }

    public e(String str, String str2) {
        this.d = str;
        this.e = str2;
        this.f = new AtomicBoolean(false);
        this.j = new ArrayList();
        this.j.add("-1");
        this.j.add("3");
        this.j.add("FAIL_SYS_API_NOT_FOUNDED");
    }

    public e() {
        this(Mtop.Id.INNER, "taobao4android");
    }

    @Override // com.taobao.tao.log.interceptor.b
    public void a(Context context, RealTimeLogConfig realTimeLogConfig, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d86ce", new Object[]{this, context, realTimeLogConfig, aVar});
        } else if (this.f.get()) {
        } else {
            this.f20693a = context;
            this.b = realTimeLogConfig;
            this.c = aVar;
            try {
                this.f.set(true);
                g();
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "init exception", e);
            }
        }
    }

    @Override // com.taobao.tao.log.interceptor.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f.get()) {
        } else {
            this.f.set(false);
            try {
                h();
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "destroy exception", e);
            }
        }
    }

    @Override // com.taobao.tao.log.interceptor.b
    public void a(RealTimeLogConfig realTimeLogConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b5cdd1", new Object[]{this, realTimeLogConfig});
            return;
        }
        this.b = realTimeLogConfig;
        this.i.a(realTimeLogConfig);
    }

    @Override // com.taobao.tao.log.interceptor.b
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.f.get()) {
        } else {
            this.g.execute(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$e$FZlU5EuDAOjjG6VEr0kJdXKug_k
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.lambda$FZlU5EuDAOjjG6VEr0kJdXKug_k(e.this, str);
                }
            });
        }
    }

    public /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            this.i.a(str);
        } catch (InterruptedException unused) {
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.i = new a(this.b);
        this.g = new ThreadPoolExecutor(1, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), $$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc.INSTANCE);
        this.g.allowCoreThreadTimeOut(true);
        this.h = new ThreadPoolExecutor(1, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), $$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU.INSTANCE);
        this.h.allowCoreThreadTimeOut(true);
        this.h.execute(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$e$m2ELJo04hXStVbq2U_YagYCw9qw
            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e.lambda$m2ELJo04hXStVbq2U_YagYCw9qw(e.this);
            }
        });
    }

    public static /* synthetic */ Thread b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("be8f90c0", new Object[]{runnable}) : new Thread(runnable, "tlog-realtime-producer");
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("b72a5ba1", new Object[]{runnable}) : new Thread(runnable, "tlog-realtime-consumer");
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            i();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.g.shutdownNow();
        this.g = null;
        a aVar = this.i;
        if (aVar != null) {
            aVar.c();
        }
        this.h.shutdownNow();
        this.h = null;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        while (this.f.get()) {
            try {
                final byte[] a2 = this.i.a();
                if (a2 != null) {
                    String encodeToString = Base64.encodeToString(a2, 0);
                    if (this.b.needWifi && !com.taobao.tao.log.g.a(this.f20693a)) {
                        this.c.onUploadStop(10, "");
                        return;
                    } else {
                        String.format("Send log data to sever. Length=%d(%d)", Integer.valueOf(a2.length), Integer.valueOf(encodeToString.length()));
                        a(encodeToString, new b() { // from class: com.taobao.tao.log.interceptor.e.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                e.this = this;
                            }

                            @Override // com.taobao.tao.log.interceptor.e.b
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                    return;
                                }
                                e.a(a2.length);
                                String.format("Upload Log Success. Log Write Len: %d(%d), Compress Len: %d Send Len: %d, Drop Len: %d, Queue Len:%d", Long.valueOf(e.b()), Long.valueOf(e.c()), Long.valueOf(e.d()), Long.valueOf(e.e()), Long.valueOf(e.f()), Long.valueOf(e.a(e.this).b()));
                            }

                            @Override // com.taobao.tao.log.interceptor.e.b
                            public void a(String str, String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                                    return;
                                }
                                Log.e("RealTimeMtopUploader", String.format("Upload Log Failed. ErrorCode=%s,ErrorMsg=%s", str, str2));
                                try {
                                    if (e.b(e.this).contains(str)) {
                                        Log.e("RealTimeMtopUploader", "Will Stop RealTimeLog with error: " + str);
                                        if (e.c(e.this) == null) {
                                            return;
                                        }
                                        e.c(e.this).onUploadStop(9, str);
                                        return;
                                    }
                                    if (e.a(e.this).a(a2)) {
                                        String str3 = "Upload Log Failed. Add data to LogQueue again! len:" + a2.length;
                                    } else {
                                        e.b(a2.length);
                                        String.format("[Data Lost] Queue will full. Do not add data（len=%d）to Queue", Integer.valueOf(a2.length));
                                    }
                                    String.format("Upload Log Failed. Log Write Len: %d(%d), Compress Len: %d Send Len: %d, Drop Len: %d, Queue Len:%d", Long.valueOf(e.b()), Long.valueOf(e.c()), Long.valueOf(e.d()), Long.valueOf(e.e()), Long.valueOf(e.f()), Long.valueOf(e.a(e.this).b()));
                                    synchronized (this) {
                                        wait(2000L);
                                    }
                                } catch (InterruptedException unused) {
                                }
                            }
                        });
                    }
                }
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                Log.e("RealTimeMtopUploader", "uploadLog exception", e);
            }
        }
    }

    private void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142eb8f3", new Object[]{this, str, bVar});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alibaba.emas.publish.update.resource.upload");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", (Object) this.e);
            jSONObject.put("appVersion", (Object) com.taobao.tao.log.f.a().n());
            jSONObject.put("resourceType", (Object) "realtime");
            jSONObject.put("resourceContent", (Object) str);
            mtopRequest.setData(jSONObject.toJSONString());
            HashMap hashMap = new HashMap();
            hashMap.put("token", this.b.token);
            hashMap.put("compressType", WeexZipModule.NAME);
            hashMap.put("encryptType", "0");
            hashMap.put("dataType", "0");
            MtopResponse syncRequest = MtopBusiness.build(Mtop.instance(this.d, this.f20693a), mtopRequest).mo1305reqMethod(MethodEnum.POST).mo1297headers((Map<String, String>) hashMap).mo1312setConnectionTimeoutMilliSecond(10000).mo1326setSocketTimeoutMilliSecond(10000).mo1339retryTime(3).syncRequest();
            if (syncRequest.isApiSuccess()) {
                bVar.a();
            } else {
                bVar.a(syncRequest.getRetCode(), syncRequest.getRetMsg());
            }
        } catch (Exception e) {
            Log.e("RealTimeMtopUploader", "upload exception", e);
            if (bVar == null) {
                return;
            }
            bVar.a("EXCEPTION", e.getMessage());
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final StringBuilder f20695a;
        private final LinkedList<byte[]> b;
        private final ReentrantLock c;
        private final Condition d;
        private long e;
        private RealTimeLogConfig f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        static {
            kge.a(609757872);
        }

        public a(RealTimeLogConfig realTimeLogConfig) {
            a(realTimeLogConfig);
            this.f20695a = new StringBuilder(realTimeLogConfig.compressSize);
            this.b = new LinkedList<>();
            this.c = new ReentrantLock();
            this.d = this.c.newCondition();
            this.e = 0L;
            this.j = false;
        }

        public void a(RealTimeLogConfig realTimeLogConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92b5cdd1", new Object[]{this, realTimeLogConfig});
                return;
            }
            this.f = realTimeLogConfig;
            this.h = realTimeLogConfig.updateInterval;
            int i = this.h;
            if (i < 3) {
                this.h = 3;
            } else if (i > 30) {
                this.h = 30;
            }
            this.i = Math.min(this.h * 3, 30);
            this.g = 0;
        }

        public void a(String str) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            try {
                this.f20695a.append(str);
                e.c(str.length());
                if (a(this.f.compressSize)) {
                    this.d.signal();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean a(byte[] bArr) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue();
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            try {
                if (this.e + bArr.length >= this.f.bufferSize) {
                    return false;
                }
                this.b.offerFirst(bArr);
                this.e += bArr.length;
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public byte[] a() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lockInterruptibly();
            do {
                try {
                    if (this.b.isEmpty()) {
                        if (this.d.await(this.h, TimeUnit.SECONDS)) {
                            this.g = 0;
                        } else if (this.b.isEmpty()) {
                            this.g += this.h;
                            if (this.g < this.i) {
                                a(this.f.compressSize / 3);
                            } else {
                                this.g = 0;
                                a(0L);
                            }
                        }
                    } else {
                        byte[] poll = this.b.poll();
                        if (poll != null) {
                            this.e -= poll.length;
                        }
                        return poll;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } while (!this.j);
            return null;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                return this.e;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                this.j = true;
                this.f20695a.delete(0, this.f20695a.length());
                this.b.clear();
                this.d.signal();
            } finally {
                reentrantLock.unlock();
            }
        }

        private boolean a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
            }
            int length = this.f20695a.length();
            long j2 = length;
            if (j2 > j) {
                byte[] b = e.b(this.f20695a.toString());
                if (b == null) {
                    Log.e("CompressBlockQueue", "Compress error, Data lose!!! len:" + length);
                    e.d(j2);
                    return false;
                }
                e.e(b.length);
                this.f20695a.delete(0, length);
                if (this.b.add(b)) {
                    this.e += b.length;
                    String.format("Move Log Cache(compress %d --> %d) to Log Queue(len=%d, count=%d). FlushSize=%d", Integer.valueOf(length), Integer.valueOf(b.length), Long.valueOf(this.e), Integer.valueOf(this.b.size()), Long.valueOf(j));
                    while (this.e > this.f.bufferSize) {
                        byte[] poll = this.b.poll();
                        if (poll != null) {
                            int length2 = poll.length;
                            long j3 = length2;
                            e.b(j3);
                            this.e -= j3;
                            String.format("[Data Lost] Queue is full. Remove data(len=%d) from Queue(len=%d, count=%d)", Integer.valueOf(length2), Long.valueOf(this.e), Integer.valueOf(this.b.size()));
                        }
                    }
                    return true;
                }
                Log.e("CompressBlockQueue", "Failed to add compressData to Queue!!! Data Lost. len:" + b.length);
                e.b((long) b.length);
            }
            return false;
        }
    }

    public static byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(str.getBytes("UTF-8"));
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            Log.e("RealTimeMtopUploader", "compress error", e);
            return null;
        }
    }
}
