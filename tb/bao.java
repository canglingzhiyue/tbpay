package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.cache.AURACacheInput;
import com.alibaba.android.aura.service.cache.AURACacheOutput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class bao {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_TEMPLATE_CONTAINER = "templateContainer";
    public static final String CACHE_KEY_TEMPLATE_INFO = "templateInfo";

    static {
        kge.a(-1202401978);
    }

    public static void a(s sVar, String str, Object obj, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db014304", new Object[]{sVar, str, obj, aqqVar});
        } else {
            sVar.a("aura.workflow.cache", new AURACacheInput(1, str, obj), aqqVar);
        }
    }

    public static Object a(s sVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3c496479", new Object[]{sVar, str});
        }
        final AtomicReference atomicReference = new AtomicReference(null);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        sVar.a("aura.workflow.cache", new AURACacheInput(0, str), new aqq() { // from class: tb.bao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                int hashCode = str2.hashCode();
                if (hashCode == 90991720) {
                    super.a();
                    return null;
                } else if (hashCode == 112764847) {
                    super.a((c) objArr[0]);
                    return null;
                } else if (hashCode != 744952192) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                } else {
                    super.a((b) objArr[0]);
                    return null;
                }
            }

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                super.a(cVar);
                if (cVar.b() instanceof AURACacheOutput) {
                    atomicReference.set(((AURACacheOutput) cVar.b()).cacheData);
                }
                countDownLatch.countDown();
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                super.a(bVar);
                countDownLatch.countDown();
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    super.a();
                }
            }
        });
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(TBToast.Duration.EXTRA_LONG, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        return atomicReference.get();
    }
}
