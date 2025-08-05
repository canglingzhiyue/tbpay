package com.taobao.update.instantpatch.flow;

import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.common.PatchResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.taobao.update.instantpatch.d;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.IOException;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f23437a;

    static {
        kge.a(944396076);
    }

    public b(d dVar) {
        this.f23437a = dVar;
    }

    public void install(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5187e874", new Object[]{this, instantUpdateInfo});
            return;
        }
        PatchResult patchResult = new PatchResult();
        PatchInfo createPatchInfo = InstantPatchUpdater.instance().createPatchInfo(instantUpdateInfo);
        try {
            InstantPatcher.create(this.f23437a.context).setiPatchVerifier(new PatchChecker());
            patchResult = InstantPatcher.create(this.f23437a.context).handlePatches(this.f23437a.path, createPatchInfo);
        } catch (IOException e) {
            e.printStackTrace();
            patchResult.resCode = 3;
        }
        switch (patchResult.resCode) {
            case 0:
                this.f23437a.success = true;
                return;
            case 1:
                this.f23437a.success = true;
                return;
            case 2:
                d dVar = this.f23437a;
                dVar.success = false;
                dVar.errorCode = 2;
                dVar.errorMsg = "patch verify failed";
                return;
            case 3:
                d dVar2 = this.f23437a;
                dVar2.success = false;
                dVar2.errorCode = 3;
                dVar2.errorMsg = patchResult.msg;
                return;
            case 4:
                d dVar3 = this.f23437a;
                dVar3.success = false;
                dVar3.errorCode = 4;
                dVar3.errorMsg = "patch has no dex";
                return;
            case 5:
                d dVar4 = this.f23437a;
                dVar4.success = false;
                dVar4.errorCode = 5;
                dVar4.errorMsg = "patch is mismatch";
                return;
            case 6:
                d dVar5 = this.f23437a;
                dVar5.success = false;
                dVar5.errorCode = 6;
                dVar5.errorMsg = patchResult.msg;
                return;
            default:
                return;
        }
    }
}
