package anet.channel.assist;

/* loaded from: classes2.dex */
public interface IDualWifiCapability extends ICapability {
    boolean checkStatus();

    void release();

    void request();
}
