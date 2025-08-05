package com.taobao.tao.homepage.revision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.homepage.utils.d;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import tb.kge;
import tb.ksp;
import tb.laq;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MINI_APP_RELATION = "miniAppRelation";
    public static final String NEW_2021_UI_KEY = "new2021UIEnable";
    private BroadcastReceiver h;

    /* renamed from: com.taobao.tao.homepage.revision.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0863a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f20611a;

        static {
            kge.a(1536229322);
            f20611a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7434a66f", new Object[0]) : f20611a;
        }
    }

    static {
        kge.a(-1329941170);
    }

    private a() {
        this.h = new BroadcastReceiver() { // from class: com.taobao.tao.homepage.revision.Revision$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (n.n().j()) {
                } else {
                    ksp.c("Revision", "收到广播:" + intent.getAction());
                    if (!"taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(intent.getAction())) {
                        return;
                    }
                    ChangeContainerProcess.a().a(ChangeContainerProcess.ChangeContainerType.revision);
                }
            }
        };
        i();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7434a66f", new Object[0]) : C0863a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            LocalBroadcastManager.getInstance(context).registerReceiver(this.h, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        laq c = laq.a().a("Revision").b("updateRevision").c("Revision.updateRevision").c("更新改版开关和桶号信息（目前全局开关由 dosa 下发");
        if (!j() && !k() && !l.e(Globals.getApplication())) {
            c.c("非大陆版且非海外且非OLD版, 不设置revision 信息，直接return").b();
            return;
        }
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.toJSONString();
        }
        c.a("switchInfo", str).b();
        TBRevisionSwitchManager.i().b(str);
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : d.b(str, str2);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : j.b();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!l.e(Globals.getApplication())) {
        } else {
            com.taobao.android.editionswitcher.b.b(Globals.getApplication(), "CN");
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : "CN".equalsIgnoreCase(l.b(Globals.getApplication()).editionCode);
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : l.d(Globals.getApplication());
    }
}
