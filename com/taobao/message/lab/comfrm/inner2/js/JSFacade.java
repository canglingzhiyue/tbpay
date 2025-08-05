package com.taobao.message.lab.comfrm.inner2.js;

import android.content.Context;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.support.model.Func1;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public interface JSFacade {
    void destory();

    String executeJS2String(String str, String str2);

    String executeJSFunc(String str, String str2, Object[] objArr);

    void initJS(Context context, String str, ExecutorService executorService);

    boolean isDemote();

    void registerDelayListFunc(String str, Func1<String, List> func1);

    void registerObjectFunc(String str, Func1<String, Object> func1);

    void registerStringFunc(String str, Action1<String> action1);

    void startRemoteInspect(String str);
}
