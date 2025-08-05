package tb;

import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class ceg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(-1673249425);
        Companion = new a(null);
    }

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Companion.b(str);
        }
    }

    @JvmStatic
    public static final void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else {
            Companion.a(th);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1567266313);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        @JvmStatic
        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                TLog.logd("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, "exception happened : ", th);
            }
        }

        @JvmStatic
        public final void a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
            } else {
                TLog.loge("shop", ShopView.SP_NAMESPACE, str, th);
            }
        }

        @JvmStatic
        public final void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                TLog.logi("shop", ShopView.SP_NAMESPACE, str);
            }
        }

        @JvmStatic
        public final void a(String name, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, name, obj});
                return;
            }
            q.d(name, "name");
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" = ");
            sb.append((Object) (obj == null ? null : obj.toString()));
            b(sb.toString());
        }
    }
}
