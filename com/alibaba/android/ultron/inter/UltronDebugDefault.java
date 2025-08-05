package com.alibaba.android.ultron.inter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronDebugDefault implements UltronDebugInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1376165745);
        kge.a(-1935565817);
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public boolean isConnectedStudio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f1d71c0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void registerStatusCallback(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e52946", new Object[]{this, str, aVar});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void registerStatusListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697a7c2b", new Object[]{this, aVar});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void sendStatusCallback(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b846035", new Object[]{this, str, map});
        }
    }

    @Override // com.alibaba.android.ultron.inter.UltronDebugInterface
    public void sendStatusEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3593b4", new Object[]{this, str, map});
        }
    }
}
