package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.os.Handler;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;

/* loaded from: classes8.dex */
public interface c {
    boolean applyModule(String str, String str2);

    void destroy();

    void dispatchJS(String str);

    void initJSContext(Context context, TNodeJSCore tNodeJSCore, String str, TNodeJSCore.AC ac, String str2);

    boolean initJSCore(g gVar, Handler handler);
}
