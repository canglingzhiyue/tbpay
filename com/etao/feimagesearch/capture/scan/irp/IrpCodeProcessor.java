package com.etao.feimagesearch.capture.scan.irp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.g;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.gateway.util.d;
import com.taobao.taobao.scancode.gateway.util.m;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import tb.cot;
import tb.css;
import tb.kge;

/* loaded from: classes3.dex */
public class IrpCodeProcessor implements LifecycleObserver, m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f6594a;
    private final FragmentActivity b;

    static {
        kge.a(-983717952);
        kge.a(1571819161);
        kge.a(1128699363);
        kge.a(2139684418);
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
        }
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        }
    }

    public IrpCodeProcessor(FragmentActivity fragmentActivity, HashMap<String, String> hashMap) {
        this.b = fragmentActivity;
        this.f6594a = a(fragmentActivity, hashMap);
        fragmentActivity.getLifecycle().addObserver(this);
    }

    public boolean a(FragmentActivity fragmentActivity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57e4202d", new Object[]{this, fragmentActivity, maResult, str})).booleanValue() : this.f6594a.b(maResult, null, str);
    }

    private d a(FragmentActivity fragmentActivity, final HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b362e650", new Object[]{this, fragmentActivity, hashMap});
        }
        g gVar = new g();
        gVar.a(fragmentActivity);
        d dVar = new d(gVar, new ScancodeController(this), fragmentActivity, new css() { // from class: com.etao.feimagesearch.capture.scan.irp.IrpCodeProcessor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.css
            public HashMap<String, String> a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (HashMap) ipChange2.ipc$dispatch("be7c57cb", new Object[]{this}) : hashMap;
            }
        });
        dVar.a("Page_ScanHome");
        return dVar;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        cot.c("_scancode_IrpCodeProcessor", MessageID.onDestroy);
        this.b.getLifecycle().removeObserver(this);
        a.a().a(this.b);
        b.a().b();
    }
}
