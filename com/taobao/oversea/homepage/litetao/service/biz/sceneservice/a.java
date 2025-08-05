package com.taobao.oversea.homepage.litetao.service.biz.sceneservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lgz;
import tb.ljs;

/* loaded from: classes7.dex */
public class a extends lgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.lgz, com.taobao.infoflow.protocol.engine.invoke.biz.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public a(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lgz, com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            super.c();
        }
    }
}
