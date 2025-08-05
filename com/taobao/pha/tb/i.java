package com.taobao.pha.tb;

import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.webview.PHAWVUCWebView;
import tb.kge;

/* loaded from: classes7.dex */
public class i extends BasePreInitManager<PHAWVUCWebView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f18817a;

    static {
        kge.a(333525948);
    }

    private i() {
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("c6da7c98", new Object[0]);
        }
        if (f18817a == null) {
            synchronized (i.class) {
                if (f18817a == null) {
                    f18817a = new i();
                }
            }
        }
        return f18817a;
    }
}
