package com.taobao.android.miniLive;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f14330a;
    private String b;
    private String c;

    static {
        kge.a(-976042218);
    }

    public b(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.f14330a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f14330a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                r rVar = new r();
                try {
                    rVar.a(new JSONObject(str));
                    this.f14330a.success(rVar);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.f14330a.success();
        }
    }
}
