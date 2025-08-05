package com.taobao.cameralink.miniapp.skincamera;

import android.hardware.Camera;

/* compiled from: lambda */
/* renamed from: com.taobao.cameralink.miniapp.skincamera.-$$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU  reason: invalid class name */
/* loaded from: classes7.dex */
public final /* synthetic */ class $$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU implements Camera.PictureCallback {
    public static final /* synthetic */ $$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU INSTANCE = new $$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU();

    private /* synthetic */ $$Lambda$a$8pwwrJie4xKFCDLzvdE1ZHASRMU() {
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        a.a(bArr, camera);
    }
}
