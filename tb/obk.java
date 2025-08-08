package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f31890a;

    /* loaded from: classes8.dex */
    public interface a {
        String a();

        void a(boolean z);

        boolean a(com.taobao.share.globalmodel.b bVar);

        void onEvent(com.taobao.share.globalmodel.b bVar);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static obk f31891a;

        static {
            kge.a(114905863);
            f31891a = new obk();
        }

        public static /* synthetic */ obk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (obk) ipChange.ipc$dispatch("f089726", new Object[0]) : f31891a;
        }
    }

    static {
        kge.a(-1583755829);
    }

    private obk() {
        this.f31890a = new ConcurrentHashMap<>();
    }

    public static obk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (obk) ipChange.ipc$dispatch("f089726", new Object[0]) : b.a();
    }

    public void onEvent(com.taobao.share.globalmodel.b bVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b9073b", new Object[]{this, bVar});
        } else if (bVar == null || this.f31890a.isEmpty() || (aVar = this.f31890a.get(b(bVar))) == null) {
        } else {
            aVar.onEvent(bVar);
        }
    }

    public void a(com.taobao.share.ui.engine.structure.a aVar) {
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ef7c87", new Object[]{this, aVar});
        } else if (aVar == null || this.f31890a.isEmpty() || (aVar2 = this.f31890a.get(b(aVar))) == null) {
        } else {
            aVar2.a(true);
        }
    }

    private String b(com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edee24be", new Object[]{this, bVar});
        }
        if ((bVar instanceof com.taobao.share.ui.engine.structure.a) && obh.o().indexOf(bVar.b()) >= 0) {
            return bVar.b();
        }
        String d = obh.d(bVar.b());
        TBShareContent a2 = bVar.a().a();
        String str = "";
        if (!StringUtils.isEmpty(d)) {
            if (!StringUtils.equals("saveVideo", bVar.b())) {
                return d;
            }
            if (a2 != null && a2.extraParams != null && StringUtils.equals("true", a2.extraParams.get("isMarvelScheme"))) {
                return d;
            }
            StringBuilder sb = new StringBuilder();
            if (a2 != null) {
                str = a2.businessId;
            }
            sb.append(str);
            sb.append("_");
            sb.append(bVar.b());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        if (a2 != null) {
            str = a2.businessId;
        }
        sb2.append(str);
        sb2.append("_");
        sb2.append(bVar.b());
        return sb2.toString();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67063f03", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f31890a.put(aVar.a(), aVar);
        }
    }

    public boolean a(com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c8f04a5", new Object[]{this, bVar})).booleanValue();
        }
        a aVar = this.f31890a.get(b(bVar));
        if (aVar == null) {
            return true;
        }
        return aVar.a(bVar);
    }
}
