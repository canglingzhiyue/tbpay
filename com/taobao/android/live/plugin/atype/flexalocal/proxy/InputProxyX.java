package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.input.UserRecExpFrame;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.EffectResPosition;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.SwashLettersMsg;
import com.taobao.android.live.plugin.atype.flexalocal.input.b;
import com.taobao.android.live.plugin.atype.flexalocal.input.g;
import com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.ffg;
import tb.gwy;
import tb.kge;
import tb.plh;
import tb.pqj;

/* loaded from: classes6.dex */
public class InputProxyX implements IInputProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-378857817);
        kge.a(1142354107);
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be532ec", new Object[]{this, obj, viewStub});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82deae9", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("eca6e02", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar}) : new MemberGuideFrame2(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("275c8e20", new Object[]{this, str, str2, str3});
        }
        AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = new AtmosphereResListResponseData.AtmosphereResItem();
        atmosphereResItem.matchKey = str;
        atmosphereResItem.type = str2;
        atmosphereResItem.resUrl = str3;
        return JSONObject.parseObject(JSONObject.toJSONString(atmosphereResItem));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPosition(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f20181a6", new Object[]{this, context, jSONObject}) : JSONObject.parseObject(JSONObject.toJSONString(EffectResPosition.convertToPosition(context, (EffectResConfig) pqj.a(jSONObject.toJSONString(), EffectResConfig.class))));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9c90d122", new Object[]{this, context, jSONObject}) : JSONObject.parseObject(JSONObject.toJSONString(EffectResPosition.convertToPosition(context, (SwashLettersMsg.StaticResource) pqj.a(jSONObject.toJSONString(), SwashLettersMsg.StaticResource.class))));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getInputFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("60141632", new Object[]{this}) : InputFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Object getInputFrame3AndSetSendMessageListener(Object obj, plh plhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c381affd", new Object[]{this, obj, plhVar});
        }
        if (!(obj instanceof InputFrame3)) {
            return null;
        }
        ((InputFrame3) obj).setSendMessageListener(plhVar);
        return obj;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameShowContentView(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd4a4b", new Object[]{this, obj, new Integer(i)});
        } else if (!(obj instanceof b)) {
        } else {
            ((b) obj).showContentView(i);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideContentView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4943a13", new Object[]{this, obj});
        } else if (!(obj instanceof b)) {
        } else {
            ((b) obj).hideContentView();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideKeyBoard(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73c538", new Object[]{this, obj});
        } else if (!(obj instanceof b)) {
        } else {
            ((b) obj).hideKeyBoard();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getUserRecExpFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("44e0fa6d", new Object[]{this}) : UserRecExpFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceDestroy(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e945db", new Object[]{this, aVar});
        } else if (aVar == null || !(aVar.I() instanceof ffg)) {
        } else {
            ((ffg) aVar.I()).a();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceGetAtmosphereRes(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4ffbd", new Object[]{this, aVar, str, str2, str3});
        } else if (aVar == null || !(aVar.I() instanceof ffg)) {
        } else {
            ((ffg) aVar.I()).a(aVar, str, str2, str3);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceProcessEffectRes(a aVar, JSONObject jSONObject, gwy gwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e674430", new Object[]{this, aVar, jSONObject, gwyVar});
        } else if (aVar == null || !(aVar.I() instanceof ffg)) {
        } else {
            ((ffg) aVar.I()).a(aVar, (AtmosphereResListResponseData.AtmosphereResItem) pqj.a(jSONObject.toJSONString(), AtmosphereResListResponseData.AtmosphereResItem.class), gwyVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30e27cc9", new Object[]{this, aVar});
        }
        if (aVar == null || !(aVar.I() instanceof ffg)) {
            return null;
        }
        HashMap<String, StickerConfig> c = ((ffg) aVar.I()).c();
        HashMap<String, JSONObject> hashMap = new HashMap<>();
        if (c != null) {
            for (String str : c.keySet()) {
                hashMap.put(str, JSONObject.parseObject(JSONObject.toJSONString(c.get(str))));
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fe625511", new Object[]{this, aVar});
        }
        if (aVar == null || !(aVar.I() instanceof ffg)) {
            return null;
        }
        HashMap<String, StickerConfig> d = ((ffg) aVar.I()).d();
        HashMap<String, JSONObject> hashMap = new HashMap<>();
        if (d != null) {
            for (String str : d.keySet()) {
                hashMap.put(str, JSONObject.parseObject(JSONObject.toJSONString(d.get(str))));
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<Integer, String> atmosphereInstanceGetFansLightMap(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3f71ed7c", new Object[]{this, aVar});
        }
        if (aVar != null && (aVar.I() instanceof ffg)) {
            return ((ffg) aVar.I()).f();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> atmosphereInstanceGetEffectResConfig(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc4e7e51", new Object[]{this, aVar, str});
        }
        if (aVar == null || !(aVar.I() instanceof ffg)) {
            return null;
        }
        List<EffectResConfig> a2 = ((ffg) aVar.I()).a(str);
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            for (EffectResConfig effectResConfig : a2) {
                arrayList.add(JSONObject.parseObject(JSONObject.toJSONString(effectResConfig)));
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> getStickerConfig(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f441aa12", new Object[]{this, aVar});
        }
        if (aVar == null || !(aVar.I() instanceof ffg)) {
            return null;
        }
        List<StickerGroup> i = ((ffg) aVar.I()).i();
        ArrayList arrayList = new ArrayList();
        if (i != null) {
            for (StickerGroup stickerGroup : i) {
                arrayList.add(JSONObject.parseObject(JSONObject.toJSONString(stickerGroup)));
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d94ea21", new Object[]{this, aVar, str, str2, str3});
        }
        AtmosphereResListResponseData.AtmosphereResItem atmosphereResItem = new AtmosphereResListResponseData.AtmosphereResItem();
        atmosphereResItem.matchKey = str;
        atmosphereResItem.type = str2;
        atmosphereResItem.resUrl = str3;
        return JSONObject.parseObject(JSONObject.toJSONString(atmosphereResItem));
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public ffg createAtmosphereManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ffg) ipChange.ipc$dispatch("efccaf69", new Object[]{this}) : new g();
    }
}
