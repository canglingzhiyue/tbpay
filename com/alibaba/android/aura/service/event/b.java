package com.alibaba.android.aura.service.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.aqq;
import tb.arc;
import tb.arw;
import tb.arx;
import tb.baw;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q b;
    private f c;

    /* renamed from: a  reason: collision with root package name */
    private final String f2170a = "AURAEventCenter";
    private final Map<String, List<arw>> d = new ConcurrentHashMap();

    static {
        kge.a(-1026766670);
    }

    public b(q qVar, f fVar) {
        this.b = qVar;
        this.c = fVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f fVar = this.c;
        if (fVar == null) {
            arc.a().b("AURAEventCenter.registerEventAtRuntime:mAURAExtensionManager is null");
            return;
        }
        for (arw arwVar : fVar.b(arw.class)) {
            a(arwVar.e(), arwVar);
        }
    }

    public void a(String str, arw arwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2083087c", new Object[]{this, str, arwVar});
            return;
        }
        List<arw> list = this.d.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.d.put(str, list);
        } else if (list.contains(arwVar)) {
            return;
        }
        list.add(arwVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d.remove(str);
        }
    }

    public void a(AURAEventIO aURAEventIO, aqq<AURAEventIO> aqqVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce305363", new Object[]{this, aURAEventIO, aqqVar});
            return;
        }
        a();
        String eventType = aURAEventIO.getEventType();
        if (StringUtils.isEmpty(eventType)) {
            aqqVar.a(new com.alibaba.android.aura.b(1, "AURAEventServiceDomain", "-1000_EMPTY_TYPE", "执行事件失败, eventType 为空"));
            return;
        }
        List<arw> list = this.d.get(eventType);
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        if (z) {
            a(list, aURAEventIO, aqqVar);
        } else if (this.b.b().a(new com.alibaba.android.aura.nodemodel.branch.c("aura.branch.event.redirect", true, "default")) && a(aURAEventIO)) {
        } else {
            b(aURAEventIO, aqqVar);
        }
    }

    private void a(List<arw> list, AURAEventIO aURAEventIO, aqq<AURAEventIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466328d4", new Object[]{this, list, aURAEventIO, aqqVar});
            return;
        }
        for (arw arwVar : list) {
            if (arwVar != null) {
                try {
                    arwVar.a(aURAEventIO);
                } catch (Throwable th) {
                    String eventType = aURAEventIO.getEventType();
                    HashMap hashMap = new HashMap();
                    hashMap.put("eventType", eventType);
                    com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(1, "AURAEventServiceDomain", "-1002_EXECUTE_EXCEPTION", "执行事件【" + eventType + "】出错，errorMessage=" + th.getMessage());
                    bVar.a(hashMap);
                    aqqVar.a(bVar);
                    if (baw.a()) {
                        th.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
                        baw.a(th);
                    }
                }
            }
        }
    }

    private boolean a(AURAEventIO aURAEventIO) {
        List b;
        arx arxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d42ad8", new Object[]{this, aURAEventIO})).booleanValue();
        }
        f fVar = this.c;
        if (fVar == null || (b = fVar.b(arx.class)) == null || b.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < b.size() && ((arxVar = (arx) b.get(i)) == null || !(z = arxVar.a(aURAEventIO))); i++) {
        }
        return z;
    }

    private void b(AURAEventIO aURAEventIO, aqq<AURAEventIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1befcb64", new Object[]{this, aURAEventIO, aqqVar});
            return;
        }
        String eventType = aURAEventIO.getEventType();
        HashMap hashMap = new HashMap();
        hashMap.put("eventType", eventType);
        hashMap.put("event", aURAEventIO);
        com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(1, "AURAEventServiceDomain", "-1001_NOT_REGISTER", "没有注册事件:" + eventType);
        bVar.a(hashMap);
        aqqVar.a(bVar);
    }
}
