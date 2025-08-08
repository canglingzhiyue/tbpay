package com.taobao.analysis.flow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;
import com.taobao.analysis.stat.DayFlowStatistic;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dir;

/* loaded from: classes.dex */
public class DayFlowReport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_TYPE_SIZE = 12;

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f8540a = new SimpleDateFormat("yyyyMMdd");
    private static volatile DayFlowReport h;
    private long b;
    private long[] c = new long[12];
    private long d = 0;
    private long e = 0;
    private HashMap<String, Long> f = new HashMap<>();
    private HashMap<String, Long> g = new HashMap<>();

    /* loaded from: classes.dex */
    public class FlowCollectBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public FlowCollectBroadcast() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (context != null && intent != null) {
                try {
                    if (!"netAnalysis.day.flow.collect".equals(intent.getAction())) {
                        return;
                    }
                    long[] longArrayExtra = intent.getLongArrayExtra("nettype_flow_array");
                    long longExtra = intent.getLongExtra("bgFlow", 0L);
                    long longExtra2 = intent.getLongExtra("fgFlow", 0L);
                    Map map = (Map) intent.getSerializableExtra("refer_flow_map");
                    Map map2 = (Map) intent.getSerializableExtra("domain_flow_map");
                    synchronized (FlowCenter.class) {
                        if (longArrayExtra != null && longArrayExtra.length == 12) {
                            for (int i = 0; i < DayFlowReport.a(DayFlowReport.this).length; i++) {
                                long[] a2 = DayFlowReport.a(DayFlowReport.this);
                                a2[i] = a2[i] + longArrayExtra[i];
                            }
                        }
                        DayFlowReport.a(DayFlowReport.this, DayFlowReport.b(DayFlowReport.this) + longExtra2);
                        DayFlowReport.b(DayFlowReport.this, DayFlowReport.c(DayFlowReport.this) + longExtra);
                        DayFlowReport.d(DayFlowReport.this).putAll(map);
                        DayFlowReport.e(DayFlowReport.this).putAll(map2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static /* synthetic */ long a(DayFlowReport dayFlowReport, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22893c7e", new Object[]{dayFlowReport, new Long(j)})).longValue();
        }
        dayFlowReport.d = j;
        return j;
    }

    public static /* synthetic */ long[] a(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("2288c6ab", new Object[]{dayFlowReport}) : dayFlowReport.c;
    }

    public static /* synthetic */ long b(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38a52bef", new Object[]{dayFlowReport})).longValue() : dayFlowReport.d;
    }

    public static /* synthetic */ long b(DayFlowReport dayFlowReport, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc00ca1d", new Object[]{dayFlowReport, new Long(j)})).longValue();
        }
        dayFlowReport.e = j;
        return j;
    }

    public static /* synthetic */ long c(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d345ee70", new Object[]{dayFlowReport})).longValue() : dayFlowReport.e;
    }

    public static /* synthetic */ HashMap d(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("b2988120", new Object[]{dayFlowReport}) : dayFlowReport.f;
    }

    public static /* synthetic */ HashMap e(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a6280561", new Object[]{dayFlowReport}) : dayFlowReport.g;
    }

    private DayFlowReport() {
        if (FlowCenter.isMainProcess) {
            dir.b.registerReceiver(new FlowCollectBroadcast(), new IntentFilter("netAnalysis.day.flow.collect"));
        }
        dir.a();
        AppMonitor.getInstance().register(DayFlowStatistic.class);
        b();
    }

    public static DayFlowReport a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DayFlowReport) ipChange.ipc$dispatch("d6055440", new Object[0]);
        }
        if (h == null) {
            synchronized (DayFlowReport.class) {
                if (h == null) {
                    h = new DayFlowReport();
                }
            }
        }
        return h;
    }

    private void b() {
        DataInputStream dataInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (FlowCenter.isMainProcess) {
            DataInputStream dataInputStream2 = null;
            try {
                File file = new File(dir.b.getFilesDir(), "NetDayFlows");
                if (file.exists()) {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                    try {
                        if (dataInputStream.readBoolean()) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused) {
                            }
                            if (this.b != 0) {
                                return;
                            }
                            this.b = System.currentTimeMillis();
                            return;
                        }
                        this.b = dataInputStream.readLong();
                        for (int i = 0; i < this.c.length; i++) {
                            this.c[i] = dataInputStream.readLong();
                        }
                        this.d = dataInputStream.readLong();
                        this.e = dataInputStream.readLong();
                        for (int readInt = dataInputStream.readInt(); readInt > 0; readInt--) {
                            this.f.put(dataInputStream.readUTF(), Long.valueOf(dataInputStream.readLong()));
                        }
                        for (int readInt2 = dataInputStream.readInt(); readInt2 > 0; readInt2--) {
                            this.g.put(dataInputStream.readUTF(), Long.valueOf(dataInputStream.readLong()));
                        }
                        dataInputStream2 = dataInputStream;
                    } catch (Exception unused2) {
                        dataInputStream2 = dataInputStream;
                        if (dataInputStream2 != null) {
                            try {
                                dataInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (this.b != 0) {
                            return;
                        }
                        this.b = System.currentTimeMillis();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (this.b == 0) {
                            this.b = System.currentTimeMillis();
                        }
                        throw th;
                    }
                }
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                if (this.b != 0) {
                    return;
                }
                this.b = System.currentTimeMillis();
            } catch (Exception unused6) {
            } catch (Throwable th3) {
                dataInputStream = null;
                th = th3;
            }
        }
    }

    public synchronized void a(String str, boolean z, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992f5fac", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Long(j2)});
        } else if (j == 0 && j2 == 0) {
        } else {
            if (StringUtils.isEmpty(str)) {
                str = "other";
            }
            a(false);
            long[] jArr = this.c;
            int i = dir.f26790a * 2;
            jArr[i] = jArr[i] + j;
            long[] jArr2 = this.c;
            int i2 = (dir.f26790a * 2) + 1;
            jArr2[i2] = jArr2[i2] + j2;
            long j3 = j + j2;
            if (z) {
                this.e += j3;
            } else {
                this.d += j3;
            }
            Long l = this.f.get(str);
            if (l == null) {
                this.f.put(str, Long.valueOf(j3));
            } else {
                this.f.put(str, Long.valueOf(l.longValue() + j3));
            }
            HttpUrl parse = HttpUrl.parse(str2);
            String host = parse != null ? parse.host() : "other";
            Long l2 = this.g.get(host);
            if (l2 == null) {
                this.g.put(host, Long.valueOf(j3));
            } else {
                this.g.put(host, Long.valueOf(l2.longValue() + j3));
            }
        }
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (FlowCenter.isMainProcess) {
            if (this.b / 3600000 < currentTimeMillis / 3600000) {
                DayFlowStatistic dayFlowStatistic = new DayFlowStatistic(this.c, this.d, this.e, this.f, this.g);
                Date date = new Date(this.b);
                dayFlowStatistic.date = f8540a.format(date);
                dayFlowStatistic.hour = date.getHours();
                AppMonitor.getInstance().commitStat(dayFlowStatistic);
                c();
                this.b = currentTimeMillis;
                b(true);
                boolean z2 = dir.c;
            } else if (this.b < currentTimeMillis - 300000 || z) {
                this.b = currentTimeMillis;
                b(false);
                if (dir.c) {
                }
            }
        } else if (this.b < currentTimeMillis - 300000) {
            Intent intent = new Intent("netAnalysis.day.flow.collect");
            intent.putExtra("nettype_flow_array", this.c);
            intent.putExtra("fgFlow", this.d);
            intent.putExtra("bgFlow", this.e);
            intent.putExtra("refer_flow_map", this.f);
            intent.putExtra("domain_flow_map", this.g);
            dir.b.sendBroadcast(intent);
            boolean z3 = dir.c;
            c();
            this.b = currentTimeMillis;
        }
    }

    private void b(boolean z) {
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            File file = new File(dir.b.getFilesDir(), "NetDayFlows");
            if (!file.exists()) {
                file.createNewFile();
            }
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeBoolean(z);
                if (!z) {
                    dataOutputStream.writeLong(this.b);
                    for (int i = 0; i < this.c.length; i++) {
                        dataOutputStream.writeLong(this.c[i]);
                    }
                    dataOutputStream.writeLong(this.d);
                    dataOutputStream.writeLong(this.e);
                    a(dataOutputStream, this.f);
                    a(dataOutputStream, this.g);
                }
                dataOutputStream.flush();
                try {
                    dataOutputStream.close();
                } catch (IOException unused) {
                }
            } catch (Exception unused2) {
                dataOutputStream2 = dataOutputStream;
                if (dataOutputStream2 == null) {
                    return;
                }
                try {
                    dataOutputStream2.close();
                } catch (IOException unused3) {
                }
            } catch (Throwable th) {
                th = th;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (true) {
            long[] jArr = this.c;
            if (i < jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                this.d = 0L;
                this.e = 0L;
                this.f.clear();
                this.g.clear();
                return;
            }
        }
    }

    private void a(DataOutputStream dataOutputStream, Map<String, Long> map) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d9d7b5", new Object[]{this, dataOutputStream, map});
            return;
        }
        int size = map.size();
        dataOutputStream.writeInt(size);
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext() && size > 0) {
            Map.Entry<String, Long> next = it.next();
            dataOutputStream.writeUTF(next.getKey());
            dataOutputStream.writeLong(next.getValue().longValue());
            size--;
        }
    }
}
