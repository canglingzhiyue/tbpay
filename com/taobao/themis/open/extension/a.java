package com.taobao.themis.open.extension;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/open/extension/IFrameworkExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "getFrameworkId", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface a extends sud {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.extension.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0959a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2076421611);
        }

        public static void a(a aVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f9d33a", new Object[]{aVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(aVar, instance);
        }

        public static void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b05f6", new Object[]{aVar});
            } else {
                sud.a.b(aVar);
            }
        }
    }

    String a();
}
