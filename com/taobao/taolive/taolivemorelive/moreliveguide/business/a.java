package com.taobao.taolive.taolivemorelive.moreliveguide.business;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.poy;
import tb.pqo;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(d dVar) {
        super(dVar);
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, boolean z, String str) {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a3fac8", new Object[]{this, aVar, tBLiveDataModel, new Boolean(z), str});
            return;
        }
        MoreGuideSlideTipsRequest moreGuideSlideTipsRequest = new MoreGuideSlideTipsRequest();
        if (tBLiveDataModel != null && (a2 = k.a(tBLiveDataModel)) != null && a2.broadCaster != null) {
            moreGuideSlideTipsRequest.setAnchorId(a2.broadCaster.accountId);
            moreGuideSlideTipsRequest.setLiveId(a2.liveId);
            moreGuideSlideTipsRequest.setEntryLiveId(poy.a(aVar));
            moreGuideSlideTipsRequest.setLiveSource(poy.ad(aVar));
            moreGuideSlideTipsRequest.setEntryLiveSource(poy.R(aVar));
            moreGuideSlideTipsRequest.setEntrySpm(poy.T(aVar));
            moreGuideSlideTipsRequest.setNeedRec(z);
            moreGuideSlideTipsRequest.setTppParam(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("useWelfareCenterEntry", (Object) "true");
            String a3 = pqo.a("hasShowEndResources");
            if (!l.e(a3)) {
                JSONObject parseObject = JSONObject.parseObject(a3);
                Long l = parseObject.getLong("saveTime");
                String string = parseObject.getString("operatorId");
                if (l.longValue() < b().longValue()) {
                    pqo.a("hasShowEndResources", null);
                } else {
                    jSONObject.put("expoResourseIds", (Object) string);
                }
            }
            moreGuideSlideTipsRequest.setExtendParams(jSONObject.toJSONString());
        }
        a(1, moreGuideSlideTipsRequest, MoreGuideSlideTipsResponse.class);
    }

    public Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("b158060c", new Object[]{this});
        }
        try {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(Long.valueOf(date.getTime()));
            PrintStream printStream = System.out;
            printStream.println("当天日期" + format);
            return Long.valueOf(simpleDateFormat.parse(format).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
