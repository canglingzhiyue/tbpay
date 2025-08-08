package com.taobao.tao.content.business;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.android.nav.Nav;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.NavUrls;
import com.taobao.weex.bridge.JSCallback;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCOUNT_ID = "adUserId";
    public static final String ADD_CART_WITHOUT_SKU = "2";
    public static final String ADD_CART_WITH_SKU = "3";
    public static final String BIZ_TYPE = "businessScenceId";
    public static final String CONTENT_ID = "contentId";
    public static final String CONTEXT = "context";
    public static final String CT = "ct";
    public static final String ITEM_ID = "itemId";
    public static final String PAGE_NAME = "pageName";
    public static final String SID = "sId";
    public static final String TCP_BID = "tcpBid";
    public static final String URL_INTERRUPT = "1";
    public static final String sourceType = "sourceType";

    /* renamed from: a  reason: collision with root package name */
    private Uri f19902a;
    private ContentBusinessModel b;

    static {
        kge.a(-868317838);
    }

    public void a(Context context, Intent intent) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        this.f19902a = intent.getData();
        Uri uri = this.f19902a;
        if (uri == null || (a2 = c.a(uri)) == null || a2.size() <= 0) {
            return;
        }
        this.b = new ContentBusinessModel();
        this.b.url = this.f19902a.toString();
        this.b.itemId = a2.get("itemId");
        this.b.adUserId = a2.get(ACCOUNT_ID);
        this.b.scenceId = a2.get(BIZ_TYPE);
        this.b.contentId = a2.get("contentId");
        this.b.pageName = a2.get("pageName");
        ContentBusinessModel contentBusinessModel = this.b;
        contentBusinessModel.source = "1";
        contentBusinessModel.tcpBid = a2.get(TCP_BID);
        if (!StringUtils.isEmpty(this.b.tcpBid)) {
            this.b.ct = a2.get(CT);
            if (this.b.ct.equals("1")) {
                this.b.itemId = a2.get("itemId");
            } else if (this.b.ct.equals("2")) {
                this.b.sId = a2.get(SID);
            }
        }
        String format = String.format(NavUrls.nav_urls_detail[3], this.b.itemId);
        Nav.from(context).toUri(format + "?" + c.a(a2));
        if (!StringUtils.isDigitsOnly(this.b.itemId)) {
            return;
        }
        new a().a(this.b, null);
    }

    @Deprecated
    public void a(Context context, ContentBusinessModel contentBusinessModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a7525d", new Object[]{this, context, contentBusinessModel, new Integer(i)});
        } else if (contentBusinessModel == null) {
        } else {
            this.b = contentBusinessModel;
            Bundle bundle = new Bundle();
            bundle.putString("bizName", "video_weex");
            Nav.from(context).withExtras(bundle).forResult(i).toUri("http://a.m.taobao.com/sku" + contentBusinessModel.itemId + ".htm");
            new a().a(contentBusinessModel, null);
        }
    }

    @Deprecated
    public void a(ContentBusinessModel contentBusinessModel, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2140a5a", new Object[]{this, contentBusinessModel, jSCallback});
        } else if (contentBusinessModel == null) {
        } else {
            this.b = contentBusinessModel;
            HashMap hashMap = new HashMap(16);
            hashMap.put("itemId", contentBusinessModel.itemId);
            hashMap.put("quantity", "1");
            hashMap.put("from", "video_weex");
            com.taobao.android.msoa.c.a().a(new h("video_weex", "msoa.taobao.cart.sdk.add", "2.0", "video_weex", hashMap), new MSOAServiceListener() { // from class: com.taobao.tao.content.business.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null) {
                    } else {
                        HashMap hashMap2 = new HashMap(16);
                        if (map != null) {
                            try {
                                if (map.containsKey(InputFrame3.TYPE_RESPONSE) && (map.get(InputFrame3.TYPE_RESPONSE) instanceof MtopResponse)) {
                                    hashMap2.put("result", JSON.parseObject(new String(((MtopResponse) map.get(InputFrame3.TYPE_RESPONSE)).getBytedata(), "UTF-8")).getJSONObject("data"));
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        hashMap2.put("success", "true");
                        jSCallback.invoke(hashMap2);
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                        return;
                    }
                    HashMap hashMap2 = new HashMap(16);
                    if (map != null) {
                        try {
                            if (map.containsKey(InputFrame3.TYPE_RESPONSE) && (map.get(InputFrame3.TYPE_RESPONSE) instanceof MtopResponse)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("errorCode", (Object) ((MtopResponse) map.get(InputFrame3.TYPE_RESPONSE)).getRetCode());
                                jSONObject.put("msg", (Object) ((MtopResponse) map.get(InputFrame3.TYPE_RESPONSE)).getRetMsg());
                                hashMap2.put("error", jSONObject);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    hashMap2.put("success", "false");
                    jSCallback.invoke(hashMap2);
                }
            });
            new a().a(contentBusinessModel, null);
        }
    }

    public void a(ContentBusinessModel contentBusinessModel, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa690b48", new Object[]{this, contentBusinessModel, iRemoteBaseListener});
        } else {
            new a().a(contentBusinessModel, iRemoteBaseListener);
        }
    }

    public void b(ContentBusinessModel contentBusinessModel, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae420e7", new Object[]{this, contentBusinessModel, iRemoteBaseListener});
        } else {
            new a().b(contentBusinessModel, iRemoteBaseListener);
        }
    }
}
