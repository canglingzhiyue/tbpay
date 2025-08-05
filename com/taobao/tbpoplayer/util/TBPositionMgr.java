package com.taobao.tbpoplayer.util;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import tb.kge;

/* loaded from: classes.dex */
public class TBPositionMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PositionInfo f22251a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final TBPositionMgr f22253a;

        static {
            kge.a(-1857007947);
            f22253a = new TBPositionMgr();
        }

        public static /* synthetic */ TBPositionMgr a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBPositionMgr) ipChange.ipc$dispatch("af0727fb", new Object[0]) : f22253a;
        }
    }

    static {
        kge.a(1697950178);
    }

    public static /* synthetic */ PositionInfo a(TBPositionMgr tBPositionMgr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PositionInfo) ipChange.ipc$dispatch("5402494c", new Object[]{tBPositionMgr}) : tBPositionMgr.f22251a;
    }

    public static /* synthetic */ boolean a(TBPositionMgr tBPositionMgr, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdc2e37", new Object[]{tBPositionMgr, context})).booleanValue() : tBPositionMgr.a(context);
    }

    public static TBPositionMgr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPositionMgr) ipChange.ipc$dispatch("af0727fb", new Object[0]) : a.a();
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
            intentFilter.addAction(b.ACTION_LOCATION_CHANGED);
            application.registerReceiver(new PosBroadcastReceiver(), intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private PositionInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("17452200", new Object[]{this});
        }
        if (this.f22251a == null) {
            this.f22251a = b.b(PopLayer.getReference().getApp());
        }
        return this.f22251a;
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        com.alibaba.poplayer.utils.c.a("TBPositionMgr.updatePosInfoIfNeed", new Object[0]);
        if (this.f22251a == null) {
            this.f22251a = b.b(context);
        } else {
            PositionInfo b = b.b(context);
            if (this.f22251a.equals(b)) {
                return false;
            }
            PositionInfo positionInfo = this.f22251a;
            this.f22251a = b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourceEditionCode", (Object) positionInfo.editionCode);
            jSONObject.put("targetEditionCode", (Object) this.f22251a.editionCode);
            com.taobao.tbpoplayer.view.c.a().a("PopLayer", com.taobao.tbpoplayer.view.c.PAGE_EVENT_EDITION_SWITCHED, jSONObject, new JSONObject());
        }
        return true;
    }

    public boolean a(BaseConfigItem baseConfigItem) {
        PositionInfo b;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d997a272", new Object[]{this, baseConfigItem})).booleanValue();
        }
        if (baseConfigItem == null) {
            return false;
        }
        if (baseConfigItem.extra == null || (b = b()) == null) {
            return true;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(baseConfigItem.extra);
            if (parseObject.containsKey("positions") && (jSONArray = parseObject.getJSONArray("positions")) != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    if (jSONArray.get(i).toString().equals(b.editionCode)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPositionMgr.isValidConfig.error.", th);
        }
        return true;
    }

    /* loaded from: classes.dex */
    public class PosBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1764251518);
        }

        private PosBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            com.alibaba.poplayer.utils.c.b("triggerEvent", "", "TBPositionMgr.PosBroadcastReceiver get action");
            if (!TBPositionMgr.a(TBPositionMgr.this, context)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("TBPositionMgr.current EditionPosition code=");
            sb.append(TBPositionMgr.a(TBPositionMgr.this) != null ? TBPositionMgr.a(TBPositionMgr.this).editionCode : "empty");
            com.alibaba.poplayer.utils.c.b("triggerEvent", "", sb.toString());
            try {
                Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent2.putExtra("event", InternalTriggerController.d());
                intent2.putExtra("param", "switchMode:clean");
                intent2.putExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS, "switchMode:clean");
                intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "positionSwitch");
                LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent2);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("updatePositionInfo error.", th);
            }
        }
    }
}
