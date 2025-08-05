package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TemplateListRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appVersion;
    private String API_NAME = "mtop.mediaplatform.live.videolist.template.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        kge.a(1029102460);
        kge.a(-540945145);
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this}) : this.VERSION;
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
