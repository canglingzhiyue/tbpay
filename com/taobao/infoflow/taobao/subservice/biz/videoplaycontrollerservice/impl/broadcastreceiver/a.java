package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.lcz;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TbAreaSwitchBroadcastReceiver f17562a;
    private TbRevisionSwitchBroadcastReceiver b;

    static {
        kge.a(-245442970);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("BroadcastRegister", "context == null || receiver == null,context: " + a2);
            return;
        }
        this.f17562a = new TbAreaSwitchBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
        try {
            a2.registerReceiver(this.f17562a, intentFilter);
        } catch (Exception e) {
            ldf.a("BroadcastRegister", "registerAreaChangeReceiver error", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("BroadcastRegister", "context == null || receiver == null,context: " + a2);
            return;
        }
        try {
            a2.unregisterReceiver(this.f17562a);
        } catch (Exception e) {
            ldf.a("BroadcastRegister", "unRegisterAreaChangeReceiver error", e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("BroadcastRegister", "context == null");
            return;
        }
        this.b = new TbRevisionSwitchBroadcastReceiver();
        try {
            LocalBroadcastManager.getInstance(a2).registerReceiver(this.b, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        } catch (Exception e) {
            ldf.a("BroadcastRegister", "registerAreaChangeReceiver error", e);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Application a2 = lcz.a();
        if (a2 == null) {
            ldf.d("BroadcastRegister", "context == null");
            return;
        }
        try {
            LocalBroadcastManager.getInstance(a2).unregisterReceiver(this.b);
        } catch (Exception e) {
            ldf.a("BroadcastRegister", "unRegisterAreaChangeReceiver error", e);
        }
    }
}
