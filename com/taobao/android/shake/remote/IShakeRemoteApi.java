package com.taobao.android.shake.remote;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.android.shake.api.c;

/* loaded from: classes6.dex */
public interface IShakeRemoteApi {
    boolean homePageEnableShake(boolean z);

    boolean homePageIsShakeEnable();

    void homePageRegisterService(ViewStub viewStub);

    void homePageUnregisterService();

    void shakeSensorRegisterService(Context context, c.b bVar, c.a aVar);

    void shakeSensorRequestDetection();

    void shakeSensorUnregisterService();
}
