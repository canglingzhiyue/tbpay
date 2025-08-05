package com.taobao.android.cachecleaner;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import tb.dvq;
import tb.iga;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f9282a;

        static {
            kge.a(534633202);
            f9282a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7275c6de", new Object[0]) : f9282a;
        }
    }

    static {
        kge.a(910611006);
    }

    public static /* synthetic */ int a(c cVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0e7ecdd", new Object[]{cVar, context})).intValue() : cVar.a(context);
    }

    public static /* synthetic */ void a(c cVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c162359", new Object[]{cVar, context, new Integer(i)});
        } else {
            cVar.a(context, i);
        }
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7275c6de", new Object[0]) : a.a();
    }

    public void a(Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17661baa", new Object[]{this, context, cacheOverviewInfo});
        } else if (!com.taobao.android.cachecleaner.monitor.config.a.a().h().isLowStorageEnable()) {
            TLog.loge(CacheCleaner.MODULE, "LowStorageManager", "not enable");
        } else if (a(context) > 3) {
            TLog.loge(CacheCleaner.MODULE, "LowStorageManager", "close too many");
        } else if (dvq.b(context) / 1024 > com.taobao.android.cachecleaner.monitor.config.a.a().h().getLowStoragePopSys()) {
        } else {
            b(context, cacheOverviewInfo);
        }
    }

    private void b(final Context context, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7264f49", new Object[]{this, context, cacheOverviewInfo});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSize", (Object) Long.valueOf(cacheOverviewInfo.getTotalSize() / 1024));
        jSONObject.put("totalSize", (Object) Long.valueOf(cacheOverviewInfo.getTotalSize() / 1024));
        jSONObject.put("freeSize", (Object) Long.valueOf(cacheOverviewInfo.getAvailableSize() / 1024));
        com.alibaba.poplayer.trigger.g.a("poplayer://disk_clear_guide", jSONObject.toJSONString()).a(new g.a() { // from class: com.taobao.android.cachecleaner.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                }
            }

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                }
            }

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str, boolean z, boolean z2, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e47be646", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
                } else if (!z2) {
                } else {
                    if ("OnViewJSClose".equals(str2) && "handleClose".equals(str3)) {
                        TLog.loge(CacheCleaner.MODULE, "LowStorageManager", "userCloseClick");
                        c cVar = c.this;
                        Context context2 = context;
                        c.a(cVar, context2, c.a(cVar, context2) + 1);
                        return;
                    }
                    TLog.loge(CacheCleaner.MODULE, "LowStorageManager", "user Not close");
                    c.a(c.this, context, 0);
                }
            }
        }).a();
    }

    private void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(iga.CACHE_INFO_SP_NAME, 0).edit();
        edit.putInt("LowStorageManager", i);
        edit.apply();
    }

    private int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue() : context.getSharedPreferences(iga.CACHE_INFO_SP_NAME, 0).getInt("LowStorageManager", 0);
    }
}
