package com.taobao.android.detail.ttdetail.monitor;

import android.app.Application;
import android.content.pm.PackageManager;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.ReportErrorParams;
import com.taobao.android.detail.ttdetail.utils.h;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.ojs;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/monitor/TTDetailReportErrorController;", "", "()V", "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TTDetailReportErrorController";

    /* renamed from: a  reason: collision with root package name */
    private static String f10770a;

    static {
        kge.a(-428829865);
        Companion = new a(null);
    }

    public static final /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f10770a;
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f10770a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J7\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/detail/ttdetail/monitor/TTDetailReportErrorController$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "version", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "commitFail", "", IWXUserTrackAdapter.MONITOR_ARG, "", "errorCode", "", "(Ljava/util/Map;Ljava/lang/Integer;)V", "getCodeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/Integer;)Ljava/util/HashMap;", "getVersionName", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(73235935);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : b.a();
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                b.a(str);
            }
        }

        public final void a(Map<String, String> map, Integer num) {
            String str;
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a81913a", new Object[]{this, map, num});
                return;
            }
            HashMap<Integer, String> a2 = a(num);
            if (a2 == null) {
                return;
            }
            ReportErrorParams reportErrorParams = new ReportErrorParams();
            reportErrorParams.setApp("Android");
            if (map == null || (str = map.get("itemId")) == null) {
                str = "";
            }
            reportErrorParams.setItemId(str);
            String str5 = a2.get(num);
            if (str5 == null) {
                str5 = "";
            }
            reportErrorParams.setCode(str5);
            if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
                str2 = "";
            }
            reportErrorParams.setSubCode(str2);
            if (map == null || (str3 = JSON.toJSONString(map)) == null) {
                str3 = "";
            }
            reportErrorParams.setFeature(str3);
            if (map == null || (str4 = map.get("traceId")) == null) {
                str4 = "";
            }
            reportErrorParams.setTraceId(str4);
            String b = b.Companion.b();
            if (b == null) {
                b = "";
            }
            reportErrorParams.setVersion(b);
            ojs ojsVar = new ojs(reportErrorParams);
            ojsVar.a(new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.monitor.TTDetailReportErrorController$Companion$commitFail$1$2$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        i.a(b.TAG, "onSuccess");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        i.a(b.TAG, "onSystemError");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        i.a(b.TAG, "onError");
                    }
                }
            });
            ojsVar.k();
        }

        private final HashMap<Integer, String> a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("a92e74b2", new Object[]{this, num});
            }
            HashMap<Integer, String> hashMap = null;
            HashMap<String, Integer[]> a2 = com.taobao.android.detail.ttdetail.monitor.a.Companion.a();
            Set<String> keySet = a2.keySet();
            if (keySet != null) {
                for (String str : keySet) {
                    Integer[] numArr = a2.get(str);
                    if (numArr != null) {
                        HashMap<Integer, String> hashMap2 = hashMap;
                        for (Integer num2 : numArr) {
                            int intValue = num2.intValue();
                            if (num != null && intValue == num.intValue()) {
                                hashMap2 = new HashMap<>();
                                hashMap2.put(Integer.valueOf(intValue), str);
                            }
                        }
                        hashMap = hashMap2;
                    }
                }
            }
            return hashMap;
        }

        private final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            a aVar = this;
            if (aVar.a() != null) {
                return aVar.a();
            }
            try {
                Application a2 = h.a();
                q.a((Object) a2, "AppUtils.getApplication()");
                PackageManager packageManager = a2.getPackageManager();
                Application a3 = h.a();
                q.a((Object) a3, "AppUtils.getApplication()");
                a(packageManager.getPackageInfo(a3.getPackageName(), 0).versionName);
            } catch (Throwable th) {
                i.a(b.TAG, "getVersionName error", th);
            }
            return aVar.a();
        }
    }
}
