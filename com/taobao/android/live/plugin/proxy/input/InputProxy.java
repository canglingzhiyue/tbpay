package com.taobao.android.live.plugin.proxy.input;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.List;
import tb.ffg;
import tb.gwy;
import tb.kge;
import tb.plh;

/* loaded from: classes6.dex */
public class InputProxy extends g<IInputProxy> implements IInputProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InputProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final InputProxy f14111a;

        static {
            kge.a(58282458);
            f14111a = new InputProxy();
        }

        public static /* synthetic */ InputProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InputProxy) ipChange.ipc$dispatch("4f86f483", new Object[0]) : f14111a;
        }
    }

    static {
        kge.a(-1618096042);
        kge.a(1142354107);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IInputProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.InputProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveInputPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "输入与表情";
    }

    public static InputProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputProxy) ipChange.ipc$dispatch("655a7dad", new Object[0]) : a.a();
    }

    private InputProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[InputProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("eca6e02", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar});
        }
        IInputProxy real = getReal();
        BaseFrame memberGuideFrame2 = real != null ? real.getMemberGuideFrame2(context, z, tBLiveDataModel, aVar) : null;
        e.c("[InputProxy#getMemberGuideFrame2]  value: " + memberGuideFrame2);
        return memberGuideFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("275c8e20", new Object[]{this, str, str2, str3});
        }
        IInputProxy real = getReal();
        JSONObject atmosphereResItem = real != null ? real.getAtmosphereResItem(str, str2, str3) : null;
        e.c("[InputProxy#getAtmosphereResItem]  value: " + atmosphereResItem);
        return atmosphereResItem;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPosition(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f20181a6", new Object[]{this, context, jSONObject});
        }
        IInputProxy real = getReal();
        JSONObject convertToPosition = real != null ? real.convertToPosition(context, jSONObject) : null;
        e.c("[InputProxy#convertToPosition]  value: " + convertToPosition);
        return convertToPosition;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c90d122", new Object[]{this, context, jSONObject});
        }
        IInputProxy real = getReal();
        JSONObject convertToPositionStaticResource = real != null ? real.convertToPositionStaticResource(context, jSONObject) : null;
        e.c("[InputProxy#convertToPositionStaticResource]  value: " + convertToPositionStaticResource);
        return convertToPositionStaticResource;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getInputFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("60141632", new Object[]{this});
        }
        IInputProxy real = getReal();
        Class<? extends BaseFrame> inputFrame3Class = real != null ? real.getInputFrame3Class() : null;
        e.c("[InputProxy#getInputFrame3Class]  value: " + inputFrame3Class);
        return inputFrame3Class;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Object getInputFrame3AndSetSendMessageListener(Object obj, plh plhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c381affd", new Object[]{this, obj, plhVar});
        }
        IInputProxy real = getReal();
        Object inputFrame3AndSetSendMessageListener = real != null ? real.getInputFrame3AndSetSendMessageListener(obj, plhVar) : null;
        e.c("[InputProxy#getInputFrame3AndSetSendMessageListener]  value: " + inputFrame3AndSetSendMessageListener);
        return inputFrame3AndSetSendMessageListener;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameShowContentView(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd4a4b", new Object[]{this, obj, new Integer(i)});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameShowContentView(obj, i);
        }
        e.c("[InputProxy#iInputFrameShowContentView");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideContentView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4943a13", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameHideContentView(obj);
        }
        e.c("[InputProxy#iInputFrameHideContentView");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void iInputFrameHideKeyBoard(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b73c538", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.iInputFrameHideKeyBoard(obj);
        }
        e.c("[InputProxy#iInputFrameHideKeyBoard");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnCreateView(Object obj, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be532ec", new Object[]{this, obj, viewStub});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.absInputFrameOnCreateView(obj, viewStub);
        }
        e.c("[InputProxy#absInputFrameOnCreateView");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void absInputFrameOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82deae9", new Object[]{this, obj});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.absInputFrameOnDestroy(obj);
        }
        e.c("[InputProxy#absInputFrameOnDestroy");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public Class<? extends BaseFrame> getUserRecExpFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("44e0fa6d", new Object[]{this});
        }
        IInputProxy real = getReal();
        Class<? extends BaseFrame> userRecExpFrameClass = real != null ? real.getUserRecExpFrameClass() : null;
        e.c("[InputProxy#getUserRecExpFrameClass]  value: " + userRecExpFrameClass);
        return userRecExpFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceDestroy(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e945db", new Object[]{this, aVar});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceDestroy(aVar);
        }
        e.c("[InputProxy#atmosphereInstanceDestroy frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceGetAtmosphereRes(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4ffbd", new Object[]{this, aVar, str, str2, str3});
            return;
        }
        ffg createAtmosphereManager = createAtmosphereManager();
        if (createAtmosphereManager != null && aVar != null) {
            aVar.b(createAtmosphereManager);
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceGetAtmosphereRes(aVar, str, str2, str3);
        }
        e.c("[InputProxy#atmosphereInstanceGetAtmosphereRes frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public void atmosphereInstanceProcessEffectRes(com.taobao.alilive.aliliveframework.frame.a aVar, JSONObject jSONObject, gwy gwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e674430", new Object[]{this, aVar, jSONObject, gwyVar});
            return;
        }
        IInputProxy real = getReal();
        if (real != null) {
            real.atmosphereInstanceProcessEffectRes(aVar, jSONObject, gwyVar);
        }
        e.c("[InputProxy#atmosphereInstanceProcessEffectRes frameContext");
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30e27cc9", new Object[]{this, aVar});
        }
        IInputProxy real = getReal();
        HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap = real != null ? real.atmosphereInstanceGetStickerKeyMatchMap(aVar) : null;
        e.c("[InputProxy#atmosphereInstanceGetStickerKeyMatchMap frameContext ]  value: " + atmosphereInstanceGetStickerKeyMatchMap);
        return atmosphereInstanceGetStickerKeyMatchMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fe625511", new Object[]{this, aVar});
        }
        IInputProxy real = getReal();
        HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap = real != null ? real.atmosphereInstanceGetStickerIdMatchMap(aVar) : null;
        e.c("[InputProxy#atmosphereInstanceGetStickerIdMatchMap]  frameContext value: " + atmosphereInstanceGetStickerIdMatchMap);
        return atmosphereInstanceGetStickerIdMatchMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public HashMap<Integer, String> atmosphereInstanceGetFansLightMap(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3f71ed7c", new Object[]{this, aVar});
        }
        IInputProxy real = getReal();
        HashMap<Integer, String> atmosphereInstanceGetFansLightMap = real != null ? real.atmosphereInstanceGetFansLightMap(aVar) : null;
        e.c("[InputProxy#atmosphereInstanceGetFansLightMap] frameContext  value: " + atmosphereInstanceGetFansLightMap);
        return atmosphereInstanceGetFansLightMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> atmosphereInstanceGetEffectResConfig(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc4e7e51", new Object[]{this, aVar, str});
        }
        IInputProxy real = getReal();
        List<JSONObject> atmosphereInstanceGetEffectResConfig = real != null ? real.atmosphereInstanceGetEffectResConfig(aVar, str) : null;
        e.c("[InputProxy#atmosphereInstanceGetEffectResConfig]  frameContext value: " + atmosphereInstanceGetEffectResConfig);
        return atmosphereInstanceGetEffectResConfig;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public List<JSONObject> getStickerConfig(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f441aa12", new Object[]{this, aVar});
        }
        IInputProxy real = getReal();
        List<JSONObject> stickerConfig = real != null ? real.getStickerConfig(aVar) : null;
        e.c("[InputProxy#getStickerConfig] frameContext  value: " + stickerConfig);
        return stickerConfig;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public JSONObject getAtmosphereResItem(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d94ea21", new Object[]{this, aVar, str, str2, str3});
        }
        IInputProxy real = getReal();
        JSONObject atmosphereResItem = real != null ? real.getAtmosphereResItem(aVar, str, str2, str3) : null;
        e.c("[InputProxy#getAtmosphereResItem]  value: " + atmosphereResItem);
        return atmosphereResItem;
    }

    @Override // com.taobao.android.live.plugin.proxy.input.IInputProxy
    public ffg createAtmosphereManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ffg) ipChange.ipc$dispatch("efccaf69", new Object[]{this});
        }
        IInputProxy real = getReal();
        ffg createAtmosphereManager = real != null ? real.createAtmosphereManager() : null;
        e.c("[InputProxy#createAtmosphereManager]  value: " + createAtmosphereManager);
        return createAtmosphereManager;
    }
}
