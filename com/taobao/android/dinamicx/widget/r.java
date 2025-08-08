package com.taobao.android.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class r extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXOCRIMAGEVIEW_OCRIMAGEVIEW = -2187661613928500626L;

    /* renamed from: a */
    private String f12117a;

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new r();
        }
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85961ce3", new Object[]{rVar}) : rVar.f12117a;
    }

    public static /* synthetic */ String a(r rVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51a21599", new Object[]{rVar, str});
        }
        rVar.f12117a = str;
        return str;
    }

    public static /* synthetic */ String a(r rVar, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c93cfaf4", new Object[]{rVar, mtopResponse, str}) : rVar.a(mtopResponse, str);
    }

    public r() {
        setAccessibility(1);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new r();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !a(context)) {
            return;
        }
        a(view);
    }

    private void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!StringUtils.isEmpty(this.f12117a)) {
            view.setContentDescription(this.f12117a);
        } else {
            JSONObject jSONObject = new JSONObject();
            final String imageUrl = getImageUrl();
            if (StringUtils.isEmpty(imageUrl)) {
                view.setContentDescription("图片识别失败");
                return;
            }
            jSONObject.put("imgList", (Object) ("[\"" + imageUrl + "\"]"));
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.ocr.image.check");
            mtopRequest.setVersion("1.2");
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.mo1335useWua().mo1305reqMethod(MethodEnum.POST).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    view.setContentDescription("图片识别失败");
                    r.a(r.this, "图片识别失败");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                        view.setContentDescription("图片识别失败");
                        r.a(r.this, "图片识别失败");
                    } else {
                        r rVar = r.this;
                        r.a(rVar, r.a(rVar, mtopResponse, imageUrl));
                        view.setContentDescription(r.a(r.this));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    view.setContentDescription("图片识别失败");
                    r.a(r.this, "图片识别失败");
                }
            });
            build.startRequest();
        }
    }

    private String a(MtopResponse mtopResponse, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c6b2c9", new Object[]{this, mtopResponse, str});
        }
        JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null) {
            return "图片识别失败";
        }
        String string = jSONObject3.getString("content");
        return StringUtils.isEmpty(string) ? "图片识别失败" : string;
    }

    private boolean a(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
