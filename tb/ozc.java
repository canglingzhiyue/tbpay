package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public abstract class ozc implements oyy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f32503a;

    static {
        kge.a(-1111186020);
        kge.a(-415963939);
    }

    public abstract boolean a(File file, long j, int i);

    public static /* synthetic */ void a(ozc ozcVar, File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0bd1977", new Object[]{ozcVar, file});
        } else {
            ozcVar.b(file);
        }
    }

    @Override // tb.oyy
    public void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        h hVar = new h() { // from class: tb.ozc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : "file_cache_touch_thread";
            }
        };
        synchronized (this) {
            if (this.f32503a == null) {
                this.f32503a = com.taobao.taobaoavsdk.util.a.a(hVar);
            }
        }
        this.f32503a.submit(new a(file));
    }

    private void b(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{this, file});
            return;
        }
        ozb.c(file);
        a(ozb.b(file.getParentFile()));
    }

    private void a(List<File> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        long b = b(list);
        int size = list.size();
        for (File file : list) {
            if (!a(file, b, size)) {
                AVSDKLog.e("avsdk", "file deleted:" + file + ",size:" + file.length());
                long length = file.length();
                if (file.delete()) {
                    size--;
                    b -= length;
                }
            }
        }
    }

    private long b(List<File> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ece", new Object[]{this, list})).longValue();
        }
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }

    /* loaded from: classes8.dex */
    public class a implements Callable<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final File b;

        static {
            kge.a(-1703316497);
            kge.a(-119797776);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Void call() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public a(File file) {
            this.b = file;
        }

        public Void a() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("ca430795", new Object[]{this});
            }
            ozc.a(ozc.this, this.b);
            return null;
        }
    }
}
