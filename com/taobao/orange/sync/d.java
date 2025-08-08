package com.taobao.orange.sync;

import mtopsdk.common.util.StringUtils;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.orange.util.OLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import tb.kge;

/* loaded from: classes.dex */
public class d implements Interceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1737316669);
        kge.a(-1880375123);
    }

    @Override // anetwork.channel.interceptor.Interceptor
    public Future intercept(final Interceptor.Chain chain) {
        boolean z;
        Request.Builder newBuilder;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("793d1164", new Object[]{this, chain});
        }
        Request request = chain.request();
        Callback callback = chain.callback();
        if (com.taobao.orange.a.v != OConstant.UPDMODE.O_EVENT && !StringUtils.isEmpty(request.getHost()) && !com.taobao.orange.a.u.isEmpty()) {
            for (String str : com.taobao.orange.a.u) {
                if (request.getHost().contains(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (com.taobao.orange.a.A && com.taobao.orange.a.d && OConstant.SUB_PROCESS_INDEX_QUERY_HOSTS[com.taobao.orange.a.J.getEnvMode()].equals(request.getHost())) {
            z2 = true;
            z = true;
        }
        if (z) {
            if (com.taobao.orange.a.y > 0) {
                if (z2) {
                    newBuilder = chain.request().newBuilder().setAllowRequestInBg(true);
                } else {
                    newBuilder = chain.request().newBuilder();
                }
                Request.Builder a2 = a(newBuilder);
                int i = com.taobao.orange.a.y;
                if (i == 1) {
                    if (!StringUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader("a-orange-q", com.taobao.orange.a.n);
                    }
                    if (!StringUtils.isEmpty(com.taobao.orange.a.o)) {
                        a2.addHeader("a-orange-dq", com.taobao.orange.a.o);
                    }
                    request = a2.build();
                } else if (i == 2) {
                    if (!StringUtils.isEmpty(com.taobao.orange.a.o)) {
                        a2.addHeader("a-orange-dq", com.taobao.orange.a.o);
                    }
                    if (com.taobao.orange.a.I && !StringUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader("a-orange-q", com.taobao.orange.a.n);
                    }
                    request = a2.build();
                } else {
                    if (!StringUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader("a-orange-q", com.taobao.orange.a.n);
                    }
                    request = a2.build();
                }
            } else if (!StringUtils.isEmpty(com.taobao.orange.a.n)) {
                Request.Builder a3 = a(chain.request().newBuilder());
                if (z2) {
                    request = a3.setAllowRequestInBg(true).addHeader("a-orange-q", com.taobao.orange.a.n).build();
                } else {
                    request = a3.addHeader("a-orange-q", com.taobao.orange.a.n).build();
                }
            }
            callback = new Callback() { // from class: com.taobao.orange.sync.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anetwork.channel.interceptor.Callback
                public void onResponseCode(int i2, final Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i2), map});
                        return;
                    }
                    if (map != null) {
                        if (com.taobao.orange.a.y > 0) {
                            if (com.taobao.orange.a.I && map.containsKey("a-orange-p")) {
                                com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.sync.d.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            com.taobao.orange.util.a.a();
                                            String a4 = d.a(map, "a-orange-p");
                                            com.taobao.orange.a.z = "a-orange-p";
                                            IndexUpdateHandler.a(a4, false);
                                        } catch (Throwable th) {
                                            OLog.e("NetworkInterceptor", "intercept", th, new Object[0]);
                                        }
                                    }
                                });
                            } else if (map.containsKey("a-orange-dp")) {
                                com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.sync.d.1.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            com.taobao.orange.util.a.a();
                                            String a4 = d.a(map, "a-orange-dp");
                                            com.taobao.orange.a.z = "a-orange-dp";
                                            IndexUpdateHandler.a(a4, false);
                                        } catch (Throwable th) {
                                            OLog.e("NetworkInterceptor", "intercept", th, new Object[0]);
                                        }
                                    }
                                });
                            } else if (map.containsKey("a-orange-p")) {
                                com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.sync.d.1.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            com.taobao.orange.util.a.a();
                                            String a4 = d.a(map, "a-orange-p");
                                            com.taobao.orange.a.z = "a-orange-p";
                                            IndexUpdateHandler.a(a4, false);
                                        } catch (Throwable th) {
                                            OLog.e("NetworkInterceptor", "intercept", th, new Object[0]);
                                        }
                                    }
                                });
                            }
                        } else if (map.containsKey("a-orange-p")) {
                            com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.sync.d.1.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        com.taobao.orange.util.a.a();
                                        String a4 = d.a(map, "a-orange-p");
                                        com.taobao.orange.a.z = "a-orange-p";
                                        IndexUpdateHandler.a(a4, false);
                                    } catch (Throwable th) {
                                        OLog.e("NetworkInterceptor", "intercept", th, new Object[0]);
                                    }
                                }
                            });
                        }
                    }
                    chain.callback().onResponseCode(i2, map);
                }

                @Override // anetwork.channel.interceptor.Callback
                public void onDataReceiveSize(int i2, int i3, ByteArray byteArray) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d30133c3", new Object[]{this, new Integer(i2), new Integer(i3), byteArray});
                    } else {
                        chain.callback().onDataReceiveSize(i2, i3, byteArray);
                    }
                }

                @Override // anetwork.channel.interceptor.Callback
                public void onFinish(DefaultFinishEvent defaultFinishEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1eb0dbf1", new Object[]{this, defaultFinishEvent});
                    } else {
                        chain.callback().onFinish(defaultFinishEvent);
                    }
                }
            };
        }
        return chain.proceed(request, callback);
    }

    private Request.Builder a(Request.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request.Builder) ipChange.ipc$dispatch("3f4fc26e", new Object[]{this, builder});
        }
        if (com.taobao.orange.a.E) {
            if (OConstant.ENV.ONLINE == com.taobao.orange.a.J) {
                builder.addHeader("a-orange-env", "prod");
            } else if (OConstant.ENV.PREPARE == com.taobao.orange.a.J) {
                builder.addHeader("a-orange-env", "pre");
            } else if (OConstant.ENV.TEST == com.taobao.orange.a.J) {
                builder.addHeader("a-orange-env", "daily");
            }
        }
        return builder;
    }

    public static String a(Map<String, List<String>> map, String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            if (str.equalsIgnoreCase(next.getKey())) {
                list = next.getValue();
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            OLog.w("NetworkInterceptor", "getOrangeFromKey fail", "not exist a-orange-p");
            return null;
        }
        for (String str2 : list) {
            if (str2 != null && str2.startsWith(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID)) {
                if (OLog.isPrintLog(1)) {
                    OLog.d("NetworkInterceptor", "getOrangeFromKey", "value", str2);
                }
                try {
                    return URLDecoder.decode(str2, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    OLog.w("NetworkInterceptor", "getOrangeFromKey", e, new Object[0]);
                    return null;
                }
            }
        }
        OLog.w("NetworkInterceptor", "getOrangeFromKey fail", "parseValue no resourceId");
        return null;
    }
}
