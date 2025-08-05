package com.tmall.wireless.mirrorlife.base.bridge;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import java.lang.ref.WeakReference;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes9.dex */
public class WeexACCS extends TBACCS {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1548310547);
    }

    @Override // com.taobao.accs.windvane.TBACCS, android.taobao.windvane.extra.jsbridge.WVACCS, android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mContext = context;
        this.mWebView = iWVWebView;
        mWeb = new WeakReference<>(iWVWebView);
        aem.a().a(new a(this.mWebView));
    }

    /* loaded from: classes9.dex */
    public static class a implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<IWVWebView> f23741a;

        static {
            kge.a(1320839387);
            kge.a(1845411121);
        }

        public a(IWVWebView iWVWebView) {
            this.f23741a = new WeakReference<>(iWVWebView);
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (this.f23741a.get() != null && i == 5001) {
                String str = (String) objArr[0];
                String str2 = new String((byte[]) objArr[1]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("serviceId", (Object) str);
                    jSONObject.put("resultData", (Object) str2);
                    jSONObject.toString();
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }
}
