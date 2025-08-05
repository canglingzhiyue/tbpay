package com.taobao.uniinfra_kmp.common_utils;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "keepObj", "release", "", "common_utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface c {
    String getUuid();

    void setUuid(String str);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1152761884);
        }

        public static c a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c4122dce", new Object[]{cVar});
            }
            cVar.setUuid(d.INSTANCE.a(cVar));
            return cVar;
        }

        public static void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5056fb1a", new Object[]{cVar});
            } else {
                d.INSTANCE.a(cVar.getUuid());
            }
        }
    }
}
