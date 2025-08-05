package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/icart/dx/DXCartPrefetchZcacheEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "prepareBindEventWithArgs", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "Companion", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class xmd extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final long DX_EVENT_CARTPREFETCHZCACHE = 3238675493701460027L;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f34366a;

    public static /* synthetic */ Object ipc$super(xmd xmdVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] args, DXRuntimeContext runtimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, args, runtimeContext});
            return;
        }
        q.d(args, "args");
        q.d(runtimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(args, runtimeContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r5, java.lang.Object[] r6, com.taobao.android.dinamicx.DXRuntimeContext r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xmd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            r1[r5] = r7
            java.lang.String r5 = "f9db7b67"
            r0.ipc$dispatch(r5, r1)
            return
        L1b:
            if (r6 == 0) goto L28
            int r5 = r6.length
            if (r5 != 0) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = 0
            goto L29
        L28:
            r5 = 1
        L29:
            if (r5 == 0) goto L2c
            return
        L2c:
            r5 = r6[r3]
            java.lang.String r5 = r5.toString()
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L3d
            r6 = 1
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 != 0) goto L59
            java.util.List<java.lang.String> r6 = tb.xmd.f34366a
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L49
            goto L59
        L49:
            java.lang.String[] r6 = new java.lang.String[r2]
            r6[r3] = r5
            java.util.List r6 = kotlin.collections.p.c(r6)
            com.taobao.zcache.n.a(r6)
            java.util.List<java.lang.String> r6 = tb.xmd.f34366a
            r6.add(r5)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xmd.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/android/icart/dx/DXCartPrefetchZcacheEventHandler$Companion;", "", "()V", "DX_EVENT_CARTPREFETCHZCACHE", "", "sPrefetchedList", "", "", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a {
        static {
            kge.a(1177897901);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1224037723);
        Companion = new a(null);
        f34366a = new ArrayList();
    }
}
