package com.taobao.tao.scancode;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.b;
import com.taobao.tao.scancode.ShareQRCodeScanView;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import java.util.List;
import tb.kge;
import tb.nym;
import tb.nzb;
import tb.nzp;

/* loaded from: classes8.dex */
public class a implements nzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2014742898);
        kge.a(664453965);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.taobao.tao.scancode.a$2] */
    @Override // tb.nzb
    public void a(final ShareData shareData, List<String> list, String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6f0c42", new Object[]{this, shareData, list, str, jSONObject, new Boolean(z)});
            return;
        }
        final ShareQRCodeScanView shareQRCodeScanView = new ShareQRCodeScanView(nym.a().getApplicationContext());
        try {
            shareQRCodeScanView.showSnapshotDialog(list, shareData, str, jSONObject, z, new ShareQRCodeScanView.a() { // from class: com.taobao.tao.scancode.a.1
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
        new AsyncTask<Void, Void, String>() { // from class: com.taobao.tao.scancode.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
            @Override // android.os.AsyncTask
            public /* synthetic */ String doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, str2});
                } else {
                    a(str2);
                }
            }

            public String a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr});
                }
                String link = shareData.getLink();
                String urlBackFlow = ShareServiceApi.urlBackFlow(shareData.getBusinessId(), "QRCode-Scan", shareData.getLink());
                if (StringUtils.isEmpty(urlBackFlow)) {
                    return link;
                }
                String shortenURL = new nzp().shortenURL(urlBackFlow);
                b.a(ShareTargetType.Share2ScanCode.getValue());
                return (StringUtils.isEmpty(shortenURL) || urlBackFlow.equals(shortenURL)) ? link : shortenURL;
            }

            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else {
                    shareQRCodeScanView.createQrcode(str2, -957150);
                }
            }
        }.execute(new Void[0]);
    }
}
