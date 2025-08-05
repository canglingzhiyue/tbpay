package com.taobao.android.themis.graphics.audio;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;

/* loaded from: classes6.dex */
public class AudioContextFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a sProvider;

    /* loaded from: classes6.dex */
    public interface a {
        com.taobao.android.themis.graphics.audio.a a(String str);
    }

    public AudioContextFactory(a aVar) {
        this.sProvider = aVar;
    }

    public com.taobao.android.themis.graphics.audio.a create(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.themis.graphics.audio.a) ipChange.ipc$dispatch("5426e1be", new Object[]{this, str});
        }
        a aVar = this.sProvider;
        if (aVar != null) {
            return aVar.a(str);
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        e.a(rVLLevel, RPCDataItems.SWITCH_TAG_LOG, "AudioContextFactory create audioContext with id:" + str + "failed because sProvider is null");
        return null;
    }

    public AudioContextProxy createAudioContextProxy(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioContextProxy) ipChange.ipc$dispatch("db359189", new Object[]{this, new Long(j), str});
        }
        a aVar = this.sProvider;
        if (aVar != null) {
            return new AudioContextProxy(aVar.a(str), j);
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        e.a(rVLLevel, RPCDataItems.SWITCH_TAG_LOG, "AudioContextFactory create AudioContextProxy with id:" + str + "failed because sProvider is null");
        return null;
    }
}
