package com.taobao.android.tbabilitykit.pop;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public interface b {
    List<c> a();

    void a(c cVar);

    void b(c cVar);

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1619662429);
        }

        public static void a(b bVar, c listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691729e7", new Object[]{bVar, listener});
                return;
            }
            q.d(listener, "listener");
            bVar.a().remove(listener);
        }

        public static void b(b bVar, c listener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("109303a8", new Object[]{bVar, listener});
                return;
            }
            q.d(listener, "listener");
            bVar.a().add(listener);
        }
    }
}
