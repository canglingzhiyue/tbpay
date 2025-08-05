package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.monitor.model.AURABlockDataModel;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@AURAExtensionImpl(code = azc.AURA_CODE)
/* loaded from: classes2.dex */
public final class azc extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CODE = "aura.impl.aspect.error.alarm.monitor";

    /* renamed from: a  reason: collision with root package name */
    private UMLinkLogInterface f25710a;
    private ExecutorService b;
    private azd c;
    private List<azg> d;
    private List<azf> e;
    private List<hih> f;

    static {
        kge.a(1194676152);
    }

    public static /* synthetic */ Object ipc$super(azc azcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1219783041) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ azd a(azc azcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (azd) ipChange.ipc$dispatch("99c5d98d", new Object[]{azcVar}) : azcVar.c;
    }

    public static /* synthetic */ void a(azc azcVar, b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc563c1e", new Object[]{azcVar, bVar, new Long(j)});
        } else {
            azcVar.a(bVar, j);
        }
    }

    public static /* synthetic */ AURAGlobalData b(azc azcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("dbbb37e5", new Object[]{azcVar}) : azcVar.b();
    }

    @Override // tb.arm, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f25710a = bpp.a();
        this.d = fVar.b(azg.class);
        this.e = fVar.b(azf.class);
        this.f = fVar.b(hih.class);
        this.b = bbh.a(1, 3, 3L, TimeUnit.SECONDS, "AURAUserTrackEvent");
        this.c = new azd(qVar.d());
    }

    @Override // tb.aro
    public void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else if (d(bVar)) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            this.b.execute(new Runnable() { // from class: tb.azc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    azc.a(azc.this, bVar, currentTimeMillis);
                    if (azc.a(azc.this) == null || !baz.a("enableJsTracker", true, true)) {
                        return;
                    }
                    azc.a(azc.this).a(azc.b(azc.this));
                    azc.a(azc.this).a(bVar);
                }
            });
        }
    }

    private boolean d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5ee4587", new Object[]{this, bVar})).booleanValue();
        }
        List<hih> list = this.f;
        if (list == null) {
            return false;
        }
        for (hih hihVar : list) {
            if (hihVar.a(bVar)) {
                return true;
            }
        }
        return false;
    }

    private void a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607b9544", new Object[]{this, bVar, new Long(j)});
        } else if (c()) {
            String d = a().d();
            String f = bVar.f();
            String a2 = bVar.a();
            String format = String.format("%s_%s", f, a2);
            String b = bVar.b();
            AURABlockDataModel b2 = b(bVar);
            HashMap<String, String> c = c(bVar);
            c.put("auraTime", String.valueOf(j));
            if (b2 != null) {
                c.put("sliceLinkId", b2.getLinkId());
                c.put("sliceCount", String.valueOf(b2.getSliceDataList().size()));
            }
            a(f, a2, d, format, b, c);
            if (b2 == null) {
                return;
            }
            for (AURABlockDataModel.AURASliceDataModel aURASliceDataModel : b2.getSliceDataList()) {
                HashMap hashMap = new HashMap();
                hashMap.put("sliceLinkId", aURASliceDataModel.getSliceLinkId());
                hashMap.put("sliceNum", aURASliceDataModel.getSliceNum());
                hashMap.put("sliceData", aURASliceDataModel.getData());
                a(f, a2, d, format, b, hashMap);
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<azf> list = this.e;
        if (list == null) {
            return true;
        }
        Iterator<azf> it = list.iterator();
        if (!it.hasNext()) {
            return true;
        }
        return it.next().a();
    }

    private AURABlockDataModel b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("4cf4452e", new Object[]{this, bVar});
        }
        List<azg> list = this.d;
        if (list == null) {
            return null;
        }
        for (azg azgVar : list) {
            AURABlockDataModel a2 = azgVar.a(bVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private HashMap<String, String> c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7b072265", new Object[]{this, bVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bizCode", a().d());
        Map<String, Object> c = bVar.c();
        if (c != null) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Map) {
                    hashMap.put(entry.getKey(), bba.b(value));
                } else {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        c e = bVar.e();
        if (e != null) {
            hashMap.put("serviceCode", e.c());
            hashMap.put("flowCode", e.d());
        }
        return hashMap;
    }

    private void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        this.f25710a.logError("AURAMonitor", str3, str, null, str4, str5, null, a.a(map));
        this.f25710a.commitFailure(str, str2, "1.0", "AURAMonitor", str3, map, str4, str5);
        ard a2 = arc.a();
        a2.c(arc.AURA_LOGGER, "onError", str3 + "|" + str + "|" + str4 + "|" + str5 + "|" + map);
    }

    @Override // tb.arm, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.b;
        if (executorService != null && !executorService.isShutdown()) {
            this.b.shutdown();
        }
        this.b = null;
    }
}
