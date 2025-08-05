package com.taobao.aranger.intf;

import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;

/* loaded from: classes.dex */
public interface IRemoteService extends IService {
    void connect() throws Exception;

    boolean isRemote();

    Reply sendCall(Call call) throws Exception;
}
