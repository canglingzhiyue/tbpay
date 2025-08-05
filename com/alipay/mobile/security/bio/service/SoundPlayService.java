package com.alipay.mobile.security.bio.service;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class SoundPlayService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void init(Context context, boolean z);

    public abstract boolean isInitialized();

    public abstract void play(String str);

    public abstract void release();

    public abstract void stop();
}
