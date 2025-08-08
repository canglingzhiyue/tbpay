package com.taobao.taolive.room.service;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import java.util.HashMap;
import java.util.Map;
import tb.ado;
import tb.kge;
import tb.plk;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZSCENE_LIVECUT_GOODSITEM = "livecut_goodsItem";
    public static final String BIZSCENE_LIVECUT_GOODSMESSAGE = "livecut_goodsMessage";
    public static final String BIZSCENE_LIVE_GOODSLIST = "live_goodsList";
    public static final String BIZSCENE_LIVE_GOODSMESSAGE = "live_goodsMessage";
    public static final String BIZSCENE_REPLAY_GOODSLIST = "replay_goodsList";
    public static final String BIZSCENE_REPLAY_GOODSMESSAGE = "replay_goodsMessage";

    static {
        kge.a(300659284);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + str;
            }
            Uri parse = Uri.parse(str);
            if ("taoke.mdaren.taobao.com".equals(parse.getHost())) {
                String queryParameter = parse.getQueryParameter("itemId");
                String queryParameter2 = parse.getQueryParameter("accountId");
                String queryParameter3 = parse.getQueryParameter("bizType");
                String queryParameter4 = parse.getQueryParameter(ag.KEY_TAOKE_BIZSCENE);
                if (StringUtils.isEmpty(queryParameter) || StringUtils.isEmpty(queryParameter2) || StringUtils.isEmpty(queryParameter3)) {
                    if (com.taobao.taolive.room.utils.d.a()) {
                        b("param itemId = " + queryParameter + " or accountId = " + queryParameter2 + " bizType = " + queryParameter3 + " is null !!!");
                    }
                    i = 1;
                }
                if (poy.u(n.a()) != null && poy.u(n.a()).broadCaster != null && poy.u(n.a()).broadCaster.accountId != null && !StringUtils.isEmpty(queryParameter2) && !queryParameter2.equals(poy.u(n.a()).broadCaster.accountId)) {
                    if (com.taobao.taolive.room.utils.d.a()) {
                        b("accountId miss match !!!");
                    }
                    i = 2;
                }
                if (!"taolive".equals(queryParameter3)) {
                    if (com.taobao.taolive.room.utils.d.a()) {
                        b("bizType miss match taolive !!!");
                    }
                    i = 3;
                }
                String str2 = poy.u(n.a()) != null ? poy.u(n.a()).liveId : null;
                HashMap hashMap = new HashMap();
                hashMap.put("feedId", str2);
                hashMap.put("feed_id", str2);
                hashMap.put("account_id", queryParameter2);
                hashMap.put("itemId", queryParameter);
                hashMap.put("bizType", queryParameter3);
                hashMap.put(ag.KEY_TAOKE_BIZSCENE, queryParameter4);
                hashMap.put("error", i + "");
                ai.a(n.a(), ag.CLICK_TRACK_TAOKE, (Map<String, String>) hashMap);
            } else if (!com.taobao.taolive.room.utils.d.a()) {
            } else {
                b("非淘客url , 注意淘客结算！！！");
            }
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            plk.a(pmd.a().u().c(), str);
        }
    }
}
