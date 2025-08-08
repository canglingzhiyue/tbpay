package com.taobao.wireless.link.download;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rkg;

/* loaded from: classes9.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f23597a;
    private String b;
    private String c;
    private Context d;
    private boolean e;

    static {
        kge.a(-439450458);
        kge.a(2111754598);
    }

    public b(Context context, String str, String str2, String str3) {
        this.d = context;
        this.f23597a = str;
        this.b = str2;
        this.c = str3;
        this.e = StringUtils.equals("com.eg.android.AlipayGphone", str2);
    }

    @Override // com.taobao.wireless.link.download.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadFinish", "true");
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", this.b);
                WVStandardEventCenter.postNotificationToJS("tbDownloadFinishV2", jSONObject.toString());
            }
        } catch (Throwable th) {
            rkg.a("DownloadListenerImpl", th.getMessage(), th);
        }
        try {
            Intent intent = new Intent("link.intent.action.DOWNLOAD_FINISH");
            intent.putExtra("link.intent.extra.PACKAGE", this.b);
            intent.putExtra("link.intent.extra.BUSINESS_ID", this.f23597a);
            intent.putExtra("link.intent.extra.DOWNLOAD_URL", this.c);
            LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
        } catch (Throwable th2) {
            rkg.a("DownloadListenerImpl", th2.getMessage(), th2);
        }
    }

    @Override // com.taobao.wireless.link.download.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadProgress", i + "");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", this.b);
            jSONObject.put("progress", i);
            WVStandardEventCenter.postNotificationToJS("tbDownloadProgressV2", jSONObject.toString());
        } catch (Throwable th) {
            rkg.a("DownloadListenerImpl", th.getMessage(), th);
        }
    }

    @Override // com.taobao.wireless.link.download.a
    public void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str2);
            if (this.e) {
                WVStandardEventCenter.postNotificationToJS("tbDownloadFail", jSONObject.toString());
                return;
            }
            jSONObject.put("packageName", this.b);
            WVStandardEventCenter.postNotificationToJS("tbDownloadFailV2", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
