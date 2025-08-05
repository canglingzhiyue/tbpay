package com.taobao.themis.open.extension;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "createJSRuntime", "Lcom/taobao/themis/open/extension/IGameJSRuntimeExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getRuntimeType", "Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "setRuntimeType", "", "type", "Type", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface IJSRuntimeFactoryExtension extends sud {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/extension/IJSRuntimeFactoryExtension$Type;", "", "(Ljava/lang/String;I)V", "Qking", "V8", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum Type {
        Qking,
        V8
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(639448156);
        }

        public static void a(IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5288e324", new Object[]{iJSRuntimeFactoryExtension, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(iJSRuntimeFactoryExtension, instance);
        }

        public static void b(IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("380195fe", new Object[]{iJSRuntimeFactoryExtension});
            } else {
                sud.a.b(iJSRuntimeFactoryExtension);
            }
        }
    }

    Type a();

    b a(ITMSPage iTMSPage);

    void a(Type type);
}
