package com.taobao.homepage.pop.protocol.event;

import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IPopViewEventListener {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopEventType {
    }

    void onEvent(int i, IPopData iPopData);
}
