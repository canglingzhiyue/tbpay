package android.taobao.windvane.extra.uc.interfaces;

import java.util.Map;

/* loaded from: classes2.dex */
public interface INetwork {
    public static final int ALINETWORK = 1;
    public static final int THIRDNETWORK = 2;
    public static final int UCNETWORK = 0;

    IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2);

    int getNetworkType();

    String getVersion();

    boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2);

    boolean sendRequest(IRequest iRequest);
}
