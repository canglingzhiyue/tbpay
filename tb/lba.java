package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000\u001a\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001a9\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\f0\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\f0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001a\u0010\u000b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000\u001a-\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0011\u001a\u0002H\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\f0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u0002H\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\f0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"lazyNone", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "runOnDebug", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_block, "toastOnDebug", "message", "", "tryCatch", "R", "throwableBlock", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exceptionReturn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "logTag", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ali-ultron-sdk_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class lba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/android/ultron/ktx/UltronExtensionsKt$toastOnDebug$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30445a;

        public a(String str) {
            this.f30445a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBToast.makeText(Globals.getApplication(), this.f30445a, 2000L).show();
            }
        }
    }

    static {
        kge.a(1274892089);
    }

    public static final void a(String message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{message});
            return;
        }
        q.d(message, "message");
        if (!ifp.a()) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            jqh.a(new a(message), 0L);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }
}
