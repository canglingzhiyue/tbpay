package tb;

import com.taobao.android.job.core.e;
import com.taobao.android.job.core.task.d;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface guj {
    e<String, Void> a(String str);

    Future<d> a_(e<String, Void> eVar, long j, TimeUnit timeUnit, gtl<String, Void> gtlVar);

    gub<String> n();
}
