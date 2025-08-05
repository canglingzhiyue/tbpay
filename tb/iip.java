package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.iis;

/* loaded from: classes6.dex */
public final class iip implements iis.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iis.a f29054a;

    public iip(iis.a aVar) {
        this.f29054a = aVar;
    }

    @Override // tb.iis.a
    public void a(final iir iirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbe3e46", new Object[]{this, iirVar});
            return;
        }
        ikq.a("extract-tracker", new Runnable() { // from class: tb.iip.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(ikn.ARGS_LIB_NAME, iirVar.a());
                if (!iirVar.g()) {
                    ikq.a(ikn.POINT_EXTRACT, hashMap, iirVar.f());
                    return;
                }
                hashMap.put(ikn.ARGS_EXTRACT_COMPRESSED_PATH, iirVar.b());
                hashMap.put(ikn.ARGS_EXTRACT_EXTRACTED_PATH, iirVar.d());
                hashMap.putAll(iirVar.e().a());
                ikq.b(ikn.POINT_EXTRACT, hashMap);
            }
        });
        iis.a aVar = this.f29054a;
        if (aVar == null) {
            return;
        }
        aVar.a(iirVar);
    }
}
