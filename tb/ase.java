package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ase {

    /* loaded from: classes2.dex */
    public interface a {
        <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t);

        <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list);

        void a(List<com.alibaba.android.aura.datamodel.nextrpc.a> list);

        void b(com.alibaba.android.aura.datamodel.nextrpc.a aVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        asj a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2);

        void a(String str, Map<String, String> map);
    }

    void a();

    void a(AURANextRPCEndpoint aURANextRPCEndpoint, a aVar);

    void a(AURANextRPCEndpoint aURANextRPCEndpoint, a aVar, b bVar);
}
