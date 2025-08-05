package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public interface f extends g {

    /* loaded from: classes9.dex */
    public interface b {
        void a(com.taobao.themis.kernel.preload.c cVar);
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(int i, String str);

        void a(com.taobao.themis.kernel.preload.c cVar);

        void b(int i, Map<String, List<String>> map);
    }

    void a();

    void a(b bVar);

    void a(String str, String str2, String str3, Boolean bool, c cVar);

    boolean d();

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(93691712);
        }

        public static void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ced5d67", new Object[]{fVar});
            } else {
                g.a.a(fVar);
            }
        }

        public static /* synthetic */ void a(f fVar, String str, String str2, String str3, Boolean bool, c cVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891b9157", new Object[]{fVar, str, str2, str3, bool, cVar, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            } else {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                String str4 = str2;
                if ((i & 4) != 0) {
                    str3 = null;
                }
                String str5 = str3;
                if ((i & 8) != 0) {
                    bool = null;
                }
                Boolean bool2 = bool;
                if ((i & 16) != 0) {
                    cVar = null;
                }
                fVar.a(str, str4, str5, bool2, cVar);
            }
        }
    }
}
