package anetwork.channel;

import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkCallBack {

    /* loaded from: classes.dex */
    public interface FinishListener extends NetworkListener {
        void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj);
    }

    /* loaded from: classes.dex */
    public interface InputStreamListener extends NetworkListener {
        void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj);
    }

    /* loaded from: classes.dex */
    public interface ProgressListener extends NetworkListener {
        void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj);
    }

    /* loaded from: classes.dex */
    public interface ResponseCodeListener extends NetworkListener {
        boolean onResponseCode(int i, Map<String, List<String>> map, Object obj);
    }

    static {
        kge.a(649555493);
    }
}
