package com.taobao.android.tschedule;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface TScheduleHttpCallback extends Serializable {
    void onError();

    void onSuccess(Object obj);
}
