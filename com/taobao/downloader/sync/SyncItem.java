package com.taobao.downloader.sync;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.kmx;

/* loaded from: classes7.dex */
public class SyncItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String biz;
    public Integer callbackCondition;
    public boolean finish;
    public String md5;
    public String name;
    public Integer network = 4;
    public String path;
    public long size;
    public String url;
    public String version;
    public int when;

    public kmm convert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("49f1aaa1", new Object[]{this});
        }
        kmo kmoVar = new kmo(this.url);
        kmoVar.c = this.md5;
        kmoVar.b = this.size;
        kmoVar.d = this.name;
        kmm kmmVar = new kmm();
        kmmVar.f30166a = new ArrayList();
        kmmVar.f30166a.add(kmoVar);
        kmq kmqVar = new kmq();
        kmqVar.d = this.network.intValue();
        kmqVar.f30169a = this.biz;
        kmqVar.t = "sync:";
        Integer num = this.callbackCondition;
        kmqVar.e = num != null ? num.intValue() : 2;
        kmqVar.h = !StringUtils.isEmpty(this.path) ? this.path : kmx.a(com.taobao.downloader.a.c, "sync");
        kmmVar.b = kmqVar;
        return kmmVar;
    }
}
