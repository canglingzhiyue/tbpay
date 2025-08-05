package anetwork.channel;

import anetwork.channel.statist.StatisticData;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkEvent {

    /* loaded from: classes.dex */
    public interface FinishEvent {
        String getDesc();

        int getHttpCode();

        StatisticData getStatisticData();
    }

    /* loaded from: classes.dex */
    public interface ProgressEvent {
        byte[] getBytedata();

        String getDesc();

        int getFragmentIndex();

        int getIndex();

        int getSize();

        int getTotal();
    }

    static {
        kge.a(-1612648230);
    }
}
