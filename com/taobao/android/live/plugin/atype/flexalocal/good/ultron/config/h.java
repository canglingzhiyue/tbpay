package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.sdk.utils.v;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import tb.his;
import tb.kge;
import tb.pmd;
import tb.pqj;

/* loaded from: classes3.dex */
public class h extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final e b;
    private String c;

    static {
        kge.a(-444206236);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92bc8399", new Object[]{hVar}) : hVar.c;
    }

    public h(CountDownLatch countDownLatch, Context context, boolean z) {
        super(countDownLatch, z);
        this.b = new e();
        this.c = "https://hudong.alicdn.com/api/data/v2/15b808d1dfa24b65a8bad0d2df922638.js";
        a(context);
    }

    public void a(final i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab25046", new Object[]{this, iVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONObject b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DegradableNetwork degradableNetwork = new DegradableNetwork(pmd.a().u().c());
                    RequestImpl requestImpl = new RequestImpl(h.a(h.this));
                    requestImpl.setRetryTime(3);
                    requestImpl.setMethod("GET");
                    byte[] bytedata = degradableNetwork.syncSend(requestImpl, null).getBytedata();
                    if (bytedata != null && bytedata.length > 0 && (b = pqj.b(new String(bytedata))) != null && b.getString(h.this.e) != null) {
                        iVar.a(b.getString(h.this.e), ConfigSource.MT2);
                    }
                    h.this.f13826a.countDown();
                }
            }, 30);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        String a2 = v.b.a("goodlist", "mtConfigUrl", this.c);
        if (!TextUtils.isEmpty(a2)) {
            this.c = a2;
            his.b("MTCacheConfigModel", "initUrl | orange=" + this.c);
        }
        if (context == null || !com.taobao.taolive.sdk.utils.b.d(context)) {
            return;
        }
        String a3 = a();
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        this.c = a3;
        his.b("MTCacheConfigModel", "initUrl | debugMtUrl=" + this.c);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return com.taobao.taolive.sdk.goodlist.b.a("/data/local/tmp/", "gl_mt_config_url");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
