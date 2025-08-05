package com.taobao.android.pissarro.external;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class PissarroService implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c mService;

    public PissarroService(Context context) {
        this.mService = new ServiceImpl(context);
    }

    @Override // com.taobao.android.pissarro.external.c
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mService.onCreate();
        }
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openCamera(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c51357", new Object[]{this, config, aVar});
        } else {
            this.mService.openCamera(config, aVar);
        }
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openAlbum(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6197fbe1", new Object[]{this, config, aVar});
        } else {
            this.mService.openAlbum(config, aVar);
        }
    }

    @Override // com.taobao.android.pissarro.external.c
    public void openCameraOrAlbum(Config config, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c008fe9", new Object[]{this, config, aVar});
        } else {
            this.mService.openCameraOrAlbum(config, aVar);
        }
    }

    @Override // com.taobao.android.pissarro.external.c
    public void editPicture(Config config, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64af6dfc", new Object[]{this, config, str, aVar});
        } else {
            this.mService.editPicture(config, str, aVar);
        }
    }

    @Override // com.taobao.android.pissarro.external.c
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            this.mService.onDestory();
        }
    }
}
