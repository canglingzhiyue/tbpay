package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.c;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WalleStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean mStreamProcessingInitialized;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final WalleStreamListener f23699a;

        static {
            kge.a(2126564895);
            f23699a = new WalleStreamListener();
        }

        public static /* synthetic */ WalleStreamListener a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WalleStreamListener) ipChange.ipc$dispatch("ec129fec", new Object[0]) : f23699a;
        }
    }

    public native void nativeRegisterCallbackToStreamConstructor();

    static {
        kge.a(809723725);
        mStreamProcessingInitialized = false;
    }

    public static WalleStreamListener getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WalleStreamListener) ipChange.ipc$dispatch("fe81d796", new Object[0]) : a.a();
    }

    public static boolean isStreamProcessingInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5e507a2", new Object[0])).booleanValue() : mStreamProcessingInitialized;
    }

    public void eventConstructed(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44859ee2", new Object[]{this, map});
        } else {
            c.a().a(map);
        }
    }

    public void registerCallbackToStreamConstructor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e58e2fe", new Object[]{this});
            return;
        }
        nativeRegisterCallbackToStreamConstructor();
        mStreamProcessingInitialized = true;
    }
}
