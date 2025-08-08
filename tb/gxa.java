package tb;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class gxa<IN, OUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MNNCVExecutor f28549a;
    public Context b;
    public volatile boolean c = false;
    public volatile boolean d = false;
    private volatile boolean e = true;

    static {
        kge.a(1297031797);
        kge.a(-427514281);
    }

    public abstract OUT b(IN in);

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract String e();

    public static /* synthetic */ HashMap a(gxa gxaVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("7ac592ef", new Object[]{gxaVar, new Boolean(z)}) : gxaVar.b(z);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : e();
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (!b()) {
            u.d("LCMNN.MNNCVExecutor", "mExecutor.init not enable " + a());
            return false;
        }
        this.b = context;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f28549a = new MNNCVExecutor(a());
        } catch (Exception e) {
            e.printStackTrace();
            u.d("LCMNN.MNNCVExecutor", "mExecutor.init fail " + a());
            z = false;
        }
        gxc.a(a() + "_init", SystemClock.elapsedRealtime() - elapsedRealtime, z, b(z));
        return c();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.f28549a == null) {
            return false;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final MRTRuntimeException[] mRTRuntimeExceptionArr = new MRTRuntimeException[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f28549a.a(new MNNCVExecutor.a() { // from class: tb.gxa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.mnncv.MNNCVExecutor.a
            public void onResult(MRTRuntimeException mRTRuntimeException) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                    return;
                }
                mRTRuntimeExceptionArr[0] = mRTRuntimeException;
                gxa gxaVar = gxa.this;
                if (mRTRuntimeException == null) {
                    z = true;
                }
                gxaVar.d = z;
                gxa.this.c = true;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                boolean z2 = gxa.this.d;
                gxa gxaVar2 = gxa.this;
                gxc.a(gxa.this.a() + "_prepare", elapsedRealtime2, z2, gxa.a(gxaVar2, gxaVar2.d));
                countDownLatch.countDown();
            }
        });
        long c = s.c();
        try {
            countDownLatch.await(c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            u.d("LCMNN.MNNCVExecutor", "prepare fail: await prepareTimeoutMS=" + c + " msg=" + e.getMessage());
            e.printStackTrace();
        }
        if (mRTRuntimeExceptionArr[0] == null && this.c) {
            return true;
        }
        u.d("LCMNN.MNNCVExecutor", " MNN Prepare fail, name=" + a() + this.c + this.d);
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (this.f28549a != null) {
                this.f28549a.a();
                this.f28549a = null;
                u.a("LCMNN.MNNCVExecutor", "mExecutor.destroy() " + a());
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            u.d("LCMNN.MNNCVExecutor", "mExecutor.destroy fail " + a());
            return false;
        }
    }

    public OUT a(IN in) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OUT) ipChange.ipc$dispatch("9798556e", new Object[]{this, in});
        }
        if (StringUtils.isEmpty(a())) {
            u.d("LCMNN.MNNCVExecutor", "!!!getName() should be config first");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        OUT b = b((gxa<IN, OUT>) in);
        gxc.a(a() + "_process", SystemClock.elapsedRealtime() - elapsedRealtime, this.e, b(this.e));
        return b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    private HashMap<String, Object> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bdf114ae", new Object[]{this, new Boolean(z)});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("mnn_suc", z ? "1" : "0");
        return hashMap;
    }
}
