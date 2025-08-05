package com.alibaba.aliweex.bundle;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.alibaba.aliweex.bundle.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import tb.kge;

/* loaded from: classes2.dex */
public class g implements Handler.Callback, k.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHOW_TIP_VIEW = 18;

    /* renamed from: a  reason: collision with root package name */
    private Activity f2015a;
    private Handler b = new Handler(this);
    private boolean c;
    private h d;

    static {
        kge.a(-434684961);
        kge.a(-1043440182);
        kge.a(-580301687);
    }

    public g(Activity activity) {
        this.f2015a = activity;
    }

    @Override // com.alibaba.aliweex.bundle.k.g
    public Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.aliweex.bundle.k.g
    public void a(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0f5e8c", new Object[]{this, wXSDKInstance, view});
            return;
        }
        if (this.d == null) {
            this.d = new h(wXSDKInstance.O(), view);
        }
        if (!this.c) {
            return;
        }
        this.b.sendEmptyMessage(18);
    }

    @Override // com.alibaba.aliweex.bundle.k.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!f.f(str)) {
        } else {
            this.c = true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 18 || (hVar = this.d) == null) {
            return false;
        }
        hVar.a(null, "检测到该网址为外部网站，外部网站打开可能存在安全隐患，请注意保护您的个人隐私", com.alibaba.aliweex.utils.g.a(this.f2015a));
        return true;
    }
}
