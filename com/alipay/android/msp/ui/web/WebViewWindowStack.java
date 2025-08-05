package com.alipay.android.msp.ui.web;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes3.dex */
public class WebViewWindowStack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Stack<IWebViewWindow> f5031a = new Stack<>();

    public IWebViewWindow popJsWebViewWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWebViewWindow) ipChange.ipc$dispatch("f7b4b4f5", new Object[]{this}) : this.f5031a.pop();
    }

    public void pushJsWebViewWindow(IWebViewWindow iWebViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beed222", new Object[]{this, iWebViewWindow});
        } else {
            this.f5031a.push(iWebViewWindow);
        }
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.f5031a.isEmpty();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (isEmpty()) {
        } else {
            Iterator<IWebViewWindow> it = this.f5031a.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.f5031a.clear();
        }
    }
}
