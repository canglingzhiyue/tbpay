package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ArtcSignalChannelHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArtcSignalRxHander rxHanler = null;

    /* loaded from: classes6.dex */
    public interface ArgsKey {
        public static final String KEY_CHANNEL_ID = "channelId";
        public static final String KEY_DATA_ID = "dataId";
        public static final String KEY_DEVICE_ID = "deviceId";
        public static final String KEY_SEQUENCE_ID = "sequenceId";
        public static final String KEY_SERVICE_ID = "serviceId";
        public static final String KEY_TYPE_ID = "commandId";
        public static final String KEY_USER_ID = "userId";
    }

    static {
        kge.a(619290624);
    }

    public abstract boolean cancelSend(String str, Map<String, String> map);

    public abstract String sendData(byte[] bArr, Map<String, String> map);

    public void setRxHander(ArtcSignalRxHander artcSignalRxHander) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6621b9df", new Object[]{this, artcSignalRxHander});
        } else {
            this.rxHanler = artcSignalRxHander;
        }
    }
}
