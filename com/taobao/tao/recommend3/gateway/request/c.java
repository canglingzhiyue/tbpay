package com.taobao.tao.recommend3.gateway.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.osz;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20915a;
    private osz.a b;
    private ConcurrentHashMap<String, LinkedList<RequestTask>> c = new ConcurrentHashMap<>();

    static {
        kge.a(-1912755030);
    }

    public static /* synthetic */ osz.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osz.a) ipChange.ipc$dispatch("9e17785a", new Object[]{cVar}) : cVar.b;
    }

    public c() {
        this.f20915a = false;
        this.f20915a = true;
    }

    public void a(osz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8dfa5", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public RequestTask a(final String str, final AwesomeGetRequestParams awesomeGetRequestParams, final a aVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("16877ef3", new Object[]{this, str, awesomeGetRequestParams, aVar, dVar});
        }
        osz.a aVar2 = this.b;
        if (aVar2 instanceof osz.b) {
            ((osz.b) aVar2).a(str, awesomeGetRequestParams, aVar);
        }
        TLog.logd("gateway2-GatewayRequestService.request", str + "," + aVar.b);
        final RequestTask requestTask = new RequestTask(awesomeGetRequestParams, aVar);
        synchronized (this) {
            LinkedList<RequestTask> linkedList = this.c.get(str);
            if (linkedList == null) {
                LinkedList<RequestTask> linkedList2 = new LinkedList<>();
                linkedList2.add(requestTask);
                this.c.put(str, linkedList2);
            } else {
                linkedList.add(requestTask);
            }
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "containerId=" + str + ";requestType=" + requestTask.a(str));
        final String a2 = a(awesomeGetRequestParams, str);
        requestTask.a(new d() { // from class: com.taobao.tao.recommend3.gateway.request.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a();
                }
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).a(str, awesomeGetRequestParams, a2, aVar.d);
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(final AwesomeGetData awesomeGetData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
                    return;
                }
                if (c.a(c.this) != null) {
                    c.a(c.this).a(str, a2, awesomeGetData, aVar.d);
                }
                Coordinator.execute(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.c.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!c.this.b(requestTask, str)) {
                        } else {
                            if (dVar != null) {
                                dVar.a(awesomeGetData);
                            }
                            c.this.a(requestTask, str);
                        }
                    }
                });
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(final String str2, final String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                Coordinator.execute(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.c.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!c.this.b(requestTask, str)) {
                        } else {
                            if (dVar != null) {
                                dVar.a(str2, str3);
                            }
                            c.this.a(requestTask, str);
                        }
                    }
                });
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).a(a2, str2, str3);
            }
        }, hashMap);
        return requestTask;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
        if (r9 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
        if (r9 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
        r0.f20919a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        r0.f20919a = true;
        r9 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
        if (r9.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
        r9.next().c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0115, code lost:
        r1.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.taobao.tao.recommend3.gateway.request.f a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.gateway.request.c.a(java.lang.String, java.lang.String, java.lang.String):com.taobao.tao.recommend3.gateway.request.f");
    }

    public synchronized void a(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36d5892", new Object[]{this, requestTask, str});
            return;
        }
        LinkedList<RequestTask> linkedList = this.c.get(str);
        if (linkedList != null && !linkedList.isEmpty()) {
            linkedList.remove(requestTask);
        }
    }

    public synchronized boolean b(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc6eaa35", new Object[]{this, requestTask, str})).booleanValue();
        }
        LinkedList<RequestTask> linkedList = this.c.get(str);
        return linkedList != null && linkedList.contains(requestTask);
    }

    private String a(AwesomeGetRequestParams awesomeGetRequestParams, String str) {
        Map<String, AwesomeGetContainerParams> map;
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c050c176", new Object[]{this, awesomeGetRequestParams, str});
        }
        if (awesomeGetRequestParams != null && (map = awesomeGetRequestParams.containerParams) != null && !map.isEmpty() && (awesomeGetContainerParams = map.get(str)) != null) {
            return awesomeGetContainerParams.requestType;
        }
        return null;
    }
}
