package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.i;
import com.taobao.homepage.utils.n;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.RequestTask;
import com.taobao.tao.recommend3.gateway.request.StreamRequestTask;
import com.taobao.tao.recommend3.gateway.request.a;
import com.taobao.tao.recommend3.gateway.request.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class oqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f32292a;
    private ConcurrentHashMap<String, LinkedList<RequestTask>> b = new ConcurrentHashMap<>();

    static {
        kge.a(3768398);
    }

    public static /* synthetic */ void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{str, runnable});
        } else {
            b(str, runnable);
        }
    }

    public oqj() {
        this.f32292a = false;
        this.f32292a = true;
    }

    public RequestTask a(final String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar, final d dVar) {
        RequestTask requestTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTask) ipChange.ipc$dispatch("16877ef3", new Object[]{this, str, awesomeGetRequestParams, aVar, dVar});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(str);
        final String str2 = awesomeGetContainerParams != null ? awesomeGetContainerParams.requestType : null;
        if (TextUtils.isEmpty(c)) {
            c = str2;
            if (LauncherRuntime.k == 0) {
                ksr.c(str2, "firstRequestType");
            }
        }
        if (i.c(str2)) {
            requestTask = new StreamRequestTask(awesomeGetRequestParams, aVar);
        } else {
            requestTask = new RequestTask(awesomeGetRequestParams, aVar);
        }
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
        final boolean equals = "coldStart".equals(str2);
        final String b = HomePageUtility.b(requestTask.b());
        HashMap hashMap = new HashMap(2);
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "dosa");
        hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, a(requestTask.b(), str2));
        final RequestTask requestTask2 = requestTask;
        requestTask.a(new d() { // from class: tb.oqj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (equals) {
                    gvj.a("hNet", "request");
                }
                com.taobao.tao.recommend3.tracelog.a.a(str2 + "MtopRequest", str2, b);
                d dVar2 = dVar;
                if (dVar2 == null) {
                    return;
                }
                dVar2.a();
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(final AwesomeGetData awesomeGetData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
                    return;
                }
                if (equals) {
                    gvj.b("hNet", "request");
                }
                com.taobao.tao.recommend3.tracelog.a.a(str2 + "MtopRequest", true, str2, b);
                oqj.a(str2, new Runnable() { // from class: tb.oqj.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!oqj.this.b(requestTask2, str)) {
                        } else {
                            if (dVar != null) {
                                com.taobao.tao.recommend3.tracelog.a.a(str2 + "DataProcess", str2, b);
                                dVar.a(awesomeGetData);
                                com.taobao.tao.recommend3.tracelog.a.a(str2 + "DataProcess", true, str2, b);
                            }
                            if (awesomeGetData.isFirstReturn) {
                                laq b2 = laq.a().a("MTopRequest").b("handleRequest");
                                b2.c("DataProcess isFirstReturn " + str2).b();
                                return;
                            }
                            laq b3 = laq.a().a("MTopRequest").b("handleRequest");
                            b3.c("DataProcess removeTask " + str2).b();
                            oqj.this.a(requestTask2, str);
                        }
                    }
                });
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(final String str3, final String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                    return;
                }
                com.taobao.tao.recommend3.tracelog.a.a(str2 + "MtopRequest", false, str2, b);
                oqj.a(str2, new Runnable() { // from class: tb.oqj.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!oqj.this.b(requestTask2, str)) {
                        } else {
                            if (dVar != null) {
                                com.taobao.tao.recommend3.tracelog.a.a(str2 + "DataProcess", str2, b);
                                dVar.a(str3, str4);
                                com.taobao.tao.recommend3.tracelog.a.a(str2 + "DataProcess", false, str2, b);
                            }
                            oqj.this.a(requestTask2, str);
                        }
                    }
                });
            }
        }, hashMap);
        return requestTask;
    }

    private static void b(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af189871", new Object[]{str, runnable});
        } else if (n.a(str)) {
            runnable.run();
        } else {
            Coordinator.execute(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x012b, code lost:
        if (r9 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012d, code lost:
        if (r9 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
        r0.f20919a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
        r0.f20919a = true;
        r9 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
        if (r9.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013f, code lost:
        r9.next().c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        r1.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.taobao.tao.recommend3.gateway.request.f a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oqj.a(java.lang.String, java.lang.String, java.lang.String):com.taobao.tao.recommend3.gateway.request.f");
    }

    public synchronized void a(RequestTask requestTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36d5892", new Object[]{this, requestTask, str});
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
            return ((Boolean) ipChange.ipc$dispatch("bc6eaa35", new Object[]{this, requestTask, str})).booleanValue();
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
        sb.append(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        sb.append("=");
        sb.append(str);
        return sb.toString();
    }
}
