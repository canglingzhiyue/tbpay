package com.taobao.taolivecontainer.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f22054a;
    private String b;
    private String c;

    static {
        kge.a(-1569319950);
    }

    public a(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.f22054a = wVCallBackContext;
        this.b = str;
        this.c = str2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f22054a;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f22054a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                r rVar = new r();
                try {
                    rVar.a(new JSONObject(str));
                    this.f22054a.success(rVar);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.f22054a.success();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f22054a;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.error();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f22054a == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                r rVar = new r();
                try {
                    rVar.a(new JSONObject(str));
                    this.f22054a.error(rVar);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.f22054a.error();
        }
    }
}
