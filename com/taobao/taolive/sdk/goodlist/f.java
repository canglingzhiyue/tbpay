package com.taobao.taolive.sdk.goodlist;

import android.view.ViewGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import java.util.HashMap;

/* loaded from: classes8.dex */
public interface f {
    BaseFrame getFrame();

    void hide();

    void setContainer(ViewGroup viewGroup, ViewGroup viewGroup2);

    void setFrameEventListener(h hVar);

    void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2);
}
