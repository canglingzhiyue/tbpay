package com.taobao.taobao.scancode.history.object;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ScanList implements Serializable, IMTOPDataObject {
    private List<ScanDo> list;
    private boolean networkAvailable = true;
    private boolean OldLogic = true;

    static {
        kge.a(-1020523463);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public boolean isOldLogic() {
        return this.OldLogic;
    }

    public void setOldLogic(boolean z) {
        this.OldLogic = z;
    }

    public boolean isNetworkAvailable() {
        return this.networkAvailable;
    }

    public void setNetworkAvailable(boolean z) {
        this.networkAvailable = z;
    }

    public List<ScanDo> getList() {
        return this.list;
    }

    public void setList(List<ScanDo> list) {
        this.list = list;
    }
}
