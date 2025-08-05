package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.h;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class kdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29986a;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b.a f29987a;
        public final boolean b;

        static {
            kge.a(1438891822);
        }

        public a(boolean z, b.a aVar) {
            this.f29987a = aVar;
            this.b = z;
        }
    }

    static {
        kge.a(1071941331);
    }

    public kdp(String str) {
        this.f29986a = str;
    }

    public a a(String str, kdt kdtVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("99c7f46b", new Object[]{this, str, kdtVar});
        }
        boolean a2 = h.a(this.f29986a).a();
        b.a aVar = new b.a();
        if (!a2) {
            kej.a("AdColdStartBizService", "startLinkedSplashAnimator, orangeSwitch = false");
            return new a(false, aVar);
        } else if (kdtVar == null) {
            kej.a("AdColdStartBizService", "startLinkedSplashAnimator, coldStartInfo == null");
            return new a(false, aVar);
        } else {
            if (!TextUtils.equals(kdtVar.f29996a.getLinkedDataType(), "popView")) {
                boolean d = h.b(this.f29986a).d();
                kej.a("AdColdStartBizService", "LinkedSplashCooperator,  非 pop isShouldShow = " + d);
                if (!d) {
                    return new a(false, aVar);
                }
            }
            boolean z2 = kdtVar.b != null && kdtVar.b.animation;
            kej.a("AdColdStartBizService", "LinkedSplashCooperator, shouldDoAnimation : " + z2);
            String a3 = a(str);
            if (TextUtils.isEmpty(a3)) {
                kej.a("AdColdStartBizService", "LinkedSplashCooperator, return, convertFromAction failed, closeType = " + str);
                return new a(false, aVar);
            }
            aVar.f16704a = a3;
            boolean a4 = h.b(this.f29986a).a(aVar);
            kej.a("AdColdStartBizService", "LinkedSplashCooperator, shouldAnimate-> " + a4);
            if (!z2 || !a4) {
                z = false;
            }
            return new a(z, aVar);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (d.CLOSE_TYPE_SKIP.equals(str)) {
            return b.a.FROM_CLOSE;
        }
        if (!"other".equals(str)) {
            return null;
        }
        return b.a.FROM_FINISH;
    }

    public void a(kdt kdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e262bd", new Object[]{this, kdtVar});
            return;
        }
        try {
            kej.a("AdColdStartBizService", "LinkedSplashCooperator, adShowSuccess");
            if (kdtVar != null && kdtVar.b != null) {
                h.b(this.f29986a).a(true);
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("page", this.f29986a);
                alj.a().a(PopStrategy.IDENTIFIER_SPLASH, hashMap);
                h.a(this.f29986a).e().d();
                return;
            }
            kej.a("AdColdStartBizService", "LinkedSplashCooperator,coldStartInfo == null || coldStartInfo.info == null");
        } catch (Throwable th) {
            kej.a("AdColdStartBizService", "LinkedSplashCooperator, adShow fail " + th);
        }
    }

    public void a(int i, kdt kdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522a6f0", new Object[]{this, new Integer(i), kdtVar});
            return;
        }
        kej.a("AdColdStartBizService", "LinkedSplashCooperator, adShowError code :" + i);
        kel.a(false);
    }
}
