package tb;

import com.taobao.tao.log.TLog;

/* loaded from: classes2.dex */
public class iqh {

    /* renamed from: a  reason: collision with root package name */
    public static iqh f29230a;

    public static synchronized iqh a() {
        iqh iqhVar;
        synchronized (iqh.class) {
            if (f29230a == null) {
                f29230a = new iqh();
            }
            iqhVar = f29230a;
        }
        return iqhVar;
    }

    public void a(String str, String str2) {
        TLog.logi("IIFAA_DID", str, str2);
    }

    public void b(String str, String str2) {
        TLog.logi("IIFAA_DID", str, str2);
    }

    public void c(String str, String str2) {
        TLog.loge("IIFAA_DID", str, str2);
    }
}
