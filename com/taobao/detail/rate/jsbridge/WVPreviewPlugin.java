package com.taobao.detail.rate.jsbridge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.nav.Nav;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.v2.RateViewPagerFragmentV2;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class WVPreviewPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver imagePreviewReceiver = new BroadcastReceiver() { // from class: com.taobao.detail.rate.jsbridge.WVPreviewPlugin.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !intent.getAction().equalsIgnoreCase("taobao.ocean.imagepreview.broadcast")) {
            } else {
                String stringExtra = intent.getStringExtra("actionName");
                String stringExtra2 = intent.getStringExtra("bizData");
                if (WVPreviewPlugin.access$000(WVPreviewPlugin.this) == null) {
                    return;
                }
                WVPreviewPlugin.access$000(WVPreviewPlugin.this).fireEvent(stringExtra, stringExtra2);
            }
        }
    };
    private WVCallBackContext previewCallback;

    public static /* synthetic */ Object ipc$super(WVPreviewPlugin wVPreviewPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ WVCallBackContext access$000(WVPreviewPlugin wVPreviewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("6a3782ac", new Object[]{wVPreviewPlugin}) : wVPreviewPlugin.previewCallback;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"openPreview".equals(str)) {
            return false;
        }
        openPreviewAcitivity(str2, wVCallBackContext);
        return true;
    }

    public WVPreviewPlugin() {
        IntentFilter intentFilter = new IntentFilter("taobao.ocean.imagepreview.broadcast");
        if (this.imagePreviewReceiver != null) {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.imagePreviewReceiver, intentFilter);
        }
    }

    private void openPreviewAcitivity(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959ac304", new Object[]{this, str, wVCallBackContext});
            return;
        }
        u.b("RatePreview", "openPreviewActivity.start");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            JSONObject jSONObject = parseObject.getJSONObject("data");
            String string = parseObject.getString("url");
            if (jSONObject != null) {
                String string2 = jSONObject.getString("bizType");
                RateDisplayApplication.clear();
                if (!StringUtils.isEmpty(string)) {
                    Bundle bundle = new Bundle();
                    if (RateNode.TAG.equals(string2)) {
                        bundle.putBoolean("isNewRate", true);
                    } else {
                        bundle.putBoolean("isNewPreview", true);
                    }
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    bundle.putString("tagId", valueOf);
                    RateDisplayApplication.previewDataMap.put(valueOf, jSONObject);
                    if (com.taobao.detail.rate.v2.e.INSTANCE.a()) {
                        u.b("RatePreview", "beforeNav");
                        openPreviewV2(valueOf, this.mContext);
                        u.b("RatePreview", "afterNav");
                    } else {
                        Nav.from(this.mContext).withExtras(bundle).toUri(string);
                    }
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success();
                    }
                } else {
                    RateDisplayApplication.previewDatas = jSONObject;
                    if (com.taobao.detail.rate.v2.e.INSTANCE.a()) {
                        openPreviewV2("", this.mContext);
                    } else {
                        Nav.from(this.mContext).toUri("http://h5.m.taobao.com/rate/imagepreview.htm?preview=true");
                    }
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success();
                    }
                }
            }
        }
        u.b("RatePreview", "openPreviewActivity.end");
        this.previewCallback = wVCallBackContext;
    }

    private void openPreviewV2(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9547a9dd", new Object[]{this, str, context});
        } else if (!(context instanceof FragmentActivity)) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("tagId", str);
            RateViewPagerFragmentV2 rateViewPagerFragmentV2 = new RateViewPagerFragmentV2();
            rateViewPagerFragmentV2.setArguments(bundle);
            FragmentTransaction beginTransaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
            beginTransaction.add(rateViewPagerFragmentV2, "RateViewPagerFragmentV2");
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            this.previewCallback = null;
            if (this.imagePreviewReceiver == null) {
                return;
            }
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.imagePreviewReceiver);
            this.imagePreviewReceiver = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
