package com.taobao.android.diagnose.collector;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.config.UTCollectConfig;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.EventLogger;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class h extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.ut.mini.module.plugin.a d;
    public UTCollectConfig e;

    static {
        kge.a(-1011881312);
    }

    public h(Application application, com.taobao.android.diagnose.model.a aVar) {
        super(application, aVar);
        this.d = null;
    }

    @Override // com.taobao.android.diagnose.collector.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.e = com.taobao.android.diagnose.config.a.h();
            if (!this.e.isEnable) {
                v.a("UTInfoCollector", "The UT Collect is disable");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (this.e.isClickEnable && !this.e.clickPageWhiteList.isEmpty()) {
                arrayList.add(2101);
            }
            if (arrayList.isEmpty() || this.d != null) {
                return;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
                v.a("UTInfoCollector", "Register ut event: " + iArr[i]);
            }
            this.d = new a(this.e, iArr);
            UTAnalytics.getInstance().registerPlugin(this.d, false, null, null);
            v.a("UTInfoCollector", "Register ut plugin!");
        } catch (Exception e) {
            v.a("UTInfoCollector", "init ", e);
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends com.ut.mini.module.plugin.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public UTCollectConfig f11696a;
        public int[] b;

        static {
            kge.a(-1278856550);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2066387105) {
                return super.onEventDispatch((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4], (Map) objArr[5]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.ut.mini.module.plugin.a
        public String getPluginName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : "UTInfoCollector";
        }

        public a(UTCollectConfig uTCollectConfig, int[] iArr) {
            this.f11696a = uTCollectConfig;
            this.b = iArr;
        }

        @Override // com.ut.mini.module.plugin.a
        public int[] getAttentionEventIds() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this}) : this.b;
        }

        @Override // com.ut.mini.module.plugin.a
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            if (i == 2101) {
                v.a("UTInfoCollector", String.format("Click Event: Page: %s, Button: %s", str, str2));
                if (this.f11696a.clickPageWhiteList.contains(str)) {
                    EventLogger.builder(7).setPageID(com.taobao.android.diagnose.c.a().d().c()).setData("page", str).setData("click", str2).log();
                }
            }
            return super.onEventDispatch(str, i, str2, str3, str4, map);
        }
    }
}
