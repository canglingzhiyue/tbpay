package com.taobao.share.qrcode;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.ut.share.ShareServiceApi;
import tb.kge;
import tb.nyg;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19644a;
    private String b;
    private TBShareContent c;

    /* loaded from: classes8.dex */
    public interface a {
        void a(boolean z, String str);
    }

    static {
        kge.a(1148667347);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc1b3deb", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ String a(b bVar, com.taobao.share.taopassword.busniess.model.b bVar2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18027a4c", new Object[]{bVar, bVar2, new Boolean(z)}) : bVar.a(bVar2, z);
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54d404a1", new Object[]{bVar, str});
        }
        bVar.f19644a = str;
        return str;
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dba4d7ec", new Object[]{bVar}) : bVar.f19644a;
    }

    public b(TBShareContent tBShareContent) {
        this.c = tBShareContent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r0.equals(r12) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r11, java.lang.String r12, java.lang.String r13, final boolean r14, final com.taobao.share.qrcode.b.a r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.qrcode.b.a(android.content.Context, java.lang.String, java.lang.String, boolean, com.taobao.share.qrcode.b$a):void");
    }

    private String a(com.taobao.share.taopassword.busniess.model.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49b77399", new Object[]{this, bVar, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ShareServiceApi.urlBackFlow(bVar.f19656a.c, "QRCodeAnti", this.c.url));
        try {
            String queryParameter = Uri.parse(bVar.d).getQueryParameter("un");
            if (!TextUtils.isEmpty(queryParameter)) {
                sb.append("&un=");
                sb.append(queryParameter);
            }
        } catch (Exception unused) {
        }
        if (!z) {
            String queryParameter2 = Uri.parse(bVar.f).getQueryParameter(DispatchConstants.CONFIG_VERSION);
            sb.append("&cv=");
            sb.append(queryParameter2);
        }
        return com.taobao.share.taopassword.b.d(sb.toString());
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.equals(str, "QR")) {
            return true;
        }
        if (!TextUtils.equals(str, "Visual")) {
            return nyg.h();
        }
        return false;
    }
}
