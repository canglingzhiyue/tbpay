package com.taobao.android.msoa;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.a;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class MSOAServiceImpl implements i, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void obtainServiceAsync(d dVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b43762", new Object[]{this, dVar, aVar});
        }
    }

    @Override // com.taobao.android.msoa.i
    public void requestService(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4faee31", new Object[]{this, gVar});
        } else {
            f.a().a(gVar);
        }
    }

    public <T> T obtainServiceSync(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9bf9e683", new Object[]{this, dVar}) : (T) f.a().a(dVar);
    }

    @Override // com.taobao.android.msoa.i
    public void cancelTimeoutTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c5d93d", new Object[]{this, str});
        } else {
            f.a().a(str);
        }
    }

    @Override // com.taobao.android.msoa.i
    public void tryUnbindService(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c45613", new Object[]{this, gVar});
        } else {
            f.a();
        }
    }
}
