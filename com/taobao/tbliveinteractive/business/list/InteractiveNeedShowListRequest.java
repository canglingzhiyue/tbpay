package com.taobao.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveNeedShowListRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public List<String> componentNames;
    public String extendParams;
    public String liveId;
    public String liveUrl;
    public String source;
    private String API_NAME = "";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(-1242311848);
        kge.a(-540945145);
    }

    public void setAPI_NAME(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191523", new Object[]{this, str});
        } else {
            this.API_NAME = str;
        }
    }

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }
}
