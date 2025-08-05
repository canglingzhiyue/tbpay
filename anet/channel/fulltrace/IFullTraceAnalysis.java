package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;

/* loaded from: classes.dex */
public interface IFullTraceAnalysis {

    /* loaded from: classes2.dex */
    public interface Stage {
        public static final String FINISH = "netFinish";
        public static final String REQ_PROCESS_START = "netReqProcessStart";
        public static final String REQ_SEND_START = "netReqSendStart";
        public static final String REQ_START = "netReqStart";
        public static final String RSP_CB_DISPATCH = "netRspCbDispatch";
        public static final String RSP_CB_END = "netRspCbEnd";
        public static final String RSP_CB_START = "netRspCbStart";
        public static final String RSP_RECV_END = "netRspRecvEnd";
    }

    void commitRequest(String str, RequestStatistic requestStatistic);

    String createRequest();

    SceneInfo getSceneInfo();

    void log(String str, String str2, String str3);
}
