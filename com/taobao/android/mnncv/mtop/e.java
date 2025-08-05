package com.taobao.android.mnncv.mtop;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static f f14408a = new f("mtop.taobao.edgecomputer.query", "1.0", false, false, null, null, MethodEnum.GET);
    public static String b = null;
    private static volatile boolean c = false;

    /* loaded from: classes6.dex */
    public interface a {
        void a(MRTRuntimeException mRTRuntimeException, String str);
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : c(str);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : d(str);
    }

    public static void a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"edge_computer_update_info"}, new com.taobao.orange.d() { // from class: com.taobao.android.mnncv.mtop.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (map == null || !e.a(map.get("configVersion"))) {
                    } else {
                        com.taobao.mrt.thread.a.a().a(runnable, e.b(OrangeConfig.getInstance().getConfig(str, "maxDelayTime", "10")));
                    }
                }
            }, false);
        }
    }

    public static synchronized void a(String str, final a aVar) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4566532", new Object[]{str, aVar});
                return;
            }
            b = str;
            if (c) {
                return;
            }
            c = true;
            final long currentTimeMillis = System.currentTimeMillis();
            com.taobao.mrt.utils.c.c();
            a(f14408a, str, null, new a() { // from class: com.taobao.android.mnncv.mtop.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.mnncv.mtop.e.a
                public void a(MRTRuntimeException mRTRuntimeException, String str2) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84d11cb4", new Object[]{this, mRTRuntimeException, str2});
                        return;
                    }
                    e.a(false);
                    a aVar2 = a.this;
                    if (aVar2 != null) {
                        aVar2.a(mRTRuntimeException, str2);
                    }
                    if (mRTRuntimeException != null) {
                        z = false;
                    }
                    com.taobao.mrt.utils.c.a(z, System.currentTimeMillis() - currentTimeMillis);
                }
            });
        }
    }

    private static void a(f fVar, String str, Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d2dc01", new Object[]{fVar, str, map, aVar});
            return;
        }
        com.taobao.mrt.utils.a.b("MRTConfigRequest", "startRequest " + fVar.f14411a);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(fVar.f14411a);
        mtopRequest.setVersion(fVar.b);
        mtopRequest.setNeedEcode(fVar.d);
        mtopRequest.setNeedSession(fVar.c);
        if (map == null || map.isEmpty()) {
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(fVar.e));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            if (fVar.e != null) {
                hashMap.putAll(fVar.e);
            }
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.mo1332ttid(str);
        build.mo1342showLoginUI(fVar.g);
        build.mo1305reqMethod(MethodEnum.GET);
        build.requestContext = fVar;
        if (fVar.h) {
            build.mo1335useWua();
        }
        final b bVar = null;
        if (aVar != null) {
            bVar = new b(aVar);
        }
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.mnncv.mtop.MRTConfigRequest$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    str2 = "ret code:" + mtopResponse.getRetCode() + " err msg:" + mtopResponse.getRetMsg();
                } else {
                    str2 = null;
                }
                com.taobao.mrt.utils.a.b("MRTConfigRequest", "onSystemError :" + str2);
                b bVar2 = b.this;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(new MRTRuntimeException(81, str2), null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str2;
                Object obj2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                com.taobao.mrt.utils.a.b("MRTConfigRequest", "onSuccess " + mtopResponse);
                if (b.this == null) {
                    return;
                }
                if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                    try {
                        obj2 = mtopResponse.getDataJsonObject().get("config");
                    } catch (Throwable th) {
                        com.taobao.mrt.utils.a.a("MRTConfigRequest", "", th);
                    }
                    if (obj2 != null) {
                        str2 = obj2.toString();
                        b.this.a(null, str2);
                    }
                }
                str2 = null;
                b.this.a(null, str2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    str2 = "ret code:" + mtopResponse.getRetCode() + " err msg:" + mtopResponse.getRetMsg();
                } else {
                    str2 = null;
                }
                com.taobao.mrt.utils.a.d("MRTConfigRequest", "onError :" + str2);
                b bVar2 = b.this;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(new MRTRuntimeException(81, str2), null);
            }
        });
        build.startRequest();
        com.taobao.mrt.utils.a.b("MRTConfigRequest", "startRequest ");
    }

    private static boolean c(String str) {
        Context b2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (b2 = com.taobao.mrt.c.b()) == null || (sharedPreferences = b2.getSharedPreferences(com.tmall.android.dai.internal.config.d.DAI_ORANGE_SWITCH, 0)) == null) {
            return false;
        }
        String string = sharedPreferences.getString("walleConfigVersion", null);
        if (!TextUtils.isEmpty(string)) {
            z = true ^ str.equalsIgnoreCase(string);
        }
        if (z && (edit = b2.getSharedPreferences(com.tmall.android.dai.internal.config.d.DAI_ORANGE_SWITCH, 0).edit()) != null) {
            edit.putString("walleConfigVersion", str).apply();
        }
        return z;
    }

    private static int d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue();
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            com.taobao.mrt.utils.a.c("MRTConfigRequest", "parse delay string failed. delayStr:" + str);
        }
        return new Random().nextInt(i + 1) * 1000;
    }
}
