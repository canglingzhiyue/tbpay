package com.taobao.message.lab.comfrm.inner2.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class SnapshotCenter implements ISnapshotCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Snapshot> mSnapshotMap = new ConcurrentHashMap();

    static {
        kge.a(572649492);
        kge.a(119825031);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public void putSnapshot(String str, Snapshot snapshot) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33027f8", new Object[]{this, str, snapshot});
        } else {
            this.mSnapshotMap.put(str, snapshot);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter
    public Snapshot getSnapshot(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Snapshot) ipChange.ipc$dispatch("4ec3e837", new Object[]{this, str}) : this.mSnapshotMap.get(str);
    }
}
