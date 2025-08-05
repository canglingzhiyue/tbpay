package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.statist.LongRequestMonitorStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.monitor.NetworkQoSCenter;
import anetwork.channel.monitor.RRPSpeedCalculator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class Repeater implements Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SO_DOWNLOAD_HOST = "mtlexternal.alibabausercontent.com";
    private static final String TAG = "anet.Repeater";
    private boolean bInputStreamListener;
    private RequestConfig config;
    private ParcelableNetworkListener mListenerWrapper;
    private String seqNo;
    private ParcelableInputStreamImpl inputStream = null;
    private long responseCbStart = 0;
    private long responseStartTime = -1;
    private long responseCbTime = -1;
    private long cbTime = 0;

    static {
        kge.a(-2059648538);
        kge.a(-489377091);
    }

    public static /* synthetic */ long access$000(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da6342f4", new Object[]{repeater})).longValue() : repeater.responseCbStart;
    }

    public static /* synthetic */ long access$002(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20417576", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.responseCbStart = j;
        return j;
    }

    public static /* synthetic */ long access$100(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("67036df5", new Object[]{repeater})).longValue() : repeater.responseCbTime;
    }

    public static /* synthetic */ long access$102(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27a6aa95", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.responseCbTime = j;
        return j;
    }

    public static /* synthetic */ long access$200(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a398f6", new Object[]{repeater})).longValue() : repeater.responseStartTime;
    }

    public static /* synthetic */ long access$300(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8043c3f7", new Object[]{repeater})).longValue() : repeater.cbTime;
    }

    public static /* synthetic */ long access$302(Repeater repeater, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("367114d3", new Object[]{repeater, new Long(j)})).longValue();
        }
        repeater.cbTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$400(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce3ef08", new Object[]{repeater})).booleanValue() : repeater.bInputStreamListener;
    }

    public static /* synthetic */ RequestConfig access$500(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestConfig) ipChange.ipc$dispatch("dd2f6543", new Object[]{repeater}) : repeater.config;
    }

    public static /* synthetic */ ParcelableInputStreamImpl access$600(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParcelableInputStreamImpl) ipChange.ipc$dispatch("1399be81", new Object[]{repeater}) : repeater.inputStream;
    }

    public static /* synthetic */ ParcelableInputStreamImpl access$602(Repeater repeater, ParcelableInputStreamImpl parcelableInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParcelableInputStreamImpl) ipChange.ipc$dispatch("937f637e", new Object[]{repeater, parcelableInputStreamImpl});
        }
        repeater.inputStream = parcelableInputStreamImpl;
        return parcelableInputStreamImpl;
    }

    public static /* synthetic */ String access$700(Repeater repeater) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29e0b379", new Object[]{repeater}) : repeater.seqNo;
    }

    public static /* synthetic */ void access$800(Repeater repeater, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739741e0", new Object[]{repeater, requestStatistic});
        } else {
            repeater.checkLongRequest(requestStatistic);
        }
    }

    public static /* synthetic */ void access$900(Repeater repeater, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518aa7bf", new Object[]{repeater, requestStatistic});
        } else {
            repeater.doCheckLongRequestTask(requestStatistic);
        }
    }

    public Repeater(ParcelableNetworkListener parcelableNetworkListener, RequestConfig requestConfig) {
        this.bInputStreamListener = false;
        this.config = null;
        this.mListenerWrapper = parcelableNetworkListener;
        this.config = requestConfig;
        if (parcelableNetworkListener != null) {
            try {
                if ((parcelableNetworkListener.getListenerState() & 8) == 0) {
                    return;
                }
                this.bInputStreamListener = true;
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onResponseCode(final int i, final Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "[onResponseCode]", this.seqNo, new Object[0]);
        }
        this.responseStartTime = System.currentTimeMillis();
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener == null) {
            return;
        }
        dispatchCallBack(new Runnable() { // from class: anetwork.channel.entity.Repeater.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Repeater.access$002(Repeater.this, System.currentTimeMillis());
                    Repeater.access$102(Repeater.this, Repeater.access$000(Repeater.this) - Repeater.access$200(Repeater.this));
                    parcelableNetworkListener.onResponseCode(i, new ParcelableHeader(i, map));
                    Repeater.access$302(Repeater.this, 0L);
                    Repeater.access$302(Repeater.this, Repeater.access$300(Repeater.this) + (System.currentTimeMillis() - Repeater.access$000(Repeater.this)));
                } catch (RemoteException unused) {
                }
            }
        });
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onDataReceiveSize(final int i, final int i2, final ByteArray byteArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30133c3", new Object[]{this, new Integer(i), new Integer(i2), byteArray});
            return;
        }
        if (byteArray != null) {
            NetworkQoSCenter.getInstance().update(this.config.getHost(), System.currentTimeMillis(), byteArray.getDataLength());
            RRPSpeedCalculator.getInstance().receive(byteArray.getDataLength());
        }
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener == null) {
            return;
        }
        dispatchCallBack(new Runnable() { // from class: anetwork.channel.entity.Repeater.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!Repeater.access$400(Repeater.this)) {
                    DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent(i, byteArray.getDataLength(), i2, byteArray.getBuffer(), byteArray.getRangeIndex());
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (i == 1) {
                            Repeater.access$500(Repeater.this).rs.putExtra("firstDataCbTime", Long.valueOf(System.currentTimeMillis() - Repeater.access$200(Repeater.this)));
                        }
                        parcelableNetworkListener.onDataReceived(defaultProgressEvent);
                        Repeater.access$302(Repeater.this, Repeater.access$300(Repeater.this) + (System.currentTimeMillis() - currentTimeMillis));
                    } catch (RemoteException unused) {
                    }
                } else {
                    try {
                        if (Repeater.access$600(Repeater.this) != null) {
                            Repeater.access$600(Repeater.this).write(byteArray);
                            return;
                        }
                        Repeater.access$602(Repeater.this, new ParcelableInputStreamImpl());
                        Repeater.access$600(Repeater.this).init(Repeater.access$500(Repeater.this), i2);
                        Repeater.access$600(Repeater.this).write(byteArray);
                        parcelableNetworkListener.onInputStreamGet(Repeater.access$600(Repeater.this));
                    } catch (Exception unused2) {
                        if (Repeater.access$600(Repeater.this) == null) {
                            return;
                        }
                        try {
                            Repeater.access$600(Repeater.this).close();
                        } catch (RemoteException unused3) {
                        }
                    }
                }
            }
        });
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onFinish(final DefaultFinishEvent defaultFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0dbf1", new Object[]{this, defaultFinishEvent});
            return;
        }
        final ParcelableNetworkListener parcelableNetworkListener = this.mListenerWrapper;
        if (parcelableNetworkListener != null) {
            Runnable runnable = new Runnable() { // from class: anetwork.channel.entity.Repeater.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(47:39|(3:41|(2:44|42)|45)|46|(1:48)|49|(1:55)|56|(5:58|(1:60)|61|(1:63)(1:65)|64)|66|(1:72)|73|(1:162)|79|(1:81)|82|(1:84)|85|(1:89)|90|(24:95|96|(1:98)(1:154)|99|(1:101)|102|(1:153)|108|(1:110)|111|(1:119)|120|(2:149|150)|122|(1:124)|125|(1:148)|133|134|(1:136)(1:146)|137|(1:144)|141|142)|155|96|(0)(0)|99|(0)|102|(1:104)|153|108|(0)|111|(4:113|115|117|119)|120|(0)|122|(0)|125|(1:127)|148|133|134|(0)(0)|137|(1:139)|144|141|142) */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0386  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x03a3 A[Catch: Throwable -> 0x04ca, TryCatch #0 {Throwable -> 0x04ca, blocks: (B:9:0x0020, B:11:0x009c, B:15:0x00fd, B:17:0x011b, B:19:0x0121, B:20:0x0130, B:24:0x0145, B:28:0x0154, B:30:0x0159, B:32:0x0177, B:34:0x019b, B:36:0x01a6, B:37:0x01ac, B:39:0x01c0, B:41:0x01c8, B:43:0x01d3, B:45:0x021a, B:46:0x021f, B:48:0x0224, B:49:0x0236, B:51:0x023c, B:52:0x024a, B:54:0x0250, B:56:0x0254, B:58:0x0258, B:59:0x026a, B:61:0x0274, B:63:0x0294, B:64:0x029b, B:68:0x02a6, B:69:0x02b0, B:71:0x02b6, B:73:0x02be, B:75:0x02c8, B:76:0x02d1, B:78:0x02ea, B:80:0x02f2, B:89:0x0327, B:91:0x032b, B:92:0x0341, B:94:0x0345, B:95:0x034c, B:97:0x0355, B:99:0x0359, B:100:0x0368, B:102:0x0373, B:107:0x0382, B:111:0x0389, B:113:0x03a3, B:114:0x03af, B:116:0x03b4, B:118:0x03b8, B:121:0x03c8, B:123:0x03d2, B:124:0x03de, B:126:0x03e4, B:128:0x03f1, B:130:0x03f9, B:132:0x03fd, B:133:0x043e, B:135:0x0442, B:136:0x044e, B:138:0x0459, B:139:0x045c, B:141:0x0462, B:143:0x046a, B:145:0x046e, B:148:0x0482, B:152:0x0493, B:154:0x0499, B:156:0x049f, B:151:0x048a, B:157:0x04ab, B:147:0x0476, B:120:0x03bc, B:82:0x02fd, B:84:0x0308, B:86:0x030e, B:88:0x0318), top: B:162:0x0020 }] */
                /* JADX WARN: Removed duplicated region for block: B:123:0x03d2 A[Catch: Throwable -> 0x04ca, TryCatch #0 {Throwable -> 0x04ca, blocks: (B:9:0x0020, B:11:0x009c, B:15:0x00fd, B:17:0x011b, B:19:0x0121, B:20:0x0130, B:24:0x0145, B:28:0x0154, B:30:0x0159, B:32:0x0177, B:34:0x019b, B:36:0x01a6, B:37:0x01ac, B:39:0x01c0, B:41:0x01c8, B:43:0x01d3, B:45:0x021a, B:46:0x021f, B:48:0x0224, B:49:0x0236, B:51:0x023c, B:52:0x024a, B:54:0x0250, B:56:0x0254, B:58:0x0258, B:59:0x026a, B:61:0x0274, B:63:0x0294, B:64:0x029b, B:68:0x02a6, B:69:0x02b0, B:71:0x02b6, B:73:0x02be, B:75:0x02c8, B:76:0x02d1, B:78:0x02ea, B:80:0x02f2, B:89:0x0327, B:91:0x032b, B:92:0x0341, B:94:0x0345, B:95:0x034c, B:97:0x0355, B:99:0x0359, B:100:0x0368, B:102:0x0373, B:107:0x0382, B:111:0x0389, B:113:0x03a3, B:114:0x03af, B:116:0x03b4, B:118:0x03b8, B:121:0x03c8, B:123:0x03d2, B:124:0x03de, B:126:0x03e4, B:128:0x03f1, B:130:0x03f9, B:132:0x03fd, B:133:0x043e, B:135:0x0442, B:136:0x044e, B:138:0x0459, B:139:0x045c, B:141:0x0462, B:143:0x046a, B:145:0x046e, B:148:0x0482, B:152:0x0493, B:154:0x0499, B:156:0x049f, B:151:0x048a, B:157:0x04ab, B:147:0x0476, B:120:0x03bc, B:82:0x02fd, B:84:0x0308, B:86:0x030e, B:88:0x0318), top: B:162:0x0020 }] */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0459 A[Catch: Throwable -> 0x04ca, TryCatch #0 {Throwable -> 0x04ca, blocks: (B:9:0x0020, B:11:0x009c, B:15:0x00fd, B:17:0x011b, B:19:0x0121, B:20:0x0130, B:24:0x0145, B:28:0x0154, B:30:0x0159, B:32:0x0177, B:34:0x019b, B:36:0x01a6, B:37:0x01ac, B:39:0x01c0, B:41:0x01c8, B:43:0x01d3, B:45:0x021a, B:46:0x021f, B:48:0x0224, B:49:0x0236, B:51:0x023c, B:52:0x024a, B:54:0x0250, B:56:0x0254, B:58:0x0258, B:59:0x026a, B:61:0x0274, B:63:0x0294, B:64:0x029b, B:68:0x02a6, B:69:0x02b0, B:71:0x02b6, B:73:0x02be, B:75:0x02c8, B:76:0x02d1, B:78:0x02ea, B:80:0x02f2, B:89:0x0327, B:91:0x032b, B:92:0x0341, B:94:0x0345, B:95:0x034c, B:97:0x0355, B:99:0x0359, B:100:0x0368, B:102:0x0373, B:107:0x0382, B:111:0x0389, B:113:0x03a3, B:114:0x03af, B:116:0x03b4, B:118:0x03b8, B:121:0x03c8, B:123:0x03d2, B:124:0x03de, B:126:0x03e4, B:128:0x03f1, B:130:0x03f9, B:132:0x03fd, B:133:0x043e, B:135:0x0442, B:136:0x044e, B:138:0x0459, B:139:0x045c, B:141:0x0462, B:143:0x046a, B:145:0x046e, B:148:0x0482, B:152:0x0493, B:154:0x0499, B:156:0x049f, B:151:0x048a, B:157:0x04ab, B:147:0x0476, B:120:0x03bc, B:82:0x02fd, B:84:0x0308, B:86:0x030e, B:88:0x0318), top: B:162:0x0020 }] */
                /* JADX WARN: Removed duplicated region for block: B:150:0x0488  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x048a A[Catch: Exception -> 0x04ab, Throwable -> 0x04ca, TryCatch #0 {Throwable -> 0x04ca, blocks: (B:9:0x0020, B:11:0x009c, B:15:0x00fd, B:17:0x011b, B:19:0x0121, B:20:0x0130, B:24:0x0145, B:28:0x0154, B:30:0x0159, B:32:0x0177, B:34:0x019b, B:36:0x01a6, B:37:0x01ac, B:39:0x01c0, B:41:0x01c8, B:43:0x01d3, B:45:0x021a, B:46:0x021f, B:48:0x0224, B:49:0x0236, B:51:0x023c, B:52:0x024a, B:54:0x0250, B:56:0x0254, B:58:0x0258, B:59:0x026a, B:61:0x0274, B:63:0x0294, B:64:0x029b, B:68:0x02a6, B:69:0x02b0, B:71:0x02b6, B:73:0x02be, B:75:0x02c8, B:76:0x02d1, B:78:0x02ea, B:80:0x02f2, B:89:0x0327, B:91:0x032b, B:92:0x0341, B:94:0x0345, B:95:0x034c, B:97:0x0355, B:99:0x0359, B:100:0x0368, B:102:0x0373, B:107:0x0382, B:111:0x0389, B:113:0x03a3, B:114:0x03af, B:116:0x03b4, B:118:0x03b8, B:121:0x03c8, B:123:0x03d2, B:124:0x03de, B:126:0x03e4, B:128:0x03f1, B:130:0x03f9, B:132:0x03fd, B:133:0x043e, B:135:0x0442, B:136:0x044e, B:138:0x0459, B:139:0x045c, B:141:0x0462, B:143:0x046a, B:145:0x046e, B:148:0x0482, B:152:0x0493, B:154:0x0499, B:156:0x049f, B:151:0x048a, B:157:0x04ab, B:147:0x0476, B:120:0x03bc, B:82:0x02fd, B:84:0x0308, B:86:0x030e, B:88:0x0318), top: B:162:0x0020 }] */
                /* JADX WARN: Removed duplicated region for block: B:164:0x0442 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1227
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.entity.Repeater.AnonymousClass3.run():void");
                }
            };
            RequestStatistic requestStatistic = defaultFinishEvent.rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbDispatch = System.currentTimeMillis();
                AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspCbDispatch", null);
            }
            dispatchCallBack(runnable);
        }
        this.mListenerWrapper = null;
    }

    private void dispatchCallBack(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d34bb84", new Object[]{this, runnable});
        } else if (this.config.isSyncRequest()) {
            runnable.run();
        } else {
            String str = this.seqNo;
            RepeatProcessor.submitTask(str != null ? str.hashCode() : hashCode(), runnable);
        }
    }

    public void setSeqNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfc034f", new Object[]{this, str});
        } else {
            this.seqNo = str;
        }
    }

    private void checkLongRequest(final RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c554856", new Object[]{this, requestStatistic});
        } else if (!NetworkConfigCenter.isLongRequestMonitorEnable()) {
        } else {
            ThreadPoolExecutorFactory.submitRequestMonitorTask(new Runnable() { // from class: anetwork.channel.entity.Repeater.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Repeater.access$900(Repeater.this, requestStatistic);
                    } catch (Exception e) {
                        ALog.e(Repeater.TAG, "[checkLongRequet]error", null, e, new Object[0]);
                    }
                }
            });
        }
    }

    private void doCheckLongRequestTask(RequestStatistic requestStatistic) {
        String urlString;
        String obj;
        int length;
        int length2;
        int length3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539a7d06", new Object[]{this, requestStatistic});
        } else if (requestStatistic != null && (length3 = (length = (urlString = this.config.getUrlString()).length()) + (length2 = (obj = this.config.getHeaders().toString()).length())) >= 6144) {
            LongRequestMonitorStat longRequestMonitorStat = new LongRequestMonitorStat(this.config.getHttpUrl().simpleUrlString());
            longRequestMonitorStat.originUrl = urlString;
            longRequestMonitorStat.header = obj;
            longRequestMonitorStat.headerSize = length2;
            longRequestMonitorStat.urlSize = length;
            longRequestMonitorStat.httpCode = requestStatistic.statusCode;
            longRequestMonitorStat.method = this.config.getAwcnRequest().getMethod();
            longRequestMonitorStat.refer = requestStatistic.f_refer;
            String str = null;
            for (Map.Entry<String, String> entry : this.config.getHeaders().entrySet()) {
                int length4 = entry.getValue().length();
                if (length4 > i) {
                    str = entry.getKey();
                    i = length4;
                }
            }
            longRequestMonitorStat.maxHeader = str;
            longRequestMonitorStat.maxHeaderSize = i;
            if (length3 >= 8192) {
                longRequestMonitorStat.reportType = 1;
            } else if (length3 >= 7168) {
                longRequestMonitorStat.reportType = 2;
            } else {
                longRequestMonitorStat.reportType = 3;
            }
            AppMonitor.getInstance().commitStat(longRequestMonitorStat);
        }
    }
}
