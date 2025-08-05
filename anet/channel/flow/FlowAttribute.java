package anet.channel.flow;

import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class FlowAttribute implements Serializable {
    public HashMap<String, Long> reportUseCellFlow = null;
    public HashMap<String, DayFlowStat> topTraffic;
    public HashMap<String, SingleFlowStat> topTrafficUrl;
    public HashMap<String, Double> useCellFlow;

    static {
        kge.a(-1585524052);
        kge.a(1028243835);
    }

    public FlowAttribute() {
        this.topTraffic = null;
        this.topTrafficUrl = null;
        this.useCellFlow = null;
        if (this.topTraffic == null) {
            this.topTraffic = new HashMap<>();
        }
        if (this.topTrafficUrl == null) {
            this.topTrafficUrl = new HashMap<>();
        }
        if (this.useCellFlow == null) {
            this.useCellFlow = new HashMap<>();
        }
    }
}
