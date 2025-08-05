package com.taobao.pha.webview;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.util.n;
import android.taobao.windvane.webview.m;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.i;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import tb.kge;
import tb.nfc;

/* loaded from: classes7.dex */
public class a extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f18845a;
    private View b;
    private final WVUCWebView c;

    static {
        kge.a(-652579909);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1246152312) {
            super.loadErrorPage();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ WVUCWebView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("69548ed2", new Object[]{aVar}) : aVar.c;
    }

    public a(Context context, WVUCWebView wVUCWebView) {
        super(context, wVUCWebView);
        this.f18845a = context;
        this.c = wVUCWebView;
    }

    @Override // android.taobao.windvane.webview.m
    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
        } else {
            a("");
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.b == null && (n.a(this.f18845a) instanceof Activity)) {
            this.b = b(str);
            setErrorView(this.b);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) this.c.getUrl());
                i.b(nfc.PHA_MONITOR_MODULE_POINT_ERROR_VIEW, jSONObject);
            } catch (Exception unused) {
            }
        }
        super.loadErrorPage();
    }

    private View b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b9126f5", new Object[]{this, str});
        }
        TBErrorView tBErrorView = new TBErrorView(this.f18845a);
        tBErrorView.setNotShowNetworkDiagnosisView(true);
        Error newError = Error.Factory.newError(str, "网络错误,请稍后再试");
        newError.url = this.c.getCurrentUrl();
        tBErrorView.setError(newError);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.pha.webview.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                a.a(a.this).reload();
                a.this.hideErrorPage();
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        return tBErrorView;
    }
}
