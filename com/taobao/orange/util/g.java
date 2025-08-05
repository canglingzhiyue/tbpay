package com.taobao.orange.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import anet.channel.appmonitor.AppMonitor;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.model.ConfigAckDO;
import com.taobao.orange.model.IndexAckDO;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<ConfigAckDO> f18608a;
    private static Handler b;

    static {
        kge.a(-297255973);
        b = new a(Looper.getMainLooper());
        f18608a = new HashSet();
    }

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1112471425);
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 0) {
                if (OLog.isPrintLog(1)) {
                    OLog.d("ReportAck", "wait config acks", new Object[0]);
                }
                sendEmptyMessageDelayed(1, 30000L);
            } else if (i != 1) {
            } else {
                synchronized (g.f18608a) {
                    if (OLog.isPrintLog(1)) {
                        OLog.d("ReportAck", "report config acks", "size", Integer.valueOf(g.f18608a.size()));
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(g.f18608a);
                    g.a(hashSet);
                    g.f18608a.clear();
                }
            }
        }
    }

    public static void a(ConfigAckDO configAckDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21700db", new Object[]{configAckDO});
            return;
        }
        AppMonitor.getInstance().commitStat(configAckDO);
        if (!com.taobao.orange.a.r || configAckDO == null) {
            return;
        }
        synchronized (f18608a) {
            if (f18608a.size() == 0) {
                b.sendEmptyMessage(0);
            }
            f18608a.add(configAckDO);
        }
    }

    public static void a(final Set<ConfigAckDO> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{set});
        } else if (!com.taobao.orange.a.r || set.size() == 0) {
        } else {
            com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.util.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!com.taobao.orange.a.r) {
                    } else {
                        new com.taobao.orange.sync.a(null, true, OConstant.REQTYPE_ACK_CONFIG_UPDATE) { // from class: com.taobao.orange.util.g.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.orange.sync.a
                            public Map<String, String> a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (Map) ipChange3.ipc$dispatch("a014a89d", new Object[]{this});
                                }
                                return null;
                            }

                            @Override // com.taobao.orange.sync.a
                            public Object b(String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ipChange3.ipc$dispatch("6e4e661f", new Object[]{this, str});
                                }
                                return null;
                            }

                            @Override // com.taobao.orange.sync.a
                            public String b() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this}) : JSON.toJSONString(set);
                            }
                        }.c();
                    }
                }
            }, com.taobao.orange.a.t);
        }
    }

    public static void a(final IndexAckDO indexAckDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c09c1", new Object[]{indexAckDO});
            return;
        }
        AppMonitor.getInstance().commitStat(indexAckDO);
        if (!com.taobao.orange.a.r) {
            return;
        }
        if (OLog.isPrintLog(1)) {
            OLog.d("ReportAck", "report index ack", indexAckDO);
        }
        com.taobao.orange.e.a(new Runnable() { // from class: com.taobao.orange.util.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!com.taobao.orange.a.r) {
                } else {
                    new com.taobao.orange.sync.a(null, true, OConstant.REQTYPE_ACK_INDEX_UPDATE) { // from class: com.taobao.orange.util.g.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.orange.sync.a
                        public Map<String, String> a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (Map) ipChange3.ipc$dispatch("a014a89d", new Object[]{this});
                            }
                            return null;
                        }

                        @Override // com.taobao.orange.sync.a
                        public Object b(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ipChange3.ipc$dispatch("6e4e661f", new Object[]{this, str});
                            }
                            return null;
                        }

                        @Override // com.taobao.orange.sync.a
                        public String b() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this}) : JSON.toJSONString(IndexAckDO.this);
                        }
                    }.c();
                }
            }
        }, com.taobao.orange.a.t);
    }
}
