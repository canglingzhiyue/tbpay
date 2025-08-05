package com.taobao.mass;

import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;
import java.util.List;

@ServiceName("com.taobao.mass.MassService")
/* loaded from: classes7.dex */
public interface IMassService {
    @AutoRecover
    List<String> getTopicsByService(String str) throws IPCException;

    @AutoRecover
    void registerTopic(String str, String str2) throws IPCException;

    @AutoRecover
    void unregisterTopic(String str, String str2) throws IPCException;
}
