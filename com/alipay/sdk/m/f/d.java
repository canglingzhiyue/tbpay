package com.alipay.sdk.m.f;

import com.alipay.sdk.auth.widget.WebViewWindow;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Stack<WebViewWindow> f6167a = new Stack<>();

    public void a(WebViewWindow webViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899101be", new Object[]{this, webViewWindow});
        } else {
            this.f6167a.push(webViewWindow);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f6167a.isEmpty();
    }

    public WebViewWindow c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebViewWindow) ipChange.ipc$dispatch("e0c36002", new Object[]{this}) : this.f6167a.pop();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b()) {
        } else {
            Iterator<WebViewWindow> it = this.f6167a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f6167a.clear();
        }
    }
}
