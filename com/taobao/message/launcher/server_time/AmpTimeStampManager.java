package com.taobao.message.launcher.server_time;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Date;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class AmpTimeStampManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AmpTimeStampManager manager;
    public String TAG = "AmpTimeStampManager";
    private long baseTimeElapsed = SystemClock.elapsedRealtime();
    private long baseServerTimeStamp = new Date().getTime();
    private volatile boolean init = false;
    private boolean isLoading = false;

    public static /* synthetic */ boolean access$002(AmpTimeStampManager ampTimeStampManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ba63c91", new Object[]{ampTimeStampManager, new Boolean(z)})).booleanValue();
        }
        ampTimeStampManager.isLoading = z;
        return z;
    }

    public static /* synthetic */ void access$100(AmpTimeStampManager ampTimeStampManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8574987c", new Object[]{ampTimeStampManager, new Long(j)});
        } else {
            ampTimeStampManager.updateTimeStamp(j);
        }
    }

    public static /* synthetic */ boolean access$202(AmpTimeStampManager ampTimeStampManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e495b93", new Object[]{ampTimeStampManager, new Boolean(z)})).booleanValue();
        }
        ampTimeStampManager.init = z;
        return z;
    }

    static {
        kge.a(-1042843231);
        manager = null;
    }

    private AmpTimeStampManager() {
        pullTimeStamap();
    }

    public static AmpTimeStampManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmpTimeStampManager) ipChange.ipc$dispatch("b8c60a4c", new Object[0]);
        }
        if (manager == null) {
            manager = new AmpTimeStampManager();
        }
        return manager;
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue() : this.init;
    }

    private void pullTimeStamap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e2aa15", new Object[]{this});
        } else if (this.isLoading) {
            TLog.loge(this.TAG, " pullTimeStamap return ");
        } else {
            this.isLoading = true;
            TLog.loge(this.TAG, " pullTimeStamap start ");
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) new GetTimeStampRequest(), (String) null);
            build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.message.launcher.server_time.AmpTimeStampManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    AmpTimeStampManager.access$002(AmpTimeStampManager.this, false);
                    AmpTimeStampManager.access$100(AmpTimeStampManager.this, Long.parseLong(((GetTimeStampData) baseOutDo.mo2429getData()).getT()));
                    AmpTimeStampManager.access$202(AmpTimeStampManager.this, true);
                    TLog.loge(AmpTimeStampManager.this.TAG, " onSuccess ");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    AmpTimeStampManager.access$002(AmpTimeStampManager.this, false);
                    TLog.loge(AmpTimeStampManager.this.TAG, "pull baseServerTimeStamp fail: ", mtopResponse == null ? null : mtopResponse.getRetMsg());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    AmpTimeStampManager.access$002(AmpTimeStampManager.this, false);
                    TLog.loge(AmpTimeStampManager.this.TAG, "pull baseServerTimeStamp system fail: ", mtopResponse == null ? null : mtopResponse.getRetMsg());
                }
            });
            build.startRequest(GetTimeStampResponse.class);
        }
    }

    private void pullTimeStampIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8cd8a", new Object[]{this});
        } else if (SystemClock.elapsedRealtime() - this.baseTimeElapsed <= 3600000 && this.init) {
        } else {
            pullTimeStamap();
        }
    }

    private void updateTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbe510", new Object[]{this, new Long(j)});
            return;
        }
        this.baseTimeElapsed = SystemClock.elapsedRealtime();
        this.baseServerTimeStamp = j;
    }

    public long getCurrentTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c918edee", new Object[]{this})).longValue();
        }
        long elapsedRealtime = (this.baseServerTimeStamp + SystemClock.elapsedRealtime()) - this.baseTimeElapsed;
        pullTimeStampIfNeeded();
        return elapsedRealtime;
    }
}
