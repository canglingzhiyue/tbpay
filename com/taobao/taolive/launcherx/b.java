package com.taobao.taolive.launcherx;

import android.app.Application;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqj;

/* loaded from: classes8.dex */
public class b extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f21431a;
    private String b;
    private String c;

    static {
        kge.a(-303732114);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(Application application) {
        super("TLGoodsPreload");
        this.f21431a = application;
        this.b = "taolivegoodspage";
        this.c = "taolivegoodspage2";
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        pnj m = pmd.a().m();
        if (m != null) {
            try {
                m.a("TLGoodsIdle", "新用户预拉取直播间宝贝口袋DX模板");
            } catch (Throwable th) {
                if (m == null) {
                    return;
                }
                m.a("TLGoodsIdle", th.toString());
                return;
            }
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(this.f21431a);
        RequestImpl requestImpl = new RequestImpl("https://hudong.alicdn.com/api/data/v2/15b808d1dfa24b65a8bad0d2df922638.js");
        requestImpl.setRetryTime(3);
        requestImpl.setMethod("GET");
        byte[] bytedata = degradableNetwork.syncSend(requestImpl, null).getBytedata();
        if (bytedata == null || bytedata.length <= 0) {
            return;
        }
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        ultronInstanceConfig.a("live");
        d a2 = d.a(ultronInstanceConfig, this.f21431a);
        HashMap hashMap = (HashMap) pqj.a(bytedata, HashMap.class, new Feature[0]);
        if (hashMap.containsKey(this.b)) {
            a2.r().a(pqj.b((String) hashMap.get(this.b)));
            a2.a((d.c) null);
            a2.q().g();
            a(bytedata, this.b);
        }
        if (!hashMap.containsKey(this.c)) {
            return;
        }
        a2.r().a(pqj.b((String) hashMap.get(this.c)));
        a2.a((d.c) null);
        a2.q().g();
        a(bytedata, this.c);
    }

    private void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, bArr, str});
            return;
        }
        String path = this.f21431a.getCacheDir().getPath();
        File file = new File(path, str + "_MT.json");
        if (!file.mkdirs()) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
        }
    }
}
