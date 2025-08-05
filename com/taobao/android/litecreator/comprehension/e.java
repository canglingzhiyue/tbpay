package com.taobao.android.litecreator.comprehension;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.i;
import com.uploader.export.j;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements com.uploader.export.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1441388918);
        kge.a(1593071130);
    }

    @Override // com.uploader.export.d
    public void onCancel(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onFailure(i iVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
        }
    }

    @Override // com.uploader.export.d
    public void onPause(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onProgress(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
        }
    }

    @Override // com.uploader.export.d
    public void onResume(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onStart(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onSuccess(i iVar, com.uploader.export.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
        }
    }

    @Override // com.uploader.export.d
    public void onWait(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
        }
    }
}
