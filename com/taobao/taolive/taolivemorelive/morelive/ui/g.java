package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import java.util.HashMap;
import tb.pql;
import tb.pqq;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int d;
    public TabMenuResponseData.TopTab k;
    public com.taobao.alilive.aliliveframework.frame.a l;
    public Context q;

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this});
        }
        return null;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        }
    }

    public g(Context context, TabMenuResponseData.TopTab topTab, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.q = context;
        this.k = topTab;
        this.l = aVar;
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        this.d = i;
        com.taobao.alilive.aliliveframework.frame.a aVar = this.l;
        if (aVar == null || !z) {
            return;
        }
        pqq.d(aVar, "morelive_tabpageshow", l());
    }

    public HashMap<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ee9ded96", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("typePosition", String.valueOf(this.d));
        String l = pql.a().l();
        if (!l.e(l)) {
            hashMap.put("trackInfoTrans", l);
        }
        TabMenuResponseData.TopTab topTab = this.k;
        if (topTab != null) {
            hashMap.put("typeName-type", topTab.channelType);
            hashMap.put("typeName-id", this.k.channelId);
        }
        return hashMap;
    }
}
