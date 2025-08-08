package com.taobao.tbpoplayer.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IFaceAdapter;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;
import com.taobao.tbpoplayer.view.PopLayerWebView;
import com.taobao.tbpoplayer.view.PopLayerWeex2View;
import com.taobao.tbpoplayer.view.PopLayerWeexView;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import com.taobao.tbpoplayer.watermask.PopWaterMaskView;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import tb.bzs;
import tb.kge;

/* loaded from: classes.dex */
public final class g implements IFaceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1123133718);
        kge.a(-2131077938);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ce24f0", new Object[]{mtopFinishEvent, obj});
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void preparePopCheckRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27c8f64", new Object[]{this, popRequest});
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void registerNavPreprocessor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19274692", new Object[]{this, context});
        } else {
            Nav.registerHooker(new a());
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void registerTrackViewTypes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86314f55", new Object[]{this, context});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("webview");
        arrayList.add("weex");
        arrayList.add("native");
        arrayList.add("weex2");
        arrayList.add(PopWaterMaskView.VIEW_TYPE);
        PopLayer.getReference().registerViewType($$Lambda$g$QLTKoyarJ5J6EWmSlwnaAX80Hr8.INSTANCE, arrayList, "webview");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ PopLayerBaseView a(Context context, String str, com.alibaba.poplayer.trigger.d dVar) {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return (PopLayerBaseView) ipChange.ipc$dispatch("b791cbae", new Object[]{context, str, dVar});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            Context mutableContextWrapper = com.taobao.tbpoplayer.info.a.a().A() ? new MutableContextWrapper(context) : context;
            switch (str.hashCode()) {
                case -1052618729:
                    if (str.equals("native")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -214377309:
                    if (str.equals(PopWaterMaskView.VIEW_TYPE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3645441:
                    if (str.equals("weex")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 113008721:
                    if (str.equals("weex2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1224424441:
                    if (str.equals("webview")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                dVar.t().ab = "webview";
                return new PopLayerWebView(mutableContextWrapper);
            } else if (c == 1) {
                dVar.t().ab = "native";
                return new PopLayerNativeView(mutableContextWrapper);
            } else if (c == 2) {
                dVar.t().ab = "weex";
                return new PopLayerWeexView(mutableContextWrapper);
            } else if (c == 3) {
                dVar.t().ab = "weex2";
                return new PopLayerWeex2View(mutableContextWrapper);
            } else if (c == 4) {
                dVar.t().ab = PopWaterMaskView.VIEW_TYPE;
                return new PopWaterMaskView(mutableContextWrapper);
            } else {
                dVar.t().ab = str;
                return com.taobao.tbpoplayer.view.b.a(context, str);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("IPopLayerViewAdapter.generatePopLayerViewByType.error.", th);
            return null;
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    @Deprecated
    public void navToUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1fe2fa", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public long getCurrentTimeStamp(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4c56b02", new Object[]{this, context})).longValue() : TimeStampManager.instance().getCurrentTimeStamp();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getCurAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff6eda00", new Object[]{this, context}) : Globals.getVersionName();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean startPopCheckRequest(PopRequest popRequest, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98940bb2", new Object[]{this, popRequest, iUserCheckRequestListener})).booleanValue();
        }
        if (iUserCheckRequestListener == null) {
            if (popRequest != null) {
                popRequest.t().v = com.taobao.bootimage.d.CLOSE_TYPE_SKIP;
            }
            com.alibaba.poplayer.utils.c.b("pageLifeCycle", com.alibaba.poplayer.trigger.d.a(popRequest), "requestListener=null");
            return false;
        }
        JSONObject a2 = com.taobao.tbpoplayer.filter.b.a().a(popRequest);
        if (a2 == null) {
            return false;
        }
        if (MtopGroupPreCheckManager.a().a(popRequest) && com.taobao.tbpoplayer.info.a.a().i()) {
            return MtopGroupPreCheckManager.a().a(popRequest, a2, iUserCheckRequestListener);
        }
        return com.taobao.tbpoplayer.filter.b.a().a(popRequest, a2, iUserCheckRequestListener);
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean cancelPopCheckRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b36eb455", new Object[]{this, popRequest})).booleanValue() : com.taobao.tbpoplayer.filter.b.a().b(popRequest);
    }

    /* loaded from: classes.dex */
    public static class a implements Nav.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-281144290);
            kge.a(81023795);
        }

        private a() {
        }

        @Override // com.taobao.android.nav.Nav.e
        public boolean a(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
            }
            try {
                String dataString = intent.getDataString();
                if (!StringUtils.isEmpty(dataString) && dataString.startsWith("poplayer")) {
                    com.alibaba.poplayer.utils.c.b("triggerEvent", "", "MatchSchema.BroadcastTrigger.PopLayerHooker.url=" + dataString);
                    Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                    intent2.putExtra("event", dataString);
                    intent2.putExtra("param", dataString);
                    intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "navUrl");
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
                    com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.PopLayerHooker.hook.success");
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                Log.e("TBPoplayer", "PopLayerHooker.hook.error");
                return true;
            }
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean doneConstraintMockRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff2eab1", new Object[]{this})).booleanValue();
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.aplatform.weakGet");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", "poplayer_support.mockFinishSet");
            JSONObject parseObject = JSON.parseObject(bzs.a().g());
            Set<String> o = bzs.a().o();
            HashSet hashSet = new HashSet();
            if (o != null) {
                hashSet.addAll(o);
            }
            parseObject.put("indexIdList", (Object) hashSet);
            hashMap.put("bizParam", parseObject.toJSONString());
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()).build(mtopRequest, TaoPackageInfo.getTTID()).mo1337addListener($$Lambda$g$onAHCXa6_NcY7mwfO95cKl7WTI.INSTANCE).mo1305reqMethod(MethodEnum.POST).asyncRequest();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("startPopCheckRequest.sendUserCheckRequest.error", th);
        }
        return true;
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : Login.getUserId();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : UTDevice.getUtdid(PopLayer.getReference().getApp());
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getUTCurPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8cee17b4", new Object[]{this}) : com.ut.mini.l.getInstance().getCurrentPageName();
    }
}
