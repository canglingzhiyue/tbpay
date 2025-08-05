package com.alibaba.android.ultron.vfw.storage;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/alibaba/android/ultron/vfw/storage/CacheHelper;", "", "()V", "Companion", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a {
    public static final C0103a Companion;
    public static final String SPLIT_BIZ_CODE = "_SPLIT_BIZ_CODE_";
    public static final String SPLIT_KEY_LIST = ",";

    static {
        kge.a(309423290);
        Companion = new C0103a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/alibaba/android/ultron/vfw/storage/CacheHelper$Companion;", "", "()V", "SPLIT_BIZ_CODE", "", "SPLIT_KEY_LIST", "buildRealKey", "bizCode", "key", "getBizCode", "getOriKey", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.alibaba.android.ultron.vfw.storage.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0103a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1605093502);
        }

        private C0103a() {
        }

        public /* synthetic */ C0103a(o oVar) {
            this();
        }

        public final String a(String bizCode, String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, bizCode, key});
            }
            q.d(bizCode, "bizCode");
            q.d(key, "key");
            return bizCode + a.SPLIT_BIZ_CODE + key;
        }
    }
}
