package com.taobao.mytaobao.basement.monitor;

import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.d;
import com.taobao.mytaobao.base.e;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BasementPageTimeHelper";

    /* renamed from: a  reason: collision with root package name */
    private long f18340a = -1;
    private String b;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f18341a;

        static {
            kge.a(-1803286785);
            f18341a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3add614d", new Object[0]) : f18341a;
        }
    }

    static {
        kge.a(-1276758484);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3add614d", new Object[0]) : a.a();
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8e4a0e", new Object[]{this, eVar});
            return;
        }
        if (eVar == null || !eVar.t()) {
            z = false;
        }
        TLog.loge(TAG, "viewAppear, isInBasement=" + z);
        if (!z) {
            return;
        }
        if (this.f18340a != -1) {
            TLog.loge(TAG, "onViewAppear, but enterTime is not null!!!!");
            b.a().a("onViewAppearStatusError", (JSONObject) null, 1.0d, false);
            return;
        }
        this.f18340a = System.currentTimeMillis();
        this.b = "appear";
    }

    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a66060f", new Object[]{this, eVar});
            return;
        }
        boolean z = eVar != null && eVar.t();
        long currentTimeMillis = System.currentTimeMillis() - this.f18340a;
        boolean b = com.taobao.mytaobao.basement.a.b();
        TLog.loge(TAG, "viewDisappear, isInBasement=" + z + ", enterBasementTimestamp=" + this.f18340a + ",browseTime=" + currentTimeMillis + ",isWeex=" + b);
        if (!z) {
            return;
        }
        if (this.f18340a == -1) {
            TLog.loge(TAG, "onViewDisappear, but enterTime is null!!!!");
            b.a().a("onViewDisappearStatusError", (JSONObject) null, 1.0d, false);
            return;
        }
        String str = this.b;
        TBS.Ext.commitEvent(b.MODULE_NAME, 19999, "TaoFriendPageCounter", "disappear", str, "browseTime=" + currentTimeMillis, "isWeex=" + b);
        b.a().a("TaoFriendPageCounter", "enter=" + this.b + ",leave=disappear,isWeex=" + b, currentTimeMillis, false);
        this.f18340a = -1L;
        this.b = null;
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5d8279", new Object[]{this, str, dVar});
            return;
        }
        TLog.loge(TAG, "changeToBasement, behavior=" + str + "forground=" + a(dVar.A()));
        if (this.f18340a != -1) {
            TLog.loge(TAG, "onChangeToBasement, but enterTime is not null!!!!");
            b.a().a("changeToBasementStatusError", (JSONObject) null, 1.0d, false);
            return;
        }
        this.f18340a = System.currentTimeMillis();
        this.b = str;
    }

    public void b(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe8a03a", new Object[]{this, str, dVar});
            return;
        }
        String a2 = a(dVar.A());
        long currentTimeMillis = System.currentTimeMillis() - this.f18340a;
        boolean b = com.taobao.mytaobao.basement.a.b();
        TLog.loge(TAG, "changeToMainPage, enterBasementTimestamp=" + this.f18340a + ",leaveBehavior=" + str + ",enterBehavior=" + this.b + ",foreground=" + a2 + ",browseTime=" + currentTimeMillis + ",isWeex=" + b);
        if (this.f18340a == -1) {
            TLog.loge(TAG, "onChangeToMainPage, but enterTime is null!!!!");
            b.a().a("changeToMainStatusError", 1.0d);
            return;
        }
        String str2 = this.b;
        TBS.Ext.commitEvent(b.MODULE_NAME, 19999, "TaoFriendPageCounter", str, str2, "browseTime=" + currentTimeMillis, "foreground=" + a2, "isWeex=" + b);
        StringBuilder sb = new StringBuilder();
        sb.append("enter=");
        sb.append(this.b);
        sb.append(",leave=");
        sb.append(str);
        sb.append(",isWeex=");
        sb.append(b);
        b.a().a("TaoFriendPageCounter", sb.toString(), (double) currentTimeMillis, false);
        this.f18340a = -1L;
        this.b = null;
    }

    private String a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f012096", new Object[]{this, fragment}) : fragment.isResumed() ? "foreground" : "background";
    }
}
