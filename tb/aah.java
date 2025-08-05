package tb;

import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.tao.log.TLog;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class aah implements k {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f25176a;

    public aah() {
        if (this.f25176a == null) {
            this.f25176a = VExecutors.newSingleThreadExecutor(new h() { // from class: tb.aah.1
                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    return "TbLottieLogger";
                }
            });
        }
    }

    private void a(Runnable runnable) {
        ExecutorService executorService = this.f25176a;
        if (executorService != null) {
            executorService.execute(runnable);
        } else {
            TLog.loge("TbLottie_Module", "mLogExecutor==null");
        }
    }

    @Override // com.airbnb.lottie.k
    public void a(final String str) {
        a(new Runnable() { // from class: tb.aah.2
            @Override // java.lang.Runnable
            public void run() {
                TLog.logd("TbLottie_Module", f.TAG, str);
            }
        });
    }

    @Override // com.airbnb.lottie.k
    public void b(final String str) {
        a(new Runnable() { // from class: tb.aah.3
            @Override // java.lang.Runnable
            public void run() {
                TLog.logw("TbLottie_Module", f.TAG, str);
            }
        });
    }

    @Override // com.airbnb.lottie.k
    public void b(final String str, final Throwable th) {
        a(new Runnable() { // from class: tb.aah.4
            @Override // java.lang.Runnable
            public void run() {
                TLog.loge("TbLottie_Module", f.TAG, str, th);
            }
        });
    }

    @Override // com.airbnb.lottie.k
    public void c(final String str) {
        a(new Runnable() { // from class: tb.aah.5
            @Override // java.lang.Runnable
            public void run() {
                TLog.loge("TbLottie_Module", f.TAG, str);
            }
        });
    }
}
