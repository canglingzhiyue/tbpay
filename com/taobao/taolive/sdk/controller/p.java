package com.taobao.taolive.sdk.controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class p extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public e mGlobalContext;

    static {
        kge.a(-657002558);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public void initMultiRoomVideoControllerObserver(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b3c8c", new Object[]{this, bVar});
        }
    }

    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        }
    }

    public p(View view) {
        super(view);
    }

    public void setGlobalContext(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d7d35", new Object[]{this, eVar});
        } else {
            this.mGlobalContext = eVar;
        }
    }
}
