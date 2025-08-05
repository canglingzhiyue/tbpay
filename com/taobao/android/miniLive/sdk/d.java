package com.taobao.android.miniLive.sdk;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.AliMiniLiveWVPlugin;
import com.taobao.android.miniLive.services.TBMiniLiveReceiver;
import java.util.HashMap;
import tb.hud;
import tb.hue;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LIVE_ROOM_START = "action.com.taobao.taolive.room.start";
    public static final String ACTION_NOTIFY_DETAIL_SHOW = "ACTION_NOTIFY_DETAIL_SHOW";
    public static final String ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO = "ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO";
    public static final String ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO = "ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO";
    public static final String PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION = "Page_Detail_UPP_ShowFloatViewNotification";
    public static final String PAGE_PAUSE_ACTION = "TAOLIVE_ACTION_NOTIFY_VIEWDISAPPEAR";
    public static final String PAGE_RESUME_ACTION = "TAOLIVE_ACTION_NOTIFY_VIEWAPPEAR";
    public static final String PAGE_SHOP_PAUSE_ACTION = "com.taobao.shop.TB_SHOP_AC_PAUSE";
    public static final String PAGE_SHOP_RESUME_ACTION = "com.taobao.shop.TB_SHOP_AC_RESUME";
    public static final String TAG = "InitTaoMiniLiveSDK";
    public static final String TAOLIVE_SHOW_MINILIVE_ACTION = "com.taobao.taolive.miniLiveRoom.action";

    static {
        kge.a(1001889811);
        com.android.tools.ir.runtime.c.a("com.taobao.taolive", null);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!hud.f()) {
            hue.a(TAG, "init close broadcastReceiver");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PAGE_RESUME_ACTION);
            intentFilter.addAction(PAGE_PAUSE_ACTION);
            intentFilter.addAction(PAGE_SHOP_PAUSE_ACTION);
            intentFilter.addAction(PAGE_SHOP_RESUME_ACTION);
            intentFilter.addAction(TAOLIVE_SHOW_MINILIVE_ACTION);
            intentFilter.addAction(ACTION_NOTIFY_DETAIL_SHOW);
            intentFilter.addAction(ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO);
            intentFilter.addAction(ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO);
            intentFilter.addAction("action.com.taobao.taolive.room.start");
            intentFilter.addAction(PAGE_DETAIL_UPP_SHOWFLOATVIEWNOTIFICATION);
            LocalBroadcastManager.getInstance(application.getApplicationContext()).registerReceiver(new TBMiniLiveReceiver(), intentFilter);
            Log.e(TAG, "init");
            q.a("AliMiniLiveWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) AliMiniLiveWVPlugin.class, true);
        }
    }
}
