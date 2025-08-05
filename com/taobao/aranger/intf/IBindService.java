package com.taobao.aranger.intf;

import android.os.IBinder;
import com.taobao.aranger.annotation.type.Callback;

@Callback
/* loaded from: classes6.dex */
public interface IBindService {
    void onBind(String str, IBinder iBinder);
}
