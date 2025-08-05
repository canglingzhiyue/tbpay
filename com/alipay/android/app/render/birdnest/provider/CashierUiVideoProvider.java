package com.alipay.android.app.render.birdnest.provider;

import android.content.Context;
import android.view.View;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierUiVideoProvider implements BirdNestEngine.UiVideoProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public View createVideoView(Context context, BirdNestEngine.UiVideoProvider.VideoCallback videoCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf984a0f", new Object[]{this, context, videoCallback});
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void destroyVideoView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9207745", new Object[]{this, view});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public Object getAttribute(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("822eca43", new Object[]{this, view, str});
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void loadUri(View view, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6738820e", new Object[]{this, view, hashMap});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void pause(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2384635", new Object[]{this, view});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void play(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269adb37", new Object[]{this, view});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void prepare(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf0fc04", new Object[]{this, view});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void resume(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd62161e", new Object[]{this, view});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void setAttribute(View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268f05f7", new Object[]{this, view, str, obj});
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider
    public void setRollbackWrapper(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f412700", new Object[]{this, new Boolean(z)});
        }
    }
}
