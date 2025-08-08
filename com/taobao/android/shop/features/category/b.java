package com.taobao.android.shop.features.category;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.weex.WXEnvironment;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REQ_SELLER_ID = "sellerId";
    public static final String REQ_SHOP_ID = "shopId";
    public static final String REQ_SUPPORTWEEX = "supportWeex";

    /* renamed from: a  reason: collision with root package name */
    private RemoteBusiness f15113a;
    private IRemoteBaseListener b;
    private String c;
    private String d;

    static {
        kge.a(-1709255645);
    }

    public b(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
        } else {
            this.b = iRemoteBaseListener;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f15113a = null;
        this.b = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.shop.cat.neo.get");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        JSONObject parseObject = JSONObject.parseObject(mtopRequest.getData());
        if (!StringUtils.isEmpty(this.c)) {
            parseObject.put("sellerId", (Object) this.c);
        } else if (!StringUtils.isEmpty(this.d)) {
            parseObject.put("shopId", (Object) this.d);
        }
        parseObject.put(REQ_SUPPORTWEEX, (Object) Boolean.valueOf(WXEnvironment.isCPUSupport()));
        mtopRequest.setData(parseObject.toString());
        this.f15113a = RemoteBusiness.build((Context) Globals.getApplication(), mtopRequest, TaoHelper.getTTID()).mo1338reqContext((Object) null).mo1340setBizId(90);
        this.f15113a.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        this.f15113a.registeListener((IRemoteListener) this.b).startRequest(0, CategoryResponse.class);
    }
}
