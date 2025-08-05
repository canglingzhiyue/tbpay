package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.request.RequestTask;
import com.taobao.informationflowdataservice.dataservice.core.datasource.request.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.request.b;
import com.taobao.themis.kernel.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class lwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30957a;
    private ConcurrentHashMap<String, LinkedList<RequestTask>> b = new ConcurrentHashMap<>();

    static {
        kge.a(685154711);
    }

    public lwu() {
        this.f30957a = false;
        this.f30957a = true;
    }

    public RequestTask a(final String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("d4f80441", new Object[]{this, str, awesomeGetRequestParams, aVar, bVar});
        }
        lxo.b("gateway2-GatewayRequestService.request", str + "," + aVar.b);
        final RequestTask requestTask = new RequestTask(awesomeGetRequestParams, aVar);
        synchronized (this) {
            LinkedList<RequestTask> linkedList = this.b.get(str);
            if (linkedList == null) {
                LinkedList<RequestTask> linkedList2 = new LinkedList<>();
                linkedList2.add(requestTask);
                this.b.put(str, linkedList2);
            } else {
                linkedList.add(requestTask);
            }
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, a(requestTask.b(), requestTask.a(str)));
        requestTask.a(new b() { // from class: tb.lwu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.request.b
            public void a(final AwesomeGetData awesomeGetData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ab53f9d", new Object[]{this, awesomeGetData});
                } else {
                    lxs.a().a(new Runnable() { // from class: tb.lwu.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!lwu.this.b(requestTask, str)) {
                            } else {
                                if (bVar != null) {
                                    bVar.a(awesomeGetData);
                                }
                                lwu.this.a(requestTask, str);
                            }
                        }
                    });
                }
            }

            @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.request.b
            public void a(final String str2, final String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                } else {
                    lxs.a().a(new Runnable() { // from class: tb.lwu.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!lwu.this.b(requestTask, str)) {
                            } else {
                                if (bVar != null) {
                                    bVar.a(str2, str3);
                                }
                                lwu.this.a(requestTask, str);
                            }
                        }
                    });
                }
            }
        }, hashMap);
        return requestTask;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f0, code lost:
        if (r9 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
        if (r9 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f5, code lost:
        r0.f17587a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f8, code lost:
        r0.f17587a = true;
        r9 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
        if (r9.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
        r9.next().c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
        r1.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.taobao.informationflowdataservice.dataservice.core.datasource.request.d a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lwu.a(java.lang.String, java.lang.String, java.lang.String):com.taobao.informationflowdataservice.dataservice.core.datasource.request.d");
    }

    public synchronized void a(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb616bf8", new Object[]{this, requestTask, str});
            return;
        }
        LinkedList<RequestTask> linkedList = this.b.get(str);
        if (linkedList != null && !linkedList.isEmpty()) {
            linkedList.remove(requestTask);
        }
    }

    public synchronized boolean b(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bdc819b", new Object[]{this, requestTask, str})).booleanValue();
        }
        LinkedList<RequestTask> linkedList = this.b.get(str);
        return linkedList != null && linkedList.contains(requestTask);
    }

    private String a(Collection<String> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79dedd5d", new Object[]{this, collection, str});
        }
        StringBuilder sb = new StringBuilder();
        if (collection != null && collection.size() > 0) {
            for (String str2 : collection) {
                sb.append(str2);
                sb.append("=");
                sb.append(true);
                sb.append(";");
            }
        }
        sb.append("containerId");
        sb.append("=");
        sb.append("newface_home_sub");
        sb.append(";");
        sb.append(i.CDN_REQUEST_TYPE);
        sb.append("=");
        sb.append(str);
        return sb.toString();
    }
}
