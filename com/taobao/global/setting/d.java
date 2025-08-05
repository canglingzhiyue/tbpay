package com.taobao.global.setting;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.orange.ConfigCenter;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "mtbSettings";

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17208a;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f17209a = new d();

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("4fd353ed", new Object[0]) : f17209a;
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("485fa431", new Object[]{dVar})).booleanValue() : dVar.f17208a;
    }

    private d() {
        this.f17208a = TextUtils.equals("true", ConfigCenter.getInstance().getConfig("mpm_data_switch", "mtbMuteEvoEnable", "true"));
        Coordinator.execute(new Runnable() { // from class: com.taobao.global.setting.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String str = "true";
                jSONObject.put("value", (Object) (d.a(d.this) ? str : "false"));
                jSONObject.put("tbGlobalMuteSetting", (Object) "1");
                String jSONString = jSONObject.toJSONString();
                StringBuilder sb = new StringBuilder();
                sb.append("value=");
                if (!d.a(d.this)) {
                    str = "false";
                }
                sb.append(str);
                String sb2 = sb.toString();
                TLog.loge(d.BIZ_NAME, "静音实验：" + jSONString + " muteHitAB=" + d.a(d.this) + " evoValue=1");
                TBS.Ext.commitEvent(b.MODULE_NAME, 19997, "tbGlobalMuteSetting", null, null, sb2, "tbGlobalMuteSetting=1");
                AppMonitor.Counter.commit("Page_MyTaobao", "tbGlobalMuteSetting", jSONString, 1.0d);
            }
        });
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("4fd353ed", new Object[0]) : a.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f17208a;
    }
}
