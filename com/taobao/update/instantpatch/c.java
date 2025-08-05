package com.taobao.update.instantpatch;

import android.taobao.windvane.export.adapter.ILocalizationService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import java.util.concurrent.CountDownLatch;
import tb.kge;
import tb.rew;

/* loaded from: classes9.dex */
public class c implements rew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f23432a = false;
    private CountDownLatch b = new CountDownLatch(1);

    static {
        kge.a(-1775649070);
        kge.a(97733876);
    }

    @Override // tb.rew
    public String getCancelText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("338a645c", new Object[]{this}) : ILocalizationService.CANCEL;
    }

    @Override // tb.rew
    public String getConfirmText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f0d2482", new Object[]{this}) : ILocalizationService.CONFIRM;
    }

    @Override // tb.rew
    public String getTitleText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4800096a", new Object[]{this}) : "提示";
    }

    @Override // tb.rew
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "INSTANT_PATCH";
    }

    public static boolean waitForConfirmAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2536377", new Object[]{str})).booleanValue();
        }
        c cVar = new c();
        UpdateRuntime.doUIAlertForConfirm(str, cVar);
        try {
            cVar.b.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cVar.f23432a;
    }

    @Override // tb.rew
    public void onConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310393e8", new Object[]{this});
            return;
        }
        this.f23432a = true;
        this.b.countDown();
    }

    @Override // tb.rew
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
            return;
        }
        this.f23432a = false;
        this.b.countDown();
    }
}
