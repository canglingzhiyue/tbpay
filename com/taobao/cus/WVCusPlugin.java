package com.taobao.cus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mre;
import tb.mrh;
import tb.nks;
import tb.nkt;
import tb.nku;
import tb.rfy;

/* loaded from: classes7.dex */
public class WVCusPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2073366700);
    }

    public static /* synthetic */ Object ipc$super(WVCusPlugin wVCusPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        final r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            rVar = new r();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("WVAPKUpdatePlugin.execute." + str + ".error.", th);
            wVCallBackContext.error("catchError");
        }
        if ("isPreUpdateOrangeEnable".equals(str)) {
            rVar.a("enable", String.valueOf(mre.a().c()));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("isNewStrategyEnable".equals(str)) {
            rVar.a("enable", String.valueOf(mre.a().b()));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("isPreUpdateEnable".equals(str)) {
            f.a(new Runnable() { // from class: com.taobao.cus.-$$Lambda$WVCusPlugin$IweHW8BVQ_3pCtGYBVGCRBs9u9I
                @Override // java.lang.Runnable
                public final void run() {
                    WVCusPlugin.lambda$execute$141(r.this, wVCallBackContext);
                }
            });
            return true;
        } else if ("isPreAPKReady".equals(str)) {
            String d = a.a().d();
            if (!StringUtils.isEmpty(d)) {
                rVar.a("filePath", d);
                rVar.a("isReady", (Object) true);
            } else {
                rVar.a("filePath", "");
                rVar.a("isReady", (Object) false);
            }
            wVCallBackContext.success(rVar);
            return true;
        } else if ("getABValue".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            rVar.a("value", nkt.a(parseObject.getString("module"), parseObject.getString(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION)));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("jumpToSettings".equals(str)) {
            if (Build.VERSION.SDK_INT < 26) {
                rVar.a("errorMsg", "SYSTEM_LEVEL_INVALID");
                wVCallBackContext.error(rVar);
            } else {
                nku.a(this.mContext, JSON.parseObject(str2).getBooleanValue("openSettingsHome"));
                nks.b("jumpToSettings", null, null);
                wVCallBackContext.success(rVar);
            }
            return true;
        } else if ("installPreDownloadedAPK".equals(str)) {
            rVar.a("installApkSuccess", Boolean.valueOf(a.a().a(getContext())));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("checkPopExposeInterval".equals(str)) {
            rVar.a("result", String.valueOf(a.a().j()));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("updatePopExposeTime".equals(str)) {
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
            mrh.a(mrh.SP_KEY_POP_EXPOSE_TIME, currentTimeStamp);
            rfy.setLastPopTime(currentTimeStamp);
            wVCallBackContext.success(rVar);
            return true;
        } else if ("getUpdateData".equals(str)) {
            String b = mrh.b(mrh.SP_KEY_UPDATE_MODEL, "");
            if (!StringUtils.isEmpty(b)) {
                rVar.a(new org.json.JSONObject(b));
            } else {
                rVar.a(new org.json.JSONObject());
            }
            wVCallBackContext.success(rVar);
            return true;
        } else if ("getBrand".equals(str)) {
            rVar.a("brand", Build.BRAND.toLowerCase());
            wVCallBackContext.success(rVar);
            return true;
        } else if ("enableJumpStoreVIVO".equals(str)) {
            rVar.a("enable", Boolean.valueOf(nkt.b(this.mContext)));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("jumpStoreVIVO".equals(str)) {
            if (nkt.b(this.mContext)) {
                Intent intent = new Intent();
                String packageName = this.mContext.getPackageName();
                intent.setData(Uri.parse("vivomarket://details?id=" + packageName + "&th_name=self_update"));
                intent.setPackage("com.bbk.appstore");
                intent.setFlags(335544320);
                this.mContext.startActivity(intent);
                rVar.a("success", (Object) true);
                wVCallBackContext.success(rVar);
                return true;
            }
            rVar.a("success", (Object) false);
            wVCallBackContext.success(rVar);
            return true;
        } else if ("ignoreNextMtopTime".equals(str)) {
            mrh.a(mrh.SP_KEY_IGNORE_NEXT_MTOP_TIME, JSON.parseObject(str2).getBooleanValue(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("hasValidMarket".equals(str)) {
            rVar.a("result", Boolean.valueOf(nkt.b(PopLayer.getReference().getApp())));
            wVCallBackContext.success(rVar);
            return true;
        } else if ("isGPChannel".equals(str)) {
            rVar.a("result", Boolean.valueOf(nkt.a(PopLayer.getReference().getApp())));
            wVCallBackContext.success(rVar);
            return true;
        } else {
            if ("jumpStore".equals(str)) {
                rVar.a("result", Boolean.valueOf(com.taobao.tbpoplayer.util.e.a(PopLayer.getReference().getApp(), (String) null)));
                wVCallBackContext.success(rVar);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$execute$141(r rVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8320a3c", new Object[]{rVar, wVCallBackContext});
            return;
        }
        rVar.a("enable", String.valueOf(a.a().f()));
        wVCallBackContext.success(rVar);
    }
}
