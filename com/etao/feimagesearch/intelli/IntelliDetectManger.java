package com.etao.feimagesearch.intelli;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import tb.cqi;
import tb.kge;

/* loaded from: classes3.dex */
public class IntelliDetectManger implements cqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout rootView;

    /* loaded from: classes3.dex */
    public interface IntelliDetectCallback {
        void onDetectAppear();

        void onDetectDisappear();

        boolean onPreResult();

        void onPrepared();
    }

    static {
        kge.a(1473180229);
        kge.a(-514659404);
    }

    private void cancelLockJump() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8e1b9a", new Object[]{this});
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void disableDotAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30b1e4a", new Object[]{this});
        }
    }

    public void frameAvailable(byte[] bArr, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb5b38a", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.cqi
    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        }
    }

    @Override // tb.cqi
    public void onDeviceStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ab3537", new Object[]{this});
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void setCallback(IntelliDetectCallback intelliDetectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7146c41", new Object[]{this, intelliDetectCallback});
        }
    }

    public void setOutputSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void setPltTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f9b686", new Object[]{this});
        }
    }

    private IntelliDetectManger(PhotoFrom photoFrom, com.etao.feimagesearch.model.b bVar, Context context, IntelliDetectCallback intelliDetectCallback, boolean z) {
        this.rootView = new FrameLayout(context);
    }

    public boolean detectFrame(byte[] bArr, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("441422a0", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        frameAvailable(bArr, z, i, i2);
        return true;
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.rootView;
    }
}
