package anet.channel.fulltrace;

import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class AnalysisFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.AnalysisFactory";
    private static volatile IFullTraceAnalysis analysis;
    private static boolean analysisV2Enable;
    private static volatile IFullTraceAnalysisV3 analysisV3;
    private static boolean analysisV3Enable;

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : analysisV2Enable;
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        analysisV2Enable = z;
        return z;
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue() : analysisV3Enable;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        analysisV3Enable = z;
        return z;
    }

    static {
        kge.a(-1539732298);
        analysis = new AnalysisProxy(null);
        analysisV3 = new AnalysisProxyV3(null);
        analysisV2Enable = false;
        analysisV3Enable = false;
    }

    public static IFullTraceAnalysis getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFullTraceAnalysis) ipChange.ipc$dispatch("ad097302", new Object[0]) : analysis;
    }

    public static void setInstance(IFullTraceAnalysis iFullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f189a2", new Object[]{iFullTraceAnalysis});
        } else {
            analysis = new AnalysisProxy(iFullTraceAnalysis);
        }
    }

    public static IFullTraceAnalysisV3 getV3Instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFullTraceAnalysisV3) ipChange.ipc$dispatch("20cb862", new Object[0]) : analysisV3;
    }

    public static void setV3Instance(IFullTraceAnalysisV3 iFullTraceAnalysisV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4b3e8", new Object[]{iFullTraceAnalysisV3});
        } else {
            analysisV3 = new AnalysisProxyV3(iFullTraceAnalysisV3);
        }
    }

    /* loaded from: classes.dex */
    public static class AnalysisProxy implements IFullTraceAnalysis {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private IFullTraceAnalysis analysis;

        static {
            kge.a(-2134396572);
            kge.a(2104502369);
        }

        public AnalysisProxy(IFullTraceAnalysis iFullTraceAnalysis) {
            this.analysis = iFullTraceAnalysis;
            AnalysisFactory.access$002(true);
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public String createRequest() {
            IFullTraceAnalysis iFullTraceAnalysis;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57145ee6", new Object[]{this});
            }
            if (!AnalysisFactory.access$000() || (iFullTraceAnalysis = this.analysis) == null) {
                return null;
            }
            try {
                str = iFullTraceAnalysis.createRequest();
            } catch (Throwable th) {
                AnalysisFactory.access$002(false);
                ALog.e(AnalysisFactory.TAG, "createRequest fail.", null, th, new Object[0]);
                str = null;
            }
            ALog.e(AnalysisFactory.TAG, "createRequest", null, "falcoId", str);
            return str;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void commitRequest(String str, RequestStatistic requestStatistic) {
            IFullTraceAnalysis iFullTraceAnalysis;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b5943df", new Object[]{this, str, requestStatistic});
            } else if (!AnalysisFactory.access$000() || (iFullTraceAnalysis = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysis.commitRequest(str, requestStatistic);
                } catch (Throwable th) {
                    AnalysisFactory.access$002(false);
                    ALog.e(AnalysisFactory.TAG, "fulltrace commit fail.", null, th, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public SceneInfo getSceneInfo() {
            IFullTraceAnalysis iFullTraceAnalysis;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SceneInfo) ipChange.ipc$dispatch("b76919f8", new Object[]{this});
            }
            if (!AnalysisFactory.access$000() || (iFullTraceAnalysis = this.analysis) == null) {
                return null;
            }
            try {
                return iFullTraceAnalysis.getSceneInfo();
            } catch (Throwable th) {
                AnalysisFactory.access$002(false);
                ALog.e(AnalysisFactory.TAG, "getSceneInfo fail", null, th, new Object[0]);
                return null;
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void log(String str, String str2, String str3) {
            IFullTraceAnalysis iFullTraceAnalysis;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c228169", new Object[]{this, str, str2, str3});
            } else if (!AnalysisFactory.access$000() || (iFullTraceAnalysis = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysis.log(str, str2, str3);
                } catch (Throwable unused) {
                    AnalysisFactory.access$002(false);
                    ALog.e(AnalysisFactory.TAG, "fulltrace log fail.", null, new Object[0]);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class AnalysisProxyV3 implements IFullTraceAnalysisV3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private IFullTraceAnalysisV3 analysis;

        static {
            kge.a(1839264513);
            kge.a(-502817090);
        }

        public AnalysisProxyV3(IFullTraceAnalysisV3 iFullTraceAnalysisV3) {
            this.analysis = iFullTraceAnalysisV3;
            AnalysisFactory.access$102(true);
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
        public IFullTraceAnalysisV3.ISpan createRequest(Map<String, String> map) {
            IFullTraceAnalysisV3 iFullTraceAnalysisV3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFullTraceAnalysisV3.ISpan) ipChange.ipc$dispatch("403cf90f", new Object[]{this, map});
            }
            if (AnalysisFactory.access$100() && (iFullTraceAnalysisV3 = this.analysis) != null) {
                try {
                    return iFullTraceAnalysisV3.createRequest(map);
                } catch (Throwable unused) {
                    AnalysisFactory.access$102(false);
                    ALog.e(AnalysisFactory.TAG, "createRequest log fail.", null, new Object[0]);
                }
            }
            return null;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
        public void setRequestStage(IFullTraceAnalysisV3.ISpan iSpan, String str, long j) {
            IFullTraceAnalysisV3 iFullTraceAnalysisV3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d792305e", new Object[]{this, iSpan, str, new Long(j)});
            } else if (!AnalysisFactory.access$100() || (iFullTraceAnalysisV3 = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysisV3.setRequestStage(iSpan, str, j);
                } catch (Throwable unused) {
                    AnalysisFactory.access$102(false);
                    ALog.e(AnalysisFactory.TAG, "setRequestStage fail.", null, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
        public void finishRequest(IFullTraceAnalysisV3.ISpan iSpan, RequestStatistic requestStatistic) {
            IFullTraceAnalysisV3 iFullTraceAnalysisV3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4de0c17", new Object[]{this, iSpan, requestStatistic});
            } else if (!AnalysisFactory.access$100() || (iFullTraceAnalysisV3 = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysisV3.finishRequest(iSpan, requestStatistic);
                } catch (Throwable unused) {
                    AnalysisFactory.access$102(false);
                    ALog.e(AnalysisFactory.TAG, "finishRequest fail.", null, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
        public void log(IFullTraceAnalysisV3.ISpan iSpan, String str, String str2) {
            IFullTraceAnalysisV3 iFullTraceAnalysisV3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8841c77d", new Object[]{this, iSpan, str, str2});
            } else if (!AnalysisFactory.access$100() || (iFullTraceAnalysisV3 = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysisV3.log(iSpan, str, str2);
                } catch (Throwable unused) {
                    AnalysisFactory.access$102(false);
                    ALog.e(AnalysisFactory.TAG, "log fail.", null, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
        public void recordAppStatus(String str, String str2) {
            IFullTraceAnalysisV3 iFullTraceAnalysisV3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ad5503d", new Object[]{this, str, str2});
            } else if (!AnalysisFactory.access$100() || (iFullTraceAnalysisV3 = this.analysis) == null) {
            } else {
                try {
                    iFullTraceAnalysisV3.recordAppStatus(str, str2);
                } catch (Throwable unused) {
                    AnalysisFactory.access$102(false);
                    ALog.e(AnalysisFactory.TAG, "recordAppStatus fail.", null, new Object[0]);
                }
            }
        }
    }
}
